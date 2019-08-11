package com.example.projectmodel;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sx.base.BaseActivity;
import com.sx.course.CourseFragment;
import com.sx.forum.ForumFragment;
import com.sx.home.HomeFragment;
import com.sx.main.MyFragment;
import com.sx.shopping.ShoppingFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.button_home)
    RadioButton buttonHome;
    @BindView(R.id.butt_shopping)
    RadioButton buttShopping;
    @BindView(R.id.butt_course)
    RadioButton buttCourse;
    @BindView(R.id.butt_forum)
    RadioButton buttForum;
    @BindView(R.id.butt_my)
    RadioButton buttMy;
    @BindView(R.id.anim_rg)
    RadioGroup animRg;
    @BindView(R.id.fragme)
    FrameLayout fragme;
    private ArrayList<Fragment> mFragments;
    private FragmentManager mManager;

    @Override
    protected int getlayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewAndData() {
        super.initViewAndData();

        // fragment集合
        initFrafment();
        //fragment管理器
        mManager = getSupportFragmentManager();
        //  默认显示首页
        addInitFragment();
        //radioButton切换fragment
        rediogroupListener();
    }

    private void rediogroupListener() {

        animRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.button_home:
                        initSwitchFragment(0);
                        break;
                    case R.id.butt_shopping:
                        initSwitchFragment(1);
                        break;
                    case R.id.butt_course:
                        initSwitchFragment(2);
                        break;
                    case R.id.butt_forum:
                        initSwitchFragment(3);
                        break;
                    case R.id.butt_my:
                        initSwitchFragment(4);
                        break;
                }


            }
        });
    }

    private void addInitFragment() {
        FragmentTransaction fragmentTransaction = mManager.beginTransaction();
        fragmentTransaction.add(R.id.fragme, mFragments.get(0));
        fragmentTransaction.commit();
    }

    int lastType = 0;

    public void initSwitchFragment(int type) {
        FragmentTransaction fragmentTransaction = mManager.beginTransaction();
        Fragment fragment = mFragments.get(type);
        if (!fragment.isAdded()) {
            fragmentTransaction.add(R.id.fragme, fragment);
        }

        fragmentTransaction.hide(mFragments.get(lastType)).show(fragment);
        lastType = type;
        fragmentTransaction.commit();

    }

    private void initFrafment() {
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new ShoppingFragment());
        mFragments.add(new CourseFragment());
        mFragments.add(new ForumFragment());
        mFragments.add(new MyFragment());

    }

}


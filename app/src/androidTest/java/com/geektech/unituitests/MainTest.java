package com.geektech.unituitests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);
//
//    @Test
////    public void tvVisibilityCheck() {
////        onView(withId(R.id.btn_add)).perform(click());
////        onView(withId(R.id.tv_result)).check(matches(isDisplayed()));
////    }

    @Test
    public void checkAddOperations() {
        onView(withId(R.id.firstNum_edt)).perform(typeText("5"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("6"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("11")));
    }


    @Test
    public void checkAddOperationsWithEmptyField() {
        onView(withId(R.id.firstNum_edt)).perform(typeText(""));
        onView(withId(R.id.secondNum_edt)).perform(typeText("6"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("6")));
    }
}

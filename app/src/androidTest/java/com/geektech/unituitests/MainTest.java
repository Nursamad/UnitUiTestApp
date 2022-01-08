package com.geektech.unituitests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
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
    @Test
    public void checkAddWithOneEmptyOperation(){
        onView(withId(R.id.firstNum_edt)).perform(typeText(""));
        onView(withId(R.id.secondNum_edt)).perform(typeText("3"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("3")));
    }
    @Test
    public void checkZeroByZero(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("0"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("0"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }
    @Test
    public void checkAddWithAllEmptyOperation(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("0"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("0"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }



    @Test
    public void checkDivByZero(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("4"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("0"), closeSoftKeyboard());
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }
    @Test
    public void checkMultyByZero(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("6"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("0"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }
    @Test
    public void checkNegativeMultyNeg(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("-2"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("-2"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }

    @Test
    public void checkPositiveMultyNegative(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("3"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("-2"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("-6")));
    }
    @Test
    public void checkSimpleMultyCase(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("3"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("2"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("6")));
    }
    @Test
    public void checkDivSameDigit(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("3"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("3"), closeSoftKeyboard());
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("1")));
    }
    @Test
    public void checkNumMultyByOne(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("3"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("1"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("3")));
    }

    @Test
    public void checkMinusMultyMinus(){
        onView(withId(R.id.firstNum_edt)).perform(typeText("-2"));
        onView(withId(R.id.secondNum_edt)).perform(typeText("-2"), closeSoftKeyboard());
        onView(withId(R.id.btn_mult)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }
}

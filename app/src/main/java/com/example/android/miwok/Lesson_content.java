package com.example.android.miwok;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.Lesson_content.PlaceholderFragment.arraylist;

public class Lesson_content extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_content);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lesson_content, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static int pageNumber;
        private static final String ARG_SECTION_NUMBER = "section_number";
        static ArrayList<Word> arraylist = new ArrayList<Word>();

        public PlaceholderFragment() {
            arraylist.add(new Word("Lesson 1:","पाठ 1:"));

            arraylist.add(new Word("Introduce Yourself","अपने आप का परिचय"));
            arraylist.add(new Word("What is your name?","आपका नाम क्या है?"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("I am your friend","मैं आपका / आपकी मित्र हूँ"));
            arraylist.add(new Word("nice to meet you.","आपसे मिलकर अच्छा लगा"));
            arraylist.add(new Word("Same here","मुझे भी"));

            arraylist.add(new Word("When you meet to someone","जब आप किसी से मिलते हैं"));
            arraylist.add(new Word("What's up?","क्या हो रहा है?"));
            arraylist.add(new Word("How are you doing?","आप कैसे हैं?"));
            arraylist.add(new Word("How do you do?","आप कैसे हैं?"));
            arraylist.add(new Word("I am fine.","ममैं ठीक हूँ।"));
            arraylist.add(new Word("I am good","मैं अच्छा हूँ"));
/*
            arraylist.add(new Word("Simple Present tense:"," to be verb राष्ट्रीयता बताना सीखें"));
            arraylist.add(new Word("Where are you from?","आप कहां के निवासी हैं?"));
            arraylist.add(new Word("I am from India.","मे भारत से हु।"));
            arraylist.add(new Word("You are from America.","आप अमेरिका से हैं"));
            arraylist.add(new Word("I am from a city in Punjab.","मैं पंजाब के एक शहर से हूँ"));
            arraylist.add(new Word("I am Indian.","मैं भारतीय हूँ"));
            arraylist.add(new Word("We are Indian.","हम भारतीय हैं"));
            arraylist.add(new Word("I am from India, I am Indian.","मैं भारत से हूँ, मैं भारतीय हूं"));
            arraylist.add(new Word("They are from America, They are American.","वे अमेरिका से हैं, वे अमेरिकी हैं"));
            arraylist.add(new Word("You're American.","आप अमेरिकी हो"));

            arraylist.add(new Word("Simple Present Negative is, are, am के नकारात्मक वाक्य बनाने सीखिये",""));
            arraylist.add(new Word("टिप \n I am Indian = मैं भारतीय हूँ\n I am not Indian","नकारात्मक वाक्य के लिए /'is, are, am/' के बाद /'not/' लगाए "));
            arraylist.add(new Word("I Am not Indian.","मैं भारतीय नहीं हूं"));
            arraylist.add(new Word("I am not a Student.","मैं एक छात्र नहीं हूं"));
            arraylist.add(new Word("We are not Teachers."," हम अध्यापक नहीं हैं"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
            arraylist.add(new Word("My name is Pallavi.","मेरा नाम पल्लवी है"));
          */
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            pageNumber = sectionNumber;
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_lesson_content, container, false);

            for(Word object:arraylist){
                if(pageNumber==1){
                TextView textView = (TextView) rootView.findViewById(R.id.firstonewc);
                TextView textView1 = (TextView) rootView.findViewById(R.id.secondonewc);
                String estring = object.getEnglishWord();
                textView.setText(estring);
                String hstring = object.getParaDescp();
                textView1.setText(hstring);
                break;
                }
                if(pageNumber > 1){

                    TextView textView = (TextView) rootView.findViewById(R.id.firstonewc);
                    TextView textView1 = (TextView) rootView.findViewById(R.id.secondonewc);
                    String estring = object.getEnglishWord();
                    textView.setText(estring);
                    String hstring = object.getParaDescp();
                    textView1.setText(hstring);
                break;
                }
            }

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {




        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 10 total pages.
            return 13;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Hi, Your Welcome";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}

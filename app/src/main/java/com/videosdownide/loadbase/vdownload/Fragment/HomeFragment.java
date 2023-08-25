package com.videosdownide.loadbase.vdownload.Fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.videosdownide.loadbase.vdownload.R;
import com.videosdownide.loadbase.vdownload.social.ChingariActivity;
import com.videosdownide.loadbase.vdownload.social.FacebookActivity;
import com.videosdownide.loadbase.vdownload.social.InstagramActivity;
import com.videosdownide.loadbase.vdownload.social.JoshActivity;
import com.videosdownide.loadbase.vdownload.social.LikeeActivity;
import com.videosdownide.loadbase.vdownload.social.MXTakaTakActivity;
import com.videosdownide.loadbase.vdownload.social.MitronActivity;
import com.videosdownide.loadbase.vdownload.social.MojActivity;
import com.videosdownide.loadbase.vdownload.social.ReposeActivity;
import com.videosdownide.loadbase.vdownload.social.SharechatActivity;
import com.videosdownide.loadbase.vdownload.social.SnackVideoActivity;
import com.videosdownide.loadbase.vdownload.social.TikTokActivity;
import com.videosdownide.loadbase.vdownload.social.TwitterActivity;
import com.videosdownide.loadbase.vdownload.social.WhatsappActivity;

import java.util.Locale;
import java.util.regex.Matcher;

public class HomeFragment extends Fragment {
    RelativeLayout rlwhatsapp, rlfacebook, rlinstagram, rltwitter, rlsnackvideo, rlsharechat, rlroposo, rlmxtakatak, rllike,rlchingari,rlmoj,rlmitron,rljosh,rltiktok;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rlwhatsapp = view.findViewById(R.id.rlwhatsapp);
        rlfacebook = view.findViewById(R.id.rlfacebook);
        rlinstagram = view.findViewById(R.id.rlinstagram);
        rltwitter = view.findViewById(R.id.rltwitter);
        rlsnackvideo = view.findViewById(R.id.rlsnackvideo);
        rlsharechat = view.findViewById(R.id.rlsharechat);
        rlroposo = view.findViewById(R.id.rlroposo);
        rlmxtakatak = view.findViewById(R.id.rlmxtakatak);
        rllike = view.findViewById(R.id.rllike);
        rlchingari = view.findViewById(R.id.rlchingari);
        rlmoj = view.findViewById(R.id.rlmoj);
        rlmitron = view.findViewById(R.id.rlmitron);
        rljosh = view.findViewById(R.id.rljosh);
        rltiktok = view.findViewById(R.id.rltiktok);
        rlwhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WhatsappActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FacebookActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InstagramActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rltwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TwitterActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlsnackvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnackVideoActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlsharechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SharechatActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlroposo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReposeActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlmxtakatak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MXTakaTakActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rllike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LikeeActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlchingari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChingariActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlmoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MojActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rlmitron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MitronActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rljosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JoshActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        rltiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TikTokActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);
            }
        });
        return view;
    }
    public void setLocale(String lang) {

        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);

        Intent refresh = new Intent(getActivity(), HomeFragment.class);
        startActivity(refresh);
        getActivity().finish();
    }
    public static String extractLinks(String text) {
        Matcher m = Patterns.WEB_URL.matcher(text);
        String url = "";
        while (m.find()) {
            url = m.group();
            Log.d("New URL", "URL extracted: " + url);

            break;
        }
        return url;
    }

}
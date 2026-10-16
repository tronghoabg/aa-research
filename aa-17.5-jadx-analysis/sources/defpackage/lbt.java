package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lbt {
    public static final ConcurrentHashMap a;
    public static final ConcurrentHashMap b;
    public static final Map c;
    public static final lbt d;
    public static final lbt e;
    public static final lbt f;
    public static final lbt g;
    public static final lbt h;
    public static final lbt i;
    public static final lbt j;
    public static final lbt k;
    public static final lbt l;
    public static final lbt m;
    public static final lbt n;
    public static final lbt o;
    public static final lbt p;
    public static final lbt q;
    public static final lbt r;
    private static final yph w;
    private static final /* synthetic */ lbt[] x;
    private final Integer A;
    public final yzz s;
    public final lce t;
    public final afec u;
    public final boolean v;
    private final int y;
    private final yfq z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        lbt lbtVar = new lbt("GENERIC", 0, yzz.CSAT_GENERIC, R.string.csat_survey_question_generic, null, lbw.a, null, null, false, 116);
        d = lbtVar;
        lbt lbtVar2 = new lbt("GENERIC_5PS", 1, yzz.CSAT_GENERIC_5PS, R.string.csat_survey_question_generic_long_term, null, new lcf() { // from class: lcd
        }, null == true ? 1 : 0, new kmn(10), false, 84);
        e = lbtVar2;
        int i2 = 1;
        lbt lbtVar3 = new lbt("GENERIC_5PS_FOLLOWUP", 2, yzz.CSAT_GENERIC_5PS_FOLLOWUP, R.string.csat_survey_question_issues_encountered, null, new lce() { // from class: lbx
            {
                lcc[] lccVarArr = {new lcc(yzy.Ga, R.drawable.gs_bug_report_vd_theme_24, R.string.csat_crash, null, null, 24), new lcc(yzy.Gb, R.drawable.gs_volume_up_vd_theme_24, R.string.csat_poor_audio_quality, null, null, 24), new lcc(yzy.Gc, R.drawable.gs_tv_vd_theme_24, R.string.csat_poor_video_quality, null, null, 24), new lcc(yzy.Gd, R.drawable.gs_pace_vd_theme_24, R.string.csat_ui_responsiveness, null, null, 24), new lcc(yzy.Ge, R.drawable.gs_cable_vd_theme_24, R.string.csat_connectivity_issues, null, null, 24), new lcc(yzy.Gf, R.drawable.csat_icon_very_dissatisfied, R.string.csat_other, null, null, 24)};
            }
        }, i2, null, false, 100);
        f = lbtVar3;
        lbt lbtVar4 = new lbt("ASSISTANT", 3, yzz.CSAT_ASSISTANT, R.string.csat_survey_question_assistant, null, new lcf() { // from class: lcd
        }, null == true ? 1 : 0, new kmn(11), false, 84);
        g = lbtVar4;
        lbt lbtVar5 = new lbt("GEMINI", 4, yzz.CSAT_GEMINI, R.string.csat_survey_question_gemini, null, new lcf() { // from class: lcd
        }, null, new kmn(12), false, 84);
        h = lbtVar5;
        lbt lbtVar6 = new lbt("ASSISTANT_SUBJOURNEY", 5, yzz.CSAT_VOICE_SUBJOURNEY, R.string.csat_survey_question_voice_subjourney, null, new lce() { // from class: lcg
            {
                lcc[] lccVarArr = {new lcc(yzy.Gg, R.drawable.gs_record_voice_over_vd_theme_24, R.string.csat_voice_information, null, null, 24), new lcc(yzy.Gh, R.drawable.gs_assistant_navigation_vd_theme_24, R.string.csat_voice_navigation, null, null, 24), new lcc(yzy.Gi, R.drawable.gs_android_dialer_vd_theme_24, R.string.csat_voice_call, null, null, 24), new lcc(yzy.Gj, R.drawable.gs_forum_vd_theme_24, R.string.csat_voice_messaging, null, null, 24), new lcc(yzy.Gk, R.drawable.gs_play_arrow_vd_theme_24, R.string.csat_voice_media, null, null, 24), new lcc(yzy.Gl, R.drawable.gs_filter_none_vd_theme_24, R.string.csat_voice_other, null, null, 24)};
            }
        }, i2, null, false, 100);
        i = lbtVar6;
        lbt lbtVar7 = new lbt("AUDIO_QUALITY", 6, yzz.CSAT_AUDIO_QUALITY, R.string.csat_survey_question_audio_quality, null, lbw.a, null, null, false, 116);
        j = lbtVar7;
        boolean z = false;
        lbt lbtVar8 = new lbt("AUDIO_THROTTLING", 7, yzz.CSAT_AUDIO_THROTTLING, R.string.csat_survey_question_audio_quality, null, lbw.a, null, null, z, 116);
        k = lbtVar8;
        lbt lbtVar9 = new lbt("THUMBS_DOWN_SUBJOURNEY", 8, yzz.CSAT_ASSISTANT_THUMBS_DOWN_FOLLOW_UP, R.string.csat_survey_question_thumbs_down, null, new lce() { // from class: lcg
            {
                lcc[] lccVarArr = {new lcc(yzy.Gg, R.drawable.gs_record_voice_over_vd_theme_24, R.string.csat_voice_information, null, null, 24), new lcc(yzy.Gh, R.drawable.gs_assistant_navigation_vd_theme_24, R.string.csat_voice_navigation, null, null, 24), new lcc(yzy.Gi, R.drawable.gs_android_dialer_vd_theme_24, R.string.csat_voice_call, null, null, 24), new lcc(yzy.Gj, R.drawable.gs_forum_vd_theme_24, R.string.csat_voice_messaging, null, null, 24), new lcc(yzy.Gk, R.drawable.gs_play_arrow_vd_theme_24, R.string.csat_voice_media, null, null, 24), new lcc(yzy.Gl, R.drawable.gs_filter_none_vd_theme_24, R.string.csat_voice_other, null, null, 24)};
            }
        }, i2, null, true, 36);
        l = lbtVar9;
        int i3 = 2;
        lbt lbtVar10 = new lbt("MESSAGING", 9, yzz.CSAT_MESSAGING, R.string.csat_survey_question_subjourney_template, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_messaging)), new lce() { // from class: lbz
            {
                lcc[] lccVarArr = {new lcc(yzy.Gm, 0, R.string.csat_messaging_play_message, null, null, 26), new lcc(yzy.Gn, 0, R.string.csat_messaging_send_new_message, null, null, 26), new lcc(yzy.Go, 0, R.string.csat_messaging_reply_message, null, null, 26), new lcc(yzy.Gp, 0, R.string.csat_messaging_use_info, null, null, 26), new lcc(yzy.Gq, 0, R.string.csat_messaging_private, null, null, 26), new lcc(yzy.GF, 0, R.string.csat_response_something_else, null, null, 26), new lcc(yzy.GG, 0, R.string.csat_response_no_action_template, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_messaging)), null, 18)};
            }
        }, i3, new kmn(13), false, 64);
        m = lbtVar10;
        yzz yzzVar = yzz.CSAT_NAVIGATION;
        yfq yfqVarQ = yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_navigation));
        lca lcaVar = new lce() { // from class: lca
            {
                lcc[] lccVarArr = {new lcc(yzy.Gr, 0, R.string.csat_navigation_set_destination_and_choose_route, null, null, 26), new lcc(yzy.Gs, 0, R.string.csat_navigation_understand_upcoming_turns_and_maneuvers, null, null, 26), new lcc(yzy.Gt, 0, R.string.csat_navigation_monitor_drive_and_route_conditions, null, null, 26), new lcc(yzy.Gu, 0, R.string.csat_navigation_add_stop_to_current_route, null, null, 26), new lcc(yzy.GF, 0, R.string.csat_response_something_else, null, null, 26), new lcc(yzy.GG, 0, R.string.csat_response_no_action_template, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_navigation)), null, 18)};
            }
        };
        kmn kmnVar = new kmn(14);
        int i4 = 64;
        int i5 = R.string.csat_survey_question_subjourney_template;
        lbt lbtVar11 = new lbt("NAVIGATION", 10, yzzVar, i5, yfqVarQ, lcaVar, i3, kmnVar, z, i4);
        n = lbtVar11;
        lbt lbtVar12 = new lbt("MEDIA", 11, yzz.CSAT_MEDIA, i5, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_media)), new lce() { // from class: lby
            {
                lcc[] lccVarArr = {new lcc(yzy.Gv, 0, R.string.csat_media_play_specific, null, null, 26), new lcc(yzy.Gw, 0, R.string.csat_media_find_something_to_listen_to, null, null, 26), new lcc(yzy.Gx, 0, R.string.csat_media_continue_listening, null, null, 26), new lcc(yzy.Gy, 0, R.string.csat_media_control_playback_or_manage_content, null, null, 26), new lcc(yzy.Gz, 0, R.string.csat_media_switch_apps_or_sources, null, null, 26), new lcc(yzy.GF, 0, R.string.csat_response_something_else, null, null, 26), new lcc(yzy.GG, 0, R.string.csat_response_no_action_template, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_media)), null, 18)};
            }
        }, i3, new kmn(15), z, i4);
        o = lbtVar12;
        lbt lbtVar13 = new lbt("PHONE_CALL", 12, yzz.CSAT_PHONE_CALL, i5, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_phone_call)), new lce() { // from class: lcb
            {
                lcc[] lccVarArr = {new lcc(yzy.GA, 0, R.string.csat_phone_call_incoming, null, null, 26), new lcc(yzy.GB, 0, R.string.csat_phone_call_saved_contact, null, null, 26), new lcc(yzy.GC, 0, R.string.csat_phone_call_business, null, null, 26), new lcc(yzy.GD, 0, R.string.csat_phone_call_options, null, null, 26), new lcc(yzy.GE, 0, R.string.csat_phone_join_call_or_meeting, null, null, 26), new lcc(yzy.GF, 0, R.string.csat_response_something_else, null, null, 26), new lcc(yzy.GG, 0, R.string.csat_response_no_action_template, yfq.q(Integer.valueOf(R.string.csat_subjourney_topic_phone_call)), null, 18)};
            }
        }, i3, new kmn(16), z, i4);
        p = lbtVar13;
        yzz yzzVar2 = yzz.CSAT_MESSAGING_GOAL_FULFILLMENT;
        Integer numValueOf = Integer.valueOf(R.string.csat_testing_cuj_placeholder);
        int i6 = 0;
        lbt lbtVar14 = new lbt("GOAL_FULFILLMENT", 13, yzzVar2, R.string.csat_survey_question_goal_fulfillment, yfq.q(numValueOf), new lce() { // from class: lbv
            {
                lcc[] lccVarArr = {new lcc(yzy.FR, 0, R.string.csat_response_no, null, null, 26), new lcc(yzy.FS, 0, R.string.csat_response_yes_partially, null, null, 26), new lcc(yzy.FT, 0, R.string.csat_response_yes_mostly, null, null, 26), new lcc(yzy.FU, 0, R.string.csat_response_yes_completely, null, null, 26), new lcc(yzy.FV, 0, R.string.csat_response_yes_exceeded, null, null, 26)};
            }
        }, i6, new kmn(17), false, 64);
        q = lbtVar14;
        lbt lbtVar15 = new lbt("EASIER_TO_USE_PHONE", 14, yzz.CSAT_EASIER_TO_USE_PHONE, R.string.csat_survey_question_easier_to_use_phone, yfq.q(numValueOf), new lce() { // from class: lbu
            {
                lcc[] lccVarArr = {new lcc(yzy.GH, 0, R.string.csat_response_much_easier_on_phone, null, null, 26), new lcc(yzy.GI, 0, R.string.csat_response_somewhat_easier_on_phone, null, null, 26), new lcc(yzy.GJ, 0, R.string.csat_response_both_are_about_the_same, null, null, 26), new lcc(yzy.GK, 0, R.string.csat_response_somewhat_easier_on_android_auto, null, null, 26), new lcc(yzy.GL, 0, R.string.csat_response_much_easier_on_android_auto, null, null, 26)};
            }
        }, i6, null, false, 96);
        r = lbtVar15;
        lbt[] lbtVarArr = {lbtVar, lbtVar2, lbtVar3, lbtVar4, lbtVar5, lbtVar6, lbtVar7, lbtVar8, lbtVar9, lbtVar10, lbtVar11, lbtVar12, lbtVar13, lbtVar14, lbtVar15};
        x = lbtVarArr;
        affa.p(lbtVarArr);
        w = yph.c("GH.CsatSurvey");
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        lbt[] lbtVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itD = afez.d(lbtVarArrValues);
        while (itD.hasNext()) {
            Object next = itD.next();
            yzz yzzVar3 = ((lbt) next).s;
            Object obj = linkedHashMap.get(yzzVar3);
            if (obj != null || linkedHashMap.containsKey(yzzVar3)) {
                throw new IllegalStateException("Duplicate survey for UiContext " + yzzVar3.name() + ".");
            }
            linkedHashMap.put(yzzVar3, next);
        }
        c = linkedHashMap;
    }

    public /* synthetic */ lbt(String str, int i2, yzz yzzVar, int i3, yfq yfqVar, lce lceVar, Integer num, afec afecVar, boolean z, int i4) {
        if ((i4 & 4) != 0) {
            int i5 = yfq.d;
            yfqVar = yls.a;
            yfqVar.getClass();
        }
        num = (i4 & 16) != 0 ? null : num;
        afecVar = (i4 & 32) != 0 ? new kmn(18) : afecVar;
        boolean z2 = (i4 & 64) == 0;
        this.s = yzzVar;
        this.y = i3;
        this.z = yfqVar;
        this.t = lceVar;
        this.A = num;
        this.u = afecVar;
        this.v = z & z2;
    }

    public static /* synthetic */ List f(lbt lbtVar, boolean z) {
        Integer num;
        Random random = new Random();
        if (!z || (num = lbtVar.A) == null) {
            return woy.ch(lbtVar.t.b);
        }
        yfq yfqVar = lbtVar.t.b;
        int iIntValue = num.intValue();
        List listCg = woy.cg(woy.bS(woy.ch(yfqVar), iIntValue));
        Collections.shuffle(listCg, random);
        return woy.bY(listCg, woy.ce(yfqVar, iIntValue));
    }

    public static lbt valueOf(String str) {
        return (lbt) Enum.valueOf(lbt.class, str);
    }

    public static lbt[] values() {
        return (lbt[]) x.clone();
    }

    public final int a() {
        return c().he;
    }

    public final yfq b() {
        yfq yfqVar = (yfq) b.get(this);
        return yfqVar == null ? this.z : yfqVar;
    }

    public final yzz c() {
        yzz yzzVar = (yzz) a.get(this);
        return yzzVar == null ? this.s : yzzVar;
    }

    public final String d(Context context) {
        context.getClass();
        if (b().isEmpty()) {
            String string = context.getString(this.y);
            string.getClass();
            return string;
        }
        yfq<Integer> yfqVarB = b();
        ArrayList arrayList = new ArrayList(woy.bp(yfqVarB, 10));
        for (Integer num : yfqVarB) {
            num.getClass();
            String string2 = context.getString(num.intValue());
            string2.getClass();
            if (string2.length() > 0) {
                String strValueOf = String.valueOf(string2.charAt(0));
                strValueOf.getClass();
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String strSubstring = string2.substring(1);
                strSubstring.getClass();
                Objects.toString(lowerCase);
                string2 = lowerCase.concat(strSubstring);
            }
            arrayList.add(string2);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String string3 = context.getString(this.y, Arrays.copyOf(strArr, strArr.length));
        string3.getClass();
        return string3;
    }

    public final void e(Context context) {
        context.getClass();
        ((ype) w.f()).y("Sending trigger broadcast for survey %s", name());
        Intent intent = new Intent();
        intent.setPackage("com.google.android.projection.gearhead");
        intent.setAction("com.google.android.apps.auto.components.feedback.csat.TRIGGER_SURVEY");
        intent.putExtra("com.google.android.apps.auto.components.feedback.csat.SURVEY_CONTEXT_ID", a());
        context.sendBroadcast(intent);
    }
}

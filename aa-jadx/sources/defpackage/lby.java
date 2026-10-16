package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class lby {
    public static final j$.util.concurrent.ConcurrentHashMap a;
    public static final j$.util.concurrent.ConcurrentHashMap b;
    public static final java.util.Map c;
    public static final defpackage.lby d;
    public static final defpackage.lby e;
    public static final defpackage.lby f;
    public static final defpackage.lby g;
    public static final defpackage.lby h;
    public static final defpackage.lby i;
    public static final defpackage.lby j;
    public static final defpackage.lby k;
    public static final defpackage.lby l;
    public static final defpackage.lby m;
    public static final defpackage.lby n;
    public static final defpackage.lby o;
    public static final defpackage.lby p;
    public static final defpackage.lby q;
    public static final defpackage.lby r;
    private static final defpackage.yqm w;
    private static final /* synthetic */ defpackage.lby[] x;
    private final java.lang.Integer A;
    public final defpackage.zbe s;
    public final defpackage.lcj t;
    public final defpackage.affc u;
    public final boolean v;
    private final int y;
    private final defpackage.ygw z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.lby lbyVar = new defpackage.lby("GENERIC", 0, defpackage.zbe.CSAT_GENERIC, com.google.android.projection.gearhead.R.string.csat_survey_question_generic, null, defpackage.lcb.a, null, null, false, 116);
        d = lbyVar;
        defpackage.lby lbyVar2 = new defpackage.lby("GENERIC_5PS", 1, defpackage.zbe.CSAT_GENERIC_5PS, com.google.android.projection.gearhead.R.string.csat_survey_question_generic_long_term, null, new defpackage.lck() { // from class: lci
        }, null == true ? 1 : 0, new defpackage.kmu(10), false, 84);
        e = lbyVar2;
        int i2 = 1;
        defpackage.lby lbyVar3 = new defpackage.lby("GENERIC_5PS_FOLLOWUP", 2, defpackage.zbe.CSAT_GENERIC_5PS_FOLLOWUP, com.google.android.projection.gearhead.R.string.csat_survey_question_issues_encountered, null, new defpackage.lcj() { // from class: lcc
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Ge, com.google.android.projection.gearhead.R.drawable.gs_bug_report_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_crash, null, null, 24), new defpackage.lch(defpackage.zbd.Gf, com.google.android.projection.gearhead.R.drawable.gs_volume_up_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_poor_audio_quality, null, null, 24), new defpackage.lch(defpackage.zbd.Gg, com.google.android.projection.gearhead.R.drawable.gs_tv_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_poor_video_quality, null, null, 24), new defpackage.lch(defpackage.zbd.Gh, com.google.android.projection.gearhead.R.drawable.gs_pace_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_ui_responsiveness, null, null, 24), new defpackage.lch(defpackage.zbd.Gi, com.google.android.projection.gearhead.R.drawable.gs_cable_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_connectivity_issues, null, null, 24), new defpackage.lch(defpackage.zbd.Gj, com.google.android.projection.gearhead.R.drawable.csat_icon_very_dissatisfied, com.google.android.projection.gearhead.R.string.csat_other, null, null, 24)};
            }
        }, i2, null, false, 100);
        f = lbyVar3;
        defpackage.lby lbyVar4 = new defpackage.lby("ASSISTANT", 3, defpackage.zbe.CSAT_ASSISTANT, com.google.android.projection.gearhead.R.string.csat_survey_question_assistant, null, new defpackage.lck() { // from class: lci
        }, null == true ? 1 : 0, new defpackage.kmu(11), false, 84);
        g = lbyVar4;
        defpackage.lby lbyVar5 = new defpackage.lby("GEMINI", 4, defpackage.zbe.CSAT_GEMINI, com.google.android.projection.gearhead.R.string.csat_survey_question_gemini, null, new defpackage.lck() { // from class: lci
        }, null, new defpackage.kmu(12), false, 84);
        h = lbyVar5;
        defpackage.lby lbyVar6 = new defpackage.lby("ASSISTANT_SUBJOURNEY", 5, defpackage.zbe.CSAT_VOICE_SUBJOURNEY, com.google.android.projection.gearhead.R.string.csat_survey_question_voice_subjourney, null, new defpackage.lcj() { // from class: lcl
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Gk, com.google.android.projection.gearhead.R.drawable.gs_record_voice_over_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_information, null, null, 24), new defpackage.lch(defpackage.zbd.Gl, com.google.android.projection.gearhead.R.drawable.gs_assistant_navigation_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_navigation, null, null, 24), new defpackage.lch(defpackage.zbd.Gm, com.google.android.projection.gearhead.R.drawable.gs_android_dialer_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_call, null, null, 24), new defpackage.lch(defpackage.zbd.Gn, com.google.android.projection.gearhead.R.drawable.gs_forum_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_messaging, null, null, 24), new defpackage.lch(defpackage.zbd.Go, com.google.android.projection.gearhead.R.drawable.gs_play_arrow_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_media, null, null, 24), new defpackage.lch(defpackage.zbd.Gp, com.google.android.projection.gearhead.R.drawable.gs_filter_none_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_other, null, null, 24)};
            }
        }, i2, null, false, 100);
        i = lbyVar6;
        defpackage.lby lbyVar7 = new defpackage.lby("AUDIO_QUALITY", 6, defpackage.zbe.CSAT_AUDIO_QUALITY, com.google.android.projection.gearhead.R.string.csat_survey_question_audio_quality, null, defpackage.lcb.a, null, null, false, 116);
        j = lbyVar7;
        boolean z = false;
        defpackage.lby lbyVar8 = new defpackage.lby("AUDIO_THROTTLING", 7, defpackage.zbe.CSAT_AUDIO_THROTTLING, com.google.android.projection.gearhead.R.string.csat_survey_question_audio_quality, null, defpackage.lcb.a, null, null, z, 116);
        k = lbyVar8;
        defpackage.lby lbyVar9 = new defpackage.lby("THUMBS_DOWN_SUBJOURNEY", 8, defpackage.zbe.CSAT_ASSISTANT_THUMBS_DOWN_FOLLOW_UP, com.google.android.projection.gearhead.R.string.csat_survey_question_thumbs_down, null, new defpackage.lcj() { // from class: lcl
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Gk, com.google.android.projection.gearhead.R.drawable.gs_record_voice_over_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_information, null, null, 24), new defpackage.lch(defpackage.zbd.Gl, com.google.android.projection.gearhead.R.drawable.gs_assistant_navigation_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_navigation, null, null, 24), new defpackage.lch(defpackage.zbd.Gm, com.google.android.projection.gearhead.R.drawable.gs_android_dialer_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_call, null, null, 24), new defpackage.lch(defpackage.zbd.Gn, com.google.android.projection.gearhead.R.drawable.gs_forum_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_messaging, null, null, 24), new defpackage.lch(defpackage.zbd.Go, com.google.android.projection.gearhead.R.drawable.gs_play_arrow_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_media, null, null, 24), new defpackage.lch(defpackage.zbd.Gp, com.google.android.projection.gearhead.R.drawable.gs_filter_none_vd_theme_24, com.google.android.projection.gearhead.R.string.csat_voice_other, null, null, 24)};
            }
        }, i2, null, true, 36);
        l = lbyVar9;
        int i3 = 2;
        defpackage.lby lbyVar10 = new defpackage.lby("MESSAGING", 9, defpackage.zbe.CSAT_MESSAGING, com.google.android.projection.gearhead.R.string.csat_survey_question_subjourney_template, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_messaging)), new defpackage.lcj() { // from class: lce
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Gq, 0, com.google.android.projection.gearhead.R.string.csat_messaging_play_message, null, null, 26), new defpackage.lch(defpackage.zbd.Gr, 0, com.google.android.projection.gearhead.R.string.csat_messaging_send_new_message, null, null, 26), new defpackage.lch(defpackage.zbd.Gs, 0, com.google.android.projection.gearhead.R.string.csat_messaging_reply_message, null, null, 26), new defpackage.lch(defpackage.zbd.Gt, 0, com.google.android.projection.gearhead.R.string.csat_messaging_use_info, null, null, 26), new defpackage.lch(defpackage.zbd.Gu, 0, com.google.android.projection.gearhead.R.string.csat_messaging_private, null, null, 26), new defpackage.lch(defpackage.zbd.GJ, 0, com.google.android.projection.gearhead.R.string.csat_response_something_else, null, null, 26), new defpackage.lch(defpackage.zbd.GK, 0, com.google.android.projection.gearhead.R.string.csat_response_no_action_template, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_messaging)), null, 18)};
            }
        }, i3, new defpackage.kmu(13), false, 64);
        m = lbyVar10;
        defpackage.zbe zbeVar = defpackage.zbe.CSAT_NAVIGATION;
        defpackage.ygw ygwVarQ = defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_navigation));
        defpackage.lcf lcfVar = new defpackage.lcj() { // from class: lcf
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Gv, 0, com.google.android.projection.gearhead.R.string.csat_navigation_set_destination_and_choose_route, null, null, 26), new defpackage.lch(defpackage.zbd.Gw, 0, com.google.android.projection.gearhead.R.string.csat_navigation_understand_upcoming_turns_and_maneuvers, null, null, 26), new defpackage.lch(defpackage.zbd.Gx, 0, com.google.android.projection.gearhead.R.string.csat_navigation_monitor_drive_and_route_conditions, null, null, 26), new defpackage.lch(defpackage.zbd.Gy, 0, com.google.android.projection.gearhead.R.string.csat_navigation_add_stop_to_current_route, null, null, 26), new defpackage.lch(defpackage.zbd.GJ, 0, com.google.android.projection.gearhead.R.string.csat_response_something_else, null, null, 26), new defpackage.lch(defpackage.zbd.GK, 0, com.google.android.projection.gearhead.R.string.csat_response_no_action_template, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_navigation)), null, 18)};
            }
        };
        defpackage.kmu kmuVar = new defpackage.kmu(14);
        int i4 = 64;
        int i5 = com.google.android.projection.gearhead.R.string.csat_survey_question_subjourney_template;
        defpackage.lby lbyVar11 = new defpackage.lby("NAVIGATION", 10, zbeVar, i5, ygwVarQ, lcfVar, i3, kmuVar, z, i4);
        n = lbyVar11;
        defpackage.lby lbyVar12 = new defpackage.lby("MEDIA", 11, defpackage.zbe.CSAT_MEDIA, i5, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_media)), new defpackage.lcj() { // from class: lcd
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.Gz, 0, com.google.android.projection.gearhead.R.string.csat_media_play_specific, null, null, 26), new defpackage.lch(defpackage.zbd.GA, 0, com.google.android.projection.gearhead.R.string.csat_media_find_something_to_listen_to, null, null, 26), new defpackage.lch(defpackage.zbd.GB, 0, com.google.android.projection.gearhead.R.string.csat_media_continue_listening, null, null, 26), new defpackage.lch(defpackage.zbd.GC, 0, com.google.android.projection.gearhead.R.string.csat_media_control_playback_or_manage_content, null, null, 26), new defpackage.lch(defpackage.zbd.GD, 0, com.google.android.projection.gearhead.R.string.csat_media_switch_apps_or_sources, null, null, 26), new defpackage.lch(defpackage.zbd.GJ, 0, com.google.android.projection.gearhead.R.string.csat_response_something_else, null, null, 26), new defpackage.lch(defpackage.zbd.GK, 0, com.google.android.projection.gearhead.R.string.csat_response_no_action_template, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_media)), null, 18)};
            }
        }, i3, new defpackage.kmu(15), z, i4);
        o = lbyVar12;
        defpackage.lby lbyVar13 = new defpackage.lby("PHONE_CALL", 12, defpackage.zbe.CSAT_PHONE_CALL, i5, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_phone_call)), new defpackage.lcj() { // from class: lcg
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.GE, 0, com.google.android.projection.gearhead.R.string.csat_phone_call_incoming, null, null, 26), new defpackage.lch(defpackage.zbd.GF, 0, com.google.android.projection.gearhead.R.string.csat_phone_call_saved_contact, null, null, 26), new defpackage.lch(defpackage.zbd.GG, 0, com.google.android.projection.gearhead.R.string.csat_phone_call_business, null, null, 26), new defpackage.lch(defpackage.zbd.GH, 0, com.google.android.projection.gearhead.R.string.csat_phone_call_options, null, null, 26), new defpackage.lch(defpackage.zbd.GI, 0, com.google.android.projection.gearhead.R.string.csat_phone_join_call_or_meeting, null, null, 26), new defpackage.lch(defpackage.zbd.GJ, 0, com.google.android.projection.gearhead.R.string.csat_response_something_else, null, null, 26), new defpackage.lch(defpackage.zbd.GK, 0, com.google.android.projection.gearhead.R.string.csat_response_no_action_template, defpackage.ygw.q(java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_subjourney_topic_phone_call)), null, 18)};
            }
        }, i3, new defpackage.kmu(16), z, i4);
        p = lbyVar13;
        defpackage.zbe zbeVar2 = defpackage.zbe.CSAT_MESSAGING_GOAL_FULFILLMENT;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(com.google.android.projection.gearhead.R.string.csat_testing_cuj_placeholder);
        int i6 = 0;
        defpackage.lby lbyVar14 = new defpackage.lby("GOAL_FULFILLMENT", 13, zbeVar2, com.google.android.projection.gearhead.R.string.csat_survey_question_goal_fulfillment, defpackage.ygw.q(numValueOf), new defpackage.lcj() { // from class: lca
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.FV, 0, com.google.android.projection.gearhead.R.string.csat_response_no, null, null, 26), new defpackage.lch(defpackage.zbd.FW, 0, com.google.android.projection.gearhead.R.string.csat_response_yes_partially, null, null, 26), new defpackage.lch(defpackage.zbd.FX, 0, com.google.android.projection.gearhead.R.string.csat_response_yes_mostly, null, null, 26), new defpackage.lch(defpackage.zbd.FY, 0, com.google.android.projection.gearhead.R.string.csat_response_yes_completely, null, null, 26), new defpackage.lch(defpackage.zbd.FZ, 0, com.google.android.projection.gearhead.R.string.csat_response_yes_exceeded, null, null, 26)};
            }
        }, i6, new defpackage.kmu(17), false, 64);
        q = lbyVar14;
        defpackage.lby lbyVar15 = new defpackage.lby("EASIER_TO_USE_PHONE", 14, defpackage.zbe.CSAT_EASIER_TO_USE_PHONE, com.google.android.projection.gearhead.R.string.csat_survey_question_easier_to_use_phone, defpackage.ygw.q(numValueOf), new defpackage.lcj() { // from class: lbz
            {
                defpackage.lch[] lchVarArr = {new defpackage.lch(defpackage.zbd.GL, 0, com.google.android.projection.gearhead.R.string.csat_response_much_easier_on_phone, null, null, 26), new defpackage.lch(defpackage.zbd.GM, 0, com.google.android.projection.gearhead.R.string.csat_response_somewhat_easier_on_phone, null, null, 26), new defpackage.lch(defpackage.zbd.GN, 0, com.google.android.projection.gearhead.R.string.csat_response_both_are_about_the_same, null, null, 26), new defpackage.lch(defpackage.zbd.GO, 0, com.google.android.projection.gearhead.R.string.csat_response_somewhat_easier_on_android_auto, null, null, 26), new defpackage.lch(defpackage.zbd.GP, 0, com.google.android.projection.gearhead.R.string.csat_response_much_easier_on_android_auto, null, null, 26)};
            }
        }, i6, null, false, 96);
        r = lbyVar15;
        defpackage.lby[] lbyVarArr = {lbyVar, lbyVar2, lbyVar3, lbyVar4, lbyVar5, lbyVar6, lbyVar7, lbyVar8, lbyVar9, lbyVar10, lbyVar11, lbyVar12, lbyVar13, lbyVar14, lbyVar15};
        x = lbyVarArr;
        defpackage.afga.p(lbyVarArr);
        w = defpackage.yqm.c("GH.CsatSurvey");
        a = new j$.util.concurrent.ConcurrentHashMap();
        b = new j$.util.concurrent.ConcurrentHashMap();
        defpackage.lby[] lbyVarArrValues = values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator itC = defpackage.affz.c(lbyVarArrValues);
        while (itC.hasNext()) {
            java.lang.Object next = itC.next();
            defpackage.zbe zbeVar3 = ((defpackage.lby) next).s;
            java.lang.Object obj = linkedHashMap.get(zbeVar3);
            if (obj != null || linkedHashMap.containsKey(zbeVar3)) {
                throw new java.lang.IllegalStateException("Duplicate survey for UiContext " + zbeVar3.name() + ".");
            }
            linkedHashMap.put(zbeVar3, next);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lby(java.lang.String str, int i2, defpackage.zbe zbeVar, int i3, defpackage.ygw ygwVar, defpackage.lcj lcjVar, java.lang.Integer num, defpackage.affc affcVar, boolean z, int i4) {
        super(str, i2);
        if ((i4 & 4) != 0) {
            int i5 = defpackage.ygw.d;
            ygwVar = defpackage.ymx.a;
            ygwVar.getClass();
        }
        num = (i4 & 16) != 0 ? null : num;
        affcVar = (i4 & 32) != 0 ? new defpackage.kmu(18) : affcVar;
        boolean z2 = (i4 & 64) == 0;
        this.s = zbeVar;
        this.y = i3;
        this.z = ygwVar;
        this.t = lcjVar;
        this.A = num;
        this.u = affcVar;
        this.v = z & z2;
    }

    public static /* synthetic */ java.util.List f(defpackage.lby lbyVar, boolean z) {
        java.lang.Integer num;
        java.util.Random random = new java.util.Random();
        if (!z || (num = lbyVar.A) == null) {
            return defpackage.afga.bb(lbyVar.t.b);
        }
        defpackage.ygw ygwVar = lbyVar.t.b;
        int iIntValue = num.intValue();
        java.util.List listBa = defpackage.afga.ba(defpackage.afga.aM(defpackage.afga.bb(ygwVar), iIntValue));
        java.util.Collections.shuffle(listBa, random);
        return defpackage.afga.aS(listBa, defpackage.afga.aY(ygwVar, iIntValue));
    }

    public static defpackage.lby valueOf(java.lang.String str) {
        return (defpackage.lby) java.lang.Enum.valueOf(defpackage.lby.class, str);
    }

    public static defpackage.lby[] values() {
        return (defpackage.lby[]) x.clone();
    }

    public final int a() {
        return c().he;
    }

    public final defpackage.ygw b() {
        defpackage.ygw ygwVar = (defpackage.ygw) b.get(this);
        return ygwVar == null ? this.z : ygwVar;
    }

    public final defpackage.zbe c() {
        defpackage.zbe zbeVar = (defpackage.zbe) a.get(this);
        return zbeVar == null ? this.s : zbeVar;
    }

    public final java.lang.String d(android.content.Context context) {
        context.getClass();
        if (b().isEmpty()) {
            java.lang.String string = context.getString(this.y);
            string.getClass();
            return string;
        }
        defpackage.ygw<java.lang.Integer> ygwVarB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(ygwVarB, 10));
        for (java.lang.Integer num : ygwVarB) {
            num.getClass();
            java.lang.String string2 = context.getString(num.intValue());
            string2.getClass();
            if (string2.length() > 0) {
                java.lang.String strValueOf = java.lang.String.valueOf(string2.charAt(0));
                strValueOf.getClass();
                java.lang.String lowerCase = strValueOf.toLowerCase(java.util.Locale.ROOT);
                lowerCase.getClass();
                java.lang.String strSubstring = string2.substring(1);
                strSubstring.getClass();
                string2 = lowerCase.concat(strSubstring);
            }
            arrayList.add(string2);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        java.lang.String string3 = context.getString(this.y, java.util.Arrays.copyOf(strArr, strArr.length));
        string3.getClass();
        return string3;
    }

    public final void e(android.content.Context context) {
        context.getClass();
        ((defpackage.yqj) w.f()).y("Sending trigger broadcast for survey %s", name());
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.projection.gearhead");
        intent.setAction("com.google.android.apps.auto.components.feedback.csat.TRIGGER_SURVEY");
        intent.putExtra("com.google.android.apps.auto.components.feedback.csat.SURVEY_CONTEXT_ID", a());
        context.sendBroadcast(intent);
    }
}

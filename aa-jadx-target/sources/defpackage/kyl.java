package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kyl implements ngs {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.AsstQFEPvdr");
    private final defpackage.ngy b;
    private final android.content.Context c;
    private final java.util.Random d;

    public kyl(defpackage.ngy ngyVar, android.content.Context context) {
        java.util.Random random = new java.util.Random();
        this.b = ngyVar;
        this.c = context;
        this.d = random;
    }

    public static final void c(defpackage.zbd zbdVar) {
        defpackage.ots otsVar;
        if (zbdVar == defpackage.zbd.FU) {
            otsVar = defpackage.ots.ASSISTANT_THUMBS_UP_FEEDBACK_CLICKED;
        } else {
            if (zbdVar != defpackage.zbd.FT) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3543)).u("Unexpected action after TU/TD result");
                return;
            }
            otsVar = defpackage.ots.ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED;
        }
        defpackage.kxc kxcVarN = defpackage.ebo.n();
        defpackage.abor aborVarN = ott.a.n();
        aborVarN.t();
        ott ottVar = aborVarN.b;
        ottVar.c = otsVar.C;
        ottVar.b |= 1;
        kxcVarN.v((ott) aborVarN.q());
    }

    public static final void d(defpackage.zbd zbdVar) {
        defpackage.ots otsVar;
        if (zbdVar == defpackage.zbd.FU) {
            otsVar = defpackage.ots.GEMINI_THUMBS_UP_FEEDBACK_CLICKED;
        } else {
            if (zbdVar != defpackage.zbd.FT) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3544)).u("Unexpected action after TU/TD result");
                return;
            }
            otsVar = defpackage.ots.GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED;
        }
        defpackage.kxc kxcVarN = defpackage.ebo.n();
        defpackage.abor aborVarN = ott.a.n();
        aborVarN.t();
        ott ottVar = aborVarN.b;
        ottVar.c = otsVar.C;
        ottVar.b |= 1;
        kxcVarN.v((ott) aborVarN.q());
    }

    private static final double e(ngt ngtVar) {
        return ((ngtVar instanceof ngm) || ngtVar == ngu.o) ? defpackage.acnf.b() : defpackage.acnf.f();
    }

    private static final boolean f(ngt ngtVar) {
        return ((ngtVar instanceof ngm) || ngtVar == ngu.o) ? defpackage.acnf.r() : defpackage.acnf.C();
    }

    public final /* bridge */ /* synthetic */ ngx a(ngt ngtVar) {
        int i;
        ngu nguVar = ngu.o;
        boolean z = ngtVar == ngu.l || ngtVar == ngu.m || ngtVar == ngu.n;
        boolean z2 = ngtVar instanceof ngm;
        boolean z3 = ngtVar == nguVar;
        if (!z2 && !z3 && !z) {
            return null;
        }
        if (this.d.nextDouble() > e(ngtVar)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3542)).y("Assistant Quick Feedback not triggered at rate. %f", java.lang.Double.valueOf(e(ngtVar)));
            return null;
        }
        if (f(ngtVar)) {
            defpackage.ngy ngyVar = this.b;
            if (ngyVar.a() <= ngyVar.n()) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3541)).u("Assistant Quick Feedback throttled.");
                return null;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3540)).y("Assistant Quick Feedback triggered. isThrottlingEnabled %b", java.lang.Boolean.valueOf(f(ngtVar)));
        boolean zB = defpackage.lee.a().b();
        if (z3) {
            i = true == zB ? 2131233028 : 2131233027;
            boolean zAV = defpackage.acyc.aV();
            android.content.Context context = this.c;
            return zAV ? new nwc(2132083181, 0, defpackage.kzi.y(context, i, false), defpackage.zbe.CSAT_MESSAGE_SUMMARIZATION, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), (nwe) null) : new nwc(context, 2132083181, 0, "Assistant Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, i), defpackage.zbe.CSAT_MESSAGE_SUMMARIZATION, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), (nwe) null);
        }
        if (z2) {
            boolean zAV2 = defpackage.acyc.aV();
            android.content.Context context2 = this.c;
            return zAV2 ? new nwc(2132083181, 0, defpackage.kzi.y(context2, 2131231890, false), defpackage.zbe.CSAT_MESSAGE_SUMMARIZATION, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), (nwe) null) : new nwc(context2, 2132083181, 0, "Assistant Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context2, 2131231890), defpackage.zbe.CSAT_MESSAGE_SUMMARIZATION, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), (nwe) null);
        }
        if (ngtVar == ngu.m) {
            i = true == zB ? 2131233028 : 2131233027;
            java.lang.String str = kzo.a().b;
            java.lang.String str2 = str != null ? str : "com.google.android.googlequicksearchbox";
            boolean zAV3 = defpackage.acyc.aV();
            android.content.Context context3 = this.c;
            return zAV3 ? new nwc(2132084174, 0, defpackage.kzi.y(context3, i, false), defpackage.zbe.CSAT_GEMINI, new android.content.ComponentName(str2, "CarAssistantQuickFeedbackProvider"), new kyk(this, 1)) : new nwc(context3, 2132084174, 0, "Assistant Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context3, i), defpackage.zbe.CSAT_GEMINI, new android.content.ComponentName(str2, "CarAssistantQuickFeedbackProvider"), new kyk(this, 0));
        }
        if (ngtVar != ngu.n) {
            boolean zAV4 = defpackage.acyc.aV();
            android.content.Context context4 = this.c;
            return zAV4 ? new nwc(2132083180, 0, defpackage.kzi.y(context4, 2131231890, false), defpackage.zbe.CSAT_ASSISTANT, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), new kyk(this, 4)) : new nwc(context4, 2132083180, 0, "Assistant Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context4, 2131231890), defpackage.zbe.CSAT_ASSISTANT, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), new kyk(this, 5));
        }
        int i2 = true != zB ? 2131231003 : 2131231004;
        boolean zAV5 = defpackage.acyc.aV();
        android.content.Context context5 = this.c;
        return zAV5 ? new nwc(2132084173, 2132084172, defpackage.kzi.y(context5, i2, true), defpackage.zbe.CSAT_GEMINI_LIVE, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), new kyk(this, 2)) : new nwc(context5, 2132084173, 2132084172, "Assistant Quick Feedback Notification", com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context5, i2), defpackage.zbe.CSAT_GEMINI_LIVE, new android.content.ComponentName("com.google.android.googlequicksearchbox", "CarAssistantQuickFeedbackProvider"), new kyk(this, 3));
    }

    public final void b() {
        defpackage.lby.l.e(this.c);
    }
}

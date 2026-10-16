package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.PhoneActivityLaunchr");

    public static defpackage.mfm a() {
        return (defpackage.mfm) defpackage.mkp.a.i(defpackage.mfm.class);
    }

    public static final void b(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, mfl mflVar, defpackage.zbe zbeVar, int i) {
        int i2;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4835)).y("Attempting to launch phone activity with UiContext=%s", zbeVar);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4831)).u("Attempting to launch phone activity");
        if (defpackage.ler.b().e() != defpackage.liy.a) {
            context.startActivity(intent, defpackage.luq.c());
            if (((android.app.KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4834)).u("Launched successfully, but phone is locked");
                i2 = 2;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4833)).u("Launched successfully");
                i2 = 3;
            }
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4832)).u("Abort phone activity launch (user is driving)");
            i2 = 1;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                d(i, context, defpackage.mkt.s, str);
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.pX).l());
                return;
            } else {
                d(i, context, defpackage.mkt.s, str2);
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.pX).l());
                return;
            }
        }
        if (str3 != null) {
            d(i, context, defpackage.mkt.s, str3);
        }
        if (mflVar != null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4836)).w("Posting driving notification with id=%d", 953608361);
            java.lang.CharSequence charSequenceLoadLabel = context.getApplicationInfo().loadLabel(context.getPackageManager());
            android.content.ClipData clipData = wer.a;
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
            defpackage.maz.c();
            defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
            dteVar.n(2131231121);
            dteVar.i(charSequenceLoadLabel);
            java.lang.String str4 = mflVar.a;
            dteVar.h(str4);
            dtd dtdVar = new dtd();
            dtdVar.d(str4);
            dteVar.o(dtdVar);
            dteVar.e(16, true);
            dteVar.l();
            dteVar.g = activity;
            new defpackage.dun(context).b(null, 953608361, dteVar.a());
        }
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.pY).l());
    }

    public static final void c(android.content.Context context, android.content.Intent intent, java.lang.String str, defpackage.zbe zbeVar) {
        b(context, intent, context.getString(2132084165, str), context.getString(2132084166, str), context.getString(2132084163, str), null, zbeVar, 1);
    }

    private static final void d(int i, android.content.Context context, android.content.ComponentName componentName, java.lang.CharSequence charSequence) {
        if (i - 1 != 0) {
            defpackage.ocn.a().e(context, componentName, charSequence, 1, null);
        } else {
            defpackage.ocn.a().g(context, componentName, charSequence, 1);
        }
    }
}

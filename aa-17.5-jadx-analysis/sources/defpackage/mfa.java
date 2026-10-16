package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class mfa {
    public static final yzz a = yzz.PHONE_CALL_LOG;
    public static final yob b = yob.c("com/google/android/apps/auto/components/phone/recents/RecentsModel");
    private static final Duration l = wub.an(60);
    public final Context c;
    public final kif d;
    public final afeg e;
    public final tjy f;
    public final tmb g;
    public final String h;
    public final eqm i;
    public Long j;
    public final eqj k;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, tmb] */
    public mfa(Context context, ept eptVar, esm esmVar, int i) {
        kif kifVar = new kif(context, esmVar);
        kus kusVar = new kus(context, 18);
        tki tkiVar = new tki(context, eptVar, szp.z(new meg(context, i), i), "mfa");
        ?? r5 = oit.a().c;
        this.c = context;
        this.d = kifVar;
        this.e = kusVar;
        this.f = tkiVar;
        this.g = r5;
        this.h = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getNetworkCountryIso();
        this.i = new eqm(null);
        aiyd aiydVar = new aiyd(new dmx(this, (afck) null, 15));
        mkk mkkVar = mkm.a;
        this.k = tby.u(eqy.b(dtx.n(aimv.a(new hcg(new hcg(aimv.a(aiydVar, mkkVar.e()), this, 8), new meq((afck) null, 2, (char[]) null), 12), mkkVar.b()), l), new eyr(this, 17, (boolean[][][]) null)), null);
    }

    public final String a(kih kihVar) {
        String str = kihVar.a;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            return str;
        }
        kqz kqzVar = kihVar.b;
        odj odjVarA = ebf.A();
        String str2 = kqzVar.a;
        boolean zC = odjVarA.C(str2);
        Context context = this.c;
        if (zC) {
            String string = context.getString(R.string.voicemail);
            string.getClass();
            return string;
        }
        String strR = odn.a().r(context, str2);
        strR.getClass();
        return strR;
    }
}

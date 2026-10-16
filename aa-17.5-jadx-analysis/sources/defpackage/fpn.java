package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fpn {
    public static final fpn a = new fpn();
    private static ugn b;

    public static final ugn a(Context context) {
        context.getClass();
        ugn ugnVar = b;
        return ugnVar == null ? a.b(context) : ugnVar;
    }

    private final synchronized ugn b(Context context) {
        ugn ugnVar;
        ugn ugnVar2 = b;
        if (ugnVar2 != null) {
            return ugnVar2;
        }
        Object applicationContext = context.getApplicationContext();
        fpq fpqVar = applicationContext instanceof fpq ? (fpq) applicationContext : null;
        if (fpqVar != null) {
            ugnVar = fpqVar.a();
        } else {
            ncp ncpVar = new ncp(context, (byte[]) null);
            Object obj = ncpVar.a;
            Object obj2 = ncpVar.c;
            aezr aezrVarDG = woy.dG(new flm(ncpVar, 10));
            aezr aezrVarDG2 = woy.dG(new flm(ncpVar, 11));
            aezr aezrVarDG3 = woy.dG(new eup(11));
            afbe afbeVar = afbe.a;
            ugnVar = new ugn((Context) obj, (fss) obj2, aezrVarDG, aezrVarDG2, aezrVarDG3, new ajdr(afbeVar, afbeVar, afbeVar, afbeVar, afbeVar), (fvl) ncpVar.b);
        }
        b = ugnVar;
        return ugnVar;
    }
}

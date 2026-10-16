package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zyw extends uxm {
    private static final String h = "zyw";
    private final kex i;

    public zyw(Context context, shv shvVar, kex kexVar) {
        super(context, shvVar);
        this.i = kexVar;
    }

    @Override // defpackage.uxm
    public final void c(yvx yvxVar) {
        svz svzVarA = zys.a();
        if (svzVarA != null) {
            svzVarA.n(new zyv(this, yvxVar, 0));
        }
    }

    @Override // defpackage.uxm
    public final abnp l(aahu aahuVar, int i, int i2) {
        abnp abnpVarL = super.l(aahuVar, i, i2);
        try {
            String str = (String) ((zeu) this.i.g()).s();
            if (!str.isEmpty()) {
                abnp abnpVarN = absr.a.n();
                abnpVarN.t();
                absr absrVar = (absr) abnpVarN.b;
                str.getClass();
                absrVar.b |= 4;
                absrVar.c = str;
                absr absrVar2 = (absr) abnpVarN.q();
                abnpVarL.t();
                yvx yvxVar = (yvx) abnpVarL.b;
                yvx yvxVar2 = yvx.a;
                absrVar2.getClass();
                yvxVar.w = absrVar2;
                yvxVar.b |= 1073741824;
                return abnpVarL;
            }
        } catch (InterruptedException | ExecutionException e) {
            String str2 = h;
            if (zrn.e(str2, 6)) {
                Log.e(str2, "Failure to get zb cookie", e);
            }
        }
        return abnpVarL;
    }

    public final /* synthetic */ void m(yvx yvxVar, ntn ntnVar) {
        if (ntnVar.g()) {
            super.c(yvxVar);
        }
    }
}

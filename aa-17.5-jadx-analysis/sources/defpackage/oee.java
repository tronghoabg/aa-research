package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class oee implements nfz {
    private final ngf c;
    private static final yph b = yph.c("GH.DialerEducationPrvdr");
    static final oed a = new oed(acqd.q(), acai.A, yzz.PHONE_FACET);

    public oee(ngf ngfVar) {
        this.c = ngfVar;
    }

    @Override // defpackage.nfz
    public final /* bridge */ /* synthetic */ nge a(nga ngaVar) {
        if (Build.VERSION.SDK_INT < 30 || !acqd.r() || !lgv.c().k()) {
            return null;
        }
        Context context = mki.a.c;
        if (!odn.a().H(context) || odn.a().B(context)) {
            return null;
        }
        ngf ngfVar = this.c;
        oed oedVar = a;
        if (ngfVar.j(oedVar) || ngaVar != ngb.a) {
            return null;
        }
        ((ype) ((ype) b.f()).ai((char) 5599)).u("Showing Multi-SIM tooltip");
        return oedVar;
    }
}

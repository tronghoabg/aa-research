package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rdu implements rze {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rdu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.rze
    public final void a() throws RemoteException {
        int i = this.c;
        if (i == 0) {
            ((lah) ((rdx) this.a).c).E(new rdv(this.b, 7));
            return;
        }
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            int i4 = 2;
            if (i != 2) {
                ((lah) ((rdx) this.a).a).E(new rdv(this.b, i4));
                return;
            } else {
                ((lah) ((rdx) this.a).b).E(new rdv(this.b, i2));
                return;
            }
        }
        rdj rdjVar = (rdj) this.a;
        woy.aa(rdjVar.p(raj.x), "This API can only be used if multi-region is enabled");
        if (omc.c("CAR.CLIENT", 3)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.CLIENT", null, "Multi-region client enabled. RegisterCarDisplayLayoutUpdateCompleteListener", new Object[0]);
        }
        rdjVar.k.E(new rdv(this.b, i3));
    }
}

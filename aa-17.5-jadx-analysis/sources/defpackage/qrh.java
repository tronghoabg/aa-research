package defpackage;

import android.os.RemoteException;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class qrh {
    public Boolean a;
    public final Object b;
    public final Object c;

    public qrh(qvx qvxVar, qxp qxpVar) {
        new CopyOnWriteArrayList();
        this.c = new rox(new qhc(7));
        if (qvxVar == null) {
            throw new IllegalStateException("You must provide ICarCall to CarCallManager.");
        }
        this.b = qxpVar;
        if (qxpVar == null) {
            this.a = false;
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qxp] */
    public final boolean b() {
        Boolean boolValueOf = this.a;
        if (boolValueOf == null) {
            try {
                boolValueOf = Boolean.valueOf(this.b.i());
                this.a = boolValueOf;
            } catch (RemoteException unused) {
                boolValueOf = false;
                this.a = boolValueOf;
            }
        }
        return boolValueOf.booleanValue();
    }

    public final wdw c() {
        this.a.getClass();
        return new wdw(this.a.booleanValue(), ((yfl) this.c).g(), ((yfl) this.b).g());
    }

    public final void d() {
        woy.aa(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }

    public qrh() {
        int i = yfq.d;
        this.c = new yfl(4);
        this.b = new yfl(4);
    }
}

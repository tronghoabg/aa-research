package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class dbr {
    public final dbq a;
    public final cdi b;
    public boolean c;
    private buo d;

    public dbr() {
        dbq dbqVar = new dbq(new cdg());
        this.a = dbqVar;
        this.b = dbqVar;
    }

    public final void a(buo buoVar) {
        buo buoVar2 = this.d;
        if (buoVar2 != null) {
            buoVar2.a();
        }
        this.d = buoVar;
    }

    public final void b(dcq dcqVar) {
        buo buoVarB;
        if (this.a.b()) {
            try {
                buoVarB = dcqVar.a.b(new cxm(this, 5));
            } catch (CancellationException unused) {
                this.a.a();
                buoVarB = null;
            }
            a(buoVarB);
        }
    }
}

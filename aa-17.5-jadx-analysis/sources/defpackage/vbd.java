package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
final class vbd extends adqq {
    public final Object a;
    public vbc b;
    public boolean c;
    public final vvu d;

    public vbd(vvu vvuVar) {
        super(null, null);
        this.a = new Object();
        this.c = false;
        this.d = vvuVar;
        if (woy.am("application/grpc")) {
            return;
        }
        vvuVar.k = "application/grpc";
    }

    @Override // defpackage.adqq
    @ResultIgnorabilityUnspecified
    public final adjb bd() {
        synchronized (this.a) {
            if (this.b != null) {
                return new adjb();
            }
            vbc vbcVar = new vbc(this.d);
            this.b = vbcVar;
            return vbcVar;
        }
    }
}

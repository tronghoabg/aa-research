package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akff extends defpackage.akez {
    private final int a;
    private final int c;
    private final int d;

    public akff(defpackage.akdf akdfVar, defpackage.akdh akdhVar, int i) {
        super(akdfVar, akdhVar);
        this.a = i;
        if (akdfVar.d() + i > Integer.MIN_VALUE) {
            this.c = akdfVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (akdfVar.c() + i < Integer.MAX_VALUE) {
            this.d = akdfVar.c() + i;
        } else {
            this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int c() {
        return this.d;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final int d() {
        return this.c;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long e(long j, int i) {
        long jE = super.e(j, i);
        org.jni_zero.JniZero.c(this, a(jE), this.c, this.d);
        return jE;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long h(long j, int i) {
        org.jni_zero.JniZero.c(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final defpackage.akdm r() {
        return this.b.r();
    }

    @Override // defpackage.akex, defpackage.akdf
    public final boolean t(long j) {
        return this.b.t(j);
    }
}

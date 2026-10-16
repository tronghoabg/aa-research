package defpackage;

import androidx.car.app.model.Alert;
import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public final class akef extends akdz {
    private final int a;
    private final int c;
    private final int d;

    public akef(akcf akcfVar, akch akchVar, int i) {
        super(akcfVar, akchVar);
        this.a = i;
        if (akcfVar.d() + i > Integer.MIN_VALUE) {
            this.c = akcfVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (akcfVar.c() + i < Integer.MAX_VALUE) {
            this.d = akcfVar.c() + i;
        } else {
            this.d = Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.d;
    }

    @Override // defpackage.akdz, defpackage.akcf
    public final int d() {
        return this.c;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        long jE = super.e(j, i);
        JniZero.c(this, a(jE), this.c, this.d);
        return jE;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.akdz, defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.b.r();
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.b.t(j);
    }
}

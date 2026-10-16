package defpackage;

import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public class akeg extends akeh {
    private final int b;
    private final akcm c;

    public akeg(akch akchVar, akcm akcmVar, akcm akcmVar2) {
        super(akchVar, akcmVar);
        if (!akcmVar2.e()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int iC = (int) (akcmVar2.c() / this.a);
        this.b = iC;
        if (iC < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = akcmVar2;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.akeh, defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.c;
    }
}

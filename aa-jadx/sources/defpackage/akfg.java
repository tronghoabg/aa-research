package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akfg extends defpackage.akfh {
    private final int b;
    private final defpackage.akdm c;

    public akfg(defpackage.akdh akdhVar, defpackage.akdm akdmVar, defpackage.akdm akdmVar2) {
        super(akdhVar, akdmVar);
        if (!akdmVar2.e()) {
            throw new java.lang.IllegalArgumentException("Range duration field must be precise");
        }
        int iC = (int) (akdmVar2.c() / this.a);
        this.b = iC;
        if (iC < 2) {
            throw new java.lang.IllegalArgumentException("The effective range must be at least 2");
        }
        this.c = akdmVar2;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % ((long) this.b));
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % ((long) i)));
    }

    @Override // defpackage.akex, defpackage.akdf
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.akfh, defpackage.akex, defpackage.akdf
    public final long h(long j, int i) {
        org.jni_zero.JniZero.c(this, i, 0, c());
        return j + (((long) (i - a(j))) * this.a);
    }

    @Override // defpackage.akdf
    public final defpackage.akdm s() {
        return this.c;
    }
}

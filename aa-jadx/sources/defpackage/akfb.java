package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfb extends defpackage.akez {
    final int a;
    final defpackage.akdm c;
    final defpackage.akdm d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfb(defpackage.akdf akdfVar, defpackage.akdh akdhVar) {
        super(akdfVar, akdhVar);
        defpackage.akdm akdmVarS = akdfVar.s();
        defpackage.akdm akdmVarQ = akdfVar.q();
        if (akdmVarQ == null) {
            this.c = null;
        } else {
            this.c = new defpackage.akfk(akdmVarQ, ((defpackage.akdg) akdhVar).a);
        }
        this.d = akdmVarS;
        this.a = 100;
        int iD = akdfVar.d();
        int i = iD >= 0 ? iD / 100 : ((iD + 1) / 100) - 1;
        int iC = akdfVar.c();
        int i2 = iC >= 0 ? iC / 100 : ((iC + 1) / 100) - 1;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int c() {
        return this.f;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final int d() {
        return this.e;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.akex, defpackage.akdf
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long g(long j) {
        int iA = a(j) * 100;
        defpackage.akdf akdfVar = this.b;
        return akdfVar.g(akdfVar.h(j, iA));
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final long h(long j, int i) {
        org.jni_zero.JniZero.c(this, i, this.e, this.f);
        defpackage.akdf akdfVar = this.b;
        int iA = akdfVar.a(j);
        return akdfVar.h(j, (i * 100) + (iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99));
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final defpackage.akdm q() {
        return this.c;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final defpackage.akdm s() {
        defpackage.akdm akdmVar = this.d;
        return akdmVar != null ? akdmVar : super.s();
    }
}

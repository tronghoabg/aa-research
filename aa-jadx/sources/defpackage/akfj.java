package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfj extends defpackage.akez {
    final defpackage.akdm a;
    final defpackage.akdm c;

    public akfj(defpackage.akfb akfbVar, defpackage.akdm akdmVar, defpackage.akdh akdhVar) {
        super(akfbVar.b, akdhVar);
        int i = akfbVar.a;
        this.a = akdmVar;
        this.c = akfbVar.c;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99;
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final int c() {
        return 99;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final int d() {
        return 0;
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
        org.jni_zero.JniZero.c(this, i, 0, 99);
        defpackage.akdf akdfVar = this.b;
        int iA = akdfVar.a(j);
        return akdfVar.h(j, ((iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.akez, defpackage.akex, defpackage.akdf
    public final defpackage.akdm q() {
        return this.a;
    }

    @Override // defpackage.akez, defpackage.akdf
    public final defpackage.akdm s() {
        return this.c;
    }

    public akfj(defpackage.akfb akfbVar, defpackage.akdh akdhVar) {
        this(akfbVar, akfbVar.b.q(), akdhVar);
    }

    public akfj(defpackage.akdf akdfVar, defpackage.akdm akdmVar, defpackage.akdh akdhVar) {
        super(akdfVar, akdhVar);
        this.c = akdmVar;
        this.a = akdfVar.q();
    }
}

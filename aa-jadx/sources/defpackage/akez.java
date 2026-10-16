package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akez extends defpackage.akex {
    public final defpackage.akdf b;

    protected akez(defpackage.akdf akdfVar, defpackage.akdh akdhVar) {
        super(akdhVar);
        if (akdfVar == null) {
            throw new java.lang.IllegalArgumentException("The field must not be null");
        }
        if (!akdfVar.u()) {
            throw new java.lang.IllegalArgumentException("The field must be supported");
        }
        this.b = akdfVar;
    }

    @Override // defpackage.akex, defpackage.akdf
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.akex, defpackage.akdf
    public int c() {
        throw null;
    }

    @Override // defpackage.akdf
    public int d() {
        throw null;
    }

    @Override // defpackage.akex, defpackage.akdf
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.akex, defpackage.akdf
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.akex, defpackage.akdf
    public defpackage.akdm q() {
        return this.b.q();
    }

    @Override // defpackage.akdf
    public defpackage.akdm s() {
        return this.b.s();
    }

    @Override // defpackage.akdf
    public final void v() {
    }
}

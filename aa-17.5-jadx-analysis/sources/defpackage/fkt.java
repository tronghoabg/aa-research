package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fkt implements fkr {
    private final fkr a;
    private final Object b = new Object();

    public fkt(fkr fkrVar) {
        this.a = fkrVar;
    }

    @Override // defpackage.fkr
    public final List a(String str) {
        List listA;
        synchronized (this.b) {
            listA = this.a.a(str);
        }
        return listA;
    }

    @Override // defpackage.fkr
    public final boolean b(fny fnyVar) {
        boolean zB;
        synchronized (this.b) {
            zB = this.a.b(fnyVar);
        }
        return zB;
    }

    @Override // defpackage.fkr
    public final gjv c(fny fnyVar) {
        gjv gjvVarC;
        synchronized (this.b) {
            gjvVarC = this.a.c(fnyVar);
        }
        return gjvVarC;
    }

    @Override // defpackage.fkr
    public final gjv d(fny fnyVar) {
        gjv gjvVarD;
        synchronized (this.b) {
            gjvVarD = this.a.d(fnyVar);
        }
        return gjvVarD;
    }

    @Override // defpackage.fkr
    public final /* synthetic */ gjv e(fod fodVar) {
        return dsz.m(this, fodVar);
    }
}

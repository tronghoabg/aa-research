package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agdp {
    private agdp() {
    }

    public final defpackage.agdq convertFromFlags(boolean z, boolean z2, boolean z3) {
        if (z) {
            return defpackage.agdq.SEALED;
        }
        if (z2) {
            return defpackage.agdq.ABSTRACT;
        }
        return z3 ? defpackage.agdq.OPEN : defpackage.agdq.FINAL;
    }

    public /* synthetic */ agdp(defpackage.affu affuVar) {
        this();
    }
}

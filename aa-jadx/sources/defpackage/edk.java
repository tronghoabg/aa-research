package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class edk extends defpackage.edj {
    @Override // defpackage.edj, defpackage.ebr
    public final void d(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 16, 16);
    }

    @Override // defpackage.edj, defpackage.ebr
    public final void e(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.edj, defpackage.ebr
    public final boolean f() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }
}

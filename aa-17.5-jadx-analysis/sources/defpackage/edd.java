package defpackage;

/* loaded from: classes2.dex */
public final class edd extends edc {
    @Override // defpackage.edc, defpackage.ebj
    public final void c(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 16, 16);
    }

    @Override // defpackage.edc, defpackage.ebj
    public final void d(boolean z) {
        this.a.setSystemBarsAppearance(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.edc, defpackage.ebj
    public final boolean e() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }
}

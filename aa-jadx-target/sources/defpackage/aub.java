package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aub extends defpackage.aue {
    private final defpackage.asv a;

    public aub(defpackage.asv asvVar) {
        this.a = asvVar;
    }

    @Override // defpackage.aue
    public final int a(int i, int i2, defpackage.dlz dlzVar, defpackage.cux cuxVar, int i3) {
        int iA = this.a.a(cuxVar);
        if (iA == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iA;
        return dlzVar == defpackage.dlz.b ? (i - i2) - i4 : i4;
    }

    @Override // defpackage.aue
    public final java.lang.Integer b(defpackage.cux cuxVar) {
        return java.lang.Integer.valueOf(this.a.a(cuxVar));
    }

    @Override // defpackage.aue
    public final boolean c() {
        return true;
    }
}

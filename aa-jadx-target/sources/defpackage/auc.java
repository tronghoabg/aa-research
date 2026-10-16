package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class auc extends defpackage.aue {
    private final defpackage.cft a;

    public auc(defpackage.cft cftVar) {
        this.a = cftVar;
    }

    @Override // defpackage.aue
    public final int a(int i, int i2, defpackage.dlz dlzVar, defpackage.cux cuxVar, int i3) {
        return this.a.a(i2, i, dlzVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.auc) && defpackage.afga.f(this.a, ((defpackage.auc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ")";
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aud extends defpackage.aue {
    private final defpackage.cfy a;

    public aud(defpackage.cfy cfyVar) {
        this.a = cfyVar;
    }

    @Override // defpackage.aue
    public final int a(int i, int i2, defpackage.dlz dlzVar, defpackage.cux cuxVar, int i3) {
        return this.a.a(i2, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.aud) && defpackage.afga.f(this.a, ((defpackage.aud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ")";
    }
}

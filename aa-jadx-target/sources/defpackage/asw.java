package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class asw implements defpackage.awu {
    private final int a;
    private final java.lang.String b;
    private final defpackage.bwx c;
    private final defpackage.bwx d;

    public asw(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
        defpackage.dvl dvlVar = defpackage.dvl.a;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(dvlVar, bxvVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, bxvVar);
    }

    @Override // defpackage.awu
    public final int a(defpackage.dlo dloVar) {
        return e().e;
    }

    @Override // defpackage.awu
    public final int b(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return e().b;
    }

    @Override // defpackage.awu
    public final int c(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return e().d;
    }

    @Override // defpackage.awu
    public final int d(defpackage.dlo dloVar) {
        return e().c;
    }

    public final defpackage.dvl e() {
        return (defpackage.dvl) this.c.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.asw) && this.a == ((defpackage.asw) obj).a;
    }

    public final void f(boolean z) {
        this.d.b(java.lang.Boolean.valueOf(z));
    }

    public final void g(defpackage.edf edfVar) {
        int i = this.a;
        this.c.b(edfVar.f(i));
        f(edfVar.z(i));
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return this.b + "(" + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ")";
    }
}

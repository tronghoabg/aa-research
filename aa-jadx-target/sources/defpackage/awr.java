package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awr implements defpackage.awu {
    private final java.lang.String a;
    private final defpackage.bwx b;

    public awr(defpackage.ave aveVar, java.lang.String str) {
        this.a = str;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(aveVar, defpackage.bxv.c);
    }

    @Override // defpackage.awu
    public final int a(defpackage.dlo dloVar) {
        return e().d;
    }

    @Override // defpackage.awu
    public final int b(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return e().a;
    }

    @Override // defpackage.awu
    public final int c(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return e().c;
    }

    @Override // defpackage.awu
    public final int d(defpackage.dlo dloVar) {
        return e().b;
    }

    public final defpackage.ave e() {
        return (defpackage.ave) this.b.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.awr) {
            return defpackage.afga.f(e(), ((defpackage.awr) obj).e());
        }
        return false;
    }

    public final void f(defpackage.ave aveVar) {
        this.b.b(aveVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}

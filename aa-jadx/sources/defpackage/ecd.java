package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ecd {
    public final defpackage.dvl a;
    public final defpackage.dvl b;

    public ecd(android.view.WindowInsetsAnimation.Bounds bounds) {
        this.a = defpackage.dvl.f(bounds.getLowerBound());
        this.b = defpackage.dvl.f(bounds.getUpperBound());
    }

    public final java.lang.String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public ecd(defpackage.dvl dvlVar, defpackage.dvl dvlVar2) {
        this.a = dvlVar;
        this.b = dvlVar2;
    }
}

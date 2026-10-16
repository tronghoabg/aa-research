package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class byw {
    public static final void a(defpackage.bve bveVar, java.lang.Object obj, defpackage.affg affgVar) {
        if (bveVar.G()) {
            bveVar.i(obj, affgVar);
        }
    }

    public static final void b(defpackage.bve bveVar, defpackage.affc affcVar) {
        bveVar.i(defpackage.afbk.a, new defpackage.amc(affcVar, 16));
    }

    public static final void c(defpackage.bve bveVar, java.lang.Object obj, defpackage.affg affgVar) {
        if (bveVar.G() || !defpackage.afga.f(bveVar.g(), obj)) {
            bveVar.x(obj);
            bveVar.i(obj, affgVar);
        }
    }

    public static final void d(defpackage.bve bveVar, java.lang.Object obj, defpackage.affg affgVar) {
        boolean zG = bveVar.G();
        if (zG || !defpackage.afga.f(bveVar.g(), obj)) {
            bveVar.x(obj);
            if (zG) {
                return;
            }
            bveVar.i(obj, affgVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}

package defpackage;

@afdo
/* loaded from: classes.dex */
public final class byq {
    public static final void a(bux buxVar, Object obj, afeg afegVar) {
        if (buxVar.G()) {
            buxVar.i(obj, afegVar);
        }
    }

    public static final void b(bux buxVar, afec afecVar) {
        buxVar.i(afak.a, new alx(afecVar, 16));
    }

    public static final void c(bux buxVar, Object obj, afeg afegVar) {
        if (buxVar.G() || !affa.f(buxVar.g(), obj)) {
            buxVar.x(obj);
            buxVar.i(obj, afegVar);
        }
    }

    public static final void d(bux buxVar, Object obj, afeg afegVar) {
        boolean zG = buxVar.G();
        if (zG || !affa.f(buxVar.g(), obj)) {
            buxVar.x(obj);
            if (zG) {
                return;
            }
            buxVar.i(obj, afegVar);
        }
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}

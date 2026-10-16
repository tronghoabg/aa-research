package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
abstract class yld implements ylb {
    public final boolean equals(Object obj) {
        if (obj instanceof ylb) {
            ylb ylbVar = (ylb) obj;
            if (a() == ylbVar.a() && Objects.equals(b(), ylbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return a() ^ (objB == null ? 0 : objB.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}

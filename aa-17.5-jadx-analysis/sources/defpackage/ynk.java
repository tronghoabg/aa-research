package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
abstract class ynk implements yni {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yni) {
            yni yniVar = (yni) obj;
            if (Objects.equals(b(), yniVar.b()) && Objects.equals(a(), yniVar.a()) && Objects.equals(c(), yniVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(b(), a(), c());
    }

    public final String toString() {
        return "(" + b().toString() + "," + a().toString() + ")=" + c().toString();
    }
}

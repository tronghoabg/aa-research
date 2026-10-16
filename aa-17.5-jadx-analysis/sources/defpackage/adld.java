package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adld {
    public final adiw a;
    public final admc b;
    public final admf c;
    private final adlb d;

    public adld(admf admfVar, admc admcVar, adiw adiwVar, adlb adlbVar) {
        admfVar.getClass();
        this.c = admfVar;
        admcVar.getClass();
        this.b = admcVar;
        adiwVar.getClass();
        this.a = adiwVar;
        adlbVar.getClass();
        this.d = adlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            adld adldVar = (adld) obj;
            if (Objects.equals(this.a, adldVar.a) && Objects.equals(this.b, adldVar.b) && Objects.equals(this.c, adldVar.c) && Objects.equals(this.d, adldVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        adiw adiwVar = this.a;
        admc admcVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + admcVar.toString() + " callOptions=" + adiwVar.toString() + "]";
    }

    public adld() {
        throw null;
    }
}

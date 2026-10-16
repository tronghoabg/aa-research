package defpackage;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
final class dwe {
    final String a;
    final String b;
    final List c;

    public dwe(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwe)) {
            return false;
        }
        dwe dweVar = (dwe) obj;
        return Objects.equals(this.a, dweVar.a) && Objects.equals(this.b, dweVar.b) && Objects.equals(this.c, dweVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

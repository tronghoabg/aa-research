package defpackage;

import j$.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class iyg {
    public final String a;
    public final Set b;
    private final String c;

    public iyg(String str, String str2, Set set) {
        this.c = str;
        this.a = str2;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iyg)) {
            return false;
        }
        iyg iygVar = (iyg) obj;
        return Objects.equals(this.c, iygVar.c) && Objects.equals(this.a, iygVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.a);
    }
}

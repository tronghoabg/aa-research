package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class kra {
    public static final kra a = new kra("", true);
    public final String b;
    private final boolean c;

    public kra(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kra)) {
            return false;
        }
        kra kraVar = (kra) obj;
        return this.c == kraVar.c && this.b.equals(kraVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.c));
    }
}

package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class hox extends hne {
    public static final how b = new how();
    private final String c;
    private final Collection d;

    public hox(String str, Collection collection) {
        super(hnm.a);
        this.c = str;
        this.d = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hox)) {
            return false;
        }
        hox hoxVar = (hox) obj;
        return affa.f(this.c, hoxVar.c) && affa.f(this.d, hoxVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }
}

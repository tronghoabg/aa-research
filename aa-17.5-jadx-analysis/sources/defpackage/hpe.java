package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class hpe extends hne {
    public static final hpd b = new hpd();
    private final Collection c;

    public hpe(Collection collection) {
        super(hnm.k);
        this.c = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpe) && affa.f(this.c, ((hpe) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public hpe() {
        this(afbg.a);
    }
}

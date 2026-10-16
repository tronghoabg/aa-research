package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class hos extends hne {
    public static final hor b = new hor();
    private final Collection c;

    public hos(Collection collection) {
        super(hnm.e);
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
        return (obj instanceof hos) && affa.f(this.c, ((hos) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

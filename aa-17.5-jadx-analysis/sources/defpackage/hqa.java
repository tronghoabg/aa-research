package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class hqa extends hne {
    public static final hpz b = new hpz();
    private final List c;
    private final Collection d;

    public hqa(List list, Collection collection) {
        super(hnm.d);
        this.c = list;
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
        if (!(obj instanceof hqa)) {
            return false;
        }
        hqa hqaVar = (hqa) obj;
        return affa.f(this.c, hqaVar.c) && affa.f(this.d, hqaVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }
}

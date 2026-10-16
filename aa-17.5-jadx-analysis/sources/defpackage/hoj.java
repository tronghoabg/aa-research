package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class hoj extends hne {
    public static final hoi b = new hoi();
    private final hok c;
    private final boolean d;
    private final Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoj(hok hokVar, boolean z, Collection collection) {
        super(hnm.j);
        hokVar.getClass();
        this.c = hokVar;
        this.d = z;
        this.e = collection;
    }

    @Override // defpackage.hnj
    public final Collection a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoj)) {
            return false;
        }
        hoj hojVar = (hoj) obj;
        return this.c == hojVar.c && this.d == hojVar.d && affa.f(this.e, hojVar.e);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.f(this.d)) * 31) + this.e.hashCode();
    }
}

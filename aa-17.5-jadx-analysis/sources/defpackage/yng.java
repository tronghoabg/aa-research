package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public class yng<E> extends ymz<E> implements Set<E> {
    private static final long serialVersionUID = 0;

    public yng(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.ymz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }
}

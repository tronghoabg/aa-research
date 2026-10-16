package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yol<E> extends defpackage.yoe<E> implements java.util.Set<E> {
    private static final long serialVersionUID = 0;

    public yol(java.util.Set set, java.lang.Object obj) {
        super(set, obj);
    }

    @Override // defpackage.yoe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Set a() {
        return (java.util.Set) super.a();
    }

    public boolean equals(java.lang.Object obj) {
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

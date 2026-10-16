package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpa extends defpackage.hnl {
    public static final defpackage.hoz b = new defpackage.hoz();
    private final java.util.Collection c;

    public hpa(java.util.Collection collection) {
        super(defpackage.hnt.EmptyRenderInsightId);
        this.c = collection;
    }

    @Override // defpackage.hnq
    public final java.util.Collection a() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.hpa) && defpackage.afga.f(this.c, ((defpackage.hpa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

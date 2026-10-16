package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpm extends defpackage.hnl {
    public static final defpackage.hpl b = new defpackage.hpl();
    private final java.util.Collection c;

    public hpm(java.util.Collection collection) {
        super(defpackage.hnt.LoadingInsightId);
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
        return (obj instanceof defpackage.hpm) && defpackage.afga.f(this.c, ((defpackage.hpm) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public hpm() {
        this(defpackage.afcg.a);
    }
}

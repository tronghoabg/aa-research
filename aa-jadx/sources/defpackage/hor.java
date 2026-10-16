package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hor extends defpackage.hnl {
    public static final defpackage.hoq b = new defpackage.hoq();
    private final defpackage.hos c;
    private final boolean d;
    private final java.util.Collection e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hor(defpackage.hos hosVar, boolean z, java.util.Collection collection) {
        super(defpackage.hnt.ClientSignalInsightId);
        hosVar.getClass();
        this.c = hosVar;
        this.d = z;
        this.e = collection;
    }

    @Override // defpackage.hnq
    public final java.util.Collection a() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hor)) {
            return false;
        }
        defpackage.hor horVar = (defpackage.hor) obj;
        return this.c == horVar.c && this.d == horVar.d && defpackage.afga.f(this.e, horVar.e);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + defpackage.a.e(this.d)) * 31) + this.e.hashCode();
    }
}

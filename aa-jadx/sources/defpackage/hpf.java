package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hpf extends defpackage.hnl {
    public static final defpackage.hpe b = new defpackage.hpe();
    private final java.lang.String c;
    private final java.util.Collection d;

    public hpf(java.lang.String str, java.util.Collection collection) {
        super(defpackage.hnt.ExampleEmbeddedInsightId);
        this.c = str;
        this.d = collection;
    }

    @Override // defpackage.hnq
    public final java.util.Collection a() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hpf)) {
            return false;
        }
        defpackage.hpf hpfVar = (defpackage.hpf) obj;
        return defpackage.afga.f(this.c, hpfVar.c) && defpackage.afga.f(this.d, hpfVar.d);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }
}

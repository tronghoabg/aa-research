package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hnq {
    public final defpackage.hnt a;
    private final java.util.List b = defpackage.afce.a;

    public hnq(defpackage.hnt hntVar) {
        this.a = hntVar;
    }

    public abstract java.util.Collection a();

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "(id=" + this.a + ", originHints=[" + a().size() + " items redacted], tokens=" + this.b + ", redacted...)";
    }
}

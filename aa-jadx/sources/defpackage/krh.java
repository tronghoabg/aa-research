package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class krh {
    public static final defpackage.krh a = new defpackage.krh("", true);
    public final java.lang.String b;
    private final boolean c;

    public krh(java.lang.String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.krh)) {
            return false;
        }
        defpackage.krh krhVar = (defpackage.krh) obj;
        return this.c == krhVar.c && this.b.equals(krhVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.b, java.lang.Boolean.valueOf(this.c));
    }
}

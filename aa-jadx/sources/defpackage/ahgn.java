package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahgn {
    public static final defpackage.ahgm Companion = new defpackage.ahgm(null);
    private final java.lang.String signature;

    private ahgn(java.lang.String str) {
        this.signature = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ahgn) && defpackage.afga.f(this.signature, ((defpackage.ahgn) obj).signature);
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    public java.lang.String toString() {
        return "MemberSignature(signature=" + this.signature + ')';
    }

    public /* synthetic */ ahgn(java.lang.String str, defpackage.affu affuVar) {
        this(str);
    }
}

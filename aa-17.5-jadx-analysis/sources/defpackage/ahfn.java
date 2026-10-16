package defpackage;

/* loaded from: classes3.dex */
public final class ahfn {
    public static final ahfm Companion = new ahfm(null);
    private final String signature;

    private ahfn(String str) {
        this.signature = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahfn) && affa.f(this.signature, ((ahfn) obj).signature);
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.signature + ')';
    }

    public /* synthetic */ ahfn(String str, afeu afeuVar) {
        this(str);
    }
}

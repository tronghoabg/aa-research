package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aduz implements defpackage.aduj {
    private final defpackage.advc a;

    public aduz(defpackage.advc advcVar) {
        if (advcVar == null) {
            throw new java.lang.NullPointerException("Http2Error cannot be null for GOAWAY");
        }
        this.a = advcVar;
    }

    @Override // defpackage.aduj
    public final java.lang.String a() {
        return "GOAWAY ".concat(java.lang.String.valueOf(this.a.name()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((defpackage.aduz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

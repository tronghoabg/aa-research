package defpackage;

/* loaded from: classes3.dex */
public final class adtz implements adtj {
    private final aduc a;

    public adtz(aduc aducVar) {
        if (aducVar == null) {
            throw new NullPointerException("Http2Error cannot be null for GOAWAY");
        }
        this.a = aducVar;
    }

    @Override // defpackage.adtj
    public final String a() {
        return "GOAWAY ".concat(String.valueOf(this.a.name()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((adtz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

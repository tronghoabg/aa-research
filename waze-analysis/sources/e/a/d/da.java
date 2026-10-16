package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class da implements cf {

    /* renamed from: a, reason: collision with root package name */
    private final df f46776a;

    public da(df dfVar) {
        if (dfVar == null) {
            throw new NullPointerException("Http2Error cannot be null for GOAWAY");
        }
        this.f46776a = dfVar;
    }

    @Override // e.a.d.cf
    public final String a() {
        return "GOAWAY ".concat(String.valueOf(this.f46776a.name()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f46776a == ((da) obj).f46776a;
    }

    public final int hashCode() {
        return this.f46776a.hashCode();
    }
}

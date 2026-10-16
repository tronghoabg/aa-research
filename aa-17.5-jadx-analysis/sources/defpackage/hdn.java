package defpackage;

/* loaded from: classes2.dex */
public final class hdn extends hdy {
    public final hju a;
    private final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdn(hju hjuVar, boolean z) {
        super(z);
        hjuVar.getClass();
        this.a = hjuVar;
        this.b = z;
    }

    @Override // defpackage.hdy
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdn)) {
            return false;
        }
        hdn hdnVar = (hdn) obj;
        return affa.f(this.a, hdnVar.a) && this.b == hdnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.f(this.b);
    }

    public final String toString() {
        return "RowTrailingActionUiModel(action=" + this.a + ", isFocusable=" + this.b + ")";
    }
}

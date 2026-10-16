package defpackage;

/* loaded from: classes3.dex */
public final class agnm extends agng {
    private final int value;

    private agnm(int i) {
        super(null);
        this.value = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnm) && this.value == ((agnm) obj).value;
    }

    @Override // defpackage.agng
    public /* synthetic */ Object getValue() {
        return new afac(m82getValuepVg5ArA());
    }

    /* renamed from: getValue-pVg5ArA, reason: not valid java name */
    public int m82getValuepVg5ArA() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agnm(int i, afeu afeuVar) {
        this(i);
    }
}

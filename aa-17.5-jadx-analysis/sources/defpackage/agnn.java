package defpackage;

/* loaded from: classes3.dex */
public final class agnn extends agng {
    private final long value;

    private agnn(long j) {
        super(null);
        this.value = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnn) && this.value == ((agnn) obj).value;
    }

    @Override // defpackage.agng
    public /* synthetic */ Object getValue() {
        return new afae(m83getValuesVKNKU());
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public long m83getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return a.g(this.value);
    }

    public /* synthetic */ agnn(long j, afeu afeuVar) {
        this(j);
    }
}

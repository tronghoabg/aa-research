package defpackage;

/* loaded from: classes3.dex */
public final class agnl extends agng {
    private final byte value;

    private agnl(byte b) {
        super(null);
        this.value = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnl) && this.value == ((agnl) obj).value;
    }

    @Override // defpackage.agng
    public /* synthetic */ Object getValue() {
        return new afaa(m81getValuew2LRezQ());
    }

    /* renamed from: getValue-w2LRezQ, reason: not valid java name */
    public byte m81getValuew2LRezQ() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agnl(byte b, afeu afeuVar) {
        this(b);
    }
}

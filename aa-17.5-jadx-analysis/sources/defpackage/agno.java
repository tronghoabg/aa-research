package defpackage;

/* loaded from: classes3.dex */
public final class agno extends agng {
    private final short value;

    private agno(short s) {
        super(null);
        this.value = s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agno) && this.value == ((agno) obj).value;
    }

    @Override // defpackage.agng
    public /* synthetic */ Object getValue() {
        return new afah(m84getValueMh2AYeg());
    }

    /* renamed from: getValue-Mh2AYeg, reason: not valid java name */
    public short m84getValueMh2AYeg() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agno(short s, afeu afeuVar) {
        this(s);
    }
}

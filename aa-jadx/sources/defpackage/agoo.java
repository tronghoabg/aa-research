package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agoo extends defpackage.agog {
    private final short value;

    private agoo(short s) {
        super(null);
        this.value = s;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agoo) && this.value == ((defpackage.agoo) obj).value;
    }

    @Override // defpackage.agog
    public /* synthetic */ java.lang.Object getValue() {
        return new defpackage.afbh(m84getValueMh2AYeg());
    }

    /* JADX INFO: renamed from: getValue-Mh2AYeg, reason: not valid java name */
    public short m84getValueMh2AYeg() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agoo(short s, defpackage.affu affuVar) {
        this(s);
    }
}

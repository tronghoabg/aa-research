package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agol extends defpackage.agog {
    private final byte value;

    private agol(byte b) {
        super(null);
        this.value = b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agol) && this.value == ((defpackage.agol) obj).value;
    }

    @Override // defpackage.agog
    public /* synthetic */ java.lang.Object getValue() {
        return new defpackage.afba(m81getValuew2LRezQ());
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
    public byte m81getValuew2LRezQ() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agol(byte b, defpackage.affu affuVar) {
        this(b);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agom extends defpackage.agog {
    private final int value;

    private agom(int i) {
        super(null);
        this.value = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agom) && this.value == ((defpackage.agom) obj).value;
    }

    @Override // defpackage.agog
    public /* synthetic */ java.lang.Object getValue() {
        return new defpackage.afbc(m82getValuepVg5ArA());
    }

    /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name */
    public int m82getValuepVg5ArA() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public /* synthetic */ agom(int i, defpackage.affu affuVar) {
        this(i);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agoe extends defpackage.agog {
    private final int value;

    public agoe(int i) {
        super(null);
        this.value = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agoe) && this.value == ((defpackage.agoe) obj).value;
    }

    @Override // defpackage.agog
    public java.lang.Integer getValue() {
        return java.lang.Integer.valueOf(this.value);
    }

    public int hashCode() {
        return this.value;
    }
}

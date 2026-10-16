package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sjb extends defpackage.sja {
    private final long b;
    private final long c;

    public sjb(int i, int i2, int i3) {
        super(i);
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.sja, defpackage.six
    public final long a(long j) {
        return super.a(java.lang.Math.max(java.lang.Math.min(j, this.c), this.b));
    }

    @Override // defpackage.sja
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.sjb) && this.a == ((defpackage.sjb) obj).a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aahn extends defpackage.aahm {
    public final int e;
    public final int f;

    public aahn(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        super(str, i, i2, i3);
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.aahm
    public final java.lang.String toString() {
        return java.lang.String.format("TileKey[%s@x%s,y%s,z%s]:[W%s,H%s]px", this.a, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f));
    }
}

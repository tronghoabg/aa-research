package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uhe {
    final byte[] a;
    int b;
    final int c;
    final defpackage.aejy d = new defpackage.aejy(4);
    int e = 0;
    final /* synthetic */ defpackage.uhh f;

    public uhe(defpackage.uhh uhhVar, byte[] bArr, int i) {
        this.f = uhhVar;
        this.a = bArr;
        this.c = i;
    }

    public final void a(int i) {
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        byte[] bArr = this.a;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i2 + 2;
        this.b = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i2 + 3;
        this.b = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        this.b = i2 + 4;
        bArr[i5] = (byte) (i & 255);
    }
}

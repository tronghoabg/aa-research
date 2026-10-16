package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajml {
    public final int a;
    public final int b;
    public final java.lang.Object c;

    public ajml(byte[] bArr, byte[] bArr2) {
        if (!a(bArr)) {
            throw new java.lang.IllegalArgumentException("Unrecognized compressed texture format");
        }
        this.c = bArr;
        java.nio.ShortBuffer shortBufferAsShortBuffer = java.nio.ByteBuffer.wrap(bArr).asShortBuffer();
        this.b = shortBufferAsShortBuffer.get(4);
        this.a = shortBufferAsShortBuffer.get(5);
    }

    public static boolean a(byte[] bArr) {
        return bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 77 && bArr[3] == 32;
    }

    public ajml(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public ajml(int i, java.lang.String str, int i2) {
        this.a = i;
        this.c = str;
        this.b = i2;
    }

    public ajml(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.b = i;
        this.a = i2;
    }

    public ajml() {
        this.c = new defpackage.ajml[256];
        this.a = 0;
        this.b = 0;
    }
}

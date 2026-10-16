package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vuj {
    public int a;
    public java.lang.Object b;

    public vuj(char[] cArr) {
        this.b = new int[10];
    }

    public final defpackage.vuk a() {
        java.lang.Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new defpackage.vuk(i, (java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.b == null) {
            sb.append(" reportingProcessShortName");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int b(int i) {
        int i2 = this.a - 1;
        return i2 >= 0 ? ((int[]) this.b)[i2] : i;
    }

    public final int c() {
        java.lang.Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void d() {
        this.a = 0;
    }

    public final void e(int i) {
        java.lang.Object objCopyOf = this.b;
        int i2 = this.a;
        int[] iArr = (int[]) objCopyOf;
        int length = iArr.length;
        if (i2 >= length) {
            objCopyOf = java.util.Arrays.copyOf(iArr, length + length);
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        ((int[]) objCopyOf)[i3] = i;
    }

    public vuj(byte[] bArr, byte[] bArr2) {
        this.a = 1;
    }

    public vuj(byte[] bArr) {
        this.a = -1;
    }
}

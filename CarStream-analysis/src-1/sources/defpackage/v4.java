package defpackage;

import java.util.Hashtable;

/* loaded from: classes.dex */
public final class v4 {
    public m9 a;
    public int b;
    public m9 c;
    public m9 d;
    public byte[] e;
    public byte[] f;

    static {
        Hashtable hashtable = new Hashtable();
        hashtable.put("GOST3411", 32);
        hashtable.put("MD2", 16);
        hashtable.put("MD4", 64);
        hashtable.put("MD5", 64);
        hashtable.put("RIPEMD128", 64);
        hashtable.put("RIPEMD160", 64);
        hashtable.put("SHA-1", 64);
        hashtable.put("SHA-224", 64);
        hashtable.put("SHA-256", 64);
        hashtable.put("SHA-384", 128);
        hashtable.put("SHA-512", 128);
        hashtable.put("Tiger", 64);
        hashtable.put("Whirlpool", 64);
    }

    public final void a(byte[] bArr) {
        m9 m9Var = this.a;
        byte[] bArr2 = this.f;
        int i = this.b;
        m9Var.f(i, bArr2);
        m9 m9Var2 = this.d;
        if (m9Var2 != null) {
            m9Var.e(m9Var2);
            m9Var.k(bArr2, i, 32);
        } else {
            m9Var.k(bArr2, 0, bArr2.length);
        }
        m9Var.f(0, bArr);
        while (i < bArr2.length) {
            bArr2[i] = 0;
            i++;
        }
        m9 m9Var3 = this.c;
        if (m9Var3 != null) {
            m9Var.e(m9Var3);
        } else {
            byte[] bArr3 = this.e;
            m9Var.k(bArr3, 0, bArr3.length);
        }
    }

    public final void b(h1 h1Var) {
        byte[] bArr = this.f;
        byte[] bArr2 = this.e;
        m9 m9Var = this.a;
        m9Var.i();
        byte[] bArr3 = h1Var.a;
        int length = bArr3.length;
        int i = this.b;
        if (length > i) {
            m9Var.k(bArr3, 0, length);
            m9Var.f(0, bArr2);
            length = 32;
        } else {
            System.arraycopy(bArr3, 0, bArr2, 0, length);
        }
        while (length < bArr2.length) {
            bArr2[length] = 0;
            length++;
        }
        System.arraycopy(bArr2, 0, bArr, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ 92);
        }
        m9 m9Var2 = new m9(m9Var);
        m9Var2.l = new int[64];
        m9Var2.e(m9Var);
        this.d = m9Var2;
        m9Var2.k(bArr, 0, i);
        m9Var.k(bArr2, 0, bArr2.length);
        m9 m9Var3 = new m9(m9Var);
        m9Var3.l = new int[64];
        m9Var3.e(m9Var);
        this.c = m9Var3;
    }
}

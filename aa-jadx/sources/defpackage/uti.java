package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uti {
    private static final defpackage.ypg j = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/VertexDataBuilder");
    private static final java.nio.ByteBuffer k = java.nio.ByteBuffer.allocate(0);
    private static final defpackage.plz l = new defpackage.uth();
    public boolean b;
    public int c;
    public int e;
    public int g;
    private defpackage.aeze m;
    private defpackage.uuv o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private byte[] u;
    private int v;
    private float x;
    private int n = 0;
    private int z = 1;
    private int A = 1;
    private int B = 1;
    private int C = 1;
    public final byte[] d = new byte[8];
    public int f = 0;
    private int w = 0;
    public float h = 1.0f;
    private final defpackage.aejy y = new defpackage.aejy();
    public java.nio.ByteBuffer i = k;
    public java.lang.String a = "unused";

    public static defpackage.uti o(java.lang.String str, int i, int i2, boolean z, boolean z2, defpackage.uuv uuvVar) {
        defpackage.uti utiVar;
        int i3;
        defpackage.plz plzVar = l;
        synchronized (plzVar) {
            utiVar = (defpackage.uti) plzVar.b();
            utiVar.a = str;
            utiVar.g = i2;
            utiVar.t = z;
            utiVar.b = z2;
            utiVar.o = uuvVar;
            if ((i2 & 2) != 0) {
                i3 = 1;
            } else {
                i3 = (i2 & 1) != 0 ? 2 : 0;
            }
            utiVar.n = i3;
            utiVar.h = 1.0f;
            utiVar.x = 1.0f;
            utiVar.p = (i2 & 16) != 0;
            utiVar.r = (i2 & 8) != 0;
            utiVar.q = (i2 & 32) != 0;
            if ((i2 & 2176) == 0) {
                utiVar.z = 1;
            } else if ((i2 & 128) != 0) {
                utiVar.z = 2;
            } else {
                ((defpackage.ype) ((defpackage.ype) j.h()).ai((char) 9661)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 4352) == 0) {
                utiVar.A = 1;
            } else if ((i2 & 256) != 0) {
                utiVar.A = 2;
            } else {
                ((defpackage.ype) ((defpackage.ype) j.h()).ai((char) 9660)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 8704) == 0) {
                utiVar.B = 1;
            } else if ((i2 & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                utiVar.B = 2;
            } else {
                ((defpackage.ype) ((defpackage.ype) j.h()).ai((char) 9659)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 17408) == 0) {
                utiVar.C = 1;
            } else if ((i2 & 1024) != 0) {
                utiVar.C = 2;
            } else {
                ((defpackage.ype) ((defpackage.ype) j.h()).ai((char) 9658)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            int i4 = utiVar.g & 64;
            utiVar.s = i4 != 0;
            int i5 = utiVar.n;
            if (i5 == 1) {
                int i6 = i4 != 0 ? 2 : 4;
                utiVar.c = i6 + i6;
            } else if (i5 == 2) {
                utiVar.c = (i4 != 0 ? 2 : 3) * 4;
            }
            if (utiVar.r) {
                utiVar.c += 16;
            } else if (utiVar.q) {
                utiVar.c += 4;
            }
            if (utiVar.p) {
                utiVar.c += 8;
            }
            int i7 = utiVar.c;
            utiVar.v = i7;
            if (utiVar.z == 2) {
                i7 += 4;
                utiVar.c = i7;
            }
            if (utiVar.A == 2) {
                i7 += 4;
                utiVar.c = i7;
            }
            utiVar.e = i7;
            if (utiVar.B == 2) {
                i7 += 4;
                utiVar.c = i7;
            }
            if (utiVar.C == 2) {
                i7 += 4;
                utiVar.c = i7;
            }
            utiVar.u = new byte[i7];
            if (z && utiVar.m == null) {
                utiVar.m = new defpackage.aeze(i / 2);
            }
            utiVar.m(i);
        }
        return utiVar;
    }

    private final float p(float f) {
        return f * this.x;
    }

    public final int a() {
        return this.y.b;
    }

    public final defpackage.uxp b(int i) {
        short[] sArr;
        i();
        byte[] bArrArray = this.i.array();
        java.lang.String str = this.a;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.c;
        if (this.t) {
            defpackage.aeze aezeVar = this.m;
            aezeVar.getClass();
            short[] sArr2 = new short[aezeVar.b];
            java.lang.System.arraycopy(aezeVar.a, 0, sArr2, 0, aezeVar.b);
            sArr = sArr2;
        } else {
            sArr = null;
        }
        defpackage.uxp uxpVar = new defpackage.uxp(str, new defpackage.uxl(bArrArray, i2, i4), i3, i, sArr, this.w, this.o);
        g();
        return uxpVar;
    }

    public final void c(java.nio.ByteBuffer byteBuffer, float f, float f2, float f3) {
        if (this.n != 1) {
            byteBuffer.putFloat(p(f));
            byteBuffer.putFloat(p(f2));
            if (this.s) {
                return;
            }
            byteBuffer.putFloat(p(f3));
            return;
        }
        byteBuffer.putShort((short) f);
        byteBuffer.putShort((short) f2);
        if (this.s) {
            return;
        }
        byteBuffer.putShort((short) f3);
        byteBuffer.putShort((short) 0);
    }

    public final void d(int i, int i2, int i3) {
        defpackage.aeze aezeVar = this.m;
        aezeVar.getClass();
        aezeVar.i((short) i);
        aezeVar.i((short) i2);
        aezeVar.i((short) i3);
        this.w += 3;
    }

    public final void e(float f, float f2, float f3, int i, int i2) {
        this.i.putFloat(f);
        this.i.putFloat(f2);
        this.i.putFloat(f3);
        this.i.putFloat(i);
        this.i.putFloat(i2);
        this.f++;
    }

    public final void f(defpackage.tpm tpmVar, float f, float f2) {
        int i = this.n;
        java.nio.ByteBuffer byteBuffer = this.i;
        if (i == 1) {
            byteBuffer.putShort((short) tpmVar.a);
            this.i.putShort((short) tpmVar.b);
            if (!this.s) {
                this.i.putShort((short) tpmVar.c);
                this.i.putShort((short) 0);
            }
        } else {
            byteBuffer.putFloat(tpmVar.a);
            this.i.putFloat(tpmVar.b);
            if (!this.s) {
                this.i.putFloat(tpmVar.c);
            }
        }
        this.i.putFloat(f);
        this.i.putFloat(f2);
        this.f++;
    }

    public final void g() {
        defpackage.aeze aezeVar = this.m;
        if (aezeVar != null) {
            aezeVar.clear();
        }
        this.w = 0;
        this.f = 0;
        this.y.clear();
        this.i = k;
    }

    public final void h(byte[] bArr) {
        this.i.put(bArr);
        this.f += bArr.length / this.c;
        i();
    }

    public final void i() {
        this.y.c(this.f);
    }

    public final void j() {
        this.i.position(this.i.position() - this.c);
        this.i.get(this.u);
        this.i.put(this.u);
        this.f++;
    }

    public final void k() {
        g();
        defpackage.plz plzVar = l;
        synchronized (plzVar) {
            plzVar.g(this);
        }
    }

    public final void l(int i, byte[] bArr) {
        int i2 = this.v + 2;
        while (i2 < bArr.length) {
            bArr[i2] = (byte) i;
            i2 += this.c;
        }
    }

    public final boolean m(int i) {
        java.nio.ByteBuffer byteBuffer = this.i;
        byteBuffer.getClass();
        int iCapacity = byteBuffer.capacity();
        int i2 = this.c;
        if (iCapacity == 0) {
            this.i = java.nio.ByteBuffer.allocate(i2 * i).order(java.nio.ByteOrder.nativeOrder());
            return true;
        }
        if (i2 * i <= byteBuffer.capacity()) {
            return true;
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(this.c * i).order(java.nio.ByteOrder.nativeOrder());
        if (byteBuffer.position() != 0) {
            byteBuffer.rewind();
            byteBufferOrder.put(byteBuffer);
        }
        this.i = byteBufferOrder;
        return false;
    }

    public final byte[] n(int i) {
        int iM = i == 0 ? 0 : this.y.m(i - 1);
        int iM2 = this.y.m(i);
        int i2 = this.c;
        int i3 = i2 * iM;
        byte[] bArr = new byte[i2 * (iM2 - iM)];
        int iPosition = this.i.position();
        this.i.position(i3);
        this.i.get(bArr);
        this.i.position(iPosition);
        return bArr;
    }
}

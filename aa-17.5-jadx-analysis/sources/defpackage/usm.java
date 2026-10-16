package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class usm {
    private static final yob j = yob.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/VertexDataBuilder");
    private static final ByteBuffer k = ByteBuffer.allocate(0);
    private static final plf l = new usl();
    public boolean b;
    public int c;
    public int e;
    public int g;
    private aeye m;
    private utz o;
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
    private final aeiy y = new aeiy();
    public ByteBuffer i = k;
    public String a = "unused";

    public static usm o(String str, int i, int i2, boolean z, boolean z2, utz utzVar) {
        usm usmVar;
        plf plfVar = l;
        synchronized (plfVar) {
            usmVar = (usm) plfVar.b();
            usmVar.a = str;
            usmVar.g = i2;
            usmVar.t = z;
            usmVar.b = z2;
            usmVar.o = utzVar;
            usmVar.n = (i2 & 2) != 0 ? 1 : (i2 & 1) != 0 ? 2 : 0;
            usmVar.h = 1.0f;
            usmVar.x = 1.0f;
            usmVar.p = (i2 & 16) != 0;
            usmVar.r = (i2 & 8) != 0;
            usmVar.q = (i2 & 32) != 0;
            if ((i2 & 2176) == 0) {
                usmVar.z = 1;
            } else if ((i2 & 128) != 0) {
                usmVar.z = 2;
            } else {
                ((ynz) ((ynz) j.h()).ai((char) 9633)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 4352) == 0) {
                usmVar.A = 1;
            } else if ((i2 & 256) != 0) {
                usmVar.A = 2;
            } else {
                ((ynz) ((ynz) j.h()).ai((char) 9632)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 8704) == 0) {
                usmVar.B = 1;
            } else if ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                usmVar.B = 2;
            } else {
                ((ynz) ((ynz) j.h()).ai((char) 9631)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            if ((i2 & 17408) == 0) {
                usmVar.C = 1;
            } else if ((i2 & 1024) != 0) {
                usmVar.C = 2;
            } else {
                ((ynz) ((ynz) j.h()).ai((char) 9630)).u("JavaVertexDataBuilder only supports byte user data.");
            }
            int i3 = usmVar.g & 64;
            usmVar.s = i3 != 0;
            int i4 = usmVar.n;
            if (i4 == 1) {
                int i5 = i3 != 0 ? 2 : 4;
                usmVar.c = i5 + i5;
            } else if (i4 == 2) {
                usmVar.c = (i3 != 0 ? 2 : 3) * 4;
            }
            if (usmVar.r) {
                usmVar.c += 16;
            } else if (usmVar.q) {
                usmVar.c += 4;
            }
            if (usmVar.p) {
                usmVar.c += 8;
            }
            int i6 = usmVar.c;
            usmVar.v = i6;
            if (usmVar.z == 2) {
                i6 += 4;
                usmVar.c = i6;
            }
            if (usmVar.A == 2) {
                i6 += 4;
                usmVar.c = i6;
            }
            usmVar.e = i6;
            if (usmVar.B == 2) {
                i6 += 4;
                usmVar.c = i6;
            }
            if (usmVar.C == 2) {
                i6 += 4;
                usmVar.c = i6;
            }
            usmVar.u = new byte[i6];
            if (z && usmVar.m == null) {
                usmVar.m = new aeye(i / 2);
            }
            usmVar.m(i);
        }
        return usmVar;
    }

    private final float p(float f) {
        return f * this.x;
    }

    public final int a() {
        return this.y.b;
    }

    public final uws b(int i) {
        short[] sArr;
        i();
        byte[] bArrArray = this.i.array();
        String str = this.a;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.c;
        if (this.t) {
            aeye aeyeVar = this.m;
            aeyeVar.getClass();
            short[] sArr2 = new short[aeyeVar.b];
            System.arraycopy(aeyeVar.a, 0, sArr2, 0, aeyeVar.b);
            sArr = sArr2;
        } else {
            sArr = null;
        }
        uws uwsVar = new uws(str, new uwo(bArrArray, i2, i4), i3, i, sArr, this.w, this.o);
        g();
        return uwsVar;
    }

    public final void c(ByteBuffer byteBuffer, float f, float f2, float f3) {
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
        aeye aeyeVar = this.m;
        aeyeVar.getClass();
        aeyeVar.i((short) i);
        aeyeVar.i((short) i2);
        aeyeVar.i((short) i3);
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

    public final void f(too tooVar, float f, float f2) {
        int i = this.n;
        ByteBuffer byteBuffer = this.i;
        if (i == 1) {
            byteBuffer.putShort((short) tooVar.a);
            this.i.putShort((short) tooVar.b);
            if (!this.s) {
                this.i.putShort((short) tooVar.c);
                this.i.putShort((short) 0);
            }
        } else {
            byteBuffer.putFloat(tooVar.a);
            this.i.putFloat(tooVar.b);
            if (!this.s) {
                this.i.putFloat(tooVar.c);
            }
        }
        this.i.putFloat(f);
        this.i.putFloat(f2);
        this.f++;
    }

    public final void g() {
        aeye aeyeVar = this.m;
        if (aeyeVar != null) {
            aeyeVar.clear();
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
        plf plfVar = l;
        synchronized (plfVar) {
            plfVar.g(this);
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
        ByteBuffer byteBuffer = this.i;
        byteBuffer.getClass();
        int iCapacity = byteBuffer.capacity();
        int i2 = this.c;
        if (iCapacity == 0) {
            this.i = ByteBuffer.allocate(i2 * i).order(ByteOrder.nativeOrder());
            return true;
        }
        if (i2 * i <= byteBuffer.capacity()) {
            return true;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.c * i).order(ByteOrder.nativeOrder());
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

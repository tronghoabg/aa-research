package defpackage;

import android.opengl.GLES20;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class uws {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/VertexData");
    private short[] A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    public final String b;
    public uud c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    final int m;
    public uue n;
    public uue o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    private utz x;
    private int y;
    private uwr z;

    public uws(String str, uwr uwrVar, int i, int i2, short[] sArr, int i3, utz utzVar) {
        int i4 = 0;
        this.y = 0;
        uue uueVar = uue.a;
        this.B = -1;
        this.C = -1;
        this.D = false;
        this.E = false;
        this.b = str;
        this.z = uwrVar;
        int i5 = uwrVar.b;
        this.k = i5;
        this.m = i;
        this.l = i2;
        int i6 = uwrVar.c;
        int i7 = i5 * i6;
        this.p = i6;
        this.n = uueVar;
        this.A = sArr;
        this.d = i3;
        this.o = uueVar;
        int i8 = i3 + i3;
        this.q = i7 + i8;
        boolean z = (i & 2) != 0;
        this.f = z;
        int i9 = i & 1;
        this.e = 1 == i9;
        boolean z2 = (i & 8) != 0;
        this.h = z2;
        boolean z3 = (i & 32) != 0;
        this.i = z3;
        boolean z4 = (i & 16) != 0;
        this.g = z4;
        int i10 = i & 64;
        this.j = i10 != 0;
        if (i9 != 0) {
            i4 = (i10 == 0 ? 3 : 2) * 4;
        } else if (z) {
            int i11 = i10 != 0 ? 2 : 4;
            i4 = i11 + i11;
        }
        if (z2) {
            this.s = i4;
            i4 += 16;
        } else if (z3) {
            this.s = i4;
            i4 += 4;
        } else {
            this.s = -1;
        }
        if (z4) {
            this.r = i4;
            i4 += 8;
        } else {
            this.r = -1;
        }
        if ((i & 2176) != 0) {
            this.t = i4;
            i4 += 4;
        } else {
            this.t = -1;
        }
        if ((i & 4352) != 0) {
            this.u = i4;
            i4 += 4;
        } else {
            this.u = -1;
        }
        if ((i & 8704) != 0) {
            this.v = i4;
            i4 += 4;
        } else {
            this.v = -1;
        }
        if ((i & 17408) != 0) {
            this.w = i4;
            i4 += 4;
        } else {
            this.w = -1;
        }
        if (i4 != i6) {
            throw new IllegalArgumentException("Mismatched vertex format and vertex size bytes");
        }
        if (utzVar != null) {
            this.x = utzVar;
            this.B = utzVar.c(34962, i7);
            if (sArr != null) {
                this.C = utzVar.c(34963, i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(int r9) {
        /*
            r0 = r9 & 1
            r1 = r9 & 64
            r2 = 8
            r3 = 4
            r4 = 0
            if (r0 == 0) goto L11
            if (r1 == 0) goto Le
        Lc:
            r0 = r2
            goto L1a
        Le:
            r0 = 12
            goto L1a
        L11:
            r0 = r9 & 2
            if (r0 == 0) goto L19
            if (r1 == 0) goto Lc
            r0 = r3
            goto L1a
        L19:
            r0 = r4
        L1a:
            r1 = r9 & 8
            if (r1 == 0) goto L21
            r1 = 16
            goto L22
        L21:
            r1 = r4
        L22:
            r5 = r9 & 32
            if (r5 == 0) goto L28
            r5 = r3
            goto L29
        L28:
            r5 = r4
        L29:
            r6 = r9 & 16
            if (r6 == 0) goto L2e
            goto L2f
        L2e:
            r2 = r4
        L2f:
            r6 = r9 & 2176(0x880, float:3.049E-42)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L35:
            r6 = r4
        L36:
            r7 = r9 & 4352(0x1100, float:6.098E-42)
            if (r7 == 0) goto L3c
            r7 = r3
            goto L3d
        L3c:
            r7 = r4
        L3d:
            r8 = r9 & 8704(0x2200, float:1.2197E-41)
            if (r8 == 0) goto L43
            r8 = r3
            goto L44
        L43:
            r8 = r4
        L44:
            r9 = r9 & 17408(0x4400, float:2.4394E-41)
            if (r9 == 0) goto L49
            goto L4a
        L49:
            r3 = r4
        L4a:
            int r0 = r0 + r1
            int r0 = r0 + r5
            int r0 = r0 + r2
            int r0 = r0 + r6
            int r0 = r0 + r7
            int r0 = r0 + r8
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uws.d(int):int");
    }

    public final void a(uud uudVar) {
        int i = this.y + 1;
        this.y = i;
        if (i == 1) {
            this.c = uudVar;
            if (this.E && this.D) {
                return;
            }
            this.E = true;
            utz utzVar = this.x;
            uwr uwrVar = this.z;
            if (utzVar == null) {
                short[] sArr = this.A;
                if (uwrVar != null) {
                    this.n = uwrVar.a(uudVar, this.b);
                }
                if (sArr != null) {
                    uue uueVarO = uudVar.O();
                    this.o = uueVarO;
                    uudVar.e(uueVarO);
                    uudVar.G(sArr, sArr.length, 35044);
                }
            } else {
                short[] sArr2 = this.A;
                if (uwrVar != null) {
                    this.n = uwrVar.b(uudVar, this.b, utzVar, this.B);
                }
                if (sArr2 != null) {
                    int i2 = this.C;
                    String str = this.b;
                    int length = sArr2.length;
                    int i3 = length + length;
                    uue uueVarD = ((uug) utzVar).d(i2, uudVar, str, i3);
                    int iF = uug.f(i2);
                    if (iF == 0) {
                        throw null;
                    }
                    GLES20.glBufferSubData(iF, uueVarD.f, i3, uudVar.D(sArr2, length));
                    this.o = uueVarD;
                }
            }
            if (this.D) {
                this.z = null;
                this.A = null;
            }
        }
    }

    public final void b(boolean z) {
        woy.Z(this.y > 0);
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            utz utzVar = this.x;
            if (utzVar == null) {
                if (!z) {
                    uud uudVar = this.c;
                    uudVar.getClass();
                    if (this.n.b()) {
                        uudVar.h(this.n);
                    }
                    if (this.o.b()) {
                        uudVar.h(this.o);
                    }
                }
            } else if (z) {
                utzVar.b();
            } else {
                uud uudVar2 = this.c;
                uudVar2.getClass();
                if (this.n.b()) {
                    utzVar.a(uudVar2, this.n);
                }
                if (this.o.b()) {
                    utzVar.a(uudVar2, this.o);
                }
            }
            uue uueVar = uue.a;
            this.n = uueVar;
            this.o = uueVar;
            this.c = null;
        }
    }

    public final void c(boolean z) {
        woy.Z(!this.E);
        this.D = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uws)) {
            return false;
        }
        uws uwsVar = (uws) obj;
        return this.n == uwsVar.n && this.o == uwsVar.o;
    }

    public final int hashCode() {
        return Objects.hash(this.n, this.o);
    }

    public uws(String str, float[] fArr, int i, utz utzVar) {
        this(str, new uwp(fArr, (fArr.length * 4) / d(i), d(i)), i, 5, (short[]) null, 0, utzVar);
    }

    public uws(String str, int[] iArr, int i, int i2, int i3, int i4, utz utzVar) {
        this(str, new uwq(iArr, i, i4), i2, i3, (short[]) null, 0, utzVar);
    }
}

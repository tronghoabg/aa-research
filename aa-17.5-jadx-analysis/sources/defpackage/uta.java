package defpackage;

import android.opengl.GLES20;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class uta {
    private static final yob c = yob.c("com/google/android/libraries/geo/mapcore/renderer/ChunkBufferManager");
    final ArrayDeque a;
    utf b;
    private final String d;
    private int e;
    private final int f;
    private final xwx g;
    private final uud h;
    private final uvw i;
    private int j = 0;
    private int k = 0;
    private uue l;
    private uue m;
    private final Map n;
    private uwg o;
    private float[] p;
    private int q;
    private final uvg r;

    public uta(int i, int i2, xwx xwxVar, uud uudVar, uvw uvwVar, uvg uvgVar, String str) {
        uue uueVar = uue.a;
        this.l = uueVar;
        this.m = uueVar;
        this.a = new ArrayDeque();
        this.o = null;
        this.b = null;
        this.q = 1;
        this.n = new yw();
        this.e = i;
        this.f = i2;
        this.g = xwxVar;
        this.h = uudVar;
        this.i = uvwVar;
        this.r = uvgVar;
        this.d = str;
        this.p = new float[i * i2];
    }

    static final boolean d() {
        int iGlGetError;
        boolean z = false;
        if (uuc.a().g) {
            do {
                iGlGetError = GLES20.glGetError();
                if (iGlGetError != 0) {
                    if (iGlGetError != 1285) {
                        switch (iGlGetError) {
                            case 1280:
                                ((ynz) ((ynz) c.g()).ai((char) 9645)).u("glBufferData returned GL_INVALID_ENUM.");
                                break;
                            case 1281:
                                ((ynz) ((ynz) c.g()).ai((char) 9646)).u("glBufferData returned GL_INVALID_VALUE");
                                break;
                            case 1282:
                                ((ynz) ((ynz) c.g()).ai((char) 9647)).u("glBufferData returned GL_INVALID_OPERATION");
                                break;
                            default:
                                ((ynz) ((ynz) c.g()).ai(9644)).w("glBufferData returned unexpected error code: %d", iGlGetError);
                                break;
                        }
                    } else {
                        ((ynz) ((ynz) c.g()).ai((char) 9648)).u("glBufferData returned GL_OUT_OF_MEMORY");
                    }
                    z = true;
                }
            } while (iGlGetError != 0);
        }
        return z;
    }

    private final void g() {
        for (utb utbVar : this.n.values()) {
            if (utbVar != null) {
                utbVar.s();
            }
        }
    }

    private final void h() {
        if (this.j == this.k) {
            return;
        }
        utf utfVar = this.b;
        utfVar.getClass();
        Map map = this.n;
        Integer numValueOf = Integer.valueOf(utfVar.b());
        utb utbVar = (utb) map.get(numValueOf);
        if (utbVar == null) {
            utbVar = (utb) this.g.a(utfVar);
            utbVar.A(true);
            this.r.d(utbVar, null);
            map.put(numValueOf, utbVar);
        }
        int i = this.j;
        int i2 = this.f;
        int i3 = (i / i2) / 4;
        int i4 = ((this.k - i) / i2) / 4;
        ArrayDeque arrayDeque = this.a;
        adut adutVar = arrayDeque.isEmpty() ? new adut() : (adut) arrayDeque.pop();
        adutVar.c = this.o;
        adutVar.a = i4 * 6;
        adutVar.b = i3 * 12;
        utbVar.q().add(adutVar);
        this.j = this.k;
    }

    public final void a() {
        for (utb utbVar : this.n.values()) {
            if (utbVar != null) {
                this.a.addAll(utbVar.q());
                utbVar.q().clear();
            }
        }
        this.o = null;
        this.b = null;
        this.j = 0;
        this.k = 0;
    }

    public final void b() {
        int iGlGetError;
        int iGlGetError2;
        h();
        if (uuc.a().g) {
            boolean z = false;
            do {
                iGlGetError2 = GLES20.glGetError();
                if (iGlGetError2 != 0) {
                    ((ynz) ((ynz) c.g()).ai(9649)).w("Unexpected error code before commit(): %d", iGlGetError2);
                    z = true;
                }
            } while (iGlGetError2 != 0);
            if (z) {
                g();
                return;
            }
        }
        if (!this.l.b()) {
            woy.Z(!this.l.b());
            woy.Z(!this.m.b());
            int i = this.e / 4;
            int i2 = i * 6;
            short[] sArr = new short[i2];
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 6;
                int i5 = i3 * 4;
                sArr[i4] = (short) i5;
                short s = (short) (i5 + 3);
                sArr[i4 + 1] = s;
                short s2 = (short) (i5 + 1);
                sArr[i4 + 2] = s2;
                sArr[i4 + 3] = s2;
                sArr[i4 + 4] = s;
                sArr[i4 + 5] = (short) (i5 + 2);
            }
            uud uudVar = this.h;
            uue uueVarO = uudVar.O();
            this.m = uueVarO;
            uudVar.e(uueVarO);
            uudVar.G(sArr, i2, 35048);
            boolean zD = d();
            int i6 = this.e * this.f * 4;
            uue uueVarQ = uudVar.Q();
            this.l = uueVarQ;
            uudVar.g(uueVarQ);
            uudVar.o(34962, i6, null, 35048);
            if (d() | zD) {
                g();
                return;
            }
        }
        uud uudVar2 = this.h;
        uudVar2.g(this.l);
        if (uuc.a().g) {
            boolean z2 = false;
            do {
                iGlGetError = GLES20.glGetError();
                if (iGlGetError != 0) {
                    if (iGlGetError != 1285) {
                        switch (iGlGetError) {
                            case 1280:
                                ((ynz) ((ynz) c.g()).ai((char) 9640)).u("glBindBuffer returned GL_INVALID_ENUM.");
                                break;
                            case 1281:
                                ((ynz) ((ynz) c.g()).ai((char) 9641)).u("glBindBuffer returned GL_INVALID_VALUE");
                                break;
                            case 1282:
                                ((ynz) ((ynz) c.g()).ai((char) 9642)).u("glBindBuffer returned GL_INVALID_OPERATION");
                                break;
                            default:
                                ((ynz) ((ynz) c.g()).ai(9639)).w("glBindBuffer returned unexpected error code: %d", iGlGetError);
                                break;
                        }
                    } else {
                        ((ynz) ((ynz) c.g()).ai((char) 9643)).u("glBindBuffer returned GL_OUT_OF_MEMORY");
                    }
                    z2 = true;
                }
            } while (iGlGetError != 0);
            if (z2) {
                g();
                return;
            }
        }
        uudVar2.H(34962, 0, this.p, this.k);
        for (utb utbVar : this.n.values()) {
            if (utbVar != null) {
                utbVar.r(this.l, this.m, this.i);
            }
        }
    }

    public final void c() {
        for (uth uthVar : this.n.values()) {
            if (uthVar != null) {
                this.r.i(uthVar);
            }
        }
    }

    public final ajlp e(uwg uwgVar, utf utfVar, int i) {
        woy.Z(this.q == 1);
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.k;
        if ((i2 * i3) - i4 < i3 * 4 * i) {
            int i5 = (i4 / i3) + (i * 4);
            if (i5 > 65536) {
                ((ynz) c.a(uys.a).ai((char) 9650)).u("Too many labels, can't make label buffer any larger!");
                return null;
            }
            int iMin = Math.min(Math.max(i2 + i2, i5), 65536);
            float[] fArrCopyOf = Arrays.copyOf(this.p, i3 * iMin);
            this.e = iMin;
            this.p = fArrCopyOf;
            if (this.l.b()) {
                this.h.h(this.l);
                this.l = uue.a;
            }
            if (this.m.b()) {
                this.h.h(this.m);
                this.m = uue.a;
            }
        }
        this.q = 2;
        if (this.o != uwgVar || this.b != utfVar) {
            h();
        }
        this.o = uwgVar;
        this.b = utfVar;
        return new ajlp(this.p, this.k);
    }

    public final void f(ajlp ajlpVar) {
        woy.Z(this.q == 2);
        this.q = 1;
        woy.O(ajlpVar.a >= this.k, "Attempted to move ChunkBufferManager cursor backwards");
        woy.O(ajlpVar.a <= this.p.length, "Attempted to move ChunkBufferManager cursor out of bounds");
        this.k = ajlpVar.a;
    }
}

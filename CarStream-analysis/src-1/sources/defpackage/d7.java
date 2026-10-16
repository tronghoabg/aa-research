package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.carstream.tech.launcher.CarBarArt;
import com.carstream.tech.mirror.MirrorServer;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class d7 {
    public volatile int A;
    public volatile int a;
    public volatile int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public FloatBuffer m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public volatile Bitmap s;
    public int t;
    public long u;
    public boolean v;
    public long w;
    public int x;
    public int y;
    public int z;

    public static int b(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException(ad.g("shader: ", GLES20.glGetShaderInfoLog(iGlCreateShader)));
    }

    public static int n() {
        int iN = MirrorServer.n();
        if (iN <= 0 || MirrorServer.i <= 0 || -1 != MirrorServer.i) {
            return 0;
        }
        return iN;
    }

    public static int r(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return iArr[0];
    }

    public final int a() {
        int iN = MirrorServer.n();
        if (iN <= 0 || MirrorServer.i <= 0 || -1 == MirrorServer.i) {
            iN = this.a;
        }
        return Math.max(c(240.0f), Math.min((iN - n()) - c(48.0f), c(620.0f)));
    }

    public final int c(float f) {
        return Math.round(f * this.c);
    }

    public final void d(int i) {
        float f;
        int iF;
        int[] iArrG;
        try {
            g();
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glUseProgram(this.d);
            GLES20.glUniform1i(this.g, 0);
            GLES20.glActiveTexture(33984);
            if (this.A < 100) {
                i(0.0f, 0.0f, this.a, this.b, 0.0f, 0.0f, 0.0f, ((100 - this.A) / 100.0f) * 0.85f);
            }
            if (i > 0) {
                float f2 = i;
                float fMax = Math.max(2, c(3.0f));
                i(f2 - (fMax / 2.0f), 0.0f, fMax, this.b, 0.0f, 0.0f, 0.0f, 0.55f);
                float fC = c(4.0f);
                float fC2 = c(46.0f);
                i(f2 - (fC / 2.0f), (this.b - fC2) / 2.0f, fC, fC2, 1.0f, 1.0f, 1.0f, 0.85f);
            } else {
                float fC3 = c(4.0f);
                float fC4 = c(56.0f);
                i(this.a - c(7.0f), (this.b - fC4) / 2.0f, fC3, fC4, 1.0f, 1.0f, 1.0f, 0.28f);
            }
            e();
            if (MirrorServer.i() && (iF = f()) > 0) {
                int iC = (c(4.0f) * 2) + c(30.0f);
                for (int i2 = 0; i2 < 4; i2++) {
                    if (MirrorServer.T(i2) > 0 && (iArrG = MirrorServer.g(i2)) != null) {
                        float f3 = (iArrG[2] / 2.0f) + iArrG[0];
                        float f4 = iC;
                        float f5 = f4 / 2.0f;
                        GLES20.glUniform4f(this.h, 1.0f, 1.0f, 1.0f, 1.0f);
                        GLES20.glBindTexture(3553, iF);
                        o(f3 - f5, iArrG[1] - f5, f4, f4);
                    }
                }
            }
            int[] iArrK = k();
            if (iArrK != null) {
                int iH = h();
                if (iH > 0) {
                    int iC2 = c(4.0f);
                    float f6 = iArrK[0] - iC2;
                    float f7 = iArrK[1] - iC2;
                    int i3 = iC2 * 2;
                    float f8 = iArrK[2] + i3;
                    float f9 = iArrK[3] + i3;
                    GLES20.glUniform4f(this.h, 1.0f, 1.0f, 1.0f, 1.0f);
                    GLES20.glBindTexture(3553, iH);
                    o(f6, f7, f8, f9);
                }
            } else {
                this.x = -1;
            }
            if (this.s != null) {
                int i4 = this.t;
                if (i4 > 0) {
                    GLES20.glDeleteTextures(1, new int[]{i4}, 0);
                }
                this.t = r(this.s);
                this.s.recycle();
                this.s = null;
            }
            if (this.u == 0) {
                f = 0.0f;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.u;
                if (this.v) {
                    float fMin = Math.min(1.0f, (System.currentTimeMillis() - this.w) / 220.0f);
                    if (fMin >= 1.0f) {
                        this.u = 0L;
                        f = 0.0f;
                    } else {
                        f = 1.0f - (fMin * fMin);
                    }
                } else if (jCurrentTimeMillis > 8000) {
                    this.v = true;
                    this.w = System.currentTimeMillis();
                    f = 1.0f;
                } else {
                    float fMin2 = Math.min(1.0f, jCurrentTimeMillis / 220.0f);
                    f = fMin2 * fMin2 * (3.0f - (fMin2 * 2.0f));
                }
            }
            if (f > 0.004f && this.t > 0) {
                int iM = m();
                int iRound = Math.round((m() * 184.0f) / 1400.0f);
                int i5 = this.t;
                GLES20.glUniform4f(this.h, f, f, f, f);
                GLES20.glBindTexture(3553, i5);
                o((this.a - m()) / 2, c(12.0f) - ((1.0f - f) * (c(12.0f) + iRound)), iM, iRound);
            }
            GLES20.glDisable(3042);
        } catch (Throwable th) {
            ad.f("chrome ve loi: ", th);
        }
    }

    public final void e() {
        int[] iArrG;
        int[] iArrG2;
        float fC = c(5.0f);
        if (!MirrorServer.i()) {
            q(this.a / 2.0f, (this.b - c(11.0f)) - fC, c(56.0f), fC);
            return;
        }
        int iN = MirrorServer.n();
        if (MirrorServer.W < 0 && (iArrG2 = MirrorServer.g(0)) != null) {
            q((iArrG2[2] / 2.0f) + iArrG2[0], ((iArrG2[1] + iArrG2[3]) - c(13.0f)) - fC, Math.min(c(52.0f), iArrG2[2] * 0.3f), fC);
        }
        if (iN <= 0 || MirrorServer.i <= 0 || MirrorServer.X >= 0 || (iArrG = MirrorServer.g(1)) == null) {
            return;
        }
        q((iArrG[2] / 2.0f) + iArrG[0], ((iArrG[1] + iArrG[3]) - c(13.0f)) - fC, Math.min(c(52.0f), iArrG[2] * 0.3f), fC);
    }

    public final int f() {
        int iC = c(30.0f);
        int i = this.j;
        if (i > 0 && this.k == iC) {
            return i;
        }
        this.k = iC;
        c(4.0f);
        int iC2 = (c(4.0f) * 2) + c(30.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC2, iC2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        float f = iC2 / 2.0f;
        float f2 = iC;
        float f3 = f2 / 2.0f;
        for (int i2 = 4; i2 >= 1; i2--) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor((24 - (i2 * 3)) << 24);
            canvas.drawCircle(f, c(1.0f) + f, c(i2) + f3, paint);
        }
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-233038818);
        canvas.drawCircle(f, f, f3, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(1, c(1.0f)));
        paint.setColor(872415231);
        canvas.drawCircle(f, f, f3 - c(0.5f), paint);
        paint.setColor(-1578516);
        paint.setStyle(style);
        float fMax = Math.max(c(2.0f), 2.2f);
        float f4 = f2 * 0.2f;
        canvas.drawCircle(f - f4, f, fMax, paint);
        canvas.drawCircle(f, f, fMax, paint);
        canvas.drawCircle(f4 + f, f, fMax, paint);
        int i3 = this.j;
        if (i3 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        }
        this.j = r(bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
        return this.j;
    }

    public final void g() {
        if (this.l) {
            return;
        }
        int iB = b(35633, "attribute vec4 aPos; attribute vec2 aTex; varying vec2 vTex;void main(){ gl_Position = aPos; vTex = aTex; }");
        int iB2 = b(35632, "precision mediump float; varying vec2 vTex;uniform sampler2D uTex; uniform vec4 uColor;void main(){ gl_FragColor = texture2D(uTex, vTex) * uColor; }");
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iB);
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            throw new RuntimeException(ad.g("link: ", GLES20.glGetProgramInfoLog(iGlCreateProgram)));
        }
        this.d = iGlCreateProgram;
        this.e = GLES20.glGetAttribLocation(iGlCreateProgram, "aPos");
        this.f = GLES20.glGetAttribLocation(this.d, "aTex");
        this.g = GLES20.glGetUniformLocation(this.d, "uTex");
        this.h = GLES20.glGetUniformLocation(this.d, "uColor");
        this.m = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-1);
        this.i = r(bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
        this.l = true;
    }

    public final int h() {
        int iC = c(58.0f);
        int i = iC * 3;
        int iC2 = c(52.0f);
        int i2 = (iC * 30000) + iC2;
        int i3 = this.y;
        if (i3 > 0 && this.z == i2) {
            return i3;
        }
        this.z = i2;
        int iC3 = c(4.0f);
        int i4 = iC3 * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i + i4, i4 + iC2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        float f = iC3;
        RectF rectF = new RectF(f, f, i + iC3, iC3 + iC2);
        float f2 = iC2;
        float f3 = f2 / 2.4f;
        int i5 = 3;
        for (int i6 = 1; i5 >= i6; i6 = 1) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(335544320);
            float f4 = i5;
            canvas.drawRoundRect(new RectF(rectF.left - c(f4), (rectF.top - c(f4)) + c(1.0f), rectF.right + c(f4), rectF.bottom + c(f4) + c(1.0f)), f3, f3, paint);
            i5--;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-233038818);
        canvas.drawRoundRect(rectF, f3, f3, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(1, c(1.0f)));
        paint.setColor(872415231);
        canvas.drawRoundRect(rectF, f3, f3, paint);
        for (int i7 = 1; i7 < 3; i7++) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(536870911);
            float fC = (c(58.0f) * i7) + iC3;
            Paint paint2 = paint;
            canvas.drawRect(fC, (0.24f * f2) + f, Math.max(1, c(1.0f)) + fC, (0.76f * f2) + f, paint2);
            paint = paint2;
        }
        int[] iArr = {1, 2, 4};
        int[] iArr2 = {-1578516, -47814, -1578516};
        float f5 = (f2 / 2.0f) + f;
        float f6 = f2 * 0.3f;
        int i8 = 0;
        for (int i9 = 3; i8 < i9; i9 = i9) {
            CarBarArt.veIcon(canvas, paint, iArr[i8], false, (c(58.0f) * i8) + iC3 + (c(58.0f) / 2.0f), f5, f6, iArr2[i8]);
            paint.setStyle(Paint.Style.FILL);
            i8++;
        }
        int i10 = this.y;
        if (i10 > 0) {
            GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        }
        this.y = r(bitmapCreateBitmap);
        bitmapCreateBitmap.recycle();
        return this.y;
    }

    public final void i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        GLES20.glUniform4f(this.h, f5 * f8, f6 * f8, f7 * f8, f8);
        GLES20.glBindTexture(3553, this.i);
        o(f, f2, f3, f4);
    }

    public final boolean j(int i, int i2, int i3) throws InterruptedException, IOException {
        int[] iArrG;
        int i4;
        int i5;
        System.currentTimeMillis();
        int i6 = -1;
        if (i3 == 0) {
            this.o = i;
            this.p = i2;
            if (this.x >= 0) {
                int[] iArrK = k();
                int iMax = (iArrK != null && i >= (i4 = iArrK[0]) && i <= iArrK[2] + i4 && i2 >= (i5 = iArrK[1]) && i2 <= i5 + iArrK[3]) ? Math.max(0, Math.min(2, (i - i4) / c(58.0f))) : -1;
                if (iMax >= 0) {
                    int i7 = this.x;
                    int iT = i7 >= 0 ? MirrorServer.T(i7) : -1;
                    MirrorServer.J("MENU o " + iT + " -> " + (iMax == 0 ? "Chay nen" : iMax == 1 ? "Dong" : "Cai dat"));
                    this.x = -1;
                    if (iT > 0) {
                        if (iMax == 0) {
                            MirrorServer.d(iT);
                        } else if (iMax != 1) {
                            MirrorServer.P0 = true;
                        } else {
                            new Thread(new o7(iT, 9), "close-pane").start();
                        }
                    }
                } else {
                    this.x = -1;
                }
                this.n = 5;
                return true;
            }
            if (MirrorServer.i()) {
                int iMax2 = Math.max(c(30.0f) / 2, c(22.0f));
                int i8 = 0;
                while (true) {
                    if (i8 >= 4) {
                        break;
                    }
                    if (MirrorServer.T(i8) > 0 && (iArrG = MirrorServer.g(i8)) != null) {
                        if (Math.abs(i - ((iArrG[2] / 2) + iArrG[0])) <= iMax2 && Math.abs(i2 - iArrG[1]) <= iMax2) {
                            i6 = i8;
                            break;
                        }
                    }
                    i8++;
                }
            }
            if (i6 >= 0) {
                this.q = i6;
                this.n = 8;
                return true;
            }
            if (this.u != 0 && !this.v && i >= (this.a - m()) / 2) {
                if (i <= m() + ((this.a - m()) / 2) && i2 >= c(12.0f)) {
                    if (i2 <= Math.round((m() * 184.0f) / 1400.0f) + c(12.0f)) {
                        this.v = true;
                        this.w = System.currentTimeMillis();
                        this.n = 5;
                        return true;
                    }
                }
            }
            int iN = MirrorServer.n();
            if (iN > 0 && Math.abs(i - iN) <= c(24.0f)) {
                this.n = 3;
                return true;
            }
            int i9 = (iN <= 0 || MirrorServer.i <= 0 || i < iN) ? 0 : 1;
            int iG0 = MirrorServer.g0(i9);
            if (iG0 > 0 && Math.abs(i2 - iG0) <= c(24.0f)) {
                this.r = i9;
                this.n = 7;
                return true;
            }
            if (i2 >= this.b - c(44.0f)) {
                this.n = 1;
                return true;
            }
            if (iN > 0 || i < this.a - c(18.0f)) {
                this.n = 0;
                return false;
            }
            this.n = 2;
            return true;
        }
        int i10 = this.n;
        if (i10 == 0) {
            return false;
        }
        boolean z = i3 == 1 || i3 == 3;
        switch (i10) {
            case 1:
                int i11 = this.p - i2;
                int iN2 = MirrorServer.n();
                int i12 = (iN2 <= 0 || MirrorServer.i <= 0 || this.o < iN2) ? 0 : 1;
                boolean z2 = MirrorServer.g0(i12) < 0;
                if (z) {
                    MirrorServer.E(this.o, this.p, 0, 0);
                    MirrorServer.E(this.o, this.p, 1, 0);
                    this.n = 0;
                    return true;
                }
                if (z2 && i11 > c(56.0f)) {
                    this.r = i12;
                    MirrorServer.d0(i12, i2 / this.b);
                    this.n = 6;
                }
                return true;
            case 2:
                if (!z && this.o - i > c(12.0f)) {
                    MirrorServer.o(i / this.a);
                    this.n = 3;
                    return true;
                }
                if (z) {
                    MirrorServer.E(this.o, this.p, 0, 0);
                    MirrorServer.E(this.o, this.p, 1, 0);
                    this.n = 0;
                    return true;
                }
                return true;
            case 3:
                if (MirrorServer.o > 0) {
                    MirrorServer.c0 = true;
                    MirrorServer.O = Math.max(0, Math.min(MirrorServer.o, i));
                }
                if (z) {
                    float f = i / this.a;
                    MirrorServer.c0 = false;
                    if (f > 0.82f || f < 0.18f) {
                        if (MirrorServer.O > 0) {
                            MirrorServer.j = MirrorServer.O;
                        }
                        MirrorServer.O = -1;
                        boolean z3 = f > 0.82f;
                        MirrorServer.t(z3 ? MirrorServer.i : MirrorServer.b);
                        int i13 = z3 ? MirrorServer.J : MirrorServer.I;
                        if (i13 > 0) {
                            MirrorServer.t(i13);
                        }
                        MirrorServer.U = z3 ? 1 : 2;
                    } else if (MirrorServer.O > 0) {
                        MirrorServer.k = Math.max(Math.round(MirrorServer.o * 0.25f), Math.min(Math.round(MirrorServer.o * 0.8f), MirrorServer.O));
                        MirrorServer.O = MirrorServer.k;
                    }
                    this.n = 0;
                    return true;
                }
                return true;
            case 4:
            case 5:
            default:
                if (z) {
                    this.n = 0;
                    return true;
                }
                return true;
            case 6:
                MirrorServer.d0(this.r, i2 / this.b);
                if (z) {
                    this.n = 0;
                    return true;
                }
                return true;
            case 7:
                float f2 = i2 / this.b;
                if (!z) {
                    MirrorServer.d0(this.r, f2);
                    return true;
                }
                if (f2 > 0.82f) {
                    MirrorServer.u(this.r, 1);
                } else if (f2 < 0.18f) {
                    MirrorServer.u(this.r, 2);
                } else {
                    MirrorServer.d0(this.r, f2);
                }
                this.n = 0;
                return true;
            case 8:
                int i14 = this.q;
                int i15 = i14 & 1;
                if (z) {
                    if (i14 >= 0) {
                        this.x = i14;
                    }
                    this.q = -1;
                    this.n = 0;
                    return true;
                }
                if (Math.abs(i - this.o) + Math.abs(i2 - this.p) > c(12.0f)) {
                    int iG02 = MirrorServer.g0(i15);
                    if (iG02 < 0) {
                        this.r = i15;
                        MirrorServer.e0(i15, i2 / this.b);
                        this.n = 9;
                        return true;
                    }
                    if (Math.abs(this.p - iG02) > c(24.0f)) {
                        this.n = 5;
                        return true;
                    }
                    this.r = i15;
                    MirrorServer.d0(i15, i2 / this.b);
                    this.n = 7;
                    return true;
                }
                return true;
            case 9:
                MirrorServer.e0(this.r, i2 / this.b);
                if (z) {
                    this.n = 0;
                    return true;
                }
                return true;
        }
    }

    public final int[] k() {
        int[] iArrG;
        int i = this.x;
        if (i < 0 || MirrorServer.T(i) <= 0 || (iArrG = MirrorServer.g(this.x)) == null) {
            return null;
        }
        int iC = c(58.0f) * 3;
        return new int[]{Math.max(c(4.0f), Math.min((this.a - iC) - c(4.0f), ((iArrG[2] / 2) + iArrG[0]) - (iC / 2))), c(4.0f) + (((c(4.0f) * 2) + c(30.0f)) / 2) + iArrG[1], iC, c(52.0f)};
    }

    public final String l() {
        int i = this.a;
        int i2 = this.b;
        int iN = n();
        int iN2 = MirrorServer.n();
        if (iN2 <= 0 || MirrorServer.i <= 0 || -1 == MirrorServer.i) {
            iN2 = this.a;
        }
        int iN3 = (((iN2 - n()) - a()) / 2) + iN;
        int iN4 = n();
        int iN5 = MirrorServer.n();
        if (iN5 <= 0 || MirrorServer.i <= 0 || -1 == MirrorServer.i) {
            iN5 = this.a;
        }
        return "thanh: W=" + i + " H=" + i2 + " x=" + iN3 + ".." + (a() + (((iN5 - n()) - a()) / 2) + iN4) + " y=" + ((this.b - c(18.0f)) - Math.min(c(64.0f), Math.round((a() * 160.0f) / 1550.0f))) + ".." + (Math.min(c(64.0f), Math.round((a() * 160.0f) / 1550.0f)) + ((this.b - c(18.0f)) - Math.min(c(64.0f), Math.round((a() * 160.0f) / 1550.0f))));
    }

    public final int m() {
        return Math.round(Math.min(this.a * 0.6f, c(560.0f)));
    }

    public final void o(float f, float f2, float f3, float f4) {
        float f5 = ((f * 2.0f) / this.a) - 1.0f;
        float f6 = (((f + f3) * 2.0f) / this.a) - 1.0f;
        float f7 = 1.0f - ((f2 * 2.0f) / this.b);
        float f8 = 1.0f - (((f2 + f4) * 2.0f) / this.b);
        this.m.put(new float[]{f5, f8, 0.0f, 1.0f, f6, f8, 1.0f, 1.0f, f5, f7, 0.0f, 0.0f, f6, f7, 1.0f, 0.0f});
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 16, (Buffer) this.m);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 16, (Buffer) this.m);
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.e);
        GLES20.glDisableVertexAttribArray(this.f);
    }

    public final void p(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = Math.max(1.0f, i3 / 160.0f);
    }

    public final void q(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        i(f5 - c(1.0f), f2 - c(1.0f), (c(1.0f) + f3) * 2.0f, f4 + c(2.0f), 0.0f, 0.0f, 0.0f, 0.22f);
        i(f5, f2, f3 * 2.0f, f4, 1.0f, 1.0f, 1.0f, 0.42f);
    }

    public final void s(float f) {
        try {
            g();
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glUseProgram(this.d);
            GLES20.glUniform1i(this.g, 0);
            GLES20.glActiveTexture(33984);
            i(0.0f, 0.0f, this.a, this.b, 0.0f, 0.0f, 0.0f, f);
            GLES20.glDisable(3042);
        } catch (Throwable th) {
            ad.f("lop toi loi: ", th);
        }
    }
}

package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.maps.api.android.lib6.streetview.model.StreetViewNavigationArrow;
import java.util.List;

/* loaded from: classes3.dex */
public final class aafz implements aagc {
    public static final String a = "aafz";
    public final aahn c;
    public final CharSequence[] d;
    public final zrt e;
    public boolean f;
    public aagi g;
    public List h;
    public int i;
    public RectF[] j;
    public aagn k;
    private boolean m;
    private int n;
    private aaft o;
    private aaft p;
    private static final ThreadLocal l = new aafy();
    static final Rect b = new Rect(-2, -2, -1, -1);

    public aafz(aahn aahnVar, CharSequence[] charSequenceArr) {
        zrt zrtVar = zrt.a;
        aafs aafsVar = aafs.a;
        zkt.n(aahnVar, "frameRequestor");
        this.c = aahnVar;
        zkt.n(charSequenceArr, "compassDirectionFullStrings");
        this.d = charSequenceArr;
        int length = charSequenceArr.length;
        zkt.e(length == 8, String.format("compassDirectionFullStrings#%s != 8", Integer.valueOf(length)));
        zkt.n(zrtVar, "uiThreadChecker");
        this.e = zrtVar;
        synchronized (this) {
            this.m = false;
            this.f = true;
            this.g = aagi.a;
            this.h = null;
            this.i = -1;
            this.j = null;
            this.k = null;
            this.n = -1;
            this.o = null;
            this.p = null;
        }
    }

    private final synchronized void e(ajdr ajdrVar, aagn aagnVar, float f, float f2) {
        this.e.b();
        Object obj = ajdrVar.b;
        Matrix.setIdentityM((float[]) obj, 0);
        aags aagsVarF = this.g.f();
        double radians = Math.toRadians(aagsVarF.c);
        Matrix.rotateM((float[]) obj, 0, -aagsVarF.d, (float) (-Math.cos(radians)), BitmapDescriptorFactory.HUE_RED, (float) (-Math.sin(radians)));
        Matrix.rotateM((float[]) obj, 0, 180.0f - f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        float fCos = (float) Math.cos(Math.toRadians(aagnVar.f - f));
        Matrix.translateM((float[]) obj, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (((((0.355f * fCos) + 0.68f) - ((((fCos + fCos) * fCos) - 1.0f) * 0.32f)) - ((fCos * (((4.0f * fCos) * fCos) - 3.0f)) * 0.215f)) * 0.25f) + 0.2f);
        Matrix.translateM((float[]) obj, 0, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED);
        if (!this.g.h() || aagnVar.h > aagnVar.i) {
            Matrix.translateM((float[]) obj, 0, BitmapDescriptorFactory.HUE_RED, 0.05f, BitmapDescriptorFactory.HUE_RED);
        }
        Object obj2 = ajdrVar.d;
        Matrix.multiplyMM((float[]) obj2, 0, (float[]) ajdrVar.e, 0, (float[]) obj, 0);
        Matrix.multiplyMM((float[]) ajdrVar.c, 0, aagnVar.h(), 0, (float[]) obj2, 0);
    }

    public final synchronized int a(float f, float f2) {
        RectF[] rectFArr;
        this.e.a();
        String str = a;
        if (zrn.e(str, 2)) {
            Log.v(str, "pick(" + f + "," + f2 + ")");
        }
        if (this.f && (rectFArr = this.j) != null) {
            for (int length = rectFArr.length - 1; length >= 0; length--) {
                if (this.j[length].contains(f, f2)) {
                    return length;
                }
            }
            return -1;
        }
        if (zrn.e(str, 2)) {
            Log.v(str, "No chevron hitboxes to intersect with.");
        }
        return -1;
    }

    public final void b(int i) {
        this.e.a();
        synchronized (this) {
            String str = a;
            if (zrn.e(str, 2)) {
                Log.v(str, String.format("highlightChevron(%s => %s)", Integer.valueOf(this.i), Integer.valueOf(i)));
            }
            if (this.i == i) {
                return;
            }
            this.i = i;
            this.k = null;
            this.c.b("CHEVRONS_highlightChevron");
        }
    }

    public final synchronized void c(aagn aagnVar) {
        List list;
        this.e.b();
        zkt.n(aagnVar, "raycaster");
        if (this.m && this.f && !this.g.i() && (list = this.h) != null && !list.isEmpty()) {
            a.C(this.k, aagnVar);
            String str = a;
            char c = 2;
            if (zrn.e(str, 2)) {
                Log.v(str, "onDrawFrame(" + this.g.b + ")");
            }
            ajdr ajdrVar = (ajdr) l.get();
            this.k = aagnVar;
            Object obj = ajdrVar.e;
            int i = 0;
            Matrix.setIdentityM((float[]) obj, 0);
            float f = BitmapDescriptorFactory.HUE_RED;
            Matrix.translateM((float[]) obj, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -2.0f);
            Matrix.rotateM((float[]) obj, 0, -aagnVar.e, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Matrix.rotateM((float[]) obj, 0, aagnVar.f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
            Matrix.translateM((float[]) obj, 0, BitmapDescriptorFactory.HUE_RED, -0.35f, BitmapDescriptorFactory.HUE_RED);
            GLES20.glDisable(2929);
            GLES20.glDepthMask(false);
            GLES20.glDisable(2884);
            this.j = new RectF[((yls) this.h).c];
            int i2 = 0;
            while (true) {
                List list2 = this.h;
                if (i2 >= ((yls) list2).c) {
                    return;
                }
                float f2 = i2 == this.i ? f : -0.1f;
                float f3 = ((StreetViewNavigationArrow) list2.get(i2)).bearing;
                e(ajdrVar, aagnVar, f3, (-0.04f) + f2);
                aaft aaftVar = this.p;
                Object obj2 = ajdrVar.c;
                aaftVar.a((float[]) obj2, "shadow#" + i2 + "@" + f3);
                e(ajdrVar, aagnVar, f3, f2);
                this.o.a((float[]) obj2, "solid#" + i2 + "@" + f3);
                RectF[] rectFArr = this.j;
                Object obj3 = ajdrVar.a;
                int i3 = aagnVar.h;
                int i4 = aagnVar.i;
                float fMax = -3.4028235E38f;
                char c2 = c;
                int i5 = i;
                float fMin = Float.MAX_VALUE;
                float fMin2 = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                while (i5 < 4) {
                    Matrix.multiplyMV((float[]) obj3, 0, (float[]) obj2, 0, aafw.e[i5], 0);
                    double d = aahr.a;
                    float f4 = ((float[]) obj3)[3];
                    if (f4 == f) {
                        throw new IllegalArgumentException("vector4[3] cannot be zero");
                    }
                    zkt.l(f4, "vector4[3] cannot be NaN");
                    ((float[]) obj3)[i5] = ((float[]) obj3)[i5] / ((float[]) obj3)[3];
                    ((float[]) obj3)[1] = ((float[]) obj3)[1] / ((float[]) obj3)[3];
                    ((float[]) obj3)[c2] = ((float[]) obj3)[c2] / ((float[]) obj3)[3];
                    ((float[]) obj3)[3] = 1.0f;
                    fMin = Math.min(fMin, ((float[]) obj3)[i5]);
                    fMax2 = Math.max(fMax2, ((float[]) obj3)[i5]);
                    fMin2 = Math.min(fMin2, ((float[]) obj3)[1]);
                    fMax = Math.max(fMax, ((float[]) obj3)[1]);
                    i5++;
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                float f5 = i3;
                float f6 = i4;
                rectFArr[i2] = new RectF((fMin + 1.0f) * f5 * 0.5f, (1.0f - fMax) * f6 * 0.5f, (fMax2 + 1.0f) * f5 * 0.5f, 0.5f * (1.0f - fMin2) * f6);
                i2++;
                c = c2;
                i = i5;
                f = BitmapDescriptorFactory.HUE_RED;
            }
        }
        this.j = null;
    }

    public final void d() {
        this.e.b();
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, "performGLPreflightTasks() IN PROGRESS");
        }
        synchronized (this) {
            this.m = false;
        }
        try {
            aafs aafsVar = aafs.a;
            int i = aaft.a;
            zkt.n(str, "tag");
            this.n = aafs.i(str, "uniform   mat4 uMVPMatrix; attribute vec4 vPosition; attribute vec4 vColor; varying   vec4 fColor; void main() {   gl_Position = uMVPMatrix * vPosition;   fColor = vColor; }", "precision mediump float; varying vec4 fColor; void main() {   gl_FragColor = fColor; }");
            String strD = aafs.d();
            if (strD != null) {
                if (zrn.e(str, 6)) {
                    Log.e(str, a.bz(strD, "performGLPreflightTasks() failed to register shader program: "));
                    return;
                }
                return;
            }
            float[] fArr = aafw.a;
            short[] sArr = aafw.b;
            this.o = new aaft(fArr, sArr, aafw.c, this.n);
            this.p = new aaft(fArr, sArr, aafw.d, this.n);
            String strD2 = aafs.d();
            if (strD2 != null) {
                if (zrn.e(str, 6)) {
                    Log.e(str, a.bz(strD2, "performGLPreflightTasks() failed to create GlBufferedShape: "));
                }
            } else {
                if (zrn.e(str, 4)) {
                    Log.i(str, "performGLPreflightTasks() SUCCESS!");
                }
                synchronized (this) {
                    this.m = true;
                }
            }
        } catch (RuntimeException e) {
            String str2 = a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, "performGLPreflightTasks() failed to set up Chevron GL", e);
            }
        }
    }
}

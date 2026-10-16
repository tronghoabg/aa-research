package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fhr {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final fhp d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final yw l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public fhr(fhr fhrVar) {
        this.o = new Matrix();
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = 255;
        this.j = null;
        this.k = null;
        yw ywVar = new yw();
        this.l = ywVar;
        this.d = new fhp(fhrVar.d, ywVar);
        this.m = new Path(fhrVar.m);
        this.n = new Path(fhrVar.n);
        this.e = fhrVar.e;
        this.f = fhrVar.f;
        this.g = fhrVar.g;
        this.h = fhrVar.h;
        int i = fhrVar.q;
        this.q = 0;
        this.i = fhrVar.i;
        this.j = fhrVar.j;
        String str = fhrVar.j;
        if (str != null) {
            ywVar.put(str, this);
        }
        this.k = fhrVar.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(fhp fhpVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        Matrix matrix2;
        float f;
        Matrix matrix3 = fhpVar.a;
        matrix3.set(matrix);
        matrix3.preConcat(fhpVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = fhpVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            fhv fhvVar = (fhv) arrayList.get(i4);
            if (fhvVar instanceof fhp) {
                a((fhp) fhvVar, matrix3, canvas, i, i2);
            } else if (fhvVar instanceof fhq) {
                fhq fhqVar = (fhq) fhvVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                Matrix matrix4 = this.o;
                float fMin = Math.min(f2, f3);
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i4;
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[z ? 1 : 0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > BitmapDescriptorFactory.HUE_RED ? Math.abs(f7 - f8) / fMax : 0.0f;
                if (fAbs != BitmapDescriptorFactory.HUE_RED) {
                    Path path = this.m;
                    path.reset();
                    dvf[] dvfVarArr = fhqVar.m;
                    if (dvfVarArr != null) {
                        dtd.c(dvfVarArr, path);
                    }
                    Path path2 = this.n;
                    path2.reset();
                    if (fhqVar.a()) {
                        path2.setFillType(fhqVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                        matrix2 = matrix3;
                    } else {
                        fho fhoVar = (fho) fhqVar;
                        float f9 = fhoVar.g;
                        if (f9 == BitmapDescriptorFactory.HUE_RED && fhoVar.h == 1.0f) {
                            matrix2 = matrix3;
                        } else {
                            float f10 = fhoVar.i;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (fhoVar.h + f10) % 1.0f;
                            PathMeasure pathMeasure = this.p;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.p = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.p;
                            if (f13 > f14) {
                                matrix2 = matrix3;
                                pathMeasure4.getSegment(f13, length, path, true);
                                PathMeasure pathMeasure5 = this.p;
                                f = BitmapDescriptorFactory.HUE_RED;
                                pathMeasure5.getSegment(BitmapDescriptorFactory.HUE_RED, f14, path, true);
                            } else {
                                matrix2 = matrix3;
                                f = BitmapDescriptorFactory.HUE_RED;
                                pathMeasure4.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        if (fhoVar.d.d()) {
                            duw duwVar = fhoVar.d;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (duwVar.a()) {
                                Shader shader = (Shader) duwVar.b;
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(fhoVar.f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(fhu.a(duwVar.a, fhoVar.f));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(fhoVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        if (fhoVar.b.d()) {
                            duw duwVar2 = fhoVar.b;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = fhoVar.k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = fhoVar.j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(fhoVar.l);
                            if (duwVar2.a()) {
                                Shader shader2 = (Shader) duwVar2.b;
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(fhoVar.e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(fhu.a(duwVar2.a, fhoVar.e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(fhoVar.c * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                } else {
                    matrix2 = matrix3;
                }
                i4 = i3 + 1;
                matrix3 = matrix2;
                c = 0;
            }
            matrix2 = matrix3;
            i3 = i4;
            i4 = i3 + 1;
            matrix3 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public fhr() {
        this.o = new Matrix();
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new yw();
        this.d = new fhp();
        this.m = new Path();
        this.n = new Path();
    }
}

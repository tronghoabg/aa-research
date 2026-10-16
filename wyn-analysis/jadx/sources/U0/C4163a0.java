package u0;

import android.graphics.Matrix;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: u0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4163a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f46186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46187b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46188c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f46189d;

    /* renamed from: e, reason: collision with root package name */
    public Object f46190e;

    /* renamed from: f, reason: collision with root package name */
    public Object f46191f;

    /* renamed from: g, reason: collision with root package name */
    public Object f46192g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f46193h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4163a0(tf.p pVar) {
        this.f46189d = (AbstractC3343n) pVar;
        this.f46186a = true;
        this.f46187b = true;
        this.f46188c = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [float[], java.io.Serializable] */
    public float[] a(Object obj) {
        float[] fArr = (float[]) this.f46193h;
        float[] fArr2 = fArr;
        if (fArr == null) {
            ?? H8 = e0.z.h();
            this.f46193h = H8;
            fArr2 = H8;
        }
        if (this.f46187b) {
            this.f46188c = Q.h(b(obj), fArr2);
            this.f46187b = false;
        }
        if (this.f46188c) {
            return fArr2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.n, tf.p] */
    public float[] b(Object obj) {
        float[] fArrH = (float[]) this.f46192g;
        if (fArrH == null) {
            fArrH = e0.z.h();
            this.f46192g = fArrH;
        }
        if (!this.f46186a) {
            return fArrH;
        }
        Matrix matrix = (Matrix) this.f46190e;
        if (matrix == null) {
            matrix = new Matrix();
            this.f46190e = matrix;
        }
        ((AbstractC3343n) this.f46189d).invoke(obj, matrix);
        Matrix matrix2 = (Matrix) this.f46191f;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            e0.z.p(fArrH, matrix);
            this.f46190e = matrix2;
            this.f46191f = matrix;
        }
        this.f46186a = false;
        return fArrH;
    }

    public void c() {
        this.f46186a = true;
        this.f46187b = true;
    }

    public C4163a0(String str, String str2, String str3, Y1.t tVar, boolean z2, boolean z10, boolean z11, Integer num) {
        this.f46189d = str;
        this.f46190e = str2;
        this.f46191f = str3;
        this.f46192g = tVar;
        this.f46186a = z2;
        this.f46187b = z10;
        this.f46188c = z11;
        this.f46193h = num;
    }
}

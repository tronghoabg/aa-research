package a1;

import android.graphics.Matrix;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import e0.z;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import u0.G;
import u0.Q;

/* renamed from: a1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318h implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f17125a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f17126b;

    public C1318h(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f17125a = new int[size];
        this.f17126b = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            this.f17125a[i5] = ((Integer) arrayList.get(i5)).intValue();
            this.f17126b[i5] = ((Float) arrayList2.get(i5)).floatValue();
        }
    }

    @Override // u0.G
    public void a(View view, float[] matrix) {
        AbstractC3340k.e(matrix, "matrix");
        z.o(matrix);
        c(view, matrix);
    }

    public void b(float[] fArr, float f10, float f11) {
        float[] fArr2 = this.f17126b;
        z.o(fArr2);
        z.v(fArr2, f10, f11);
        Q.b(fArr, fArr2);
    }

    public void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f17125a);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        float[] fArr2 = this.f17126b;
        z.p(fArr2, matrix);
        Q.b(fArr, fArr2);
    }

    public C1318h(int i5, int i10) {
        this.f17125a = new int[]{i5, i10};
        this.f17126b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public C1318h(int i5, int i10, int i11) {
        this.f17125a = new int[]{i5, i10, i11};
        this.f17126b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    }

    public C1318h() {
        this.f17125a = new int[2];
        this.f17126b = z.h();
    }
}

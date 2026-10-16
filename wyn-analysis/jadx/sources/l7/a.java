package L7;

import a.AbstractC1304a;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public final class a extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public int f6977b;

    /* renamed from: c, reason: collision with root package name */
    public int f6978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f6979d;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        super(23);
        this.f6979d = swipeDismissBehavior;
        this.f6978c = -1;
    }

    @Override // a.AbstractC1304a
    public final void C(int i5, View view) {
        this.f6978c = i5;
        this.f6977b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f6979d;
            swipeDismissBehavior.f26784c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f26784c = false;
        }
    }

    @Override // a.AbstractC1304a
    public final void E(View view, int i5, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f6979d;
        float f10 = width * swipeDismissBehavior.f26786e;
        float width2 = view.getWidth() * swipeDismissBehavior.f26787f;
        float fAbs = Math.abs(i5 - this.f6977b);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // a.AbstractC1304a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f6978c = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f6979d
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = k1.S.f38779a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f26785d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f6977b
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f6977b
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f6977b
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f6977b
            r3 = r4
        L69:
            t1.d r10 = r2.f26782a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7f
            L7.b r10 = new L7.b
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = k1.S.f38779a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.a.F(android.view.View, float, float):void");
    }

    @Override // a.AbstractC1304a
    public final boolean N(int i5, View view) {
        int i10 = this.f6978c;
        return (i10 == -1 || i10 == i5) && this.f6979d.r(view);
    }

    @Override // a.AbstractC1304a
    public final int l(int i5, View view) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f38779a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i10 = this.f6979d.f26785d;
        if (i10 == 0) {
            if (z2) {
                width = this.f6977b - view.getWidth();
                width2 = this.f6977b;
            } else {
                width = this.f6977b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f6977b - view.getWidth();
            width2 = view.getWidth() + this.f6977b;
        } else if (z2) {
            width = this.f6977b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f6977b - view.getWidth();
            width2 = this.f6977b;
        }
        return Math.min(Math.max(width, i5), width2);
    }

    @Override // a.AbstractC1304a
    public final int m(int i5, View view) {
        return view.getTop();
    }

    @Override // a.AbstractC1304a
    public final int x(View view) {
        return view.getWidth();
    }

    @Override // a.AbstractC1304a
    public final void D(int i5) {
    }
}

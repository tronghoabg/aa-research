package com.bytedance.sdk.openadsdk.core.yo;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.sy;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public abstract class yo implements View.OnClickListener, View.OnTouchListener {
    protected static int cp = 8;
    protected View fz;
    protected float dhk = -1.0f;
    protected float tpx = -1.0f;
    protected float orq = -1.0f;
    protected float gzw = -1.0f;
    protected long gsd = -1;
    protected long rt = -1;
    protected int gr = -1;

    /* renamed from: ue, reason: collision with root package name */
    protected int f25836ue = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int pz = -1;
    protected boolean ku = true;
    public SparseArray<uef> dxx = new SparseArray<>();
    private float uef = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: oa, reason: collision with root package name */
    private float f25835oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float moa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private long lw = 0;
    private int ivm = 0;
    private int xs = 0;

    public static class uef {
        public long moa;

        /* renamed from: oa, reason: collision with root package name */
        public double f25837oa;
        public int uef;
        public double yo;

        public uef(int i5, double d3, double d5, long j8) {
            this.uef = i5;
            this.f25837oa = d3;
            this.yo = d5;
            this.moa = j8;
        }
    }

    static {
        if (sy.uef() != null) {
            cp = sy.oa();
        }
    }

    private boolean uef(View view, Point point) {
        int i5;
        int i10;
        int i11;
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (oa.yo(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i5 = point.x) >= (i10 = iArr[0]) && i5 <= childAt.getWidth() + i10 && (i11 = point.y) >= (i12 = iArr[1]) && i11 <= childAt.getHeight() + i12;
                }
                if (uef(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ivm() {
        return this.ku;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.xs.uef()) {
            uef(view, this.dhk, this.tpx, this.orq, this.gzw, this.dxx, this.ku);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.yo.yo.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void uef(View view, float f10, float f11, float f12, float f13, SparseArray<uef> sparseArray, boolean z2);
}

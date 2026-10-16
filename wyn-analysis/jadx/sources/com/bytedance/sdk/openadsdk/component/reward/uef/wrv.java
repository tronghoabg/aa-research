package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class wrv {
    private boolean ivm;
    private int lw;
    private gzw moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25432oa;
    protected int uef;
    private Activity yo;

    public static abstract class uef implements View.OnLayoutChangeListener {

        /* renamed from: oa, reason: collision with root package name */
        private int f25434oa;
        private int uef;

        private uef() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i5;
            int i18 = i12 - i10;
            if (i17 == this.uef && i18 == this.f25434oa) {
                return;
            }
            this.uef = i17;
            this.f25434oa = i18;
            uef(i17, i18);
        }

        public abstract void uef(int i5, int i10);
    }

    public wrv(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this(oaVar.pu, oaVar.f25412oa, oaVar.etd, oaVar.aos, oaVar.zou, oaVar);
    }

    private float moa() {
        return af.yo(this.yo, af.wrv(this.yo));
    }

    private float[] oa(int i5) {
        float fMoa = moa();
        float fYo = yo();
        int i10 = this.lw;
        if ((i10 == 1) != (fMoa > fYo)) {
            float f10 = fMoa + fYo;
            fYo = f10 - fYo;
            fMoa = f10 - fYo;
        }
        if (i10 == 1) {
            fMoa -= i5;
        } else {
            fYo -= i5;
        }
        return new float[]{fYo, fMoa};
    }

    private static boolean uef(int i5, int i10) {
        return i5 == 2 && i10 == 2;
    }

    private float yo() {
        return af.yo(this.yo, af.cq(this.yo));
    }

    public wrv(Activity activity, gzw gzwVar, int i5, boolean z2, boolean z10, com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.uef = 0;
        this.yo = activity;
        this.moa = gzwVar;
        this.f25432oa = z2;
        this.ivm = z10;
        if (oaVar != null) {
            uef(oaVar);
            i5 = oaVar.etd;
        }
        this.lw = i5;
        try {
            this.uef = af.yo(activity, af.uef());
            if (!activity.getWindow().hasFeature(1)) {
                activity.requestWindowFeature(1);
            }
            activity.getWindow().addFlags(16777344);
            if (this.lw != 2 && af.yo(activity)) {
                return;
            }
            activity.getWindow().addFlags(Segment.SHARE_MINIMUM);
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int yo(Activity activity, int i5) {
        int i10 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (uef(i5, i10)) {
            return Math.abs(af.cq(activity) - decorView.getWidth());
        }
        return Math.abs(af.wrv(activity) - decorView.getHeight());
    }

    public static class oa {
        private uef uef;

        public void uef(Activity activity) {
            Window window;
            if (this.uef == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.uef);
            this.uef = null;
        }

        public void uef(final Activity activity, final int i5, final float f10, final boolean z2) {
            if (this.uef == null) {
                try {
                    final boolean z10 = com.bytedance.sdk.openadsdk.core.sy.moa().gem() == 1;
                    final boolean zYo = af.yo(activity);
                    if (zYo || z10) {
                        try {
                            this.uef = new uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.oa.1
                                boolean uef;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void oa() {
                                    try {
                                        int iYo = wrv.yo(activity, i5);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iYo == 0) {
                                            int[] iArrOa = wrv.oa(activity, decorView, i5, zYo, z10);
                                            if (iArrOa[4] == 1) {
                                                this.uef = wrv.oa(decorView, iArrOa[0], iArrOa[1], iArrOa[2], iArrOa[3], f10);
                                            }
                                        } else if (this.uef) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.uef = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.uef.wrv.uef
                                public void uef(int i10, int i11) {
                                    if (z2) {
                                        oa();
                                    } else {
                                        uef();
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                private void uef() {
                                    /*
                                        r8 = this;
                                        int r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 2
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.af.cq(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                        goto L46
                                    L2d:
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.af.wrv(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                    L46:
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r2.getPaddingLeft()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r2.getPaddingRight()     // Catch: java.lang.Throwable -> Lc4
                                        int r5 = r2.getPaddingBottom()     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != 0) goto Lba
                                        int r0 = r2.getPaddingTop()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r7 = 1
                                        if (r6 != r7) goto L7c
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r7) goto L7c
                                        float r1 = com.bytedance.sdk.openadsdk.utils.af.uef()     // Catch: java.lang.Throwable -> Lc4
                                    L79:
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0 + r1
                                        goto La1
                                    L7c:
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        boolean r1 = r5     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto L98
                                        float r1 = com.bytedance.sdk.openadsdk.utils.af.uef()     // Catch: java.lang.Throwable -> Lc4
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r3 + r1
                                    L98:
                                        boolean r1 = r6     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto La1
                                        float r1 = com.bytedance.sdk.openadsdk.utils.af.uef()     // Catch: java.lang.Throwable -> Lc4
                                        goto L79
                                    La1:
                                        boolean r1 = r2.isAttachedToWindow()     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto Lac
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.uef = r7     // Catch: java.lang.Throwable -> Lc4
                                    Lac:
                                        float r0 = r7     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 1120403456(0x42c80000, float:100.0)
                                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                        if (r0 != 0) goto Lc4
                                        r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                        r2.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> Lc4
                                        return
                                    Lba:
                                        boolean r0 = r8.uef     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 == 0) goto Lc4
                                        r0 = 0
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.uef = r0     // Catch: java.lang.Throwable -> Lc4
                                    Lc4:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.oa.AnonymousClass1.uef():void");
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.uef);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void oa() {
        if (this.lw == 2) {
            if (this.ivm) {
                oa(this.yo, 8);
                return;
            } else {
                oa(this.yo, 0);
                return;
            }
        }
        oa(this.yo, 1);
    }

    public void uef(ue ueVar) {
        if (ueVar == null) {
            return;
        }
        ueVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = wrv.this.yo.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        oaVar.uqx = oaVar.f25412oa.gze();
        oaVar.etd = uef(oaVar.pu, oaVar.f25412oa);
    }

    public static int uef(Activity activity, gzw gzwVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return gzwVar.cgg();
    }

    private static void oa(Activity activity, int i5) {
        if (activity.getRequestedOrientation() == i5) {
            return;
        }
        int i10 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean oa(View view, int i5, int i10, int i11, int i12, float f10) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i5, i10, i11, i12);
        if (f10 != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] oa(Activity activity, View view, int i5, boolean z2, boolean z10) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fUef;
        int i10 = 0;
        if (activity != null && view != null) {
            int i11 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i5 == 1) {
                if (i11 == 1) {
                    fUef = af.uef();
                    paddingTop2 += (int) fUef;
                    i10 = 1;
                } else {
                    paddingLeft2 += (int) af.uef();
                }
            } else if (i5 == 2) {
                if (i11 == 2) {
                    if (z2) {
                        paddingLeft2 += (int) af.uef();
                        i10 = 1;
                    }
                    if (z10) {
                        fUef = af.uef();
                        paddingTop2 += (int) fUef;
                        i10 = 1;
                    }
                } else {
                    paddingTop2 += (int) af.uef();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i10};
        }
        if (view != null) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingLeft = 0;
            paddingBottom = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
    }

    public void uef(boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 != 26) {
            if (i5 == 27) {
                try {
                    oa();
                } catch (Throwable unused) {
                }
            } else {
                oa();
            }
        }
    }

    public float[] uef(int i5) {
        return uef(i5, this.yo, this.moa);
    }

    public float[] uef(int i5, Activity activity, gzw gzwVar) {
        float[] fArrOa = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.f25432oa && paddingLeft == 0 && paddingTop == 0 && yo(activity, i5) == 0) {
            int[] iArrOa = oa(activity, decorView, i5, af.yo(activity), com.bytedance.sdk.openadsdk.core.sy.moa().gem() == 1);
            int i10 = iArrOa[0];
            paddingTop = iArrOa[1];
            paddingLeft = i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && gzwVar.gze() == 100.0f) {
            fArrOa[0] = decorView.getWidth() - paddingLeft;
            fArrOa[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrOa[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrOa[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrOa[0] = af.yo(activity, fArrOa[0]);
        float fYo = af.yo(activity, fArrOa[1]);
        fArrOa[1] = fYo;
        if (fArrOa[0] < 10.0f || fYo < 10.0f) {
            fArrOa = oa(this.uef);
        }
        if (i11 != 26 && i11 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i5) {
                    if (i5 == 2) {
                        float f10 = fArrOa[0];
                        float f11 = fArrOa[1];
                        if (f10 < f11) {
                            fArrOa[1] = f10;
                            fArrOa[0] = f11;
                        }
                    } else {
                        float f12 = fArrOa[0];
                        float f13 = fArrOa[1];
                        if (f12 > f13) {
                            fArrOa[1] = f12;
                            fArrOa[0] = f13;
                        }
                    }
                }
            }
            float f14 = fArrOa[0];
            float f15 = fArrOa[1];
        }
        return fArrOa;
    }

    public static float[] uef(int i5, Activity activity, gzw gzwVar, boolean z2) {
        float[] fArr = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (z2 && paddingLeft == 0 && paddingTop == 0 && yo(activity, i5) == 0) {
            int[] iArrOa = oa(activity, decorView, i5, af.yo(activity), com.bytedance.sdk.openadsdk.core.sy.moa().gem() == 1);
            paddingLeft = iArrOa[0];
            paddingTop = iArrOa[1];
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35 && gzwVar.gze() == 100.0f) {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArr[0] = af.yo(activity, fArr[0]);
        fArr[1] = af.yo(activity, fArr[1]);
        if (i10 != 26 && i10 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i5) {
                if (i5 == 2) {
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    if (f10 < f11) {
                        fArr[1] = f10;
                        fArr[0] = f11;
                    }
                } else {
                    float f12 = fArr[0];
                    float f13 = fArr[1];
                    if (f12 > f13) {
                        fArr[1] = f12;
                        fArr[0] = f13;
                    }
                }
            }
        }
        return fArr;
    }

    public void uef() {
        af.uef(this.yo);
        this.yo.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                if (i5 == 0) {
                    try {
                        if (wrv.this.yo.isFinishing()) {
                            return;
                        }
                        wrv.this.yo.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.wrv.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                af.uef(wrv.this.yo);
                            }
                        }, 2500L);
                    } catch (Exception e7) {
                        dhk.yo("TTAD.RFSM", e7.getMessage());
                    }
                }
            }
        });
    }
}

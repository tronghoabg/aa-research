package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.wynauto.wyn.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class r1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r1 k;

    /* renamed from: l, reason: collision with root package name */
    public static r1 f43882l;

    /* renamed from: a, reason: collision with root package name */
    public final View f43883a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f43884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43885c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f43886d;

    /* renamed from: e, reason: collision with root package name */
    public final q1 f43887e;

    /* renamed from: f, reason: collision with root package name */
    public int f43888f;

    /* renamed from: g, reason: collision with root package name */
    public int f43889g;

    /* renamed from: h, reason: collision with root package name */
    public s1 f43890h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f43891i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43892j;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.q1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.q1] */
    public r1(View view, CharSequence charSequence) {
        final int i5 = 0;
        this.f43886d = new Runnable(this) { // from class: q.q1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1 f43873b;

            {
                this.f43873b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i5) {
                    case 0:
                        this.f43873b.c(false);
                        break;
                    default:
                        this.f43873b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f43887e = new Runnable(this) { // from class: q.q1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r1 f43873b;

            {
                this.f43873b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        this.f43873b.c(false);
                        break;
                    default:
                        this.f43873b.a();
                        break;
                }
            }
        };
        this.f43883a = view;
        this.f43884b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = k1.T.f38785a;
        this.f43885c = Build.VERSION.SDK_INT >= 28 ? Y0.c.l(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f43892j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r1 r1Var) {
        r1 r1Var2 = k;
        if (r1Var2 != null) {
            r1Var2.f43883a.removeCallbacks(r1Var2.f43886d);
        }
        k = r1Var;
        if (r1Var != null) {
            r1Var.f43883a.postDelayed(r1Var.f43886d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        r1 r1Var = f43882l;
        View view = this.f43883a;
        if (r1Var == this) {
            f43882l = null;
            s1 s1Var = this.f43890h;
            if (s1Var != null) {
                View view2 = (View) s1Var.f43897b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) s1Var.f43896a).getSystemService("window")).removeView(view2);
                }
                this.f43890h = null;
                this.f43892j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            b(null);
        }
        view.removeCallbacks(this.f43887e);
    }

    public final void c(boolean z2) throws Resources.NotFoundException {
        int height;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        long longPressTimeout;
        long j8;
        long j10;
        WeakHashMap weakHashMap = k1.S.f38779a;
        View view = this.f43883a;
        if (view.isAttachedToWindow()) {
            b(null);
            r1 r1Var = f43882l;
            if (r1Var != null) {
                r1Var.a();
            }
            f43882l = this;
            this.f43891i = z2;
            Context context = view.getContext();
            s1 s1Var = new s1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            s1Var.f43899d = layoutParams;
            s1Var.f43900e = new Rect();
            s1Var.f43901f = new int[2];
            s1Var.f43902g = new int[2];
            s1Var.f43896a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            s1Var.f43897b = viewInflate;
            s1Var.f43898c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(s1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = BackupConstant.SCENE_BACKUP_RENDER_FAIL;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2132017156;
            layoutParams.flags = 24;
            this.f43890h = s1Var;
            int width = this.f43888f;
            int i14 = this.f43889g;
            boolean z10 = this.f43891i;
            View view2 = (View) s1Var.f43897b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) s1Var.f43896a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) s1Var.f43898c).setText(this.f43884b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) s1Var.f43899d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i5 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i5 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i13 = 1;
            } else {
                Rect rect = (Rect) s1Var.f43900e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = width;
                    i11 = i5;
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i13 = 1;
                    i10 = width;
                    i11 = i5;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) s1Var.f43902g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) s1Var.f43901f;
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i15;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams2.x = (i15 + i10) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[i13];
                int i17 = ((i16 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i17 >= 0) {
                        layoutParams2.y = i17;
                    } else {
                        layoutParams2.y = i18;
                    }
                } else if (measuredHeight + i18 <= rect.height()) {
                    layoutParams2.y = i18;
                } else {
                    layoutParams2.y = i17;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f43891i) {
                j10 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = 15000;
                }
                j10 = j8 - longPressTimeout;
            }
            q1 q1Var = this.f43887e;
            view.removeCallbacks(q1Var);
            view.postDelayed(q1Var, j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            q.s1 r4 = r3.f43890h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f43891i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f43883a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f43892j = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            q.s1 r4 = r3.f43890h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f43892j
            if (r1 != 0) goto L66
            int r1 = r3.f43888f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f43885c
            if (r1 > r2) goto L66
            int r1 = r3.f43889g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f43888f = r4
            r3.f43889g = r5
            r3.f43892j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.r1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f43888f = view.getWidth() / 2;
        this.f43889g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

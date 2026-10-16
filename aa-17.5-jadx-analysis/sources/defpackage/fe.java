package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fe extends er implements LayoutInflater.Factory2, he {
    private static final aat K = new aat(0);
    private static final int[] L = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    public fc B;
    public boolean C;
    boolean D;
    public int E;
    public boolean F;
    public int G;
    public Rect H;
    public Rect I;
    private CharSequence M;
    private fd N;
    private boolean O;
    private TextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private fc[] T;
    private boolean U;
    private boolean V;
    private Configuration W;
    private int X;
    private int Y;
    private boolean Z;
    private ez aa;
    private ez ab;
    private boolean ad;
    private AppCompatViewInflater ae;
    private OnBackInvokedDispatcher af;
    private OnBackInvokedCallback ag;
    private fd ah;
    final Object j;
    final Context k;
    public Window l;
    public ew m;
    ef n;
    MenuInflater o;
    public kf p;
    gl q;
    public ActionBarContextView r;
    public PopupWindow s;
    public Runnable t;
    public ViewGroup v;
    boolean w;
    boolean x;
    public boolean y;
    boolean z;
    public erb J = null;
    public boolean u = true;
    private final Runnable ac = new ap(this, 16, null);

    public fe(Context context, Window window, Object obj) {
        ep epVar = null;
        this.X = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof ep)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        epVar = (ep) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (epVar != null) {
                this.X = ((fe) epVar.p()).X;
            }
        }
        if (this.X == -100) {
            aat aatVar = K;
            Integer num = (Integer) aatVar.get(this.j.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                aatVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        jc.f();
    }

    private final ez T(Context context) {
        if (this.ab == null) {
            this.ab = new ex(this, context);
        }
        return this.ab;
    }

    private final ez U(Context context) {
        if (this.aa == null) {
            if (ncp.d == null) {
                Context applicationContext = context.getApplicationContext();
                ncp.d = new ncp(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.aa = new fa(this, ncp.d);
        }
        return this.aa;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V(android.view.Window r5) {
        /*
            r4 = this;
            android.view.Window r0 = r4.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L60
            android.view.Window$Callback r0 = r5.getCallback()
            boolean r2 = r0 instanceof defpackage.ew
            if (r2 != 0) goto L5a
            ew r1 = new ew
            r1.<init>(r4, r0)
            r4.m = r1
            r5.setCallback(r1)
            android.content.Context r0 = r4.k
            int[] r1 = defpackage.fe.L
            lah r2 = new lah
            r3 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r3, r1)
            r2.<init>(r0, r1)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r2.t(r0)
            if (r0 == 0) goto L30
            r5.setBackgroundDrawable(r0)
        L30:
            r2.w()
            r4.l = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r5 < r0) goto L59
            android.window.OnBackInvokedDispatcher r5 = r4.af
            if (r5 != 0) goto L59
            java.lang.Object r5 = r4.j
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L54
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L54
            android.window.OnBackInvokedDispatcher r5 = defpackage.ag$$ExternalSyntheticApiModelOutline0.m(r5)
            r4.af = r5
            goto L56
        L54:
            r4.af = r3
        L56:
            r4.J()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L60:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.V(android.view.Window):void");
    }

    private final void W() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void X() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        if (this.w && this.n == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.n = new fr((Activity) obj, this.x);
            } else if (obj instanceof Dialog) {
                this.n = new fr((Dialog) obj);
            }
            ef efVar = this.n;
            if (efVar != null) {
                efVar.f(this.ad);
            }
        }
    }

    private final void Y(int i2) {
        this.G = (1 << i2) | this.G;
        if (this.F) {
            return;
        }
        View decorView = this.l.getDecorView();
        Runnable runnable = this.ac;
        int[] iArr = ebm.a;
        decorView.postOnAnimation(runnable);
        this.F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z(defpackage.fc r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.Z(fc, android.view.KeyEvent):void");
    }

    private final void aa() {
        if (this.O) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final dwa A(Context context) {
        dwa dwaVar;
        dwa dwaVarB;
        if (Build.VERSION.SDK_INT >= 33 || (dwaVar = er.c) == null) {
            return null;
        }
        dwa dwaVarC = dwa.c(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (dwaVar.f()) {
            dwaVarB = dwa.a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < dwaVar.a() + dwaVarC.a()) {
                Locale localeE = i2 < dwaVar.a() ? dwaVar.e(i2) : dwaVarC.e(i2 - dwaVar.a());
                if (localeE != null) {
                    linkedHashSet.add(localeE);
                }
                i2++;
            }
            dwaVarB = dwa.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return dwaVarB.f() ? dwaVarC : dwaVarB;
    }

    final CharSequence B() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.M;
    }

    final void C(int i2, fc fcVar, Menu menu) {
        if (menu == null) {
            menu = fcVar.h;
        }
        if (fcVar.m && !this.D) {
            ew ewVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                ewVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                ewVar.b = false;
            }
        }
    }

    final void D(hg hgVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.p.a();
        Window.Callback callbackZ = z();
        if (callbackZ != null && !this.D) {
            callbackZ.onPanelClosed(108, hgVar);
        }
        this.S = false;
    }

    final void E(fc fcVar, boolean z) {
        ViewGroup viewGroup;
        kf kfVar;
        if (z && fcVar.a == 0 && (kfVar = this.p) != null && kfVar.s()) {
            D(fcVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && fcVar.m && (viewGroup = fcVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                C(fcVar.a, fcVar, null);
            }
        }
        fcVar.k = false;
        fcVar.l = false;
        fcVar.m = false;
        fcVar.f = null;
        fcVar.n = true;
        if (this.B == fcVar) {
            this.B = null;
        }
        if (fcVar.a == 0) {
            J();
        }
    }

    public final void F(int i2) {
        fc fcVarQ = Q(i2);
        if (fcVarQ.h != null) {
            Bundle bundle = new Bundle();
            fcVarQ.h.o(bundle);
            if (bundle.size() > 0) {
                fcVarQ.p = bundle;
            }
            fcVarQ.h.s();
            fcVarQ.h.clear();
        }
        fcVarQ.o = true;
        fcVarQ.n = true;
        if ((i2 == 108 || i2 == 0) && this.p != null) {
            fc fcVarQ2 = Q(0);
            fcVarQ2.k = false;
            N(fcVarQ2, null);
        }
    }

    public final void G() {
        erb erbVar = this.J;
        if (erbVar != null) {
            erbVar.t();
        }
    }

    public final void H() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.O) {
            return;
        }
        Context piVar = this.k;
        TypedArray typedArrayObtainStyledAttributes = piVar.obtainStyledAttributes(fs.j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            t(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            t(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            t(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            t(10);
        }
        this.z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        W();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(piVar);
        if (this.A) {
            viewGroup = this.y ? (ViewGroup) layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.x = false;
            this.w = false;
        } else if (this.w) {
            TypedValue typedValue = new TypedValue();
            piVar.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                piVar = new pi(piVar, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(piVar).inflate(com.google.android.projection.gearhead.R.layout.abc_screen_toolbar, (ViewGroup) null);
            kf kfVar = (kf) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.decor_content_parent);
            this.p = kfVar;
            kfVar.n(z());
            if (this.x) {
                this.p.c(109);
            }
            if (this.Q) {
                this.p.c(2);
            }
            if (this.R) {
                this.p.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.w + ", windowActionBarOverlay: " + this.x + ", android:windowIsFloating: " + this.z + ", windowActionModeOverlay: " + this.y + ", windowNoTitle: " + this.A + " }");
        }
        dse dseVar = new dse(this, 1);
        int[] iArr = ebm.a;
        ebe.e(viewGroup, dseVar);
        if (this.p == null) {
            this.P = (TextView) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.i = new izj(this);
        this.v = viewGroup;
        CharSequence charSequenceB = B();
        if (!TextUtils.isEmpty(charSequenceB)) {
            kf kfVar2 = this.p;
            if (kfVar2 != null) {
                kfVar2.o(charSequenceB);
            } else {
                ef efVar = this.n;
                if (efVar != null) {
                    efVar.k(charSequenceB);
                } else {
                    TextView textView = this.P;
                    if (textView != null) {
                        textView.setText(charSequenceB);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.k.obtainStyledAttributes(fs.j);
        if (contentFrameLayout2.b == null) {
            contentFrameLayout2.b = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
        if (contentFrameLayout2.c == null) {
            contentFrameLayout2.c = new TypedValue();
        }
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            if (contentFrameLayout2.d == null) {
                contentFrameLayout2.d = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            if (contentFrameLayout2.e == null) {
                contentFrameLayout2.e = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.f == null) {
                contentFrameLayout2.f = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.g == null) {
                contentFrameLayout2.g = new TypedValue();
            }
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.O = true;
        fc fcVarQ = Q(0);
        if (this.D || fcVarQ.h != null) {
            return;
        }
        Y(108);
    }

    @Override // defpackage.he
    public final void I(hg hgVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kf kfVar = this.p;
        if (kfVar == null || !kfVar.p() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.p.r())) {
            fc fcVarQ = Q(0);
            fcVarQ.n = true;
            E(fcVarQ, false);
            Z(fcVarQ, null);
            return;
        }
        Window.Callback callbackZ = z();
        if (this.p.s()) {
            this.p.q();
            if (this.D) {
                return;
            }
            callbackZ.onPanelClosed(108, Q(0).h);
            return;
        }
        if (callbackZ == null || this.D) {
            return;
        }
        if (this.F && (1 & this.G) != 0) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ac;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        fc fcVarQ2 = Q(0);
        hg hgVar2 = fcVarQ2.h;
        if (hgVar2 == null || fcVarQ2.o || !callbackZ.onPreparePanel(0, fcVarQ2.g, hgVar2)) {
            return;
        }
        callbackZ.onMenuOpened(108, fcVarQ2.h);
        this.p.u();
    }

    final void J() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.af == null || (!Q(0).m && this.q == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.ag;
                if (onBackInvokedCallback != null) {
                    this.af.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                    this.ag = null;
                    return;
                }
                return;
            }
            if (this.ag == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.af;
                nf nfVar = new nf(this, 1);
                onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, nfVar);
                this.ag = nfVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean K(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.K(android.view.KeyEvent):boolean");
    }

    public final boolean L() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.U;
        this.U = false;
        fc fcVarQ = Q(0);
        if (fcVarQ.m) {
            if (!z) {
                E(fcVarQ, true);
            }
            return true;
        }
        gl glVar = this.q;
        if (glVar != null) {
            glVar.f();
            return true;
        }
        ef efVarB = b();
        return efVarB != null && efVarB.m();
    }

    @Override // defpackage.he
    public final boolean M(hg hgVar, MenuItem menuItem) {
        fc fcVarY;
        Window.Callback callbackZ = z();
        if (callbackZ == null || this.D || (fcVarY = y(hgVar.a())) == null) {
            return false;
        }
        return callbackZ.onMenuItemSelected(fcVarY.a, menuItem);
    }

    public final boolean N(fc fcVar, KeyEvent keyEvent) {
        kf kfVar;
        kf kfVar2;
        Resources.Theme themeNewTheme;
        kf kfVar3;
        kf kfVar4;
        if (this.D) {
            return false;
        }
        if (fcVar.k) {
            return true;
        }
        fc fcVar2 = this.B;
        if (fcVar2 != null && fcVar2 != fcVar) {
            E(fcVar2, false);
        }
        Window.Callback callbackZ = z();
        if (callbackZ != null) {
            fcVar.g = callbackZ.onCreatePanelView(fcVar.a);
        }
        int i2 = fcVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (kfVar4 = this.p) != null) {
            kfVar4.m();
        }
        if (fcVar.g == null && (!z || !(this.n instanceof fl))) {
            hg hgVar = fcVar.h;
            if (hgVar == null || fcVar.o) {
                if (hgVar == null) {
                    Context context = this.k;
                    if ((i2 == 0 || i2 == 108) && this.p != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.google.android.projection.gearhead.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.google.android.projection.gearhead.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.google.android.projection.gearhead.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            pi piVar = new pi(context, 0);
                            piVar.getTheme().setTo(themeNewTheme);
                            context = piVar;
                        }
                    }
                    hg hgVar2 = new hg(context);
                    hgVar2.b = this;
                    fcVar.a(hgVar2);
                    if (fcVar.h == null) {
                        return false;
                    }
                }
                if (z && (kfVar2 = this.p) != null) {
                    if (this.ah == null) {
                        this.ah = new fd(this, 1);
                    }
                    kfVar2.l(fcVar.h, this.ah);
                }
                fcVar.h.s();
                if (!callbackZ.onCreatePanelMenu(i2, fcVar.h)) {
                    fcVar.a(null);
                    if (z && (kfVar = this.p) != null) {
                        kfVar.l(null, this.ah);
                    }
                    return false;
                }
                fcVar.o = false;
            }
            fcVar.h.s();
            Bundle bundle = fcVar.p;
            if (bundle != null) {
                fcVar.h.n(bundle);
                fcVar.p = null;
            }
            if (!callbackZ.onPreparePanel(0, fcVar.g, fcVar.h)) {
                if (z && (kfVar3 = this.p) != null) {
                    kfVar3.l(null, this.ah);
                }
                fcVar.h.r();
                return false;
            }
            fcVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            fcVar.h.r();
        }
        fcVar.k = true;
        fcVar.l = false;
        this.B = fcVar;
        return true;
    }

    public final boolean O() {
        ViewGroup viewGroup;
        return this.O && (viewGroup = this.v) != null && viewGroup.isLaidOut();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View P(java.lang.String r7, android.content.Context r8, android.util.AttributeSet r9) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.P(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final fc Q(int i2) {
        fc[] fcVarArr = this.T;
        if (fcVarArr == null || fcVarArr.length <= i2) {
            fc[] fcVarArr2 = new fc[i2 + 1];
            if (fcVarArr != null) {
                System.arraycopy(fcVarArr, 0, fcVarArr2, 0, fcVarArr.length);
            }
            this.T = fcVarArr2;
            fcVarArr = fcVarArr2;
        }
        fc fcVar = fcVarArr[i2];
        if (fcVar != null) {
            return fcVar;
        }
        fc fcVar2 = new fc(i2);
        fcVarArr[i2] = fcVar2;
        return fcVar2;
    }

    public final boolean R(fc fcVar, int i2, KeyEvent keyEvent) {
        hg hgVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((fcVar.k || N(fcVar, keyEvent)) && (hgVar = fcVar.h) != null) {
            return hgVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(boolean r11, boolean r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.S(boolean, boolean):void");
    }

    @Override // defpackage.er
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.er
    public final ef b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        X();
        return this.n;
    }

    @Override // defpackage.er
    public final MenuInflater c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.o == null) {
            X();
            ef efVar = this.n;
            this.o = new gr(efVar != null ? efVar.b() : this.k);
        }
        return this.o;
    }

    @Override // defpackage.er
    public final View d(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.er
    public final void e(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof fe) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.er
    public final void g() {
        if (this.n == null || b().n()) {
            return;
        }
        Y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // defpackage.er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.er.g
            monitor-enter(r0)
            defpackage.er.k(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.F
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ac
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.D = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4c
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L4c
            aat r1 = defpackage.fe.K
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5b
        L4c:
            java.lang.Object r0 = r3.j
            aat r1 = defpackage.fe.K
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5b:
            ef r0 = r3.n
            if (r0 == 0) goto L62
            r0.e()
        L62:
            ez r0 = r3.aa
            if (r0 == 0) goto L69
            r0.c()
        L69:
            ez r3 = r3.ab
            if (r3 == 0) goto L70
            r3.c()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.h():void");
    }

    @Override // defpackage.er
    public final void i() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ef efVarB = b();
        if (efVarB != null) {
            efVarB.h(true);
        }
    }

    @Override // defpackage.er
    public final void j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ef efVarB = b();
        if (efVarB != null) {
            efVarB.h(false);
        }
    }

    @Override // defpackage.er
    public final void l(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void m(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void n(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.er
    public final void o(CharSequence charSequence) {
        this.M = charSequence;
        kf kfVar = this.p;
        if (kfVar != null) {
            kfVar.o(charSequence);
            return;
        }
        ef efVar = this.n;
        if (efVar != null) {
            efVar.k(charSequence);
            return;
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(str, context, attributeSet);
    }

    @Override // defpackage.er
    public final void q() throws PackageManager.NameNotFoundException {
        S(true, true);
    }

    @Override // defpackage.er
    public final void r() throws PackageManager.NameNotFoundException {
        String strS;
        this.C = true;
        S(false, true);
        W();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strS = dln.s(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strS = null;
            }
            if (strS != null) {
                ef efVar = this.n;
                if (efVar == null) {
                    this.ad = true;
                } else {
                    efVar.f(true);
                }
            }
            synchronized (er.g) {
                er.k(this);
                er.f.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.k.getResources().getConfiguration());
        this.V = true;
    }

    @Override // defpackage.er
    public final void s() throws PackageManager.NameNotFoundException {
        ef efVarB;
        if (this.w && this.O && (efVarB = b()) != null) {
            efVarB.r();
        }
        Context context = this.k;
        jc.d().e(context);
        this.W = new Configuration(context.getResources().getConfiguration());
        S(false, false);
    }

    @Override // defpackage.er
    public final void t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.A && i2 == 108) {
            return;
        }
        if (this.w && i2 == 1) {
            this.w = false;
        }
        if (i2 == 1) {
            aa();
            this.A = true;
            return;
        }
        if (i2 == 2) {
            aa();
            this.Q = true;
            return;
        }
        if (i2 == 5) {
            aa();
            this.R = true;
            return;
        }
        if (i2 == 10) {
            aa();
            this.y = true;
        } else if (i2 == 108) {
            aa();
            this.w = true;
        } else if (i2 != 109) {
            this.l.requestFeature(i2);
        } else {
            aa();
            this.x = true;
        }
    }

    public final int u() {
        int i2 = this.X;
        return i2 != -100 ? i2 : er.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int v(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.v(android.content.Context, int):int");
    }

    final Context w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ef efVarB = b();
        Context contextB = efVarB != null ? efVarB.b() : null;
        return contextB == null ? this.k : contextB;
    }

    public final Configuration x(Context context, int i2, dwa dwaVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (dwaVar != null) {
            ca.f(configuration2, dwaVar);
        }
        return configuration2;
    }

    final fc y(Menu menu) {
        fc[] fcVarArr = this.T;
        int length = fcVarArr != null ? fcVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            fc fcVar = fcVarArr[i2];
            if (fcVar != null && fcVar.h == menu) {
                return fcVar;
            }
        }
        return null;
    }

    final Window.Callback z() {
        return this.l.getCallback();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return P(str, context, attributeSet);
    }
}

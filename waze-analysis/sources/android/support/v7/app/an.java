package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.bw;
import android.support.v7.widget.gm;
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
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.media3.common.PlaybackException;
import com.a.a.a.a$$ExternalSyntheticApiModelOutline0;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class an extends t implements LayoutInflater.Factory2, android.support.v7.view.menu.o {
    private static final SimpleArrayMap v = new SimpleArrayMap();
    private static final int[] w = {R.attr.windowBackground};
    private static final boolean x = !"robolectric".equals(Build.FINGERPRINT);
    private bw A;
    private aa B;
    private am C;
    private boolean D;
    private boolean E;
    private TextView F;
    private boolean G;
    private boolean H;
    private boolean I;
    private al[] J;
    private al K;
    private boolean L;
    private boolean M;
    private boolean N;
    private Configuration O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private ai T;
    private ai U;
    private final Runnable V;
    private boolean W;
    private Rect X;
    private Rect Y;
    private AppCompatViewInflater Z;
    private OnBackInvokedDispatcher aa;
    private OnBackInvokedCallback ab;

    /* renamed from: c, reason: collision with root package name */
    final Object f529c;

    /* renamed from: d, reason: collision with root package name */
    final Context f530d;

    /* renamed from: e, reason: collision with root package name */
    Window f531e;

    /* renamed from: f, reason: collision with root package name */
    MenuInflater f532f;

    /* renamed from: g, reason: collision with root package name */
    android.support.v7.view.b f533g;

    /* renamed from: h, reason: collision with root package name */
    ActionBarContextView f534h;

    /* renamed from: i, reason: collision with root package name */
    PopupWindow f535i;

    /* renamed from: j, reason: collision with root package name */
    Runnable f536j;

    /* renamed from: k, reason: collision with root package name */
    ViewPropertyAnimatorCompat f537k;

    /* renamed from: l, reason: collision with root package name */
    ViewGroup f538l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    android.support.a.i u;
    private af y;
    private CharSequence z;

    private an(Context context, Window window, Object obj) {
        o oVar = null;
        this.f537k = null;
        this.D = true;
        this.P = -100;
        this.V = new u(this);
        this.f530d = context;
        this.f529c = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof o)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        oVar = (o) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (oVar != null) {
                this.P = ((an) oVar.d()).P;
            }
        }
        if (this.P == -100) {
            SimpleArrayMap simpleArrayMap = v;
            Integer num = (Integer) simpleArrayMap.get(this.f529c.getClass().getName());
            if (num != null) {
                this.P = num.intValue();
                simpleArrayMap.remove(this.f529c.getClass().getName());
            }
        }
        if (window != null) {
            ad(window);
        }
        android.support.v7.widget.ae.g();
    }

    static final LocaleListCompat W(Context context) {
        LocaleListCompat localeListCompatF;
        LocaleListCompat localeListCompatCreate;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompatF = f()) == null) {
            return null;
        }
        LocaleListCompat localeListCompatA = ad.a(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompatF.isEmpty()) {
            localeListCompatCreate = LocaleListCompat.getEmptyLocaleList();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < localeListCompatF.size() + localeListCompatA.size()) {
                Locale locale = i2 < localeListCompatF.size() ? localeListCompatF.get(i2) : localeListCompatA.get(i2 - localeListCompatF.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            localeListCompatCreate = LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return localeListCompatCreate.isEmpty() ? localeListCompatA : localeListCompatCreate;
    }

    private final int aa() {
        int i2 = this.P;
        return i2 != -100 ? i2 : a();
    }

    private final ai ab(Context context) {
        if (this.U == null) {
            this.U = new ag(this, context);
        }
        return this.U;
    }

    private final ai ac(Context context) {
        if (this.T == null) {
            this.T = new aj(this, au.a(context));
        }
        return this.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ad(android.view.Window r4) {
        /*
            r3 = this;
            android.view.Window r0 = r3.f531e
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L5b
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof android.support.v7.app.af
            if (r2 != 0) goto L55
            android.support.v7.app.af r1 = new android.support.v7.app.af
            r1.<init>(r3, r0)
            r3.y = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.f530d
            int[] r1 = android.support.v7.app.an.w
            r2 = 0
            android.support.v7.widget.gc r0 = android.support.v7.widget.gc.m(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.k(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.q()
            r3.f531e = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L54
            android.window.OnBackInvokedDispatcher r4 = r3.aa
            if (r4 != 0) goto L54
            java.lang.Object r4 = r3.f529c
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L4f
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedDispatcher r4 = com.a.a.a.a$$ExternalSyntheticApiModelOutline0.m(r4)
            r3.aa = r4
            goto L51
        L4f:
            r3.aa = r2
        L51:
            r3.P()
        L54:
            return
        L55:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.an.ad(android.view.Window):void");
    }

    private final void ae() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context contextThemeWrapper = this.f530d;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(android.support.v7.a.a.f488j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            A(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            A(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            A(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            A(10);
        }
        this.p = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        af();
        this.f531e.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        if (this.q) {
            viewGroup = this.o ? (ViewGroup) layoutInflaterFrom.inflate(com.waze.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.waze.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.p) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.waze.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.n = false;
            this.m = false;
        } else if (this.m) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(com.waze.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, typedValue.resourceId);
            }
            viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(com.waze.R.layout.abc_screen_toolbar, (ViewGroup) null);
            bw bwVar = (bw) viewGroup.findViewById(com.waze.R.id.decor_content_parent);
            this.A = bwVar;
            bwVar.j(H());
            if (this.n) {
                this.A.c(109);
            }
            if (this.G) {
                this.A.c(2);
            }
            if (this.H) {
                this.A.c(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.m + ", windowActionBarOverlay: " + this.n + ", android:windowIsFloating: " + this.p + ", windowActionModeOverlay: " + this.o + ", windowNoTitle: " + this.q + " }");
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new v(this));
        if (this.A == null) {
            this.F = (TextView) viewGroup.findViewById(com.waze.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.waze.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f531e.findViewById(R.id.content);
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
        this.f531e.setContentView(viewGroup);
        contentFrameLayout.g(new w(this));
        this.f538l = viewGroup;
        Object obj = this.f529c;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.z;
        if (!TextUtils.isEmpty(title)) {
            bw bwVar2 = this.A;
            if (bwVar2 != null) {
                bwVar2.k(title);
            } else {
                android.support.a.i iVar = this.u;
                if (iVar != null) {
                    iVar.i(title);
                } else {
                    TextView textView = this.F;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f538l.findViewById(R.id.content);
        View decorView = this.f531e.getDecorView();
        contentFrameLayout2.h(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = this.f530d.obtainStyledAttributes(android.support.v7.a.a.f488j);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.e());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.f());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.c());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.d());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.a());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.b());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        al alVarX = X(0);
        if (this.r || alVarX.f523h != null) {
            return;
        }
        ah(108);
    }

    private final void af() {
        if (this.f531e == null) {
            Object obj = this.f529c;
            if (obj instanceof Activity) {
                ad(((Activity) obj).getWindow());
            }
        }
        if (this.f531e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void ag() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        if (this.m && this.u == null) {
            Object obj = this.f529c;
            if (obj instanceof Activity) {
                this.u = new az((Activity) obj, this.n);
            } else if (obj instanceof Dialog) {
                this.u = new az((Dialog) obj);
            }
            android.support.a.i iVar = this.u;
            if (iVar != null) {
                iVar.g(this.W);
            }
        }
    }

    private final void ah(int i2) {
        this.t = (1 << i2) | this.t;
        if (this.s) {
            return;
        }
        ViewCompat.postOnAnimation(this.f531e.getDecorView(), this.V);
        this.s = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ai(android.support.v7.app.al r14, android.view.KeyEvent r15) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.an.ai(android.support.v7.app.al, android.view.KeyEvent):void");
    }

    private final void aj() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final boolean ak(al alVar, KeyEvent keyEvent) {
        bw bwVar;
        bw bwVar2;
        Resources.Theme themeNewTheme;
        bw bwVar3;
        bw bwVar4;
        if (this.r) {
            return false;
        }
        if (alVar.f526k) {
            return true;
        }
        al alVar2 = this.K;
        if (alVar2 != null && alVar2 != alVar) {
            K(alVar2, false);
        }
        Window.Callback callbackH = H();
        if (callbackH != null) {
            alVar.f522g = callbackH.onCreatePanelView(alVar.f516a);
        }
        int i2 = alVar.f516a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (bwVar4 = this.A) != null) {
            bwVar4.i();
        }
        if (alVar.f522g == null) {
            android.support.v7.view.menu.q qVar = alVar.f523h;
            if (qVar == null || alVar.o) {
                if (qVar == null) {
                    Context context = this.f530d;
                    if ((i2 == 0 || i2 == 108) && this.A != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.waze.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.waze.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.waze.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                    }
                    android.support.v7.view.menu.q qVar2 = new android.support.v7.view.menu.q(context);
                    qVar2.t(this);
                    alVar.a(qVar2);
                    if (alVar.f523h == null) {
                        return false;
                    }
                }
                if (z && (bwVar2 = this.A) != null) {
                    if (this.B == null) {
                        this.B = new aa(this);
                    }
                    bwVar2.h(alVar.f523h, this.B);
                }
                alVar.f523h.x();
                if (!callbackH.onCreatePanelMenu(i2, alVar.f523h)) {
                    alVar.a(null);
                    if (z && (bwVar = this.A) != null) {
                        bwVar.h(null, this.B);
                    }
                    return false;
                }
                alVar.o = false;
            }
            alVar.f523h.x();
            Bundle bundle = alVar.p;
            if (bundle != null) {
                alVar.f523h.r(bundle);
                alVar.p = null;
            }
            if (!callbackH.onPreparePanel(0, alVar.f522g, alVar.f523h)) {
                if (z && (bwVar3 = this.A) != null) {
                    bwVar3.h(null, this.B);
                }
                alVar.f523h.w();
                return false;
            }
            alVar.f523h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            alVar.f523h.w();
        }
        alVar.f526k = true;
        alVar.f527l = false;
        this.K = alVar;
        return true;
    }

    private static final Configuration al(Context context, int i2, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            ad.b(configuration2, localeListCompat);
        }
        return configuration2;
    }

    private final boolean am(al alVar, int i2, KeyEvent keyEvent) {
        android.support.v7.view.menu.q qVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((alVar.f526k || ak(alVar, keyEvent)) && (qVar = alVar.f523h) != null) {
            return qVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    private final void an(boolean z) throws PackageManager.NameNotFoundException {
        ao(z, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ao(boolean r10, boolean r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.an.ao(boolean, boolean):void");
    }

    @Override // android.support.v7.app.t
    public final void A(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.q && i2 == 108) {
            return;
        }
        if (this.m && i2 == 1) {
            this.m = false;
        }
        if (i2 == 1) {
            aj();
            this.q = true;
            return;
        }
        if (i2 == 2) {
            aj();
            this.G = true;
            return;
        }
        if (i2 == 5) {
            aj();
            this.H = true;
            return;
        }
        if (i2 == 10) {
            aj();
            this.o = true;
        } else if (i2 == 108) {
            aj();
            this.m = true;
        } else if (i2 != 109) {
            this.f531e.requestFeature(i2);
        } else {
            aj();
            this.n = true;
        }
    }

    @Override // android.support.v7.app.t
    public final void B() throws PackageManager.NameNotFoundException {
        android.support.a.i iVarC;
        if (this.m && this.E && (iVarC = C()) != null) {
            iVarC.j();
        }
        Context context = this.f530d;
        android.support.v7.widget.ae.e().f(context);
        this.O = new Configuration(context.getResources().getConfiguration());
        ao(false, false);
    }

    @Override // android.support.v7.app.t
    public final android.support.a.i C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ag();
        return this.u;
    }

    final int D(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return ac(context).a();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return ab(context).a();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    final Context E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        android.support.a.i iVarC = C();
        Context contextE = iVarC != null ? iVarC.e() : null;
        return contextE == null ? this.f530d : contextE;
    }

    final al F(Menu menu) {
        al[] alVarArr = this.J;
        int length = alVarArr != null ? alVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            al alVar = alVarArr[i2];
            if (alVar != null && alVar.f523h == menu) {
                return alVar;
            }
        }
        return null;
    }

    final android.support.v7.view.b G(android.support.v7.view.a aVar) {
        N();
        android.support.v7.view.b bVar = this.f533g;
        if (bVar != null) {
            bVar.f();
        }
        if (this.f534h == null) {
            if (this.p) {
                TypedValue typedValue = new TypedValue();
                Context context = this.f530d;
                Resources.Theme theme = context.getTheme();
                theme.resolveAttribute(com.waze.R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                    themeNewTheme.applyStyle(typedValue.resourceId, true);
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                    contextThemeWrapper.getTheme().setTo(themeNewTheme);
                    context = contextThemeWrapper;
                }
                this.f534h = new ActionBarContextView(context);
                PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.waze.R.attr.actionModePopupWindowStyle);
                this.f535i = popupWindow;
                PopupWindowCompat.setWindowLayoutType(popupWindow, 2);
                this.f535i.setContentView(this.f534h);
                this.f535i.setWidth(-1);
                context.getTheme().resolveAttribute(com.waze.R.attr.actionBarSize, typedValue, true);
                this.f534h.d(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                this.f535i.setHeight(-2);
                this.f536j = new y(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f538l.findViewById(com.waze.R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.b(LayoutInflater.from(E()));
                    this.f534h = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.f534h != null) {
            N();
            this.f534h.l();
            android.support.v7.view.d dVar = new android.support.v7.view.d(this.f534h.getContext(), this.f534h, aVar);
            if (aVar.c(dVar, dVar.a())) {
                dVar.g();
                this.f534h.k(dVar);
                this.f533g = dVar;
                boolean zV = V();
                ActionBarContextView actionBarContextView = this.f534h;
                if (zV) {
                    actionBarContextView.setAlpha(0.0f);
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(this.f534h);
                    viewPropertyAnimatorCompatAnimate.alpha(1.0f);
                    this.f537k = viewPropertyAnimatorCompatAnimate;
                    viewPropertyAnimatorCompatAnimate.setListener(new z(this));
                } else {
                    actionBarContextView.setAlpha(1.0f);
                    this.f534h.setVisibility(0);
                    if (this.f534h.getParent() instanceof View) {
                        ViewCompat.requestApplyInsets((View) this.f534h.getParent());
                    }
                }
                if (this.f535i != null) {
                    this.f531e.getDecorView().post(this.f536j);
                }
            } else {
                this.f533g = null;
            }
        }
        P();
        return this.f533g;
    }

    final Window.Callback H() {
        return this.f531e.getCallback();
    }

    final void I(int i2, al alVar, Menu menu) {
        if (menu == null) {
            menu = alVar.f523h;
        }
        if (alVar.m && !this.r) {
            this.y.b(this.f531e.getCallback(), i2, menu);
        }
    }

    final void J(android.support.v7.view.menu.q qVar) {
        if (this.I) {
            return;
        }
        this.I = true;
        this.A.a();
        Window.Callback callbackH = H();
        if (callbackH != null && !this.r) {
            callbackH.onPanelClosed(108, qVar);
        }
        this.I = false;
    }

    final void K(al alVar, boolean z) {
        ViewGroup viewGroup;
        bw bwVar;
        if (z && alVar.f516a == 0 && (bwVar = this.A) != null && bwVar.p()) {
            J(alVar.f523h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f530d.getSystemService("window");
        if (windowManager != null && alVar.m && (viewGroup = alVar.f520e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                I(alVar.f516a, alVar, null);
            }
        }
        alVar.f526k = false;
        alVar.f527l = false;
        alVar.m = false;
        alVar.f521f = null;
        alVar.n = true;
        if (this.K == alVar) {
            this.K = null;
        }
        if (alVar.f516a == 0) {
            P();
        }
    }

    final void L() {
        bw bwVar = this.A;
        if (bwVar != null) {
            bwVar.a();
        }
        if (this.f535i != null) {
            this.f531e.getDecorView().removeCallbacks(this.f536j);
            if (this.f535i.isShowing()) {
                try {
                    this.f535i.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f535i = null;
        }
        N();
        android.support.v7.view.menu.q qVar = X(0).f523h;
        if (qVar != null) {
            qVar.close();
        }
    }

    final void M(int i2) {
        al alVarX = X(i2);
        if (alVarX.f523h != null) {
            Bundle bundle = new Bundle();
            alVarX.f523h.s(bundle);
            if (bundle.size() > 0) {
                alVarX.p = bundle;
            }
            alVarX.f523h.x();
            alVarX.f523h.clear();
        }
        alVarX.o = true;
        alVarX.n = true;
        if ((i2 == 108 || i2 == 0) && this.A != null) {
            al alVarX2 = X(0);
            alVarX2.f526k = false;
            ak(alVarX2, null);
        }
    }

    final void N() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f537k;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    @Override // android.support.v7.view.menu.o
    public final void O(android.support.v7.view.menu.q qVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bw bwVar = this.A;
        if (bwVar == null || !bwVar.l() || (ViewConfiguration.get(this.f530d).hasPermanentMenuKey() && !this.A.o())) {
            al alVarX = X(0);
            alVarX.n = true;
            K(alVarX, false);
            ai(alVarX, null);
            return;
        }
        Window.Callback callbackH = H();
        if (this.A.p()) {
            this.A.m();
            if (this.r) {
                return;
            }
            callbackH.onPanelClosed(108, X(0).f523h);
            return;
        }
        if (callbackH == null || this.r) {
            return;
        }
        if (this.s && (1 & this.t) != 0) {
            View decorView = this.f531e.getDecorView();
            Runnable runnable = this.V;
            decorView.removeCallbacks(runnable);
            runnable.run();
        }
        al alVarX2 = X(0);
        android.support.v7.view.menu.q qVar2 = alVarX2.f523h;
        if (qVar2 == null || alVarX2.o || !callbackH.onPreparePanel(0, alVarX2.f522g, qVar2)) {
            return;
        }
        callbackH.onMenuOpened(108, alVarX2.f523h);
        this.A.q();
    }

    final void P() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.aa != null && (X(0).m || this.f533g != null)) {
                if (this.ab == null) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = this.aa;
                    Objects.requireNonNull(this);
                    OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: android.support.v7.app.ae
                        public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                            this.f503a.S();
                        }
                    };
                    a$$ExternalSyntheticApiModelOutline0.m13488m((Object) onBackInvokedDispatcher).registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, onBackInvokedCallback);
                    this.ab = onBackInvokedCallback;
                    return;
                }
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback2 = this.ab;
            if (onBackInvokedCallback2 != null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.aa;
                a$$ExternalSyntheticApiModelOutline0.m13488m((Object) onBackInvokedDispatcher2).unregisterOnBackInvokedCallback(a$$ExternalSyntheticApiModelOutline0.m13487m((Object) onBackInvokedCallback2));
                this.ab = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean Q(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.an.Q(android.view.KeyEvent):boolean");
    }

    public final boolean R() {
        return this.D;
    }

    final boolean S() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gm gmVar;
        boolean z = this.L;
        this.L = false;
        al alVarX = X(0);
        if (alVarX.m) {
            if (!z) {
                K(alVarX, true);
            }
            return true;
        }
        android.support.v7.view.b bVar = this.f533g;
        if (bVar != null) {
            bVar.f();
            return true;
        }
        android.support.a.i iVarC = C();
        if (iVarC == null || (gmVar = ((az) iVarC).p) == null || !gmVar.i()) {
            return false;
        }
        gmVar.d();
        return true;
    }

    final boolean T(int i2, KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ay ayVar;
        android.support.a.i iVarC = C();
        if (iVarC != null && (ayVar = ((az) iVarC).f569f) != null) {
            Menu menuA = ayVar.a();
            menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            if (menuA.performShortcut(i2, keyEvent, 0)) {
                return true;
            }
        }
        al alVar = this.K;
        if (alVar != null && am(alVar, keyEvent.getKeyCode(), keyEvent)) {
            al alVar2 = this.K;
            if (alVar2 != null) {
                alVar2.f527l = true;
            }
            return true;
        }
        if (this.K == null) {
            al alVarX = X(0);
            ak(alVarX, keyEvent);
            boolean zAm = am(alVarX, keyEvent.getKeyCode(), keyEvent);
            alVarX.f526k = false;
            if (zAm) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.o
    public final boolean U(android.support.v7.view.menu.q qVar, MenuItem menuItem) {
        al alVarF;
        Window.Callback callbackH = H();
        if (callbackH == null || this.r || (alVarF = F(qVar.b())) == null) {
            return false;
        }
        return callbackH.onMenuItemSelected(alVarF.f516a, menuItem);
    }

    final boolean V() {
        ViewGroup viewGroup;
        return this.E && (viewGroup = this.f538l) != null && viewGroup.isLaidOut();
    }

    protected final al X(int i2) {
        al[] alVarArr = this.J;
        if (alVarArr == null || alVarArr.length <= i2) {
            al[] alVarArr2 = new al[i2 + 1];
            if (alVarArr != null) {
                System.arraycopy(alVarArr, 0, alVarArr2, 0, alVarArr.length);
            }
            this.J = alVarArr2;
            alVarArr = alVarArr2;
        }
        al alVar = alVarArr[i2];
        if (alVar != null) {
            return alVar;
        }
        al alVar2 = new al(i2);
        alVarArr[i2] = alVar2;
        return alVar2;
    }

    final int Y(WindowInsetsCompat windowInsetsCompat) {
        Insets insets;
        boolean z;
        boolean z2 = false;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        ActionBarContextView actionBarContextView = this.f534h;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f534h.getLayoutParams();
            if (this.f534h.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect = this.X;
                Rect rect2 = this.Y;
                if (windowInsetsCompat == null) {
                    rect.set(null);
                    insets = Insets.NONE;
                } else {
                    rect.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    insets = windowInsetsCompat.getInsets(2);
                }
                android.graphics.Insets systemWindowInsets = this.f538l.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(android.graphics.Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                Insets insetsOf = Insets.of(Math.max(0, insets.left - rect2.left), Math.max(0, insets.top - rect2.top), Math.max(0, insets.right - rect2.right), Math.max(0, insets.bottom - rect2.bottom));
                if (marginLayoutParams.leftMargin == insetsOf.left && marginLayoutParams.rightMargin == insetsOf.right) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = insetsOf.left;
                    marginLayoutParams.rightMargin = insetsOf.right;
                    z = true;
                }
                this.f534h.r(rect.left - insetsOf.left, rect.top, rect.right - insetsOf.right);
                if (!this.o && rect.top > 0) {
                    systemWindowInsetTop = 0;
                }
                z2 = z;
            }
            if (z2) {
                this.f534h.setLayoutParams(marginLayoutParams);
            }
        }
        return systemWindowInsetTop;
    }

    public final View Z(String str, Context context, AttributeSet attributeSet) {
        AppCompatViewInflater appCompatViewInflater = this.Z;
        if (appCompatViewInflater == null) {
            Context context2 = this.f530d;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(android.support.v7.a.a.f488j);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                appCompatViewInflater = new AppCompatViewInflater();
                this.Z = appCompatViewInflater;
            } else {
                try {
                    appCompatViewInflater = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.Z = appCompatViewInflater;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                    this.Z = appCompatViewInflater;
                }
            }
        }
        return appCompatViewInflater.f(str, context, attributeSet);
    }

    @Override // android.support.v7.app.t
    public final Context b(Context context) {
        this.M = true;
        int iD = D(context, aa());
        if (w(context)) {
            v(context);
        }
        LocaleListCompat localeListCompatW = W(context);
        Configuration configuration = null;
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(al(context, iD, localeListCompatW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(al(context, iD, localeListCompatW, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (x) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration.mnc = configuration4.mnc;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration.screenLayout |= configuration4.screenLayout & 768;
                    }
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration.densityDpi = configuration4.densityDpi;
                    }
                }
            }
            Configuration configurationAl = al(context, iD, localeListCompatW, configuration, true);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2131952483);
            contextThemeWrapper.applyOverrideConfiguration(configurationAl);
            try {
                if (context.getTheme() != null) {
                    ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            return contextThemeWrapper;
        }
        return context;
    }

    @Override // android.support.v7.app.t
    public final Context c() {
        return this.f530d;
    }

    @Override // android.support.v7.app.t
    public final MenuInflater d() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f532f == null) {
            ag();
            android.support.a.i iVar = this.u;
            this.f532f = new android.support.v7.view.i(iVar != null ? iVar.e() : this.f530d);
        }
        return this.f532f;
    }

    @Override // android.support.v7.app.t
    public final View e(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        return this.f531e.findViewById(i2);
    }

    @Override // android.support.v7.app.t
    public final void h(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        ((ViewGroup) this.f538l.findViewById(R.id.content)).addView(view, layoutParams);
        this.y.a(this.f531e.getCallback());
    }

    @Override // android.support.v7.app.t
    public final void i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f530d);
        if (layoutInflaterFrom.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof an) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.v7.app.t
    public final void j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.u != null) {
            C();
            ah(0);
        }
    }

    @Override // android.support.v7.app.t
    public final void l() {
        Object obj = this.f529c;
        boolean z = obj instanceof Activity;
        if (z) {
            o(this);
        }
        if (this.s) {
            this.f531e.getDecorView().removeCallbacks(this.V);
        }
        this.r = true;
        if (this.P != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            v.put(obj.getClass().getName(), Integer.valueOf(this.P));
        } else {
            v.remove(obj.getClass().getName());
        }
        ai aiVar = this.T;
        if (aiVar != null) {
            aiVar.d();
        }
        ai aiVar2 = this.U;
        if (aiVar2 != null) {
            aiVar2.d();
        }
    }

    @Override // android.support.v7.app.t
    public final void m() throws PackageManager.NameNotFoundException {
        ao(true, false);
    }

    @Override // android.support.v7.app.t
    public final void n() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        android.support.a.i iVarC = C();
        if (iVarC != null) {
            iVarC.h(false);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return Z(str, context, attributeSet);
    }

    @Override // android.support.v7.app.t
    public final void p(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.f538l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f530d).inflate(i2, viewGroup);
        this.y.a(this.f531e.getCallback());
    }

    @Override // android.support.v7.app.t
    public final void q(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.f538l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.y.a(this.f531e.getCallback());
    }

    @Override // android.support.v7.app.t
    public final void r(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
        ViewGroup viewGroup = (ViewGroup) this.f538l.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.y.a(this.f531e.getCallback());
    }

    @Override // android.support.v7.app.t
    public final void t(int i2) {
        this.Q = i2;
    }

    @Override // android.support.v7.app.t
    public final void u(CharSequence charSequence) {
        this.z = charSequence;
        bw bwVar = this.A;
        if (bwVar != null) {
            bwVar.k(charSequence);
            return;
        }
        android.support.a.i iVar = this.u;
        if (iVar != null) {
            iVar.i(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.t
    public final void x() throws PackageManager.NameNotFoundException {
        an(true);
    }

    @Override // android.support.v7.app.t
    public final void y() throws PackageManager.NameNotFoundException {
        String parentActivityName;
        this.M = true;
        an(false);
        af();
        Object obj = this.f529c;
        if (obj instanceof Activity) {
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                android.support.a.i iVar = this.u;
                if (iVar == null) {
                    this.W = true;
                } else {
                    iVar.g(true);
                }
            }
            g(this);
        }
        this.O = new Configuration(this.f530d.getResources().getConfiguration());
        this.N = true;
    }

    @Override // android.support.v7.app.t
    public final void z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ae();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return Z(str, context, attributeSet);
    }

    an(Dialog dialog) {
        this(dialog.getContext(), dialog.getWindow(), dialog);
    }

    an(Activity activity) {
        this(activity, null, activity);
    }
}

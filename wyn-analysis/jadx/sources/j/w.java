package j;

import X0.AbstractC1277e;
import ac.C1346a;
import ad.L;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import g1.C2668d;
import g1.InterfaceC2670f;
import i.AbstractC2820a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import k1.X;
import o.AbstractC3620a;
import o.C3623d;
import o.C3628i;
import q.C3808e;
import q.C3816i;
import q.C3830p;
import q.InterfaceC3817i0;
import q.InterfaceC3819j0;
import q.j1;
import q.o1;
import q.v1;
import x.C4429v;

/* loaded from: classes.dex */
public final class w extends l implements p.i, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final C4429v f38501h0 = new C4429v(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f38502i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f38503j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f38504k0 = true;

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f38505A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f38506B;

    /* renamed from: C, reason: collision with root package name */
    public View f38507C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f38508D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f38509E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38510F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38511G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f38512H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38513I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f38514J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38515K;
    public v[] L;

    /* renamed from: M, reason: collision with root package name */
    public v f38516M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38517N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38518O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f38519P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f38520Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f38521R;

    /* renamed from: S, reason: collision with root package name */
    public final int f38522S;

    /* renamed from: T, reason: collision with root package name */
    public int f38523T;

    /* renamed from: U, reason: collision with root package name */
    public int f38524U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f38525V;

    /* renamed from: W, reason: collision with root package name */
    public t f38526W;

    /* renamed from: X, reason: collision with root package name */
    public t f38527X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f38528Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f38529Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f38531b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f38532c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f38533d0;

    /* renamed from: e0, reason: collision with root package name */
    public z f38534e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f38535f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f38536g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f38537j;
    public final Context k;

    /* renamed from: l, reason: collision with root package name */
    public Window f38538l;

    /* renamed from: m, reason: collision with root package name */
    public s f38539m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f38540n;

    /* renamed from: o, reason: collision with root package name */
    public H f38541o;

    /* renamed from: p, reason: collision with root package name */
    public C3628i f38542p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f38543q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC3817i0 f38544r;

    /* renamed from: s, reason: collision with root package name */
    public a2.v f38545s;

    /* renamed from: t, reason: collision with root package name */
    public L f38546t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC3620a f38547u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f38548v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f38549w;

    /* renamed from: x, reason: collision with root package name */
    public m f38550x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f38552z;

    /* renamed from: y, reason: collision with root package name */
    public X f38551y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final m f38530a0 = new m(this, 0);

    public w(Context context, Window window, i iVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.f38522S = -100;
        this.k = context;
        this.f38540n = iVar;
        this.f38537j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f38522S = ((w) appCompatActivity.C()).f38522S;
            }
        }
        if (this.f38522S == -100) {
            C4429v c4429v = f38501h0;
            Integer num = (Integer) c4429v.get(this.f38537j.getClass().getName());
            if (num != null) {
                this.f38522S = num.intValue();
                c4429v.remove(this.f38537j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C3830p.d();
    }

    public static C2668d o(Context context) {
        C2668d c2668d;
        C2668d c2668dB;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 || (c2668d = l.f38466c) == null) {
            return null;
        }
        C2668d c2668dY = y(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC2670f interfaceC2670f = c2668d.f35497a;
        int i10 = 0;
        if (i5 < 24) {
            c2668dB = interfaceC2670f.isEmpty() ? C2668d.f35496b : C2668d.b(interfaceC2670f.get(0).toString());
        } else if (interfaceC2670f.isEmpty()) {
            c2668dB = C2668d.f35496b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i10 < c2668dY.f35497a.size() + interfaceC2670f.size()) {
                Locale locale = i10 < interfaceC2670f.size() ? interfaceC2670f.get(i10) : c2668dY.f35497a.get(i10 - interfaceC2670f.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            c2668dB = C2668d.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c2668dB.f35497a.isEmpty() ? c2668dY : c2668dB;
    }

    public static Configuration s(Context context, int i5, C2668d c2668d, Configuration configuration, boolean z2) {
        int i10 = i5 != 1 ? i5 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (c2668d != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                q.d(configuration2, c2668d);
                return configuration2;
            }
            InterfaceC2670f interfaceC2670f = c2668d.f35497a;
            o.b(configuration2, interfaceC2670f.get(0));
            o.a(configuration2, interfaceC2670f.get(0));
        }
        return configuration2;
    }

    public static C2668d y(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? q.b(configuration) : C2668d.b(p.a(configuration.locale));
    }

    public final v A(int i5) {
        v[] vVarArr = this.L;
        if (vVarArr == null || vVarArr.length <= i5) {
            v[] vVarArr2 = new v[i5 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.L = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i5];
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v();
        vVar2.f38486a = i5;
        vVar2.f38498n = false;
        vVarArr[i5] = vVar2;
        return vVar2;
    }

    public final void B() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        if (this.f38510F && this.f38541o == null) {
            Object obj = this.f38537j;
            if (obj instanceof Activity) {
                this.f38541o = new H(this.f38511G, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f38541o = new H((Dialog) obj);
            }
            H h10 = this.f38541o;
            if (h10 != null) {
                h10.g0(this.f38531b0);
            }
        }
    }

    public final void C(int i5) {
        this.f38529Z = (1 << i5) | this.f38529Z;
        if (this.f38528Y) {
            return;
        }
        View decorView = this.f38538l.getDecorView();
        m mVar = this.f38530a0;
        WeakHashMap weakHashMap = S.f38779a;
        decorView.postOnAnimation(mVar);
        this.f38528Y = true;
    }

    public final int D(Context context, int i5) {
        if (i5 != -100) {
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1 && i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f38527X == null) {
                            this.f38527X = new t(this, context);
                        }
                        return this.f38527X.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).g();
                }
            }
            return i5;
        }
        return -1;
    }

    public final boolean E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC3819j0 interfaceC3819j0;
        j1 j1Var;
        boolean z2 = this.f38517N;
        this.f38517N = false;
        v vVarA = A(0);
        if (!vVarA.f38497m) {
            AbstractC3620a abstractC3620a = this.f38547u;
            if (abstractC3620a != null) {
                abstractC3620a.a();
                return true;
            }
            B();
            H h10 = this.f38541o;
            if (h10 == null || (interfaceC3819j0 = h10.f38394j) == null || (j1Var = ((o1) interfaceC3819j0).f43850a.L) == null || j1Var.f43813b == null) {
                return false;
            }
            j1 j1Var2 = ((o1) interfaceC3819j0).f43850a.L;
            p.m mVar = j1Var2 == null ? null : j1Var2.f43813b;
            if (mVar != null) {
                mVar.collapseActionView();
            }
        } else if (!z2) {
            r(vVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0177, code lost:
    
        if (r3.f43031f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(j.v r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.F(j.v, android.view.KeyEvent):void");
    }

    public final boolean G(v vVar, int i5, KeyEvent keyEvent) {
        p.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.k || H(vVar, keyEvent)) && (kVar = vVar.f38493h) != null) {
            return kVar.performShortcut(i5, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(j.v r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.H(j.v, android.view.KeyEvent):boolean");
    }

    public final void I() {
        if (this.f38552z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f38535f0 != null && (A(0).f38497m || this.f38547u != null)) {
                z2 = true;
            }
            if (z2 && this.f38536g0 == null) {
                this.f38536g0 = r.b(this.f38535f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f38536g0) == null) {
                    return;
                }
                r.c(this.f38535f0, onBackInvokedCallback);
            }
        }
    }

    @Override // j.l
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof w) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // j.l
    public final void b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f38541o != null) {
            B();
            this.f38541o.getClass();
            C(0);
        }
    }

    @Override // j.l
    public final void d() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strC;
        this.f38518O = true;
        m(false, true);
        w();
        Object obj = this.f38537j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = AbstractC1277e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                H h10 = this.f38541o;
                if (h10 == null) {
                    this.f38531b0 = true;
                } else {
                    h10.g0(true);
                }
            }
            synchronized (l.f38471h) {
                l.g(this);
                l.f38470g.add(new WeakReference(this));
            }
        }
        this.f38521R = new Configuration(this.k.getResources().getConfiguration());
        this.f38519P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // j.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38537j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = j.l.f38471h
            monitor-enter(r0)
            j.l.g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f38528Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f38538l
            android.view.View r0 = r0.getDecorView()
            j.m r1 = r3.f38530a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f38520Q = r0
            int r0 = r3.f38522S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f38537j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            x.v r0 = j.w.f38501h0
            java.lang.Object r1 = r3.f38537j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f38522S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            x.v r0 = j.w.f38501h0
            java.lang.Object r1 = r3.f38537j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            j.t r0 = r3.f38526W
            if (r0 == 0) goto L63
            r0.c()
        L63:
            j.t r0 = r3.f38527X
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.e():void");
    }

    @Override // p.i
    public final boolean f(p.k kVar, MenuItem menuItem) {
        v vVar;
        Window.Callback callback = this.f38538l.getCallback();
        if (callback != null && !this.f38520Q) {
            p.k kVarK = kVar.k();
            v[] vVarArr = this.L;
            int length = vVarArr != null ? vVarArr.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    vVar = vVarArr[i5];
                    if (vVar != null && vVar.f38493h == kVarK) {
                        break;
                    }
                    i5++;
                } else {
                    vVar = null;
                    break;
                }
            }
            if (vVar != null) {
                return callback.onMenuItemSelected(vVar.f38486a, menuItem);
            }
        }
        return false;
    }

    @Override // j.l
    public final boolean h(int i5) {
        if (i5 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i5 = 108;
        } else if (i5 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i5 = 109;
        }
        if (this.f38514J && i5 == 108) {
            return false;
        }
        if (this.f38510F && i5 == 1) {
            this.f38510F = false;
        }
        if (i5 == 1) {
            I();
            this.f38514J = true;
            return true;
        }
        if (i5 == 2) {
            I();
            this.f38508D = true;
            return true;
        }
        if (i5 == 5) {
            I();
            this.f38509E = true;
            return true;
        }
        if (i5 == 10) {
            I();
            this.f38512H = true;
            return true;
        }
        if (i5 == 108) {
            I();
            this.f38510F = true;
            return true;
        }
        if (i5 != 109) {
            return this.f38538l.requestFeature(i5);
        }
        I();
        this.f38511G = true;
        return true;
    }

    @Override // j.l
    public final void i(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38505A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i5, viewGroup);
        this.f38539m.a(this.f38538l.getCallback());
    }

    @Override // j.l
    public final void j(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38505A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f38539m.a(this.f38538l.getCallback());
    }

    @Override // j.l
    public final void k(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38505A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f38539m.a(this.f38538l.getCallback());
    }

    @Override // j.l
    public final void l(CharSequence charSequence) {
        this.f38543q = charSequence;
        InterfaceC3817i0 interfaceC3817i0 = this.f38544r;
        if (interfaceC3817i0 != null) {
            interfaceC3817i0.setWindowTitle(charSequence);
            return;
        }
        H h10 = this.f38541o;
        if (h10 == null) {
            TextView textView = this.f38506B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        o1 o1Var = (o1) h10.f38394j;
        if (o1Var.f43856g) {
            return;
        }
        o1Var.f43857h = charSequence;
        if ((o1Var.f43851b & 8) != 0) {
            Toolbar toolbar = o1Var.f43850a;
            toolbar.setTitle(charSequence);
            if (o1Var.f43856g) {
                S.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f38538l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof j.s
            if (r2 != 0) goto L7a
            j.s r1 = new j.s
            r1.<init>(r7, r0)
            r7.f38539m = r1
            r8.setCallback(r1)
            int[] r0 = j.w.f38502i0
            android.content.Context r1 = r7.k
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            q.p r4 = q.C3830p.a()
            monitor-enter(r4)
            q.O0 r5 = r4.f43866a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f38538l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f38535f0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f38536g0
            if (r0 == 0) goto L5f
            j.r.c(r8, r0)
            r7.f38536g0 = r2
        L5f:
            java.lang.Object r8 = r7.f38537j
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = j.r.a(r8)
            r7.f38535f0 = r8
            goto L76
        L74:
            r7.f38535f0 = r2
        L76:
            r7.J()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.n(android.view.Window):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i5, v vVar, p.k kVar) {
        if (kVar == null) {
            if (vVar == null && i5 >= 0) {
                v[] vVarArr = this.L;
                if (i5 < vVarArr.length) {
                    vVar = vVarArr[i5];
                }
            }
            if (vVar != null) {
                kVar = vVar.f38493h;
            }
        }
        if ((vVar == null || vVar.f38497m) && !this.f38520Q) {
            s sVar = this.f38539m;
            Window.Callback callback = this.f38538l.getCallback();
            sVar.getClass();
            try {
                sVar.f38480d = true;
                callback.onPanelClosed(i5, kVar);
            } finally {
                sVar.f38480d = false;
            }
        }
    }

    public final void q(p.k kVar) {
        C3816i c3816i;
        if (this.f38515K) {
            return;
        }
        this.f38515K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f38544r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((o1) actionBarOverlayLayout.f17819e).f43850a.f17977a;
        if (actionMenuView != null && (c3816i = actionMenuView.f17844t) != null) {
            c3816i.i();
            C3808e c3808e = c3816i.f43808t;
            if (c3808e != null && c3808e.b()) {
                c3808e.f43114i.dismiss();
            }
        }
        Window.Callback callback = this.f38538l.getCallback();
        if (callback != null && !this.f38520Q) {
            callback.onPanelClosed(108, kVar);
        }
        this.f38515K = false;
    }

    public final void r(v vVar, boolean z2) {
        u uVar;
        InterfaceC3817i0 interfaceC3817i0;
        C3816i c3816i;
        if (z2 && vVar.f38486a == 0 && (interfaceC3817i0 = this.f38544r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3817i0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((o1) actionBarOverlayLayout.f17819e).f43850a.f17977a;
            if (actionMenuView != null && (c3816i = actionMenuView.f17844t) != null && c3816i.j()) {
                q(vVar.f38493h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && vVar.f38497m && (uVar = vVar.f38490e) != null) {
            windowManager.removeView(uVar);
            if (z2) {
                p(vVar.f38486a, vVar, null);
            }
        }
        vVar.k = false;
        vVar.f38496l = false;
        vVar.f38497m = false;
        vVar.f38491f = null;
        vVar.f38498n = true;
        if (this.f38516M == vVar) {
            this.f38516M = null;
        }
        if (vVar.f38486a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i5) {
        v vVarA = A(i5);
        if (vVarA.f38493h != null) {
            Bundle bundle = new Bundle();
            vVarA.f38493h.t(bundle);
            if (bundle.size() > 0) {
                vVarA.f38500p = bundle;
            }
            vVarA.f38493h.w();
            vVarA.f38493h.clear();
        }
        vVarA.f38499o = true;
        vVarA.f38498n = true;
        if ((i5 == 108 || i5 == 0) && this.f38544r != null) {
            v vVarA2 = A(0);
            vVarA2.k = false;
            H(vVarA2, null);
        }
    }

    public final void v() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.f38552z) {
            return;
        }
        int[] iArr = AbstractC2820a.f36447j;
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.f38513I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.f38538l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f38514J) {
            viewGroup = this.f38512H ? (ViewGroup) layoutInflaterFrom.inflate(com.wynauto.wyn.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.wynauto.wyn.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f38513I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.wynauto.wyn.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f38511G = false;
            this.f38510F = false;
        } else if (this.f38510F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.wynauto.wyn.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3623d(context, typedValue.resourceId) : context).inflate(com.wynauto.wyn.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC3817i0 interfaceC3817i0 = (InterfaceC3817i0) viewGroup.findViewById(com.wynauto.wyn.R.id.decor_content_parent);
            this.f38544r = interfaceC3817i0;
            interfaceC3817i0.setWindowCallback(this.f38538l.getCallback());
            if (this.f38511G) {
                ((ActionBarOverlayLayout) this.f38544r).j(109);
            }
            if (this.f38508D) {
                ((ActionBarOverlayLayout) this.f38544r).j(2);
            }
            if (this.f38509E) {
                ((ActionBarOverlayLayout) this.f38544r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f38510F + ", windowActionBarOverlay: " + this.f38511G + ", android:windowIsFloating: " + this.f38513I + ", windowActionModeOverlay: " + this.f38512H + ", windowNoTitle: " + this.f38514J + " }");
        }
        C1346a c1346a = new C1346a(this, 7);
        WeakHashMap weakHashMap = S.f38779a;
        J.l(viewGroup, c1346a);
        if (this.f38544r == null) {
            this.f38506B = (TextView) viewGroup.findViewById(com.wynauto.wyn.R.id.title);
        }
        Method method = v1.f43927a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.wynauto.wyn.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f38538l.findViewById(R.id.content);
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
        this.f38538l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new com.google.android.gms.ads.nativead.l(this, 6));
        this.f38505A = viewGroup;
        Object obj = this.f38537j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f38543q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC3817i0 interfaceC3817i02 = this.f38544r;
            if (interfaceC3817i02 != null) {
                interfaceC3817i02.setWindowTitle(title);
            } else {
                H h10 = this.f38541o;
                if (h10 != null) {
                    o1 o1Var = (o1) h10.f38394j;
                    if (!o1Var.f43856g) {
                        o1Var.f43857h = title;
                        if ((o1Var.f43851b & 8) != 0) {
                            Toolbar toolbar = o1Var.f43850a;
                            toolbar.setTitle(title);
                            if (o1Var.f43856g) {
                                S.n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f38506B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f38505A.findViewById(R.id.content);
        View decorView = this.f38538l.getDecorView();
        contentFrameLayout2.f17872g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = S.f38779a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f38552z = true;
        v vVarA = A(0);
        if (this.f38520Q || vVarA.f38493h != null) {
            return;
        }
        C(108);
    }

    public final void w() {
        if (this.f38538l == null) {
            Object obj = this.f38537j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f38538l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final J4.d x(Context context) {
        if (this.f38526W == null) {
            if (Dd.c.f2640e == null) {
                Context applicationContext = context.getApplicationContext();
                Dd.c.f2640e = new Dd.c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f38526W = new t(this, Dd.c.f2640e);
        }
        return this.f38526W;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // p.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(p.k r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.w.z(p.k):void");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

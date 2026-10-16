package kc;

import A.AbstractC0213f;
import Ef.H;
import Ef.InterfaceC0501m0;
import Ef.S;
import Hf.C0591c;
import Hf.InterfaceC0602l;
import Hf.k0;
import U1.AbstractC0832b;
import Va.M6;
import a2.C1323c;
import ac.C1346a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import ba.C1521a;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;
import lc.C3458b;
import me.C3558a;
import pc.C3791a;
import uc.C4281r;
import uc.InterfaceC4269f;
import vc.C4337a;

/* loaded from: classes5.dex */
public final class r extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final n f39514a;

    /* renamed from: b, reason: collision with root package name */
    public final p f39515b;

    /* renamed from: c, reason: collision with root package name */
    public m f39516c;

    /* renamed from: d, reason: collision with root package name */
    public View f39517d;

    /* renamed from: e, reason: collision with root package name */
    public View f39518e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f39519f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39520g;

    /* renamed from: h, reason: collision with root package name */
    public C3458b f39521h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f39522i;

    /* renamed from: j, reason: collision with root package name */
    public C1521a f39523j;
    public io.flutter.plugin.editing.i k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.f f39524l;

    /* renamed from: m, reason: collision with root package name */
    public C4337a f39525m;

    /* renamed from: n, reason: collision with root package name */
    public Dd.c f39526n;

    /* renamed from: o, reason: collision with root package name */
    public C3289a f39527o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.view.l f39528p;

    /* renamed from: q, reason: collision with root package name */
    public TextServicesManager f39529q;

    /* renamed from: r, reason: collision with root package name */
    public C1346a f39530r;

    /* renamed from: s, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f39531s;

    /* renamed from: t, reason: collision with root package name */
    public final C1323c f39532t;

    /* renamed from: u, reason: collision with root package name */
    public final io.flutter.view.c f39533u;

    /* renamed from: v, reason: collision with root package name */
    public final c f39534v;

    /* renamed from: w, reason: collision with root package name */
    public D3.i f39535w;

    /* renamed from: x, reason: collision with root package name */
    public s f39536x;

    public r(Context context, n nVar) {
        super(context, null);
        this.f39519f = new HashSet();
        this.f39522i = new HashSet();
        this.f39531s = new io.flutter.embedding.engine.renderer.j();
        this.f39532t = new C1323c(this, 16);
        this.f39533u = new io.flutter.view.c(this, new Handler(Looper.getMainLooper()), 1);
        this.f39534v = new c(this, 2);
        this.f39536x = new s();
        this.f39514a = nVar;
        this.f39517d = nVar;
        c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a(C3458b c3458b) {
        Objects.toString(c3458b);
        if (d()) {
            if (c3458b == this.f39521h) {
                return;
            } else {
                b();
            }
        }
        this.f39521h = c3458b;
        io.flutter.embedding.engine.renderer.k kVar = c3458b.f40252b;
        this.f39520g = kVar.f37011d;
        this.f39517d.a(kVar);
        FlutterJNI flutterJNI = kVar.f37008a;
        c cVar = this.f39534v;
        flutterJNI.addIsDisplayingFlutterUiListener(cVar);
        if (kVar.f37011d) {
            cVar.e();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f39523j = new C1521a(this, this.f39521h.f40258h);
        }
        C3458b c3458b2 = this.f39521h;
        this.k = new io.flutter.plugin.editing.i(this, c3458b2.f40266q, c3458b2.f40262m, c3458b2.f40267r, c3458b2.f40268s);
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f39529q = textServicesManager;
            this.f39524l = new io.flutter.plugin.editing.f(textServicesManager, this.f39521h.f40264o);
        } catch (Exception unused) {
            Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        new C1521a(this, this.k.f37063b, this.f39521h.f40262m);
        this.f39525m = this.f39521h.f40255e;
        this.f39526n = new Dd.c(this);
        int i5 = 0;
        this.f39527o = new C3289a(this.f39521h.f40252b, false);
        io.flutter.view.l lVar = new io.flutter.view.l(this, c3458b.f40256f, (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f39521h.f40267r);
        this.f39528p = lVar;
        lVar.f37296s = this.f39532t;
        boolean zIsEnabled = lVar.f37281c.isEnabled();
        boolean zIsTouchExplorationEnabled = this.f39528p.f37281c.isTouchExplorationEnabled();
        if (this.f39521h.f40252b.f37008a.getIsSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
        } else {
            setWillNotDraw((zIsEnabled || zIsTouchExplorationEnabled) ? false : true);
        }
        C3458b c3458b3 = this.f39521h;
        io.flutter.plugin.platform.q qVar = c3458b3.f40267r;
        qVar.f37140h.f37090a = this.f39528p;
        qVar.f37134b = new C3289a(c3458b3.f40252b, true);
        C3458b c3458b4 = this.f39521h;
        io.flutter.plugin.platform.p pVar = c3458b4.f40268s;
        pVar.f37124h.f37090a = this.f39528p;
        pVar.f37118b = new C3289a(c3458b4.f40252b, true);
        this.k.f37063b.restartInput(this);
        e();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f39533u);
        f();
        io.flutter.plugin.platform.q qVar2 = c3458b.f40267r;
        qVar2.f37136d = this;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = qVar2.f37145n;
            if (i10 >= sparseArray.size()) {
                break;
            }
            qVar2.f37136d.addView((io.flutter.plugin.platform.i) sparseArray.valueAt(i10));
            i10++;
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray2 = qVar2.f37143l;
            if (i11 >= sparseArray2.size()) {
                break;
            }
            qVar2.f37136d.addView((C3791a) sparseArray2.valueAt(i11));
            i11++;
        }
        int i12 = 0;
        while (true) {
            SparseArray sparseArray3 = qVar2.k;
            if (i12 >= sparseArray3.size()) {
                break;
            }
            ((io.flutter.plugin.platform.e) sparseArray3.valueAt(i12)).onFlutterViewAttached(qVar2.f37136d);
            i12++;
        }
        io.flutter.plugin.platform.p pVar2 = c3458b.f40268s;
        pVar2.f37120d = this;
        int i13 = 0;
        while (true) {
            SparseArray sparseArray4 = pVar2.f37126j;
            if (i13 >= sparseArray4.size()) {
                break;
            }
            pVar2.f37120d.addView((C3791a) sparseArray4.valueAt(i13));
            i13++;
        }
        while (true) {
            SparseArray sparseArray5 = pVar2.f37125i;
            if (i5 >= sparseArray5.size()) {
                break;
            }
            ((io.flutter.plugin.platform.e) sparseArray5.valueAt(i5)).onFlutterViewAttached(pVar2.f37120d);
            i5++;
        }
        Iterator it = this.f39522i.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        if (this.f39520g) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        S3.i iVar;
        S3.i iVar2;
        io.flutter.plugin.editing.i iVar3 = this.k;
        if (Build.VERSION.SDK_INT < 26) {
            iVar3.getClass();
            return;
        }
        tc.k kVar = iVar3.f37067f;
        if (kVar == null || iVar3.f37068g == null || (iVar = kVar.f46025j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            tc.k kVar2 = (tc.k) iVar3.f37068g.get(sparseArray.keyAt(i5));
            if (kVar2 != null && (iVar2 = kVar2.f46025j) != null) {
                String string = AbstractC0832b.j(sparseArray.valueAt(i5)).getTextValue().toString();
                tc.l lVar = new tc.l(string, string.length(), string.length(), -1, -1);
                String str = (String) iVar2.f10961a;
                if (str.equals((String) iVar.f10961a)) {
                    iVar3.f37069h.f(lVar);
                } else {
                    map.put(str, lVar);
                }
            }
        }
        int i10 = iVar3.f37066e.f2593c;
        t6.q qVar = iVar3.f37065d;
        qVar.getClass();
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            tc.l lVar2 = (tc.l) entry.getValue();
            map2.put((String) entry.getKey(), t6.q.f(lVar2.f46027a, lVar2.f46028b, lVar2.f46029c, -1, -1));
        }
        ((C4281r) qVar.f45906a).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), map2), null);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void b() {
        SparseArray sparseArray;
        Objects.toString(this.f39521h);
        if (d()) {
            Iterator it = this.f39522i.iterator();
            if (it.hasNext()) {
                throw M6.j(it);
            }
            getContext().getContentResolver().unregisterContentObserver(this.f39533u);
            io.flutter.plugin.platform.q qVar = this.f39521h.f40267r;
            int i5 = 0;
            while (true) {
                SparseArray sparseArray2 = qVar.f37145n;
                if (i5 >= sparseArray2.size()) {
                    break;
                }
                qVar.f37136d.removeView((io.flutter.plugin.platform.i) sparseArray2.valueAt(i5));
                i5++;
            }
            int i10 = 0;
            while (true) {
                SparseArray sparseArray3 = qVar.f37143l;
                if (i10 >= sparseArray3.size()) {
                    break;
                }
                qVar.f37136d.removeView((C3791a) sparseArray3.valueAt(i10));
                i10++;
            }
            qVar.g();
            if (qVar.f37136d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i11 = 0;
                while (true) {
                    sparseArray = qVar.f37144m;
                    if (i11 >= sparseArray.size()) {
                        break;
                    }
                    qVar.f37136d.removeView((View) sparseArray.valueAt(i11));
                    i11++;
                }
                sparseArray.clear();
            }
            qVar.f37136d = null;
            qVar.f37147p = false;
            int i12 = 0;
            while (true) {
                SparseArray sparseArray4 = qVar.k;
                if (i12 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.e) sparseArray4.valueAt(i12)).onFlutterViewDetached();
                i12++;
            }
            io.flutter.plugin.platform.p pVar = this.f39521h.f40268s;
            int i13 = 0;
            while (true) {
                SparseArray sparseArray5 = pVar.f37126j;
                if (i13 >= sparseArray5.size()) {
                    break;
                }
                pVar.f37120d.removeView((C3791a) sparseArray5.valueAt(i13));
                i13++;
            }
            Surface surface = pVar.f37129n;
            if (surface != null) {
                surface.release();
                pVar.f37129n = null;
                pVar.f37130o = null;
            }
            pVar.f37120d = null;
            int i14 = 0;
            while (true) {
                SparseArray sparseArray6 = pVar.f37125i;
                if (i14 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.e) sparseArray6.valueAt(i14)).onFlutterViewDetached();
                i14++;
            }
            this.f39521h.f40267r.d();
            this.f39521h.f40268s.d();
            io.flutter.view.l lVar = this.f39528p;
            lVar.f37298u = true;
            lVar.f37283e.d();
            lVar.f37296s = null;
            AccessibilityManager accessibilityManager = lVar.f37281c;
            accessibilityManager.removeAccessibilityStateChangeListener(lVar.f37300w);
            accessibilityManager.removeTouchExplorationStateChangeListener(lVar.f37301x);
            lVar.f37284f.unregisterContentObserver(lVar.f37302y);
            C3558a c3558a = lVar.f37280b;
            c3558a.f40738c = null;
            ((FlutterJNI) c3558a.f40737b).setAccessibilityDelegate(null);
            this.f39528p = null;
            this.k.f37063b.restartInput(this);
            this.k.c();
            int size = ((HashSet) this.f39526n.f2643c).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.f fVar = this.f39524l;
            if (fVar != null) {
                fVar.f37050a.f46015a = null;
                SpellCheckerSession spellCheckerSession = fVar.f37052c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C1521a c1521a = this.f39523j;
            if (c1521a != null) {
                ((C1323c) c1521a.f19415c).f17156b = null;
            }
            io.flutter.embedding.engine.renderer.k kVar = this.f39521h.f40252b;
            this.f39520g = false;
            kVar.f37008a.removeIsDisplayingFlutterUiListener(this.f39534v);
            kVar.g();
            kVar.f37008a.setSemanticsEnabled(false);
            View view = this.f39518e;
            if (view != null && this.f39517d == this.f39516c) {
                this.f39517d = view;
            }
            this.f39517d.b();
            m mVar = this.f39516c;
            if (mVar != null) {
                mVar.f39496a.close();
                removeView(this.f39516c);
                this.f39516c = null;
            }
            this.f39518e = null;
            this.f39521h = null;
        }
    }

    public final void c() {
        n nVar = this.f39514a;
        if (nVar != null) {
            addView(nVar);
        } else {
            p pVar = this.f39515b;
            if (pVar != null) {
                addView(pVar);
            } else {
                addView(this.f39516c);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C3458b c3458b = this.f39521h;
        if (c3458b == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.q qVar = c3458b.f40267r;
        if (view == null) {
            qVar.getClass();
            return false;
        }
        HashMap map = qVar.f37142j;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean d() {
        C3458b c3458b = this.f39521h;
        if (c3458b != null) {
            return c3458b.f40252b == this.f39517d.getAttachedRenderer();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (d() && this.f39526n.H(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.r.e():void");
    }

    public final void f() {
        if (!d()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f10 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.j jVar = this.f39531s;
        jVar.f36991a = f10;
        jVar.f37005p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.k kVar = this.f39521h.f40252b;
        kVar.getClass();
        if (jVar.f36992b <= 0 || jVar.f36993c <= 0 || jVar.f36991a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        ArrayList arrayList = jVar.f37006q;
        arrayList.size();
        ArrayList arrayList2 = jVar.f37007r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i5);
            int i10 = i5 * 4;
            Rect rect = cVar.f36973a;
            iArr[i10] = rect.left;
            iArr[i10 + 1] = rect.top;
            iArr[i10 + 2] = rect.right;
            iArr[i10 + 3] = rect.bottom;
            iArr2[i5] = AbstractC0213f.f(cVar.f36974b);
            iArr3[i5] = AbstractC0213f.f(cVar.f36975c);
        }
        int size2 = arrayList.size() * 4;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i11);
            int i12 = (i11 * 4) + size2;
            Rect rect2 = cVar2.f36973a;
            iArr[i12] = rect2.left;
            iArr[i12 + 1] = rect2.top;
            iArr[i12 + 2] = rect2.right;
            iArr[i12 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i11] = AbstractC0213f.f(cVar2.f36974b);
            iArr3[arrayList.size() + i11] = AbstractC0213f.f(cVar2.f36975c);
        }
        kVar.f37008a.setViewportMetrics(jVar.f36991a, jVar.f36992b, jVar.f36993c, jVar.f36994d, jVar.f36995e, jVar.f36996f, jVar.f36997g, jVar.f36998h, jVar.f36999i, jVar.f37000j, jVar.k, jVar.f37001l, jVar.f37002m, jVar.f37003n, jVar.f37004o, jVar.f37005p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.l lVar = this.f39528p;
        if (lVar == null || !lVar.f37281c.isEnabled()) {
            return null;
        }
        return this.f39528p;
    }

    public C3458b getAttachedFlutterEngine() {
        return this.f39521h;
    }

    public InterfaceC4269f getBinaryMessenger() {
        return this.f39521h.f40253c;
    }

    public m getCurrentImageSurface() {
        return this.f39516c;
    }

    public io.flutter.embedding.engine.renderer.j getViewportMetrics() {
        return this.f39531s;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r18) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.r.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1346a c1346a;
        int i5 = 3;
        super.onAttachedToWindow();
        try {
            D3.g gVar = D3.h.f2309I8;
            Context context = getContext();
            gVar.getClass();
            c1346a = new C1346a(new S3.e(D3.g.a(context)), 11);
        } catch (NoClassDefFoundError unused) {
            c1346a = null;
        }
        this.f39530r = c1346a;
        Activity activityT = S3.f.t(getContext());
        C1346a c1346a2 = this.f39530r;
        if (c1346a2 == null || activityT == null) {
            return;
        }
        this.f39535w = new D3.i(this, i5);
        Executor executor = Y0.e.getMainExecutor(getContext());
        D3.i consumer = this.f39535w;
        S3.e eVar = (S3.e) c1346a2.f17489b;
        AbstractC3340k.e(executor, "executor");
        AbstractC3340k.e(consumer, "consumer");
        D3.b bVar = (D3.b) eVar.f10941b;
        bVar.getClass();
        C0591c c0591cH = k0.h(new D3.j(bVar, activityT, null));
        Lf.e eVar2 = S.f3698a;
        InterfaceC0602l flow = k0.s(c0591cH, Jf.n.f6132a);
        S3.c cVar = (S3.c) eVar.f10942c;
        cVar.getClass();
        AbstractC3340k.e(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) cVar.f10936b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f10937c;
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, H.D(H.c(H.r(executor)), null, new B3.b(flow, consumer, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f39521h != null) {
            this.f39525m.b(configuration);
            e();
            S3.f.i(getContext(), this.f39521h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0052 A[PHI: r6
  0x0052: PHI (r6v17 int) = (r6v10 int), (r6v20 int) binds: [B:76:0x00b5, B:31:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.r.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        D3.i iVar;
        C1346a c1346a = this.f39530r;
        if (c1346a != null && (iVar = this.f39535w) != null) {
            S3.c cVar = (S3.c) ((S3.e) c1346a.f17489b).f10942c;
            cVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) cVar.f10936b;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f10937c;
            try {
                InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) linkedHashMap.get(iVar);
                if (interfaceC0501m0 != null) {
                    interfaceC0501m0.cancel(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f39535w = null;
        this.f39530r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (d()) {
            C3289a c3289a = this.f39527o;
            Context context = getContext();
            c3289a.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z2) {
                int iB = C3289a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c3289a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, C3289a.f39451f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c3289a.f39452a.f37008a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !d() ? super.onHoverEvent(motionEvent) : this.f39528p.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i5) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i5);
        io.flutter.plugin.editing.i iVar = this.k;
        if (Build.VERSION.SDK_INT < 26) {
            iVar.getClass();
            return;
        }
        if (iVar.f37068g != null) {
            String str = (String) iVar.f37067f.f46025j.f10961a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i10 = 0; i10 < iVar.f37068g.size(); i10++) {
                int iKeyAt = iVar.f37068g.keyAt(i10);
                S3.i iVar2 = ((tc.k) iVar.f37068g.valueAt(i10)).f46025j;
                if (iVar2 != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) iVar2.f10962b;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) iVar2.f10964d;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = iVar.f37073m) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((tc.l) iVar2.f10963c).f46027a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f37073m.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(iVar.f37069h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        io.flutter.embedding.engine.renderer.j jVar = this.f39531s;
        jVar.f36992b = i5;
        jVar.f36993c = i10;
        f();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!d()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f39527o.d(motionEvent, C3289a.f39451f);
        return true;
    }

    public void setDelegate(s sVar) {
        this.f39536x = sVar;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        View view = this.f39517d;
        if (view instanceof n) {
            ((n) view).setVisibility(i5);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(D3.k kVar) {
        ?? r82 = kVar.f2316a;
        ArrayList arrayList = new ArrayList();
        for (D3.c cVar : r82) {
            cVar.f2297a.a().toString();
            A3.b bVar = cVar.f2297a;
            int i5 = bVar.f281c - bVar.f279a;
            D3.b bVar2 = D3.b.f2290d;
            int i10 = 2;
            int i11 = ((i5 == 0 || bVar.f282d - bVar.f280b == 0) ? D3.b.f2289c : bVar2) == bVar2 ? 3 : 2;
            D3.b bVar3 = D3.b.f2291e;
            D3.b bVar4 = cVar.f2299c;
            if (bVar4 != bVar3) {
                i10 = bVar4 == D3.b.f2292f ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.a(), i11, i10));
        }
        ArrayList arrayList2 = this.f39531s.f37006q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        f();
    }

    public r(Context context, p pVar) {
        super(context, null);
        this.f39519f = new HashSet();
        this.f39522i = new HashSet();
        this.f39531s = new io.flutter.embedding.engine.renderer.j();
        this.f39532t = new C1323c(this, 16);
        this.f39533u = new io.flutter.view.c(this, new Handler(Looper.getMainLooper()), 1);
        this.f39534v = new c(this, 2);
        this.f39536x = new s();
        this.f39515b = pVar;
        this.f39517d = pVar;
        c();
    }
}

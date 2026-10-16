package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.car.app.model.Action;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gjt {
    static Integer d;
    public final Object a;
    public final Object b;
    public Object c;

    public gjt(Context context, Resources resources) {
        synchronized (this) {
            zkt.n(context, "clientRawContext");
            this.c = context;
        }
        Context applicationContext = context.getApplicationContext();
        zkt.n(applicationContext, "getApplicationContext");
        this.a = applicationContext;
        zkt.n(resources, "mapsApiContainerResources");
        this.b = resources;
        zvb.a(context);
    }

    static float I(float f) {
        return Math.max(0.125f, Math.min(4.0f, f));
    }

    public static final boolean N(int i, int i2) {
        return R(i) && R(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [afdr, java.lang.Object] */
    private final void O() throws Throwable {
        if (!((Boolean) this.a.invoke()).booleanValue()) {
            throw ((Throwable) this.b.invoke());
        }
    }

    private final void P(epr eprVar) {
        Object obj = this.c;
        if (obj != null) {
            ((erj) obj).run();
        }
        erj erjVar = new erj((eqc) this.b, eprVar);
        this.c = erjVar;
        ((Handler) this.a).postAtFrontOfQueue(erjVar);
    }

    private final int Q(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = (View) this.a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        Integer numValueOf = d;
        if (numValueOf == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            a.al(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            numValueOf = Integer.valueOf(Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean R(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static abdl i(abdd abddVar) {
        abdl abdlVar = abddVar.q;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        gjt gjtVar = new gjt(abddVar, abdlVar);
        gjtVar.k(abbf.s, abdn.f);
        gjtVar.k(abbf.u, abdn.k);
        gjtVar.k(abbf.y, abdn.E);
        gjtVar.k(abbf.z, abdn.L);
        gjtVar.k(abbf.x, abdn.w);
        gjtVar.k(aazp.c, abdn.U);
        gjtVar.k(abbf.A, abdn.F);
        return gjtVar.j();
    }

    public final synchronized Context A() {
        return z();
    }

    @Deprecated
    public final synchronized Resources B() {
        return (Resources) this.b;
    }

    public final synchronized Bitmap C(int i) {
        Object obj;
        obj = this.b;
        Configuration configuration = new Configuration(((Resources) obj).getConfiguration());
        try {
            ((Resources) obj).updateConfiguration(new Configuration(z().getResources().getConfiguration()), ((Resources) obj).getDisplayMetrics());
        } finally {
            Object obj2 = this.b;
            ((Resources) obj2).updateConfiguration(configuration, ((Resources) obj2).getDisplayMetrics());
        }
        return BitmapFactory.decodeResource((Resources) obj, i);
    }

    public final synchronized Drawable D(int i) {
        Object obj;
        obj = this.b;
        Configuration configuration = new Configuration(((Resources) obj).getConfiguration());
        try {
            ((Resources) obj).updateConfiguration(new Configuration(z().getResources().getConfiguration()), ((Resources) obj).getDisplayMetrics());
        } finally {
            Object obj2 = this.b;
            ((Resources) obj2).updateConfiguration(configuration, ((Resources) obj2).getDisplayMetrics());
        }
        return ((Resources) obj).getDrawable(i);
    }

    public final DisplayMetrics E() {
        return z().getResources().getDisplayMetrics();
    }

    public final synchronized String F(int i) {
        return ((Resources) this.b).getString(i);
    }

    public final synchronized void G() {
        this.c = null;
    }

    public final synchronized CharSequence[] H(int i) {
        return ((Resources) this.b).getTextArray(i);
    }

    public final synchronized float J() {
        Object obj;
        obj = this.b;
        Configuration configuration = new Configuration(((Resources) obj).getConfiguration());
        try {
            ((Resources) obj).updateConfiguration(new Configuration(z().getResources().getConfiguration()), ((Resources) obj).getDisplayMetrics());
        } finally {
            Object obj2 = this.b;
            ((Resources) obj2).updateConfiguration(configuration, ((Resources) obj2).getDisplayMetrics());
        }
        return ((Resources) obj).getDimension(R.dimen.maps_vm_mylocation_dot_size);
    }

    public final int K() {
        View view = (View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Q(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int L() {
        View view = (View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Q(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void M() {
        ViewTreeObserver viewTreeObserver = ((View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(Action action) {
        this.a.add(action);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(Action action) {
        this.b.add(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final synchronized void c() {
        ?? r0 = this.c;
        if (r0 != 0) {
            Object obj = this.b;
            if (((ncp) obj).c.remove(r0)) {
                ((tnq) ((ncp) obj).b).k(null, r0);
            }
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    public final synchronized void d() {
        if (this.c == null) {
            Object obj = this.b;
            tuq tuqVar = new tuq((ucz) this.a);
            ((ncp) obj).c.add(tuqVar);
            ((tnq) ((ncp) obj).b).k(tuqVar, null);
            this.c = tuqVar;
        }
    }

    public final Object e() throws Throwable {
        O();
        return this.c;
    }

    public final void f(Object obj) {
        O();
        this.c = obj;
    }

    public final void g() {
        Object obj;
        synchronized (this) {
            obj = this.c;
        }
        Object obj2 = this.b;
        if (obj == null) {
            this = null;
        }
        ((ufz) obj2).r(this);
    }

    public final synchronized void h() {
        g();
    }

    public final abdl j() {
        Object obj = this.c;
        return obj == null ? (abdl) this.b : (abdl) ((abnp) obj).q();
    }

    public final void k(abnh abnhVar, abnh abnhVar2) {
        abns abnsVar = (abns) this.a;
        abnsVar.j(abnhVar);
        abnl abnlVar = abnsVar.w;
        abnu abnuVar = abnhVar.d;
        if (abnlVar.m(abnuVar)) {
            abnr abnrVarL = l();
            abnsVar.j(abnhVar);
            Object objJ = abnsVar.w.j(abnuVar);
            abnrVarL.bc(abnhVar2, (abow) (objJ == null ? abnhVar.b : abnhVar.c(objJ)));
        }
    }

    public final abnr l() {
        if (this.c == null) {
            this.c = (abnr) ((abnv) this.b).K();
        }
        return (abnr) this.c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    public final afeg m() {
        return (afeg) this.b.a();
    }

    public final void n(gab gabVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2113044977);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gabVar) : buxVarC.E(gabVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(this) ? 16 : 32;
        }
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.s();
        } else if (gabVar != null) {
            buxVarC.v(1612918384);
            cfv cfvVar = cfy.e;
            cfy cfyVarJ = asl.J(awd.r(awd.d(cfvVar, ((guz) this.c).e)), BitmapDescriptorFactory.HUE_RED, ((guz) this.c).f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            fxp.c(gabVar, ((guz) this.c).d, awd.d(cfvVar, ((guz) this.c).d), null, csh.c, null, false, false, null, buxVarC, (i2 & 14) | 24584, 1000);
            bvvVar.Y(true);
            bvvVar.Y(false);
        } else {
            buxVarC.v(1613413299);
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(this, gabVar, i, 7, null);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [bwq, java.lang.Object] */
    public final void o(gab gabVar, boolean z, afeg afegVar) {
        afegVar.getClass();
        this.b.b(new cct(1276014463, true, new guy(this, gabVar, z, afegVar, 0)));
    }

    public final void p() {
        P(epr.ON_START);
    }

    public final void q() {
        P(epr.ON_CREATE);
    }

    public final void r() {
        P(epr.ON_STOP);
        P(epr.ON_DESTROY);
    }

    public final void s() {
        P(epr.ON_START);
    }

    public final float t() {
        return I(E().density);
    }

    public final float u() {
        return I(E().scaledDensity);
    }

    public final synchronized int v(int i) {
        return ((Resources) this.b).getColor(i);
    }

    public final synchronized int w(int i) {
        Object obj;
        obj = this.b;
        Configuration configuration = new Configuration(((Resources) obj).getConfiguration());
        try {
            ((Resources) obj).updateConfiguration(new Configuration(z().getResources().getConfiguration()), ((Resources) obj).getDisplayMetrics());
        } finally {
            Object obj2 = this.b;
            ((Resources) obj2).updateConfiguration(configuration, ((Resources) obj2).getDisplayMetrics());
        }
        return ((Resources) obj).getDimensionPixelSize(i);
    }

    public final int x() {
        return E().heightPixels;
    }

    public final int y() {
        return E().widthPixels;
    }

    public final synchronized Context z() {
        Object obj = this.c;
        if (obj != null) {
            return (Context) obj;
        }
        return (Context) this.a;
    }

    public gjt(Object obj, afdr afdrVar, afdr afdrVar2) {
        this.c = obj;
        this.a = afdrVar;
        this.b = afdrVar2;
    }

    public gjt(Runnable runnable, Executor executor, gjt gjtVar) {
        this.a = runnable;
        this.b = executor;
        this.c = gjtVar;
    }

    public gjt(ucz uczVar, ncp ncpVar) {
        this.a = uczVar;
        this.b = ncpVar;
    }

    public gjt(ufz ufzVar, Executor executor) {
        this.c = null;
        this.b = ufzVar;
        this.a = executor;
    }

    public gjt(abns abnsVar, abdl abdlVar) {
        this.c = null;
        this.a = abnsVar;
        this.b = abdlVar;
    }

    public gjt(eqa eqaVar) {
        this.b = new eqc(eqaVar, true);
        this.a = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ gjt(Object obj, afdr afdrVar) {
        this(obj, afdrVar, new tic(6));
    }

    public gjt() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public gjt(byte[] bArr) {
        this.c = guz.b;
        afeg afegVar = guh.a;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(afegVar, bxpVar);
        this.a = new ParcelableSnapshotMutableState(guh.b, bxpVar);
    }

    public gjt(View view) {
        this.b = new ArrayList();
        this.a = view;
    }
}

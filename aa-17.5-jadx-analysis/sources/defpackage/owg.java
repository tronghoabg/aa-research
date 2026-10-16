package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class owg {
    private Method A;
    private Method B;
    protected Object a;
    protected String b;
    public final owk c;
    public int d;
    public Method e;
    public Method f;
    public Method g;
    public Method h;
    public Method i;
    public Method j;
    public Method k;
    public final nzj l;
    public final oct m;
    public final oct n;
    public final oct o;
    public final oct p;
    private Method q;
    private Method r;
    private Method s;
    private Method t;
    private Method u;
    private Method v;
    private Method w;
    private Method x;
    private Method y;
    private Method z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public owg(defpackage.owj r10, java.lang.Object... r11) throws java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owg.<init>(owj, java.lang.Object[]):void");
    }

    private final void c() {
        IBinder iBinder = (IBinder) a(this.s, new Object[0]);
        if (iBinder == null) {
            return;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IFacetBarController");
        if (iInterfaceQueryLocalInterface instanceof ovk) {
        }
    }

    private final void d() {
        IBinder iBinder = (IBinder) a(this.x, new Object[0]);
        if (iBinder == null) {
            return;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ISearchController");
        if (iInterfaceQueryLocalInterface instanceof ovw) {
        }
    }

    private final void e() {
        IBinder iBinder = (IBinder) a(this.z, new Object[0]);
        if (iBinder == null) {
            return;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IVoiceSearchController");
        if (iInterfaceQueryLocalInterface instanceof owe) {
        }
    }

    private final oct f() {
        ouz ouxVar;
        IBinder iBinder = (IBinder) a(this.A, new Object[0]);
        if (iBinder == null) {
            ouxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ICapabilityController");
            ouxVar = iInterfaceQueryLocalInterface instanceof ouz ? (ouz) iInterfaceQueryLocalInterface : new oux(iBinder);
        }
        return new oct(ouxVar);
    }

    private final nzj g(vag vagVar) {
        ovq ovoVar;
        IBinder iBinder = (IBinder) a(this.w, new Object[0]);
        if (iBinder == null) {
            ovoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IImeController");
            ovoVar = iInterfaceQueryLocalInterface instanceof ovq ? (ovq) iInterfaceQueryLocalInterface : new ovo(iBinder);
        }
        return new nzj(ovoVar, vagVar, this);
    }

    private final oct h() {
        owc owaVar;
        IBinder iBinder = (IBinder) a(this.y, new Object[0]);
        if (iBinder == null) {
            owaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IToastController");
            owaVar = iInterfaceQueryLocalInterface instanceof owc ? (owc) iInterfaceQueryLocalInterface : new owa(iBinder);
        }
        return new oct(owaVar);
    }

    private final void i(oct octVar) {
        ovi ovgVar;
        IBinder iBinder = (IBinder) a(this.u, new Object[0]);
        if (iBinder == null) {
            ovgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IDrawerController");
            ovgVar = iInterfaceQueryLocalInterface instanceof ovi ? (ovi) iInterfaceQueryLocalInterface : new ovg(iBinder);
        }
        new ogz(ovgVar, octVar);
    }

    private final oct j(owj owjVar) {
        IBinder iBinder = (IBinder) a(this.v, new Object[0]);
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IMenuController");
            if (iInterfaceQueryLocalInterface instanceof ovt) {
            }
        }
        Object obj = owjVar.a;
        return new oct((char[]) null, (byte[]) null);
    }

    private final oct k() {
        ovc ovaVar;
        IBinder iBinder = (IBinder) a(this.B, new Object[0]);
        if (iBinder == null) {
            ovaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.ICarRegionController");
            ovaVar = iInterfaceQueryLocalInterface instanceof ovc ? (ovc) iInterfaceQueryLocalInterface : new ova(iBinder);
        }
        return new oct(ovaVar);
    }

    private final owk l(erb erbVar) {
        ovz ovxVar;
        IBinder iBinder = (IBinder) a(this.t, new Object[0]);
        if (iBinder == null) {
            ovxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IStatusBarController");
            ovxVar = iInterfaceQueryLocalInterface instanceof ovz ? (ovz) iInterfaceQueryLocalInterface : new ovx(iBinder);
        }
        return new owk(ovxVar, erbVar);
    }

    @ResultIgnorabilityUnspecified
    protected final Object a(Method method, Object... objArr) {
        if (method == null) {
            Log.e("CSL.RemoteClass", "Error invoking a null method.  Ignored.", new Exception());
            return null;
        }
        try {
            return method.invoke(this.a, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            Log.e("CSL.RemoteClass", "Error invoking: ".concat(String.valueOf(method.getName())), e);
            return null;
        }
    }

    public final View b() {
        return (View) a(this.r, new Object[0]);
    }

    @Deprecated
    public owg(owj owjVar, vag vagVar, LayoutInflater.Factory factory, erb erbVar, int i) {
        this(owjVar, owjVar.a, owjVar.b, factory, Integer.valueOf(i));
        this.d = ((Integer) a(this.q, new Object[0])).intValue();
        this.m = f();
        c();
        this.c = l(erbVar);
        this.n = h();
        oct octVarJ = j(owjVar);
        this.o = octVarJ;
        i(octVarJ);
        this.l = g(vagVar);
        d();
        e();
        this.p = k();
    }

    public owg(owj owjVar, vag vagVar, LayoutInflater.Factory factory, erb erbVar, int i, int i2) {
        this(owjVar, owjVar.a, owjVar.b, factory, Integer.valueOf(i), Integer.valueOf(i2));
        this.d = ((Integer) a(this.q, new Object[0])).intValue();
        this.m = f();
        c();
        this.c = l(erbVar);
        this.n = h();
        oct octVarJ = j(owjVar);
        this.o = octVarJ;
        i(octVarJ);
        this.l = g(vagVar);
        d();
        e();
        this.p = k();
    }

    @Deprecated
    public owg(owj owjVar, vag vagVar, LayoutInflater.Factory factory, erb erbVar) {
        this(owjVar, owjVar.a, owjVar.b, factory);
        this.d = ((Integer) a(this.q, new Object[0])).intValue();
        this.m = f();
        c();
        this.c = l(erbVar);
        this.n = h();
        oct octVarJ = j(owjVar);
        this.o = octVarJ;
        i(octVarJ);
        this.l = g(vagVar);
        d();
        e();
        this.p = k();
    }
}

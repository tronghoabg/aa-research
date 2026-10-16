package defpackage;

import android.companion.virtual.VirtualDeviceManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.hardware.input.VirtualDpad;
import android.hardware.input.VirtualKeyEvent;
import android.hardware.input.VirtualTouchEvent;
import android.hardware.input.VirtualTouchscreen;
import android.os.Build;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.gms.car.CarActivityLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ipn {
    public static final yph a = yph.c("CAR.WM.NATIVE");
    public static final Size b = new Size(480, 320);
    public static final Size c = new Size(320, 480);
    public final jkk d;
    public final ComponentName e;
    public iph f;
    public boolean g;
    public final EnumMap h;
    public final String i;
    public ajmd j;
    private final CarRegionId k;
    private final afeh l;
    private final jki m;
    private jhf n;
    private DrawingSpec o;
    private boolean p;
    private boolean q;
    private Rect r;
    private View s;
    private boolean t;
    private boolean u;
    private final kwq v;
    private final ipe w;

    public ipn(jkk jkkVar, CarRegionId carRegionId, int i, Rect rect, Rect rect2, UUID uuid, ProjectionWindowDecorationParams projectionWindowDecorationParams, ComponentName componentName, yfq yfqVar, int i2, int i3) {
        carRegionId.getClass();
        rect.getClass();
        rect2.getClass();
        uuid.getClass();
        projectionWindowDecorationParams.getClass();
        componentName.getClass();
        yfqVar.getClass();
        fun funVar = new fun(jkkVar, carRegionId, 12, null);
        this.d = jkkVar;
        this.k = carRegionId;
        this.e = componentName;
        this.l = funVar;
        this.r = new Rect();
        this.h = new EnumMap(ipm.class);
        this.v = new kwq(this, 1, null);
        this.w = new ipe(this, 2);
        jkc jkcVar = new jkc();
        jkcVar.n(carRegionId);
        jkcVar.c(componentName);
        jkcVar.l(1);
        jkcVar.m(i);
        jkcVar.d(rect);
        jkcVar.g(rect2);
        jkcVar.e(new ipl(this));
        jkcVar.b(uuid);
        jkcVar.k(projectionWindowDecorationParams);
        jkcVar.j(yfqVar);
        jkcVar.h(i2);
        jkcVar.i(i3);
        this.m = jkcVar.a();
        Objects.toString(componentName);
        this.i = "NativeDisplay:".concat(componentName.toString());
    }

    private final synchronized WindowManager.LayoutParams u(ipm ipmVar, int i, View view) {
        ViewGroup.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        if (view != null) {
            try {
                layoutParams = view.getLayoutParams();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            layoutParams = null;
        }
        layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new WindowManager.LayoutParams(ipmVar.g, 24, -2);
        }
        if (ipmVar.a()) {
            layoutParams2.width = i;
        } else {
            layoutParams2.height = i;
        }
        layoutParams2.setSystemApplicationOverlay(true);
        layoutParams2.alpha = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.gravity = ipmVar.f;
        layoutParams2.setFitInsetsTypes(0);
        layoutParams2.layoutInDisplayCutoutMode = 3;
        layoutParams2.setTitle(ipmVar.name());
        layoutParams2.setInsetsParams(woy.bg(new WindowManager.InsetsParams(ipmVar.e)));
        return layoutParams2;
    }

    private final synchronized void v() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038, 24, -2);
        layoutParams.setSystemApplicationOverlay(true);
        layoutParams.height = 0;
        layoutParams.gravity = 80;
        layoutParams.setFitInsetsTypes(0);
        layoutParams.setTitle("InsetsListener");
        Context context = ((ina) this.d).l;
        View view = new View(context);
        view.setOnApplyWindowInsetsListener(new jsg(this, 1));
        iph iphVar = this.f;
        if (iphVar == null) {
            throw new IllegalStateException("Trying to add inset listener on null display");
        }
        Context contextCreateWindowContext = context.createWindowContext(iphVar.c(), 2038, null);
        contextCreateWindowContext.getClass();
        View view2 = this.s;
        Object systemService = contextCreateWindowContext.getSystemService((Class<Object>) WindowManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Unable to get window manager for native display");
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (view2 != null) {
            windowManager.removeViewImmediate(view2);
        }
        windowManager.addView(view, layoutParams);
        this.s = view;
        a.l().R("insets params: %s, context: %s, view: %s", layoutParams, contextCreateWindowContext, view);
    }

    private final synchronized void w(DrawingSpec drawingSpec) {
        iph iphVar;
        this.o = drawingSpec;
        if (this.g && (iphVar = this.f) != null) {
            iphVar.j(drawingSpec.d);
        }
        int iF = fyh.f(drawingSpec, this.d);
        a.l().D("Using %s dpi for %s", iF, this.e);
        iph iphVar2 = this.f;
        if (iphVar2 != null) {
            iphVar2.i(drawingSpec.a, drawingSpec.b, iF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:9:0x0014, B:11:0x0026, B:14:0x0035, B:16:0x003b, B:18:0x0056, B:21:0x005b, B:24:0x006a, B:26:0x0070, B:32:0x0082, B:33:0x008d, B:35:0x0097, B:28:0x0076, B:30:0x007c), top: B:43:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:9:0x0014, B:11:0x0026, B:14:0x0035, B:16:0x003b, B:18:0x0056, B:21:0x005b, B:24:0x006a, B:26:0x0070, B:32:0x0082, B:33:0x008d, B:35:0x0097, B:28:0x0076, B:30:0x007c), top: B:43:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[Catch: all -> 0x009e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000f, B:9:0x0014, B:11:0x0026, B:14:0x0035, B:16:0x003b, B:18:0x0056, B:21:0x005b, B:24:0x006a, B:26:0x0070, B:32:0x0082, B:33:0x008d, B:35:0x0097, B:28:0x0076, B:30:0x007c), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void x(defpackage.ipm r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.EnumMap r0 = r7.h     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Throwable -> L9e
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            if (r9 != 0) goto Lf
            if (r1 == 0) goto L9c
            r9 = r2
        Lf:
            iph r3 = r7.f     // Catch: java.lang.Throwable -> L9e
            r4 = 0
            if (r3 == 0) goto L24
            jkk r5 = r7.d     // Catch: java.lang.Throwable -> L9e
            android.view.Display r3 = r3.c()     // Catch: java.lang.Throwable -> L9e
            int r6 = r8.g     // Catch: java.lang.Throwable -> L9e
            ina r5 = (defpackage.ina) r5     // Catch: java.lang.Throwable -> L9e
            android.content.Context r5 = r5.l     // Catch: java.lang.Throwable -> L9e
            android.content.Context r4 = defpackage.a$$ExternalSyntheticApiModelOutline2.m(r5, r3, r6, r4)     // Catch: java.lang.Throwable -> L9e
        L24:
            if (r4 != 0) goto L35
            yph r8 = defpackage.ipn.a     // Catch: java.lang.Throwable -> L9e
            yop r8 = r8.h()     // Catch: java.lang.Throwable -> L9e
            ype r8 = (defpackage.ype) r8     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = "Unable to create window context, no insets will work"
            r8.u(r9)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)
            return
        L35:
            android.view.WindowManager$LayoutParams r3 = r7.u(r8, r9, r1)     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L6a
            jkk r9 = r7.d     // Catch: java.lang.Throwable -> L9e
            android.widget.FrameLayout r1 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L9e
            ina r9 = (defpackage.ina) r9     // Catch: java.lang.Throwable -> L9e
            android.content.Context r9 = r9.l     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L9e
            r1.setBackgroundColor(r2)     // Catch: java.lang.Throwable -> L9e
            r0.put(r8, r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.Class<android.view.WindowManager> r9 = android.view.WindowManager.class
            java.lang.Object r9 = r4.getSystemService(r9)     // Catch: java.lang.Throwable -> L9e
            android.view.WindowManager r9 = (android.view.WindowManager) r9     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L5b
            r9.addView(r1, r3)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)
            return
        L5b:
            yph r9 = defpackage.ipn.a     // Catch: java.lang.Throwable -> L9e
            yop r9 = r9.h()     // Catch: java.lang.Throwable -> L9e
            ype r9 = (defpackage.ype) r9     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "Unable to add inset %s"
            r9.y(r0, r8)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)
            return
        L6a:
            boolean r0 = r8.a()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L76
            int r0 = r1.getWidth()     // Catch: java.lang.Throwable -> L9e
            if (r9 == r0) goto L82
        L76:
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L9e
            if (r8 != 0) goto L8d
            int r8 = r1.getHeight()     // Catch: java.lang.Throwable -> L9e
            if (r9 != r8) goto L8d
        L82:
            yph r8 = defpackage.ipn.a     // Catch: java.lang.Throwable -> L9e
            yop r8 = r8.l()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = "No inset change, ignoring"
            r8.u(r9)     // Catch: java.lang.Throwable -> L9e
        L8d:
            java.lang.Class<android.view.WindowManager> r8 = android.view.WindowManager.class
            java.lang.Object r8 = r4.getSystemService(r8)     // Catch: java.lang.Throwable -> L9e
            android.view.WindowManager r8 = (android.view.WindowManager) r8     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L9c
            r8.updateViewLayout(r1, r3)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r7)
            return
        L9c:
            monitor-exit(r7)
            return
        L9e:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipn.x(ipm, int):void");
    }

    public final synchronized jhf a() {
        jhf jhfVar;
        jhfVar = this.n;
        if (jhfVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return jhfVar;
    }

    public final synchronized Integer b() {
        iph iphVar = this.f;
        if (iphVar == null) {
            return null;
        }
        return Integer.valueOf(iphVar.c().getDisplayId());
    }

    public final synchronized void c() {
        a.l().u("destroy()");
        this.g = false;
        this.o = null;
        if (this.t) {
            iph iphVar = this.f;
            if (iphVar != null) {
                iphVar.h(this.w);
            }
            this.t = false;
        }
        iph iphVar2 = this.f;
        if (iphVar2 != null) {
            iphVar2.g();
        }
        this.f = null;
        jkk jkkVar = this.d;
        ((ina) jkkVar).m.i(this.v);
        this.u = false;
        this.p = false;
    }

    public final synchronized void d(MotionEvent motionEvent) {
        VirtualTouchscreen virtualTouchscreenB;
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            VirtualTouchEvent.Builder builder = new VirtualTouchEvent.Builder();
            int action = motionEvent.getAction() & 255;
            int i2 = 5;
            if (action == 5) {
                action = 0;
            } else if (action == 6) {
                action = 1;
            }
            VirtualTouchEvent.Builder action2 = builder.setAction(action);
            if (motionEvent.getAction() != 3) {
                i2 = 1;
            }
            VirtualTouchEvent virtualTouchEventBuild = action2.setToolType(i2).setPointerId(pointerId).setX(motionEvent.getX(i)).setY(motionEvent.getY(i)).setPressure(1.0f).setEventTimeNanos(motionEvent.getEventTimeNanos()).build();
            virtualTouchEventBuild.getClass();
            iph iphVar = this.f;
            if (iphVar != null && (virtualTouchscreenB = iphVar.b()) != null) {
                virtualTouchscreenB.sendTouchEvent(virtualTouchEventBuild);
            }
        }
    }

    public final synchronized void e(DrawingSpec drawingSpec) {
        boolean z;
        DrawingSpec drawingSpec2;
        yph yphVar = a;
        yphVar.l().y("Surface %s ready", drawingSpec);
        if (this.q || !((drawingSpec2 = this.o) == null || (drawingSpec.b == drawingSpec2.b && drawingSpec.a == drawingSpec2.a))) {
            yphVar.l().y("Spec differs from current spec or pending resize, updating to %s", drawingSpec);
            w(drawingSpec);
            this.q = false;
            z = true;
        } else {
            z = false;
        }
        this.o = drawingSpec;
        iph iphVar = this.f;
        if (iphVar != null) {
            if (this.p && this.g) {
                yphVar.l().y("Surface available for %s which was waiting, finishing resume", this.i);
                this.p = false;
                if (!z) {
                    iphVar.j(drawingSpec.d);
                }
                ajmd ajmdVar = this.j;
                if (ajmdVar != null) {
                    ajmdVar.J();
                }
            }
            if (acpf.m() && Build.VERSION.SDK_INT >= 37) {
                v();
                r(this.r);
            }
        } else {
            afeh afehVar = this.l;
            jkk jkkVar = this.d;
            Boolean boolValueOf = Boolean.valueOf(jkkVar.o().b);
            String str = this.i;
            Object objInvoke = afehVar.invoke(drawingSpec, boolValueOf, str);
            this.f = (iph) objInvoke;
            ajmd ajmdVar2 = this.j;
            if (ajmdVar2 != null) {
                int displayId = ((iph) objInvoke).c().getDisplayId();
                ype ypeVar = (ype) ioq.E.l().ai(846);
                Object obj = ajmdVar2.a;
                ypeVar.K("%s onDisplayAdded(%s)", ((ioq) obj).i, displayId);
                ilb.d();
                if (!dlz.M()) {
                    jkk jkkVar2 = ((ioq) obj).y;
                    ComponentName componentName = ((ioq) obj).d;
                    PackageManager packageManager = ((ina) jkkVar2).l.getPackageManager();
                    String packageName = componentName.getPackageName();
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(1L)).activities;
                        if (activityInfoArr == null) {
                            ((ype) ((ype) ioq.E.h()).ai(836)).y("No activities for %s", ((ioq) obj).d);
                        } else {
                            HashSet hashSet = new HashSet();
                            for (ActivityInfo activityInfo : activityInfoArr) {
                                try {
                                    ComponentName componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
                                    if (((ioq) obj).G.s(componentName2)) {
                                        hashSet.add(componentName2);
                                    }
                                } catch (IllegalArgumentException e) {
                                    ((ype) ((ype) ((ype) ioq.E.h()).p(e)).ai((char) 835)).u("Component name was invalid, continuing");
                                }
                            }
                            ((ype) ioq.E.l().ai((char) 834)).y("Allowed activities: %s", hashSet);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        ((ype) ((ype) ioq.E.h()).ai((char) 837)).y("Cannot find %s from PackageManager.", packageName);
                    }
                }
                Configuration configuration = ((ioq) obj).O;
                if (configuration != null) {
                    ((ioq) obj).M(configuration);
                    ((ioq) obj).O = null;
                }
                if (((ioq) obj).H.b() == iop.b) {
                    ((ioq) obj).O(displayId);
                }
            }
            if (this.g) {
                yop yopVarL = yphVar.l();
                Surface surface = drawingSpec.d;
                yopVarL.M("Display %s is resumed, setting to newly available surface: %s", str, surface);
                ((iph) objInvoke).j(surface);
                if (this.p) {
                    this.p = false;
                    yphVar.l().y("Surface available for %s which was waiting, finishing resume", str);
                    ajmd ajmdVar3 = this.j;
                    if (ajmdVar3 != null) {
                        ajmdVar3.J();
                    }
                }
            }
            if (!this.u) {
                ((ina) jkkVar).m.d(this.v);
                this.u = true;
            }
            if (acpf.m() && Build.VERSION.SDK_INT >= 37) {
                v();
                r(this.r);
            }
        }
    }

    public final void f() {
        ajmd ajmdVar = this.j;
        if (ajmdVar != null) {
            ajmdVar.I();
        }
    }

    public final synchronized void g() {
        ilb.d();
        if (this.n != null) {
            m();
            return;
        }
        jhf jhfVarJ = this.d.j(this.m);
        if (jhfVarJ == null) {
            throw new IllegalStateException("Unable to create ProjectionWindow!");
        }
        this.n = jhfVarJ;
    }

    public final synchronized void h(KeyEvent keyEvent) {
        VirtualKeyEvent virtualKeyEventBuild = new VirtualKeyEvent.Builder().setKeyCode(keyEvent.getKeyCode()).setAction(keyEvent.getAction()).setEventTimeNanos(keyEvent.getEventTime()).build();
        virtualKeyEventBuild.getClass();
        iph iphVar = this.f;
        if (iphVar != null) {
            if (Build.VERSION.SDK_INT < 34) {
                throw new IllegalStateException("Check failed.");
            }
            VirtualDpad virtualDpad = iphVar.b;
            if (virtualDpad != null) {
                virtualDpad.sendKeyEvent(virtualKeyEventBuild);
            }
        }
    }

    public final synchronized void i() {
        iph iphVar = this.f;
        if (iphVar == null || this.t) {
            return;
        }
        iphVar.d(this.w, new zhb(zfq.a));
        this.t = true;
    }

    public final synchronized void j() {
        DrawingSpec drawingSpec = this.o;
        if (drawingSpec != null) {
            int iF = fyh.f(drawingSpec, this.d);
            iph iphVar = this.f;
            if (iphVar != null) {
                iphVar.i(drawingSpec.a, drawingSpec.b, iF);
            }
        }
    }

    public final synchronized void k() {
        a.l().u("pause()");
        ilb.d();
        this.g = false;
        this.p = false;
        this.o = null;
        iph iphVar = this.f;
        if (iphVar != null) {
            iphVar.j(null);
        }
    }

    public final synchronized void l() {
        ilb.d();
        jhf jhfVar = this.n;
        if (jhfVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        jhfVar.af();
    }

    public final synchronized void m() {
        yop yopVarL = a.l();
        jhf jhfVar = this.n;
        yopVarL.y("reattachWindow() %s", jhfVar != null ? jhfVar.E() : null);
        jhf jhfVar2 = this.n;
        if (jhfVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (jhfVar2.aD()) {
            ((ina) this.d).ak(this.n, 0);
        }
    }

    public final synchronized void n(IntentFilter intentFilter, Executor executor, VirtualDeviceManager.IntentInterceptorCallback intentInterceptorCallback) {
        intentInterceptorCallback.getClass();
        iph iphVar = this.f;
        if (iphVar != null) {
            iphVar.f(intentFilter, executor, intentInterceptorCallback);
        }
    }

    public final synchronized void o(CarActivityLayoutParams carActivityLayoutParams, UUID uuid) {
        uuid.getClass();
        ilb.d();
        jhf jhfVar = this.n;
        if (jhfVar == null) {
            throw new IllegalStateException("Cannot resize null ProjectionWindow");
        }
        jhfVar.E();
        jhfVar.ap();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        Rect rect = new Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2);
        Rect rect2 = carActivityLayoutParams.f;
        int i3 = carActivityLayoutParams.j;
        int i4 = carActivityLayoutParams.k;
        int i5 = carActivityLayoutParams.e;
        yfq yfqVarA = carActivityLayoutParams.a();
        ProjectionWindowDecorationParams projectionWindowDecorationParams = carActivityLayoutParams.g;
        jhf jhfVar2 = this.n;
        if (jhfVar2 != null) {
            jhfVar2.E();
        }
        jhfVar.n();
        jhfVar.s();
        this.d.f(jhfVar, rect, rect2, i3, i4, i5, yfqVarA, uuid, projectionWindowDecorationParams);
        DrawingSpec drawingSpecAL = jhfVar.aL();
        if (drawingSpecAL != null) {
            w(drawingSpecAL);
        } else {
            a.l().u("No drawing spec available, will wait to resize until there is a surface available");
            this.q = true;
        }
        jhfVar.K();
        jhf jhfVar3 = this.n;
        if (jhfVar3 != null) {
            jhfVar3.E();
        }
    }

    public final synchronized void p() {
        yph yphVar = a;
        yphVar.l().u("resume()");
        ilb.d();
        this.g = true;
        jhf jhfVar = this.n;
        if (jhfVar == null) {
            throw new IllegalStateException("NativeAppCarActivityDisplay must call initializeIfNeeded first");
        }
        iph iphVar = this.f;
        if (!jhfVar.aB() && iphVar != null) {
            DrawingSpec drawingSpec = this.o;
            if ((drawingSpec != null ? drawingSpec.d : null) != null) {
                yphVar.l().u("Surface ready immediately");
                DrawingSpec drawingSpec2 = this.o;
                iphVar.j(drawingSpec2 != null ? drawingSpec2.d : null);
                ajmd ajmdVar = this.j;
                if (ajmdVar != null) {
                    ajmdVar.J();
                    return;
                }
                return;
            }
        }
        yphVar.l().u("Waiting for surface available in resume");
        this.p = true;
    }

    public final synchronized void q(VirtualDeviceManager.IntentInterceptorCallback intentInterceptorCallback) {
        intentInterceptorCallback.getClass();
        iph iphVar = this.f;
        if (iphVar != null) {
            iphVar.k(intentInterceptorCallback);
        }
    }

    public final void r(Rect rect) {
        this.r = rect;
        x(ipm.a, rect.bottom);
        x(ipm.c, rect.left);
        x(ipm.d, rect.right);
        x(ipm.b, rect.top);
    }

    public final synchronized boolean s(ComponentName componentName) {
        iph iphVar = this.f;
        if (iphVar == null) {
            ((ype) a.h()).y("Unable to add activity exemptions for %s", componentName);
            return false;
        }
        iphVar.e(componentName);
        return true;
    }

    public final synchronized boolean t(int i) {
        iph iphVar = this.f;
        if (iphVar == null) {
            ((ype) a.f()).D("No display to set UiMode to %s -- %s", i, this);
            return false;
        }
        iphVar.c.a(iphVar.a(), i);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NativeAppCarActivityDisplay[component=" + this.e + ", drawingSpec= " + this.o + ", resumed= " + this.g + " finishResumeOnWindowReady= " + this.p + "]");
        sb.append('\n');
        iph iphVar = this.f;
        Objects.toString(iphVar);
        sb.append("\t display= ".concat(String.valueOf(iphVar)));
        sb.append('\n');
        jhf jhfVar = this.n;
        Objects.toString(jhfVar);
        sb.append("\t window= ".concat(String.valueOf(jhfVar)));
        sb.append('\n');
        return sb.toString();
    }
}

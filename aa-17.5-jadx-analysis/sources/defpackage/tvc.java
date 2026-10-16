package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tvc {
    private float A;
    private final tpf B;
    private final tpf C;
    private final tpf D;
    private final float E;
    private float F;
    private float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private final boolean L;
    private float M;
    private float N;
    private long O;
    private final VelocityTracker P;
    private tve Q;
    private final tuv R;
    private final tuy S;
    private final View T;
    public float a;
    public float b;
    public float c;
    private final Context d;
    private MotionEvent e;
    private MotionEvent f;
    private final List g;
    private final List h;
    private final tur i;
    private final tur j;
    private final tur k;
    private final tur l;
    private final ArrayDeque m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public tvc(tuy tuyVar, View view) {
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.h = new ArrayList();
        this.m = new ArrayDeque();
        this.B = new tpf();
        this.C = new tpf();
        this.D = new tpf();
        this.O = 0L;
        Context context = view.getContext();
        this.d = context;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.E = viewConfiguration.getScaledEdgeSlop();
        this.S = tuyVar;
        this.T = view;
        float f = 160.0f;
        this.M = 160.0f;
        this.N = 160.0f;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            this.M = displayMetrics.xdpi;
            f = displayMetrics.ydpi;
            this.N = f;
        }
        tvj tvjVar = new tvj(2, tuyVar, this.M, f);
        this.j = tvjVar;
        arrayList.add(tvjVar);
        tvj tvjVar2 = new tvj(3, tuyVar, this.M, this.N);
        this.k = tvjVar2;
        arrayList.add(tvjVar2);
        arrayList.add(new tvk(tuyVar, this.M, this.N, viewConfiguration.getScaledTouchSlop()));
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.L = !zHasSystemFeature;
        if (zHasSystemFeature) {
            tvf tvfVar = new tvf(tuyVar, this.M, this.N);
            this.l = tvfVar;
            arrayList.add(tvfVar);
        } else {
            tvh tvhVar = new tvh(tuyVar, this.M, this.N);
            this.l = tvhVar;
            arrayList.add(tvhVar);
        }
        tvg tvgVar = new tvg(tuyVar, this.M, this.N);
        this.i = tvgVar;
        arrayList.add(tvgVar);
        tuv tuvVar = new tuv(context, tuyVar, new Handler(Looper.getMainLooper()));
        this.R = tuvVar;
        tuvVar.x = true;
        tuvVar.l = tuyVar;
        this.P = VelocityTracker.obtain();
    }

    private final EnumSet f() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(tvb.class);
        if (this.j.b || this.k.b) {
            enumSetNoneOf.add(tvb.d);
        } else if (!this.L) {
            enumSetNoneOf.add(tvb.a);
        }
        if (this.i.b) {
            enumSetNoneOf.add(tvb.b);
        }
        if (this.l.b && !this.L) {
            enumSetNoneOf.add(tvb.c);
        }
        return enumSetNoneOf;
    }

    private final void g(MotionEvent motionEvent) {
        float f = this.F;
        float f2 = this.G;
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        int pointerCount = motionEvent.getPointerCount() - 1;
        float f3 = this.E;
        float y2 = motionEvent.getY(pointerCount);
        boolean z = x < f3 || y < f3 || x > f || y > f2;
        boolean z2 = x2 < f3 || y2 < f3 || x2 > f || y2 > f2;
        if (z && z2) {
            this.a = -1.0f;
            this.b = -1.0f;
            this.H = true;
        } else if (z) {
            this.a = motionEvent.getX(motionEvent.getPointerCount() - 1);
            this.b = motionEvent.getY(motionEvent.getPointerCount() - 1);
            this.H = true;
        } else if (!z2) {
            this.K = true;
            this.H = false;
        } else {
            this.a = motionEvent.getX(0);
            this.b = motionEvent.getY(0);
            this.H = true;
        }
    }

    private final void h() {
        List list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tur turVar = (tur) list.get(i);
            woy.ad(turVar.b, "Ending inactive gesture: %s", turVar);
            turVar.a(this);
        }
        list.clear();
    }

    private final void i() {
        this.e = null;
        this.f = null;
        this.H = false;
        this.K = false;
        this.h.clear();
        ArrayDeque arrayDeque = this.m;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((tuw) it.next()).d();
        }
        arrayDeque.clear();
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tur turVar = (tur) list.get(i);
            if (turVar.b) {
                turVar.a(this);
            }
        }
    }

    private final void j(MotionEvent motionEvent) {
        this.f = MotionEvent.obtain(motionEvent);
        this.s = -1.0f;
        this.t = -1.0f;
        this.w = -1.0f;
        this.x = BitmapDescriptorFactory.HUE_RED;
        this.I = false;
        this.J = false;
        MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float x2 = motionEvent2.getX(motionEvent2.getPointerCount() - 1);
        float y2 = motionEvent2.getY(motionEvent2.getPointerCount() - 1);
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float x4 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float f = x2 - x;
        float f2 = x4 - x3;
        float y4 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        float f3 = y4 - y3;
        this.o = f;
        this.p = y2 - y;
        this.q = f2;
        this.r = f3;
        this.u = y;
        this.v = y3;
        this.a = (f2 * 0.5f) + x3;
        this.b = (f3 * 0.5f) + y3;
        this.c = (f * 0.5f) + x;
        motionEvent.getEventTime();
        motionEvent2.getEventTime();
        this.z = motionEvent.getPressure(0) + motionEvent.getPressure(motionEvent.getPointerCount() - 1);
        this.A = motionEvent2.getPressure(0) + motionEvent2.getPressure(motionEvent2.getPointerCount() - 1);
        tpf tpfVar = this.B;
        tpfVar.n(this.o, this.p);
        tpf tpfVar2 = this.C;
        tpfVar2.n(x3 - x, y3 - y);
        tpf tpfVar3 = this.D;
        tpfVar3.n(x4 - x2, y4 - y2);
        tpfVar.b(tpfVar3);
        tpfVar.b(tpfVar2);
    }

    private final boolean k() {
        return !this.h.isEmpty();
    }

    private static boolean l(tur turVar) {
        return turVar.b;
    }

    private final boolean m(MotionEvent motionEvent) {
        return motionEvent.getEventTime() <= this.O + 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvc.n(android.view.MotionEvent):void");
    }

    public final float a() {
        if (!l(this.l)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        MotionEvent motionEvent = this.f;
        motionEvent.getClass();
        MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        if (motionEvent.getPointerCount() != motionEvent2.getPointerCount()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (!this.J) {
            this.y = a.I(tuw.a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(motionEvent2.getPointerCount() - 1), motionEvent2.getY(motionEvent2.getPointerCount() - 1)), tuw.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(motionEvent.getPointerCount() - 1), motionEvent.getY(motionEvent.getPointerCount() - 1))) * 57.295776f;
            this.J = true;
        }
        return this.y;
    }

    public final float b() {
        if (!l(this.i)) {
            return 1.0f;
        }
        MotionEvent motionEvent = this.f;
        motionEvent.getClass();
        MotionEvent motionEvent2 = this.e;
        motionEvent2.getClass();
        if (motionEvent.getPointerCount() != motionEvent2.getPointerCount()) {
            return 1.0f;
        }
        float f = this.w;
        if (f != -1.0f) {
            return f;
        }
        float fHypot = this.s;
        if (fHypot == -1.0f) {
            fHypot = (float) Math.hypot(this.q, this.r);
            this.s = fHypot;
        }
        float fHypot2 = this.t;
        if (fHypot2 == -1.0f) {
            fHypot2 = (float) Math.hypot(this.o, this.p);
            this.t = fHypot2;
        }
        if (fHypot == BitmapDescriptorFactory.HUE_RED || fHypot2 == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        float f2 = fHypot / fHypot2;
        this.w = f2;
        return f2;
    }

    public final float c() {
        if (!l(this.j)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (!this.I) {
            this.x = (this.v - this.u) * 0.25f;
            this.I = true;
        }
        return this.x;
    }

    public final boolean d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        tuv tuvVar = this.R;
        if (action == 9) {
            return tuvVar.k.b(motionEvent);
        }
        if (motionEvent.getAction() != 7) {
            return false;
        }
        return tuvVar.k.c(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
    
        if (r2 != 6) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvc.e(android.view.MotionEvent):void");
    }
}

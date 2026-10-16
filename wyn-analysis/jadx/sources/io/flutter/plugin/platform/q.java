package io.flutter.plugin.platform;

import A7.AbstractC0279p0;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import ba.C1521a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kc.C3288A;
import kc.C3289a;
import lc.C3458b;

/* loaded from: classes5.dex */
public final class q implements j {

    /* renamed from: w, reason: collision with root package name */
    public static final Class[] f37132w = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    public C3289a f37134b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f37135c;

    /* renamed from: d, reason: collision with root package name */
    public kc.r f37136d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f37137e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.i f37138f;

    /* renamed from: g, reason: collision with root package name */
    public t6.q f37139g;

    /* renamed from: t, reason: collision with root package name */
    public final C1521a f37151t;

    /* renamed from: o, reason: collision with root package name */
    public int f37146o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37147p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37148q = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37152u = false;

    /* renamed from: v, reason: collision with root package name */
    public final n f37153v = new n(this, 0);

    /* renamed from: a, reason: collision with root package name */
    public final n f37133a = new n(2);

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f37141i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final C2865a f37140h = new C2865a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f37142j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f37144m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f37149r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f37150s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f37145n = new SparseArray();
    public final SparseArray k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f37143l = new SparseArray();

    public q() {
        if (C1521a.f19411d == null) {
            C1521a.f19411d = new C1521a(13);
        }
        this.f37151t = C1521a.f19411d;
    }

    public static void e(q qVar, tc.d dVar) {
        qVar.getClass();
        int i5 = dVar.f45986g;
        if (i5 == 0 || i5 == 1) {
            return;
        }
        throw new IllegalStateException(AbstractC0279p0.j(dVar.f45980a, ")", pd.f.l(i5, "Trying to create a view with unknown direction value: ", "(view id: ")));
    }

    public static void h(int i5) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < i5) {
            throw new IllegalStateException(R8.v.e(i10, i5, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static g l(io.flutter.embedding.engine.renderer.k kVar) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerC = kVar.c(i5 <= 34 ? 2 : 1);
            n nVar = new n(4);
            nVar.f37116b = textureRegistry$SurfaceProducerC;
            return nVar;
        }
        if (i5 >= 29) {
            return new F4.f(kVar.b());
        }
        io.flutter.embedding.engine.renderer.i iVarD = kVar.d();
        x xVar = new x();
        xVar.f37166a = 0;
        xVar.f37167b = 0;
        xVar.f37168c = false;
        w wVar = new w(xVar);
        xVar.f37169d = iVarD;
        xVar.f37170e = iVarD.f36987b.surfaceTexture();
        iVarD.f36989d = wVar;
        return xVar;
    }

    @Override // io.flutter.plugin.platform.j
    public final void a(io.flutter.view.l lVar) {
        this.f37140h.f37090a = lVar;
    }

    @Override // io.flutter.plugin.platform.j
    public final View b(int i5) {
        if (c(i5)) {
            return ((B) this.f37141i.get(Integer.valueOf(i5))).a();
        }
        e eVar = (e) this.k.get(i5);
        if (eVar == null) {
            return null;
        }
        return eVar.getView();
    }

    @Override // io.flutter.plugin.platform.j
    public final boolean c(int i5) {
        return this.f37141i.containsKey(Integer.valueOf(i5));
    }

    @Override // io.flutter.plugin.platform.j
    public final void d() {
        this.f37140h.f37090a = null;
    }

    public final e f(tc.d dVar, boolean z2) {
        HashMap map = (HashMap) this.f37133a.f37116b;
        String str = dVar.f45981b;
        f fVar = (f) map.get(str);
        if (fVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = dVar.f45988i;
        Object objB = byteBuffer != null ? fVar.getCreateArgsCodec().b(byteBuffer) : null;
        Context mutableContextWrapper = z2 ? new MutableContextWrapper(this.f37135c) : this.f37135c;
        int i5 = dVar.f45980a;
        e eVarCreate = fVar.create(mutableContextWrapper, i5, objB);
        View view = eVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(dVar.f45986g);
        this.k.put(i5, eVarCreate);
        kc.r rVar = this.f37136d;
        if (rVar == null) {
            return eVarCreate;
        }
        eVarCreate.onFlutterViewAttached(rVar);
        return eVarCreate;
    }

    public final void g() {
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f37144m;
            if (i5 >= sparseArray.size()) {
                return;
            }
            C2867c c2867c = (C2867c) sparseArray.valueAt(i5);
            c2867c.b();
            c2867c.f39496a.close();
            i5++;
        }
    }

    public final void i(boolean z2) {
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f37144m;
            if (i5 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i5);
            C2867c c2867c = (C2867c) sparseArray.valueAt(i5);
            if (this.f37149r.contains(Integer.valueOf(iKeyAt))) {
                C3458b c3458b = this.f37136d.f39521h;
                if (c3458b != null) {
                    c2867c.a(c3458b.f40252b);
                }
                z2 &= c2867c.c();
            } else {
                if (!this.f37147p) {
                    c2867c.b();
                }
                c2867c.setVisibility(8);
                this.f37136d.removeView(c2867c);
            }
            i5++;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f37143l;
            if (i10 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i10);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f37150s.contains(Integer.valueOf(iKeyAt2)) || (!z2 && this.f37148q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i10++;
        }
    }

    public final float j() {
        return this.f37135c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void k() {
        if (!this.f37148q || this.f37147p) {
            return;
        }
        kc.r rVar = this.f37136d;
        rVar.f39517d.pause();
        kc.m mVar = rVar.f39516c;
        if (mVar == null) {
            kc.m mVar2 = new kc.m(rVar.getContext(), rVar.getWidth(), rVar.getHeight(), 1);
            rVar.f39516c = mVar2;
            rVar.addView(mVar2);
        } else {
            mVar.e(rVar.getWidth(), rVar.getHeight());
        }
        rVar.f39518e = rVar.f39517d;
        kc.m mVar3 = rVar.f39516c;
        rVar.f39517d = mVar3;
        C3458b c3458b = rVar.f39521h;
        if (c3458b != null) {
            mVar3.a(c3458b.f40252b);
        }
        this.f37147p = true;
    }

    public final void m() {
        for (B b5 : this.f37141i.values()) {
            int width = b5.f37085f.getWidth();
            g gVar = b5.f37085f;
            int height = gVar.getHeight();
            boolean zIsFocused = b5.a().isFocused();
            v vVarDetachState = b5.f37080a.detachState();
            b5.f37087h.setSurface(null);
            b5.f37087h.release();
            b5.f37087h = ((DisplayManager) b5.f37081b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + b5.f37084e, width, height, b5.f37083d, gVar.getSurface(), 0, B.f37079i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(b5.f37081b, b5.f37087h.getDisplay(), b5.f37082c, vVarDetachState, b5.f37086g, zIsFocused);
            singleViewPresentation.show();
            b5.f37080a.cancel();
            b5.f37080a = singleViewPresentation;
        }
    }

    public final MotionEvent n(float f10, tc.f fVar, boolean z2) {
        MotionEvent motionEventI = this.f37151t.I(new C3288A(fVar.f46006p));
        List<List> list = (List) fVar.f45998g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f10;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i5 = fVar.f45996e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i5]);
        if (!z2 && motionEventI != null) {
            if (pointerCoordsArr.length < 1) {
                return motionEventI;
            }
            motionEventI.offsetLocation(pointerCoordsArr[0].x - motionEventI.getX(), pointerCoordsArr[0].y - motionEventI.getY());
            return motionEventI;
        }
        List<List> list3 = (List) fVar.f45997f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(fVar.f45993b.longValue(), fVar.f45994c.longValue(), fVar.f45995d, fVar.f45996e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i5]), pointerCoordsArr, fVar.f45999h, fVar.f46000i, fVar.f46001j, fVar.k, fVar.f46002l, fVar.f46003m, fVar.f46004n, fVar.f46005o);
    }

    public final int o(double d3) {
        return (int) Math.round(d3 * j());
    }
}

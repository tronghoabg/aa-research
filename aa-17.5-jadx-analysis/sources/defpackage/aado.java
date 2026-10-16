package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class aado implements ztt {
    public static final String b = "aado";
    public final aacz c;
    public boolean d;
    public veb e;
    private final aaev f;
    private final aaet g;
    private final View h;
    private vez i;
    private final CopyOnWriteArrayList j;

    public aado(aaev aaevVar, View view, aacz aaczVar) {
        aads aadsVar = aads.a;
        this.f = aaevVar;
        if (addm.l()) {
            this.g = null;
        } else {
            aaet aaetVarC = aaevVar.c();
            zkt.n(aaetVarC, "WorldModelState must not be null.");
            this.g = aaetVarC;
        }
        this.h = view;
        this.c = aaczVar;
        zkt.n(aadsVar, "CameraUtils must not be null");
        this.d = false;
        this.e = null;
        this.i = null;
        this.j = new CopyOnWriteArrayList();
    }

    private static void D(vez vezVar, CameraPosition cameraPosition) {
        if (vezVar == null) {
            return;
        }
        try {
            vezVar.a(cameraPosition);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    static int x(int i) {
        if (i == -1) {
            return 330;
        }
        return i;
    }

    public final void A(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.j;
        CameraPosition cameraPositionC = c();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            D((vez) it.next(), cameraPositionC);
        }
        if (z) {
            D(this.i, cameraPositionC);
        }
    }

    final void B(String str, CameraPosition cameraPosition, int i, boolean z, int i2) throws Throwable {
        String str2 = b;
        if (zrn.e(str2, 3)) {
            Log.d(str2, "Received: " + str + " -> " + String.valueOf(cameraPosition) + "  @ " + i + "ms");
        }
        zkt.f(!Float.isNaN(cameraPosition.zoom));
        veb vebVar = this.e;
        aadn aadnVar = vebVar != null ? new aadn(this, vebVar) : null;
        this.e = null;
        aaet aaetVar = this.g;
        CameraPosition cameraPositionH = aaetVar.h(cameraPosition);
        zkt.f(!Float.isNaN(cameraPositionH.zoom));
        CameraPosition cameraPositionB = this.c.b(cameraPositionH, aaetVar);
        if (!cameraPositionB.equals(cameraPositionH) && zrn.e(str2, 3)) {
            Log.d(str2, "Clamped camera to: ".concat(cameraPositionB.toString()));
        }
        int i3 = i == -1 ? 330 : i;
        aaetVar.v(z ? Float.valueOf(cameraPositionB.zoom) : null);
        aadp aaenVar = i3 == 0 ? new aaen(cameraPositionB, false, i2) : new aaeb(cameraPositionB, false, false, i3, i2);
        if (aadnVar != null) {
            aaenVar = new aacy(aaenVar, aadnVar);
        }
        if (zrn.e(str2, 3)) {
            Log.d(str2, "Requesting: " + str + " @ " + i3 + "ms => " + aaenVar.toString());
        }
        this.f.e(aaenVar);
    }

    final void C(aaem aaemVar, String str, CameraPosition cameraPosition, int i, boolean z, int i2) throws Throwable {
        int i3 = i;
        String str2 = b;
        if (zrn.e(str2, 3)) {
            Log.d(str2, "Received: " + str + " -> " + String.valueOf(cameraPosition) + "  @ " + i3 + "ms");
        }
        zkt.f(!Float.isNaN(cameraPosition.zoom));
        veb vebVar = this.e;
        aadn aadnVar = vebVar != null ? new aadn(this, vebVar) : null;
        this.e = null;
        aaemVar.j();
        aaet aaetVar = (aaet) aaemVar.b;
        CameraPosition cameraPositionH = aaetVar.h(cameraPosition);
        zkt.f(!Float.isNaN(cameraPositionH.zoom));
        aacz aaczVar = this.c;
        double dA = aaemVar.a();
        zsb zsbVarG = aaemVar.g();
        aaemVar.j();
        CameraPosition cameraPositionC = aaczVar.c(cameraPositionH, dA, zsbVarG, aaetVar.x(), aaemVar.b());
        if (!cameraPositionC.equals(cameraPositionH) && zrn.e(str2, 3)) {
            Log.d(str2, "Clamped camera to: ".concat(cameraPositionC.toString()));
        }
        if (i3 == -1) {
            i3 = 330;
        }
        aaemVar.k(z ? Float.valueOf(cameraPositionC.zoom) : null);
        aadp aaenVar = i3 == 0 ? new aaen(cameraPositionC, false, i2) : new aaeb(cameraPositionC, false, false, i3, i2);
        if (aadnVar != null) {
            aaenVar = new aacy(aaenVar, aadnVar);
        }
        if (zrn.e(str2, 3)) {
            Log.d(str2, "Requesting: " + str + " @ " + i3 + "ms => " + aaenVar.toString());
        }
        this.f.e(aaenVar);
    }

    @Override // defpackage.ztt
    public final float a(LatLng latLng) {
        zkt.n(latLng, "LatLng must not be null.");
        zkt.n(latLng, "latLng");
        return 21.0f;
    }

    @Override // defpackage.ztt
    public final float b() {
        return 2.0f;
    }

    @Override // defpackage.ztt
    public final CameraPosition c() {
        if (addm.j()) {
            aaev aaevVar = this.f;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                aaevVar.g.a();
                synchronized (aaevVar) {
                    if (aaevVar.h <= aaevVar.i) {
                        aaevVar.c.q(aaevVar.d);
                    }
                }
            }
        }
        if (!addm.l()) {
            return this.g.d();
        }
        aadg aadgVar = new aadg();
        this.f.d(aadgVar);
        return aadgVar.a;
    }

    @Override // defpackage.ztt
    public final CameraPosition d(LatLngBounds latLngBounds) {
        Object objJ;
        View view = this.h;
        zrq zrqVar = new zrq(view.getWidth(), view.getHeight());
        if (addm.l()) {
            aadh aadhVar = new aadh(zrqVar, 1);
            this.f.d(aadhVar);
            objJ = aadhVar.b;
        } else {
            objJ = this.g.j(zrqVar);
        }
        zrq zrqVar2 = (zrq) objJ;
        return y(latLngBounds, zrqVar2.a, zrqVar2.b, 0);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, zxm] */
    @Override // defpackage.ztt
    public final /* bridge */ /* synthetic */ zxm e() {
        View view = this.h;
        zrq zrqVar = new zrq(view.getWidth(), view.getHeight());
        if (!addm.l()) {
            return this.g.m(zrqVar);
        }
        aadh aadhVar = new aadh(zrqVar, 0);
        this.f.d(aadhVar);
        return aadhVar.b;
    }

    @Override // defpackage.ztt
    public final void f(vez vezVar) {
        if (vezVar != null) {
            this.j.add(vezVar);
        }
    }

    @Override // defpackage.ztt
    public final void g(CameraPosition cameraPosition, int i) throws Throwable {
        z(cameraPosition, i, 3);
    }

    @Override // defpackage.ztt
    public final void h(CameraPosition cameraPosition, int i) throws Throwable {
        z(cameraPosition, i, 2);
    }

    @Override // defpackage.ztt
    public final void i(LatLng latLng, int i) throws Throwable {
        zkt.n(latLng, "LatLng must not be null.");
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        if (addm.l()) {
            this.f.d(new aada(this, latLng, i));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        CameraPosition.Builder builder = CameraPosition.builder(c());
        builder.target(latLng);
        B("CAMERA_UPDATE_NEW_LATLNG", builder.build(), i, false, 3);
    }

    @Override // defpackage.ztt
    public final void j(LatLngBounds latLngBounds, int i, int i2) throws Throwable {
        ysi.X(latLngBounds, "LatLngBounds must not be null.");
        boolean z = true;
        ysi.T(i >= 0, a.bp(i, "Padding must be non-negative: "));
        ysi.T(i2 == -1 || i2 >= 0, a.bp(i2, "Invalid duration: "));
        View view = this.h;
        zrq zrqVar = new zrq(view.getWidth(), view.getHeight());
        if (addm.l()) {
            this.f.d(new aadd(this, zrqVar, i, latLngBounds, i2));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        zrq zrqVar2 = (zrq) this.g.j(zrqVar);
        int i3 = zrqVar2.b;
        if (i >= i3 / 2 && i >= zrqVar2.a / 2) {
            z = false;
        }
        int i4 = zrqVar2.a;
        ysi.T(z, a.br(i3, i4, i, "Additional padding must be less than half the existing padded map view width or height: ", " vs ", "x"));
        B("CAMERA_UPDATE_NEW_LATLNG_BOUNDS", y(latLngBounds, i4, i3, i), i2, false, 3);
    }

    @Override // defpackage.ztt
    public final void k(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) throws Throwable {
        ysi.X(latLngBounds, "LatLngBounds must not be null.");
        ysi.T(i > 0, a.bp(i, "Width must be non-negative: "));
        ysi.T(i2 > 0, a.bp(i2, "Height must be non-negative: "));
        ysi.T(i3 >= 0, a.bp(i3, "Padding must be non-negative: "));
        ysi.T(i4 == -1 || i4 >= 0, a.bp(i4, "Invalid duration: "));
        zrq zrqVar = new zrq(i, i2);
        if (addm.l()) {
            this.f.d(new aade(this, zrqVar, i, i3, i2, latLngBounds, i4));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        zrq zrqVar2 = (zrq) this.g.j(zrqVar);
        int i5 = zrqVar2.b;
        boolean z = i3 < i5 / 2 || i3 < zrqVar2.a / 2;
        int i6 = zrqVar2.a;
        ysi.T(z, a.br(i5, i6, i3, "Additional camera padding must be less than half of the existing padded map view width or height: ", " vs ", "x"));
        B("CAMERA_UPDATE_NEW_LATLNG_BOUNDS_WITH_DIMENSIONS", y(latLngBounds, i6, i5, i3), i4, false, 3);
    }

    @Override // defpackage.ztt
    public final void l(LatLng latLng, float f, int i) throws Throwable {
        zkt.n(latLng, "LatLng must not be null.");
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        ysi.U(f, "In newLatLngZoom()");
        if (addm.l()) {
            this.f.d(new aadb(this, latLng, f, i));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        CameraPosition.Builder builder = CameraPosition.builder(c());
        builder.target(latLng);
        builder.zoom(f);
        B("CAMERA_UPDATE_NEW_LATLNG_ZOOM", builder.build(), i, false, 3);
    }

    @Override // defpackage.ztt
    public final void m() {
        this.j.clear();
    }

    @Override // defpackage.ztt
    public final void n(vez vezVar) {
        this.j.remove(vezVar);
    }

    @Override // defpackage.ztt
    public final void o(float f, float f2, int i) throws Throwable {
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        if (addm.l()) {
            this.f.d(new aadm(this, f, f2, i));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        CameraPosition cameraPositionC = c();
        LatLng latLngI = this.g.i(f, f2, true);
        zkt.e(latLngI != null, "Unable to scroll to an invalid location.");
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionC);
        builder.target(latLngI);
        B("CAMERA_UPDATE_SCROLL_BY", builder.build(), x(i), false, 3);
    }

    @Override // defpackage.ztt
    public final void p(vez vezVar) {
        this.i = vezVar;
    }

    @Override // defpackage.ztt
    public final void q(int i, int i2, int i3, int i4) {
        aaep aaepVar = new aaep(i, i2, i3, i4);
        if (addm.l()) {
            this.f.d(new aadi(aaepVar, 1));
        } else {
            aaet aaetVar = this.g;
            aaetVar.r(aaepVar);
            String str = b;
            if (zrn.e(str, 3)) {
                Log.d(str, "Queueing: setPadding ".concat(aaepVar.toString()));
            }
            if (zrn.e(str, 3)) {
                Log.d(str, "Expected Optical Center: " + String.valueOf(aaetVar.o()) + " for " + String.valueOf(aaetVar.k()));
            }
        }
        this.f.f(new oyx(20));
    }

    @Override // defpackage.ztt
    public final void r() throws Throwable {
        if (addm.l()) {
            this.f.d(new aadi(this, 0));
            return;
        }
        ysi.V(!this.d, "Camera stopped during a cancellation");
        zkt.g(this.e == null, "stopAnimation() is not a CameraUpdate.");
        B("MAP_STOP_ANIMATION", c(), 0, false, -4);
    }

    @Override // defpackage.ztt
    public final void s(zts ztsVar, int i, veb vebVar, zys zysVar) {
        boolean z = true;
        ysi.V(!this.d, "Camera moved during a cancellation");
        zkt.g(this.e == null, "Another CameraUpdate is already in progress.");
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        if (i == 0 && vebVar != null) {
            z = false;
        }
        ysi.T(z, "Callback supplied with instantaneous camera movement");
        zkt.n(zysVar, "UsageLog must not be null.");
        this.e = vebVar;
        try {
            ztsVar.a(this, i, zysVar);
        } finally {
            this.e = null;
        }
    }

    @Override // defpackage.ztt
    public final void t(float f, int i) throws Throwable {
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        if (addm.l()) {
            this.f.d(new aadk(this, f, i, 1));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        CameraPosition cameraPositionC = c();
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionC);
        builder.zoom(cameraPositionC.zoom + f);
        B("CAMERA_UPDATE_ZOOM_BY", builder.build(), x(i), false, 3);
    }

    @Override // defpackage.ztt
    public final void u(float f, int i, int i2, int i3) throws Throwable {
        ysi.T(i3 == -1 || i3 >= 0, a.bp(i3, "Invalid duration: "));
        if (addm.l()) {
            this.f.d(new aadl(this, f, i, i2, i3));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        aaet aaetVar = this.g;
        aadu aaduVarN = aaetVar.n();
        B("CAMERA_UPDATE_ZOOM_BY_FIXING", aaetVar.f(c(), f, new aadu(i - aaduVarN.a, i2 - aaduVarN.b), this.c), x(i3), false, 3);
    }

    @Override // defpackage.ztt
    public final void v(float f, int i) throws Throwable {
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        if (addm.l()) {
            this.f.d(new aadk(this, f, i, 0));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        CameraPosition.Builder builder = CameraPosition.builder(c());
        builder.zoom(f);
        B("CAMERA_UPDATE_ZOOM_TO", builder.build(), x(i), false, 3);
    }

    @Override // defpackage.ztt
    public final void w(float f) throws Throwable {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (addm.l()) {
            this.f.d(new aadj(this, f));
            return;
        }
        ysi.V(!this.d, "Camera moved during a cancellation");
        zkt.g(this.e == null, "zoomByCumulative() is not a CameraUpdate.");
        CameraPosition cameraPositionC = c();
        float fB = this.g.b();
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionC);
        builder.zoom(fB + f);
        B(f > BitmapDescriptorFactory.HUE_RED ? "ZOOM_IN_BUTTON_CLICK" : "ZOOM_OUT_BUTTON_CLICK", builder.build(), x(-1), true, 2);
    }

    public final CameraPosition y(LatLngBounds latLngBounds, int i, int i2, int i3) {
        int i4 = i3 + i3;
        int i5 = i - i4;
        int i6 = i2 - i4;
        boolean z = true;
        if (i5 <= 0 && i6 <= 0) {
            z = false;
        }
        zkt.g(z, "View size is too small after padding is applied.");
        if (!addm.l()) {
            return new CameraPosition(aads.b(latLngBounds).a(), (float) aads.c(latLngBounds, i5, i6, this.g.a), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        aadc aadcVar = new aadc(latLngBounds, i5, i6);
        this.f.d(aadcVar);
        return aadcVar.a;
    }

    public final void z(CameraPosition cameraPosition, int i, int i2) throws Throwable {
        zkt.n(cameraPosition, "CameraPosition must not be null.");
        ysi.T(i == -1 || i >= 0, a.bp(i, "Invalid duration: "));
        ysi.U(cameraPosition.zoom, "In cameraPosition.zoom arg to newCameraPosition(cameraPosition)");
        if (addm.l()) {
            this.f.d(new aadf(this, cameraPosition, i, i2));
        } else {
            ysi.V(!this.d, "Camera moved during a cancellation");
            B("CAMERA_UPDATE_NEW_CAMERA_POSITION", cameraPosition, i, false, i2);
        }
    }
}

package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CircleOptions;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.ICircleDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zuk extends ICircleDelegate.Stub implements zxc, zxi {
    private static final CircleOptions b = new CircleOptions();
    private static final sqj c = new sqi(null);
    private static final AtomicInteger d = new AtomicInteger(0);
    public zxe a;
    private final String e;
    private final zxd f;
    private final zys g;
    private LatLng h;
    private double i;
    private boolean j;
    private final LatLng[] k;
    private boolean l;
    private int m;
    private int n;
    private float o;
    private PatternItem[] p;
    private float q;
    private boolean r;
    private boolean s;
    private boolean t;
    private sqj u;
    private final zrt v;

    public zuk(CircleOptions circleOptions, zxd zxdVar, zys zysVar, zrt zrtVar) {
        zkt.m(zxdVar);
        this.f = zxdVar;
        zkt.m(zysVar);
        this.g = zysVar;
        zkt.m(zrtVar);
        this.v = zrtVar;
        this.u = c;
        this.e = String.format(Locale.getDefault(), "ci%d", Integer.valueOf(d.getAndIncrement()));
        zkt.e(circleOptions.getStrokeWidth() >= BitmapDescriptorFactory.HUE_RED, "stroke width is negative");
        zkt.m(circleOptions.getCenter());
        zkt.e(circleOptions.getRadius() >= 0.0d, "radius is negative");
        this.h = circleOptions.getCenter();
        this.i = circleOptions.getRadius();
        this.o = circleOptions.getStrokeWidth();
        this.m = circleOptions.getStrokeColor();
        this.p = PatternItem.validatePatternItems(circleOptions.getStrokePattern(), "Circle");
        this.n = circleOptions.getFillColor();
        this.q = circleOptions.getZIndex();
        this.r = circleOptions.isVisible();
        this.s = circleOptions.isClickable();
        int fillColor = circleOptions.getFillColor();
        CircleOptions circleOptions2 = b;
        if (fillColor != circleOptions2.getFillColor()) {
            zysVar.b(aahu.CIRCLE_FILL_COLOR);
        }
        if (circleOptions.getStrokeColor() != circleOptions2.getStrokeColor()) {
            zysVar.b(aahu.CIRCLE_STROKE_COLOR);
        }
        if (circleOptions.getStrokeWidth() != circleOptions2.getStrokeWidth()) {
            zysVar.b(aahu.CIRCLE_WIDTH);
        }
        if (!a.C(circleOptions.getStrokePattern(), circleOptions2.getStrokePattern())) {
            zysVar.b(aahu.CIRCLE_STROKE_PATTERN);
        }
        if (circleOptions.isVisible() != circleOptions2.isVisible()) {
            zysVar.b(aahu.CIRCLE_VISIBILITY);
        }
        if (circleOptions.getZIndex() != circleOptions2.getZIndex()) {
            zysVar.b(aahu.CIRCLE_Z_INDEX);
        }
        if (circleOptions.isClickable() != circleOptions2.isClickable()) {
            zysVar.b(aahu.CIRCLE_CLICKABILITY);
        }
        this.k = new LatLng[100];
        this.l = false;
    }

    private final void o(int i) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            zxe zxeVar = this.a;
            if (zxeVar != null) {
                zxeVar.c(i);
            }
        }
    }

    @Override // defpackage.zxi
    public final synchronized float a() {
        return this.o;
    }

    @Override // defpackage.zxi
    public final synchronized float b() {
        return this.q;
    }

    @Override // defpackage.zxi
    public final synchronized int c() {
        return this.n;
    }

    @Override // defpackage.zxi
    public final synchronized int d() {
        return this.m;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final boolean equalsRemote(ICircleDelegate iCircleDelegate) {
        return equals(iCircleDelegate);
    }

    @Override // defpackage.zxi
    public final int f() {
        return 0;
    }

    @Override // defpackage.zxi
    public final synchronized void g(List list) {
        zkt.n(list, "Null outputHoles");
        list.clear();
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized LatLng getCenter() {
        this.v.a();
        return this.h;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized int getFillColor() {
        this.v.a();
        return c();
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final String getId() {
        return this.e;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized double getRadius() {
        this.v.a();
        return this.i;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized int getStrokeColor() {
        this.v.a();
        return d();
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final List<PatternItem> getStrokePattern() {
        this.v.a();
        PatternItem[] patternItemArrN = n();
        if (patternItemArrN == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(patternItemArrN));
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized float getStrokeWidth() {
        this.v.a();
        return a();
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final sqj getTag() {
        this.v.a();
        return this.u;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized float getZIndex() {
        this.v.a();
        return b();
    }

    @Override // defpackage.zxi
    public final synchronized void h(List list) {
        double dSin;
        zkt.n(list, "Null outputOutline");
        if (!this.l) {
            LatLng latLng = this.h;
            double d2 = this.i;
            LatLng[] latLngArr = this.k;
            zkt.n(latLng, "Null center");
            boolean z = true;
            double d3 = 0.0d;
            aclh.o(d2 >= 0.0d, "Negative radius: %s", new Object[]{Double.valueOf(d2)});
            zkt.n(latLngArr, "Null outputPoints");
            int length = latLngArr.length;
            if (Double.compare(d2, 0.0d) != 0) {
                double radians = Math.toRadians(latLng.latitude);
                double radians2 = Math.toRadians(latLng.longitude);
                double d4 = d2 / 6371009.0d;
                double dCos = Math.cos(d4);
                double dSin2 = Math.sin(d4);
                double dCos2 = Math.cos(radians);
                double dSin3 = Math.sin(radians);
                int i = 0;
                while (true) {
                    int length2 = latLngArr.length;
                    if (i >= 100) {
                        break;
                    }
                    double d5 = d3;
                    double d6 = i;
                    double d7 = 99.0d;
                    if (addm.a.gu().d()) {
                        double d8 = (d6 / 99.0d) * 3.141592653589793d * 4.0d;
                        dSin = d8 + Math.sin(d8 + 3.141592653589793d);
                        d7 = 2.0d;
                    } else {
                        dSin = d6 * 6.283185307179586d;
                    }
                    double d9 = dSin / d7;
                    double dCos3 = (dSin3 * dCos) + (dCos2 * dSin2 * Math.cos(d9));
                    latLngArr[i] = new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(Math.atan2(Math.sin(d9) * dSin2 * dCos2, dCos - (dSin3 * dCos3)) + radians2));
                    i++;
                    d3 = d5;
                    z = z;
                }
            } else {
                Arrays.fill(latLngArr, latLng);
            }
            boolean z2 = z;
            double d10 = d3;
            LatLng latLng2 = this.h;
            double dH = ysi.H(latLng2, this.i);
            double d11 = latLng2.longitude;
            this.j = !((d11 < d10 ? d11 + dH > d10 || d11 - dH < -180.0d : d11 - dH < d10 || d11 + dH > 180.0d) ? z2 : false);
            this.l = z2;
        }
        list.clear();
        Collections.addAll(list, this.k);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // defpackage.zxi
    public final void i() {
        this.v.a();
        zxd zxdVar = this.f;
        vfo vfoVar = zxdVar.c;
        if (vfoVar == null) {
            zxdVar.f.b(aahu.CIRCLE_CLICK_WITHOUT_LISTENER);
            return;
        }
        try {
            vfoVar.e(this);
            zxdVar.f.b(aahu.CIRCLE_CLICK_WITH_LISTENER);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final boolean isClickable() {
        this.v.a();
        return k();
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final synchronized boolean isVisible() {
        this.v.a();
        return m();
    }

    @Override // defpackage.zxc
    public final void j() {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.u = c;
            this.t = true;
            zxe zxeVar = this.a;
            if (zxeVar != null) {
                zxeVar.d();
            }
        }
    }

    @Override // defpackage.zxi
    public final synchronized boolean k() {
        return this.s;
    }

    @Override // defpackage.zxi
    public final boolean l() {
        return this.j;
    }

    @Override // defpackage.zxi
    public final synchronized boolean m() {
        return this.r;
    }

    @Override // defpackage.zxi
    public final synchronized PatternItem[] n() {
        return this.p;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void remove() {
        this.v.a();
        this.g.b(aahu.CIRCLE_REMOVE);
        j();
        this.f.b(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setCenter(LatLng latLng) {
        boolean z;
        this.v.a();
        this.g.b(aahu.CIRCLE_SET_CENTER);
        synchronized (this) {
            if (this.h.equals(latLng)) {
                z = false;
            } else {
                this.h = latLng;
                this.l = false;
                z = true;
            }
        }
        if (z) {
            o(0);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setClickable(boolean z) {
        this.v.a();
        this.g.b(aahu.CIRCLE_CLICKABILITY);
        synchronized (this) {
            this.s = z;
        }
        o(12);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setFillColor(int i) {
        this.v.a();
        this.g.b(aahu.CIRCLE_FILL_COLOR);
        synchronized (this) {
            this.n = i;
        }
        o(5);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setRadius(double d2) {
        boolean z;
        this.v.a();
        this.g.b(aahu.CIRCLE_SET_RADIUS);
        synchronized (this) {
            if (Double.doubleToLongBits(this.i) != Double.doubleToLongBits(d2)) {
                this.i = d2;
                this.l = false;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            o(0);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setStrokeColor(int i) {
        this.v.a();
        this.g.b(aahu.CIRCLE_STROKE_COLOR);
        synchronized (this) {
            this.m = i;
        }
        o(4);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setStrokePattern(List<PatternItem> list) {
        this.v.a();
        this.g.b(aahu.CIRCLE_STROKE_PATTERN);
        synchronized (this) {
            this.p = PatternItem.validatePatternItems(list, "Circle");
        }
        o(11);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setStrokeWidth(float f) {
        this.v.a();
        this.g.b(aahu.CIRCLE_WIDTH);
        zkt.e(f >= BitmapDescriptorFactory.HUE_RED, "stroke width is negative");
        synchronized (this) {
            this.o = f;
        }
        o(3);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setTag(sqj sqjVar) {
        this.v.a();
        this.g.b(aahu.CIRCLE_SET_TAG);
        this.u = sqjVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setVisible(boolean z) {
        this.v.a();
        this.g.b(aahu.CIRCLE_VISIBILITY);
        synchronized (this) {
            this.r = z;
        }
        o(6);
    }

    @Override // com.google.android.libraries.maps.model.internal.ICircleDelegate
    public final void setZIndex(float f) {
        this.v.a();
        this.g.b(aahu.CIRCLE_Z_INDEX);
        synchronized (this) {
            this.q = f;
        }
        o(7);
    }
}

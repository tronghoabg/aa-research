package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.JointType;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.PolygonOptions;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.internal.IPolygonDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zxj extends IPolygonDelegate.Stub implements zxc, zxi {
    private static final PolygonOptions c = new PolygonOptions();
    private static final sqj d = new sqi(null);
    private static final AtomicInteger e = new AtomicInteger(0);
    public zxe a;
    public final Set b = new HashSet();
    private final String f;
    private final zxd g;
    private final zys h;
    private final zrt i;
    private final List j;
    private final List k;
    private boolean l;
    private final List m;
    private final List n;
    private boolean o;
    private int p;
    private int q;
    private PatternItem[] r;
    private int s;
    private float t;
    private float u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private sqj z;

    public zxj(PolygonOptions polygonOptions, zxd zxdVar, zys zysVar, zrt zrtVar) {
        zkt.n(polygonOptions, "PolygonOptions cannot be null.");
        zkt.n(zxdVar, "OverlayManager cannot be null.");
        this.g = zxdVar;
        zkt.n(zysVar, "UsageLog cannot be null.");
        this.h = zysVar;
        zkt.n(zrtVar, "ThreadChecker cannot be null.");
        this.i = zrtVar;
        this.f = String.format(Locale.getDefault(), "pg%d", Integer.valueOf(e.getAndIncrement()));
        this.z = d;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = new ArrayList();
        this.l = false;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = false;
        zkt.e(polygonOptions.getStrokeWidth() >= BitmapDescriptorFactory.HUE_RED, "stroke width is negative");
        this.t = polygonOptions.getStrokeWidth();
        this.p = polygonOptions.getStrokeColor();
        int strokeJointType = polygonOptions.getStrokeJointType();
        this.q = strokeJointType;
        if (!JointType.isRecognizedJointType(strokeJointType)) {
            zrn.b(String.format(JointType.UNRECOGNIZED_JOINT_TYPE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(strokeJointType), "Polygon"));
        }
        this.r = PatternItem.validatePatternItems(polygonOptions.getStrokePattern(), "Polygon");
        this.s = polygonOptions.getFillColor();
        this.u = polygonOptions.getZIndex();
        this.w = polygonOptions.isVisible();
        this.v = polygonOptions.isGeodesic();
        this.x = polygonOptions.isClickable();
        arrayList.addAll(polygonOptions.getPoints());
        o(arrayList);
        Iterator<List<LatLng>> it = polygonOptions.getHoles().iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList(it.next());
            o(arrayList2);
            this.m.add(arrayList2);
        }
        int strokeColor = polygonOptions.getStrokeColor();
        PolygonOptions polygonOptions2 = c;
        if (strokeColor != polygonOptions2.getStrokeColor()) {
            this.h.b(aahu.POLYGON_STROKE_COLOR);
        }
        if (polygonOptions.getStrokeWidth() != polygonOptions2.getStrokeWidth()) {
            this.h.b(aahu.POLYGON_WIDTH);
        }
        if (polygonOptions.getFillColor() != polygonOptions2.getFillColor()) {
            this.h.b(aahu.POLYGON_FILL_COLOR);
        }
        if (polygonOptions.getStrokeJointType() != polygonOptions2.getStrokeJointType()) {
            this.h.b(aahu.POLYGON_STROKE_JOINT_TYPE);
        }
        if (!a.C(polygonOptions.getStrokePattern(), polygonOptions2.getStrokePattern())) {
            this.h.b(aahu.POLYGON_STROKE_PATTERN);
        }
        if (polygonOptions.isGeodesic() != polygonOptions2.isGeodesic()) {
            this.h.b(aahu.POLYGON_GEODESIC);
        }
        if (polygonOptions.isVisible() != polygonOptions2.isVisible()) {
            this.h.b(aahu.POLYGON_VISIBILITY);
        }
        if (polygonOptions.getZIndex() != polygonOptions2.getZIndex()) {
            this.h.b(aahu.POLYGON_Z_INDEX);
        }
        if (!a.C(polygonOptions.getHoles(), polygonOptions2.getHoles())) {
            this.h.b(aahu.POLYGON_HOLES);
        }
        if (polygonOptions.isClickable() != polygonOptions2.isClickable()) {
            this.h.b(aahu.POLYGON_CLICKABILITY);
        }
    }

    private static void o(List list) {
        zkt.n(list, "Null points");
        ysi.T(!list.isEmpty(), "List<LatLng> cannot be empty.");
        if (((LatLng) list.get(0)).equals(list.get(list.size() - 1))) {
            return;
        }
        list.add((LatLng) list.get(0));
    }

    private static void p(List list, int i) {
        zkt.n(list, "Null holes");
        zkt.e(i >= 0, "Negative newNumHoles");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= list.size()) {
                list.add(new ArrayList());
            } else if (list.get(i2) == null) {
                list.set(i2, new ArrayList());
            }
        }
        list.subList(i, list.size()).clear();
    }

    private final void q(int i) {
        synchronized (this) {
            if (this.y) {
                return;
            }
            this.i.a();
            zxe zxeVar = this.a;
            if (zxeVar != null) {
                zxeVar.c(i);
            } else {
                this.b.add(Integer.valueOf(i));
            }
        }
    }

    @Override // defpackage.zxi
    public final synchronized float a() {
        return this.t;
    }

    @Override // defpackage.zxi
    public final synchronized float b() {
        return this.u;
    }

    @Override // defpackage.zxi
    public final synchronized int c() {
        return this.s;
    }

    @Override // defpackage.zxi
    public final synchronized int d() {
        return this.p;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final boolean equalsRemote(IPolygonDelegate iPolygonDelegate) {
        return equals(iPolygonDelegate);
    }

    @Override // defpackage.zxi
    public final synchronized int f() {
        return this.q;
    }

    @Override // defpackage.zxi
    public final synchronized void g(List list) {
        zkt.n(list, "Null outputHoles");
        if (this.v && !this.o) {
            List list2 = this.n;
            List list3 = this.m;
            p(list2, list3.size());
            for (int i = 0; i < list3.size(); i++) {
                ysi.N((List) list3.get(i), (List) list2.get(i), new ArrayList());
            }
            this.o = true;
        }
        List list4 = this.v ? this.n : this.m;
        p(list, list4.size());
        for (int i2 = 0; i2 < list4.size(); i2++) {
            List list5 = (List) list.get(i2);
            list5.clear();
            list5.addAll((Collection) list4.get(i2));
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized int getFillColor() {
        this.i.a();
        return c();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized List getHoles() {
        ArrayList arrayList;
        this.i.a();
        List list = this.m;
        arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ArrayList((List) it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final String getId() {
        return this.f;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized List<LatLng> getPoints() {
        this.i.a();
        return new ArrayList(this.j);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized int getStrokeColor() {
        this.i.a();
        return d();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final int getStrokeJointType() {
        this.i.a();
        return f();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final List<PatternItem> getStrokePattern() {
        this.i.a();
        PatternItem[] patternItemArrN = n();
        if (patternItemArrN == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(patternItemArrN));
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized float getStrokeWidth() {
        this.i.a();
        return a();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final sqj getTag() {
        this.i.a();
        return this.z;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized float getZIndex() {
        this.i.a();
        return b();
    }

    @Override // defpackage.zxi
    public final synchronized void h(List list) {
        zkt.n(list, "Null outputOutline");
        if (this.v && !this.l) {
            ysi.N(this.j, this.k, new ArrayList());
            this.l = true;
        }
        list.clear();
        list.addAll(this.v ? this.k : this.j);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    @Override // defpackage.zxi
    public final void i() {
        this.i.a();
        zxd zxdVar = this.g;
        vhq vhqVar = zxdVar.d;
        if (vhqVar == null) {
            zxdVar.f.b(aahu.POLYGON_CLICK_WITHOUT_LISTENER);
            return;
        }
        try {
            vhqVar.e(this);
            zxdVar.f.b(aahu.POLYGON_CLICK_WITH_LISTENER);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized boolean isClickable() {
        this.i.a();
        return k();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized boolean isGeodesic() {
        this.i.a();
        return this.v;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final synchronized boolean isVisible() {
        this.i.a();
        return m();
    }

    @Override // defpackage.zxc
    public final void j() {
        synchronized (this) {
            if (this.y) {
                return;
            }
            this.z = d;
            this.y = true;
            zxe zxeVar = this.a;
            if (zxeVar != null) {
                zxeVar.d();
            }
        }
    }

    @Override // defpackage.zxi
    public final synchronized boolean k() {
        return this.x;
    }

    @Override // defpackage.zxi
    public final boolean l() {
        return false;
    }

    @Override // defpackage.zxi
    public final synchronized boolean m() {
        return this.w;
    }

    @Override // defpackage.zxi
    public final synchronized PatternItem[] n() {
        return this.r;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void remove() {
        this.i.a();
        this.h.b(aahu.POLYGON_REMOVE);
        j();
        this.g.b(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setClickable(boolean z) {
        this.i.a();
        this.h.b(aahu.POLYGON_CLICKABILITY);
        synchronized (this) {
            this.x = z;
        }
        q(12);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setFillColor(int i) {
        this.i.a();
        this.h.b(aahu.POLYGON_FILL_COLOR);
        synchronized (this) {
            this.s = i;
        }
        q(5);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setGeodesic(boolean z) {
        boolean z2;
        this.i.a();
        this.h.b(aahu.POLYGON_GEODESIC);
        synchronized (this) {
            if (this.v != z) {
                this.v = z;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            q(1);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setHoles(List list) {
        this.i.a();
        this.h.b(aahu.POLYGON_HOLES);
        synchronized (this) {
            List list2 = this.m;
            p(list2, list.size());
            for (int i = 0; i < list.size(); i++) {
                List list3 = (List) list2.get(i);
                list3.clear();
                list3.addAll((List) list.get(i));
                o(list3);
            }
            this.o = false;
        }
        q(2);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setPoints(List<LatLng> list) {
        this.i.a();
        this.h.b(aahu.POLYGON_SET_POINTS);
        synchronized (this) {
            Iterator<LatLng> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    double d2 = it.next().latitude;
                    if ((d2 <= 0.0d && d2 > -90.0d) || (d2 > 0.0d && d2 < 90.0d)) {
                        break;
                    }
                } else if (!this.j.isEmpty()) {
                    return;
                }
            }
            List list2 = this.j;
            list2.clear();
            list2.addAll(list);
            o(list2);
            this.l = false;
            q(0);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setStrokeColor(int i) {
        this.i.a();
        this.h.b(aahu.POLYGON_STROKE_COLOR);
        synchronized (this) {
            this.p = i;
        }
        q(4);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setStrokeJointType(int i) {
        this.i.a();
        this.h.b(aahu.POLYGON_STROKE_JOINT_TYPE);
        synchronized (this) {
            this.q = i;
        }
        if (!JointType.isRecognizedJointType(i)) {
            zrn.b(String.format(JointType.UNRECOGNIZED_JOINT_TYPE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(i), "Polygon"));
        }
        q(10);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setStrokePattern(List<PatternItem> list) {
        this.i.a();
        this.h.b(aahu.POLYGON_STROKE_PATTERN);
        synchronized (this) {
            this.r = PatternItem.validatePatternItems(list, "Polygon");
        }
        q(11);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setStrokeWidth(float f) {
        this.i.a();
        this.h.b(aahu.POLYGON_WIDTH);
        zkt.e(f >= BitmapDescriptorFactory.HUE_RED, "stroke width is negative");
        synchronized (this) {
            this.t = f;
        }
        q(3);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setTag(sqj sqjVar) {
        this.i.a();
        this.h.b(aahu.POLYGON_SET_TAG);
        this.z = sqjVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setVisible(boolean z) {
        this.i.a();
        this.h.b(aahu.POLYGON_VISIBILITY);
        synchronized (this) {
            this.w = z;
        }
        q(6);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolygonDelegate
    public final void setZIndex(float f) {
        this.i.a();
        this.h.b(aahu.POLYGON_Z_INDEX);
        synchronized (this) {
            this.u = f;
        }
        q(7);
    }
}

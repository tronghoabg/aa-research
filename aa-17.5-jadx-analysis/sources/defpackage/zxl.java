package defpackage;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.Cap;
import com.google.android.libraries.maps.model.JointType;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.PolylineOptions;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.StrokeStyle;
import com.google.android.libraries.maps.model.StyleSpan;
import com.google.android.libraries.maps.model.internal.IPolylineDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zxl extends IPolylineDelegate.Stub implements zxc {
    private static final PolylineOptions b = new PolylineOptions();
    private static final sqj c = new sqi(null);
    private static final AtomicInteger d = new AtomicInteger(0);
    private zyh A;
    private final aacq B;
    public zxk a;
    private final String e;
    private final zxd f;
    private final zys g;
    private final zrt h;
    private final List i;
    private final List j;
    private final List k;
    private final List l;
    private boolean m;
    private int n;
    private PatternItem[] o;
    private boolean p;
    private float q;
    private boolean r;
    private boolean s;
    private sqj t;
    private final List u;
    private final List v;
    private final List w;
    private final List x;
    private final aacq y;
    private zyh z;

    public zxl(PolylineOptions polylineOptions, zxd zxdVar, aacq aacqVar, zys zysVar, zrt zrtVar) throws Throwable {
        zkt.n(polylineOptions, "PolylineOptions cannot be null.");
        zkt.n(zxdVar, "overlayManager cannot be null.");
        this.f = zxdVar;
        zkt.n(aacqVar, "bitmapManager cannot be null.");
        this.B = aacqVar;
        zkt.n(zysVar, "UsageLog cannot be null.");
        this.g = zysVar;
        zkt.n(zrtVar, "ThreadChecker cannot be null.");
        this.h = zrtVar;
        boolean z = false;
        this.e = String.format(Locale.ENGLISH, "pl%d", Integer.valueOf(d.getAndIncrement()));
        this.t = c;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = false;
        zkt.e(polylineOptions.getWidth() >= BitmapDescriptorFactory.HUE_RED, "line width is negative");
        zyh zyhVarE = zyh.e(polylineOptions.getStartCap(), aacqVar);
        this.z = zyhVarE;
        if (!Cap.isRecognizedCapType(zyhVarE.b())) {
            zrn.b(String.format(Cap.UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE, "start", "Polyline"));
        }
        zyh zyhVarE2 = zyh.e(polylineOptions.getEndCap(), aacqVar);
        this.A = zyhVarE2;
        if (!Cap.isRecognizedCapType(zyhVarE2.b())) {
            zrn.b(String.format(Cap.UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE, "end", "Polyline"));
        }
        int jointType = polylineOptions.getJointType();
        this.n = jointType;
        if (!JointType.isRecognizedJointType(jointType)) {
            zrn.b(String.format(JointType.UNRECOGNIZED_JOINT_TYPE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(jointType), "Polyline"));
        }
        this.o = PatternItem.validatePatternItems(polylineOptions.getPattern(), "Polyline");
        this.q = polylineOptions.getZIndex();
        this.r = polylineOptions.isGeodesic();
        this.s = polylineOptions.isClickable();
        StrokeStyle.Builder builderColorBuilder = StrokeStyle.colorBuilder(polylineOptions.getColor());
        builderColorBuilder.visible(polylineOptions.isVisible());
        builderColorBuilder.width(polylineOptions.getWidth());
        this.y = new aacq(builderColorBuilder.build(), aacqVar);
        arrayList.addAll(polylineOptions.getPoints());
        this.u = new ArrayList();
        this.w = new ArrayList();
        this.v = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.x = arrayList2;
        arrayList2.addAll(polylineOptions.getSpans());
        o();
        int color = polylineOptions.getColor();
        PolylineOptions polylineOptions2 = b;
        if (color != polylineOptions2.getColor()) {
            zysVar.b(aahu.POLYLINE_COLOR);
        }
        if (polylineOptions.getWidth() != polylineOptions2.getWidth()) {
            zysVar.b(aahu.POLYLINE_WIDTH);
        }
        if (!a.C(polylineOptions.getStartCap(), polylineOptions2.getStartCap())) {
            zysVar.b(aahu.POLYLINE_START_CAP);
        }
        if (!a.C(polylineOptions.getEndCap(), polylineOptions2.getEndCap())) {
            zysVar.b(aahu.POLYLINE_END_CAP);
        }
        if (polylineOptions.getJointType() != polylineOptions2.getJointType()) {
            zysVar.b(aahu.POLYLINE_JOINT_TYPE);
        }
        if (!a.C(polylineOptions.getPattern(), polylineOptions2.getPattern())) {
            zysVar.b(aahu.POLYLINE_PATTERN);
        }
        if (polylineOptions.isGeodesic() != polylineOptions2.isGeodesic()) {
            zysVar.b(aahu.POLYLINE_GEODESIC);
        }
        if (polylineOptions.isVisible() != polylineOptions2.isVisible()) {
            zysVar.b(aahu.POLYLINE_VISIBILITY);
        }
        if (polylineOptions.getZIndex() != polylineOptions2.getZIndex()) {
            zysVar.b(aahu.POLYLINE_Z_INDEX);
        }
        if (polylineOptions.isClickable() != polylineOptions2.isClickable()) {
            zysVar.b(aahu.POLYLINE_CLICKABILITY);
        }
        if (polylineOptions.getSpans().isEmpty()) {
            return;
        }
        zysVar.b(aahu.POLYLINE_SPANS);
        boolean z2 = false;
        boolean z3 = false;
        for (StyleSpan styleSpan : polylineOptions.getSpans()) {
            Pair<Integer, Integer> gradientColors = styleSpan.getStyle().getGradientColors();
            if (!z && !((Integer) gradientColors.first).equals(gradientColors.second)) {
                this.g.b(aahu.POLYLINE_SPANS_GRADIENT);
                z = true;
            }
            if (!z2 && styleSpan.getSegments() != Math.floor(styleSpan.getSegments())) {
                this.g.b(aahu.POLYLINE_SPANS_FRACTIONAL);
                z2 = true;
            }
            if (!z3 && styleSpan.getStyle().getStamp() != null) {
                this.g.b(aahu.POLYLINE_SPANS_STAMP);
                z3 = true;
            }
        }
    }

    private final synchronized Pair m(double d2, double d3, int i) {
        double d4;
        int i2;
        d4 = d2 + d3;
        try {
            if (d4 < 0.9999999999d) {
                q(i, d4);
            } else {
                if (d4 < 1.0000000001d) {
                    i++;
                    p(i);
                } else {
                    if (d3 != 0.0d) {
                        i++;
                        d2 -= 1.0d - d3;
                        p(i);
                        d3 = 0.0d;
                    }
                    int i3 = 0;
                    while (true) {
                        i2 = (int) d2;
                        if (i3 >= i2 || i >= this.i.size() - 1) {
                            break;
                        }
                        i++;
                        p(i);
                        i3++;
                    }
                    if (i != this.i.size() - 1) {
                        double d5 = d2 - i2;
                        if (d5 > 1.0E-10d) {
                            q(i, d5);
                            d4 = d5;
                        }
                    } else {
                        d4 = d3;
                    }
                }
                d4 = 0.0d;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new Pair(Integer.valueOf(i), Double.valueOf(d4));
    }

    private static void n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((aacq) it.next()).b;
            if (obj != null) {
                zyh zyhVar = (zyh) obj;
                ((aacq) zyhVar.c).j((ztq) zyhVar.b);
            }
        }
    }

    private final synchronized void o() throws Throwable {
        zxl zxlVar;
        try {
            try {
                List list = this.u;
                list.clear();
                List list2 = this.w;
                list2.clear();
                List list3 = this.j;
                list3.clear();
                List list4 = this.k;
                list4.clear();
                List list5 = this.x;
                if (list5.isEmpty()) {
                    List list6 = this.i;
                    list3.addAll(list6);
                    list4.addAll(list6);
                    return;
                }
                int i = 0;
                p(0);
                int iIntValue = 0;
                double dDoubleValue = 0.0d;
                while (true) {
                    if (i >= list5.size()) {
                        break;
                    }
                    StyleSpan styleSpan = (StyleSpan) list5.get(i);
                    list2.add(new aacq(styleSpan.getStyle(), this.B));
                    if (i == list5.size() - 1) {
                        while (true) {
                            iIntValue++;
                            if (iIntValue >= this.i.size()) {
                                break;
                            } else {
                                this.p(iIntValue);
                            }
                        }
                    } else {
                        double segments = styleSpan.getSegments();
                        zxlVar = this;
                        Pair pairM = zxlVar.m(segments, dDoubleValue, iIntValue);
                        iIntValue = ((Integer) pairM.first).intValue();
                        dDoubleValue = ((Double) pairM.second).doubleValue();
                        if (iIntValue == zxlVar.i.size() - 1) {
                            break;
                        }
                        list.add(Integer.valueOf(list3.size() - 1));
                        i++;
                        this = zxlVar;
                    }
                }
                zxlVar = this;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final synchronized void p(int i) {
        List list = this.i;
        this.j.add((LatLng) list.get(i));
        this.k.add((LatLng) list.get(i));
    }

    private final synchronized void q(int i, double d2) {
        List list = this.i;
        LatLng latLng = (LatLng) list.get(i);
        LatLng latLng2 = (LatLng) list.get(i + 1);
        zzq zzqVarB = zzq.b(latLng.latitude, latLng.longitude);
        zzq zzqVarB2 = zzq.b(latLng2.latitude, latLng2.longitude);
        if (Math.abs(zzqVarB.a - zzqVarB2.a) > 536870912) {
            int i2 = zzqVarB.a;
            int i3 = zzqVarB2.a;
            if (i2 < i3) {
                zzqVarB.a = i2 + 1073741824;
            } else {
                zzqVarB2.a = i3 + 1073741824;
            }
        }
        List list2 = this.j;
        float f = (float) d2;
        zzq zzqVar = new zzq(0, 0);
        int i4 = zzqVarB2.a;
        zzqVar.a = ((int) ((i4 - r7) * f)) + zzqVarB.a;
        int i5 = zzqVarB2.b;
        zzqVar.b = ((int) (f * (i5 - r0))) + zzqVarB.b;
        list2.add(zzqVar.a());
        this.k.add(ysi.L(latLng, latLng2, d2));
    }

    private final void r(int i) {
        synchronized (this) {
            if (this.p) {
                return;
            }
            zxk zxkVar = this.a;
            if (zxkVar != null) {
                zxkVar.a(i);
            }
        }
    }

    public final synchronized float a() {
        return this.q;
    }

    public final synchronized int b() {
        return this.n;
    }

    public final synchronized List c() {
        List list = this.w;
        if (list.isEmpty()) {
            return Arrays.asList(this.y);
        }
        return new ArrayList(list);
    }

    public final synchronized void d(List list, List list2) {
        zkt.n(list, "Null outputPoints");
        zkt.n(list2, "Null outputLineBreaks");
        list.clear();
        list2.clear();
        if (this.r && !this.m) {
            ArrayList arrayList = new ArrayList();
            ysi.N(this.k, this.l, arrayList);
            List list3 = this.v;
            list3.clear();
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                list3.add((Integer) arrayList.get(((Integer) it.next()).intValue()));
            }
            this.m = true;
        }
        list.addAll(this.r ? this.l : this.j);
        list2.addAll(this.r ? this.v : this.u);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
        return equals(iPolylineDelegate);
    }

    public final void f() {
        this.h.a();
        zxd zxdVar = this.f;
        vht vhtVar = zxdVar.e;
        if (vhtVar == null) {
            zxdVar.f.b(aahu.POLYLINE_CLICK_WITHOUT_LISTENER);
            return;
        }
        try {
            vhtVar.e(this);
            zxdVar.f.b(aahu.POLYLINE_CLICK_WITH_LISTENER);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final synchronized boolean g() {
        return this.s;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized int getColor() {
        return i().b();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final Cap getEndCap() {
        this.h.a();
        return (Cap) k().a;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final String getId() {
        return this.e;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final int getJointType() {
        this.h.a();
        return b();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final List<PatternItem> getPattern() {
        this.h.a();
        PatternItem[] patternItemArrH = h();
        if (patternItemArrH == null) {
            return null;
        }
        return new ArrayList(Arrays.asList(patternItemArrH));
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized List<LatLng> getPoints() {
        this.h.a();
        return new ArrayList(this.i);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized List<StyleSpan> getSpans() {
        this.h.a();
        return new ArrayList(this.x);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final Cap getStartCap() {
        this.h.a();
        return (Cap) l().a;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final sqj getTag() {
        this.h.a();
        return this.t;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized float getWidth() {
        return i().a();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized float getZIndex() {
        this.h.a();
        return a();
    }

    public final synchronized PatternItem[] h() {
        return this.o;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final int hashCodeRemote() {
        return hashCode();
    }

    public final synchronized aacq i() {
        this.h.a();
        List list = this.w;
        if (list.size() == 1) {
            return (aacq) yrm.ao(list);
        }
        return this.y;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized boolean isClickable() {
        this.h.a();
        return g();
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final synchronized boolean isGeodesic() {
        this.h.a();
        return this.r;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final boolean isVisible() {
        return i().e();
    }

    @Override // defpackage.zxc
    public final void j() {
        synchronized (this) {
            if (this.p) {
                return;
            }
            this.t = c;
            this.p = true;
            this.z.d();
            this.A.d();
            n(this.w);
            zxk zxkVar = this.a;
            if (zxkVar != null) {
                zxkVar.c();
            }
        }
    }

    public final synchronized zyh k() {
        return this.A;
    }

    public final synchronized zyh l() {
        return this.z;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void remove() {
        this.h.a();
        this.g.b(aahu.POLYLINE_REMOVE);
        j();
        this.f.b(this);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setClickable(boolean z) {
        this.h.a();
        this.g.b(aahu.POLYLINE_CLICKABILITY);
        synchronized (this) {
            this.s = z;
        }
        r(12);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setColor(int i) {
        this.h.a();
        this.g.b(aahu.POLYLINE_COLOR);
        synchronized (this) {
            ((StrokeStyle.Builder) this.y.a).color(i);
        }
        r(4);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setEndCap(Cap cap) {
        this.h.a();
        this.g.b(aahu.POLYLINE_END_CAP);
        zkt.n(cap, "clientEndCap");
        synchronized (this) {
            this.A.d();
            this.A = zyh.e(cap, this.B);
        }
        if (!Cap.isRecognizedCapType(cap.getType())) {
            zrn.b(String.format(Cap.UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE, "end", "Polyline"));
        }
        r(9);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setGeodesic(boolean z) {
        boolean z2;
        this.h.a();
        this.g.b(aahu.POLYLINE_GEODESIC);
        synchronized (this) {
            if (this.r != z) {
                this.r = z;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            r(0);
        }
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setJointType(int i) {
        this.h.a();
        this.g.b(aahu.POLYLINE_JOINT_TYPE);
        synchronized (this) {
            this.n = i;
        }
        if (!JointType.isRecognizedJointType(i)) {
            zrn.b(String.format(JointType.UNRECOGNIZED_JOINT_TYPE_ERROR_MESSAGE_TEMPLATE, Integer.valueOf(i), "Polyline"));
        }
        r(10);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setPattern(List<PatternItem> list) {
        this.h.a();
        this.g.b(aahu.POLYLINE_PATTERN);
        synchronized (this) {
            this.o = PatternItem.validatePatternItems(list, "Polyline");
        }
        r(11);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setPoints(List<LatLng> list) {
        this.h.a();
        this.g.b(aahu.POLYLINE_SET_POINTS);
        synchronized (this) {
            List list2 = this.i;
            list2.clear();
            list2.addAll(list);
            o();
            this.m = false;
        }
        r(0);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setSpans(List<StyleSpan> list) {
        int i;
        this.h.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            List list2 = this.x;
            arrayList.addAll(list2);
            arrayList2.addAll(this.w);
            list2.clear();
            aacq aacqVarI = i();
            for (StyleSpan styleSpan : list) {
                StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
                builder.width(aacqVarI.a());
                builder.visible(aacqVarI.e());
                list2.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
            }
            o();
            this.m = false;
        }
        zys zysVar = this.g;
        zysVar.b(aahu.POLYLINE_SPANS_CHANGED);
        if (arrayList.size() != list.size()) {
            zysVar.b(aahu.POLYLINE_SPANS_COUNT_CHANGED);
        } else {
            boolean z = false;
            boolean z2 = false;
            for (i = 0; i < list.size(); i++) {
                StyleSpan styleSpan2 = (StyleSpan) arrayList.get(i);
                StyleSpan styleSpan3 = list.get(i);
                if (!z && !styleSpan2.getStyle().getGradientColors().equals(styleSpan3.getStyle().getGradientColors())) {
                    zysVar.b(aahu.POLYLINE_SPANS_COLOR_CHANGED);
                    z = true;
                }
                if (!z2 && Math.abs(styleSpan2.getSegments() - styleSpan3.getSegments()) > 1.0E-10d) {
                    zysVar.b(aahu.POLYLINE_SPANS_SEGMENTS_CHANGED);
                    z2 = true;
                }
            }
        }
        r(13);
        n(arrayList2);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setStartCap(Cap cap) {
        this.h.a();
        this.g.b(aahu.POLYLINE_START_CAP);
        zkt.n(cap, "clientStartCap");
        synchronized (this) {
            this.z.d();
            this.z = zyh.e(cap, this.B);
        }
        if (!Cap.isRecognizedCapType(cap.getType())) {
            zrn.b(String.format(Cap.UNRECOGNIZED_CAP_TYPE_ERROR_MESSAGE_TEMPLATE, "start", "Polyline"));
        }
        r(8);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setTag(sqj sqjVar) {
        this.h.a();
        this.g.b(aahu.POLYLINE_SET_TAG);
        this.t = sqjVar;
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setVisible(boolean z) {
        this.h.a();
        this.g.b(aahu.POLYLINE_VISIBILITY);
        synchronized (this) {
            this.y.c(z);
            int i = 0;
            while (true) {
                List list = this.w;
                if (i < list.size()) {
                    ((aacq) list.get(i)).c(z);
                    i++;
                }
            }
        }
        r(6);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setWidth(float f) {
        this.h.a();
        this.g.b(aahu.POLYLINE_WIDTH);
        int i = 0;
        zkt.e(f >= BitmapDescriptorFactory.HUE_RED, "line width is negative");
        synchronized (this) {
            this.y.d(f);
            while (true) {
                List list = this.w;
                if (i < list.size()) {
                    ((aacq) list.get(i)).d(f);
                    i++;
                }
            }
        }
        r(3);
    }

    @Override // com.google.android.libraries.maps.model.internal.IPolylineDelegate
    public final void setZIndex(float f) {
        this.h.a();
        this.g.b(aahu.POLYLINE_Z_INDEX);
        synchronized (this) {
            this.q = f;
        }
        r(7);
    }
}

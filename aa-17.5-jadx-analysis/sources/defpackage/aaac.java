package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapColorScheme;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.projection.gearhead.R;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aaac extends View implements zwl {
    public final aaaf a;
    public aaah b;
    public final zzz c;
    public aaao d;
    public zzb e;
    public vgs f;
    public zvg g;
    public final zyb h;
    public final gjt i;
    private final aaab j;
    private final aaaa k;
    private vgm l;
    private final zvc m;
    private final zwr n;
    private final aaaq o;
    private final boolean p;
    private vhu q;

    public aaac(gjt gjtVar, zuq zuqVar, View view, ztr ztrVar, zvc zvcVar, zwk zwkVar, TextView textView, zyx zyxVar, zyb zybVar, ztc ztcVar, boolean z) {
        super((Context) gjtVar.a);
        this.i = gjtVar;
        this.a = new aaaf(this, gjtVar);
        Handler handler = new Handler(Looper.getMainLooper());
        aaab aaabVar = new aaab(this, gjtVar.t());
        this.j = aaabVar;
        this.n = ztrVar.h;
        ac(0, 0);
        aaaa aaaaVar = new aaaa(this, gjtVar);
        this.k = aaaaVar;
        hqw hqwVarA = zuqVar.a();
        Calendar calendar = Calendar.getInstance();
        boolean z2 = zkt.b;
        String str = (String) zuqVar.c.gu();
        ExecutorService executorService = zrz.a;
        this.c = new zzz(aaaaVar, textView, hqwVarA, aaabVar, calendar, z2, zwkVar, zybVar, ztcVar, str, new fpe(handler, 11));
        this.m = zvcVar;
        this.o = new aaaq(this, view, ztrVar.f, new fpe(handler, 11));
        this.h = zybVar;
        this.l = null;
        this.f = null;
        this.p = z;
    }

    private final void ac(int i, int i2) {
        Display display;
        int i3 = 1;
        if (i > 0 && i2 > 0 && (display = getDisplay()) != null) {
            Point point = new Point();
            display.getRealSize(point);
            if (i > point.x || i2 > point.y) {
                i3 = 0;
            }
        }
        setLayerType(i3, null);
    }

    @Override // defpackage.zwl
    public final void A(boolean z) {
        aaaa.b(z);
    }

    @Override // defpackage.zwl
    public final void B(boolean z) {
        aaaa.b(z);
    }

    @Override // defpackage.zwl
    public final void C(LatLngBounds latLngBounds) {
        zrn.d("setLatLngBoundsForCameraTarget", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void D(@MapColorScheme int i) {
        zrn.d("setMapColorScheme", " is not supported in Lite Mode");
        if (!addm.i() && !this.p) {
            throw new UnsupportedOperationException("setMapColorScheme not supported in Lite mode.");
        }
    }

    @Override // defpackage.zwl
    public final void E(String str) {
        zzz zzzVar = this.c;
        zzzVar.g = str;
        zzzVar.b();
        zzzVar.d();
    }

    @Override // defpackage.zwl
    public final void F(int i) {
        zzz zzzVar = this.c;
        zzzVar.f = i;
        zzzVar.b();
        zzzVar.d();
    }

    @Override // defpackage.zwl
    public final void G(float f) {
        zrn.d("setMaxZoomPreference", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void H(float f) {
        zrn.d("setMinZoomPreference", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void I(String str, Set set) {
        zrn.d("setOnFeatureClickListener", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void J(vgm vgmVar) {
        this.l = vgmVar;
    }

    @Override // defpackage.zwl
    public final void K(vgs vgsVar) {
        this.f = vgsVar;
    }

    @Override // defpackage.zwl
    public final void L(vhn vhnVar) {
        zrn.d("setPoiClickListener", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void M() {
        zzz zzzVar = this.c;
        ztc ztcVar = zzzVar.h;
        if (ztcVar == null) {
            return;
        }
        if (zzzVar.e()) {
            zzzVar.c.a(ztcVar.a ? zzzVar.o : zzzVar.m, zzzVar.l);
        } else {
            zzzVar.b();
        }
    }

    @Override // defpackage.zwl
    public final void N() {
        zrn.d("updateDarkMode", " is not supported in Lite Mode");
        if (!addm.i() && !this.p) {
            throw new UnsupportedOperationException("updateDarkMode is not supported in Lite Mode");
        }
    }

    @Override // defpackage.zwl
    public final boolean O() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean P() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean R() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean S() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean T() {
        return false;
    }

    @Override // defpackage.zwl
    public final boolean U(boolean z) {
        if (!z) {
            return false;
        }
        zrn.d("Buildings", " are not supported in Lite Mode");
        return false;
    }

    @Override // defpackage.zwl
    public final boolean V(boolean z) {
        if (!z) {
            return false;
        }
        zrn.d("Indoor", " is not supported in Lite Mode");
        return false;
    }

    @Override // defpackage.zwl
    public final boolean W(boolean z) {
        if (!z) {
            return false;
        }
        zrn.d("Traffic", " is not supported in Lite Mode");
        return false;
    }

    @Override // defpackage.zwl
    public final boolean X(boolean z) {
        if (!z) {
            return false;
        }
        zrn.d("Transit", " is not supported in Lite Mode");
        return false;
    }

    @Override // defpackage.zwl
    public final void Y(vhu vhuVar) {
        this.q = vhuVar;
    }

    @Override // defpackage.zwl
    public final void Z(aacq aacqVar) {
        zrn.d("setDdsRestyler", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final sm aa() {
        return null;
    }

    public final boolean ab(MotionEvent motionEvent) {
        Point point;
        if (this.d == null) {
            return false;
        }
        vgm vgmVar = this.l;
        if (vgmVar != null) {
            if (motionEvent != null) {
                point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            } else {
                Rect rect = new Rect();
                getDrawingRect(rect);
                point = new Point(rect.centerX(), rect.centerY());
            }
            try {
                vgmVar.e(this.d.b(point));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            if (zkt.c) {
                return true;
            }
            this.m.a(this.d.e, this.b.a(), this.b.p());
        }
        return true;
    }

    @Override // defpackage.zwl
    public final yvv c() {
        return yvv.a;
    }

    @Override // defpackage.zwl
    public final ztc d() {
        return this.c.h;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.g.t(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // defpackage.zwl
    public final ztt e() {
        return this.j;
    }

    @Override // defpackage.zwl
    public final zuh f() {
        if (!this.p) {
            throw new UnsupportedOperationException("getCarStyling is not supported in Lite Mode");
        }
        zrn.d("getCarStyling", " is not supported in Lite Mode");
        return null;
    }

    @Override // defpackage.zwl
    public final zwy g() {
        return this.b;
    }

    @Override // android.view.View
    public final Resources getResources() {
        gjt gjtVar = this.i;
        return gjtVar == null ? super.getResources() : gjtVar.B();
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        printWriter.println(strConcat.concat("  "));
        printWriter.println(strConcat + "currently drawn map projection: " + String.valueOf(this.d));
    }

    @Override // defpackage.zwl
    public final zxb h() {
        return this.a;
    }

    @Override // defpackage.zwl
    public final zxf i() {
        return this.b;
    }

    @Override // android.view.View
    public final boolean isClickable() {
        ViewGroup viewGroup = getParent() == null ? null : (ViewGroup) getParent().getParent();
        if (viewGroup != null) {
            return viewGroup.isClickable();
        }
        return true;
    }

    @Override // defpackage.zwl
    public final zyc j() {
        return this.o;
    }

    @Override // defpackage.zwl
    public final String k() {
        throw new UnsupportedOperationException("getMapStyle is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final String l() {
        return "L";
    }

    @Override // defpackage.zwl
    public final void m() {
        zrn.d("activateCloudStyling", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void n() {
        zrn.d("deactivateCloudStyling", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void o(String str) {
        zrn.d("disableMap", " is not supported in Lite Mode");
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        this.c.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        aaaa aaaaVar = this.k;
        int width = getWidth();
        int height = getHeight();
        if (aaaaVar.a != null) {
            canvas2.drawBitmap(aaaaVar.a, (width - aaaaVar.a.getWidth()) / 2.0f, (height - aaaaVar.a.getHeight()) / 2.0f, new Paint());
        } else {
            Paint paint = new Paint();
            int iW = aaaaVar.c.w(R.dimen.maps_lite_mode_grid_spacing);
            int width2 = canvas2.getWidth();
            int height2 = canvas2.getHeight();
            paint.setARGB(50, 128, 128, 128);
            int i = iW / 2;
            int i2 = 0;
            int i3 = i;
            while (i3 < width2) {
                paint.setStrokeWidth((i2 + 7) % 8 == 0 ? 2.0f : 1.0f);
                float f = i3;
                canvas2.drawLine(f, BitmapDescriptorFactory.HUE_RED, f, height2, paint);
                i2++;
                i3 += iW;
                canvas2 = canvas;
            }
            int i4 = 0;
            while (i < height2) {
                paint.setStrokeWidth((i4 + 7) % 8 == 0 ? 2.0f : 1.0f);
                float f2 = i;
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f2, width2, f2, paint);
                i4++;
                i += iW;
            }
            canvas2 = canvas;
        }
        aaao aaaoVar = aaaaVar.b;
        this.d = aaaoVar;
        if (aaaoVar != null) {
            aaah aaahVar = this.b;
            List list = aaahVar.a;
            synchronized (list) {
                Collections.sort(list, aaahVar.j);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((aaap) it.next()).e(canvas2, aaaoVar);
                }
            }
            List<aaae> list2 = aaahVar.b;
            synchronized (list2) {
                Collections.sort(list2, aaahVar.k);
                for (aaae aaaeVar : list2) {
                    zwv zwvVar = aaaeVar.a;
                    Bitmap bitmapJ = zwvVar.j();
                    float fB = zwvVar.b() * bitmapJ.getWidth();
                    float fC = zwvVar.c() * bitmapJ.getHeight();
                    Point pointA = aaaoVar.a(zwvVar.l());
                    int i5 = (int) fB;
                    int i6 = (int) fC;
                    aaaeVar.c = new Point(pointA.x - i5, pointA.y - i6);
                    aaaeVar.d = new Point(pointA.x + (bitmapJ.getWidth() - i5), pointA.y + (bitmapJ.getHeight() - i6));
                    if (bitmapJ != null && zwvVar.isVisible()) {
                        Paint paint2 = aaaeVar.b;
                        paint2.setAlpha((int) (zwvVar.a() * 255.0f));
                        canvas2.drawBitmap(bitmapJ, aaaeVar.c.x, aaaeVar.c.y, paint2);
                    }
                }
            }
            List list3 = aaahVar.c;
            list3.clear();
            Rect rect = new Rect(0, 0, aaaoVar.f, aaaoVar.g);
            List<aaae> list4 = aaahVar.b;
            synchronized (list4) {
                for (aaae aaaeVar2 : list4) {
                    if (Rect.intersects(rect, aaaeVar2.a())) {
                        list3.add(aaaeVar2);
                    }
                }
            }
            aaaf aaafVar = this.a;
            aaao aaaoVar2 = this.d;
            Location location = aaafVar.c;
            if (!aaafVar.a || location == null) {
                aaafVar.g = null;
            } else {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                Point pointA2 = aaaoVar2.a(latLng);
                aaafVar.g = pointA2;
                if (location.hasAccuracy()) {
                    int i7 = pointA2.y - aaaoVar2.a(new LatLng(latLng.latitude + Math.toDegrees(location.getAccuracy() / 6371009.0d), latLng.longitude)).y;
                    Paint paint3 = aaafVar.b;
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeWidth(2.0f);
                    gjt gjtVar = aaafVar.i;
                    paint3.setColor(gjtVar.v(R.color.maps_accuracy_circle_line_color));
                    float f3 = i7;
                    canvas2.drawCircle(pointA2.x, pointA2.y, f3, paint3);
                    paint3.setStyle(Paint.Style.FILL);
                    paint3.setColor(gjtVar.v(R.color.maps_accuracy_circle_fill_color));
                    canvas2.drawCircle(pointA2.x, pointA2.y, f3, paint3);
                    paint3.reset();
                }
                Matrix matrix = new Matrix();
                if (location.hasBearing()) {
                    matrix.setRotate(location.getBearing());
                    if (aaafVar.e == null) {
                        aaafVar.e = aaafVar.i.C(R.drawable.maps_chevron);
                    }
                    bitmap = aaafVar.e;
                } else {
                    if (aaafVar.d == null) {
                        aaafVar.d = aaafVar.i.C(R.drawable.maps_blue_dot);
                    }
                    bitmap = aaafVar.d;
                }
                zkt.m(bitmap);
                matrix.preTranslate(-(bitmap.getWidth() / 2), -(bitmap.getHeight() / 2));
                float fJ = aaafVar.i.J();
                matrix.postScale(fJ / bitmap.getWidth(), fJ / bitmap.getHeight());
                aaafVar.h = fJ / 2.0f;
                matrix.postTranslate(pointA2.x, pointA2.y);
                canvas2.drawBitmap(bitmap, matrix, aaafVar.b);
            }
            aaah aaahVar2 = this.b;
            zwv zwvVar2 = aaahVar2.e;
            if (zwvVar2 != null) {
                Bitmap bitmapJ2 = zwvVar2.j();
                Rect rectK = zwvVar2.k();
                Bitmap bitmapA = zwvVar2.b.k.a(zwvVar2, canvas2.getWidth(), canvas2.getHeight());
                if (bitmapA != null) {
                    aaahVar2.h = bitmapA.getWidth();
                    aaahVar2.i = bitmapA.getHeight();
                    zrt zrtVar = zwvVar2.d;
                    zrtVar.a();
                    float fD = zwvVar2.d();
                    zrtVar.a();
                    float f4 = zwvVar2.f();
                    Paint paint4 = new Paint();
                    aaahVar2.f = (rectK.left + (fD * bitmapJ2.getWidth())) - (aaahVar2.h / 2.0f);
                    float height3 = (rectK.top + (f4 * bitmapJ2.getHeight())) - aaahVar2.i;
                    aaahVar2.g = height3;
                    canvas2.drawBitmap(bitmapA, aaahVar2.f, height3, paint4);
                }
            }
        }
        zvg zvgVar = this.g;
        zvgVar.m(-1, 1);
        if (zvgVar.e != null) {
            for (int i8 = 0; i8 < zvgVar.e.size(); i8++) {
                zvgVar.m(i8, 0);
            }
        }
        boolean zP = this.b.p();
        zwv zwvVarA = this.b.a();
        if (zwvVarA != null) {
            this.n.f(true, zwvVarA, false);
        } else {
            zwr zwrVar = this.n;
            if (zP) {
                zwrVar.c();
            } else {
                zwrVar.f(false, null, false);
            }
        }
        vhu vhuVar = this.q;
        if (vhuVar != null) {
            try {
                vhuVar.a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        ac(i, i2);
        super.onSizeChanged(i, i2, i3, i4);
        this.c.b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return false;
        }
        this.e.e(motionEvent);
        return true;
    }

    @Override // defpackage.zwl
    public final void p(Boolean bool) {
        zrn.d("enableMapsApiDds1pOverlay", " is not supported in Lite Mode");
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return ab(null);
    }

    @Override // defpackage.zwl
    public final void w() {
        zrn.d("resetMinMaxZoomPreference", " is not supported in Lite Mode");
    }

    @Override // defpackage.zwl
    public final void x(boolean z) {
        aaaa.b(z);
    }

    @Override // defpackage.zwl
    public final void y(boolean z) {
        aaaa.b(z);
    }

    @Override // defpackage.zwl
    public final void z(boolean z) {
        aaaa.b(z);
    }

    @Override // defpackage.zwl
    public final View a() {
        return this;
    }

    @Override // defpackage.zwl
    public final void q() {
    }

    @Override // defpackage.zwl
    public final void r() {
    }

    @Override // defpackage.zwl
    public final void s() {
    }

    @Override // defpackage.zwl
    public final void t() {
    }

    @Override // defpackage.zwl
    public final void u() {
    }

    @Override // defpackage.zwl
    public final void v() {
    }
}

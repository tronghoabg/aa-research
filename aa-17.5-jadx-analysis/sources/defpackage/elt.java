package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class elt implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ elt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v39, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v50, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewC;
        int i;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case 0:
                elu eluVar = (elu) this.a;
                int i4 = eluVar.b.h;
                boolean z = eluVar.a == 3;
                if (z) {
                    viewC = eluVar.c.c(3);
                    i = (viewC != null ? -viewC.getWidth() : 0) + i4;
                } else {
                    DrawerLayout drawerLayout = eluVar.c;
                    View viewC2 = drawerLayout.c(5);
                    int width = drawerLayout.getWidth() - i4;
                    viewC = viewC2;
                    i = width;
                }
                if (viewC != null) {
                    if ((!z || viewC.getLeft() >= i) && (z || viewC.getLeft() <= i)) {
                        return;
                    }
                    DrawerLayout drawerLayout2 = eluVar.c;
                    if (drawerLayout2.a(viewC) == 0) {
                        els elsVar = (els) viewC.getLayoutParams();
                        eluVar.b.j(viewC, i, viewC.getTop());
                        elsVar.c = true;
                        drawerLayout2.invalidate();
                        eluVar.m();
                        if (drawerLayout2.e) {
                            return;
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                        int childCount = drawerLayout2.getChildCount();
                        while (i2 < childCount) {
                            drawerLayout2.getChildAt(i2).dispatchTouchEvent(motionEventObtain);
                            i2++;
                        }
                        motionEventObtain.recycle();
                        drawerLayout2.e = true;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((DrawerLayout) this.a).g(false);
                return;
            case 2:
                Object obj = ((ely) this.a).h.a;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (true) {
                    ely elyVar = (ely) obj;
                    ArrayList arrayList = elyVar.b;
                    if (i5 >= arrayList.size()) {
                        if (elyVar.d) {
                            int size = arrayList.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                        elx elxVar = elyVar.f;
                                        ValueAnimator.unregisterDurationScaleChangeListener(elxVar.a);
                                        elxVar.a = null;
                                    }
                                    elyVar.d = false;
                                } else if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            elyVar.g.i(elyVar.c);
                            return;
                        }
                        return;
                    }
                    elv elvVar = (elv) arrayList.get(i5);
                    if (elvVar != null) {
                        aat aatVar = elyVar.a;
                        Long l = (Long) aatVar.get(elvVar);
                        if (l == null) {
                            elvVar.a(jUptimeMillis2);
                        } else if (l.longValue() < jUptimeMillis3) {
                            aatVar.remove(elvVar);
                            elvVar.a(jUptimeMillis2);
                        }
                    }
                    i5++;
                }
                break;
            case 3:
                eqt eqtVar = (eqt) this.a;
                if (eqtVar.c == 0) {
                    eqtVar.d = true;
                    eqtVar.f.e(epr.ON_PAUSE);
                }
                eqtVar.c();
                return;
            case 4:
                etg etgVar = (etg) this.a;
                etgVar.f.c.remove(etgVar.g.G());
                return;
            case 5:
                ((exf) this.a).k();
                return;
            case 6:
                RecyclerView recyclerView = ((exv) this.a).b;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 7:
                synchronized (this) {
                    ((PreferenceGroup) this.a).a.clear();
                }
                return;
            case 8:
                ((exy) this.a).c();
                return;
            case 9:
                ((SwipeRefreshLayout) this.a).b();
                return;
            case 10:
                ViewPager viewPager = (ViewPager) this.a;
                viewPager.k(0);
                viewPager.f();
                return;
            case 11:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 12:
                ?? r12 = this.a;
                if (r12 != 0) {
                    r12.s(null);
                    return;
                }
                return;
            case 13:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 14:
                ((fud) this.a).k();
                return;
            case 15:
                ((fud) this.a).m();
                return;
            case 16:
                Object obj2 = this.a;
                gmg gmgVar = ((fug) obj2).b;
                if (gmgVar.i()) {
                    gmgVar.b("car", new geh(gnk.i, new gss(obj2, i3)));
                    return;
                }
                return;
            case 17:
                ((gio) this.a).b();
                return;
            case 18:
                this.a.run();
                return;
            case 19:
                gnk[] gnkVarArrValues = gnk.values();
                int length = gnkVarArrValues.length;
                while (i2 < length) {
                    ((Handler) ((kzt) this.a).c).removeMessages(gnkVarArrValues[i2].ordinal());
                    i2++;
                }
                return;
            default:
                fug fugVar = (fug) ((glf) this.a).b;
                if (fugVar.g) {
                    Iterator it = fugVar.d.values().iterator();
                    while (it.hasNext()) {
                        ((fuh) it.next()).l();
                    }
                    return;
                }
                return;
        }
    }

    public elt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}

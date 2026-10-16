package defpackage;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class ikb implements jaq, jbo, iyv {
    public static final MotionEvent.PointerProperties[] b;
    private static final SparseIntArray r;
    private final List A;
    private final ijz B;
    public int[] c;
    public xju d;
    public iwa e;
    boolean h;
    public final ijy i;
    public final ikz j;
    public volatile CarUiInfo m;
    public boolean n;
    public boolean o;
    private jar s;
    private long u;
    private int v;
    private int w;
    private final jfg x;
    private final CarDisplayId y;
    private final jes z;
    private static final yph p = yph.c("CAR.INPUT");
    private static final ygr q = ygr.t(23, 19, 20, 21, 22, 65536, new Integer[0]);
    public static final long a = ViewConfiguration.getLongPressTimeout();
    private final EnumSet t = EnumSet.noneOf(xji.class);
    public final SparseArray f = new SparseArray();
    public final Handler g = new sss(Looper.getMainLooper(), (byte[]) null);
    public final Queue k = new ArrayDeque();
    public final SharedPreferences.OnSharedPreferenceChangeListener l = new ilg(this, 1);

    static {
        b = new MotionEvent.PointerProperties[]{pointerProperties};
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = 31;
        SparseIntArray sparseIntArray = new SparseIntArray();
        r = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(5, 5);
        sparseIntArray.put(6, 6);
    }

    public ikb(ijy ijyVar, CarDisplayId carDisplayId, jes jesVar, ikz ikzVar, jfg jfgVar, ijz ijzVar) {
        this.i = ijyVar;
        this.y = carDisplayId;
        this.z = jesVar;
        this.j = ikzVar;
        this.B = ijzVar;
        this.x = jfgVar;
        Stream streamD = tgx.d(new ilq(1), acxg.a.gu().f());
        int i = yfq.d;
        this.A = (yfq) streamD.collect(ycm.a);
    }

    public static KeyEvent h(xke xkeVar, int i, int i2, Duration duration) {
        boolean zContains = q.contains(Integer.valueOf(xkeVar.c));
        return new KeyEvent(0L, duration.toMillis(), !xkeVar.d ? 1 : 0, xkeVar.c, (i & 128) != 0 ? 1 : i2, zContains ? 0 : xkeVar.e, 0, 0, i | 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static iye i(xom xomVar) {
        int i;
        iye iyeVar;
        iyd iydVar;
        SparseIntArray sparseIntArray = r;
        if ((xomVar.b & 2) != 0) {
            int iA = wox.A(xomVar.e);
            if (iA == 0) {
                iA = 1;
            }
            i = iA - 1;
        } else {
            i = 0;
        }
        int i2 = sparseIntArray.get(i);
        int i3 = xomVar.d;
        int size = xomVar.c.size();
        synchronized (iye.a) {
            iyeVar = iye.c;
            if (iyeVar == null) {
                iyeVar = new iye();
            } else {
                iye.c = iyeVar.d;
                iye.b--;
                iyeVar.d = null;
            }
        }
        iyeVar.e = i2;
        iyeVar.f = i3;
        iyeVar.g = SystemClock.elapsedRealtime();
        if (iyeVar.h.length != size) {
            iyeVar.h = new iyd[size];
        }
        for (int i4 = 0; i4 < xomVar.c.size(); i4++) {
            xol xolVar = (xol) xomVar.c.get(i4);
            iyd[] iydVarArr = iyeVar.h;
            int i5 = xolVar.c;
            int i6 = xolVar.d;
            int i7 = xolVar.e;
            synchronized (iyd.a) {
                iydVar = iyd.c;
                if (iydVar == null) {
                    iydVar = new iyd();
                } else {
                    iyd.c = iydVar.d;
                    iyd.b--;
                    iydVar.d = null;
                }
            }
            iydVar.e = i5;
            iydVar.f = i6;
            iydVar.g = i7;
            iydVarArr[i4] = iydVar;
        }
        return iyeVar;
    }

    private final float p() {
        xju xjuVar;
        int iA = (int) kjf.a(this.A, this.z.t(), 0L);
        if (iA == 0 && ((xjuVar = this.d) == null || (xjuVar.b & 128) == 0 || (iA = xjuVar.j) == 0)) {
            return 1.0f;
        }
        return (((iA - 5.0f) * (-0.5f)) / 5.0f) + 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jbo
    @ResultIgnorabilityUnspecified
    public final iyw a(xnz xnzVar) {
        int i;
        boolean z;
        boolean z2;
        CarInfo carInfoT;
        ilb.d();
        if ((xnzVar.b & 8) != 0) {
            xjw xjwVar = xnzVar.f;
            if (xjwVar == null) {
                xjwVar = xjw.b;
            }
            CarDisplayId carDisplayId = this.y;
            int i2 = xjwVar.g;
            int i3 = carDisplayId.b;
            if (i2 == i3) {
                this.c = wub.ay(xjwVar.c);
                this.d = xjwVar.e.size() > 0 ? (xju) xjwVar.e.get(0) : null;
                this.t.addAll(new abof(xjwVar.f, xjw.a));
                EnumSet enumSetNoneOf = EnumSet.noneOf(xkd.class);
                boolean z3 = false;
                boolean z4 = false;
                for (int i4 : this.c) {
                    if (i4 == 84) {
                        z4 = true;
                    } else if (i4 != 65536) {
                        switch (i4) {
                            case 19:
                                enumSetNoneOf.add(xkd.KEYCODE_DPAD_UP);
                                break;
                            case 20:
                                enumSetNoneOf.add(xkd.KEYCODE_DPAD_DOWN);
                                break;
                            case 21:
                                enumSetNoneOf.add(xkd.KEYCODE_DPAD_LEFT);
                                break;
                            case 22:
                                enumSetNoneOf.add(xkd.KEYCODE_DPAD_RIGHT);
                                break;
                            case 23:
                                enumSetNoneOf.add(xkd.KEYCODE_DPAD_CENTER);
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                }
                boolean zContainsAll = enumSetNoneOf.containsAll(EnumSet.of(xkd.KEYCODE_DPAD_UP, xkd.KEYCODE_DPAD_DOWN, xkd.KEYCODE_DPAD_LEFT, xkd.KEYCODE_DPAD_RIGHT, xkd.KEYCODE_DPAD_CENTER));
                xjv xjvVar = xjwVar.d.size() > 0 ? (xjv) xjwVar.d.get(0) : null;
                if (xjvVar == null) {
                    i = 0;
                } else if ((xjvVar.b & 4) != 0) {
                    int iAr = a.ar(xjvVar.e);
                    i = (iAr == 0 || iAr == 1) ? 2 : iAr != 2 ? 4 : 3;
                } else {
                    i = 1;
                }
                boolean zO = o();
                if (zO && z3) {
                    ((ype) ((ype) p.h()).ai((char) 150)).u("Rotary controller not supported when touchpad for UI navigation is present. Reporting rotary controller as not present.");
                    z = false;
                } else {
                    z = z3;
                }
                boolean z5 = acqg.a.gu().a() && (carInfoT = this.z.t()) != null && carInfoT.r == 3 && zContainsAll && !z && this.d == null;
                this.h = z5;
                if (z5) {
                    iwa iwaVar = new iwa(new ajmd(this));
                    this.e = iwaVar;
                    this.d = iwaVar.b;
                    ((ype) ((ype) p.f()).ai((char) 149)).u("Using virtual touchpad input for UI navigation");
                    this.x.b(rrc.h(yxy.CAR_SERVICE, yzz.INPUT_CONFIGURATION, yzy.oQ).l());
                    z2 = true;
                } else {
                    z2 = zO;
                }
                int iE = e();
                int iF = f();
                iwa iwaVar2 = this.e;
                if (iwaVar2 != null) {
                    yph yphVar = iwa.a;
                    ((ype) yphVar.l().ai(1443)).w("VirtualTouchpad move threshold: %dpx", iE);
                    int i5 = -iE;
                    iwaVar2.c = iwa.b(0, i5);
                    ((ype) yphVar.l().ai(1439)).y("VirtualTouchpad upSwipe: %s", iwaVar2.c);
                    iwaVar2.d = iwa.b(0, iE);
                    ((ype) yphVar.l().ai(1440)).y("VirtualTouchpad downSwipe: %s", iwaVar2.d);
                    iwaVar2.e = iwa.b(i5, 0);
                    ((ype) yphVar.l().ai(1441)).y("VirtualTouchpad leftSwipe: %s", iwaVar2.e);
                    iwaVar2.f = iwa.b(iE, 0);
                    ((ype) yphVar.l().ai(1442)).y("VirtualTouchpad rightSwipe: %s", iwaVar2.f);
                }
                this.m = new CarUiInfo(z, i, z4, z2, g(), zContainsAll, false, iE, iF);
                ijz ijzVar = this.B;
                if (ijzVar != null) {
                    ijzVar.a(this.m);
                }
                this.j.d(this.l);
                ((ype) ((ype) p.f()).ai(148)).R("Discovered input for display %d with service %d: %s", Integer.valueOf(i3), Integer.valueOf(xnzVar.c), this.m);
                return this;
            }
        }
        return null;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jar(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    public final int e() {
        int iMax;
        int i = this.v;
        if (i != 0) {
            return i;
        }
        xju xjuVar = this.d;
        if (xjuVar == null) {
            ((ype) ((ype) p.h()).ai((char) 144)).u("No touchpad found. Using default threshold.");
            return 48;
        }
        int i2 = xjuVar.c;
        int i3 = xjuVar.d;
        int i4 = xjuVar.f;
        int i5 = xjuVar.g;
        if (i2 == 0 || i3 == 0) {
            ((ype) ((ype) p.h()).ai((char) 142)).u("No virtual touchpad dimens. Using default threshold.");
            return 48;
        }
        if (i4 == 0 || i5 == 0) {
            ((ype) ((ype) p.h()).ai((char) 143)).u("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
            i4 = i2;
            i5 = i3;
        }
        int iB = (int) acxg.b();
        int iE = (int) acxg.e();
        float fP = p();
        int i6 = i2 / iB;
        int i7 = i3 / iB;
        float f = iE;
        if (i6 > i7) {
            iMax = Math.max(i6, (int) (f * (i2 / i4)));
        } else {
            iMax = Math.max(i7, (int) (f * (i3 / i5)));
        }
        int i8 = (int) (iMax * fP);
        this.v = i8;
        return i8;
    }

    public final int f() {
        float f;
        float f2;
        int i = this.w;
        if (i != 0) {
            return i;
        }
        xju xjuVar = this.d;
        if (xjuVar == null) {
            ((ype) ((ype) p.h()).ai((char) 147)).u("No touchpad found. Using default threshold.");
            return 64;
        }
        int i2 = xjuVar.c;
        int i3 = xjuVar.d;
        int i4 = xjuVar.f;
        int i5 = xjuVar.g;
        if (i2 == 0 || i3 == 0) {
            ((ype) ((ype) p.h()).ai((char) 145)).u("No virtual touchpad dimens. Using default threshold.");
            return 64;
        }
        if (i4 == 0 || i5 == 0) {
            ((ype) ((ype) p.h()).ai((char) 146)).u("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
            i4 = i2;
            i5 = i3;
        }
        int iF = (int) acxg.f();
        int iE = e();
        float fP = p();
        float f3 = iF;
        if (i2 > i3) {
            f = i4;
            f2 = i2;
        } else {
            f = i5;
            f2 = i3;
        }
        int i6 = iE + ((int) (((int) (f3 * (f2 / f))) * fP));
        this.w = i6;
        return i6;
    }

    public final Point g() {
        xju xjuVar = this.d;
        if (xjuVar == null) {
            return null;
        }
        return new Point(xjuVar.c, xjuVar.d);
    }

    @Override // defpackage.jaq
    public final void j(xom xomVar) {
        int i = xomVar.d;
        iye iyeVarI = i(xomVar);
        iyeVarI.e = (i << 8) | iyeVarI.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = iyeVarI.e;
        if (i2 == 0) {
            this.u = jElapsedRealtime;
            i2 = 0;
        }
        this.i.b(iye.a(this.u, jElapsedRealtime, i2, Arrays.asList(iyeVarI.h), 0, 0, 1048584, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyv
    public final void k(xnz xnzVar) {
        if (this.d != null) {
            xjw xjwVar = xnzVar.f;
            if (xjwVar == null) {
                xjwVar = xjw.b;
            }
            if ((((xju) xjwVar.e.get(0)).b & 128) != 0) {
                abnp abnpVarO = xju.a.o(this.d);
                xjw xjwVar2 = xnzVar.f;
                if (xjwVar2 == null) {
                    xjwVar2 = xjw.b;
                }
                int i = ((xju) xjwVar2.e.get(0)).j;
                abnpVarO.t();
                xju xjuVar = (xju) abnpVarO.b;
                xjuVar.b |= 128;
                xjuVar.j = i;
                this.d = (xju) abnpVarO.q();
            }
        }
        l();
    }

    public final void l() {
        if (this.d != null) {
            this.v = 0;
            this.w = 0;
        }
        CarUiInfo carUiInfo = this.m;
        int[] iArr = carUiInfo.e;
        this.m = new CarUiInfo(carUiInfo.a, carUiInfo.g, carUiInfo.c, carUiInfo.d, iArr != null ? new Point(iArr[0], iArr[1]) : null, carUiInfo.f, carUiInfo.h, e(), f());
        ijz ijzVar = this.B;
        if (ijzVar != null) {
            ijzVar.a(this.m);
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        printWriter.println("Supported keys: ".concat(String.valueOf(Arrays.toString(this.c))));
        xju xjuVar = this.d;
        if (xjuVar != null) {
            Integer numValueOf = (xjuVar.b & 1) != 0 ? Integer.valueOf(xjuVar.c) : null;
            xju xjuVar2 = this.d;
            Integer numValueOf2 = (xjuVar2.b & 2) != 0 ? Integer.valueOf(xjuVar2.d) : null;
            xju xjuVar3 = this.d;
            Integer numValueOf3 = (xjuVar3.b & 8) != 0 ? Integer.valueOf(xjuVar3.f) : null;
            xju xjuVar4 = this.d;
            Integer numValueOf4 = (xjuVar4.b & 16) != 0 ? Integer.valueOf(xjuVar4.g) : null;
            Boolean boolValueOf = Boolean.valueOf(o());
            Integer numValueOf5 = Integer.valueOf(e());
            Integer numValueOf6 = Integer.valueOf(f());
            Float fValueOf = Float.valueOf(p());
            xju xjuVar5 = this.d;
            Boolean boolValueOf2 = (xjuVar5.b & 4) != 0 ? Boolean.valueOf(xjuVar5.e) : null;
            xju xjuVar6 = this.d;
            Boolean boolValueOf3 = (xjuVar6.b & 32) != 0 ? Boolean.valueOf(xjuVar6.h) : null;
            xju xjuVar7 = this.d;
            Boolean boolValueOf4 = (xjuVar7.b & 64) != 0 ? Boolean.valueOf(xjuVar7.i) : null;
            xju xjuVar8 = this.d;
            printWriter.printf("Touchpad: width x height:%dx%d, physicalWidth x physicalHeight:%dx%d\n\tgetTouchPadForUiNavigation():%b\n\tgetTouchpadMoveThresholdPx():%d, getTouchpadMultimoveThresholdPx():%d, getTouchpadThresholdMultiplier():%.4f\n\tuiNavigation:%b, uiAbsolute:%b, tapAsSelect:%b, sensitivity:%d, useVirtualTouchpad:%b\n", numValueOf, numValueOf2, numValueOf3, numValueOf4, boolValueOf, numValueOf5, numValueOf6, fValueOf, boolValueOf2, boolValueOf3, boolValueOf4, (xjuVar8.b & 128) != 0 ? Integer.valueOf(xjuVar8.j) : null, Boolean.valueOf(this.h));
        }
        printWriter.println("Feedback events: ".concat(String.valueOf(String.valueOf(this.t))));
        printWriter.println("CarUiInfo: ".concat(String.valueOf(String.valueOf(this.m))));
    }

    public final void n(int i) {
        xji xjiVarB = xji.b(i);
        if (xjiVarB == null || !this.t.contains(xjiVarB)) {
            return;
        }
        jar jarVar = this.s;
        abnp abnpVarN = xjs.a.n();
        abnpVarN.t();
        xjs xjsVar = (xjs) abnpVarN.b;
        xjsVar.c = xjiVarB.f;
        xjsVar.b |= 1;
        jarVar.k(32772, (xjs) abnpVarN.q());
    }

    public final boolean o() {
        xju xjuVar = this.d;
        if (xjuVar != null) {
            return xjuVar.e || acxg.i();
        }
        return false;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        jar jarVar = (jar) jbjVar;
        this.s = jarVar;
        int[] iArr = this.c;
        abnp abnpVarN = xkb.a.n();
        List listAx = wub.ax(iArr);
        abnpVarN.t();
        xkb xkbVar = (xkb) abnpVarN.b;
        abod abodVar = xkbVar.b;
        if (!abodVar.c()) {
            int size = abodVar.size();
            xkbVar.b = abodVar.d(size + size);
        }
        abmc.i(listAx, xkbVar.b);
        jarVar.k(32770, (xkb) abnpVarN.q());
    }
}

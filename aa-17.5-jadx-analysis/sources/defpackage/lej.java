package defpackage;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.control.CarControlGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lej {
    public static final lei a = new lei();
    public static final afgl b = new kkp(mki.b, 8);
    public static final yph c = yph.c("GH.Hero");
    private static final List f = woy.bi("connect-s", "connect_s");
    private static final List g = woy.bi("connect-l", "connect_l");
    private static final List h = woy.bi("connect-w", "connect_w");
    public volatile Boolean d;
    public volatile Boolean e;

    public static final lej a() {
        return a.a();
    }

    public final void b(rij rijVar) {
        Boolean boolValueOf;
        yph yphVar = c;
        yphVar.l().u("Setting persistent car controls state for the session.");
        boolean z = true;
        this.d = Boolean.valueOf(rijVar != null);
        if (rijVar == null) {
            yphVar.l().u("CarControlManager is null, hasPersistentCarControls is false");
            boolValueOf = false;
        } else {
            rim rimVar = rijVar.b;
            rimVar.getClass();
            List list = (List) rijVar.a.b(new rdw(rimVar, 4));
            list.getClass();
            if (list.isEmpty()) {
                z = false;
                boolValueOf = Boolean.valueOf(z);
                boolValueOf.getClass();
                yphVar.l().y("hasPersistentCarControls is %b", Boolean.valueOf(z));
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((CarControlGroup) it.next()).a == 1) {
                        break;
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
                boolValueOf.getClass();
                yphVar.l().y("hasPersistentCarControls is %b", Boolean.valueOf(z));
            }
        }
        this.e = boolValueOf;
    }

    public final boolean c() {
        acrz acrzVar = acrz.a;
        if (!acrzVar.gu().i() || !acrzVar.gu().c()) {
            return false;
        }
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.l().u("Setting car control info from isCarControlsEnabled");
        try {
            mki.a.g();
            yph yphVar = kio.a;
            b(((qsz) ((kio) mki.a.i(kio.class)).e()).d().e());
        } catch (qsa unused) {
            b(null);
        } catch (Throwable unused2) {
            return false;
        }
        return affa.f(this.d, true);
    }

    public final boolean d() {
        if (acrz.k() && acrz.f()) {
            try {
                mki.a.g();
                if (ols.r(kio.b().e()) != null) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean e() {
        yph yphVar = kiq.a;
        CarInfo carInfoB = ((kiq) mki.a.i(kiq.class)).b();
        if (carInfoB != null) {
            List<String> list = f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    String str2 = carInfoB.j;
                    str2.getClass();
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (afyh.u(lowerCase, str, false)) {
                        return true;
                    }
                }
            }
        }
        if (carInfoB != null) {
            List<String> list2 = g;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str3 : list2) {
                    String str4 = carInfoB.j;
                    str4.getClass();
                    String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (afyh.u(lowerCase2, str3, false)) {
                        return true;
                    }
                }
            }
        }
        if (carInfoB != null) {
            List<String> list3 = h;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (String str5 : list3) {
                    String str6 = carInfoB.j;
                    str6.getClass();
                    String lowerCase3 = str6.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    if (afyh.u(lowerCase3, str5, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        qrn qrnVarE = kio.b().e();
        qrnVarE.getClass();
        return g(qrnVarE);
    }

    public final boolean g(qrn qrnVar) {
        acrz acrzVar = acrz.a;
        if (!acrzVar.gu().i() || !acrzVar.gu().t()) {
            return false;
        }
        mki.a.g();
        return qrnVar.a().p(raj.U);
    }
}

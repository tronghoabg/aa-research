package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.calendar.model.CalendarEvent;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class civ implements Comparator {
    private final /* synthetic */ int f;
    public static final civ e = new civ(8);
    public static final civ d = new civ(4);
    public static final civ c = new civ(3);
    public static final civ b = new civ(2);
    public static final civ a = new civ(0);

    public civ(int i) {
        this.f = i;
    }

    private static final byw a(cxb cxbVar) {
        byw bywVar = new byw(new cxb[16]);
        while (cxbVar != null) {
            bywVar.f(0, cxbVar);
            cxbVar = cxbVar.l();
        }
        return bywVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.f) {
            case 0:
                ciu ciuVar = (ciu) obj;
                ciu ciuVar2 = (ciu) obj2;
                if (!mt.r(ciuVar) || !mt.r(ciuVar2)) {
                    if (mt.r(ciuVar)) {
                        return -1;
                    }
                    return mt.r(ciuVar2) ? 1 : 0;
                }
                cxb cxbVarQ = bzi.q(ciuVar);
                cxb cxbVarQ2 = bzi.q(ciuVar2);
                if (affa.f(cxbVarQ, cxbVarQ2)) {
                    return 0;
                }
                byw bywVarA = a(cxbVarQ);
                byw bywVarA2 = a(cxbVarQ2);
                int iMin = Math.min(bywVarA.b - 1, bywVarA2.b - 1);
                if (iMin >= 0) {
                    while (affa.f(bywVarA.a[i], bywVarA2.a[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return affa.b(((cxb) bywVarA.a[i]).f(), ((cxb) bywVarA2.a[i]).f());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            case 1:
                return ((xuh) obj).b - ((xuh) obj2).b;
            case 2:
                cjb cjbVarC = ((ddu) obj).c();
                cjb cjbVarC2 = ((ddu) obj2).c();
                int iCompare = Float.compare(cjbVarC.b, cjbVarC2.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cjbVarC.c, cjbVarC2.c);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cjbVarC.e, cjbVarC2.e);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cjbVarC.d, cjbVarC2.d);
            case 3:
                cjb cjbVarC3 = ((ddu) obj).c();
                cjb cjbVarC4 = ((ddu) obj2).c();
                int iCompare4 = Float.compare(cjbVarC4.d, cjbVarC3.d);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cjbVarC3.c, cjbVarC4.c);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cjbVarC3.e, cjbVarC4.e);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cjbVarC4.b, cjbVarC3.b);
            case 4:
                cjb cjbVar = (cjb) ((aezu) obj).a;
                float f = cjbVar.c;
                cjb cjbVar2 = (cjb) ((aezu) obj2).a;
                int iCompare7 = Float.compare(f, cjbVar2.c);
                return iCompare7 != 0 ? iCompare7 : Float.compare(cjbVar.e, cjbVar2.e);
            case 5:
                return ((dpb) obj).c - ((dpb) obj2).c;
            case 6:
                return ((fib) obj).b - ((fib) obj2).b;
            case 7:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 8:
                CalendarEvent calendarEvent = (CalendarEvent) obj;
                CalendarEvent calendarEvent2 = (CalendarEvent) obj2;
                int iCompare8 = Long.compare(calendarEvent.e(), calendarEvent2.e());
                if (calendarEvent.i() && calendarEvent2.i()) {
                    iCompare8 = -iCompare8;
                }
                if (iCompare8 != 0) {
                    return iCompare8;
                }
                int iCompare9 = Long.compare(calendarEvent.c(), calendarEvent2.c());
                return iCompare9 == 0 ? calendarEvent.h().compareTo(calendarEvent2.h()) : iCompare9;
            case 9:
                return ((qle) obj).getClass().getCanonicalName().compareTo(((qle) obj2).getClass().getCanonicalName());
            case 10:
                return ((Integer) ((dzi) obj).a).intValue() - ((Integer) ((dzi) obj2).a).intValue();
            case 11:
                ubf ubfVar = (ubf) obj;
                ubf ubfVar2 = (ubf) obj2;
                abcs abcsVar = ((uat) ubfVar.u()).a;
                int i2 = abcsVar.v;
                int i3 = abcsVar.n;
                int i4 = abcsVar.o;
                abcs abcsVar2 = ((uat) ubfVar2.u()).a;
                int i5 = abcsVar2.v;
                int i6 = abcsVar2.n;
                int i7 = abcsVar2.o;
                int iCompare10 = Integer.compare(i2, i5);
                if (iCompare10 != 0) {
                    return iCompare10;
                }
                int iCompare11 = Integer.compare(i3, i6);
                if (iCompare11 != 0) {
                    return iCompare11;
                }
                int iCompare12 = Integer.compare(i4, i7);
                if (iCompare12 != 0) {
                    return iCompare12;
                }
                int iCompare13 = Float.compare(ubfVar.b(), ubfVar2.b());
                if (iCompare13 != 0) {
                    return iCompare13;
                }
                abcs abcsVar3 = ((uat) ubfVar.u()).a;
                abnh abnhVar = abhx.d;
                abcsVar3.j(abnhVar);
                abnl abnlVar = abcsVar3.w;
                abnu abnuVar = abnhVar.d;
                Object objJ = abnlVar.j(abnuVar);
                int iIntValue = ((Integer) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).intValue();
                abcs abcsVar4 = ((uat) ubfVar2.u()).a;
                abcsVar4.j(abnhVar);
                Object objJ2 = abcsVar4.w.j(abnuVar);
                int iCompare14 = Integer.compare(iIntValue, ((Integer) (objJ2 == null ? abnhVar.b : abnhVar.c(objJ2))).intValue());
                if (iCompare14 != 0) {
                    return iCompare14;
                }
                int iCompare15 = Integer.compare(ubfVar.t(), ubfVar2.t());
                return iCompare15 == 0 ? Integer.compare(ubfVar.hashCode(), ubfVar2.hashCode()) : iCompare15;
            case 12:
                uth uthVar = (uth) obj;
                uth uthVar2 = (uth) obj2;
                return yde.b.c(uthVar.G().a, uthVar2.G().a).c(uthVar.G().b, uthVar2.G().b).c(uthVar.G().c, uthVar2.G().c).c(uthVar.G().d, uthVar2.G().d).c(uthVar.j().a(), uthVar2.j().a()).a();
            case 13:
                ute uteVarE = ((uth) obj).E();
                ute uteVarE2 = ((uth) obj2).E();
                return yde.b.d(uteVarE.b, uteVarE2.b).d(uteVarE.c, uteVarE2.c).d(uteVarE.d, uteVarE2.d).d(uteVarE.e, uteVarE2.e).a();
            case 14:
                return ((uth) obj).i() - ((uth) obj2).i();
            case 15:
                return ((uth) obj).j().a() - ((uth) obj2).j().a();
            case 16:
                return Double.compare(((acae) obj2).a, ((acae) obj).a);
            case 17:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 18:
                return ((lbk) obj2).d.compareTo(((lbk) obj).d);
            case 19:
                xby xbyVar = (xby) ((dzi) obj).a;
                int i8 = xbyVar.a;
                xby xbyVar2 = (xby) ((dzi) obj2).a;
                int i9 = i8 - xbyVar2.a;
                return i9 != 0 ? i9 : xbyVar.b.compareTo(xbyVar2.b);
            default:
                aaae aaaeVar = (aaae) obj;
                aaae aaaeVar2 = (aaae) obj2;
                if (aaaeVar == null && aaaeVar2 == null) {
                    return 0;
                }
                if (aaaeVar == null) {
                    return -1;
                }
                if (aaaeVar2 == null) {
                    return 1;
                }
                return Float.compare(aaaeVar.h(), aaaeVar2.h());
        }
    }
}

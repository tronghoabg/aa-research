package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.MessageTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.calendar.model.CalendarEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class juc {
    public static final void a(final fyf fyfVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1562396491);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fyfVar) : buxVarC.E(fyfVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gfa gfaVar = fyfVar.a;
            gfk gfkVar = fyfVar.b;
            aezr aezrVar = ktf.a;
            jtk.d(gfaVar, gfkVar, kgq.j(0L, 0L, 0L, 0L, buxVarC, 255), fyfVar.e, fyfVar.f, fyfVar.i, bxc.i(49731521, true, new afeh() { // from class: jub
                /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    asf asfVar;
                    kzt kztVar = (kzt) obj;
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kztVar.getClass();
                    int i4 = 4;
                    boolean z = true;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((iIntValue & 8) == 0 ? buxVar3.C(kztVar) : buxVar3.E(kztVar)) ? 2 : 4;
                    }
                    if (buxVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        fyf fyfVar2 = fyfVar;
                        if (!fyfVar2.g && fyfVar2.c == null) {
                            z = false;
                        }
                        if (z) {
                            buxVar3.v(-211805592);
                            Object objG = buxVar3.g();
                            if (objG == buw.a) {
                                objG = new asg();
                                buxVar3.x(objG);
                            }
                            asfVar = (asf) objG;
                            buxVar3.o();
                        } else {
                            buxVar3.v(-211743189);
                            Object objG2 = buxVar3.g();
                            if (objG2 == buw.a) {
                                objG2 = new fvt();
                                buxVar3.x(objG2);
                            }
                            asfVar = (fvt) objG2;
                            buxVar3.o();
                        }
                        asf asfVar2 = asfVar;
                        cfy cfyVar2 = cfyVar;
                        Object obj4 = kztVar.d;
                        int i5 = 5;
                        if (obj4 != null) {
                            deu deuVar = (deu) obj4;
                            if (deuVar.a() != 0) {
                                buxVar3.v(-211636859);
                                Object obj5 = kztVar.b;
                                boolean z2 = fyfVar2.d;
                                ksy ksyVarA = ksy.a(jtk.f((fwf) buxVar3.f(fwg.a)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, fyfVar2.h, 479);
                                boolean zD = buxVar3.D(z);
                                Object objG3 = buxVar3.g();
                                if (zD || objG3 == buw.a) {
                                    objG3 = new jtp(z, 5);
                                    buxVar3.x(objG3);
                                }
                                cfy cfyVarE = gut.e(bxc.k(cfyVar2, (afec) objG3), fyfVar2);
                                Object obj6 = kztVar.a;
                                ?? r14 = kztVar.c;
                                boolean zE = buxVar3.E(fyfVar2);
                                Object objG4 = buxVar3.g();
                                if (zE || objG4 == buw.a) {
                                    objG4 = new jtw(fyfVar2, i4);
                                    buxVar3.x(objG4);
                                }
                                khc.p((cmw) obj5, deuVar, (afdr) objG4, cfyVarE, ksyVarA, z2, false, null, null, (ktf) obj6, null, asfVar2, r14, buxVar3, 8, 0, 5568);
                                buxVar3.o();
                                return afak.a;
                            }
                        }
                        buxVar3.v(-210964159);
                        buxVar3.o();
                        Object obj7 = kztVar.b;
                        if (obj7 != null) {
                            buxVar3.v(-210917690);
                            boolean z3 = fyfVar2.d;
                            ksy ksyVarF = jtk.f((fwf) buxVar3.f(fwg.a));
                            Object obj8 = kztVar.a;
                            boolean zD2 = buxVar3.D(z);
                            Object objG5 = buxVar3.g();
                            if (zD2 || objG5 == buw.a) {
                                objG5 = new jtp(z, 6);
                                buxVar3.x(objG5);
                            }
                            cfy cfyVarE2 = gut.e(bxc.k(cfyVar2, (afec) objG5), fyfVar2);
                            boolean zE2 = buxVar3.E(fyfVar2);
                            Object objG6 = buxVar3.g();
                            if (zE2 || objG6 == buw.a) {
                                objG6 = new jtw(fyfVar2, i5);
                                buxVar3.x(objG6);
                            }
                            ksy ksyVar = ksy.a;
                            khc.r((cmw) obj7, (afdr) objG6, cfyVarE2, ksyVarF, z3, false, null, null, (ktf) obj8, null, asfVar2, buxVar3, 8, 0, 2784);
                            buxVar3.o();
                        } else {
                            buxVar3.v(-210455263);
                            buxVar3.o();
                        }
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 1572928, 0);
            buxVar2 = buxVarC;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fyfVar, cfyVar, i, 8);
        }
    }

    public static final Bundle b() {
        return dsg.z(new aezu("dash_template_intent_key", new Intent().setComponent(kyg.a).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH", (Parcelable) null).putExtra("com.google.android.apps.auto.components.apphost.EXTRA_WIDGET_APP", true)));
    }

    public static final CarIconSpan c(qn qnVar, int i, CarColor carColor) {
        tj tjVar = new tj(IconCompat.m(qnVar, i));
        tjVar.a(carColor);
        return CarIconSpan.create(new CarIcon(tjVar), 2);
    }

    public static final MessageTemplate d(qn qnVar, String str) {
        str.getClass();
        um umVar = new um(qnVar.getString(R.string.no_events_today));
        umVar.c(Action.APP_ICON);
        umVar.e(str);
        umVar.d(new CarIcon(new tj(IconCompat.m(qnVar, R.drawable.ic_no_events))));
        return umVar.a();
    }

    public static final void e(ug ugVar, List list, qn qnVar, yzz yzzVar) {
        yfq yfqVar;
        final qn qnVar2 = qnVar;
        final yzz yzzVar2 = yzzVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final CalendarEvent calendarEvent = (CalendarEvent) it.next();
            vf vfVar = new vf();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (calendarEvent.j()) {
                int color = qnVar2.getColor(R.color.work_profile_night);
                leh.a.a();
                spannableStringBuilder.append(" ", c(qnVar2, 2131233167, CarColor.createCustom(qnVar2.getColor(R.color.work_profile_day), color)), 33);
                spannableStringBuilder.append((CharSequence) "  ");
            }
            khc.c();
            yzz yzzVar3 = yzz.CALENDAR_ALL_DAY_EVENTS_VIEW;
            String strA = khc.a(calendarEvent.e(), calendarEvent.c(), calendarEvent.i(), yzzVar2 == yzzVar3);
            String strH = calendarEvent.h();
            if (afyh.v(strH)) {
                strH = qnVar2.getString(R.string.agenda_item_no_title);
            }
            if (yzzVar2 == yzzVar3) {
                spannableStringBuilder.append((CharSequence) afyh.k(a.bJ(strA, strH, " ")).toString());
            } else {
                spannableStringBuilder.append((CharSequence) (strA + String.format(" %s ", qnVar2.getString(R.string.bullet)) + strH));
            }
            vfVar.i(new SpannedString(spannableStringBuilder));
            int iA = calendarEvent.a();
            tj tjVar = new tj(IconCompat.m(qnVar2, R.drawable.color_indicator));
            tjVar.a(CarColor.createCustom(iA, iA));
            vfVar.e(new CarIcon(tjVar), 8);
            yfq yfqVarF = calendarEvent.f();
            final String strG = calendarEvent.g();
            boolean zV = afyh.v(strG);
            final boolean z = !zV;
            boolean zIsEmpty = yfqVarF.isEmpty();
            final boolean z2 = !zIsEmpty;
            if (!zV) {
                vfVar.d(f(qnVar2, R.drawable.gs_navigation_vd_theme_24, strG));
            }
            if (zIsEmpty) {
                yfqVar = yfqVarF;
            } else {
                yfqVar = yfqVarF;
                vfVar.d(f(qnVar2, R.drawable.gs_call_vd_theme_24, woy.cu(yfqVar, ", ", null, null, new jxa(15), 30)));
            }
            if (!zV || !zIsEmpty) {
                final yfq yfqVar2 = yfqVar;
                vfVar.g(new us() { // from class: khb
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    @Override // defpackage.us
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick() {
                        /*
                            r5 = this;
                            boolean r0 = r1
                            boolean r1 = r2
                            com.google.android.apps.auto.components.calendar.model.CalendarEvent r2 = r5
                            if (r0 == 0) goto Lb
                            if (r1 != 0) goto L14
                            r1 = 0
                        Lb:
                            yfq r0 = r3
                            int r3 = r0.size()
                            r4 = 1
                            if (r3 <= r4) goto L27
                        L14:
                            qn r5 = r4
                            java.lang.Class<qx> r0 = defpackage.qx.class
                            java.lang.Object r0 = r5.a(r0)
                            qx r0 = (defpackage.qx) r0
                            kgn r1 = new kgn
                            r1.<init>(r5, r2)
                            r0.f(r1)
                            return
                        L27:
                            yzz r3 = r7
                            if (r1 == 0) goto L38
                            java.lang.String r5 = r6
                            defpackage.kgo.c()
                            boolean r0 = r2.j()
                            defpackage.kgo.a(r5, r3, r0)
                            return
                        L38:
                            defpackage.kgo.c()
                            java.lang.Object r5 = defpackage.woy.bN(r0)
                            com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber r5 = (com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber) r5
                            java.lang.String r0 = "android.intent.action.DIAL"
                            defpackage.kgo.b(r5, r3, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.khb.onClick():void");
                    }
                });
            }
            ugVar.b(vfVar.a());
            qnVar2 = qnVar;
            yzzVar2 = yzzVar;
        }
    }

    private static final SpannedString f(qn qnVar, int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CarColor carColor = CarColor.DEFAULT;
        carColor.getClass();
        spannableStringBuilder.append("     ", c(qnVar, i, carColor), 33);
        spannableStringBuilder.append((CharSequence) "  ".concat(str));
        return new SpannedString(spannableStringBuilder);
    }
}

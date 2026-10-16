package com.waze.ad.c;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.car.app.CarContext;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.google.v.eu;
import com.waze.av.a.o;
import com.waze.av.a.p;
import com.waze.av.b.m;
import com.waze.av.b.n;
import com.waze.av.d.e;
import com.waze.av.d.f;
import com.waze.av.d.k;
import com.waze.av.d.s;
import com.waze.av.d.u;
import com.waze.jni.protos.CandidateProduct;
import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.Reporter;
import com.waze.jni.protos.VenueImage;
import com.waze.jni.protos.crash.PerformanceTraces;
import com.waze.main_screen.g.q;
import com.waze.map.ActiveMapPerformanceTracesProviderNativeManager;
import com.waze.reports.ed;
import com.waze.shared_infra.i.h;
import com.waze.strings.DisplayStrings;
import com.waze.ui.r.a.d.c;
import com.waze.ui.r.a.d.d;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public static void a(af afVar, h.g.a.a aVar) {
        x.f(afVar, "<this>");
        x.f(aVar, "block");
        aj.z(afVar, null, null, new a(aVar, null), 3);
    }

    public static /* synthetic */ boolean b(Intent intent) {
        return x.n(intent.getAction(), CarContext.ACTION_NAVIGATE) || x.n(intent.getAction(), "android.intent.action.NAVIGATE");
    }

    public static void d(final h.g.a.a aVar, final h.g.a.a aVar2, final l lVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        x.f(aVar, "onZoomIn");
        x.f(aVar2, "onZoomOut");
        x.f(lVar, "onZoomRateDragged");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-511624188);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511624188, i3, -1, "com.waze.main_screen.zoom_controls.presentation.ZoomControls (ZoomControls.kt:18)");
            }
            Modifier modifierA = d.a(modifier, c.cQ, null);
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            boolean z3 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: com.waze.main_screen.ag.a.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        x.f(context, "context");
                        q qVar = new q(context);
                        qVar.i(new b(aVar, aVar2, lVar));
                        return qVar;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidView_androidKt.AndroidView((l) objRememberedValue, modifierA, null, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b((Object) aVar, (Object) aVar2, lVar, modifier, i2, 9));
        }
    }

    public static n e(k kVar) {
        x.f(kVar, "<this>");
        return new m(new p(kVar.a(), kVar.h(), new o(kVar.A(), kVar.B(), kVar.p(), kVar.y(), kVar.v(), Boolean.valueOf(kVar.N()))));
    }

    public static com.waze.av.d.c f(com.waze.av.d.a aVar) {
        Object next;
        x.f(aVar, "<this>");
        Iterator it = aVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long jA = ((com.waze.av.d.c) next).a();
            h.o.c cVar = h.o.a.f48264a;
            int i2 = com.waze.av.d.l.f16096a;
            Long lA = com.waze.av.d.l.a();
            x.e(lA, "<get-parkingPinDurationHours>(...)");
            if (jA == h.o.a.p(h.o.c.j(lA.longValue(), h.o.d.f48275f))) {
                break;
            }
        }
        return (com.waze.av.d.c) next;
    }

    public static k g(n nVar) {
        String str;
        String str2;
        String str3;
        x.f(nVar, "<this>");
        p pVarE = nVar.e();
        x.f(pVarE, "<this>");
        String strC = pVarE.c().c();
        if (strC == null) {
            strC = "";
        }
        String str4 = strC;
        com.waze.shared_infra.h.c cVarD = pVarE.d();
        com.waze.av.a.a aVarB = pVarE.b();
        String strB = pVarE.c().b();
        if (strB != null) {
            String str5 = strB;
            if (str5.length() == 0) {
                str5 = null;
            }
            str = str5;
        } else {
            str = null;
        }
        String strF = pVarE.c().f();
        if (strF != null) {
            String str6 = strF;
            if (str6.length() == 0) {
                str6 = null;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        String strE = pVarE.c().e();
        if (strE != null) {
            String str7 = strE;
            if (str7.length() == 0) {
                str7 = null;
            }
            str3 = str7;
        } else {
            str3 = null;
        }
        String strD = pVarE.c().d();
        if (strD != null) {
            String str8 = strD;
            str = str8.length() != 0 ? str8 : null;
        }
        String str9 = str;
        Boolean boolA = pVarE.c().a();
        return new k(str4, cVarD, aVarB, null, str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, boolA != null ? boolA.booleanValue() : false, str9, null, null, false, null, false, -120, 505);
    }

    public static k h(ed edVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        u uVar;
        u uVar2;
        String str8;
        com.waze.av.d.q qVar;
        List list;
        ArrayList arrayList;
        String strA;
        ArrayList arrayListH;
        List listH;
        String str9;
        String str10;
        Iterator it;
        String str11;
        u uVar3;
        String str12;
        String str13 = "<this>";
        x.f(edVar, "<this>");
        String strS = edVar.s();
        if (strS != null && strS.length() == 0) {
            h.j("toVenueExtendedData - got venue data without valid id");
            return null;
        }
        String strS2 = edVar.s();
        x.e(strS2, "getId(...)");
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(edVar.g().getLatitude(), edVar.g().getLongitude());
        com.waze.av.a.a aVar = new com.waze.av.a.a(edVar.p(), edVar.n(), edVar.z(), edVar.r(), edVar.y(), null, null, 96);
        String strO = edVar.o();
        if (strO != null) {
            String str14 = strO;
            if (str14.length() == 0) {
                str14 = null;
            }
            str = str14;
        } else {
            str = null;
        }
        String strU = edVar.u();
        if (strU != null) {
            String str15 = strU;
            if (str15.length() == 0) {
                str15 = null;
            }
            str2 = str15;
        } else {
            str2 = null;
        }
        String strX = edVar.x();
        if (strX != null) {
            String str16 = strX;
            if (str16.length() == 0) {
                str16 = null;
            }
            str3 = str16;
        } else {
            str3 = null;
        }
        String strT = edVar.t();
        if (strT != null) {
            String str17 = strT;
            if (str17.length() == 0) {
                str17 = null;
            }
            str4 = str17;
        } else {
            str4 = null;
        }
        String strQ = edVar.q();
        if (strQ != null) {
            String str18 = strQ;
            if (str18.length() == 0) {
                str18 = null;
            }
            str5 = str18;
        } else {
            str5 = null;
        }
        String strC = edVar.C();
        if (strC != null) {
            String str19 = strC;
            if (str19.length() == 0) {
                str19 = null;
            }
            str6 = str19;
        } else {
            str6 = null;
        }
        String strD = edVar.D();
        if (strD != null) {
            String str20 = strD;
            if (str20.length() == 0) {
                str20 = null;
            }
            str7 = str20;
        } else {
            str7 = null;
        }
        String strW = edVar.w();
        if (strW == null || strW.length() == 0) {
            uVar = null;
        } else {
            String strW2 = edVar.w();
            x.e(strW2, "getReporterName(...)");
            uVar = new u(strW2, edVar.v());
        }
        String strB = edVar.B();
        if (strB == null || strB.length() == 0) {
            uVar2 = null;
        } else {
            String strB2 = edVar.B();
            x.e(strB2, "getUpdaterName(...)");
            uVar2 = new u(strB2, edVar.A());
        }
        List listF = edVar.F();
        x.e(listF, "getImages(...)");
        List list2 = listF;
        ArrayList arrayList2 = new ArrayList(i.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            VenueImage venueImage = (VenueImage) it2.next();
            x.c(venueImage);
            x.f(venueImage, "<this>");
            String url = venueImage.getUrl();
            x.e(url, "getUrl(...)");
            String thumbnailUrl = venueImage.getThumbnailUrl();
            if (thumbnailUrl != null) {
                String str21 = thumbnailUrl;
                if (str21.length() == 0) {
                    str21 = null;
                }
                str10 = str21;
            } else {
                str10 = null;
            }
            if (venueImage.hasReporter()) {
                Reporter reporter = venueImage.getReporter();
                it = it2;
                x.e(reporter, "getReporter(...)");
                if (reporter.hasName()) {
                    String name = reporter.getName();
                    x.e(name, "getName(...)");
                    if (name.length() > 0) {
                        String name2 = reporter.getName();
                        x.e(name2, "getName(...)");
                        String mood = reporter.getMood();
                        if (mood != null) {
                            String str22 = mood;
                            if (str22.length() == 0) {
                                str22 = null;
                            }
                            str12 = str22;
                        } else {
                            str12 = null;
                        }
                        str11 = strS2;
                        uVar3 = new u(name2, str12);
                    }
                }
                arrayList2.add(new com.waze.av.d.o(url, str10, uVar3, false));
                it2 = it;
                strS2 = str11;
            } else {
                it = it2;
            }
            str11 = strS2;
            uVar3 = null;
            arrayList2.add(new com.waze.av.d.o(url, str10, uVar3, false));
            it2 = it;
            strS2 = str11;
        }
        String str23 = strS2;
        ArrayList arrayList3 = arrayList2;
        List listH2 = edVar.H();
        x.e(listH2, "getProducts(...)");
        List list3 = listH2;
        ArrayList arrayList4 = new ArrayList(i.q(list3, 10));
        for (Iterator it3 = list3.iterator(); it3.hasNext(); it3 = it3) {
            CandidateProduct candidateProduct = (CandidateProduct) it3.next();
            x.c(candidateProduct);
            x.f(candidateProduct, str13);
            String id = candidateProduct.getId();
            if (id.length() == 0) {
                id = "";
            }
            x.e(id, "ifEmpty(...)");
            String str24 = id;
            Float fValueOf = candidateProduct.hasPrice() ? Float.valueOf(candidateProduct.getPrice()) : null;
            String str25 = str13;
            Long lValueOf = Long.valueOf(candidateProduct.getLastUpdated());
            String updatedBy = candidateProduct.getUpdatedBy();
            if (updatedBy != null) {
                String str26 = updatedBy;
                if (str26.length() == 0) {
                    str26 = null;
                }
                str9 = str26;
            } else {
                str9 = null;
            }
            arrayList4.add(new s(str24, fValueOf, lValueOf, str9));
            str13 = str25;
        }
        ArrayList arrayList5 = arrayList4;
        List listG = edVar.G();
        x.e(listG, "getOpeningHours(...)");
        com.waze.av.d.q qVarJ = j(listG);
        String strM = edVar.m();
        if (strM != null) {
            String str27 = strM;
            if (str27.length() == 0) {
                str27 = null;
            }
            str8 = str27;
        } else {
            str8 = null;
        }
        List listE = edVar.E();
        x.e(listE, "getCategories(...)");
        List listAo = i.ao(listE);
        List listI = edVar.I();
        x.e(listI, "getServices(...)");
        List listAo2 = i.ao(listI);
        com.waze.ev.a aVarF = edVar.f();
        if (aVarF != null) {
            List listB = aVarF.b();
            ArrayList arrayList6 = new ArrayList(i.q(listB, 10));
            for (Iterator it4 = listB.iterator(); it4.hasNext(); it4 = it4) {
                com.waze.ev.c cVar2 = (com.waze.ev.c) it4.next();
                arrayList6.add(new f(cVar2.d(), cVar2.b(), cVar2.a(), null));
                qVarJ = qVarJ;
                listAo = listAo;
                arrayList5 = arrayList5;
            }
            qVar = qVarJ;
            list = listAo;
            arrayList = arrayList5;
            strA = null;
            arrayListH = arrayList6;
        } else {
            qVar = qVarJ;
            list = listAo;
            arrayList = arrayList5;
            strA = null;
            arrayListH = i.h();
        }
        com.waze.ev.a aVarF2 = edVar.f();
        boolean zD = aVarF2 != null ? aVarF2.d() : false;
        com.waze.ev.a aVarF3 = edVar.f();
        if (aVarF3 != null) {
            strA = aVarF3.a();
        }
        String str28 = strA;
        com.waze.ev.a aVarF4 = edVar.f();
        if (aVarF4 == null || (listH = aVarF4.c()) == null) {
            listH = i.h();
        }
        return new k(str23, cVar, aVar, null, str, str3, str4, str5, str2, str6, str7, uVar, uVar2, arrayList3, arrayList, qVar, str8, list, null, listAo2, arrayListH, zD, str28, listH, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, -16515064, 511);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.av.d.p i(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "substring(...)"
            r1 = 6
            r2 = 58
            r3 = 0
            if (r8 == 0) goto L24
            r4 = r8
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = h.n.o.W(r4, r2, r3, r1)
            java.lang.String r4 = r8.substring(r3, r4)
            h.g.b.x.e(r4, r0)
            if (r4 == 0) goto L24
            java.lang.Integer r4 = h.n.o.f(r4)
            if (r4 == 0) goto L24
            int r4 = r4.intValue()
            goto L25
        L24:
            r4 = r3
        L25:
            if (r8 == 0) goto L44
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = h.n.o.W(r5, r2, r3, r1)
            int r5 = r5 + 1
            java.lang.String r8 = r8.substring(r5)
            h.g.b.x.e(r8, r0)
            if (r8 == 0) goto L44
            java.lang.Integer r8 = h.n.o.f(r8)
            if (r8 == 0) goto L44
            int r8 = r8.intValue()
            goto L45
        L44:
            r8 = r3
        L45:
            r5 = 24
            if (r9 == 0) goto L6f
            r6 = r9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = h.n.o.W(r6, r2, r3, r1)
            java.lang.String r6 = r9.substring(r3, r6)
            h.g.b.x.e(r6, r0)
            if (r6 == 0) goto L6f
            java.lang.Integer r6 = h.n.o.f(r6)
            if (r6 == 0) goto L6f
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L69
            r6 = 0
        L69:
            if (r6 == 0) goto L6f
            int r5 = r6.intValue()
        L6f:
            if (r9 == 0) goto L8d
            r6 = r9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r1 = h.n.o.W(r6, r2, r3, r1)
            int r1 = r1 + 1
            java.lang.String r9 = r9.substring(r1)
            h.g.b.x.e(r9, r0)
            if (r9 == 0) goto L8d
            java.lang.Integer r9 = h.n.o.f(r9)
            if (r9 == 0) goto L8d
            int r3 = r9.intValue()
        L8d:
            com.waze.av.d.p r9 = new com.waze.av.d.p
            r9.<init>(r4, r8, r5, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ad.c.b.i(java.lang.String, java.lang.String):com.waze.av.d.p");
    }

    public static com.waze.av.d.q j(List list) {
        String to;
        x.f(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<OpeningHours> arrayList = new ArrayList();
        for (Object obj : list) {
            OpeningHours openingHours = (OpeningHours) obj;
            String from = openingHours.getFrom();
            if (from != null && from.length() != 0 && (to = openingHours.getTo()) != null && to.length() != 0) {
                arrayList.add(obj);
            }
        }
        for (OpeningHours openingHours2 : arrayList) {
            List<Integer> daysList = openingHours2.getDaysList();
            x.e(daysList, "getDaysList(...)");
            int i2 = 0;
            for (Object obj2 : daysList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i.p();
                }
                Integer num = (Integer) obj2;
                if (num == null || num.intValue() != 0) {
                    Parcelable.Creator<e> creator = e.CREATOR;
                    e eVarQ = q(i2);
                    if (linkedHashMap.get(eVarQ) == null) {
                        linkedHashMap.put(eVarQ, new ArrayList());
                    }
                    List list2 = (List) linkedHashMap.get(eVarQ);
                    if (list2 != null) {
                        list2.add(i(openingHours2.getFrom(), openingHours2.getTo()));
                    }
                }
                i2 = i3;
            }
        }
        return new com.waze.av.d.q(linkedHashMap);
    }

    public static String k(com.waze.av.d.b bVar) {
        x.f(bVar, "<this>");
        String strD = com.waze.shared_infra.q.m.d((bVar.b() != null ? r2.longValue() : 0L) + (bVar.a() != null ? r0.intValue() / 1.0E9d : AudioStats.AUDIO_AMPLITUDE_NONE), bVar.c());
        x.e(strD, "getCurrencyString(...)");
        return strD;
    }

    public static String l(com.waze.av.d.c cVar, boolean z) {
        x.f(cVar, "<this>");
        com.waze.av.d.b bVarB = cVar.b();
        return (!z || bVarB == null) ? k(cVar.c()) : k(bVarB);
    }

    public static boolean m(com.waze.av.d.a aVar) {
        x.f(aVar, "<this>");
        List listB = aVar.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            return false;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (((com.waze.av.d.c) it.next()).b() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(com.waze.av.d.q qVar) {
        x.f(qVar, "<this>");
        return qVar.a().isEmpty();
    }

    public static e p(int i2) {
        return e.values()[i2 - 1];
    }

    public static e q(int i2) {
        return e.values()[i2];
    }

    public static boolean r(String str, String str2) {
        return x.n(str, "CHARGING_STATION") || x.n(str2, "charging_station");
    }

    public static boolean s(String str, String str2) {
        return x.n(str, "GAS_STATION") || x.n(str2, "gas_station");
    }

    public static boolean t(String str, String str2) {
        return x.n(str, "PARKING_LOT") || x.n(str2, "parking");
    }

    public static String u() {
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        return string;
    }

    public final PerformanceTraces c() {
        byte[] activeWazeMapInstancePerformanceTracesNTV = ((ActiveMapPerformanceTracesProviderNativeManager) this).getActiveWazeMapInstancePerformanceTracesNTV();
        if (activeWazeMapInstancePerformanceTracesNTV != null) {
            try {
                return (PerformanceTraces) PerformanceTraces.parser().c(activeWazeMapInstancePerformanceTracesNTV);
            } catch (eu unused) {
            }
        }
        return null;
    }
}

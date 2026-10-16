package com.waze.z.a;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.waze.search.h.cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private final Object f45637a;

    public al(AnchoredDraggableState anchoredDraggableState) {
        h.g.b.x.f(anchoredDraggableState, "anchoredDraggableState");
        this.f45637a = anchoredDraggableState;
    }

    public final AnchoredDraggableState a() {
        return (AnchoredDraggableState) this.f45637a;
    }

    public final ae b() {
        return (ae) ((AnchoredDraggableState) this.f45637a).getCurrentValue();
    }

    public final ae c() {
        return (ae) ((AnchoredDraggableState) this.f45637a).getTargetValue();
    }

    public final Object d(h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default((AnchoredDraggableState) this.f45637a, ae.f45619a, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    public final Object e(h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default((AnchoredDraggableState) this.f45637a, ae.f45619a, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    public final Object f(h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default((AnchoredDraggableState) this.f45637a, ae.f45620b, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [h.g.a.l, java.lang.Object] */
    public final List g(String str, List list) {
        boolean z;
        List listH;
        List listH2;
        List listH3;
        boolean z2;
        String str2 = str;
        h.g.b.x.f(str2, "searchTerm");
        h.g.b.x.f(list, "autoCompletePlaces");
        if (list.isEmpty()) {
            return h.a.i.h();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            com.waze.w.i iVar = (com.waze.w.i) obj;
            if ((iVar instanceof com.waze.w.h) && ((com.waze.w.h) iVar).c() == com.waze.w.g.f45429b) {
                arrayList.add(obj);
            }
        }
        ArrayList<com.waze.w.i> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        for (com.waze.w.i iVar2 : arrayList2) {
            h.g.b.x.d(iVar2, "null cannot be cast to non-null type com.waze.datasource.AutoCompletePlace.GenericAutoCompletePlace");
            arrayList3.add((com.waze.w.h) iVar2);
        }
        Set setAu = h.a.i.au(arrayList3);
        List listAd = h.a.i.ad(list2, setAu);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : setAu) {
            com.waze.w.h hVar = (com.waze.w.h) obj2;
            ?? r9 = this.f45637a;
            com.waze.av.a.a aVarB = hVar.b().b();
            List listJ = new h.n.l("\\s+").j(str2);
            if (listJ.isEmpty()) {
                listH = h.a.i.h();
            } else {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listH = h.a.i.am(listJ, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listH = h.a.i.h();
            }
            String[] strArr = (String[]) listH.toArray(new String[0]);
            ArrayList arrayList5 = new ArrayList();
            String str3 = (String) r9.invoke(cd.d(hVar.d(), null));
            String str4 = (String) r9.invoke(cd.c(hVar.d()));
            List listJ2 = new h.n.l("\\s+").j(str3);
            if (listJ2.isEmpty()) {
                listH2 = h.a.i.h();
            } else {
                ListIterator listIterator2 = listJ2.listIterator(listJ2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listH2 = h.a.i.am(listJ2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                listH2 = h.a.i.h();
            }
            String[] strArr2 = (String[]) listH2.toArray(new String[0]);
            List listR = h.a.c.R(new String[]{aVarB.a(), aVarB.b(), aVarB.g(), aVarB.e(), aVarB.c(), aVarB.f()});
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : listR) {
                if (((String) obj3).length() > 0) {
                    arrayList6.add(obj3);
                }
            }
            ArrayList<String> arrayList7 = arrayList6;
            List listJ3 = new h.n.l("\\s+").j(str4);
            if (listJ3.isEmpty()) {
                listH3 = h.a.i.h();
            } else {
                ListIterator listIterator3 = listJ3.listIterator(listJ3.size());
                while (listIterator3.hasPrevious()) {
                    if (((String) listIterator3.previous()).length() != 0) {
                        listH3 = h.a.i.am(listJ3, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
                listH3 = h.a.i.h();
            }
            String[] strArr3 = (String[]) listH3.toArray(new String[0]);
            for (String str5 : strArr2) {
                Locale locale = Locale.getDefault();
                h.g.b.x.e(locale, "getDefault(...)");
                String lowerCase = str5.toLowerCase(locale);
                h.g.b.x.e(lowerCase, "toLowerCase(...)");
                arrayList5.add(lowerCase);
            }
            for (String str6 : arrayList7) {
                Locale locale2 = Locale.getDefault();
                h.g.b.x.e(locale2, "getDefault(...)");
                String lowerCase2 = str6.toLowerCase(locale2);
                h.g.b.x.e(lowerCase2, "toLowerCase(...)");
                arrayList5.add(lowerCase2);
            }
            for (String str7 : strArr3) {
                Locale locale3 = Locale.getDefault();
                h.g.b.x.e(locale3, "getDefault(...)");
                String lowerCase3 = str7.toLowerCase(locale3);
                h.g.b.x.e(lowerCase3, "toLowerCase(...)");
                arrayList5.add(lowerCase3);
            }
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    arrayList4.add(obj2);
                    break;
                }
                String str8 = strArr[i2];
                Iterator it = arrayList5.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        i3 = 0;
                        break;
                    }
                    String str9 = (String) it.next();
                    Locale locale4 = Locale.getDefault();
                    h.g.b.x.e(locale4, "getDefault(...)");
                    String lowerCase4 = str8.toLowerCase(locale4);
                    h.g.b.x.e(lowerCase4, "toLowerCase(...)");
                    if (h.n.o.ah(str9, lowerCase4)) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                if (z2) {
                    i2++;
                }
            }
            str2 = str;
        }
        ArrayList arrayList8 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        for (Object obj4 : arrayList4) {
            com.waze.av.b.n nVarD = ((com.waze.w.h) obj4).d();
            if (nVarD instanceof com.waze.av.b.k) {
                int i6 = i4 + 1;
                if (i4 < 2) {
                    i4 = i6;
                    z = true;
                } else {
                    i4 = i6;
                    z = false;
                }
            } else {
                if (nVarD instanceof com.waze.av.b.l) {
                    int i7 = i5 + 1;
                    if (i5 < 2) {
                        i5 = i7;
                    } else {
                        i5 = i7;
                        z = false;
                    }
                }
                z = true;
            }
            if (!z) {
                break;
            }
            arrayList8.add(obj4);
        }
        return h.a.i.af(h.a.i.ao(arrayList8), listAd);
    }

    public /* synthetic */ al(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "resString");
        this.f45637a = lVar;
    }
}

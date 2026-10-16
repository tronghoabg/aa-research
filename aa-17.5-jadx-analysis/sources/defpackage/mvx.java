package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class mvx implements ctw {
    final /* synthetic */ float a;
    final /* synthetic */ atc b;
    final /* synthetic */ cfm c;

    public mvx(float f, atc atcVar, cfm cfmVar) {
        this.a = f;
        this.b = atcVar;
        this.c = cfmVar;
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return tr.m(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return tr.n(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return tr.o(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return tr.p(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final ctq e(final cts ctsVar, List list, long j) {
        ctsVar.getClass();
        List list2 = (List) list.get(0);
        if (list2.isEmpty()) {
            return ctsVar.eK(dle.b(j), dle.a(j), afbf.a, new mtw(6));
        }
        cto ctoVar = (cto) woy.bF(list2);
        List listBR = woy.bR(list2, 1);
        ArrayList arrayList = new ArrayList(woy.bp(listBR, 10));
        Iterator it = listBR.iterator();
        while (it.hasNext()) {
            long j2 = j;
            arrayList.add(((cto) it.next()).v(dle.m(j2, 0, 0, 0, 0, 10)));
            j = j2;
        }
        final long j3 = j;
        int iE = ctoVar.e(0);
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((cuo) it2.next()).b;
        }
        final List listBY = woy.bY(woy.bg(ctoVar.v(dle.m(j3, 0, 0, 0, iE + afgi.k(afpt.e(dle.a(j3) - (i + iE), 0) * this.a), 2))), arrayList);
        int iB = dle.b(j3);
        int iA = dle.a(j3);
        final cfm cfmVar = this.c;
        return ctsVar.eK(iB, iA, afbf.a, new afec() { // from class: mvw
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                cun cunVar = (cun) obj;
                cunVar.getClass();
                List<cuo> list3 = listBY;
                int[] iArr = new int[list3.size()];
                ArrayList arrayList2 = new ArrayList(woy.bp(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((cuo) it3.next()).b));
                }
                long j4 = j3;
                int i2 = 0;
                atd.a(dle.a(j4), woy.cp(arrayList2), iArr, false);
                for (cuo cuoVar : list3) {
                    cts ctsVar2 = ctsVar;
                    cfm cfmVar2 = cfmVar;
                    cunVar.r(cuoVar, cfmVar2.a(cuoVar.a, dle.b(j4), ctsVar2.p()), iArr[i2], BitmapDescriptorFactory.HUE_RED);
                    i2++;
                }
                return afak.a;
            }
        });
    }
}

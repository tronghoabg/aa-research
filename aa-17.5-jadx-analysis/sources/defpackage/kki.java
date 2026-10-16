package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class kki implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ kki(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) throws IOException {
        yzy yzyVarB;
        yyv yyvVarB;
        int i = 10;
        int i2 = 1;
        switch (this.a) {
            case 0:
                kkf kkfVar = (kkf) obj;
                kkfVar.getClass();
                if (kkfVar instanceof kkc) {
                    return ((kkc) kkfVar).a;
                }
                return null;
            case 1:
                yph yphVar = khx.a;
                Stream streamFlatMap = Collection.EL.stream(((Map) obj).values()).flatMap(new koj(i2));
                int i3 = yfq.d;
                return (List) streamFlatMap.collect(ycm.a);
            case 2:
                List list = (List) obj;
                int i4 = kkz.a;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof kji) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                int i5 = kkz.a;
                if (iIntValue == 1) {
                    return "Compact UI";
                }
                return "Unknown Metadata " + iIntValue;
            case 4:
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof kji) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((kji) it.next()).a);
                }
                return arrayList3;
            case 5:
                List list3 = (List) obj;
                list3.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list3) {
                    if (obj4 instanceof kjk) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 6:
                cho choVar = (cho) obj;
                choVar.getClass();
                choVar.a();
                return afak.a;
            case 7:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.g(new kki(6));
                return afak.a;
            case 8:
                rrm rrmVar = (rrm) obj;
                rrmVar.getClass();
                rrj rrjVar = rrmVar.c;
                if (rrjVar == null) {
                    rrjVar = rrj.a;
                }
                String str = rrjVar.c;
                str.getClass();
                return str;
            case 9:
                abqy abqyVar = (abqy) obj;
                abqyVar.getClass();
                return "{" + juw.f(abqyVar) + "}";
            case 10:
                abrb abrbVar = (abrb) obj;
                return abrbVar.b + "/" + abrbVar.c;
            case 11:
                abrb abrbVar2 = (abrb) obj;
                return abrbVar2.b + "/" + abrbVar2.c;
            case 12:
                abre abreVar = (abre) obj;
                abreVar.getClass();
                String strCu = woy.cu(new abof(abreVar.d, abre.a), null, "[", "]", new kki(16), 25);
                abqy abqyVar2 = abreVar.c;
                if (abqyVar2 == null) {
                    abqyVar2 = abqy.a;
                }
                abqyVar2.getClass();
                return a.bq("Display Type: " + strCu + ", " + juw.f(abqyVar2), "{", "}");
            case 13:
                abqy abqyVar3 = (abqy) obj;
                abqyVar3.getClass();
                return "{" + juw.f(abqyVar3) + "}";
            case 14:
                abrp abrpVar = (abrp) obj;
                int i6 = abrpVar.b;
                int iAd = wox.ad(i6);
                if (iAd == 0) {
                    throw null;
                }
                int i7 = iAd - 1;
                if (i7 != 0) {
                    if (i7 != 1) {
                        return "unknown trigger";
                    }
                    if (i6 != 2 || (yyvVarB = yyv.b(((Integer) abrpVar.c).intValue())) == null) {
                        yyvVarB = yyv.UNKNOWN_ACTION;
                    }
                    return "NonUiAction ".concat(String.valueOf(yyvVarB.name()));
                }
                if (i6 == 1) {
                    yzyVarB = yzy.b(((Integer) abrpVar.c).intValue());
                    if (yzyVarB == null) {
                        yzyVarB = yzy.sm;
                    }
                } else {
                    yzyVarB = yzy.a;
                }
                return "UiAction ".concat(yzyVarB.sn);
            case 15:
                aboh abohVar = ((abrm) obj).b;
                abohVar.getClass();
                return woy.cu(abohVar, null, null, null, new kki(11), 31);
            case 16:
                return ((abrg) obj).name();
            case 17:
                rrh rrhVar = (rrh) obj;
                rrhVar.getClass();
                return a.bq("Make: " + rrhVar.c + ", Model: " + rrhVar.d + ", Year: " + rrhVar.e + ", HU Make: " + rrhVar.h + ", HU Model: " + rrhVar.f + ", Exclude: " + rrhVar.g, "{", "}");
            case 18:
                abrj abrjVar = (abrj) obj;
                aboh abohVar2 = abrjVar.b;
                abohVar2.getClass();
                String strCu2 = woy.cu(abohVar2, null, null, null, null, 63);
                aboh abohVar3 = abrjVar.c;
                abohVar3.getClass();
                return "Manufacturers: " + strCu2 + ", Widgets: " + woy.cu(abohVar3, null, "[", "]", new kki(15), 25);
            case 19:
                aboh abohVar4 = ((abrm) obj).b;
                abohVar4.getClass();
                return woy.cu(abohVar4, null, null, null, new kki(i), 31);
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                Object value = entry.getValue();
                value.getClass();
                return "{" + key + ": " + juw.u((adcg) value) + "}";
        }
    }
}

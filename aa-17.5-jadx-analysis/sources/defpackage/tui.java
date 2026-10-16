package defpackage;

import android.content.ComponentName;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class tui implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ tui(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        int iIntValue2;
        switch (this.a) {
            case 0:
                int iA = ((tuj) obj).a();
                tmo.t(iA);
                int iA2 = ((tuj) obj2).a();
                tmo.t(iA2);
                return -Integer.compare(iA, iA2);
            case 1:
                return Long.compare(((acao) obj).c, ((acao) obj2).c);
            case 2:
                uma umaVar = (uma) obj;
                uma umaVar2 = (uma) obj2;
                utf utfVar = umaVar2.d;
                int[] iArr = twm.a;
                yde ydeVar = yde.b;
                int iOrdinal = utfVar.c().ordinal();
                utf utfVar2 = umaVar.d;
                return ydeVar.c(iOrdinal, utfVar2.c().ordinal()).c(utfVar.b(), utfVar2.b()).e(umaVar2.E(), umaVar.E()).c(System.identityHashCode(umaVar2), System.identityHashCode(umaVar)).a();
            case 3:
                return Integer.compare(((tqr) obj).a(), ((tqr) obj2).a());
            case 4:
                return ((udx) obj).t().compareTo(((udx) obj2).t());
            case 5:
                abao abaoVar = (abao) obj;
                abao abaoVar2 = (abao) obj2;
                return yde.b.c(abaoVar.b, abaoVar2.b).c(abaoVar.c, abaoVar2.c).a();
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Integer num = (Integer) entry.getValue();
                Integer num2 = (Integer) entry2.getValue();
                return !num.equals(num2) ? num.intValue() - num2.intValue() : ((Integer) entry.getKey()).intValue() - ((Integer) entry2.getKey()).intValue();
            case 7:
                Map.Entry entry3 = (Map.Entry) obj;
                Map.Entry entry4 = (Map.Entry) obj2;
                Integer num3 = (Integer) entry3.getValue();
                Integer num4 = (Integer) entry4.getValue();
                if (num3.equals(num4)) {
                    iIntValue = ((Integer) entry3.getKey()).intValue();
                    iIntValue2 = ((Integer) entry4.getKey()).intValue();
                } else {
                    iIntValue2 = num4.intValue();
                    iIntValue = num3.intValue();
                }
                return iIntValue2 - iIntValue;
            case 8:
                acjs acjsVar = (acjs) ((Map.Entry) obj).getValue();
                acjs acjsVar2 = (acjs) ((Map.Entry) obj2).getValue();
                yde ydeVar2 = yde.b;
                Object obj3 = acjsVar.b;
                Object obj4 = acjsVar2.b;
                yde ydeVarE = ydeVar2.e(null, null);
                int i = acjsVar.a;
                int i2 = acjsVar2.a;
                return ydeVarE.c(0, 0).a();
            case 9:
                return Long.compare(((vpl) ((acjs) obj).b).a, ((vpl) ((acjs) obj2).b).a);
            case 10:
                return ((mqz) obj).compareTo((mqz) obj2);
            case 11:
                mqz mqzVar = (mqz) obj;
                mqz mqzVar2 = (mqz) obj2;
                if (nrz.e().i()) {
                    int iB = nrz.e().b(mqzVar.c.a());
                    int iB2 = nrz.e().b(mqzVar2.c.a());
                    if (iB != Integer.MAX_VALUE || iB2 != Integer.MAX_VALUE) {
                        return iB < iB2 ? -1 : 1;
                    }
                }
                mqc mqcVar = mqzVar.c;
                ComponentName componentName = mkn.e;
                if (componentName.equals(mqcVar.a())) {
                    return -1;
                }
                if (componentName.equals(mqzVar2.c.a())) {
                    return 1;
                }
                mqt mqtVar = new mqt(mki.a.c);
                if (mqtVar.equals(mqzVar)) {
                    return 1;
                }
                if (mqtVar.equals(mqzVar2)) {
                    return -1;
                }
                return mqzVar.compareTo(mqzVar2);
            case 12:
                return affa.x(Integer.valueOf(((xqp) ((Map.Entry) obj).getKey()).f), Integer.valueOf(((xqp) ((Map.Entry) obj2).getKey()).f));
            case 13:
                zwv zwvVar = (zwv) obj;
                zwv zwvVar2 = (zwv) obj2;
                String str = zwz.a;
                return zwvVar.getZIndex() == zwvVar2.getZIndex() ? Long.compare(zwvVar.f, zwvVar2.f) : Float.compare(zwvVar.getZIndex(), zwvVar2.getZIndex());
            case 14:
                aaci aaciVar = (aaci) obj;
                aaci aaciVar2 = (aaci) obj2;
                int i3 = aaco.o;
                float zIndex = aaciVar.i().getZIndex();
                float zIndex2 = aaciVar2.i().getZIndex();
                if (zIndex != zIndex2) {
                    return Float.compare(zIndex2, zIndex);
                }
                int iH = aaciVar.h();
                int iH2 = aaciVar2.h();
                return iH != iH2 ? iH2 - iH : Integer.parseInt(aaciVar2.i().a.substring(1)) - Integer.parseInt(aaciVar.i().a.substring(1));
            case 15:
                return ((aacw) obj2).e.compareTo(((aacw) obj).e);
            case 16:
                aacw aacwVar = (aacw) obj;
                aacw aacwVar2 = (aacw) obj2;
                int iCompare = Integer.compare(aacwVar2.f, aacwVar.f);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(aacwVar.g, aacwVar2.g);
                return iCompare2 != 0 ? iCompare2 : aacwVar2.e.compareTo(aacwVar.e);
            default:
                return affa.x(((ajop) obj).a, ((ajop) obj2).a);
        }
    }
}

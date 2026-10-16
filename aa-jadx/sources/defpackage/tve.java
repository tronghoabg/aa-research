package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tve implements java.util.Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ tve(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int iIntValue;
        int iIntValue2;
        switch (this.a) {
            case 0:
                int iA = ((defpackage.tvf) obj).a();
                defpackage.tnm.w(iA);
                int iA2 = ((defpackage.tvf) obj2).a();
                defpackage.tnm.w(iA2);
                return -java.lang.Integer.compare(iA, iA2);
            case 1:
                return java.lang.Long.compare(((defpackage.acbq) obj).c, ((defpackage.acbq) obj2).c);
            case 2:
                defpackage.umw umwVar = (defpackage.umw) obj;
                defpackage.umw umwVar2 = (defpackage.umw) obj2;
                defpackage.uub uubVar = umwVar2.d;
                int[] iArr = defpackage.txj.a;
                defpackage.yek yekVar = defpackage.yek.b;
                int iOrdinal = uubVar.c().ordinal();
                defpackage.uub uubVar2 = umwVar.d;
                return yekVar.c(iOrdinal, uubVar2.c().ordinal()).c(uubVar.b(), uubVar2.b()).e(umwVar2.E(), umwVar.E()).c(java.lang.System.identityHashCode(umwVar2), java.lang.System.identityHashCode(umwVar)).a();
            case 3:
                return java.lang.Integer.compare(((defpackage.trp) obj).a(), ((defpackage.trp) obj2).a());
            case 4:
                return ((defpackage.ueu) obj).t().compareTo(((defpackage.ueu) obj2).t());
            case 5:
                defpackage.abbr abbrVar = (defpackage.abbr) obj;
                defpackage.abbr abbrVar2 = (defpackage.abbr) obj2;
                return defpackage.yek.b.c(abbrVar.b, abbrVar2.b).c(abbrVar.c, abbrVar2.c).a();
            case 6:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
                java.lang.Integer num = (java.lang.Integer) entry.getValue();
                java.lang.Integer num2 = (java.lang.Integer) entry2.getValue();
                return !num.equals(num2) ? num.intValue() - num2.intValue() : ((java.lang.Integer) entry.getKey()).intValue() - ((java.lang.Integer) entry2.getKey()).intValue();
            case 7:
                java.util.Map.Entry entry3 = (java.util.Map.Entry) obj;
                java.util.Map.Entry entry4 = (java.util.Map.Entry) obj2;
                java.lang.Integer num3 = (java.lang.Integer) entry3.getValue();
                java.lang.Integer num4 = (java.lang.Integer) entry4.getValue();
                if (num3.equals(num4)) {
                    iIntValue = ((java.lang.Integer) entry3.getKey()).intValue();
                    iIntValue2 = ((java.lang.Integer) entry4.getKey()).intValue();
                } else {
                    iIntValue2 = num4.intValue();
                    iIntValue = num3.intValue();
                }
                return iIntValue2 - iIntValue;
            case 8:
                defpackage.acku ackuVar = (defpackage.acku) ((java.util.Map.Entry) obj).getValue();
                defpackage.acku ackuVar2 = (defpackage.acku) ((java.util.Map.Entry) obj2).getValue();
                defpackage.yek yekVar2 = defpackage.yek.b;
                java.lang.Object obj3 = ackuVar.b;
                java.lang.Object obj4 = ackuVar2.b;
                defpackage.yek yekVarE = yekVar2.e(null, null);
                int i = ackuVar.a;
                int i2 = ackuVar2.a;
                return yekVarE.c(0, 0).a();
            case 9:
                return java.lang.Long.compare(((defpackage.vqh) ((defpackage.acku) obj).b).a, ((defpackage.vqh) ((defpackage.acku) obj2).b).a);
            case 10:
                return ((defpackage.mrd) obj).compareTo((defpackage.mrd) obj2);
            case 11:
                defpackage.mrd mrdVar = (defpackage.mrd) obj;
                defpackage.mrd mrdVar2 = (defpackage.mrd) obj2;
                if (defpackage.nsn.e().i()) {
                    int iB = defpackage.nsn.e().b(mrdVar.c.a());
                    int iB2 = defpackage.nsn.e().b(mrdVar2.c.a());
                    if (iB != Integer.MAX_VALUE || iB2 != Integer.MAX_VALUE) {
                        return iB < iB2 ? -1 : 1;
                    }
                }
                defpackage.mqj mqjVar = mrdVar.c;
                android.content.ComponentName componentName = defpackage.mkt.e;
                if (componentName.equals(mqjVar.a())) {
                    return -1;
                }
                if (componentName.equals(mrdVar2.c.a())) {
                    return 1;
                }
                defpackage.mqy mqyVar = new defpackage.mqy(defpackage.mkp.a.c);
                if (mqyVar.equals(mrdVar)) {
                    return 1;
                }
                if (mqyVar.equals(mrdVar2)) {
                    return -1;
                }
                return mrdVar.compareTo(mrdVar2);
            case 12:
                return defpackage.afga.x(java.lang.Integer.valueOf(((defpackage.xrq) ((java.util.Map.Entry) obj).getKey()).f), java.lang.Integer.valueOf(((defpackage.xrq) ((java.util.Map.Entry) obj2).getKey()).f));
            case 13:
                defpackage.zxy zxyVar = (defpackage.zxy) obj;
                defpackage.zxy zxyVar2 = (defpackage.zxy) obj2;
                java.lang.String str = defpackage.zyb.a;
                return zxyVar.getZIndex() == zxyVar2.getZIndex() ? java.lang.Long.compare(zxyVar.f, zxyVar2.f) : java.lang.Float.compare(zxyVar.getZIndex(), zxyVar2.getZIndex());
            case 14:
                defpackage.aadl aadlVar = (defpackage.aadl) obj;
                defpackage.aadl aadlVar2 = (defpackage.aadl) obj2;
                int i3 = defpackage.aadr.o;
                float zIndex = aadlVar.i().getZIndex();
                float zIndex2 = aadlVar2.i().getZIndex();
                if (zIndex != zIndex2) {
                    return java.lang.Float.compare(zIndex2, zIndex);
                }
                int iH = aadlVar.h();
                int iH2 = aadlVar2.h();
                return iH != iH2 ? iH2 - iH : java.lang.Integer.parseInt(aadlVar2.i().a.substring(1)) - java.lang.Integer.parseInt(aadlVar.i().a.substring(1));
            case 15:
                return ((defpackage.aady) obj2).e.compareTo(((defpackage.aady) obj).e);
            case 16:
                defpackage.aady aadyVar = (defpackage.aady) obj;
                defpackage.aady aadyVar2 = (defpackage.aady) obj2;
                int iCompare = java.lang.Integer.compare(aadyVar2.f, aadyVar.f);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = java.lang.Float.compare(aadyVar.g, aadyVar2.g);
                return iCompare2 != 0 ? iCompare2 : aadyVar2.e.compareTo(aadyVar.e);
            default:
                return defpackage.afga.x(((defpackage.ajpp) obj).a, ((defpackage.ajpp) obj2).a);
        }
    }
}

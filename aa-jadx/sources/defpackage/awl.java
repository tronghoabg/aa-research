package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class awl implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ awl(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = 1;
        switch (this.a) {
            case 0:
                return defpackage.afbk.a;
            case 1:
                return defpackage.afbk.a;
            case 2:
                return ((defpackage.awv) obj).m;
            case 3:
                return ((defpackage.awv) obj).h;
            case 4:
                ((java.lang.Integer) obj).intValue();
                return null;
            case 5:
                return defpackage.afbk.a;
            case 6:
                java.util.List list = (java.util.List) obj;
                return new defpackage.axx(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
            case 7:
                return defpackage.afbk.a;
            case 8:
                java.util.List list2 = (java.util.List) obj;
                return new defpackage.aye(((java.lang.Number) list2.get(0)).intValue(), ((java.lang.Number) list2.get(1)).intValue());
            case 9:
                java.util.List list3 = (java.util.List) obj;
                java.lang.Object obj2 = list3.get(0);
                obj2.getClass();
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                java.lang.Object obj3 = list3.get(1);
                obj3.getClass();
                return new defpackage.bau(iIntValue, ((java.lang.Float) obj3).floatValue(), new defpackage.bav(list3, i));
            case 10:
                return defpackage.afbk.a;
            case 11:
                defpackage.dej dejVar = defpackage.def.e;
                defpackage.afbk afbkVar = defpackage.afbk.a;
                ((defpackage.dek) obj).a(dejVar, afbkVar);
                return afbkVar;
            case 12:
                return defpackage.afbk.a;
            case 13:
                return defpackage.afbk.a;
            case 14:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                return l;
            case 15:
                return defpackage.afbk.a;
            case 16:
                return defpackage.afbk.a;
            case 17:
                return defpackage.afbk.a;
            case 18:
                ((java.lang.Integer) obj).intValue();
                return defpackage.bes.a;
            case 19:
                ((defpackage.bjw) obj).n();
                return defpackage.afbk.a;
            default:
                ((defpackage.bjw) obj).r();
                return defpackage.afbk.a;
        }
    }
}

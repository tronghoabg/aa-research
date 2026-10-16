package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class azq implements java.util.Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ azq(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.afga.b(((defpackage.axp) obj).a, ((defpackage.axp) obj2).a);
            case 1:
                int i = ((defpackage.abob) obj2).a;
                int i2 = ((defpackage.abob) obj).a;
                long j = defpackage.ayi.a;
                return defpackage.afga.b(i, i2);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.afga.b(((defpackage.bwk) obj).a, ((defpackage.bwk) obj2).a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cxl cxlVar = (defpackage.cxl) obj;
                defpackage.cxl cxlVar2 = (defpackage.cxl) obj2;
                return cxlVar.d() == cxlVar2.d() ? defpackage.afga.b(cxlVar.f(), cxlVar2.f()) : java.lang.Float.compare(cxlVar.d(), cxlVar2.d());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(((defpackage.dfa) obj).b).compareTo(java.lang.Integer.valueOf(((defpackage.dfa) obj2).b));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Integer.valueOf(((defpackage.dfa) obj).b).compareTo(java.lang.Integer.valueOf(((defpackage.dfa) obj2).b));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afia afiaVar = (defpackage.afia) obj;
                defpackage.afia afiaVar2 = (defpackage.afia) obj2;
                return (afiaVar.b - afiaVar.a) - (afiaVar2.b - afiaVar2.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.afga.x(((defpackage.dig) obj).a(), ((defpackage.dig) obj2).a());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.inh.a;
                defpackage.jhx jhxVarY = ((defpackage.jhl) obj).y();
                defpackage.jhx jhxVarY2 = ((defpackage.jhl) obj2).y();
                if (jhxVarY == null && jhxVarY2 == null) {
                    return 0;
                }
                if (jhxVarY == null) {
                    return -1;
                }
                if (jhxVarY2 == null) {
                    return 1;
                }
                return jhxVarY2.g - jhxVarY.g;
            case 9:
                return defpackage.afga.x(((nuv) obj2).c.a, ((nuv) obj).c.a);
            case 10:
                return new defpackage.afbh(((defpackage.tef) obj).e).compareTo(new defpackage.afbh(((defpackage.tef) obj2).e));
            case 11:
                ysx ysxVarA = ysx.a(obj);
                ysx ysxVarA2 = ysx.a(obj2);
                if (ysxVarA != ysxVarA2) {
                    return ysxVarA.compareTo(ysxVarA2);
                }
                int iOrdinal = ysxVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((java.lang.Boolean) obj).compareTo((java.lang.Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((java.lang.String) obj).compareTo((java.lang.String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((java.lang.Long) obj).compareTo((java.lang.Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((java.lang.Double) obj).compareTo((java.lang.Double) obj2);
                }
                throw null;
            default:
                return ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
        }
    }
}

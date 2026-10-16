package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ydm implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ydm(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ?? r8 = ((odn) obj).a;
                defpackage.ygr ygrVar = new defpackage.ygr(r8.size());
                ymu ymuVar = ymu.a;
                java.util.Collections.sort(r8, ymt.a);
                yiz yizVarAh = defpackage.ysr.ah(r8.iterator());
                while (yizVarAh.hasNext()) {
                    ymu ymuVar2 = (ymu) yizVarAh.next();
                    while (yizVarAh.hasNext()) {
                        ymu ymuVar3 = (ymu) yizVarAh.a();
                        yet yetVar = ymuVar2.b;
                        yet yetVar2 = ymuVar3.c;
                        defpackage.ysr.bg(((yetVar.a(ymuVar3.b) < 0 || ymuVar2.c.a(yetVar2) > 0) ? ymuVar3 : ymuVar2).b(), "Overlapping ranges not permitted but found %s overlapping %s", ymuVar2, ymuVar3);
                        ymu ymuVar4 = (ymu) yizVarAh.next();
                        yet yetVar3 = ymuVar4.b;
                        yet yetVar4 = ymuVar4.c;
                    }
                    ygrVar.i(ymuVar2);
                }
                defpackage.ygw ygwVarH = ygrVar.g();
                if (ygwVarH.isEmpty()) {
                    return yhu.a;
                }
                return (((defpackage.ymx) ygwVarH).c == 1 && ((ymu) defpackage.ysr.ao(ygwVarH)).equals(ymu.a)) ? yhu.b : new yhu(ygwVarH);
            case 1:
                java.lang.Long l = defpackage.wgf.a;
                return new java.util.concurrent.Semaphore(1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.ygr) obj).g();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.yhv) obj).g();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.EnumMap enumMap = ((defpackage.ydr) obj).a;
                return enumMap == null ? defpackage.ync.a : defpackage.ygo.a(enumMap);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.yha) obj).b();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.yhe.j((java.util.LinkedHashMap) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((java.util.Map.Entry) obj).getKey();
            default:
                return ((java.util.Map.Entry) obj).getValue();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}

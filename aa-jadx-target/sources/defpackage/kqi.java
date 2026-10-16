package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kqi implements java.util.function.Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ kqi(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                kqo kqoVar = (kqo) obj;
                if (kqoVar.i()) {
                    return true;
                }
                return kqoVar.b.isPresent() && kqoVar.o();
            case 1:
                return j$.util.Objects.nonNull((java.lang.String[]) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                kyc kycVar = (kyc) obj;
                if (!defpackage.sqs.f()) {
                    return kycVar.b == 7;
                }
                int i = kycVar.b;
                return i == 7 || i == 26;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.mqi) obj).e();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar = defpackage.kzl.a;
                return defpackage.tna.aG((defpackage.mqj) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.mqi) obj).e();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar2 = defpackage.kzl.a;
                return defpackage.tna.aE((defpackage.mqj) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.util.Objects.nonNull(obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i2 = defpackage.loo.a;
                return defpackage.tna.aG((defpackage.mqj) obj);
            case 9:
                defpackage.yqm yqmVar3 = defpackage.lpx.a;
                return !android.text.TextUtils.isEmpty(((lmi) obj).R());
            case 10:
                return j$.util.Objects.nonNull((defpackage.eqp) obj);
            case 11:
                return j$.util.Objects.nonNull((lph) obj);
            case 12:
                return !((java.lang.String) obj).isEmpty();
            case 13:
                lpz lpzVar = (lpz) obj;
                otg otgVar = lpzVar.a.e;
                if (otgVar == null) {
                    otgVar = otg.a;
                }
                oth othVar = otgVar.f;
                if (othVar == null) {
                    othVar = oth.a;
                }
                defpackage.abpj abpjVar = othVar.b;
                return (abpjVar.isEmpty() || !j$.util.Collection.-EL.stream(abpjVar).allMatch(new defpackage.kqi(12)) || lpzVar.a().getPackageName().isEmpty() || lpzVar.a().getClassName().isEmpty()) ? false : true;
            case 14:
                defpackage.yqm yqmVar4 = defpackage.lqz.a;
                return !((java.lang.Boolean) obj).booleanValue();
            case 15:
                defpackage.yqm yqmVar5 = defpackage.lqz.a;
                return ((java.lang.Boolean) obj).booleanValue();
            case 16:
                int i3 = defpackage.lqq.m;
                return !((java.lang.Boolean) obj).booleanValue();
            case 17:
                return ((defpackage.lma) obj).j();
            case 18:
                defpackage.yqm yqmVar6 = defpackage.lrf.a;
                return defpackage.tna.aG((defpackage.mqj) obj);
            case 19:
                return !defpackage.lrf.a((android.content.ComponentName) obj);
            default:
                int i4 = defpackage.lux.b;
                return ((android.content.pm.ResolveInfo) obj).activityInfo != null;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lyk implements java.util.function.Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ lyk(int i) {
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
                return ((defpackage.mqj) obj).a.e();
            case 1:
                defpackage.yqm yqmVar = lwl.a;
                return ((dts) obj).b <= 0;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((j$.util.Optional) obj).isPresent();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return j$.util.Objects.nonNull((com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = defpackage.lzw.a;
                return defpackage.tna.aE((defpackage.mqj) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ygw ygwVar = defpackage.maw.a;
                return defpackage.tna.aE((defpackage.mqj) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar3 = defpackage.mce.a;
                ((mcd) obj).f();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = defpackage.mci.b;
                return ((mch) obj).c.C;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar4 = miq.a;
                return !((min) ((java.util.Map.Entry) obj).getKey()).c();
            case 9:
                return !android.text.TextUtils.isEmpty((java.lang.String) obj);
            case 10:
                return j$.util.Objects.nonNull((java.lang.String) obj);
            case 11:
                return ((kqo) obj).l();
            case 12:
                return !((okf) obj).d();
            case 13:
                return defpackage.lhi.a(defpackage.mkp.a.c.getPackageManager(), ((mrd) obj).c.a());
            case 14:
                int i2 = mqo.f;
                return j$.util.Objects.nonNull(obj);
            case 15:
                return j$.util.Objects.nonNull((mqu) obj);
            case 16:
                defpackage.yqm yqmVar5 = mqv.a;
                return defpackage.nsn.e().g(((mrd) ((mqv) obj)).c.a());
            case 17:
                defpackage.yqm yqmVar6 = mqv.a;
                return defpackage.tna.aG((defpackage.mqj) obj);
            case 18:
                return j$.util.Objects.nonNull((mrk) obj);
            case 19:
                return (((mrk) obj).b & 4) != 0;
            default:
                defpackage.yqm yqmVar7 = defpackage.mrn.a;
                return mrj.a(((mrk) obj).c) != mrj.b;
        }
    }
}

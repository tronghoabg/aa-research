package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mmf implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mmf(int i) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.mmg) obj).name();
            case 1:
                return new kqt((android.content.Context) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.nrr((com.google.android.gms.car.display.CarDisplayId) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((defpackage.nsz) obj).c);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(((defpackage.nsz) obj).f);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(((defpackage.nsz) obj).d);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.nsz) obj).g;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Integer.valueOf(((defpackage.nsz) obj).i);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.nsz) obj).j;
            case 9:
                return ((defpackage.nsz) obj).b;
            case 10:
                return ((defpackage.nsz) obj).e;
            case 11:
                return (com.google.android.gms.car.display.CarRegionId) ((java.util.Map.Entry) obj).getKey();
            case 12:
                return java.lang.Integer.valueOf(((defpackage.nsz) obj).h);
            case 13:
                return ((defpackage.skf) obj).a;
            case 14:
                return ((defpackage.skf) obj).b;
            case 15:
                int i = defpackage.sts.c;
                return new defpackage.sqs();
            case 16:
                defpackage.yqm yqmVar = defpackage.thf.a;
                return new java.util.EnumMap(defpackage.tgu.class);
            case 17:
                return defpackage.tht.f((java.lang.String) obj);
            case 18:
                return ((java.util.Map.Entry) obj).getKey();
            case 19:
                defpackage.yqm yqmVar2 = defpackage.tht.a;
                return new defpackage.ynu(((java.util.Map.Entry) obj).getValue());
            default:
                return java.lang.Integer.valueOf(((defpackage.vzq) obj).a().b);
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lvg implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ lvg(int i) {
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
                int i = defpackage.lvh.c;
                return ((ieb) obj).c;
            case 1:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                int i2 = defpackage.lux.b;
                return new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return mqu.b((defpackage.mqj) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return (tme) ((j$.util.Optional) obj).get();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.mqj) obj).a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i3 = defpackage.lzn.b;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.NAVIGATION);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.mqj) obj).a();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.mqj) obj).a();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.mqj) obj).a();
            case 9:
                return ((defpackage.mqj) obj).a();
            case 10:
                java.lang.String str = (java.lang.String) obj;
                int i4 = defpackage.mbg.a;
                return str;
            case 11:
                int i5 = defpackage.mdk.b;
                return new defpackage.mqj((android.content.ComponentName) obj, defpackage.mqg.OTHER, true, true, true);
            case 12:
                return (min) ((java.util.Map.Entry) obj).getKey();
            case 13:
                defpackage.yqm yqmVar = miq.a;
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream((defpackage.ygw) ((java.util.Map.Entry) obj).getValue()).map(new defpackage.lvg(14));
                int i6 = defpackage.ygw.d;
                return (defpackage.ygw) map.collect(defpackage.yds.a);
            case 14:
                defpackage.yqm yqmVar2 = miq.a;
                return ((mip) obj).a;
            case 15:
                return (defpackage.ygw) ((java.util.Map.Entry) obj).getValue();
            case 16:
                return j$.util.Collection.-EL.stream((defpackage.ygw) obj);
            case 17:
                com.google.android.gms.car.RadioMetadata radioMetadata = ((com.google.android.gms.car.RadioProgramInfo) obj).b;
                if (radioMetadata != null) {
                    java.lang.String str2 = radioMetadata.a;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
                return null;
            case 18:
                com.google.android.gms.car.RadioMetadata radioMetadata2 = ((com.google.android.gms.car.RadioProgramInfo) obj).b;
                if (radioMetadata2 != null) {
                    java.lang.String str3 = radioMetadata2.m;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
                return null;
            case 19:
                com.google.android.gms.car.RadioMetadata radioMetadata3 = ((com.google.android.gms.car.RadioProgramInfo) obj).b;
                if (radioMetadata3 != null) {
                    java.lang.String str4 = radioMetadata3.h;
                    if (!android.text.TextUtils.isEmpty(str4)) {
                        return str4;
                    }
                }
                return null;
            default:
                com.google.android.gms.car.RadioMetadata radioMetadata4 = ((com.google.android.gms.car.RadioProgramInfo) obj).b;
                if (radioMetadata4 != null) {
                    java.lang.String str5 = radioMetadata4.b;
                    if (!android.text.TextUtils.isEmpty(str5)) {
                        return str5;
                    }
                }
                return null;
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

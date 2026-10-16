package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lpa implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lpa(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.b) {
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
        switch (this.b) {
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
        switch (this.b) {
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

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v46, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [affc, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.lpg.a;
                return ((android.content.ComponentName) this.a).getPackageName().equals(((lmi) obj).R());
            case 1:
                defpackage.yqm yqmVar2 = defpackage.lpg.a;
                return ((defpackage.mqj) obj).a().equals(this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar3 = defpackage.lpg.a;
                return ((lmi) obj).L().equals(this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar4 = defpackage.lpx.a;
                java.lang.String strR = ((lmi) obj).R();
                return (android.text.TextUtils.isEmpty(strR) || defpackage.loo.c((defpackage.qsh) this.a, strR).isEmpty()) ? false : true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ?? r3 = this.a;
                defpackage.yqm yqmVar5 = defpackage.lpx.a;
                return android.text.TextUtils.equals(((android.content.ComponentName) obj).getClassName(), r3);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                lqu lquVar = lqv.b;
                return ((lqt) obj).b == this.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.lvh.i((android.telephony.SmsMessage) obj).equals(this.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar6 = defpackage.lvl.a;
                return ((defpackage.mqj) obj).a().getPackageName().equals(this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar7 = lvw.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            case 9:
                return ((defpackage.mqj) obj).a().getPackageName().equals(this.a);
            case 10:
                return ((defpackage.mqi) this.a).equals((defpackage.mqi) obj);
            case 11:
                defpackage.yqm yqmVar8 = defpackage.lzw.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(((android.content.ComponentName) this.a).getPackageName());
            case 12:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int i = defpackage.mak.d;
                return !((android.content.ComponentName) entry.getKey()).equals(this.a) && defpackage.mak.l(((java.lang.Integer) entry.getValue()).intValue());
            case 13:
                int i2 = defpackage.mat.a;
                return ((java.lang.String) this.a).equals(((android.content.ComponentName) obj).getPackageName());
            case 14:
                int i3 = defpackage.mat.a;
                return ((android.content.ComponentName) obj).getPackageName().equals(this.a);
            case 15:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                defpackage.mdb mdbVar = defpackage.mdc.a;
                resolveInfo.getClass();
                android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                serviceInfo.getClass();
                return this.a.add(((android.content.pm.PackageItemInfo) serviceInfo).name) || defpackage.afga.f("com.google.android.projection.gearhead", ((android.content.pm.PackageItemInfo) serviceInfo).packageName);
            case 16:
                ?? r4 = this.a;
                defpackage.mdb mdbVar2 = defpackage.mdc.a;
                return ((java.lang.Boolean) r4.invoke(obj)).booleanValue();
            case 17:
                ?? r5 = this.a;
                defpackage.mdb mdbVar3 = defpackage.mdc.a;
                return ((java.lang.Boolean) r5.invoke(obj)).booleanValue();
            case 18:
                int i4 = defpackage.mdk.b;
                return defpackage.kmv.e((defpackage.absk) this.a, ((android.content.ComponentName) obj).getPackageName());
            case 19:
                return j$.util.Objects.equals(((android.service.notification.StatusBarNotification) obj).getKey(), ((nvh) this.a).g);
            default:
                return j$.util.Objects.equals(((nuv) obj).d, this.a);
        }
    }
}

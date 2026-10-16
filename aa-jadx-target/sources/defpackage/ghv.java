package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ghv implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghv(java.lang.Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((androidx.car.app.model.Tab) obj).getContentId().equals(((androidx.car.app.model.TabTemplate) this.a).getActiveTabContentId());
            case 1:
                return ((androidx.car.app.model.Tab) obj).getContentId().equals(((androidx.car.app.model.TabTemplate) this.a).getActiveTabContentId());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                com.google.android.gms.car.control.CarProperty carProperty = (com.google.android.gms.car.control.CarProperty) obj;
                defpackage.ike ikeVar = (defpackage.ike) this.a;
                return ikeVar.y(carProperty) && !ikeVar.b.contains(carProperty);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.android.gms.car.control.CarPropertyConfig carPropertyConfig = (com.google.android.gms.car.control.CarPropertyConfig) obj;
                defpackage.yqm yqmVar = defpackage.ike.a;
                int i = carPropertyConfig.a;
                com.google.android.gms.car.control.CarProperty carProperty2 = (com.google.android.gms.car.control.CarProperty) this.a;
                return i == carProperty2.a && carPropertyConfig.e.contains(carProperty2.b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.ygw) this.a).contains((java.lang.String) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return this.a.contains((android.content.ComponentName) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar2 = defpackage.iyh.a;
                return !((defpackage.yhx) this.a).contains(((android.content.pm.ResolveInfo) obj).activityInfo.packageName);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) obj;
                android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                java.lang.Object obj2 = this.a;
                if (serviceInfo != null) {
                    defpackage.iyh iyhVar = (defpackage.iyh) obj2;
                    if (!iyhVar.x(resolveInfo.serviceInfo)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iyh.a.f()).ai(1575)).y("Skipping disabled service %s", resolveInfo.serviceInfo.name);
                        iyhVar.u(defpackage.zbf.SERVICE_DISABLED, resolveInfo.serviceInfo.packageName);
                        return false;
                    }
                } else {
                    defpackage.iyh iyhVar2 = (defpackage.iyh) obj2;
                    if (!iyhVar2.x(resolveInfo.activityInfo)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iyh.a.f()).ai(1574)).y("Skipping disabled activity %s", resolveInfo.activityInfo.name);
                        iyhVar2.u(defpackage.zbf.ACTIVITY_DISABLED, resolveInfo.activityInfo.packageName);
                        return false;
                    }
                }
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar3 = defpackage.jit.a;
                return ((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a).equals(((java.util.Map.Entry) obj).getValue());
            case 9:
                defpackage.yqm yqmVar4 = defpackage.jit.a;
                return ((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a).equals(((java.util.Map.Entry) obj).getValue());
            case 10:
                defpackage.yqm yqmVar5 = defpackage.jit.a;
                return ((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a).equals(((java.util.Map.Entry) obj).getValue());
            case 11:
                defpackage.yqm yqmVar6 = defpackage.jit.a;
                return ((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a).equals(((java.util.Map.Entry) obj).getValue());
            case 12:
                return ((java.lang.String) this.a).equals((java.lang.String) obj);
            case 13:
                int i2 = jws.a;
                return ((defpackage.mqj) obj).a().getPackageName().equals(this.a);
            case 14:
                return ((defpackage.mqi) this.a).equals((defpackage.mqi) obj);
            case 15:
                return ((defpackage.mqi) this.a).equals((defpackage.mqi) obj);
            case 16:
                return ((defpackage.mqi) this.a).equals((defpackage.mqi) obj);
            case 17:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                jzi jziVar = (jzi) this.a;
                if (jziVar.a == null) {
                    jziVar.a = new defpackage.ths(defpackage.mkp.a.c, defpackage.acpd.h());
                }
                if (!jziVar.a.a(componentName.getPackageName())) {
                    defpackage.abpj abpjVar = defpackage.adae.g().b;
                    int i3 = ys.a;
                    if (ggv.a(componentName, abpjVar, 1) >= 6) {
                        return true;
                    }
                }
                return false;
            case 18:
                android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) obj;
                defpackage.yqm yqmVar7 = defpackage.kag.a;
                if (resolveInfo2.serviceInfo != null) {
                    return true;
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.kag.a.h()).ai(2891)).M("Found app for Intent %s without a service info in the resolve info %s", this.a, resolveInfo2);
                return false;
            case 19:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                return ((defpackage.ygw) this.a).contains(mqjVar.a().getPackageName()) && mqjVar.c;
            default:
                return ((defpackage.ygw) this.a).contains(((defpackage.mqj) obj).a().getPackageName());
        }
    }
}

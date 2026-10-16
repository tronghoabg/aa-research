package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabTemplate;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyConfig;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class ghp implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Tab) obj).getContentId().equals(((TabTemplate) this.a).getActiveTabContentId());
            case 1:
                return ((Tab) obj).getContentId().equals(((TabTemplate) this.a).getActiveTabContentId());
            case 2:
                CarProperty carProperty = (CarProperty) obj;
                ijv ijvVar = (ijv) this.a;
                return ijvVar.y(carProperty) && !ijvVar.b.contains(carProperty);
            case 3:
                CarPropertyConfig carPropertyConfig = (CarPropertyConfig) obj;
                yph yphVar = ijv.a;
                int i = carPropertyConfig.a;
                CarProperty carProperty2 = (CarProperty) this.a;
                return i == carProperty2.a && carPropertyConfig.e.contains(carProperty2.b);
            case 4:
                return ((yfq) this.a).contains((String) obj);
            case 5:
                return this.a.contains((ComponentName) obj);
            case 6:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                Object obj2 = this.a;
                if (serviceInfo != null) {
                    iya iyaVar = (iya) obj2;
                    if (!iyaVar.x(resolveInfo.serviceInfo)) {
                        ((ype) ((ype) iya.a.f()).ai(1575)).y("Skipping disabled service %s", resolveInfo.serviceInfo.name);
                        iyaVar.u(zaa.SERVICE_DISABLED, resolveInfo.serviceInfo.packageName);
                        return false;
                    }
                } else {
                    iya iyaVar2 = (iya) obj2;
                    if (!iyaVar2.x(resolveInfo.activityInfo)) {
                        ((ype) ((ype) iya.a.f()).ai(1574)).y("Skipping disabled activity %s", resolveInfo.activityInfo.name);
                        iyaVar2.u(zaa.ACTIVITY_DISABLED, resolveInfo.activityInfo.packageName);
                        return false;
                    }
                }
                return true;
            case 7:
                yph yphVar2 = jim.a;
                return ((ProjectionWindowAnimationChoreography) this.a).equals(((Map.Entry) obj).getValue());
            case 8:
                yph yphVar3 = jim.a;
                return ((ProjectionWindowAnimationChoreography) this.a).equals(((Map.Entry) obj).getValue());
            case 9:
                yph yphVar4 = jim.a;
                return ((ProjectionWindowAnimationChoreography) this.a).equals(((Map.Entry) obj).getValue());
            case 10:
                yph yphVar5 = jim.a;
                return ((ProjectionWindowAnimationChoreography) this.a).equals(((Map.Entry) obj).getValue());
            case 11:
                return ((String) this.a).equals((String) obj);
            case 12:
                int i2 = jwn.a;
                return ((mqc) obj).a().getPackageName().equals(this.a);
            case 13:
                return ((mqb) this.a).equals((mqb) obj);
            case 14:
                return ((mqb) this.a).equals((mqb) obj);
            case 15:
                return ((mqb) this.a).equals((mqb) obj);
            case 16:
                ComponentName componentName = (ComponentName) obj;
                jzd jzdVar = (jzd) this.a;
                if (jzdVar.a == null) {
                    jzdVar.a = new tgw(mki.a.c, acob.h());
                }
                if (!jzdVar.a.a(componentName.getPackageName())) {
                    aboh abohVar = aczc.g().b;
                    int i3 = yl.a;
                    if (ggp.a(componentName, abohVar, 1) >= 6) {
                        return true;
                    }
                }
                return false;
            case 17:
                ResolveInfo resolveInfo2 = (ResolveInfo) obj;
                yph yphVar6 = kad.a;
                if (resolveInfo2.serviceInfo != null) {
                    return true;
                }
                ((ype) ((ype) kad.a.h()).ai(2888)).M("Found app for Intent %s without a service info in the resolve info %s", this.a, resolveInfo2);
                return false;
            case 18:
                mqc mqcVar = (mqc) obj;
                return ((yfq) this.a).contains(mqcVar.a().getPackageName()) && mqcVar.c;
            case 19:
                return ((yfq) this.a).contains(((mqc) obj).a().getPackageName());
            default:
                yph yphVar7 = koo.a;
                return kom.b((pba) obj).equals(this.a);
        }
    }
}

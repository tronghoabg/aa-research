package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.service.notification.StatusBarNotification;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class lou implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lou(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v44, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [afec, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                yph yphVar = loy.a;
                return ((lmb) obj).L().equals(this.a);
            case 1:
                yph yphVar2 = loy.a;
                return ((ComponentName) this.a).getPackageName().equals(((lmb) obj).R());
            case 2:
                yph yphVar3 = lpq.a;
                String strR = ((lmb) obj).R();
                return (TextUtils.isEmpty(strR) || loh.c((qrn) this.a, strR).isEmpty()) ? false : true;
            case 3:
                ?? r3 = this.a;
                yph yphVar4 = lpq.a;
                return TextUtils.equals(((ComponentName) obj).getClassName(), r3);
            case 4:
                lqp lqpVar = lqq.b;
                return ((lqo) obj).b == this.a;
            case 5:
                return lva.i((SmsMessage) obj).equals(this.a);
            case 6:
                yph yphVar5 = lve.a;
                return ((mqc) obj).a().getPackageName().equals(this.a);
            case 7:
                yph yphVar6 = lvp.a;
                return ((ComponentName) obj).getPackageName().equals(this.a);
            case 8:
                return ((mqc) obj).a().getPackageName().equals(this.a);
            case 9:
                return ((mqb) this.a).equals((mqb) obj);
            case 10:
                yph yphVar7 = lzp.a;
                return ((ComponentName) obj).getPackageName().equals(((ComponentName) this.a).getPackageName());
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                int i = mad.d;
                return !((ComponentName) entry.getKey()).equals(this.a) && mad.l(((Integer) entry.getValue()).intValue());
            case 12:
                int i2 = mam.a;
                return ((String) this.a).equals(((ComponentName) obj).getPackageName());
            case 13:
                int i3 = mam.a;
                return ((ComponentName) obj).getPackageName().equals(this.a);
            case 14:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                mct mctVar = mcu.a;
                resolveInfo.getClass();
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                serviceInfo.getClass();
                return this.a.add(((PackageItemInfo) serviceInfo).name) || affa.f("com.google.android.projection.gearhead", ((PackageItemInfo) serviceInfo).packageName);
            case 15:
                ?? r32 = this.a;
                mct mctVar2 = mcu.a;
                return ((Boolean) r32.invoke(obj)).booleanValue();
            case 16:
                ?? r33 = this.a;
                mct mctVar3 = mcu.a;
                return ((Boolean) r33.invoke(obj)).booleanValue();
            case 17:
                int i4 = mdc.b;
                return kmo.e((abrh) this.a, ((ComponentName) obj).getPackageName());
            case 18:
                return Objects.equals(((StatusBarNotification) obj).getKey(), ((nur) this.a).g);
            case 19:
                return Objects.equals(((nuh) obj).d, this.a);
            default:
                return ((kqg) this.a).n((kqg) obj);
        }
    }
}

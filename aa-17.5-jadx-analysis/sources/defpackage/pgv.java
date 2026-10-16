package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.OptionalInt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class pgv implements xwx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pgv(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.xwx
    public final Object a(Object obj) {
        siu siuVar;
        int i = this.c;
        if (i == 0) {
            ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_HU_NOT_CONNECTED_TIMEOUT, (OptionalInt) this.b);
            throw new phi();
        }
        if (i == 1) {
            abnp abnpVarK = ((kqh) obj).K();
            abnp abnpVarK2 = ((abnv) this.a).K();
            abnpVarK2.t();
            kqi kqiVar = (kqi) abnpVarK2.b;
            kqiVar.b = 4 | kqiVar.b;
            kqiVar.e = true;
            abnpVarK.y(((kqq) this.b).d, (kqi) abnpVarK2.q());
            return (kqh) abnpVarK.q();
        }
        if (i == 2) {
            ((qdr) this.a).b((qdg) this.b.getKey());
            return null;
        }
        if (i == 3) {
            rhh rhhVar = (rhh) obj;
            ypf ypfVar = rgh.a;
            Object obj2 = this.a;
            obj2.getClass();
            if (!rhhVar.b.containsKey(obj2)) {
                rgh.a.l().ai(8011).u("Did not find A2DP entry for car to be re-enabled");
                return rhhVar;
            }
            Object obj3 = this.b;
            rgh.a.f().ai(8012).u("Found A2DP entry for car to be re-enabled");
            ((AtomicBoolean) obj3).set(true);
            abnp abnpVarK3 = rhhVar.K();
            obj2.getClass();
            abnpVarK3.t();
            ((rhh) abnpVarK3.b).b().remove(obj2);
            return (rhh) abnpVarK3.q();
        }
        if (i == 4) {
            shr shrVar = (shr) obj;
            zgp zgpVarA = ((shs) this.a).a(new sit(Instant.ofEpochMilli(((acam) shrVar.p.b).c)));
            boolean zB = sjc.b(zgpVarA);
            Object obj4 = this.b;
            if (!zB) {
                return vja.p(zgpVarA).b(zfq.a, new siy(obj4, shrVar, 0));
            }
            try {
                siuVar = (siu) a.L(zgpVarA);
            } catch (ExecutionException unused) {
                siuVar = siu.b;
            }
            return ((sjc) obj4).a(shrVar, siuVar);
        }
        if (i == 5) {
            abnr abnrVar = (abnr) ((vys) obj).K();
            abnrVar.t();
            vys vysVar = (vys) abnrVar.b;
            Object obj5 = this.b;
            obj5.getClass();
            vysVar.c = (ajgu) obj5;
            vysVar.b |= 1;
            vys vysVar2 = (vys) abnrVar.q();
            vzg vzgVar = (vzg) this.a;
            String[] strArr = {vzgVar.b.getClass().getName()};
            Intent intent = new Intent();
            Context context = vzgVar.a;
            intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
            intent.setPackage(context.getPackageName());
            intent.putExtra("Transmitters", strArr);
            intent.putExtra("MetricSnapshot", vysVar2.h());
            context.sendBroadcast(intent);
            return null;
        }
        wbq wbqVar = (wbq) obj;
        int i2 = wcy.a;
        Object obj6 = this.a;
        wbp wbpVar = wbp.a;
        obj6.getClass();
        wbp wbpVar2 = (wbp) wbqVar.b.get(obj6);
        if (wbpVar2 != null) {
            wbpVar = wbpVar2;
        }
        Object obj7 = this.b;
        abnp abnpVarK4 = wbpVar.K();
        if (!DesugarCollections.unmodifiableList(((wbp) abnpVarK4.b).c).contains(obj7)) {
            abnpVarK4.E((String) obj7);
        }
        abnp abnpVarK5 = wbqVar.K();
        abnpVarK4.t();
        wbp wbpVar3 = (wbp) abnpVarK4.b;
        wbpVar3.b = 1 | wbpVar3.b;
        wbpVar3.d = (String) obj7;
        abnpVarK5.F((String) obj6, (wbp) abnpVarK4.q());
        return (wbq) abnpVarK5.q();
    }

    public /* synthetic */ pgv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ pgv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}

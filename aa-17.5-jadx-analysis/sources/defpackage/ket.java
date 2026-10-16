package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.auto.components.system.GhPendingIntentReceiver;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class ket extends lhf {
    public final yph a;
    public boolean b;
    public final AtomicInteger c;
    private zgs d;

    public ket() {
        zgs zgsVarAI = yrm.aI(Executors.newSingleThreadExecutor());
        this.a = yph.c("GH.AppNotifier");
        this.b = true;
        this.c = new AtomicInteger();
        this.d = zgsVarAI;
    }

    private static final PendingIntent b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("ui_context", 9103);
        intent.putExtra("ui_action", i);
        return GhPendingIntentReceiver.c(intent, context);
    }

    public final void a(mqc mqcVar) {
        Context context = mki.a.c;
        ComponentName componentNameA = mqcVar.a();
        PendingIntent pendingIntentB = b(context, componentNameA, 16102);
        PendingIntent pendingIntentB2 = b(context, componentNameA, 16101);
        ((ype) ((ype) this.a.f()).ai((char) 2984)).y("Posting notification for new app %s", componentNameA);
        if (this.d.isShutdown()) {
            return;
        }
        zgp zgpVarSubmit = this.d.submit(new flt(mqcVar, 4));
        zgpVarSubmit.c(new tky(this, zgpVarSubmit, componentNameA, context, pendingIntentB, pendingIntentB2, 1), context.getMainExecutor());
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        yph yphVar;
        final boolean z;
        super.c();
        lix.b().a().fE(this, new hlg(this, 15));
        if (this.d.isShutdown()) {
            this.d = yrm.aI(Executors.newSingleThreadExecutor());
        }
        SharedPreferences sharedPreferences = mki.a.c.getSharedPreferences("app_notifier", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        final Set<String> stringSet = sharedPreferences.getStringSet("observed_apps", null);
        boolean z2 = this.b || stringSet == null;
        ygr ygrVarE = lem.a().e(kio.b().e(), nyj.a());
        if (!z2) {
            ygrVarE = (ygr) Collection.EL.stream(ygrVarE).filter(new hmd(17)).collect(ycm.b);
        }
        ygr ygrVar = (ygr) Collection.EL.stream(ygrVarE).map(new jxe(18)).collect(ycm.b);
        ygp ygpVar = new ygp();
        if (stringSet != null) {
            yph yphVar2 = this.a;
            ((ype) ((ype) yphVar2.f()).ai((char) 2985)).u("Checking for new apps");
            ygpVar.k(stringSet);
            if (this.b) {
                long j = sharedPreferences.getInt("parked_native_apps_notification_count", 0);
                yphVar = yphVar2;
                long jB = acpf.b();
                z = j < jB;
                if (z) {
                    editorEdit.putInt("parked_native_apps_notification_count", (int) jB).apply();
                }
            } else {
                z = false;
                yphVar = yphVar2;
            }
            Stream streamFilter = Collection.EL.stream(ygrVar).filter(new Predicate() { // from class: kes
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo56negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str = (String) obj;
                    if (stringSet.contains(str)) {
                        return z && kmo.e(acpf.e(), str);
                    }
                    return true;
                }
            });
            int i = yfq.d;
            yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
            if (!yfqVar.isEmpty()) {
                ebf.j().F(olm.e(acai.P).l());
                ((ype) yphVar.l().ai((char) 2981)).y("Found new app packages: %s", yfqVar);
                Optional optionalFindFirst = Collection.EL.stream(ygrVarE).filter(new ghp(yfqVar, 18)).findFirst();
                if (optionalFindFirst.isPresent()) {
                    a((mqc) optionalFindFirst.get());
                } else {
                    Optional optionalFindFirst2 = Collection.EL.stream(ygrVarE).filter(new ghp(yfqVar, 19)).findFirst();
                    jfz jfzVar = new jfz(this, 3);
                    if (true == optionalFindFirst2.isPresent()) {
                        ((ket) jfzVar.a).a((mqc) optionalFindFirst2.get());
                    }
                }
            }
        }
        ygpVar.k(ygrVar);
        editorEdit.putStringSet("observed_apps", ygpVar.g()).apply();
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        if (this.d.isShutdown()) {
            return;
        }
        this.d.shutdownNow();
    }
}

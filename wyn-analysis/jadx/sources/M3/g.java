package M3;

import A7.AbstractC0279p0;
import A7.V0;
import J3.r;
import S3.n;
import T3.m;
import T3.p;
import T3.v;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b7.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements O3.b, v {

    /* renamed from: m, reason: collision with root package name */
    public static final String f7473m = r.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f7474a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7475b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.j f7476c;

    /* renamed from: d, reason: collision with root package name */
    public final j f7477d;

    /* renamed from: e, reason: collision with root package name */
    public final k f7478e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7479f;

    /* renamed from: g, reason: collision with root package name */
    public int f7480g;

    /* renamed from: h, reason: collision with root package name */
    public final m f7481h;

    /* renamed from: i, reason: collision with root package name */
    public final V0 f7482i;

    /* renamed from: j, reason: collision with root package name */
    public PowerManager.WakeLock f7483j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final K3.j f7484l;

    public g(Context context, int i5, j jVar, K3.j jVar2) {
        this.f7474a = context;
        this.f7475b = i5;
        this.f7477d = jVar;
        this.f7476c = jVar2.f6485a;
        this.f7484l = jVar2;
        n nVar = jVar.f7496e.f6510j;
        k kVar = jVar.f7493b;
        this.f7481h = (m) kVar.f19396b;
        this.f7482i = (V0) kVar.f19398d;
        this.f7478e = new k(nVar, this);
        this.k = false;
        this.f7480g = 0;
        this.f7479f = new Object();
    }

    public static void a(g gVar) {
        S3.j jVar = gVar.f7476c;
        int i5 = gVar.f7480g;
        String str = jVar.f10965a;
        String str2 = f7473m;
        if (i5 >= 2) {
            r.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f7480g = 2;
        r.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f7474a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.e(intent, jVar);
        j jVar2 = gVar.f7477d;
        int i10 = gVar.f7475b;
        i iVar = new i(jVar2, intent, i10, 0);
        V0 v0 = gVar.f7482i;
        v0.execute(iVar);
        if (!jVar2.f7495d.f(str)) {
            r.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        r.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.e(intent2, jVar);
        v0.execute(new i(jVar2, intent2, i10, 0));
    }

    @Override // O3.b
    public final void b(ArrayList arrayList) {
        this.f7481h.execute(new f(this, 0));
    }

    public final void c() {
        synchronized (this.f7479f) {
            try {
                this.f7478e.G();
                this.f7477d.f7494c.a(this.f7476c);
                PowerManager.WakeLock wakeLock = this.f7483j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    r.d().a(f7473m, "Releasing wakelock " + this.f7483j + "for WorkSpec " + this.f7476c);
                    this.f7483j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        S3.j jVar = this.f7476c;
        StringBuilder sb2 = new StringBuilder();
        String str = jVar.f10965a;
        sb2.append(str);
        sb2.append(" (");
        this.f7483j = p.a(this.f7474a, AbstractC0279p0.j(this.f7475b, ")", sb2));
        r rVarD = r.d();
        String str2 = "Acquiring wakelock " + this.f7483j + "for WorkSpec " + str;
        String str3 = f7473m;
        rVarD.a(str3, str2);
        this.f7483j.acquire();
        S3.p pVarH = this.f7477d.f7496e.f6503c.u().h(str);
        if (pVarH == null) {
            this.f7481h.execute(new f(this, 0));
            return;
        }
        boolean zB = pVarH.b();
        this.k = zB;
        if (zB) {
            this.f7478e.F(Collections.singletonList(pVarH));
            return;
        }
        r.d().a(str3, "No constraints for " + str);
        f(Collections.singletonList(pVarH));
    }

    public final void e(boolean z2) {
        r rVarD = r.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        S3.j jVar = this.f7476c;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z2);
        rVarD.a(f7473m, sb2.toString());
        c();
        int i5 = this.f7475b;
        j jVar2 = this.f7477d;
        V0 v0 = this.f7482i;
        Context context = this.f7474a;
        if (z2) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.e(intent, jVar);
            v0.execute(new i(jVar2, intent, i5, 0));
        }
        if (this.k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            v0.execute(new i(jVar2, intent2, i5, 0));
        }
    }

    @Override // O3.b
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Fe.c.s((S3.p) it.next()).equals(this.f7476c)) {
                this.f7481h.execute(new f(this, 1));
                return;
            }
        }
    }
}

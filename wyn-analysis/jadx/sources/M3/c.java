package M3;

import A7.AbstractC0279p0;
import A7.V0;
import J3.r;
import R8.v;
import S3.p;
import S3.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b7.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements K3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f7461e = r.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f7462a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7463b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f7464c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final s f7465d;

    public c(Context context, s sVar) {
        this.f7462a = context;
        this.f7465d = sVar;
    }

    public static S3.j c(Intent intent) {
        return new S3.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void e(Intent intent, S3.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f10965a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f10966b);
    }

    public final boolean a() {
        boolean z2;
        synchronized (this.f7464c) {
            z2 = !this.f7463b.isEmpty();
        }
        return z2;
    }

    public final void b(Intent intent, int i5, j jVar) {
        List<K3.j> listX;
        String action = intent.getAction();
        int i10 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            r.d().a(f7461e, "Handling constraints changed " + intent);
            e eVar = new e(this.f7462a, i5, jVar);
            ArrayList arrayListD = jVar.f7496e.f6503c.u().d();
            String str = d.f7466a;
            Iterator it = arrayListD.iterator();
            boolean z2 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                J3.d dVar = ((p) it.next()).f10986j;
                z2 |= dVar.f5558d;
                z10 |= dVar.f5556b;
                z11 |= dVar.f5559e;
                z12 |= dVar.f5555a != 1;
                if (z2 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f19074a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f7468a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            k kVar = eVar.f7470c;
            kVar.F(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListD.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str3 = pVar.f10977a;
                if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || kVar.m(str3))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str4 = pVar2.f10977a;
                S3.j jVarS = Fe.c.s(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                e(intent3, jVarS);
                r.d().a(e.f7467d, AbstractC0279p0.l("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((V0) jVar.f7493b.f19398d).execute(new i(jVar, intent3, eVar.f7469b, i10));
            }
            kVar.G();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            r.d().a(f7461e, "Handling reschedule " + intent + ", " + i5);
            jVar.f7496e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            r.d().b(f7461e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            S3.j jVarC = c(intent);
            String str5 = f7461e;
            r.d().a(str5, "Handling schedule work for " + jVarC);
            WorkDatabase workDatabase = jVar.f7496e.f6503c;
            workDatabase.c();
            try {
                p pVarH = workDatabase.u().h(jVarC.f10965a);
                if (pVarH == null) {
                    r.d().g(str5, "Skipping scheduling " + jVarC + " because it's no longer in the DB");
                    return;
                }
                if (AbstractC0279p0.d(pVarH.f10978b)) {
                    r.d().g(str5, "Skipping scheduling " + jVarC + "because it is finished.");
                    return;
                }
                long jA = pVarH.a();
                boolean zB = pVarH.b();
                Context context2 = this.f7462a;
                if (zB) {
                    r.d().a(str5, "Opportunistically setting an alarm for " + jVarC + "at " + jA);
                    b.b(context2, workDatabase, jVarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((V0) jVar.f7493b.f19398d).execute(new i(jVar, intent4, i5, i10));
                } else {
                    r.d().a(str5, "Setting up Alarms for " + jVarC + "at " + jA);
                    b.b(context2, workDatabase, jVarC, jA);
                }
                workDatabase.n();
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f7464c) {
                try {
                    S3.j jVarC2 = c(intent);
                    r rVarD = r.d();
                    String str6 = f7461e;
                    rVarD.a(str6, "Handing delay met for " + jVarC2);
                    if (this.f7463b.containsKey(jVarC2)) {
                        r.d().a(str6, "WorkSpec " + jVarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f7462a, i5, jVar, this.f7465d.y(jVarC2));
                        this.f7463b.put(jVarC2, gVar);
                        gVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                r.d().g(f7461e, "Ignoring intent " + intent);
                return;
            }
            S3.j jVarC3 = c(intent);
            boolean z13 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            r.d().a(f7461e, "Handling onExecutionCompleted " + intent + ", " + i5);
            d(jVarC3, z13);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        s sVar = this.f7465d;
        if (zContainsKey) {
            int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            K3.j jVarW = sVar.w(new S3.j(string, i11));
            listX = arrayList2;
            if (jVarW != null) {
                arrayList2.add(jVarW);
                listX = arrayList2;
            }
        } else {
            listX = sVar.x(string);
        }
        for (K3.j jVar2 : listX) {
            r.d().a(f7461e, v.f("Handing stopWork work for ", string));
            jVar.f7496e.h(jVar2);
            WorkDatabase workDatabase2 = jVar.f7496e.f6503c;
            S3.j jVar3 = jVar2.f6485a;
            String str7 = b.f7460a;
            S3.i iVarR = workDatabase2.r();
            S3.g gVarC = iVarR.c(jVar3);
            if (gVarC != null) {
                b.a(this.f7462a, jVar3, gVarC.f10959c);
                r.d().a(b.f7460a, "Removing SystemIdInfo for workSpecId (" + jVar3 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarR.f10961a;
                workDatabase_Impl.b();
                S3.h hVar = (S3.h) iVarR.f10963c;
                o3.g gVarA = hVar.a();
                String str8 = jVar3.f10965a;
                if (str8 == null) {
                    gVarA.N(1);
                } else {
                    gVarA.x(1, str8);
                }
                gVarA.G(2, jVar3.f10966b);
                workDatabase_Impl.c();
                try {
                    gVarA.g();
                    workDatabase_Impl.n();
                } finally {
                    workDatabase_Impl.j();
                    hVar.q(gVarA);
                }
            }
            jVar.d(jVar2.f6485a, false);
        }
    }

    @Override // K3.c
    public final void d(S3.j jVar, boolean z2) {
        synchronized (this.f7464c) {
            try {
                g gVar = (g) this.f7463b.remove(jVar);
                this.f7465d.w(jVar);
                if (gVar != null) {
                    gVar.e(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package M3;

import A7.V0;
import J3.r;
import K3.q;
import S3.s;
import T3.p;
import T3.x;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b7.k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements K3.c {

    /* renamed from: j, reason: collision with root package name */
    public static final String f7491j = r.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f7492a;

    /* renamed from: b, reason: collision with root package name */
    public final k f7493b;

    /* renamed from: c, reason: collision with root package name */
    public final x f7494c;

    /* renamed from: d, reason: collision with root package name */
    public final K3.f f7495d;

    /* renamed from: e, reason: collision with root package name */
    public final q f7496e;

    /* renamed from: f, reason: collision with root package name */
    public final c f7497f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7498g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f7499h;

    /* renamed from: i, reason: collision with root package name */
    public SystemAlarmService f7500i;

    public j(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f7492a = applicationContext;
        this.f7497f = new c(applicationContext, new s((byte) 0, 10));
        q qVarC = q.c(systemAlarmService);
        this.f7496e = qVarC;
        this.f7494c = new x(qVarC.f6502b.f5548e);
        K3.f fVar = qVarC.f6506f;
        this.f7495d = fVar;
        this.f7493b = qVarC.f6504d;
        fVar.a(this);
        this.f7498g = new ArrayList();
        this.f7499h = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i5) {
        r rVarD = r.d();
        String str = f7491j;
        rVarD.a(str, "Adding command " + intent + " (" + i5 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            r.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && c()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i5);
        synchronized (this.f7498g) {
            try {
                boolean zIsEmpty = this.f7498g.isEmpty();
                this.f7498g.add(intent);
                if (zIsEmpty) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        b();
        synchronized (this.f7498g) {
            try {
                Iterator it = this.f7498g.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K3.c
    public final void d(S3.j jVar, boolean z2) {
        int i5 = 0;
        V0 v0 = (V0) this.f7493b.f19398d;
        String str = c.f7461e;
        Intent intent = new Intent(this.f7492a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        c.e(intent, jVar);
        v0.execute(new i(this, intent, i5, i5));
    }

    public final void e() {
        b();
        PowerManager.WakeLock wakeLockA = p.a(this.f7492a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f7496e.f6504d.v(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}

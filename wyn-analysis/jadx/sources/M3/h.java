package M3;

import A7.V0;
import J3.r;
import T3.m;
import T3.p;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7485a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7486b;

    public /* synthetic */ h(j jVar, int i5) {
        this.f7485a = i5;
        this.f7486b = jVar;
    }

    private final void a() {
        synchronized (this.f7486b.f7498g) {
            j jVar = this.f7486b;
            jVar.f7499h = (Intent) jVar.f7498g.get(0);
        }
        Intent intent = this.f7486b.f7499h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f7486b.f7499h.getIntExtra("KEY_START_ID", 0);
            r rVarD = r.d();
            String str = j.f7491j;
            rVarD.a(str, "Processing command " + this.f7486b.f7499h + ", " + intExtra);
            PowerManager.WakeLock wakeLockA = p.a(this.f7486b.f7492a, action + " (" + intExtra + ")");
            try {
                r.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                wakeLockA.acquire();
                j jVar2 = this.f7486b;
                jVar2.f7497f.b(jVar2.f7499h, intExtra, jVar2);
                r.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                wakeLockA.release();
                j jVar3 = this.f7486b;
                ((V0) jVar3.f7493b.f19398d).execute(new h(jVar3, 1));
            } catch (Throwable th) {
                try {
                    r rVarD2 = r.d();
                    String str2 = j.f7491j;
                    rVarD2.c(str2, "Unexpected error in onHandleIntent", th);
                    r.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    j jVar4 = this.f7486b;
                    ((V0) jVar4.f7493b.f19398d).execute(new h(jVar4, 1));
                } catch (Throwable th2) {
                    r.d().a(j.f7491j, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    j jVar5 = this.f7486b;
                    ((V0) jVar5.f7493b.f19398d).execute(new h(jVar5, 1));
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7485a) {
            case 0:
                a();
                return;
            default:
                j jVar = this.f7486b;
                jVar.getClass();
                r rVarD = r.d();
                String str = j.f7491j;
                rVarD.a(str, "Checking if commands are complete.");
                j.b();
                synchronized (jVar.f7498g) {
                    try {
                        if (jVar.f7499h != null) {
                            r.d().a(str, "Removing command " + jVar.f7499h);
                            if (!((Intent) jVar.f7498g.remove(0)).equals(jVar.f7499h)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            jVar.f7499h = null;
                        }
                        m mVar = (m) jVar.f7493b.f19396b;
                        if (!jVar.f7497f.a() && jVar.f7498g.isEmpty() && !mVar.d()) {
                            r.d().a(str, "No more commands & intents.");
                            SystemAlarmService systemAlarmService = jVar.f7500i;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!jVar.f7498g.isEmpty()) {
                            jVar.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}

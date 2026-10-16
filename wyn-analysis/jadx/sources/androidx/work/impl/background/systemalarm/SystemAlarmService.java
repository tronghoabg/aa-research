package androidx.work.impl.background.systemalarm;

import J3.r;
import M3.j;
import T3.p;
import T3.q;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC1460y;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC1460y {

    /* renamed from: d, reason: collision with root package name */
    public static final String f19076d = r.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public j f19077b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19078c;

    public final void a() {
        this.f19078c = true;
        r.d().a(f19076d, "All commands completed in dispatcher");
        String str = p.f11431a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (q.f11432a) {
            linkedHashMap.putAll(q.f11433b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                r.d().g(p.f11431a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC1460y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f19077b = jVar;
        if (jVar.f7500i != null) {
            r.d().b(j.f7491j, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f7500i = this;
        }
        this.f19078c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC1460y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f19078c = true;
        j jVar = this.f19077b;
        jVar.getClass();
        r.d().a(j.f7491j, "Destroying SystemAlarmDispatcher");
        jVar.f7495d.g(jVar);
        jVar.f7500i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        super.onStartCommand(intent, i5, i10);
        if (this.f19078c) {
            r.d().e(f19076d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f19077b;
            jVar.getClass();
            r rVarD = r.d();
            String str = j.f7491j;
            rVarD.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f7495d.g(jVar);
            jVar.f7500i = null;
            j jVar2 = new j(this);
            this.f19077b = jVar2;
            if (jVar2.f7500i != null) {
                r.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f7500i = this;
            }
            this.f19078c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f19077b.a(intent, i10);
        return 3;
    }
}

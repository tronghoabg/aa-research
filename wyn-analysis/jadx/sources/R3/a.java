package R3;

import A7.AbstractC0279p0;
import J3.r;
import K3.q;
import M3.i;
import R8.v;
import S3.j;
import S3.p;
import T3.n;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import b7.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements O3.b, K3.c {
    public static final String k = r.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10213a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10214b;

    /* renamed from: c, reason: collision with root package name */
    public final k f10215c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10216d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public j f10217e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f10218f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f10219g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f10220h;

    /* renamed from: i, reason: collision with root package name */
    public final k f10221i;

    /* renamed from: j, reason: collision with root package name */
    public SystemForegroundService f10222j;

    public a(Context context) {
        this.f10213a = context;
        q qVarC = q.c(context);
        this.f10214b = qVarC;
        this.f10215c = qVarC.f6504d;
        this.f10217e = null;
        this.f10218f = new LinkedHashMap();
        this.f10220h = new HashSet();
        this.f10219g = new HashMap();
        this.f10221i = new k(qVarC.f6510j, this);
        qVarC.f6506f.a(this);
    }

    public static Intent a(Context context, j jVar, J3.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f5575a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f5576b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f5577c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f10965a);
        intent.putExtra("KEY_GENERATION", jVar.f10966b);
        return intent;
    }

    public static Intent c(Context context, j jVar, J3.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f10965a);
        intent.putExtra("KEY_GENERATION", jVar.f10966b);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f5575a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f5576b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f5577c);
        return intent;
    }

    @Override // O3.b
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            String str = pVar.f10977a;
            r.d().a(k, v.f("Constraints unmet for WorkSpec ", str));
            j jVarS = Fe.c.s(pVar);
            q qVar = this.f10214b;
            qVar.f6504d.v(new n(qVar, new K3.j(jVarS), true));
        }
    }

    @Override // K3.c
    public final void d(j jVar, boolean z2) {
        Map.Entry entry;
        synchronized (this.f10216d) {
            try {
                p pVar = (p) this.f10219g.remove(jVar);
                if (pVar != null ? this.f10220h.remove(pVar) : false) {
                    this.f10221i.F(this.f10220h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J3.j jVar2 = (J3.j) this.f10218f.remove(jVar);
        if (jVar.equals(this.f10217e) && this.f10218f.size() > 0) {
            Iterator it = this.f10218f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f10217e = (j) entry.getKey();
            if (this.f10222j != null) {
                J3.j jVar3 = (J3.j) entry.getValue();
                SystemForegroundService systemForegroundService = this.f10222j;
                systemForegroundService.f19085b.post(new b(systemForegroundService, jVar3.f5575a, jVar3.f5577c, jVar3.f5576b));
                SystemForegroundService systemForegroundService2 = this.f10222j;
                systemForegroundService2.f19085b.post(new c(systemForegroundService2, jVar3.f5575a, 0));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f10222j;
        if (jVar2 == null || systemForegroundService3 == null) {
            return;
        }
        r.d().a(k, "Removing Notification (id: " + jVar2.f5575a + ", workSpecId: " + jVar + ", notificationType: " + jVar2.f5576b);
        systemForegroundService3.f19085b.post(new c(systemForegroundService3, jVar2.f5575a, 0));
    }

    public final void e(Intent intent) {
        int i5 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        r rVarD = r.d();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        rVarD.a(k, AbstractC0279p0.j(intExtra2, ")", sb2));
        if (notification == null || this.f10222j == null) {
            return;
        }
        J3.j jVar2 = new J3.j(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f10218f;
        linkedHashMap.put(jVar, jVar2);
        if (this.f10217e == null) {
            this.f10217e = jVar;
            SystemForegroundService systemForegroundService = this.f10222j;
            systemForegroundService.f19085b.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f10222j;
        systemForegroundService2.f19085b.post(new i(systemForegroundService2, intExtra, notification, 2));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i5 |= ((J3.j) ((Map.Entry) it.next()).getValue()).f5576b;
        }
        J3.j jVar3 = (J3.j) linkedHashMap.get(this.f10217e);
        if (jVar3 != null) {
            SystemForegroundService systemForegroundService3 = this.f10222j;
            systemForegroundService3.f19085b.post(new b(systemForegroundService3, jVar3.f5575a, jVar3.f5577c, i5));
        }
    }

    public final void g() {
        this.f10222j = null;
        synchronized (this.f10216d) {
            this.f10221i.G();
        }
        this.f10214b.f6506f.g(this);
    }

    @Override // O3.b
    public final void f(List list) {
    }
}

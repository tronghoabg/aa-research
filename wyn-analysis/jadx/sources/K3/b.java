package K3;

import o3.InterfaceC3644a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6456a = new b();

    public final void a(InterfaceC3644a interfaceC3644a) {
        interfaceC3644a.c();
        try {
            interfaceC3644a.f("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - m.f6494a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            interfaceC3644a.k();
        } finally {
            interfaceC3644a.p();
        }
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class fka extends ezd {
    @Override // defpackage.ezd
    public final void a(fbl fblVar) {
        fblVar.b();
        try {
            fblVar.e(a.bI(System.currentTimeMillis() - flb.a, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"));
            fblVar.f();
        } finally {
            fblVar.d();
        }
    }
}

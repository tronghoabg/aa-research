package e.a.d;

import j$.util.Objects;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fs extends e.a.dd {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ft f46956b;

    fs(ft ftVar) {
        Objects.requireNonNull(ftVar);
        this.f46956b = ftVar;
    }

    @Override // e.a.dd
    public final String a() {
        return this.f46956b.f46958b;
    }

    @Override // e.a.dd
    public final void c() {
    }

    @Override // e.a.dd
    public final void d(e.a.dt dtVar) {
        ft ftVar = this.f46956b;
        e.a.da daVarC = e.a.db.c();
        daVarC.b(e.a.eg.c(Collections.singletonList(new e.a.ai(ftVar.f46957a))));
        daVarC.c(e.a.c.f46513a);
        dtVar.c(daVarC.a());
    }
}

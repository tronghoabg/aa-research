package e.a.d;

import j$.util.Objects;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk f46924a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fl f46925b;

    fh(fl flVar, fk fkVar) {
        this.f46924a = fkVar;
        Objects.requireNonNull(flVar);
        this.f46925b = flVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fl flVar = this.f46925b;
        if (flVar.f46935b.get() != fp.f46948g) {
            this.f46924a.o();
            return;
        }
        fp fpVar = flVar.f46934a;
        if (fpVar.I == null) {
            fpVar.I = new LinkedHashSet();
            fpVar.f46952e.c(fpVar.J, true);
        }
        fpVar.I.add(this.f46924a);
    }
}

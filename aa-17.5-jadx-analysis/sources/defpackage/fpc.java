package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes2.dex */
public final class fpc implements fjh {
    final fng a;
    final foe b;
    public final ajdr c;

    static {
        fjo.b("WMFgUpdater");
    }

    public fpc(WorkDatabase workDatabase, fng fngVar, ajdr ajdrVar) {
        this.a = fngVar;
        this.c = ajdrVar;
        this.b = workDatabase.x();
    }
}

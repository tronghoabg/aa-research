package androidx.work;

import defpackage.afco;
import defpackage.ajdr;
import defpackage.dsy;
import defpackage.fjc;
import defpackage.fjh;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class WorkerParameters {
    public final UUID a;
    public final fjc b;
    public final Executor c;
    public final afco d;
    public final fjh e;
    public final dsy f;
    public final ajdr g;

    public WorkerParameters(UUID uuid, fjc fjcVar, Collection collection, Executor executor, afco afcoVar, ajdr ajdrVar, dsy dsyVar, fjh fjhVar) {
        this.a = uuid;
        this.b = fjcVar;
        new HashSet(collection);
        this.c = executor;
        this.d = afcoVar;
        this.g = ajdrVar;
        this.f = dsyVar;
        this.e = fjhVar;
    }
}

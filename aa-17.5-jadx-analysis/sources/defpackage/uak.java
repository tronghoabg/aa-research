package defpackage;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uak implements uyl {
    public final Executor a;
    public final ackk b;
    public final tsn c;
    public final gjv d;
    public final sm e;

    public uak(sm smVar, tsn tsnVar, ackk ackkVar, Executor executor, ackk ackkVar2, ackk ackkVar3, gjv gjvVar, xxh xxhVar, ackk ackkVar4) {
        new HashSet();
        this.e = smVar;
        this.c = tsnVar;
        this.d = gjvVar;
        this.a = new zhb(executor);
        this.b = ackkVar4;
        if (((Boolean) xxhVar.d(false)).booleanValue()) {
            return;
        }
        ackkVar.a();
        ackkVar2.a();
        ackkVar3.a();
    }

    public final void a(abgi abgiVar) {
        tsn tsnVar = this.c;
        synchronized (tsnVar) {
            tsnVar.a = abgiVar;
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}

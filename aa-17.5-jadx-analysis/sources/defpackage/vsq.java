package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vsq {
    public final aezk a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public vsq(vth vthVar, xyc xycVar, xyc xycVar2, Executor executor, ackk ackkVar, wci wciVar, aezk aezkVar) {
        this.g = new AtomicBoolean(true);
        this.b = vthVar;
        this.c = xycVar;
        this.d = xycVar2;
        this.e = executor;
        this.f = wciVar.d(executor, ackkVar, null);
        this.a = aezkVar;
    }

    public vsq(voy voyVar, xxh xxhVar, tmb tmbVar, aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4) {
        this.b = voyVar;
        this.d = xxhVar;
        this.f = tmbVar;
        this.e = aezkVar;
        this.a = aezkVar2;
        this.g = aezkVar3;
        this.c = aezkVar4;
    }
}

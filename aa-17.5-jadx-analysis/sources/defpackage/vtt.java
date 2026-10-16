package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class vtt extends woy implements vsa {
    public final vry a;
    public final Context b;
    public final Executor c;
    public final aezk d;
    public final ackk e;
    public final aezk f;
    public final aezk g;
    public final aezk h;
    public final vtq i;
    public final voy j;
    public final rdx k;

    public vtt(wci wciVar, Context context, Executor executor, vtq vtqVar, aezk aezkVar, ackk ackkVar, voy voyVar, rdx rdxVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4) {
        super(null, null);
        this.a = wciVar.d(executor, ackkVar, null);
        this.b = context;
        this.c = executor;
        this.i = vtqVar;
        this.d = aezkVar;
        this.j = voyVar;
        this.k = rdxVar;
        this.e = ackkVar;
        this.f = aezkVar2;
        this.g = aezkVar3;
        this.h = aezkVar4;
    }

    @Override // defpackage.vsa
    public final void k() {
        zhk zhkVar = new zhk(new vtb(this, 3));
        Executor executor = this.c;
        executor.execute(zhkVar);
        executor.execute(new zhk(Executors.callable(new teg(this, 5), null)));
    }
}

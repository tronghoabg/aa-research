package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vui implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final acku g;
    private final acku h;
    private final acku i;
    private final acku j;
    private final acku k;
    private final acku l;
    private final acku m;

    public vui(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, acku ackuVar11, acku ackuVar12, acku ackuVar13) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
        this.g = ackuVar7;
        this.h = ackuVar8;
        this.i = ackuVar9;
        this.j = ackuVar10;
        this.k = ackuVar11;
        this.l = ackuVar12;
        this.m = ackuVar13;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = ((acks) this.b).b;
        wci wciVarA = ((vrz) this.a).a();
        Context context = (Context) obj;
        vqk vqkVar = (vqk) this.c.a();
        ackk ackkVarB = ackq.b(this.d);
        Object objA = this.e.a();
        Executor executor = (Executor) this.h.a();
        Object obj2 = ((acks) this.m).b;
        return new vuh(wciVarA, context, vqkVar, ackkVarB, (vud) objA, this.f, this.g, executor, ((vux) this.i).a(), this.j, ((vup) this.l).a(), (xxh) obj2);
    }
}

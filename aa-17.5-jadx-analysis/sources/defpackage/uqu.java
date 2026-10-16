package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes3.dex */
public final class uqu implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final acku g;
    private final /* synthetic */ int h;

    public uqu(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i) {
        this.h = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
        this.g = ackuVar7;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.h;
        if (i == 0) {
            tnr tnrVar = (tnr) this.a.a();
            xxh xxhVar = (xxh) this.c.a();
            gms gmsVar = (gms) this.d.a();
            ackq.b(this.g);
            return new rjr(tnrVar, xxhVar, gmsVar);
        }
        if (i != 1) {
            acku ackuVar = this.b;
            ackk ackkVarB = ackq.b(this.f);
            uqi uqiVar = (uqi) ackuVar.a();
            tuy tuyVar = (tuy) this.c.a();
            acku ackuVar2 = this.d;
            acku ackuVar3 = this.a;
            ackk ackkVarB2 = ackq.b(this.e);
            ackk ackkVarB3 = ackq.b(ackuVar3);
            ackq.b(ackuVar2);
            return new urc(ackkVarB, uqiVar, tuyVar, ackkVarB2, ackkVarB3);
        }
        Context context = (Context) ((acks) this.d).b;
        erb erbVar = (erb) this.c.a();
        zwm zwmVar = (zwm) this.f.a();
        Resources resources = (Resources) this.b.a();
        Object obj = ((acks) this.a).b;
        zwmVar.getClass();
        vky vkyVar = ((tnv) obj).d;
        return new uvg(context, erbVar, new uud(context.getResources(), resources, zwm.f().g));
    }

    public uqu(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, byte[] bArr) {
        this.h = i;
        this.d = ackuVar;
        this.c = ackuVar2;
        this.e = ackuVar3;
        this.f = ackuVar4;
        this.b = ackuVar5;
        this.a = ackuVar6;
        this.g = ackuVar7;
    }

    public uqu(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, char[] cArr) {
        this.h = i;
        this.f = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.e = ackuVar4;
        this.a = ackuVar5;
        this.d = ackuVar6;
        this.g = ackuVar7;
    }
}

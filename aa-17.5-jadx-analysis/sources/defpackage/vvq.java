package defpackage;

import android.content.Context;
import java.util.Random;

/* loaded from: classes.dex */
public final class vvq implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final /* synthetic */ int g;

    public vvq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i) {
        this.g = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.g;
        if (i == 0) {
            Context context = (Context) ((acks) this.b).b;
            rju rjuVar = (rju) this.f.a();
            acku ackuVar = this.e;
            acku ackuVar2 = this.d;
            return new vvp(this.a, context, this.c, ackuVar2, ackuVar, rjuVar);
        }
        if (i != 1) {
            acku ackuVar3 = this.f;
            acku ackuVar4 = this.a;
            acku ackuVar5 = this.d;
            acku ackuVar6 = this.c;
            return new rdx(this.b, this.e, ackuVar6, ackuVar5, ackuVar4, ackuVar3);
        }
        acku ackuVar7 = this.a;
        Object objA = this.c.a();
        zgt zgtVar = (zgt) ackuVar7.a();
        Random random = (Random) this.f.a();
        acku ackuVar8 = this.e;
        return new rdx((vsq) objA, zgtVar, random, this.b, this.d, ackuVar8);
    }

    public vvq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, byte[] bArr) {
        this.g = i;
        this.c = ackuVar;
        this.a = ackuVar2;
        this.f = ackuVar3;
        this.b = ackuVar4;
        this.d = ackuVar5;
        this.e = ackuVar6;
    }

    public vvq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, char[] cArr) {
        this.g = i;
        this.b = ackuVar;
        this.e = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.a = ackuVar5;
        this.f = ackuVar6;
    }
}

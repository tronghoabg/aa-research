package defpackage;

import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pvv implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final /* synthetic */ int f;

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i) {
        this.f = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.f;
        if (i == 0) {
            acku ackuVar = this.e;
            acku ackuVar2 = this.d;
            acku ackuVar3 = this.c;
            return new ajdr(this.a, this.b, ackuVar3, ackuVar2, ackuVar);
        }
        if (i == 1) {
            Context context = (Context) this.d.a();
            tmb tmbVar = (tmb) this.c.a();
            acku ackuVar4 = this.e;
            acku ackuVar5 = this.a;
            xxh xxhVarB = ((uyq) this.b).b();
            zgt zgtVarB = ((uxv) ackuVar5).b();
            htm htmVarA = ((vam) ackuVar4).a();
            vaq.d();
            return new pqo(context, tmbVar, xxhVarB, zgtVarB, xxh.h(htmVarA));
        }
        if (i == 2) {
            tmb tmbVar2 = (tmb) this.b.a();
            qap qapVar = (qap) this.c.a();
            ackq.b(this.a);
            return new ajdr(tmbVar2, qapVar, (qau) this.e.a(), (xxh) ((acks) this.d).b);
        }
        int i2 = 3;
        if (i == 3) {
            ((uvv) this.c).a();
            return xvy.a;
        }
        if (i == 4) {
            ackq.b(this.b);
            return xvy.a;
        }
        if (i == 5) {
            return new ugq((pkx) this.a.a(), (tmb) this.b.a(), wub.L(new qeq((Context) this.d.a(), ackq.b(this.e), ackq.b(this.c), i2)));
        }
        Object obj = ((acks) this.c).b;
        acku ackuVar6 = this.a;
        acku ackuVar7 = this.d;
        zgt zgtVarB2 = ((uxv) this.e).b();
        zgt zgtVarB3 = ((uxv) ackuVar7).b();
        zgt zgtVarB4 = ((uxv) ackuVar6).b();
        ul ulVar = new ul();
        ulVar.e = zgtVarB3;
        ulVar.a = zgtVarB2;
        ulVar.c = zgtVarB4;
        ulVar.d = this.b;
        ((ygp) ulVar.b).k((Set) obj);
        ulVar.a.getClass();
        ulVar.e.getClass();
        ulVar.c.getClass();
        ulVar.d.getClass();
        return new zhw(ulVar);
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, byte[] bArr) {
        this.f = i;
        this.d = ackuVar;
        this.c = ackuVar2;
        this.b = ackuVar3;
        this.a = ackuVar4;
        this.e = ackuVar5;
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, char[] cArr) {
        this.f = i;
        this.b = ackuVar;
        this.c = ackuVar2;
        this.a = ackuVar3;
        this.e = ackuVar4;
        this.d = ackuVar5;
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, float[] fArr) {
        this.f = i;
        this.e = ackuVar;
        this.d = ackuVar2;
        this.a = ackuVar3;
        this.b = ackuVar4;
        this.c = ackuVar5;
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, int[] iArr) {
        this.f = i;
        this.a = ackuVar;
        this.c = ackuVar2;
        this.e = ackuVar3;
        this.d = ackuVar4;
        this.b = ackuVar5;
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, short[] sArr) {
        this.f = i;
        this.d = ackuVar;
        this.e = ackuVar2;
        this.c = ackuVar3;
        this.a = ackuVar4;
        this.b = ackuVar5;
    }

    public pvv(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, boolean[] zArr) {
        this.f = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.d = ackuVar3;
        this.e = ackuVar4;
        this.c = ackuVar5;
    }
}

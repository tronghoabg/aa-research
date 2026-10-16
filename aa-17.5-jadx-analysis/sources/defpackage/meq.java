package defpackage;

/* loaded from: classes2.dex */
public final class meq extends afde implements afeh {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq(afck afckVar, int i) {
        super(3, afckVar);
        this.b = i;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            woy.dF(obj);
            ((ynz) ((ynz) mer.a.h()).p((Throwable) this.a).ai(4815)).u("Ignoring crash creating favorite models");
            return afak.a;
        }
        if (i != 1) {
            woy.dF(obj);
            ((ynz) ((ynz) mfa.b.h()).p((Throwable) this.a).ai(4825)).u("Ignoring crash creating recent call models");
            return afak.a;
        }
        woy.dF(obj);
        ((ynz) ((ynz) mej.b.h()).p((Throwable) this.a).ai(4808)).u("Ignoring crash creating contact models");
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i == 0) {
            meq meqVar = new meq((afck) obj3, 0);
            meqVar.a = (Throwable) obj2;
            return meqVar.hT(afak.a);
        }
        if (i != 1) {
            meq meqVar2 = new meq((afck) obj3, 2, (char[]) null);
            meqVar2.a = (Throwable) obj2;
            return meqVar2.hT(afak.a);
        }
        meq meqVar3 = new meq((afck) obj3, 1, (byte[]) null);
        meqVar3.a = (Throwable) obj2;
        return meqVar3.hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq(afck afckVar, int i, byte[] bArr) {
        super(3, afckVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq(afck afckVar, int i, char[] cArr) {
        super(3, afckVar);
        this.b = i;
    }
}

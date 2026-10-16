package defpackage;

/* loaded from: classes2.dex */
public final class kvt extends afde implements afeh {
    int a;
    /* synthetic */ int b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvt(afck afckVar, int i) {
        super(3, afckVar);
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aqf, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i;
        int i2 = this.d;
        if (i2 == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                ?? r6 = this.c;
                int i3 = this.b;
                kvv kvvVar = kvv.a;
                this.a = 1;
                if (kvvVar.a(r6, i3, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i2 == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                ?? r62 = this.c;
                int i4 = this.b;
                gck gckVar = gck.a;
                this.a = 1;
                if (gckVar.a(r62, i4, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        afcr afcrVar3 = afcr.a;
        if (this.a != 0) {
            i = this.b;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            Object obj2 = this.c;
            int i5 = this.b;
            kvv kvvVar2 = kvv.a;
            afeh afehVar = kvv.b;
            Integer num = new Integer(i5);
            this.b = i5;
            this.a = 1;
            if (afehVar.invoke(obj2, num, this) == afcrVar3) {
                return afcrVar3;
            }
            i = i5;
        }
        ebf.j().o(yzz.NOTIFICATION_CENTER, i > 0 ? yzy.lB : yzy.lA);
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        if (i == 0) {
            int iIntValue = ((Number) obj2).intValue();
            kvt kvtVar = new kvt((afck) obj3, 0);
            kvtVar.c = (aqf) obj;
            kvtVar.b = iIntValue;
            return kvtVar.hT(afak.a);
        }
        if (i != 1) {
            int iIntValue2 = ((Number) obj2).intValue();
            kvt kvtVar2 = new kvt((afck) obj3, 2, (char[]) null);
            kvtVar2.c = (aqf) obj;
            kvtVar2.b = iIntValue2;
            return kvtVar2.hT(afak.a);
        }
        int iIntValue3 = ((Number) obj2).intValue();
        kvt kvtVar3 = new kvt((afck) obj3, 1, (byte[]) null);
        kvtVar3.c = (aqf) obj;
        kvtVar3.b = iIntValue3;
        return kvtVar3.hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvt(afck afckVar, int i, byte[] bArr) {
        super(3, afckVar);
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvt(afck afckVar, int i, char[] cArr) {
        super(3, afckVar);
        this.d = i;
    }
}

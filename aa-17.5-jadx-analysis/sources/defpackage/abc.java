package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class abc implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ abc(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ca.W();
            case 1:
                return null;
            case 2:
            case 11:
                return obj;
            case 3:
                return ca.W();
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                Integer num2 = (Integer) obj;
                num2.intValue();
                return num2;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 10:
                return new bii(ayv.b, new ado((clh) obj, 1), (byte[]) null);
            case 12:
                aft aftVar = acl.a;
                return new dlq(0L);
            case 13:
                aft aftVar2 = acl.a;
                return new dlo(0L);
            case 14:
                dlq dlqVar = (dlq) obj;
                aft aftVar3 = acl.a;
                return dlqVar;
            case 15:
                long j = ((cla) obj).a;
                long j2 = j >> 32;
                aft aftVar4 = acl.a;
                return new aef(Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 16:
                aef aefVar = (aef) obj;
                aft aftVar5 = acl.a;
                return new cla(roc.aA(aefVar.a, aefVar.b));
            case 17:
                ((Integer) obj).intValue();
                aft aftVar6 = acl.a;
                return 0;
            case 18:
                ((Integer) obj).intValue();
                aft aftVar7 = acl.a;
                return 0;
            case 19:
                aft aftVar8 = acl.a;
                return new aft(1.0f, 1500.0f, null);
            default:
                ((Integer) obj).intValue();
                aft aftVar9 = acl.a;
                return 0;
        }
    }
}

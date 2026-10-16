package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nox implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nox(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = 14;
        afha afhaVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        boolean z = false;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.a) {
            case 0:
                ugn ugnVar = (ugn) obj;
                ugnVar.getClass();
                return ugnVar.a;
            case 1:
                ugn ugnVar2 = (ugn) obj;
                ugnVar2.getClass();
                return ugnVar2.h;
            case 2:
                kjz kjzVar = (kjz) obj;
                noz nozVar = npc.a;
                kjzVar.getClass();
                return new npe(kjzVar, (afha) (objArr2 == true ? 1 : 0), (afec) (objArr == true ? 1 : 0), i);
            case 3:
                kjz kjzVar2 = (kjz) obj;
                noz nozVar2 = npc.a;
                kjzVar2.getClass();
                return new npy(kjzVar2);
            case 4:
                kjz kjzVar3 = (kjz) obj;
                noz nozVar3 = npc.a;
                kjzVar3.getClass();
                return new npy(kjzVar3);
            case 5:
                kjz kjzVar4 = (kjz) obj;
                noz nozVar4 = npc.a;
                kjzVar4.getClass();
                return new npy(kjzVar4);
            case 6:
                kjz kjzVar5 = (kjz) obj;
                noz nozVar5 = npc.a;
                kjzVar5.getClass();
                return new npy(kjzVar5);
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                noz nozVar6 = npc.a;
                return Integer.valueOf(afpt.e(iIntValue, 0));
            case 8:
                kjz kjzVar6 = (kjz) obj;
                noz nozVar7 = npc.a;
                kjzVar6.getClass();
                return new npe(kjzVar6, afhaVar, (afec) (objArr3 == true ? 1 : 0), i);
            case 9:
                int i2 = -((Integer) obj).intValue();
                noz nozVar8 = npc.a;
                return Integer.valueOf(afpt.e(i2, 0));
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                noz nozVar9 = npc.a;
                return Integer.valueOf(-iIntValue2);
            case 11:
                kjz kjzVar7 = (kjz) obj;
                noz nozVar10 = npc.a;
                kjzVar7.getClass();
                return new npy(kjzVar7);
            case 12:
                kjz kjzVar8 = (kjz) obj;
                noz nozVar11 = npc.a;
                kjzVar8.getClass();
                return new npi(kjzVar8);
            case 13:
                int iIntValue3 = ((Integer) obj).intValue();
                noz nozVar12 = npc.a;
                return Integer.valueOf(afpt.e(iIntValue3, 0));
            case 14:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 15:
                Integer num2 = (Integer) obj;
                num2.intValue();
                return num2;
            case 16:
                return lxr.q(((Integer) obj).intValue());
            case 17:
                mqc mqcVar = (mqc) obj;
                nqa nqaVar = nqd.a;
                int i3 = 6;
                return mqcVar == null ? new nqb(z, (int) (objArr6 == true ? 1 : 0), i3) : mqcVar.b == mpz.b ? new nqb((boolean) (objArr5 == true ? 1 : 0), (int) (objArr4 == true ? 1 : 0), i3) : new nqb(true, 3, mqcVar.a());
            case 18:
                nqd.b.l().y("Main content covering maps = %b", (nqb) obj);
                return obj;
            case 19:
                nqd.b.l().y("Immersives use fullscreen = %b", (nqb) obj);
                return obj;
            default:
                Integer num3 = (Integer) obj;
                num3.intValue();
                return num3;
        }
    }
}

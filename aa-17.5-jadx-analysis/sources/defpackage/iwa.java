package defpackage;

/* loaded from: classes2.dex */
public final class iwa {
    public static final yph a = yph.c("CAR.INPUT.VIRTUAL");
    public final xju b;
    public ivz[] c;
    public ivz[] d;
    public ivz[] e;
    public ivz[] f;
    private final ajmd g;

    public iwa(ajmd ajmdVar) {
        abnp abnpVarN = xju.a.n();
        abnpVarN.t();
        xju xjuVar = (xju) abnpVarN.b;
        xjuVar.b |= 2;
        xjuVar.d = 0;
        abnpVarN.t();
        xju xjuVar2 = (xju) abnpVarN.b;
        xjuVar2.b |= 1;
        xjuVar2.c = 0;
        abnpVarN.t();
        xju xjuVar3 = (xju) abnpVarN.b;
        xjuVar3.b |= 16;
        xjuVar3.g = 0;
        abnpVarN.t();
        xju xjuVar4 = (xju) abnpVarN.b;
        xjuVar4.b |= 8;
        xjuVar4.f = 0;
        abnpVarN.t();
        xju xjuVar5 = (xju) abnpVarN.b;
        xjuVar5.b |= 128;
        xjuVar5.j = 1;
        abnpVarN.t();
        xju xjuVar6 = (xju) abnpVarN.b;
        xjuVar6.b |= 4;
        xjuVar6.e = true;
        this.b = (xju) abnpVarN.q();
        this.g = ajmdVar;
    }

    public static final ivz[] b(int i, int i2) {
        ivz[] ivzVarArr = new ivz[5];
        ivzVarArr[0] = new ivz(0, 0);
        ivzVarArr[1] = new ivz((int) (i * 0.05d), (int) (i2 * 0.05d));
        for (int i3 = 0; i3 < 3; i3++) {
            ivzVarArr[i3 + 2] = new ivz(i == 0 ? 0 : i + i3, i2 == 0 ? 0 : i2 + i3);
        }
        return ivzVarArr;
    }

    private static final xom c(int i, int i2, int i3) {
        abnp abnpVarN = xom.a.n();
        abnp abnpVarN2 = xol.a.n();
        abnpVarN2.t();
        xol xolVar = (xol) abnpVarN2.b;
        xolVar.b |= 4;
        xolVar.e = 0;
        abnpVarN2.t();
        xol xolVar2 = (xol) abnpVarN2.b;
        xolVar2.b |= 1;
        xolVar2.c = i;
        abnpVarN2.t();
        xol xolVar3 = (xol) abnpVarN2.b;
        xolVar3.b |= 2;
        xolVar3.d = i2;
        xol xolVar4 = (xol) abnpVarN2.q();
        abnpVarN.t();
        xom xomVar = (xom) abnpVarN.b;
        xolVar4.getClass();
        aboh abohVar = xomVar.c;
        if (!abohVar.c()) {
            xomVar.c = abnv.I(abohVar);
        }
        xomVar.c.add(xolVar4);
        abnpVarN.t();
        xom xomVar2 = (xom) abnpVarN.b;
        xomVar2.b |= 1;
        xomVar2.d = 0;
        abnpVarN.t();
        xom xomVar3 = (xom) abnpVarN.b;
        xomVar3.e = i3 - 1;
        xomVar3.b |= 2;
        return (xom) abnpVarN.q();
    }

    public final void a(ivz[] ivzVarArr) {
        int length = ivzVarArr.length;
        ivz ivzVar = ivzVarArr[0];
        int i = 1;
        xom xomVarC = c(ivzVar.a, ivzVar.b, 1);
        ajmd ajmdVar = this.g;
        ajmdVar.K(xomVarC);
        while (true) {
            int length2 = ivzVarArr.length;
            if (i >= 4) {
                ivz ivzVar2 = ivzVarArr[4];
                ajmdVar.K(c(ivzVar2.a, ivzVar2.b, 2));
                return;
            } else {
                ivz ivzVar3 = ivzVarArr[i];
                ajmdVar.K(c(ivzVar3.a, ivzVar3.b, 3));
                i++;
            }
        }
    }
}

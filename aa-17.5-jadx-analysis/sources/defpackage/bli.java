package defpackage;

/* loaded from: classes.dex */
public final class bli extends afde implements afec {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(adu aduVar, afck afckVar, int i) {
        super(1, afckVar);
        this.b = i;
        this.a = aduVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            woy.dF(obj);
            ((blr) this.a).s = false;
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            ((adu) this.a).g();
            return afak.a;
        }
        if (i == 2) {
            woy.dF(obj);
            ((blr) this.a).z();
            return afak.a;
        }
        if (i != 3) {
            woy.dF(obj);
            ((blr) this.a).A();
            return afak.a;
        }
        woy.dF(obj);
        blr blrVar = (blr) this.a;
        blrVar.y(blrVar.s);
        return afak.a;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        if (i == 0) {
            return new bli((blr) this.a, (afck) obj, 0).hT(afak.a);
        }
        if (i == 1) {
            return new bli((adu) this.a, (afck) obj, 1).hT(afak.a);
        }
        if (i == 2) {
            return new bli((blr) this.a, (afck) obj, 2, (byte[]) null).hT(afak.a);
        }
        if (i != 3) {
            return new bli((blr) this.a, (afck) obj, 4, (short[]) null).hT(afak.a);
        }
        return new bli((blr) this.a, (afck) obj, 3, (char[]) null).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(blr blrVar, afck afckVar, int i) {
        super(1, afckVar);
        this.b = i;
        this.a = blrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(blr blrVar, afck afckVar, int i, byte[] bArr) {
        super(1, afckVar);
        this.b = i;
        this.a = blrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(blr blrVar, afck afckVar, int i, char[] cArr) {
        super(1, afckVar);
        this.b = i;
        this.a = blrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bli(blr blrVar, afck afckVar, int i, short[] sArr) {
        super(1, afckVar);
        this.b = i;
        this.a = blrVar;
    }
}

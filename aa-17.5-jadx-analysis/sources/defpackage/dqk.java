package defpackage;

/* loaded from: classes.dex */
public final class dqk extends dqs {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
  0x00e4: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:74:0x00df, B:76:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    @Override // defpackage.dqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.doy r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqk.a(doy, boolean):void");
    }

    @Override // defpackage.dqn
    public final boolean ay() {
        return true;
    }

    public final int b() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.aM;
            if (i4 >= i) {
                break;
            }
            dqn dqnVar = this.aL[i4];
            if ((this.b || dqnVar.ay()) && ((((i2 = this.a) == 0 || i2 == 1) && !dqnVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !dqnVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aM; i5++) {
            dqn dqnVar2 = this.aL[i5];
            if (this.b || dqnVar2.ay()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = dqnVar2.U(2).a();
                    } else if (i6 == 1) {
                        iMax = dqnVar2.U(4).a();
                    } else if (i6 == 2) {
                        iMax = dqnVar2.U(3).a();
                    } else if (i6 == 3) {
                        iMax = dqnVar2.U(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, dqnVar2.U(2).a());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, dqnVar2.U(4).a());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, dqnVar2.U(3).a());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, dqnVar2.U(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            z(i8, i8);
        } else {
            A(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.dqn
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.dqn
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dqn
    public final String toString() {
        String strConcat = "[Barrier] " + this.as + " {";
        for (int i = 0; i < this.aM; i++) {
            dqn dqnVar = this.aL[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(String.valueOf(dqnVar.as));
        }
        return strConcat.concat("}");
    }
}

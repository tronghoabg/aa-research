package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bfr implements defpackage.affc {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bfr(defpackage.alk alkVar, int i, defpackage.cux cuxVar, int i2) {
        this.d = i2;
        this.b = alkVar;
        this.a = i;
        this.c = cuxVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Type inference failed for: r3v5, types: [cub, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.bvh bvhVar;
        int i;
        int i2 = this.d;
        int i3 = 0;
        if (i2 == 0) {
            defpackage.bfs bfsVar = (defpackage.bfs) this.b;
            defpackage.cuw cuwVar = (defpackage.cuw) obj;
            defpackage.bfi bfiVar = (defpackage.bfi) bfsVar.d.invoke();
            defpackage.dga dgaVar = bfiVar != null ? bfiVar.a : null;
            defpackage.dkg dkgVar = bfsVar.c;
            int i4 = bfsVar.b;
            int i5 = this.a;
            defpackage.cux cuxVar = (defpackage.cux) this.c;
            defpackage.cjj cjjVarP = defpackage.asq.P(cuwVar, i4, dkgVar, dgaVar, false, cuxVar.a);
            defpackage.bff bffVar = bfsVar.a;
            bffVar.e(defpackage.apn.a, cjjVarP, i5, cuxVar.b);
            cuwVar.x(cuxVar, 0, java.lang.Math.round(-bffVar.b()));
            return defpackage.afbk.a;
        }
        int i6 = 1;
        if (i2 == 1) {
            defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
            defpackage.alk alkVar = (defpackage.alk) this.b;
            int iC = alkVar.a.c();
            if (iC < 0) {
                iC = 0;
            }
            int i7 = this.a;
            if (iC > i7) {
                iC = i7;
            }
            boolean z = alkVar.b;
            int i8 = -iC;
            cuwVar2.w(new defpackage.avb(this.c, true != z ? i8 : 0, true != z ? 0 : i8, i6));
            return defpackage.afbk.a;
        }
        if (i2 != 2) {
            defpackage.cuw cuwVar3 = (defpackage.cuw) obj;
            cuwVar3.getClass();
            ?? r3 = this.b;
            java.lang.Object obj2 = this.c;
            if (r3.p() == defpackage.dlz.b) {
                defpackage.cux cuxVar2 = (defpackage.cux) obj2;
                cuwVar3.r(cuxVar2, this.a - cuxVar2.a, 0, 0.0f);
            } else {
                cuwVar3.r((defpackage.cux) obj2, 0, 0, 0.0f);
            }
            return defpackage.afbk.a;
        }
        defpackage.bvh bvhVar2 = (defpackage.bvh) obj;
        java.lang.Object obj3 = this.c;
        defpackage.bxl bxlVar = (defpackage.bxl) obj3;
        int i9 = bxlVar.d;
        int i10 = this.a;
        if (i9 == i10) {
            java.lang.Object obj4 = this.b;
            if (defpackage.afga.f(obj4, bxlVar.f) && (bvhVar2 instanceof defpackage.bvk)) {
                defpackage.aal aalVar = (defpackage.aal) obj4;
                long[] jArr = aalVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = i11 - length;
                            int i13 = i3;
                            while (true) {
                                i = 8 - ((~i12) >>> 31);
                                if (i13 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    java.lang.Object obj5 = aalVar.b[i14];
                                    if (aalVar.c[i14] != i10) {
                                        defpackage.bvk bvkVar = (defpackage.bvk) bvhVar2;
                                        defpackage.aau aauVar = bvkVar.l;
                                        defpackage.bzg.c(aauVar, obj5, obj3);
                                        if (obj5 instanceof defpackage.bvr) {
                                            defpackage.bvr bvrVar = (defpackage.bvr) obj5;
                                            if (!defpackage.aau.f(aauVar, bvrVar)) {
                                                defpackage.bzg.b(bvkVar.m, bvrVar);
                                            }
                                            defpackage.aau aauVar2 = bxlVar.g;
                                            if (aauVar2 != null) {
                                                aauVar2.i(obj5);
                                            }
                                        }
                                        aalVar.f(i14);
                                    }
                                }
                                j >>= 8;
                                i13++;
                                bvhVar2 = bvhVar2;
                            }
                            bvhVar = bvhVar2;
                            if (i != 8) {
                                break;
                            }
                        } else {
                            bvhVar = bvhVar2;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        bvhVar2 = bvhVar;
                        i3 = 0;
                    }
                }
            }
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bfr(defpackage.bxl bxlVar, int i, defpackage.aal aalVar, int i2) {
        this.d = i2;
        this.c = bxlVar;
        this.a = i;
        this.b = aalVar;
    }

    public /* synthetic */ bfr(java.lang.Object obj, defpackage.cux cuxVar, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = cuxVar;
        this.a = i;
    }
}

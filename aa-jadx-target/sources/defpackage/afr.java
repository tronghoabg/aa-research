package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afr implements defpackage.aey {
    public final defpackage.skb a;

    public afr(defpackage.skb skbVar) {
        this.a = skbVar;
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [affc, java.lang.Object] */
    @Override // defpackage.afd
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahe c(defpackage.bil bilVar) {
        int i;
        int[] iArr;
        java.lang.Object[] objArr;
        long[] jArr;
        int i2;
        defpackage.skb skbVar = this.a;
        defpackage.zo zoVar = (defpackage.zo) skbVar.b;
        defpackage.zm zmVar = new defpackage.zm(zoVar.e + 2);
        defpackage.zo zoVar2 = new defpackage.zo(zoVar.e);
        int[] iArr2 = zoVar.b;
        java.lang.Object[] objArr2 = zoVar.c;
        long[] jArr2 = zoVar.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr2[i6];
                            defpackage.afq afqVar = (defpackage.afq) objArr2[i6];
                            zmVar.e(i7);
                            defpackage.aep aepVar = (defpackage.aep) bilVar.b.invoke(afqVar.a);
                            defpackage.aez aezVar = afqVar.b;
                            int i8 = afqVar.c;
                            zoVar2.g(i7, new defpackage.ahd(aepVar, aezVar));
                        }
                        j >>= 8;
                        i5++;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                    jArr = jArr2;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr2 = iArr;
                objArr2 = objArr;
                jArr2 = jArr;
            }
        }
        if (!zoVar.b(0)) {
            if (zmVar.b < 0) {
                defpackage.ca.aa("Index must be between 0 and size");
            }
            zmVar.c(zmVar.b + 1);
            int[] iArr3 = zmVar.a;
            int i9 = zmVar.b;
            if (i9 != 0) {
                iArr3.getClass();
                iArr3.getClass();
                i = 0;
                java.lang.System.arraycopy(iArr3, 0, iArr3, 1, i9);
            } else {
                i = 0;
            }
            iArr3[i] = i;
            zmVar.b++;
        }
        if (!zoVar.b(skbVar.a)) {
            zmVar.e(skbVar.a);
        }
        zmVar.d();
        return new defpackage.ahe(zmVar, zoVar2, skbVar.a, defpackage.afc.d);
    }
}

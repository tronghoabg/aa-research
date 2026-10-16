package defpackage;

/* loaded from: classes.dex */
public final class afk implements aer {
    public final sjg a;

    public afk(sjg sjgVar) {
        this.a = sjgVar;
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [afec, java.lang.Object] */
    @Override // defpackage.aew
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final agx c(bii biiVar) {
        int i;
        int[] iArr;
        Object[] objArr;
        long[] jArr;
        int i2;
        int[] iArr2;
        Object[] objArr2;
        long[] jArr2;
        char c;
        sjg sjgVar = this.a;
        zh zhVar = (zh) sjgVar.b;
        zf zfVar = new zf(zhVar.e + 2);
        zh zhVar2 = new zh(zhVar.e);
        int[] iArr3 = zhVar.b;
        Object[] objArr3 = zhVar.c;
        long[] jArr3 = zhVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr3[i3];
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
                            int i7 = iArr3[i6];
                            afj afjVar = (afj) objArr3[i6];
                            zfVar.e(i7);
                            iArr2 = iArr3;
                            c = '\b';
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            aei aeiVar = (aei) biiVar.b.invoke(afjVar.a);
                            aes aesVar = afjVar.b;
                            int i8 = afjVar.c;
                            zhVar2.g(i7, new agw(aeiVar, aesVar));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            c = '\b';
                        }
                        j >>= c;
                        i5++;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr3 = iArr;
                objArr3 = objArr;
                jArr3 = jArr;
            }
        }
        if (!zhVar.b(0)) {
            if (zfVar.b < 0) {
                ca.aa("Index must be between 0 and size");
            }
            zfVar.c(zfVar.b + 1);
            int[] iArr4 = zfVar.a;
            int i9 = zfVar.b;
            if (i9 != 0) {
                iArr4.getClass();
                iArr4.getClass();
                i = 0;
                System.arraycopy(iArr4, 0, iArr4, 1, i9);
            } else {
                i = 0;
            }
            iArr4[i] = i;
            zfVar.b++;
        }
        if (!zhVar.b(sjgVar.a)) {
            zfVar.e(sjgVar.a);
        }
        zfVar.d();
        return new agx(zfVar, zhVar2, sjgVar.a, aev.d);
    }
}

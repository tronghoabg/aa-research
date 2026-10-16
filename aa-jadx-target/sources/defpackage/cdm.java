package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdm implements defpackage.cdo {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final defpackage.aau d = new defpackage.aau(6);

    public final void a() {
        if (this.b) {
            return;
        }
        if (this.c) {
            defpackage.cdp.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        b();
        this.c = true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[LOOP:0: B:5:0x000d->B:26:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[EDGE_INSN: B:30:0x0069->B:27:0x0069 BREAK  A[LOOP:0: B:5:0x000d->B:26:0x0066], SYNTHETIC] */
    public final void b() {
        int i;
        defpackage.aau aauVar = this.d;
        java.lang.Object[] objArr = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            if (obj instanceof defpackage.aan) {
                                obj.getClass();
                                defpackage.aan aanVar = (defpackage.aan) obj;
                                java.lang.Object[] objArr2 = aanVar.a;
                                int i5 = aanVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    java.lang.Object obj2 = objArr2[i6];
                                    if (obj2 instanceof cdn) {
                                        ((cdn) obj2).a();
                                    }
                                }
                            } else if (obj instanceof cdn) {
                                ((cdn) obj).a();
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        aauVar.k();
    }
}

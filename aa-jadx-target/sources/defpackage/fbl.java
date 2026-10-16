package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fbl {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public fbl(byte[] bArr) {
        this.a = new defpackage.dki(null);
        this.b = new defpackage.aab(16);
    }

    public static defpackage.zbd d(ouu ouuVar) {
        int iOrdinal = ouuVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.zbd.xD;
        }
        if (iOrdinal == 1) {
            return defpackage.zbd.xE;
        }
        if (iOrdinal == 2) {
            return defpackage.zbd.xF;
        }
        if (iOrdinal == 3) {
            return defpackage.zbd.xG;
        }
        if (iOrdinal == 4) {
            return defpackage.zbd.xH;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public static defpackage.zbd e(defpackage.ouz ouzVar) {
        switch (ouzVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.zbd.xR;
            case 1:
                return defpackage.zbd.xS;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.zbd.xT;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.zbd.xU;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.zbd.xV;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.zbd.xW;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.zbd.xX;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.zbd.xY;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.zbd.xZ;
            case 9:
                return defpackage.zbd.ya;
            case 10:
                return defpackage.zbd.yb;
            case 11:
                return defpackage.zbd.yc;
            case 12:
                return defpackage.zbd.yd;
            case 13:
                return defpackage.zbd.ye;
            case 14:
                return defpackage.zbd.yf;
            case 15:
                return defpackage.zbd.yg;
            case 16:
                return defpackage.zbd.yh;
            case 17:
                return defpackage.zbd.yi;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public final void a() {
        ((defpackage.fbq) this.a).a();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: all -> 0x00cb, LOOP:0: B:19:0x0051->B:41:0x00b9, LOOP_END, TryCatch #0 {, blocks: (B:16:0x0040, B:19:0x0051, B:21:0x0061, B:22:0x0064, B:24:0x006d, B:26:0x0077, B:29:0x008a, B:31:0x0093, B:36:0x00a1, B:37:0x00ac, B:38:0x00b1, B:41:0x00b9, B:43:0x00be, B:45:0x00c4), top: B:55:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc A[EDGE_INSN: B:58:0x00bc->B:42:0x00bc BREAK  A[LOOP:0: B:19:0x0051->B:41:0x00b9], SYNTHETIC] */
    public final void b(android.os.Bundle bundle) {
        int i;
        android.os.Bundle bundleB;
        android.os.Bundle bundle2;
        java.lang.Object obj = this.a;
        defpackage.fbq fbqVar = (defpackage.fbq) obj;
        if (!fbqVar.b) {
            fbqVar.a();
        }
        if (fbqVar.a.getLifecycle().a().a(defpackage.epx.d)) {
            defpackage.epx epxVarA = fbqVar.a.getLifecycle().a();
            java.util.Objects.toString(epxVarA);
            throw new java.lang.IllegalStateException("performRestore cannot be called when owner is ".concat(java.lang.String.valueOf(epxVarA)));
        }
        if (fbqVar.d) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.");
        }
        android.os.Bundle bundleB2 = (bundle == null || !bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) ? null : defpackage.fbh.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        fbqVar.c = bundleB2;
        fbqVar.d = true;
        synchronized (fbqVar.g) {
            defpackage.aau aauVar = ((defpackage.fbq) obj).f;
            java.lang.Object[] objArr = aauVar.b;
            java.lang.Object[] objArr2 = aauVar.c;
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
                            if ((j & 255) < 128) {
                                int i5 = (i2 << 3) + i4;
                                java.lang.Object obj2 = objArr[i5];
                                fbn fbnVar = (defpackage.fbj) objArr2[i5];
                                java.lang.String str = (java.lang.String) obj2;
                                if (fbnVar instanceof fbn) {
                                    if (bundleB2 != null) {
                                        str.getClass();
                                        bundleB = bundleB2.containsKey(str) ? defpackage.fbh.b(bundleB2, str) : null;
                                        bundle2 = bundleB2;
                                    } else {
                                        bundleB = null;
                                        bundle2 = null;
                                    }
                                    if (bundleB != null) {
                                        bundle2.getClass();
                                        str.getClass();
                                        bundle2.remove(str);
                                    }
                                    fbnVar.a();
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
            if (bundleB2 != null && bundleB2.isEmpty()) {
                ((defpackage.fbq) obj).c = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[LOOP:0: B:10:0x002e->B:21:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[EDGE_INSN: B:33:0x0076->B:22:0x0076 BREAK  A[LOOP:0: B:10:0x002e->B:21:0x0073], SYNTHETIC] */
    public final void c(android.os.Bundle bundle) {
        int i;
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        java.lang.Object obj = this.a;
        defpackage.fbq fbqVar = (defpackage.fbq) obj;
        android.os.Bundle bundle2 = fbqVar.c;
        if (bundle2 != null) {
            bundleU.putAll(bundle2);
        }
        synchronized (fbqVar.g) {
            defpackage.aau aauVar = ((defpackage.fbq) obj).f;
            java.lang.Object[] objArr = aauVar.b;
            java.lang.Object[] objArr2 = aauVar.c;
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
                                int i5 = (i2 << 3) + i4;
                                java.lang.String str = (java.lang.String) objArr[i5];
                                android.os.Bundle bundleA = ((defpackage.fbj) objArr2[i5]).a();
                                str.getClass();
                                bundleA.getClass();
                                bundleU.putBundle(str, bundleA);
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
        }
        if (bundleU.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleU);
    }

    public final void f(defpackage.zbd zbdVar, int i) {
        if (i == 0) {
            return;
        }
        ((defpackage.ldx) this.a).n((defpackage.rrw) defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.MICROPHONE_DIAGNOSTICS, zbdVar).l(), i);
    }

    public final void g(defpackage.zbd zbdVar) {
        ((defpackage.ldx) this.a).n((defpackage.rrw) defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.MICROPHONE_DIAGNOSTICS_ORPHANED_EVENT, zbdVar).l(), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jfo] */
    public final synchronized void h() {
        ((defpackage.ldx) this.a).o(this.b);
    }

    public final boolean i() {
        return defpackage.afga.f(((defpackage.fbl) this.a).k(), this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [djy, java.lang.Object] */
    public final void j(defpackage.dkd dkdVar, defpackage.dkd dkdVar2) {
        if (i()) {
            this.b.g(dkdVar, dkdVar2);
        }
    }

    public final defpackage.fbl k() {
        return (defpackage.fbl) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
    }

    public fbl(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public fbl(defpackage.jdb jdbVar, defpackage.jdb jdbVar2) {
        this.a = jdbVar;
        this.b = jdbVar2;
    }

    public fbl(defpackage.jfo jfoVar) {
        this.a = new defpackage.ldx((short[]) null);
        this.b = jfoVar;
    }

    public fbl(defpackage.fbq fbqVar) {
        this.a = fbqVar;
        this.b = new defpackage.fbk(fbqVar);
    }

    public fbl() {
        this(defpackage.jdc.c, (defpackage.jdb) new defpackage.jdn(0));
    }

    public fbl(defpackage.djy djyVar) {
        this.b = djyVar;
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
    }
}

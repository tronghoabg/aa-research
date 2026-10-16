package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nub {
    public java.lang.Object a;

    public nub(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new java.lang.ref.WeakReference(null);
    }

    public final synchronized int a() {
        int i;
        i = 0;
        for (java.lang.Object obj = this.a; ((defpackage.jkm) obj).a != null; obj = ((defpackage.jkm) obj).a) {
            i++;
        }
        return i;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized defpackage.jkm b() {
        if (((defpackage.jkm) this.a).a == null) {
            return null;
        }
        java.lang.Object obj = this.a;
        this.a = ((defpackage.jkm) obj).a;
        return (defpackage.jkm) obj;
    }

    public final synchronized defpackage.jkm c() {
        if (((defpackage.jkm) this.a).a == null) {
            return null;
        }
        return (defpackage.jkm) this.a;
    }

    public final synchronized void d() {
        while (((defpackage.jkm) this.a).a != null) {
            this.a = ((defpackage.jkm) this.a).a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[LOOP:0: B:20:0x0045->B:31:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x007e A[EDGE_INSN: B:49:0x007e->B:32:0x007e BREAK  A[LOOP:0: B:20:0x0045->B:31:0x007b], SYNTHETIC] */
    public final java.lang.Object e(aiyx aiyxVar, defpackage.afer aferVar) {
        defpackage.byd bydVar;
        aiyx aiyxVar2;
        int i;
        if (this.a == null) {
            defpackage.bxi.b("Called runAndWatch on a manager that has been disposed of");
        }
        java.lang.Object obj = this.a;
        if ((obj instanceof defpackage.byd) && (aiyxVar2 = (bydVar = (defpackage.byd) obj).c) != null && !defpackage.afga.f(aiyxVar2, aiyxVar)) {
            defpackage.bww bwwVar = new defpackage.bww();
            aiyx aiyxVar3 = bydVar.c;
            if (aiyxVar3 == null) {
                defpackage.bxi.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            defpackage.aaw aawVar = bydVar.d;
            if (aawVar != null) {
                java.lang.Object[] objArr = aawVar.b;
                long[] jArr = aawVar.a;
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
                                    bwwVar.f(aiyxVar3, objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            } else {
                java.lang.Object obj2 = bydVar.a;
                obj2.getClass();
                bwwVar.f(aiyxVar3, obj2);
            }
            bwwVar.c();
            bydVar.d();
            this.a = bwwVar;
        }
        java.lang.Object obj3 = this.a;
        obj3.getClass();
        defpackage.byf byfVar = (defpackage.byf) obj3;
        defpackage.cej cejVarB = defpackage.cer.b().b(byfVar.a(aiyxVar));
        byfVar.b(aiyxVar);
        try {
            defpackage.cej cejVarW = cejVarB.w();
            try {
                java.lang.Object objInvoke = aferVar.invoke();
                defpackage.cer.i.k(cejVarW);
                cejVarB.d();
                byfVar.c();
                return objInvoke;
            } catch (java.lang.Throwable th) {
                defpackage.cer.i.k(cejVarW);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            cejVarB.d();
            throw th2;
        }
    }

    public final void f() {
        this.a = null;
    }

    public final boolean g() {
        com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = ((defpackage.sxu) this.a).a;
        if (usageReportingOptInOptions != null) {
            return usageReportingOptInOptions.a == 1;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    public final java.lang.Object h(defpackage.xzi xziVar) {
        if (this.a == null) {
            this.a = xziVar.fF();
        }
        return j();
    }

    public final java.lang.Object i(java.lang.Object obj) {
        l(obj);
        return j();
    }

    public final java.lang.Object j() {
        return k("None of the supplied values were non-null!", new java.lang.Object[0]);
    }

    public final java.lang.Object k(java.lang.String str, java.lang.Object... objArr) {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(defpackage.ysr.aR(str, objArr));
    }

    public final void l(java.lang.Object obj) {
        if (this.a == null) {
            this.a = obj;
        }
    }

    public nub(java.lang.Object obj) {
        this.a = obj;
    }

    public nub(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public nub() {
    }

    public nub(char[] cArr) {
        this.a = new defpackage.byd();
    }
}

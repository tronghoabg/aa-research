package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class xup implements defpackage.xvq {
    private final defpackage.xvq a;
    private final java.util.UUID b;
    private final java.lang.String c;
    private final java.lang.String d;
    private java.lang.Thread e;

    public xup(java.lang.String str, defpackage.xvq xvqVar, defpackage.nrr nrrVar) {
        str.getClass();
        this.d = str;
        this.a = xvqVar;
        this.b = xvqVar.f();
        this.c = xvqVar.d();
        java.lang.Object obj = nrrVar.b;
        this.e = java.lang.Thread.currentThread();
    }

    public static java.lang.String gb(java.util.UUID uuid) {
        return "tk-trace-id: ".concat(java.lang.String.valueOf(java.lang.Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.xvq
    public final defpackage.xvq a() {
        return this.a;
    }

    @Override // defpackage.xvq
    public final java.lang.String c() {
        return this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xuv */
    /* JADX INFO: Thrown type has an unknown type hierarchy: xuw */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xvq] */
    @Override // defpackage.xvr, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws xuv, xuw {
        defpackage.nrr nrrVar = (defpackage.nrr) defpackage.xuy.c.get();
        ?? r1 = nrrVar.c;
        if (r1 == 0) {
            throw new xuv("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            defpackage.xvq xvqVarA = r1.a();
            java.lang.Object obj = nrrVar.b;
            defpackage.xuy.h(nrrVar, xvqVarA);
            this.e = null;
            return;
        }
        throw new xuw("Tried to end span " + c() + ", but that span is not the current span. The current span is " + r1.c() + ".");
    }

    @Override // defpackage.xvq
    public final java.lang.String d() {
        return this.c;
    }

    @Override // defpackage.xvq
    public final java.lang.Thread e() {
        return this.e;
    }

    @Override // defpackage.xvq
    public final java.util.UUID f() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fa  */
    public final java.lang.String toString() {
        int i;
        int i2;
        xvn xvnVar;
        xvm xvmVar;
        xvl xvlVar;
        int i3;
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
        int i4 = 0;
        int length = 0;
        defpackage.xvq xvqVarA = this;
        while (xvqVarA != null) {
            i4++;
            length += xvqVarA.c().length();
            xvqVarA = xvqVarA.a();
            if (xvqVarA != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            java.lang.String[] strArr = new java.lang.String[i4];
            defpackage.xvq xvqVarA2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = xvqVarA2.c();
                xvqVarA2 = xvqVarA2.a();
            }
            defpackage.yha yhaVar = new defpackage.yha(4);
            defpackage.yot it = defpackage.yhx.o(strArr).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                yhaVar.f(it.next(), java.lang.Integer.valueOf(i6));
                i6++;
            }
            int i7 = 1;
            defpackage.yhe yheVarD = yhaVar.d(true);
            int i8 = ((defpackage.ync) yheVarD).d;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                xvnVar = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((java.lang.Integer) yheVarD.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                xvo xvoVar = new xvo(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    xvoVar.f += i7;
                    int[] iArr2 = xvoVar.a;
                    int i14 = iArr2[i12];
                    while (true) {
                        xvm xvmVar2 = null;
                        while (true) {
                            if (xvoVar.f <= 0) {
                                i3 = i7;
                                break;
                            }
                            if (xvoVar.e == 0) {
                                break;
                            }
                            i3 = i7;
                            int i15 = ((xvm) xvoVar.c.d.get(java.lang.Integer.valueOf(iArr2[xvoVar.d]))).a;
                            int i16 = xvoVar.e;
                            if (iArr2[i15 + i16] == i14) {
                                if (xvmVar2 != null) {
                                    xvmVar2.c = xvoVar.c;
                                }
                                xvoVar.e = i16 + 1;
                                xvoVar.b();
                                break;
                            }
                            xvm xvmVar3 = (xvm) xvoVar.c.d.get(java.lang.Integer.valueOf(iArr2[xvoVar.d]));
                            int i17 = xvmVar3.a;
                            int i18 = i13;
                            xvm xvmVar4 = new xvm(i17, (xvoVar.e + i17) - 1);
                            xvoVar.c.d.put(java.lang.Integer.valueOf(iArr2[xvoVar.d]), xvmVar4);
                            java.util.Map map = xvmVar4.d;
                            int i19 = xvmVar4.b + 1;
                            map.put(java.lang.Integer.valueOf(iArr2[i19]), xvmVar3);
                            xvmVar3.a = i19;
                            if (xvmVar2 != null) {
                                xvmVar2.c = xvmVar4;
                            }
                            map.put(java.lang.Integer.valueOf(i14), new xvm(i12, 1073741824));
                            xvoVar.f--;
                            xvoVar.a();
                            xvmVar2 = xvmVar4;
                            i7 = i3;
                            i13 = i18;
                        }
                        java.util.Map map2 = xvoVar.c.d;
                        i3 = i7;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf)) {
                            if (xvmVar2 != null) {
                                xvmVar2.c = xvoVar.c;
                            }
                            xvoVar.d = i12;
                            xvoVar.e++;
                            xvoVar.b();
                            break;
                        }
                        xvoVar.c.d.put(numValueOf, new xvm(i12, 1073741824));
                        if (xvmVar2 != null) {
                            xvmVar2.c = xvoVar.c;
                        }
                        xvoVar.f += i13;
                        xvoVar.a();
                        i7 = i3;
                    }
                    i12++;
                    i7 = i3;
                }
                int i20 = i7;
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                xvm xvmVar5 = xvoVar.b;
                xvl xvlVar2 = new xvl(xvmVar5, 0, -1, -1);
                arrayDeque.push(xvlVar2);
                while (!arrayDeque.isEmpty()) {
                    xvl xvlVar3 = (xvl) arrayDeque.pop();
                    for (xvm xvmVar6 : ((xvm) xvlVar3.d).d.values()) {
                        int i21 = xvlVar3.b;
                        int i22 = xvlVar3.c;
                        int i23 = xvmVar6.a;
                        int i24 = xvmVar6.b;
                        if (xvoVar.c(i21, i22, i23, i24)) {
                            xvmVar = xvmVar5;
                        } else {
                            if (xvmVar6.d.isEmpty()) {
                                int i25 = xvmVar6.a;
                                xvmVar = xvmVar5;
                                if (xvoVar.c(i21, i22, i25, (i25 + i22) - i21)) {
                                }
                                if (xvlVar2.a < xvlVar.a) {
                                    xvlVar2 = xvlVar;
                                }
                                arrayDeque.push(xvlVar);
                                xvmVar5 = xvmVar;
                                i20 = 1;
                            } else {
                                xvmVar = xvmVar5;
                            }
                            xvlVar = new xvl(xvmVar6, i20, xvmVar6.a, i24);
                            if (xvlVar2.a < xvlVar.a) {
                                xvlVar2 = xvlVar;
                            }
                            arrayDeque.push(xvlVar);
                            xvmVar5 = xvmVar;
                            i20 = 1;
                        }
                        xvlVar = new xvl(xvmVar6, xvlVar3.a + i20, i21, i22);
                        if (xvlVar2.a < xvlVar.a) {
                            xvlVar2 = xvlVar;
                        }
                        arrayDeque.push(xvlVar);
                        xvmVar5 = xvmVar;
                        i20 = 1;
                    }
                    i20 = 1;
                }
                int[] iArr3 = xvoVar.a;
                int iMin = java.lang.Math.min(iArr3.length, xvlVar2.c + 1);
                xvm xvmVar7 = xvmVar5;
                int i26 = 0;
                loop9: while (true) {
                    i = xvlVar2.b;
                    i2 = iMin - i;
                    xvmVar7 = (xvm) xvmVar7.d.get(java.lang.Integer.valueOf(iArr3[(i26 % i2) + i]));
                    if (xvmVar7 == null) {
                        break;
                    }
                    for (int i27 = xvmVar7.a; i27 < xvmVar7.b + 1 && i27 < iArr3.length; i27++) {
                        if (iArr3[(i26 % i2) + i] != iArr3[i27]) {
                            break loop9;
                        }
                        i26++;
                    }
                }
                xvn xvnVar2 = new xvn(i, iMin, i26 / i2);
                if (xvnVar2.c * (xvnVar2.b - xvnVar2.a) < i9) {
                    xvnVar = null;
                } else {
                    xvnVar = xvnVar2;
                }
            }
            java.lang.String str = "";
            if (xvnVar != null) {
                int i28 = xvnVar.a;
                java.lang.String strConcat = i28 > 0 ? java.lang.String.valueOf(android.text.TextUtils.join(" -> ", java.util.Arrays.copyOf(strArr, i28))).concat(" -> ") : "";
                int i29 = xvnVar.b;
                int i30 = xvnVar.c;
                int i31 = ((i29 - i28) * i30) + i28;
                str = java.lang.String.format(java.util.Locale.US, "%s{%s}x%d%s", strConcat, android.text.TextUtils.join(" -> ", java.util.Arrays.copyOfRange(strArr, i28, i29)), java.lang.Integer.valueOf(i30), i31 < i4 ? " -> ".concat(java.lang.String.valueOf(android.text.TextUtils.join(" -> ", java.util.Arrays.copyOfRange(strArr, i31, i4)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        defpackage.xvq xvqVarA3 = this;
        while (xvqVarA3 != null) {
            java.lang.String strC = xvqVarA3.c();
            length -= strC.length();
            strC.getChars(0, strC.length(), cArr, length);
            xvqVarA3 = xvqVarA3.a();
            if (xvqVarA3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new java.lang.String(cArr);
    }

    public xup(java.lang.String str, java.util.UUID uuid, java.lang.String str2, defpackage.nrr nrrVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        java.lang.Object obj = nrrVar.b;
        this.e = java.lang.Thread.currentThread();
    }
}

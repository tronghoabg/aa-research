package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjv {
    public static defpackage.cla a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final defpackage.der A(defpackage.cwn cwnVar, defpackage.affc affcVar) {
        defpackage.cxl cxlVarR = r(cwnVar);
        int i = cxlVarR.c;
        defpackage.dep depVar = ((defpackage.czz) defpackage.cxo.a(cxlVarR)).p;
        defpackage.des desVar = depVar.c;
        defpackage.zo zoVar = desVar.g;
        defpackage.der derVar = new defpackage.der(desVar, i, cwnVar, affcVar);
        java.lang.Object objA = zoVar.a(i);
        if (objA == null) {
            zoVar.g(i, derVar);
            objA = derVar;
        }
        defpackage.der derVar2 = (defpackage.der) objA;
        if (derVar2 != derVar) {
            while (true) {
                defpackage.der derVar3 = derVar2.b;
                if (derVar3 == null) {
                    break;
                }
                derVar2 = derVar3;
            }
            derVar2.b = derVar;
        }
        defpackage.cxl cxlVarR2 = r(cwnVar.M());
        if (defpackage.dep.h(cxlVarR2)) {
            depVar.b.b(depVar.a(cxlVarR2), true);
        }
        depVar.d();
        depVar.i();
        return derVar;
    }

    public static defpackage.ctz B(defpackage.cub cubVar, int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.csc.c(defpackage.a.bz(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cua(i, i2, map, affcVar, cubVar, affcVar2);
    }

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final int b(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (java.lang.Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return java.lang.Float.isNaN(f2) ? 0 : 1;
    }

    public static final long c() {
        float[] fArr = defpackage.clr.a;
        return k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
    }

    public static /* synthetic */ defpackage.cka d(java.util.List list, float f, float f2) {
        return new defpackage.ckp(list, java.lang.Float.floatToRawIntBits(f) & 4294967295L, ((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean e(float[] fArr) {
        return fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f9  */
    public static /* synthetic */ defpackage.cjr f(int i, int i2, int i3, int i4) {
        android.graphics.ColorSpace colorSpaceM;
        float[] fArrA;
        defpackage.cme cmeVar;
        int i5;
        float[] fArr;
        android.graphics.ColorSpace rgb;
        java.lang.String str;
        android.graphics.ColorSpace.Rgb rgb2;
        float[] fArr2 = defpackage.clr.a;
        int i6 = i4 & 4;
        defpackage.cmd cmdVar = defpackage.clr.e;
        android.graphics.Bitmap.Config config = ((i6 != 0 ? 0 : 1) & i3) == 0 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.ALPHA_8;
        if (defpackage.afga.f(cmdVar, cmdVar)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$1());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.q)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.r)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$2());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.o)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$3());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.j)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$4());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.i)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$5());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.t)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$6());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.s)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$7());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.k)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$8());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.l)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$10());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.g)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$11());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.h)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$12());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.f)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$9());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.m)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$13());
        } else if (defpackage.afga.f(cmdVar, defpackage.clr.p)) {
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$14());
        } else {
            if (!defpackage.afga.f(cmdVar, defpackage.clr.n)) {
                android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = null;
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    if (defpackage.afga.f(cmdVar, defpackage.clr.v)) {
                        colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(axd$.ExternalSyntheticApiModelOutline0.m());
                    } else {
                        colorSpaceM = defpackage.afga.f(cmdVar, defpackage.clr.w) ? a$.ExternalSyntheticApiModelOutline1.m(axd$.ExternalSyntheticApiModelOutline0.m$1()) : null;
                    }
                    if (colorSpaceM == null) {
                        if (android.os.Build.VERSION.SDK_INT < 36) {
                            if (defpackage.afga.f(cmdVar, defpackage.clr.x)) {
                                colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(b$.ExternalSyntheticApiModelOutline0.m());
                            } else {
                                colorSpaceM = null;
                            }
                            if (colorSpaceM != null) {
                                if (cmdVar instanceof defpackage.cmd) {
                                    fArrA = cmdVar.d.a();
                                    cmeVar = cmdVar.g;
                                    if (cmeVar != null) {
                                        i5 = 0;
                                        transferParameters = new android.graphics.ColorSpace.Rgb.TransferParameters(cmeVar.b, cmeVar.c, cmeVar.d, cmeVar.e, cmeVar.f, cmeVar.g, cmeVar.a);
                                    } else {
                                        i5 = 0;
                                    }
                                    fArr = cmdVar.i;
                                    if (transferParameters != null) {
                                        str = cmdVar.a;
                                        rgb2 = new android.graphics.ColorSpace.Rgb(str, cmdVar.h, fArrA, transferParameters);
                                        if (java.lang.Float.isNaN(fArr[i5])) {
                                            rgb = rgb2;
                                        } else {
                                            rgb = new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
                                        }
                                    } else {
                                        java.lang.String str2 = cmdVar.a;
                                        float[] fArr3 = cmdVar.h;
                                        final defpackage.affc affcVar = cmdVar.l;
                                        final int i7 = 1;
                                        java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                                                return i7 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator2) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator2);
                                            }

                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final double applyAsDouble(double d) {
                                                int i8 = i7;
                                                defpackage.affc affcVar2 = affcVar;
                                                return i8 != 0 ? ((java.lang.Number) affcVar2.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar2.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                            }

                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                                                return i7 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator2) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator2);
                                            }
                                        };
                                        final defpackage.affc affcVar2 = cmdVar.o;
                                        final int i8 = i5;
                                        rgb = new android.graphics.ColorSpace.Rgb(str2, fArr3, fArrA, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                                                return i8 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator2) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator2);
                                            }

                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final double applyAsDouble(double d) {
                                                int i9 = i8;
                                                defpackage.affc affcVar3 = affcVar2;
                                                return i9 != 0 ? ((java.lang.Number) affcVar3.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar3.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                            }

                                            @Override // java.util.function.DoubleUnaryOperator
                                            public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                                                return i8 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator2) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator2);
                                            }
                                        }, cmdVar.e, cmdVar.f);
                                    }
                                } else {
                                    colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$1());
                                }
                            }
                        } else if (cmdVar instanceof defpackage.cmd) {
                            fArrA = cmdVar.d.a();
                            cmeVar = cmdVar.g;
                            if (cmeVar != null) {
                                i5 = 0;
                                transferParameters = new android.graphics.ColorSpace.Rgb.TransferParameters(cmeVar.b, cmeVar.c, cmeVar.d, cmeVar.e, cmeVar.f, cmeVar.g, cmeVar.a);
                            } else {
                                i5 = 0;
                            }
                            fArr = cmdVar.i;
                            if (transferParameters != null) {
                                str = cmdVar.a;
                                rgb2 = new android.graphics.ColorSpace.Rgb(str, cmdVar.h, fArrA, transferParameters);
                                if (java.lang.Float.isNaN(fArr[i5])) {
                                    rgb = rgb2;
                                } else {
                                    rgb = new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                java.lang.String str3 = cmdVar.a;
                                float[] fArr4 = cmdVar.h;
                                final defpackage.affc affcVar3 = cmdVar.l;
                                final int i9 = 1;
                                java.util.function.DoubleUnaryOperator doubleUnaryOperator2 = new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator3) {
                                        return i9 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator3) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator3);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i10 = i9;
                                        defpackage.affc affcVar4 = affcVar3;
                                        return i10 != 0 ? ((java.lang.Number) affcVar4.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar4.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator3) {
                                        return i9 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator3) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator3);
                                    }
                                };
                                final defpackage.affc affcVar4 = cmdVar.o;
                                final int i10 = i5;
                                rgb = new android.graphics.ColorSpace.Rgb(str3, fArr4, fArrA, doubleUnaryOperator2, new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator3) {
                                        return i10 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator3) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator3);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i11 = i10;
                                        defpackage.affc affcVar5 = affcVar4;
                                        return i11 != 0 ? ((java.lang.Number) affcVar5.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar5.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator3) {
                                        return i10 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator3) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator3);
                                    }
                                }, cmdVar.e, cmdVar.f);
                            }
                        } else {
                            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$1());
                        }
                    }
                } else if (android.os.Build.VERSION.SDK_INT < 36) {
                    if (defpackage.afga.f(cmdVar, defpackage.clr.x)) {
                        colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(b$.ExternalSyntheticApiModelOutline0.m());
                    } else {
                        colorSpaceM = null;
                    }
                    if (colorSpaceM != null) {
                        if (cmdVar instanceof defpackage.cmd) {
                            fArrA = cmdVar.d.a();
                            cmeVar = cmdVar.g;
                            if (cmeVar != null) {
                                i5 = 0;
                                transferParameters = new android.graphics.ColorSpace.Rgb.TransferParameters(cmeVar.b, cmeVar.c, cmeVar.d, cmeVar.e, cmeVar.f, cmeVar.g, cmeVar.a);
                            } else {
                                i5 = 0;
                            }
                            fArr = cmdVar.i;
                            if (transferParameters != null) {
                                str = cmdVar.a;
                                rgb2 = new android.graphics.ColorSpace.Rgb(str, cmdVar.h, fArrA, transferParameters);
                                if (java.lang.Float.isNaN(fArr[i5])) {
                                    rgb = rgb2;
                                } else {
                                    rgb = new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                java.lang.String str4 = cmdVar.a;
                                float[] fArr5 = cmdVar.h;
                                final defpackage.affc affcVar5 = cmdVar.l;
                                final int i11 = 1;
                                java.util.function.DoubleUnaryOperator doubleUnaryOperator3 = new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator4) {
                                        return i11 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator4) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator4);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i12 = i11;
                                        defpackage.affc affcVar6 = affcVar5;
                                        return i12 != 0 ? ((java.lang.Number) affcVar6.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar6.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator4) {
                                        return i11 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator4) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator4);
                                    }
                                };
                                final defpackage.affc affcVar6 = cmdVar.o;
                                final int i12 = i5;
                                rgb = new android.graphics.ColorSpace.Rgb(str4, fArr5, fArrA, doubleUnaryOperator3, new java.util.function.DoubleUnaryOperator() { // from class: ckh
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator4) {
                                        return i12 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator4) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator4);
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        int i13 = i12;
                                        defpackage.affc affcVar7 = affcVar6;
                                        return i13 != 0 ? ((java.lang.Number) affcVar7.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar7.invoke(java.lang.Double.valueOf(d))).doubleValue();
                                    }

                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator4) {
                                        return i12 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator4) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator4);
                                    }
                                }, cmdVar.e, cmdVar.f);
                            }
                        } else {
                            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$1());
                        }
                    }
                } else if (cmdVar instanceof defpackage.cmd) {
                    fArrA = cmdVar.d.a();
                    cmeVar = cmdVar.g;
                    if (cmeVar != null) {
                        i5 = 0;
                        transferParameters = new android.graphics.ColorSpace.Rgb.TransferParameters(cmeVar.b, cmeVar.c, cmeVar.d, cmeVar.e, cmeVar.f, cmeVar.g, cmeVar.a);
                    } else {
                        i5 = 0;
                    }
                    fArr = cmdVar.i;
                    if (transferParameters != null) {
                        str = cmdVar.a;
                        rgb2 = new android.graphics.ColorSpace.Rgb(str, cmdVar.h, fArrA, transferParameters);
                        if (java.lang.Float.isNaN(fArr[i5]) && !java.util.Arrays.equals(a$.ExternalSyntheticApiModelOutline1.m(rgb2), fArr)) {
                            rgb = new android.graphics.ColorSpace.Rgb(str, fArr, transferParameters);
                        } else {
                            rgb = rgb2;
                        }
                    } else {
                        java.lang.String str5 = cmdVar.a;
                        float[] fArr6 = cmdVar.h;
                        final defpackage.affc affcVar7 = cmdVar.l;
                        final int i13 = 1;
                        java.util.function.DoubleUnaryOperator doubleUnaryOperator4 = new java.util.function.DoubleUnaryOperator() { // from class: ckh
                            @Override // java.util.function.DoubleUnaryOperator
                            public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator5) {
                                return i13 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator5) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator5);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i14 = i13;
                                defpackage.affc affcVar8 = affcVar7;
                                return i14 != 0 ? ((java.lang.Number) affcVar8.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar8.invoke(java.lang.Double.valueOf(d))).doubleValue();
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator5) {
                                return i13 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator5) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator5);
                            }
                        };
                        final defpackage.affc affcVar8 = cmdVar.o;
                        final int i14 = i5;
                        rgb = new android.graphics.ColorSpace.Rgb(str5, fArr6, fArrA, doubleUnaryOperator4, new java.util.function.DoubleUnaryOperator() { // from class: ckh
                            @Override // java.util.function.DoubleUnaryOperator
                            public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator5) {
                                return i14 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator5) : j$.util.function.DoubleUnaryOperator.-CC.$default$andThen(this, doubleUnaryOperator5);
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i15 = i14;
                                defpackage.affc affcVar9 = affcVar8;
                                return i15 != 0 ? ((java.lang.Number) affcVar9.invoke(java.lang.Double.valueOf(d))).doubleValue() : ((java.lang.Number) affcVar9.invoke(java.lang.Double.valueOf(d))).doubleValue();
                            }

                            @Override // java.util.function.DoubleUnaryOperator
                            public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator5) {
                                return i14 != 0 ? j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator5) : j$.util.function.DoubleUnaryOperator.-CC.$default$compose(this, doubleUnaryOperator5);
                            }
                        }, cmdVar.e, cmdVar.f);
                    }
                } else {
                    colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$1());
                }
                return new defpackage.cjr(a$.ExternalSyntheticApiModelOutline1.m((android.util.DisplayMetrics) null, i, i2, config, true, rgb));
            }
            colorSpaceM = a$.ExternalSyntheticApiModelOutline1.m(a$.ExternalSyntheticApiModelOutline1.m$15());
        }
        rgb = colorSpaceM;
        return new defpackage.cjr(a$.ExternalSyntheticApiModelOutline1.m((android.util.DisplayMetrics) null, i, i2, config, true, rgb));
    }

    public static final defpackage.cgf g(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cjy(affcVar));
    }

    public static /* synthetic */ defpackage.cgf h(defpackage.cgf cgfVar, float f, float f2, float f3, float f4, float f5, defpackage.cld cldVar, boolean z, int i, int i2) {
        long jAK = (i2 & 1024) != 0 ? defpackage.tna.aK(0.5f, 0.5f) : 0L;
        defpackage.cld cldVar2 = (i2 & 2048) != 0 ? defpackage.cky.a : cldVar;
        boolean z2 = ((i2 & 4096) == 0) & z;
        long j = (i2 & 16384) != 0 ? -72057594037927936L : 0L;
        long j2 = (32768 & i2) != 0 ? -72057594037927936L : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 256;
        int i5 = i2 & 32;
        int i6 = i2 & 4;
        int i7 = i2 & 2;
        int i8 = i2 & 1;
        float f6 = (i2 & 512) != 0 ? 8.0f : 0.0f;
        float f7 = i4 != 0 ? 0.0f : f5;
        float f8 = i5 != 0 ? 0.0f : f4;
        float f9 = i6 != 0 ? 1.0f : f3;
        return cgfVar.a(new defpackage.ckl(1 == i8 ? 1.0f : f, i7 != 0 ? 1.0f : f2, f9, f8, f7, f6, jAK, cldVar2, z2, j, j2, i3, defpackage.cko.a));
    }

    public static final int i(long j) {
        float[] fArr = defpackage.clr.a;
        return (int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32);
    }

    public static final long j(int i) {
        return ((long) i) << 32;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x014e  */
    /* JADX WARN: Code duplicated, block: B:106:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:0x0169  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:118:0x017f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:121:0x0187  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final long k(float f, float f2, float f3, float f4, defpackage.clp clpVar) {
        int i;
        int i2;
        int i3;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f5;
        float f6;
        if (clpVar.f()) {
            float f7 = f4 < 0.0f ? 0.0f : f4;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            float f8 = (f7 * 255.0f) + 0.5f;
            float f9 = f < 0.0f ? 0.0f : f;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i22 = ((int) ((f9 * 255.0f) + 0.5f)) << 16;
            float f10 = f2 < 0.0f ? 0.0f : f2;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            float f11 = (f10 * 255.0f) + 0.5f;
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            return ((long) ((((((int) f8) << 24) | i22) | (((int) f11) << 8)) | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
        }
        long j = clpVar.b;
        int i23 = clpVar.c;
        if (i23 == -1) {
            defpackage.ckn.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i24 = 0;
        float fB3 = clpVar.b(0);
        float fA3 = clpVar.a(0);
        if (f >= fB3) {
            fB3 = f;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fA3);
        int i25 = iFloatToRawIntBits3 >> 13;
        int i26 = iFloatToRawIntBits3 & 8388607;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = (iFloatToRawIntBits3 >>> 31) << 15;
        if (i27 == 255) {
            i2 = i26 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i25 & 1023;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | i28;
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fB = clpVar.b(1);
                    fA = clpVar.a(1);
                    if (f2 >= fB) {
                        fB = f2;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
                    i4 = (iFloatToRawIntBits >>> 31) << 15;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits >> 13;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i5 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i6 & 1023;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | i4;
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                fB2 = clpVar.b(2);
                                fA2 = clpVar.a(2);
                                if (f3 >= fB2) {
                                    fB2 = f3;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                                i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = iFloatToRawIntBits2 >> 13;
                                i16 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i19 = i16 != 0 ? 512 : 0;
                                    i24 = 31;
                                } else {
                                    i17 = i14 - 112;
                                    if (i17 >= 31) {
                                        i19 = 0;
                                        i24 = 49;
                                    } else {
                                        if (i17 <= 0) {
                                            i18 = i15 & 1023;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i20 = (((i17 << 10) | i18) + 1) | i13;
                                            } else {
                                                i19 = i18;
                                                i24 = i17;
                                            }
                                            short s3 = (short) i20;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            if (f5 > 1.0f) {
                                                f6 = 1.0f;
                                            } else {
                                                f6 = f5;
                                            }
                                            return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16);
                                        }
                                        if (i17 >= -10) {
                                            i21 = (i16 | 8388608) >> (1 - i17);
                                            if ((i21 & 4096) != 0) {
                                                i21 += 8192;
                                            }
                                            i19 = i21 >> 13;
                                        } else {
                                            i19 = 0;
                                        }
                                    }
                                }
                                i20 = i19 | (i24 << 10) | i13;
                                short s4 = (short) i20;
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16);
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | i4 | (i8 << 10);
                    short s5 = (short) i11;
                    fB2 = clpVar.b(2);
                    fA2 = clpVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                    i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = iFloatToRawIntBits2 >> 13;
                    i16 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i19 = i16 != 0 ? 512 : 0;
                        i24 = 31;
                    } else {
                        i17 = i14 - 112;
                        if (i17 >= 31) {
                            i19 = 0;
                            i24 = 49;
                        } else {
                            if (i17 <= 0) {
                                i18 = i15 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i20 = (((i17 << 10) | i18) + 1) | i13;
                                } else {
                                    i19 = i18;
                                    i24 = i17;
                                }
                                short s6 = (short) i20;
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16);
                            }
                            if (i17 >= -10) {
                                i21 = (i16 | 8388608) >> (1 - i17);
                                if ((i21 & 4096) != 0) {
                                    i21 += 8192;
                                }
                                i19 = i21 >> 13;
                            } else {
                                i19 = 0;
                            }
                        }
                    }
                    i20 = i19 | (i24 << 10) | i13;
                    short s7 = (short) i20;
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16);
                }
                if (i >= -10) {
                    int i30 = (i26 | 8388608) >> (1 - i);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i2 = i30 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | i28 | (i << 10);
        short s8 = (short) i3;
        fB = clpVar.b(1);
        fA = clpVar.a(1);
        if (f2 >= fB) {
            fB = f2;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
        i4 = (iFloatToRawIntBits >>> 31) << 15;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits >> 13;
        i7 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i5 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i6 & 1023;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | i4;
                    } else {
                        i10 = i9;
                    }
                    short s9 = (short) i11;
                    fB2 = clpVar.b(2);
                    fA2 = clpVar.a(2);
                    if (f3 >= fB2) {
                        fB2 = f3;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
                    i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = iFloatToRawIntBits2 >> 13;
                    i16 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i19 = i16 != 0 ? 512 : 0;
                        i24 = 31;
                    } else {
                        i17 = i14 - 112;
                        if (i17 >= 31) {
                            i19 = 0;
                            i24 = 49;
                        } else {
                            if (i17 <= 0) {
                                i18 = i15 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i20 = (((i17 << 10) | i18) + 1) | i13;
                                } else {
                                    i19 = i18;
                                    i24 = i17;
                                }
                                short s10 = (short) i20;
                                if (f4 >= 0.0f) {
                                }
                                if (f5 > 1.0f) {
                                    f6 = 1.0f;
                                } else {
                                    f6 = f5;
                                }
                                return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16);
                            }
                            if (i17 >= -10) {
                                i21 = (i16 | 8388608) >> (1 - i17);
                                if ((i21 & 4096) != 0) {
                                    i21 += 8192;
                                }
                                i19 = i21 >> 13;
                            } else {
                                i19 = 0;
                            }
                        }
                    }
                    i20 = i19 | (i24 << 10) | i13;
                    short s11 = (short) i20;
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16);
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | i4 | (i8 << 10);
        short s12 = (short) i11;
        fB2 = clpVar.b(2);
        fA2 = clpVar.a(2);
        if (f3 >= fB2) {
            fB2 = f3;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
        i13 = (iFloatToRawIntBits2 >>> 31) << 15;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = iFloatToRawIntBits2 >> 13;
        i16 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i19 = i16 != 0 ? 512 : 0;
            i24 = 31;
        } else {
            i17 = i14 - 112;
            if (i17 >= 31) {
                i19 = 0;
                i24 = 49;
            } else {
                if (i17 <= 0) {
                    i18 = i15 & 1023;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i20 = (((i17 << 10) | i18) + 1) | i13;
                    } else {
                        i19 = i18;
                        i24 = i17;
                    }
                    short s13 = (short) i20;
                    if (f4 >= 0.0f) {
                    }
                    if (f5 > 1.0f) {
                        f6 = 1.0f;
                    } else {
                        f6 = f5;
                    }
                    return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16);
                }
                if (i17 >= -10) {
                    i21 = (i16 | 8388608) >> (1 - i17);
                    if ((i21 & 4096) != 0) {
                        i21 += 8192;
                    }
                    i19 = i21 >> 13;
                } else {
                    i19 = 0;
                }
            }
        }
        i20 = i19 | (i24 << 10) | i13;
        short s14 = (short) i20;
        if (f4 >= 0.0f) {
        }
        if (f5 > 1.0f) {
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        return (((long) i23) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    public static final long l(float f, float f2, float f3, float f4, defpackage.clp clpVar) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (clpVar.f()) {
            return ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
        }
        int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f);
        int i21 = iFloatToRawIntBits3 >> 13;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i24 = (iFloatToRawIntBits3 >>> 31) << 15;
        int i25 = 49;
        int i26 = 0;
        if (i23 == 255) {
            i2 = i22 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i23 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i27 = i21 & 1023;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i27) + 1) | i24;
                    } else {
                        i2 = i27;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
                    i4 = (iFloatToRawIntBits >>> 31) << 15;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits >> 13;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i5 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i6 & 1023;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | i4;
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                                i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = iFloatToRawIntBits2 >> 13;
                                i16 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i17 = i14 - 112;
                                    if (i17 < 31) {
                                        if (i17 <= 0) {
                                            i18 = i15 & 1023;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = ((i18 | (i17 << 10)) + 1) | i13;
                                            } else {
                                                i26 = i18;
                                                i25 = i17;
                                            }
                                        } else if (i17 >= -10) {
                                            i20 = (i16 | 8388608) >> (1 - i17);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i25 = 0;
                                            i26 = i20 >> 13;
                                        } else {
                                            i25 = 0;
                                        }
                                    }
                                    return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                                }
                                i26 = i16 == 0 ? 0 : 512;
                                i25 = 31;
                                i19 = (i25 << 10) | i13 | i26;
                                return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | i4 | (i8 << 10);
                    short s3 = (short) i11;
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                    i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = iFloatToRawIntBits2 >> 13;
                    i16 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i17 = i14 - 112;
                        if (i17 < 31) {
                            if (i17 <= 0) {
                                i18 = i15 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = ((i18 | (i17 << 10)) + 1) | i13;
                                } else {
                                    i26 = i18;
                                    i25 = i17;
                                }
                            } else if (i17 >= -10) {
                                i20 = (i16 | 8388608) >> (1 - i17);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i25 = 0;
                                i26 = i20 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                        return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                    }
                    i26 = i16 == 0 ? 0 : 512;
                    i25 = 31;
                    i19 = (i25 << 10) | i13 | i26;
                    return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                }
                if (i >= -10) {
                    int i28 = (i22 | 8388608) >> (1 - i);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i2 = i28 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | i24 | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
        i4 = (iFloatToRawIntBits >>> 31) << 15;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits >> 13;
        i7 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i5 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i6 & 1023;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | i4;
                    } else {
                        i10 = i9;
                    }
                    short s5 = (short) i11;
                    iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
                    i13 = (iFloatToRawIntBits2 >>> 31) << 15;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = iFloatToRawIntBits2 >> 13;
                    i16 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i17 = i14 - 112;
                        if (i17 < 31) {
                            if (i17 <= 0) {
                                i18 = i15 & 1023;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = ((i18 | (i17 << 10)) + 1) | i13;
                                } else {
                                    i26 = i18;
                                    i25 = i17;
                                }
                            } else if (i17 >= -10) {
                                i20 = (i16 | 8388608) >> (1 - i17);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i25 = 0;
                                i26 = i20 >> 13;
                            } else {
                                i25 = 0;
                            }
                        }
                        return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                    }
                    i26 = i16 == 0 ? 0 : 512;
                    i25 = 31;
                    i19 = (i25 << 10) | i13 | i26;
                    return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | i4 | (i8 << 10);
        short s6 = (short) i11;
        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3);
        i13 = (iFloatToRawIntBits2 >>> 31) << 15;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = iFloatToRawIntBits2 >> 13;
        i16 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i17 = i14 - 112;
            if (i17 < 31) {
                if (i17 <= 0) {
                    i18 = i15 & 1023;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = ((i18 | (i17 << 10)) + 1) | i13;
                    } else {
                        i26 = i18;
                        i25 = i17;
                    }
                } else if (i17 >= -10) {
                    i20 = (i16 | 8388608) >> (1 - i17);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i25 = 0;
                    i26 = i20 >> 13;
                } else {
                    i25 = 0;
                }
            }
            return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
        }
        i26 = i16 == 0 ? 0 : 512;
        i25 = 31;
        i19 = (i25 << 10) | i13 | i26;
        return ((((long) ((short) i19)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) clpVar.c) & 63);
    }

    public static final long m(long j, long j2) {
        float[] fArr = defpackage.clr.a;
        defpackage.clp[] clpVarArr = defpackage.clr.y;
        int i = (int) (63 & j2);
        long jE = defpackage.ckd.e(j, clpVarArr[i]);
        float fA = defpackage.ckd.a(jE);
        float fD = defpackage.ckd.d(jE);
        float fD2 = defpackage.ckd.d(j2);
        float fA2 = defpackage.ckd.a(j2);
        float f = 1.0f - fA;
        float f2 = (fA2 * f) + fA;
        return l(f2 == 0.0f ? 0.0f : ((fD * fA) + ((fD2 * fA2) * f)) / f2, f2 == 0.0f ? 0.0f : ((defpackage.ckd.c(jE) * fA) + ((defpackage.ckd.c(j2) * fA2) * f)) / f2, f2 != 0.0f ? ((defpackage.ckd.b(jE) * fA) + ((defpackage.ckd.b(j2) * fA2) * f)) / f2 : 0.0f, f2, clpVarArr[i]);
    }

    public static /* synthetic */ long n(float f, float f2, float f3, float f4) {
        float[] fArr = defpackage.clr.a;
        return k(f, f2, f3, f4, defpackage.clr.e);
    }

    public static final defpackage.cge o(defpackage.bzc bzcVar) {
        int i;
        if (bzcVar == null || (i = bzcVar.b) == 0) {
            return null;
        }
        return (defpackage.cge) bzcVar.c(i - 1);
    }

    public static final defpackage.ctc p(defpackage.cwn cwnVar) {
        if (!cwnVar.M().A) {
            defpackage.csc.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        defpackage.cyl cylVarS = s(cwnVar, 2);
        if (!cylVarS.t()) {
            defpackage.csc.c("LayoutCoordinates is not attached.");
        }
        return cylVarS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.cxe q(defpackage.cge cgeVar) {
        if ((cgeVar.r & 2) == 0) {
            return null;
        }
        if (cgeVar instanceof defpackage.cxe) {
            return (defpackage.cxe) cgeVar;
        }
        if (!(cgeVar instanceof defpackage.cwo)) {
            return null;
        }
        defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVar).C;
        while (cgeVar2 != 0) {
            if (cgeVar2 instanceof defpackage.cxe) {
                return (defpackage.cxe) cgeVar2;
            }
            cgeVar2 = (!(cgeVar2 instanceof defpackage.cwo) || (cgeVar2.r & 2) == 0) ? cgeVar2.u : ((defpackage.cwo) cgeVar2).C;
        }
        return null;
    }

    public static final defpackage.cxl r(defpackage.cwn cwnVar) {
        defpackage.cyl cylVar = cwnVar.M().w;
        if (cylVar != null) {
            return cylVar.t;
        }
        defpackage.csc.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new defpackage.afap();
    }

    public static final defpackage.cyl s(defpackage.cwn cwnVar, int i) {
        defpackage.cyl cylVar = cwnVar.M().w;
        cylVar.getClass();
        if (cylVar.B() == cwnVar) {
            int i2 = defpackage.cym.a;
            int i3 = i & 128;
            if ((i3 != 0) | ((i & 4194304) != 0)) {
                defpackage.cyl cylVar2 = cylVar.w;
                cylVar2.getClass();
                return cylVar2;
            }
        }
        return cylVar;
    }

    public static final defpackage.cyu t(defpackage.cwn cwnVar) {
        defpackage.cyu cyuVar = r(cwnVar).k;
        if (cyuVar != null) {
            return cyuVar;
        }
        defpackage.csc.a("This node does not have an owner.");
        throw new defpackage.afap();
    }

    public static final defpackage.dlo u(defpackage.cwn cwnVar) {
        return r(cwnVar).r;
    }

    public static final void v(defpackage.cwn cwnVar) {
        defpackage.cgp cgpVar;
        defpackage.cxl cxlVarR = r(cwnVar);
        if (cxlVarR.p || (cgpVar = ((defpackage.czz) defpackage.cxo.a(cxlVarR)).Q) == null) {
            return;
        }
        int i = cxlVarR.c;
        defpackage.dep depVar = cgpVar.b;
        defpackage.cxl cxlVar = (defpackage.cxl) depVar.a.a(i);
        if (cxlVar == null || !defpackage.dep.h(cxlVar)) {
            return;
        }
        defpackage.den denVar = depVar.b;
        int iA = depVar.a(cxlVar);
        long[] jArr = (long[]) denVar.b;
        long j = jArr[iA];
        long j2 = jArr[iA + 1];
        int i2 = (int) j;
        android.graphics.Rect rect = cgpVar.d;
        int i3 = (int) (j2 >> 32);
        rect.set((int) (j >> 32), i2, i3, (int) j2);
        a$.ExternalSyntheticApiModelOutline1.m$1(cgpVar.g.a(), cgpVar.a, cxlVarR.c, rect);
    }

    public static final defpackage.ayy w(defpackage.cwn cwnVar) {
        defpackage.cyg cygVar;
        java.lang.Object obj;
        defpackage.cge cgeVar = (defpackage.cge) cwnVar;
        if (!cgeVar.q.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar2 = cgeVar.q.t;
        defpackage.cxl cxlVarR = r(cwnVar);
        loop0: while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 8388640) != 0) {
                while (cgeVar2 != null) {
                    int i = cgeVar2.r;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(cgeVar2 instanceof defpackage.ayy)) {
                                if (cgeVar2 instanceof defpackage.cwo) {
                                    cgeVar2 = null;
                                    for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVar2).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                        if (true == (cgeVar3 instanceof defpackage.ayy)) {
                                            cgeVar2 = cgeVar3;
                                        }
                                    }
                                } else {
                                    cgeVar2 = null;
                                }
                            }
                            defpackage.ayy ayyVar = (defpackage.ayy) cgeVar2;
                            if (ayyVar != null) {
                                return ayyVar;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (cgeVar2 instanceof defpackage.cwb) {
                                obj = cgeVar2;
                            } else if (cgeVar2 instanceof defpackage.cwo) {
                                obj = null;
                                for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVar2).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                    if (true == (cgeVar4 instanceof defpackage.cwb)) {
                                        obj = cgeVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            defpackage.cwb cwbVar = (defpackage.cwb) obj;
                            if (cwbVar != null) {
                                defpackage.cwa cwaVarD = cwbVar.d();
                                defpackage.cjv cjvVar = defpackage.csn.a;
                                if (cwaVarD.c(cjvVar)) {
                                    return (defpackage.ayy) cwbVar.d().a(cjvVar);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    cgeVar2 = cgeVar2.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar2 = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
        return null;
    }

    public static final void x(defpackage.bzc bzcVar, defpackage.cge cgeVar) {
        defpackage.bzc bzcVarK = r(cgeVar).k();
        int i = bzcVarK.b - 1;
        java.lang.Object[] objArr = bzcVarK.a;
        if (i < objArr.length) {
            while (i >= 0) {
                bzcVar.n(((defpackage.cxl) objArr[i]).v.f);
                i--;
            }
        }
    }

    public static final java.lang.Object y(defpackage.cwm cwmVar, defpackage.bvm bvmVar) {
        if (!cwmVar.M().A) {
            defpackage.csc.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return r(cwmVar).F.f(bvmVar);
    }

    public static final long z(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }
}

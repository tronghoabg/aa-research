package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class amc implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ amc(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01fc A[Catch: all -> 0x022f, LOOP:4: B:93:0x01c3->B:108:0x01fc, LOOP_END, TryCatch #2 {, blocks: (B:86:0x0199, B:88:0x01ac, B:90:0x01b5, B:93:0x01c3, B:95:0x01cf, B:96:0x01d2, B:98:0x01d9, B:100:0x01df, B:102:0x01e8, B:104:0x01f1, B:105:0x01f4, B:108:0x01fc, B:117:0x021e, B:109:0x01ff, B:110:0x0203, B:112:0x0209, B:114:0x0211, B:116:0x021a), top: B:211:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x0294 A[Catch: all -> 0x02b5, LOOP:7: B:131:0x0268->B:142:0x0294, LOOP_END, TryCatch #1 {, blocks: (B:128:0x024e, B:131:0x0268, B:133:0x0274, B:134:0x0277, B:136:0x027e, B:138:0x0284, B:139:0x028c, B:142:0x0294, B:143:0x0297, B:145:0x029d, B:147:0x02a3), top: B:209:0x024e }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0173 A[LOOP:2: B:61:0x0138->B:75:0x0173, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [blh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [bve, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [cfu, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cdv cdvVar;
        java.lang.Object obj3;
        defpackage.cez cezVar;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.lang.Object obj4;
        java.lang.Object objAS;
        aiyx aiyxVarA = null;
        int i = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                float fFloatValue2 = ((java.lang.Float) obj2).floatValue();
                java.lang.Object obj5 = this.a;
                ahoc.d(((defpackage.cge) obj5).N(), (defpackage.afdo) null, 0, new defpackage.amd((defpackage.amf) obj5, fFloatValue, fFloatValue2, null), 3);
                return java.lang.Boolean.TRUE;
            case 1:
                defpackage.acj acjVar = (defpackage.acj) obj;
                defpackage.acj acjVar2 = (defpackage.acj) obj2;
                defpackage.acj acjVar3 = defpackage.acj.c;
                return java.lang.Boolean.valueOf(acjVar == acjVar3 && acjVar2 == acjVar3 && !((defpackage.acx) this.a).b.f);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.a.invoke(defpackage.auw.a, bveVar, 6);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.dlw(((long) this.a.a(0, (int) (((defpackage.dly) obj).a >> 32), (defpackage.dlz) obj2)) << 32);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.dlw(((long) ((defpackage.cfy) this.a).a(0, (int) (((defpackage.dly) obj).a & 4294967295L))) & 4294967295L);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.dlw(this.a.a(0L, ((defpackage.dly) obj).a, (defpackage.dlz) obj2));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.bby) this.a).A(((java.lang.Integer) obj2).intValue());
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Long l = (java.lang.Long) obj2;
                if (defpackage.blj.a(this.a, l.longValue())) {
                    return l;
                }
                return null;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                this.a.b(((defpackage.cji) obj2).a);
                return defpackage.afbk.a;
            case 9:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                ((java.lang.Integer) obj2).intValue();
                int i2 = defpackage.bgq.a;
                bveVar2.v(666084174);
                java.lang.String str = ((defpackage.bfy) this.a).b;
                bveVar2.o();
                return str;
            case 10:
                ((defpackage.crd) obj).b();
                ((afgu) this.a).a = ((defpackage.cji) obj2).a;
                return defpackage.afbk.a;
            case 11:
                ((java.lang.Integer) obj).intValue();
                boolean z = obj2 instanceof defpackage.buy;
                java.lang.Object obj6 = this.a;
                if (z) {
                    defpackage.buy buyVar = (defpackage.buy) obj2;
                    defpackage.cdg cdgVar = (defpackage.cdg) obj6;
                    defpackage.aaw aawVar = cdgVar.i;
                    if (aawVar == null) {
                        defpackage.aaw aawVar2 = defpackage.aax.a;
                        aawVar = new defpackage.aaw(6);
                        cdgVar.i = aawVar;
                    }
                    aawVar.h(buyVar);
                    cdgVar.f(buyVar);
                }
                if (obj2 instanceof defpackage.bxx) {
                    ((defpackage.cdg) obj6).e((defpackage.bxx) obj2);
                }
                if (obj2 instanceof defpackage.bxl) {
                    ((defpackage.bxl) obj2).b();
                }
                return defpackage.afbk.a;
            case 12:
                java.util.Set set = (java.util.Set) obj;
                defpackage.afgv afgvVar = new defpackage.afgv();
                java.lang.Object obj7 = this.a;
                synchronized (((defpackage.byf) obj7).f) {
                    defpackage.aau aauVar = ((defpackage.bww) obj7).a;
                    defpackage.acn acnVar = new defpackage.acn((java.lang.Object) set, obj7, (java.lang.Object) afgvVar, 11, (short[]) null);
                    defpackage.afgz.g(acnVar, 1);
                    java.lang.Object[] objArr = aauVar.b;
                    long[] jArr = aauVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = i3 - length;
                                int i5 = 0;
                                while (true) {
                                    int i6 = 8 - ((~i4) >>> 31);
                                    if (i5 < i6) {
                                        if ((j & 255) < 128) {
                                            acnVar.invoke(objArr[(i3 << 3) + i5]);
                                        }
                                        j >>= 8;
                                        i5++;
                                    } else if (i6 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    java.util.List list = (java.util.List) afgvVar.a;
                    if (list != null) {
                        int size = list.size();
                        while (i < size) {
                            ((aiyx) list.get(i)).j(defpackage.afbk.a);
                            i++;
                        }
                    }
                }
                return defpackage.afbk.a;
            case 13:
                java.util.Set set2 = (java.util.Set) obj;
                java.lang.Object obj8 = this.a;
                synchronized (((defpackage.bxt) obj8).c) {
                    if (((defpackage.bxo) ((defpackage.bxt) obj8).l.b()).compareTo(defpackage.bxo.e) >= 0) {
                        defpackage.aaw aawVar3 = ((defpackage.bxt) obj8).m;
                        if (set2 instanceof defpackage.bzf) {
                            defpackage.aaw aawVar4 = ((defpackage.bzf) set2).a;
                            java.lang.Object[] objArr2 = aawVar4.b;
                            long[] jArr2 = aawVar4.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j2 = jArr2[i7];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = i7 - length2;
                                        int i9 = 0;
                                        while (true) {
                                            int i10 = 8 - ((~i8) >>> 31);
                                            if (i9 < i10) {
                                                if ((j2 & 255) < 128) {
                                                    java.lang.Object obj9 = objArr2[(i7 << 3) + i9];
                                                    if (!(obj9 instanceof defpackage.cfd) || ((defpackage.cfd) obj9).j(1)) {
                                                        aawVar3.j(obj9);
                                                    }
                                                }
                                                j2 >>= 8;
                                                i9++;
                                            } else if (i10 == 8) {
                                                if (i7 != length2) {
                                                    i7++;
                                                }
                                            }
                                        }
                                    } else if (i7 != length2) {
                                        i7++;
                                    }
                                }
                            }
                        } else {
                            for (java.lang.Object obj10 : set2) {
                                if (!(obj10 instanceof defpackage.cfd) || ((defpackage.cfd) obj10).j(1)) {
                                    aawVar3.j(obj10);
                                }
                            }
                        }
                        aiyxVarA = ((defpackage.bxt) obj8).A();
                    }
                    break;
                }
                if (aiyxVarA != null) {
                    aiyxVarA.w(defpackage.afbk.a);
                }
                return defpackage.afbk.a;
            case 14:
                java.util.Set set3 = (java.util.Set) obj;
                java.lang.Object obj11 = this.a;
                synchronized (((defpackage.byf) obj11).f) {
                    defpackage.aaw aawVar5 = ((defpackage.byd) obj11).d;
                    if (aawVar5 != null) {
                        java.lang.Object[] objArr3 = aawVar5.b;
                        long[] jArr3 = aawVar5.a;
                        int length3 = jArr3.length - 2;
                        if (length3 >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j3 = jArr3[i11];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = i11 - length3;
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = 8 - ((~i12) >>> 31);
                                        if (i13 < i14) {
                                            if ((j3 & 255) >= 128 || !set3.contains(objArr3[(i11 << 3) + i13])) {
                                                j3 >>= 8;
                                                i13++;
                                            } else {
                                                aiyxVarA = ((defpackage.byd) obj11).c;
                                            }
                                        } else if (i14 == 8) {
                                            if (i11 != length3) {
                                                i11++;
                                            }
                                        }
                                    }
                                } else if (i11 != length3) {
                                    i11++;
                                }
                            }
                        }
                    } else if (defpackage.afga.bh(set3, ((defpackage.byd) obj11).a)) {
                        aiyxVarA = ((defpackage.byd) obj11).c;
                    }
                }
                if (aiyxVarA != null) {
                    aiyxVarA.j(defpackage.afbk.a);
                }
                return defpackage.afbk.a;
            case 15:
                this.a.invoke(obj);
                return defpackage.afbk.a;
            case 16:
                this.a.invoke(obj);
                return defpackage.afbk.a;
            case 17:
                defpackage.cdr cdrVar = (defpackage.cdr) obj;
                java.util.List list2 = (java.util.List) this.a.invoke(cdrVar, obj2);
                int size2 = list2.size();
                while (i < size2) {
                    java.lang.Object obj12 = list2.get(i);
                    if (obj12 != null && (cdvVar = cdrVar.a) != null && !cdvVar.d(obj12)) {
                        throw new java.lang.IllegalArgumentException("item at index " + i + " can't be saved: " + obj12);
                    }
                    i++;
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new java.util.ArrayList(list2);
            case 18:
                java.util.Set set4 = (java.util.Set) obj;
                do {
                    obj3 = this.a;
                    cezVar = (defpackage.cez) obj3;
                    atomicReference = cezVar.b;
                    obj4 = atomicReference.get();
                    if (obj4 == null) {
                        objAS = set4;
                    } else if (obj4 instanceof java.util.Set) {
                        objAS = defpackage.afga.ac(obj4, set4);
                    } else {
                        if (!(obj4 instanceof java.util.List)) {
                            defpackage.bvg.a("Unexpected notification");
                            throw new defpackage.afap();
                        }
                        java.util.List listSingletonList = java.util.Collections.singletonList(set4);
                        listSingletonList.getClass();
                        objAS = defpackage.afga.aS((java.util.Collection) obj4, listSingletonList);
                    }
                } while (!defpackage.a.g(atomicReference, obj4, objAS));
                if (cezVar.e()) {
                    cezVar.a.invoke(new defpackage.cew(obj3, i));
                }
                return defpackage.afbk.a;
            case 19:
                defpackage.cgf cgfVar = (defpackage.cgf) obj;
                defpackage.cgf cgfVarM = (defpackage.cgd) obj2;
                if (cgfVarM instanceof defpackage.cgb) {
                    ?? r0 = this.a;
                    defpackage.affh affhVar = ((defpackage.cgb) cgfVarM).a;
                    defpackage.afgz.g(affhVar, 3);
                    cgfVarM = defpackage.bzo.m(r0, (defpackage.cgf) affhVar.invoke(defpackage.cgf.e, r0, 0));
                }
                return cgfVar.a(cgfVarM);
            default:
                return java.lang.Float.valueOf(defpackage.ty.c((defpackage.cuw) obj, false, (defpackage.cvd[]) this.a, ((java.lang.Float) obj2).floatValue()));
        }
    }
}

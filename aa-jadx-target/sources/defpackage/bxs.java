package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bxs extends defpackage.afee implements defpackage.affh {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;
    java.lang.Object h;
    int i;
    /* synthetic */ java.lang.Object j;
    final /* synthetic */ defpackage.bxt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxs(defpackage.bxt bxtVar, defpackage.afdk afdkVar) {
        super(3, afdkVar);
        this.k = bxtVar;
    }

    public static final void c(java.util.List list, defpackage.bxt bxtVar) {
        list.clear();
        synchronized (bxtVar.c) {
            java.util.List list2 = bxtVar.g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((defpackage.bws) list2.get(i));
            }
            list2.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0074 A[Catch: all -> 0x0104, LOOP:1: B:10:0x003e->B:20:0x0074, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0018, B:7:0x0029, B:10:0x003e, B:12:0x004f, B:14:0x0059, B:16:0x005f, B:17:0x006c, B:22:0x007f, B:25:0x008c, B:27:0x0097, B:29:0x00a1, B:31:0x00a7, B:32:0x00b1, B:35:0x00b9, B:36:0x00bc, B:39:0x00cc, B:41:0x00d7, B:43:0x00e1, B:45:0x00e7, B:46:0x00f4, B:49:0x00fc, B:50:0x00ff, B:20:0x0074), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[Catch: all -> 0x0104, LOOP:3: B:25:0x008c->B:35:0x00b9, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0018, B:7:0x0029, B:10:0x003e, B:12:0x004f, B:14:0x0059, B:16:0x005f, B:17:0x006c, B:22:0x007f, B:25:0x008c, B:27:0x0097, B:29:0x00a1, B:31:0x00a7, B:32:0x00b1, B:35:0x00b9, B:36:0x00bc, B:39:0x00cc, B:41:0x00d7, B:43:0x00e1, B:45:0x00e7, B:46:0x00f4, B:49:0x00fc, B:50:0x00ff, B:20:0x0074), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x0104, LOOP:5: B:39:0x00cc->B:49:0x00fc, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0018, B:7:0x0029, B:10:0x003e, B:12:0x004f, B:14:0x0059, B:16:0x005f, B:17:0x006c, B:22:0x007f, B:25:0x008c, B:27:0x0097, B:29:0x00a1, B:31:0x00a7, B:32:0x00b1, B:35:0x00b9, B:36:0x00bc, B:39:0x00cc, B:41:0x00d7, B:43:0x00e1, B:45:0x00e7, B:46:0x00f4, B:49:0x00fc, B:50:0x00ff, B:20:0x0074), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x007f A[EDGE_INSN: B:60:0x007f->B:22:0x007f BREAK  A[LOOP:1: B:10:0x003e->B:20:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[EDGE_INSN: B:65:0x00bc->B:36:0x00bc BREAK  A[LOOP:3: B:25:0x008c->B:35:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff A[EDGE_INSN: B:69:0x00ff->B:50:0x00ff BREAK  A[LOOP:5: B:39:0x00cc->B:49:0x00fc], SYNTHETIC] */
    public static final void d(defpackage.bxt bxtVar, java.util.List list, java.util.List list2, java.util.List list3, defpackage.aaw aawVar, defpackage.aaw aawVar2, defpackage.aaw aawVar3, defpackage.aaw aawVar4) {
        char c;
        long j;
        long j2;
        synchronized (bxtVar.c) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                defpackage.bvk bvkVar = (defpackage.bvk) list3.get(i);
                bvkVar.h();
                bxtVar.H(bvkVar);
            }
            list3.clear();
            java.lang.Object[] objArr = aawVar.b;
            long[] jArr = aawVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                j = 255;
                while (true) {
                    long j3 = jArr[i2];
                    c = 7;
                    j2 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j3 & 255) < 128) {
                                defpackage.bvk bvkVar2 = (defpackage.bvk) objArr[(i2 << 3) + i4];
                                bvkVar2.h();
                                bxtVar.H(bvkVar2);
                            }
                            j3 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else {
                c = 7;
                j = 255;
                j2 = -9187201950435737472L;
            }
            aawVar.d();
            java.lang.Object[] objArr2 = aawVar2.b;
            long[] jArr2 = aawVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << c) & j4 & j2) == j2) {
                        if (i5 != length2) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & j) < 128) {
                                ((defpackage.bvk) objArr2[(i5 << 3) + i7]).l();
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            aawVar2.d();
            aawVar3.d();
            java.lang.Object[] objArr3 = aawVar4.b;
            long[] jArr3 = aawVar4.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j5 = jArr3[i8];
                    if ((((~j5) << c) & j5 & j2) == j2) {
                        if (i8 != length3) {
                            break;
                            break;
                        }
                        i8++;
                    } else {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j5 & j) < 128) {
                                defpackage.bvk bvkVar3 = (defpackage.bvk) objArr3[(i8 << 3) + i10];
                                bvkVar3.h();
                                bxtVar.H(bvkVar3);
                            }
                            j5 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 != length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            aawVar4.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x008d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bd A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x00b5, B:20:0x00bd), top: B:89:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0265  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011b -> B:39:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0265 -> B:10:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxs.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.bxs bxsVar = new defpackage.bxs(this.k, (defpackage.afdk) obj3);
        bxsVar.j = (defpackage.bwq) obj2;
        return bxsVar.hf(defpackage.afbk.a);
    }
}

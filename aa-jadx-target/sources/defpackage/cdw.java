package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdw implements defpackage.cdv {
    private final defpackage.affc a;
    private final defpackage.aau b;
    private defpackage.aau c;

    public cdw(java.util.Map map, defpackage.affc affcVar) {
        this.a = affcVar;
        defpackage.aau aauVar = null;
        if (map != null && !map.isEmpty()) {
            defpackage.bvm bvmVar = defpackage.cdx.a;
            aauVar = new defpackage.aau(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                aauVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = aauVar;
    }

    @Override // defpackage.cdv
    public final java.lang.Object a(java.lang.String str) {
        defpackage.aau aauVar = this.b;
        java.util.List list = aauVar != null ? (java.util.List) aauVar.i(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
        }
        return list.get(0);
    }

    @Override // defpackage.cdv
    public final java.util.Map b() {
        long[] jArr;
        long[] jArr2;
        char c;
        defpackage.aau aauVar = this.b;
        if (aauVar == null && this.c == null) {
            return defpackage.afcf.a;
        }
        int i = 0;
        int i2 = aauVar != null ? aauVar.e : 0;
        defpackage.aau aauVar2 = this.c;
        defpackage.aau aauVar3 = new defpackage.aau(i2 + (aauVar2 != null ? aauVar2.e : 0));
        if (aauVar != null) {
            aauVar3.l(aauVar);
        }
        defpackage.aau aauVar4 = this.c;
        if (aauVar4 != null) {
            java.lang.Object[] objArr = aauVar4.b;
            java.lang.Object[] objArr2 = aauVar4.c;
            long[] jArr3 = aauVar4.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr3[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = i;
                        while (true) {
                            int i6 = 8 - ((~i4) >>> 31);
                            if (i5 < i6) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i5;
                                    java.lang.Object obj = objArr[i7];
                                    java.util.List list = (java.util.List) objArr2[i7];
                                    java.lang.String str = (java.lang.String) obj;
                                    c = '\b';
                                    if (list.size() == 1) {
                                        java.lang.Object objInvoke = ((defpackage.afer) list.get(i)).invoke();
                                        if (objInvoke != null) {
                                            if (!d(objInvoke)) {
                                                throw new java.lang.IllegalStateException(defpackage.bxi.g(objInvoke));
                                            }
                                            java.util.List listSingletonList = java.util.Collections.singletonList(objInvoke);
                                            listSingletonList.getClass();
                                            aauVar3.m(str, listSingletonList);
                                        }
                                        jArr2 = jArr3;
                                    } else {
                                        int size = list.size();
                                        java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                        while (i < size) {
                                            long[] jArr4 = jArr3;
                                            java.lang.Object objInvoke2 = ((defpackage.afer) list.get(i)).invoke();
                                            if (objInvoke2 != null && !d(objInvoke2)) {
                                                throw new java.lang.IllegalStateException(defpackage.bxi.g(objInvoke2));
                                            }
                                            arrayList.add(objInvoke2);
                                            i++;
                                            jArr3 = jArr4;
                                        }
                                        jArr2 = jArr3;
                                        aauVar3.m(str, arrayList);
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    c = '\b';
                                }
                                j >>= c;
                                i5++;
                                jArr3 = jArr2;
                                i = 0;
                            } else {
                                jArr = jArr3;
                                if (i6 == 8) {
                                    break;
                                }
                            }
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i3 != length) {
                        i3++;
                        jArr3 = jArr;
                        i = 0;
                    }
                }
            }
        }
        return new defpackage.ceb(aauVar3);
    }

    @Override // defpackage.cdv
    public final boolean d(java.lang.Object obj) {
        return ((java.lang.Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // defpackage.cdv
    public final defpackage.rqj e(java.lang.String str, defpackage.afer aferVar) {
        defpackage.bvm bvmVar = defpackage.cdx.a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!afvq.a(str.charAt(i))) {
                defpackage.aau aauVar = this.c;
                if (aauVar == null) {
                    long[] jArr = defpackage.aav.a;
                    aauVar = new defpackage.aau(6);
                    this.c = aauVar;
                }
                java.lang.Object objA = aauVar.a(str);
                if (objA == null) {
                    objA = new java.util.ArrayList();
                    aauVar.m(str, objA);
                }
                ((java.util.List) objA).add(aferVar);
                return new defpackage.rqj(aauVar, str, aferVar);
            }
        }
        throw new java.lang.IllegalArgumentException("Registered key is empty or blank");
    }
}

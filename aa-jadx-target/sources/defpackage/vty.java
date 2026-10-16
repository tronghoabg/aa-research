package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vty implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ defpackage.vtz a;
    private final java.lang.Thread.UncaughtExceptionHandler b;

    public vty(defpackage.vtz vtzVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = vtzVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [afak, java.lang.Object] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        int i;
        odn odnVarB;
        vuu vuuVarB;
        odn odnVarB2;
        defpackage.abor aborVarN;
        int i2;
        java.util.Iterator it;
        zdf zdfVar;
        zdf zdfVar2;
        try {
            try {
                defpackage.vtz vtzVar = this.a;
                java.lang.String name = thread.getName();
                android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
                defpackage.vtu vtuVar = vtzVar.g;
                defpackage.vlu vluVar = vtzVar.a;
                defpackage.abor aborVarN2 = ajhg.a.n();
                aborVarN2.t();
                ajhg ajhgVar = aborVarN2.b;
                ajhgVar.b |= 1;
                ajhgVar.c = true;
                java.lang.String strE = defpackage.vlu.e(vluVar);
                if (strE != null) {
                    aborVarN2.t();
                    ajhg ajhgVar2 = aborVarN2.b;
                    ajhgVar2.b |= 4;
                    ajhgVar2.e = strE;
                }
                try {
                    defpackage.abor aborVarN3 = ajgw.a.n();
                    ajgv ajgvVarA = vtuVar.b.A();
                    aborVarN3.t();
                    ajgw ajgwVar = aborVarN3.b;
                    ajgvVarA.getClass();
                    ajgwVar.c = ajgvVarA;
                    ajgwVar.b |= 1;
                    aborVarN2.t();
                    ajhg ajhgVar3 = aborVarN2.b;
                    ajgw ajgwVarQ = aborVarN3.q();
                    ajgwVarQ.getClass();
                    ajhgVar3.d = ajgwVarQ;
                    ajhgVar3.b |= 2;
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9838)).u("Failed to get process stats.");
                }
                java.lang.String name2 = th.getClass().getName();
                for (java.lang.Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                defpackage.abor aborVarN4 = zdh.a.n();
                zde zdeVar = zde.a;
                defpackage.abor aborVarN5 = zdeVar.n();
                aborVarN5.t();
                zde zdeVar2 = aborVarN5.b;
                zdeVar2.b |= 1;
                zdeVar2.c = "";
                aborVarN4.t();
                zdh zdhVar = aborVarN4.b;
                zde zdeVarQ = aborVarN5.q();
                zdeVarQ.getClass();
                zdhVar.e = zdeVarQ;
                zdhVar.b |= 1;
                java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                arrayDeque.add(th);
                int i3 = 0;
                identityHashMap.put(th, 0);
                arrayList.add(defpackage.ytn.o(th, true));
                while (!arrayDeque.isEmpty()) {
                    java.lang.Throwable th2 = (java.lang.Throwable) arrayDeque.remove();
                    java.lang.Integer num = (java.lang.Integer) identityHashMap.get(th2);
                    num.getClass();
                    int iIntValue = num.intValue();
                    if (th2.getCause() != null) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (!identityHashMap.containsKey(cause2)) {
                            identityHashMap.put(cause2, java.lang.Integer.valueOf(identityHashMap.size()));
                            arrayList.add(defpackage.ytn.o(cause2, true));
                            arrayDeque.add(cause2);
                        }
                        defpackage.abor aborVar = (defpackage.abor) arrayList.get(iIntValue);
                        int iIntValue2 = ((java.lang.Integer) identityHashMap.get(cause2)).intValue();
                        aborVar.t();
                        zdg zdgVar = aborVar.b;
                        zdg zdgVar2 = zdg.a;
                        zdgVar.b |= 2;
                        zdgVar.d = iIntValue2;
                    } else {
                        th2 = th2;
                        zdeVar = zdeVar;
                    }
                    java.lang.Throwable[] suppressed = th2.getSuppressed();
                    int i4 = 0;
                    for (int length = suppressed.length; i4 < length; length = length) {
                        java.lang.Throwable[] thArr = suppressed;
                        java.lang.Throwable th3 = thArr[i4];
                        if (!identityHashMap.containsKey(th3)) {
                            identityHashMap.put(th3, java.lang.Integer.valueOf(identityHashMap.size()));
                            arrayList.add(defpackage.ytn.o(th3, true));
                            arrayDeque.add(th3);
                        }
                        defpackage.abor aborVar2 = (defpackage.abor) arrayList.get(iIntValue);
                        int iIntValue3 = ((java.lang.Integer) identityHashMap.get(th3)).intValue();
                        aborVar2.t();
                        zdg zdgVar3 = aborVar2.b;
                        zdg zdgVar4 = zdg.a;
                        defpackage.abpf abpfVar = zdgVar3.e;
                        if (!abpfVar.c()) {
                            zdgVar3.e = defpackage.abox.G(abpfVar);
                        }
                        zdgVar3.e.g(iIntValue3);
                        i4++;
                        suppressed = thArr;
                    }
                    zdeVar = zdeVar;
                }
                zde zdeVar3 = zdeVar;
                zdf zdfVar3 = zdf.a;
                defpackage.abor aborVarN6 = zdfVar3.n();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    defpackage.abor aborVar3 = (defpackage.abor) arrayList.get(i5);
                    aborVarN6.t();
                    zdf zdfVar4 = aborVarN6.b;
                    zdg zdgVarQ = aborVar3.q();
                    zdgVarQ.getClass();
                    zdfVar4.b();
                    zdfVar4.b.add(zdgVarQ);
                }
                aborVarN4.t();
                zdh zdhVar2 = aborVarN4.b;
                zdf zdfVarQ = aborVarN6.q();
                zdfVarQ.getClass();
                zdhVar2.d = zdfVarQ;
                zdhVar2.c = 4;
                java.util.Iterator it2 = ((java.util.Set) vtuVar.a.a()).iterator();
                while (it2.hasNext()) {
                    vuf vufVar = (vuf) it2.next();
                    zde zdeVar4 = aborVarN4.b.e;
                    if (zdeVar4 == null) {
                        zdeVar4 = zdeVar3;
                    }
                    if ((zdeVar4.b & 2) != 0) {
                        java.lang.String str = zdeVar4.d;
                        java.lang.String strB = vufVar.b();
                        if (!str.equals(strB)) {
                            defpackage.abor aborVarK = zdeVar4.K();
                            aborVarK.t();
                            zde zdeVar5 = aborVarK.b;
                            strB.getClass();
                            zdeVar5.b |= 2;
                            zdeVar5.d = strB;
                            zde zdeVarQ2 = aborVarK.q();
                            aborVarN4.t();
                            zdh zdhVar3 = aborVarN4.b;
                            zdeVarQ2.getClass();
                            zdhVar3.e = zdeVarQ2;
                            zdhVar3.b |= 1;
                        }
                    }
                    zdh zdhVar4 = aborVarN4.b;
                    int i6 = zdhVar4.c;
                    if (i6 == 4) {
                        zdf zdfVar5 = i6 == 4 ? (zdf) zdhVar4.d : zdfVar3;
                        int i7 = 0;
                        defpackage.abor aborVarK2 = null;
                        while (i7 < zdfVar5.b.size()) {
                            zdg zdgVar5 = (zdg) zdfVar5.b.get(i7);
                            zde zdeVar6 = zdgVar5.c;
                            if (zdeVar6 == null) {
                                zdeVar6 = zdeVar3;
                            }
                            java.util.Iterator it3 = it2;
                            if ((zdeVar6.b & 2) != 0) {
                                java.lang.String str2 = zdeVar6.d;
                                zdfVar2 = zdfVar3;
                                java.lang.String strB2 = vufVar.b();
                                if (!str2.equals(strB2)) {
                                    if (aborVarK2 == null) {
                                        aborVarK2 = zdfVar5.K();
                                    }
                                    defpackage.abor aborVarK3 = zdgVar5.K();
                                    defpackage.abor aborVarK4 = zdeVar6.K();
                                    aborVarK4.t();
                                    zde zdeVar7 = aborVarK4.b;
                                    strB2.getClass();
                                    zdeVar7.b |= 2;
                                    zdeVar7.d = strB2;
                                    zde zdeVarQ3 = aborVarK4.q();
                                    aborVarK3.t();
                                    zdg zdgVar6 = aborVarK3.b;
                                    zdeVarQ3.getClass();
                                    zdgVar6.c = zdeVarQ3;
                                    zdgVar6.b |= 1;
                                    zdg zdgVarQ2 = aborVarK3.q();
                                    aborVarK2.t();
                                    zdf zdfVar6 = aborVarK2.b;
                                    zdgVarQ2.getClass();
                                    zdfVar6.b();
                                    zdfVar6.b.set(i7, zdgVarQ2);
                                }
                                i7++;
                                it2 = it3;
                                zdfVar3 = zdfVar2;
                                vufVar = vufVar;
                            } else {
                                zdfVar2 = zdfVar3;
                            }
                            i7++;
                            it2 = it3;
                            zdfVar3 = zdfVar2;
                            vufVar = vufVar;
                        }
                        it = it2;
                        zdfVar = zdfVar3;
                        if (aborVarK2 != null) {
                            zdf zdfVarQ2 = aborVarK2.q();
                            aborVarN4.t();
                            zdh zdhVar5 = aborVarN4.b;
                            zdfVarQ2.getClass();
                            zdhVar5.d = zdfVarQ2;
                            zdhVar5.c = 4;
                        }
                    } else {
                        it = it2;
                        zdfVar = zdfVar3;
                        for (int i8 = 0; i8 < aborVarN4.b.f.size(); i8++) {
                            zde zdeVar8 = (zde) aborVarN4.b.f.get(i8);
                            if ((zdeVar8.b & 2) != 0) {
                                java.lang.String str3 = zdeVar8.d;
                                java.lang.String strB3 = vufVar.b();
                                if (!str3.equals(strB3)) {
                                    defpackage.abor aborVarK5 = zdeVar8.K();
                                    aborVarK5.t();
                                    zde zdeVar9 = aborVarK5.b;
                                    strB3.getClass();
                                    zdeVar9.b |= 2;
                                    zdeVar9.d = strB3;
                                    zde zdeVarQ4 = aborVarK5.q();
                                    aborVarN4.t();
                                    zdh zdhVar6 = aborVarN4.b;
                                    zdeVarQ4.getClass();
                                    zdhVar6.b();
                                    zdhVar6.f.set(i8, zdeVarQ4);
                                }
                            }
                        }
                    }
                    it2 = it;
                    zdfVar3 = zdfVar;
                }
                aborVarN2.t();
                ajhg ajhgVar4 = aborVarN2.b;
                name.getClass();
                ajhgVar4.b |= 8;
                ajhgVar4.f = name;
                java.lang.Class<?> cls = th.getClass();
                if (cls == java.lang.OutOfMemoryError.class) {
                    i = 3;
                } else if (java.lang.NullPointerException.class.isAssignableFrom(cls)) {
                    i = 2;
                } else if (java.lang.RuntimeException.class.isAssignableFrom(cls)) {
                    i = 4;
                } else {
                    i = java.lang.Error.class.isAssignableFrom(cls) ? 5 : 1;
                }
                aborVarN2.t();
                ajhg ajhgVar5 = aborVarN2.b;
                ajhgVar5.g = i - 1;
                ajhgVar5.b |= 16;
                aborVarN2.t();
                ajhg ajhgVar6 = aborVarN2.b;
                name2.getClass();
                ajhgVar6.b |= 128;
                ajhgVar6.h = name2;
                zdh zdhVarQ = aborVarN4.q();
                aborVarN2.t();
                ajhg ajhgVar7 = aborVarN2.b;
                zdhVarQ.getClass();
                ajhgVar7.i = zdhVarQ;
                ajhgVar7.b |= 256;
                int i9 = xuu.a;
                vuc vucVar = (vuc) vtzVar.d.a();
                if (vucVar.b && (odnVarB2 = xuu.b(th)) != null) {
                    defpackage.ygw ygwVar = ((xvt) odnVarB2.a).a;
                    int i10 = vucVar.c;
                    int i11 = vucVar.d;
                    int i12 = vucVar.e;
                    java.util.List listU = defpackage.ysr.U(ygwVar);
                    java.util.ArrayList arrayListS = defpackage.ysr.S(java.lang.Math.min(((defpackage.ymx) ygwVar).c, i11));
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int i13 = 0;
                    int length2 = 0;
                    while (true) {
                        if (i13 >= listU.size()) {
                            aborVarN = null;
                            break;
                        }
                        int i14 = i13 + 1;
                        if (i14 > i11) {
                            aborVarN = ajhe.a.n();
                            int size2 = listU.size() - i13;
                            aborVarN.t();
                            ajhe ajheVar = aborVarN.b;
                            ajheVar.b |= 1;
                            ajheVar.c = size2;
                        } else {
                            java.lang.String str4 = (java.lang.String) listU.get(i13);
                            int i15 = i11;
                            if (java.lang.Math.min(str4.length(), i10) + length2 > i12) {
                                aborVarN = ajhe.a.n();
                                int size3 = listU.size() - i13;
                                aborVarN.t();
                                ajhe ajheVar2 = aborVarN.b;
                                ajheVar2.b |= 2;
                                ajheVar2.d = size3;
                            } else {
                                if (str4.length() > i10) {
                                    i2 = i3;
                                    arrayListS.add(str4.substring(i2, i10));
                                    arrayList2.add(java.lang.Integer.valueOf(i13));
                                    arrayList3.add(java.lang.Integer.valueOf(str4.length() - i10));
                                    length2 += i10;
                                } else {
                                    i2 = i3;
                                    arrayListS.add(str4);
                                    length2 += str4.length();
                                }
                                i13 = i14;
                                listU = listU;
                                i3 = i2;
                                i11 = i15;
                            }
                        }
                        break;
                    }
                    if (!arrayList2.isEmpty()) {
                        if (aborVarN == null) {
                            aborVarN = ajhe.a.n();
                        }
                        int size4 = arrayList2.size();
                        for (int i16 = i3; i16 < size4; i16++) {
                            int size5 = (arrayListS.size() - ((java.lang.Integer) arrayList2.get(i16)).intValue()) - 1;
                            aborVarN.t();
                            ajhe ajheVar3 = aborVarN.b;
                            ajhe ajheVar4 = ajhe.a;
                            defpackage.abpf abpfVar2 = ajheVar3.e;
                            if (!abpfVar2.c()) {
                                ajheVar3.e = defpackage.abox.G(abpfVar2);
                            }
                            ajheVar3.e.g(size5);
                        }
                        aborVarN.t();
                        ajhe ajheVar5 = aborVarN.b;
                        ajhe ajheVar6 = ajhe.a;
                        defpackage.abpf abpfVar3 = ajheVar5.f;
                        if (!abpfVar3.c()) {
                            ajheVar5.f = defpackage.abox.G(abpfVar3);
                        }
                        defpackage.abnf.i(arrayList3, ajheVar5.f);
                    }
                    defpackage.abor aborVarN7 = ajhf.a.n();
                    java.util.List listU2 = defpackage.ysr.U(arrayListS);
                    aborVarN7.t();
                    ajhf ajhfVar = aborVarN7.b;
                    defpackage.abpj abpjVar = ajhfVar.c;
                    if (!abpjVar.c()) {
                        ajhfVar.c = defpackage.abox.I(abpjVar);
                    }
                    defpackage.abnf.i(listU2, ajhfVar.c);
                    if (aborVarN != null) {
                        ajhe ajheVarQ = aborVarN.q();
                        aborVarN7.t();
                        ajhf ajhfVar2 = aborVarN7.b;
                        ajheVarQ.getClass();
                        ajhfVar2.d = ajheVarQ;
                        ajhfVar2.b |= 1;
                    }
                    ajhf ajhfVarQ = aborVarN7.q();
                    aborVarN2.t();
                    ajhg ajhgVar8 = aborVarN2.b;
                    ajhfVarQ.getClass();
                    ajhgVar8.j = ajhfVarQ;
                    ajhgVar8.b |= 1024;
                }
                ajhg ajhgVar9 = (ajhg) aborVarN2.q();
                defpackage.xyn xynVarG = (!((java.lang.Boolean) vtzVar.h.a.a()).booleanValue() || (odnVarB = xuu.b(th)) == null || (vuuVarB = vuu.b(((xvt) odnVarB.a).b)) == null) ? defpackage.xxe.a : defpackage.xyn.g(vuuVarB.a());
                vtzVar.o(ajhgVar9, (vut) xynVarG.e());
            } catch (java.lang.Exception e2) {
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e2)).ai(9839)).u("Failed to record crash.");
            }
        } finally {
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}

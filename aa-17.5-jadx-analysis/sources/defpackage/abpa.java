package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class abpa implements abpl {
    private final abow a;
    private final abpv b;
    private final boolean c;

    public abpa(abpv abpvVar, abow abowVar) {
        this.b = abpvVar;
        this.c = abowVar instanceof abns;
        this.a = abowVar;
    }

    @Override // defpackage.abpl
    public final int a(Object obj) {
        int i;
        int iN;
        int iNumberOfLeadingZeros;
        int iG;
        abpw abpwVarB = abpv.b(obj);
        int iNumberOfLeadingZeros2 = abpwVarB.e;
        if (iNumberOfLeadingZeros2 == -1) {
            iNumberOfLeadingZeros2 = 0;
            for (int i2 = 0; i2 < abpwVarB.b; i2++) {
                int i3 = abpwVarB.c[i2] >>> 3;
                abms abmsVar = (abms) abpwVarB.d[i2];
                int iNumberOfLeadingZeros3 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                int iN2 = iNumberOfLeadingZeros3 + iNumberOfLeadingZeros3 + abnd.N(i3);
                int iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(24) * 9;
                int iD = abmsVar.d();
                iNumberOfLeadingZeros2 += iN2 + ((352 - iNumberOfLeadingZeros4) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
            }
            abpwVarB.e = iNumberOfLeadingZeros2;
        }
        if (!this.c) {
            return iNumberOfLeadingZeros2;
        }
        abpq abpqVar = yrm.aA(obj).b;
        int size = abpqVar.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            abpn abpnVar = (abpn) abpqVar.a(i5);
            abnu abnuVar = abpnVar.c;
            Object obj2 = abpnVar.a;
            if (abnuVar.a() != abqe.i || abnuVar.d) {
                i = abnl.i(abnuVar, obj2);
            } else {
                if (obj2 instanceof abol) {
                    int i6 = abnuVar.b;
                    int iNumberOfLeadingZeros5 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                    iN = iNumberOfLeadingZeros5 + iNumberOfLeadingZeros5 + abnd.N(i6);
                    iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(24) * 9;
                    iG = ((abol) obj2).a();
                } else {
                    int i7 = abnuVar.b;
                    int iNumberOfLeadingZeros6 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                    iN = iNumberOfLeadingZeros6 + iNumberOfLeadingZeros6 + abnd.N(i7);
                    iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(24) * 9;
                    iG = abnd.G((abow) obj2);
                }
                i = iN + ((352 - iNumberOfLeadingZeros) >>> 6) + iG;
            }
            i4 += i;
        }
        return iNumberOfLeadingZeros2 + i4;
    }

    @Override // defpackage.abpl
    public final int b(Object obj) {
        int iHashCode = abpv.b(obj).hashCode();
        return this.c ? (iHashCode * 53) + yrm.aA(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.abpl
    public final Object e() {
        abow abowVar = this.a;
        return abowVar instanceof abnv ? ((abnv) abowVar).u() : abowVar.J().r();
    }

    @Override // defpackage.abpl
    public final void g(Object obj) {
        ((abnv) obj).al.d();
        ((abns) obj).w.e();
    }

    @Override // defpackage.abpl
    public final void h(Object obj, Object obj2) {
        abpv abpvVar = abpm.a;
        abpv.d(obj, abpv.c(abpv.b(obj), abpv.b(obj2)));
        if (this.c) {
            abpm.j(obj, obj2);
        }
    }

    @Override // defpackage.abpl
    public final void i(Object obj, abmx abmxVar, abnj abnjVar) throws IOException {
        boolean zO;
        abpw abpwVarE = abpv.e(obj);
        abnl abnlVarI = ((abns) obj).i();
        abpv abpvVar = this.b;
        do {
            try {
                int iC = abmxVar.c();
                if (iC == Integer.MAX_VALUE) {
                    break;
                }
                int i = abmxVar.b;
                zO = true;
                if (i == 11) {
                    abnh abnhVarB = null;
                    abms abmsVarO = null;
                    int i2 = 0;
                    for (int i3 = Alert.DURATION_SHOW_INDEFINITELY; abmxVar.c() != i3; i3 = Alert.DURATION_SHOW_INDEFINITELY) {
                        int i4 = abmxVar.b;
                        if (i4 == 16) {
                            i2 = abmxVar.i();
                            abnhVarB = abnjVar.b(this.a, i2);
                        } else if (i4 != 26) {
                            if (i4 == 12 || !abmxVar.O()) {
                                break;
                            }
                        } else if (abnhVarB != null) {
                            yrm.aB(abmxVar, abnhVarB, abnjVar, abnlVarI);
                        } else {
                            abmsVarO = abmxVar.o();
                        }
                    }
                    if (abmxVar.b != 12) {
                        throw new abon("Protocol message end-group tag did not match expected tag.");
                    }
                    if (abmsVarO != null) {
                        if (abnhVarB != null) {
                            abmw abmwVar = abmxVar.a;
                            int i5 = ((abmwVar.i - abmwVar.g) - abmwVar.h) - 1;
                            if (i5 < 0) {
                                throw new abon("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                            }
                            abmw abmwVarG = abmsVarO.g();
                            abmwVarG.i = i5;
                            abov abovVarJ = abnhVarB.c.J();
                            abovVarJ.j(abmwVarG, abnjVar);
                            abnlVarI.l(abnhVarB.d, abovVarJ.r());
                            abmwVarG.C(0);
                        } else {
                            abpwVarE.e((i2 << 3) | 2, abmsVarO);
                        }
                    }
                } else if ((i & 7) == 2) {
                    abnh abnhVarB2 = abnjVar.b(this.a, i >>> 3);
                    if (abnhVarB2 != null) {
                        yrm.aB(abmxVar, abnhVarB2, abnjVar, abnlVarI);
                    } else {
                        zO = abpvVar.a(abpwVarE, abmxVar, 0);
                    }
                } else {
                    zO = abmxVar.O();
                }
            } finally {
                abpv.d(obj, abpwVarE);
            }
        } while (zO);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3 A[EDGE_INSN: B:61:0x00b3->B:33:0x00b3 BREAK  A[LOOP:1: B:17:0x0061->B:64:0x0061], SYNTHETIC] */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.abmg r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            abnv r0 = (defpackage.abnv) r0
            abpw r1 = r0.al
            abpw r2 = defpackage.abpw.a
            if (r1 != r2) goto L10
            abpw r1 = new abpw
            r1.<init>()
            r0.al = r1
        L10:
            r6 = r1
            abns r11 = (defpackage.abns) r11
            abnl r11 = r11.i()
            r0 = 0
            r1 = r0
        L19:
            if (r13 >= r14) goto Lc0
            int r4 = defpackage.abmh.l(r12, r13, r15)
            int r2 = r15.a
            r13 = 11
            r3 = 2
            if (r2 == r13) goto L5d
            r13 = r2 & 7
            if (r13 != r3) goto L56
            abnj r13 = r15.d
            abow r1 = r10.a
            int r3 = r2 >>> 3
            abnh r1 = r13.b(r1, r3)
            if (r1 == 0) goto L4e
            abow r13 = r1.c
            abpe r2 = defpackage.abpe.a
            java.lang.Class r13 = r13.getClass()
            abpl r13 = r2.b(r13)
            int r13 = defpackage.abmh.f(r13, r12, r4, r14, r15)
            java.lang.Object r2 = r15.c
            abnu r3 = r1.d
            r11.l(r3, r2)
            goto L19
        L4e:
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.abmh.k(r2, r3, r4, r5, r6, r7)
            goto L19
        L56:
            r5 = r14
            r7 = r15
            int r13 = defpackage.abmh.r(r2, r12, r4, r5, r7)
            goto L19
        L5d:
            r5 = r14
            r7 = r15
            r13 = 0
            r14 = r0
        L61:
            if (r4 >= r5) goto Lb2
            int r15 = defpackage.abmh.l(r12, r4, r7)
            int r2 = r7.a
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L98
            r9 = 3
            if (r4 == r9) goto L73
            goto La9
        L73:
            if (r1 == 0) goto L8d
            abow r2 = r1.c
            abpe r4 = defpackage.abpe.a
            java.lang.Class r2 = r2.getClass()
            abpl r2 = r4.b(r2)
            int r4 = defpackage.abmh.f(r2, r12, r15, r5, r7)
            java.lang.Object r15 = r7.c
            abnu r2 = r1.d
            r11.l(r2, r15)
            goto L61
        L8d:
            if (r8 != r3) goto La9
            int r4 = defpackage.abmh.b(r12, r15, r7)
            java.lang.Object r14 = r7.c
            abms r14 = (defpackage.abms) r14
            goto L61
        L98:
            if (r8 != 0) goto La9
            int r4 = defpackage.abmh.l(r12, r15, r7)
            int r13 = r7.a
            abnj r15 = r7.d
            abow r1 = r10.a
            abnh r1 = r15.b(r1, r13)
            goto L61
        La9:
            r4 = 12
            if (r2 == r4) goto Lb3
            int r4 = defpackage.abmh.r(r2, r12, r15, r5, r7)
            goto L61
        Lb2:
            r15 = r4
        Lb3:
            if (r14 == 0) goto Lbb
            int r13 = r13 << 3
            r13 = r13 | r3
            r6.e(r13, r14)
        Lbb:
            r13 = r15
            r14 = r5
            r15 = r7
            goto L19
        Lc0:
            r5 = r14
            if (r13 != r5) goto Lc4
            return
        Lc4:
            abon r10 = new abon
            java.lang.String r11 = "Failed to parse the message."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpa.j(java.lang.Object, byte[], int, int, abmg):void");
    }

    @Override // defpackage.abpl
    public final boolean k(Object obj, Object obj2) {
        if (!abpv.b(obj).equals(abpv.b(obj2))) {
            return false;
        }
        if (this.c) {
            return yrm.aA(obj).equals(yrm.aA(obj2));
        }
        return true;
    }

    @Override // defpackage.abpl
    public final boolean l(Object obj) {
        return yrm.aA(obj).h();
    }

    @Override // defpackage.abpl
    public final void m(Object obj, lds ldsVar) throws IOException {
        abms abmsVar;
        Iterator itD = yrm.aA(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            abnu abnuVar = (abnu) entry.getKey();
            if (abnuVar.a() != abqe.i || abnuVar.d) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof aboj) {
                int i = abnuVar.b;
                abol abolVar = (abol) ((aboj) entry).a.getValue();
                if (abolVar.a != null) {
                    abmsVar = abolVar.a;
                } else {
                    synchronized (abolVar) {
                        if (abolVar.a != null) {
                            abmsVar = abolVar.a;
                        } else {
                            abolVar.a = abolVar.b.f();
                            abmsVar = abolVar.a;
                        }
                    }
                }
                ldsVar.A(i, abmsVar);
            } else {
                ldsVar.A(abnuVar.b, entry.getValue());
            }
        }
        abpw abpwVarB = abpv.b(obj);
        for (int i2 = 0; i2 < abpwVarB.b; i2++) {
            ldsVar.A(abpwVarB.c[i2] >>> 3, abpwVarB.d[i2]);
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iv {
    final defpackage.izq d;
    private final defpackage.dzr f = new defpackage.dzs(30);
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final java.util.ArrayList b = new java.util.ArrayList();
    public int c = 0;
    final defpackage.kwv e = new defpackage.kwv(this);

    public iv(defpackage.izq izqVar) {
        this.d = izqVar;
    }

    private final int l(int i, int i2) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            iu iuVar = (iu) arrayList.get(size);
            int i3 = iuVar.a;
            if (i3 == 8) {
                int i4 = iuVar.b;
                int i5 = iuVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            iuVar.b = i4 + 1;
                            iuVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            iuVar.b = i4 - 1;
                            iuVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        iuVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        iuVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        iuVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        iuVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = iuVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= iuVar.d;
                    } else if (i3 == 2) {
                        i += iuVar.d;
                    }
                } else if (i2 == 1) {
                    iuVar.b = i8 + 1;
                } else if (i2 == 2) {
                    iuVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            iu iuVar2 = (iu) arrayList.get(size2);
            if (iuVar2.a == 8) {
                int i9 = iuVar2.d;
                if (i9 == iuVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(iuVar2);
                }
            } else if (iuVar2.d <= 0) {
                arrayList.remove(size2);
                g(iuVar2);
            }
        }
    }

    private final void m(iu iuVar) {
        int i;
        int i2 = iuVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(iuVar.b, i2);
        int i3 = iuVar.b;
        int i4 = iuVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                java.util.Objects.toString(iuVar);
                throw new java.lang.IllegalArgumentException("op should be remove or update.".concat(java.lang.String.valueOf(iuVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < iuVar.d; i6++) {
            int iL2 = l(iuVar.b + (i * i6), iuVar.a);
            int i7 = iuVar.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                iu iuVarB = b(i7, iL, i5, iuVar.c);
                e(iuVarB, i3);
                g(iuVarB);
                if (iuVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        java.lang.Object obj = iuVar.c;
        g(iuVar);
        if (i5 > 0) {
            iu iuVarB2 = b(iuVar.a, iL, i5, obj);
            e(iuVarB2, i3);
            g(iuVarB2);
        }
    }

    private final void n(iu iuVar) {
        this.b.add(iuVar);
        int i = iuVar.a;
        if (i == 1) {
            this.d.t(iuVar.b, iuVar.d);
            return;
        }
        if (i == 2) {
            defpackage.izq izqVar = this.d;
            int i2 = iuVar.b;
            int i3 = iuVar.d;
            android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) izqVar.a;
            recyclerView.P(i2, i3, false);
            recyclerView.O = true;
            return;
        }
        if (i == 4) {
            this.d.s(iuVar.b, iuVar.d, iuVar.c);
        } else if (i == 8) {
            this.d.u(iuVar.b, iuVar.d);
        } else {
            java.util.Objects.toString(iuVar);
            throw new java.lang.IllegalArgumentException("Unknown update op type for ".concat(java.lang.String.valueOf(iuVar)));
        }
    }

    private final boolean o(int i) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            iu iuVar = (iu) arrayList.get(i2);
            int i4 = iuVar.a;
            if (i4 == 8) {
                if (a(iuVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = iuVar.b;
                int i6 = iuVar.d + i5;
                while (i5 < i6) {
                    if (a(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i, int i2) {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            iu iuVar = (iu) arrayList.get(i2);
            int i3 = iuVar.a;
            if (i3 == 8) {
                int i4 = iuVar.b;
                if (i4 == i) {
                    i = iuVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (iuVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = iuVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = iuVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += iuVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final iu b(int i, int i2, int i3, java.lang.Object obj) {
        iu iuVar = (iu) this.f.a();
        if (iuVar == null) {
            return new iu(i, i2, i3, obj);
        }
        iuVar.a = i;
        iuVar.b = i2;
        iuVar.d = i3;
        iuVar.c = obj;
        return iuVar;
    }

    public final void c() {
        java.util.ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.r((iu) arrayList.get(i));
        }
        h(arrayList);
        this.c = 0;
    }

    public final void d() {
        c();
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            iu iuVar = (iu) arrayList.get(i);
            int i2 = iuVar.a;
            if (i2 == 1) {
                defpackage.izq izqVar = this.d;
                izqVar.r(iuVar);
                izqVar.t(iuVar.b, iuVar.d);
            } else if (i2 == 2) {
                defpackage.izq izqVar2 = this.d;
                izqVar2.r(iuVar);
                izqVar2.v(iuVar.b, iuVar.d);
            } else if (i2 == 4) {
                defpackage.izq izqVar3 = this.d;
                izqVar3.r(iuVar);
                izqVar3.s(iuVar.b, iuVar.d, iuVar.c);
            } else if (i2 == 8) {
                defpackage.izq izqVar4 = this.d;
                izqVar4.r(iuVar);
                izqVar4.u(iuVar.b, iuVar.d);
            }
        }
        h(arrayList);
        this.c = 0;
    }

    final void e(iu iuVar, int i) {
        defpackage.izq izqVar = this.d;
        izqVar.r(iuVar);
        int i2 = iuVar.a;
        if (i2 == 2) {
            izqVar.v(i, iuVar.d);
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            izqVar.s(i, iuVar.d, iuVar.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0180  */
    /* JADX WARN: Code duplicated, block: B:105:0x018e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:184:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:78:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x0145  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x0175  */
    public final void f() {
        java.util.ArrayList arrayList;
        int i;
        boolean z;
        byte b;
        iu iuVarB;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        iu iuVarB2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        while (true) {
            arrayList = this.a;
            i = -1;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((iu) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                } else {
                    z4 = false;
                }
                size--;
            }
            iu iuVarB3 = null;
            if (size == -1) {
                break;
            }
            defpackage.kwv kwvVar = this.e;
            int i13 = size + 1;
            iu iuVar = (iu) arrayList.get(size);
            iu iuVar2 = (iu) arrayList.get(i13);
            int i14 = iuVar2.a;
            if (i14 == 1) {
                int i15 = iuVar.d;
                int i16 = iuVar2.b;
                i = i15 >= i16 ? 0 : -1;
                int i17 = iuVar.b;
                if (i17 < i16) {
                    i++;
                }
                if (i16 <= i17) {
                    iuVar.b = i17 + iuVar2.d;
                }
                int i18 = iuVar2.b;
                if (i18 <= i15) {
                    iuVar.d = i15 + iuVar2.d;
                }
                iuVar2.b = i18 + i;
                arrayList.set(size, iuVar2);
                arrayList.set(i13, iuVar);
            } else if (i14 == 2) {
                int i19 = iuVar.b;
                int i20 = iuVar.d;
                if (i19 < i20) {
                    if (iuVar2.b == i19 && iuVar2.d == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (iuVar2.b == i20 + 1 && iuVar2.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = iuVar2.b;
                if (i20 < i21) {
                    i21--;
                    iuVar2.b = i21;
                } else {
                    int i22 = iuVar2.d;
                    if (i20 < i21 + i22) {
                        iuVar2.d = i22 - 1;
                        iuVar.a = 2;
                        iuVar.d = 1;
                        if (iuVar2.d == 0) {
                            arrayList.remove(i13);
                            ((defpackage.iv) kwvVar.a).g(iuVar2);
                        }
                    }
                }
                int i23 = iuVar.b;
                if (i23 <= i21) {
                    iuVar2.b = i21 + 1;
                } else {
                    int i24 = i21 + iuVar2.d;
                    if (i23 < i24) {
                        iuVarB2 = ((defpackage.iv) kwvVar.a).b(2, i23 + 1, i24 - i23, null);
                        iuVar2.d = iuVar.b - iuVar2.b;
                    }
                    if (z3) {
                        arrayList.set(size, iuVar2);
                        arrayList.remove(i13);
                        ((defpackage.iv) kwvVar.a).g(iuVar);
                    } else {
                        if (z2) {
                            if (iuVarB2 != null) {
                                i11 = iuVar.b;
                                if (i11 > iuVarB2.b) {
                                    iuVar.b = i11 - iuVarB2.d;
                                }
                                i12 = iuVar.d;
                                if (i12 > iuVarB2.b) {
                                    iuVar.d = i12 - iuVarB2.d;
                                }
                                iuVarB3 = iuVarB2;
                            }
                            i9 = iuVar.b;
                            if (i9 > iuVar2.b) {
                                iuVar.b = i9 - iuVar2.d;
                            }
                            i10 = iuVar.d;
                            if (i10 > iuVar2.b) {
                                iuVar.d = i10 - iuVar2.d;
                            }
                        } else {
                            if (iuVarB2 != null) {
                                i7 = iuVar.b;
                                if (i7 >= iuVarB2.b) {
                                    iuVar.b = i7 - iuVarB2.d;
                                }
                                i8 = iuVar.d;
                                if (i8 >= iuVarB2.b) {
                                    iuVar.d = i8 - iuVarB2.d;
                                }
                                iuVarB3 = iuVarB2;
                            }
                            i5 = iuVar.b;
                            if (i5 >= iuVar2.b) {
                                iuVar.b = i5 - iuVar2.d;
                            }
                            i6 = iuVar.d;
                            if (i6 >= iuVar2.b) {
                                iuVar.d = i6 - iuVar2.d;
                            }
                        }
                        arrayList.set(size, iuVar2);
                        if (iuVar.b != iuVar.d) {
                            arrayList.set(i13, iuVar);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (iuVarB3 != null) {
                            arrayList.add(size, iuVarB3);
                        }
                    }
                }
                iuVarB2 = null;
                if (z3) {
                    arrayList.set(size, iuVar2);
                    arrayList.remove(i13);
                    ((defpackage.iv) kwvVar.a).g(iuVar);
                } else {
                    if (z2) {
                        if (iuVarB2 != null) {
                            i11 = iuVar.b;
                            if (i11 > iuVarB2.b) {
                                iuVar.b = i11 - iuVarB2.d;
                            }
                            i12 = iuVar.d;
                            if (i12 > iuVarB2.b) {
                                iuVar.d = i12 - iuVarB2.d;
                            }
                            iuVarB3 = iuVarB2;
                        }
                        i9 = iuVar.b;
                        if (i9 > iuVar2.b) {
                            iuVar.b = i9 - iuVar2.d;
                        }
                        i10 = iuVar.d;
                        if (i10 > iuVar2.b) {
                            iuVar.d = i10 - iuVar2.d;
                        }
                    } else {
                        if (iuVarB2 != null) {
                            i7 = iuVar.b;
                            if (i7 >= iuVarB2.b) {
                                iuVar.b = i7 - iuVarB2.d;
                            }
                            i8 = iuVar.d;
                            if (i8 >= iuVarB2.b) {
                                iuVar.d = i8 - iuVarB2.d;
                            }
                            iuVarB3 = iuVarB2;
                        }
                        i5 = iuVar.b;
                        if (i5 >= iuVar2.b) {
                            iuVar.b = i5 - iuVar2.d;
                        }
                        i6 = iuVar.d;
                        if (i6 >= iuVar2.b) {
                            iuVar.d = i6 - iuVar2.d;
                        }
                    }
                    arrayList.set(size, iuVar2);
                    if (iuVar.b != iuVar.d) {
                        arrayList.set(i13, iuVar);
                    } else {
                        arrayList.remove(i13);
                    }
                    if (iuVarB3 != null) {
                        arrayList.add(size, iuVarB3);
                    }
                }
            } else if (i14 == 4) {
                int i25 = iuVar.d;
                int i26 = iuVar2.b;
                if (i25 < i26) {
                    iuVar2.b = i26 - 1;
                } else {
                    int i27 = iuVar2.d;
                    if (i25 < i26 + i27) {
                        iuVar2.d = i27 - 1;
                        iuVarB = ((defpackage.iv) kwvVar.a).b(4, iuVar.b, 1, iuVar2.c);
                    }
                    i2 = iuVar.b;
                    i3 = iuVar2.b;
                    if (i2 <= i3) {
                        iuVar2.b = i3 + 1;
                    } else {
                        i4 = i3 + iuVar2.d;
                        if (i2 < i4) {
                            int i28 = i4 - i2;
                            iuVarB3 = ((defpackage.iv) kwvVar.a).b(4, i2 + 1, i28, iuVar2.c);
                            iuVar2.d -= i28;
                        }
                    }
                    arrayList.set(i13, iuVar);
                    if (iuVar2.d > 0) {
                        arrayList.set(size, iuVar2);
                    } else {
                        arrayList.remove(size);
                        ((defpackage.iv) kwvVar.a).g(iuVar2);
                    }
                    if (iuVarB != null) {
                        arrayList.add(size, iuVarB);
                    }
                    if (iuVarB3 != null) {
                        arrayList.add(size, iuVarB3);
                    }
                }
                iuVarB = null;
                i2 = iuVar.b;
                i3 = iuVar2.b;
                if (i2 <= i3) {
                    iuVar2.b = i3 + 1;
                } else {
                    i4 = i3 + iuVar2.d;
                    if (i2 < i4) {
                        int i29 = i4 - i2;
                        iuVarB3 = ((defpackage.iv) kwvVar.a).b(4, i2 + 1, i29, iuVar2.c);
                        iuVar2.d -= i29;
                    }
                }
                arrayList.set(i13, iuVar);
                if (iuVar2.d > 0) {
                    arrayList.set(size, iuVar2);
                } else {
                    arrayList.remove(size);
                    ((defpackage.iv) kwvVar.a).g(iuVar2);
                }
                if (iuVarB != null) {
                    arrayList.add(size, iuVarB);
                }
                if (iuVarB3 != null) {
                    arrayList.add(size, iuVarB3);
                }
            }
        }
        int size2 = arrayList.size();
        int i30 = 0;
        while (i30 < size2) {
            iu iuVarB4 = (iu) arrayList.get(i30);
            int i31 = iuVarB4.a;
            if (i31 == 1) {
                n(iuVarB4);
            } else if (i31 == 2) {
                int i32 = iuVarB4.b;
                int i33 = iuVarB4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (this.d.q(i34) != null || o(i34)) {
                        if (b2 == 0) {
                            m(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            n(b(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != iuVarB4.d) {
                    g(iuVarB4);
                    iuVarB4 = b(2, i32, i35, null);
                }
                if (b2 == 0) {
                    m(iuVarB4);
                } else {
                    n(iuVarB4);
                }
            } else if (i31 == 4) {
                int i36 = iuVarB4.b;
                int i37 = iuVarB4.d + i36;
                int i38 = i36;
                int i39 = 0;
                while (i36 < i37) {
                    if (this.d.q(i36) != null || o(i36)) {
                        if (i == 0) {
                            m(b(4, i38, i39, iuVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 1;
                    } else {
                        if (i == 1) {
                            n(b(4, i38, i39, iuVarB4.c));
                            i38 = i36;
                            i39 = 0;
                        }
                        i = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != iuVarB4.d) {
                    java.lang.Object obj = iuVarB4.c;
                    g(iuVarB4);
                    iuVarB4 = b(4, i38, i39, obj);
                }
                if (i == 0) {
                    m(iuVarB4);
                } else {
                    n(iuVarB4);
                }
            } else if (i31 == 8) {
                n(iuVarB4);
            }
            i30++;
            i = -1;
        }
        arrayList.clear();
    }

    public final void g(iu iuVar) {
        iuVar.c = null;
        this.f.b(iuVar);
    }

    final void h(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((iu) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.c = 0;
    }

    public final boolean j(int i) {
        return (this.c & i) != 0;
    }

    public final boolean k() {
        return this.a.size() > 0;
    }
}

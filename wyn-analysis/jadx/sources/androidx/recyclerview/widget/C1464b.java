package androidx.recyclerview.widget;

import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464b {

    /* renamed from: d, reason: collision with root package name */
    public final G f18827d;

    /* renamed from: a, reason: collision with root package name */
    public final O0.d f18824a = new O0.d(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18825b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18826c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f18829f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final S f18828e = new S(this, 2);

    public C1464b(G g9) {
        this.f18827d = g9;
    }

    public final boolean a(int i5) {
        ArrayList arrayList = this.f18826c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1462a c1462a = (C1462a) arrayList.get(i10);
            int i11 = c1462a.f18816a;
            if (i11 != 8) {
                if (i11 == 1) {
                    int i12 = c1462a.f18817b;
                    int i13 = c1462a.f18819d + i12;
                    while (i12 < i13) {
                        if (f(i12, i10 + 1) == i5) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c1462a.f18819d, i10 + 1) == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f18826c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f18827d.a((C1462a) arrayList.get(i5));
        }
        k(arrayList);
        this.f18829f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f18825b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1462a c1462a = (C1462a) arrayList.get(i5);
            int i10 = c1462a.f18816a;
            G g9 = this.f18827d;
            if (i10 == 1) {
                g9.a(c1462a);
                int i11 = c1462a.f18817b;
                int i12 = c1462a.f18819d;
                RecyclerView recyclerView = g9.f18766a;
                recyclerView.offsetPositionRecordsForInsert(i11, i12);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i10 == 2) {
                g9.a(c1462a);
                int i13 = c1462a.f18817b;
                int i14 = c1462a.f18819d;
                RecyclerView recyclerView2 = g9.f18766a;
                recyclerView2.offsetPositionRecordsForRemove(i13, i14, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f18896c += i14;
            } else if (i10 == 4) {
                g9.a(c1462a);
                int i15 = c1462a.f18817b;
                int i16 = c1462a.f18819d;
                Object obj = c1462a.f18818c;
                RecyclerView recyclerView3 = g9.f18766a;
                recyclerView3.viewRangeUpdate(i15, i16, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i10 == 8) {
                g9.a(c1462a);
                int i17 = c1462a.f18817b;
                int i18 = c1462a.f18819d;
                RecyclerView recyclerView4 = g9.f18766a;
                recyclerView4.offsetPositionRecordsForMove(i17, i18);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f18829f = 0;
    }

    public final void d(C1462a c1462a) {
        int i5;
        int i10 = c1462a.f18816a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c1462a.f18817b, i10);
        int i11 = c1462a.f18817b;
        int i12 = c1462a.f18816a;
        if (i12 == 2) {
            i5 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1462a);
            }
            i5 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < c1462a.f18819d; i14++) {
            int iL2 = l((i5 * i14) + c1462a.f18817b, c1462a.f18816a);
            int i15 = c1462a.f18816a;
            if (i15 == 2 ? iL2 != iL : !(i15 == 4 && iL2 == iL + 1)) {
                C1462a c1462aH = h(i15, iL, i13, c1462a.f18818c);
                e(c1462aH, i11);
                c1462aH.f18818c = null;
                this.f18824a.c(c1462aH);
                if (c1462a.f18816a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iL = iL2;
            } else {
                i13++;
            }
        }
        Object obj = c1462a.f18818c;
        c1462a.f18818c = null;
        this.f18824a.c(c1462a);
        if (i13 > 0) {
            C1462a c1462aH2 = h(c1462a.f18816a, iL, i13, obj);
            e(c1462aH2, i11);
            c1462aH2.f18818c = null;
            this.f18824a.c(c1462aH2);
        }
    }

    public final void e(C1462a c1462a, int i5) {
        G g9 = this.f18827d;
        g9.a(c1462a);
        int i10 = c1462a.f18816a;
        if (i10 == 2) {
            int i11 = c1462a.f18819d;
            RecyclerView recyclerView = g9.f18766a;
            recyclerView.offsetPositionRecordsForRemove(i5, i11, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f18896c += i11;
            return;
        }
        if (i10 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = c1462a.f18819d;
        Object obj = c1462a.f18818c;
        RecyclerView recyclerView2 = g9.f18766a;
        recyclerView2.viewRangeUpdate(i5, i12, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i5, int i10) {
        ArrayList arrayList = this.f18826c;
        int size = arrayList.size();
        while (i10 < size) {
            C1462a c1462a = (C1462a) arrayList.get(i10);
            int i11 = c1462a.f18816a;
            if (i11 == 8) {
                int i12 = c1462a.f18817b;
                if (i12 == i5) {
                    i5 = c1462a.f18819d;
                } else {
                    if (i12 < i5) {
                        i5--;
                    }
                    if (c1462a.f18819d <= i5) {
                        i5++;
                    }
                }
            } else {
                int i13 = c1462a.f18817b;
                if (i13 > i5) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c1462a.f18819d;
                    if (i5 < i13 + i14) {
                        return -1;
                    }
                    i5 -= i14;
                } else if (i11 == 1) {
                    i5 += c1462a.f18819d;
                }
            }
            i10++;
        }
        return i5;
    }

    public final boolean g() {
        return this.f18825b.size() > 0;
    }

    public final C1462a h(int i5, int i10, int i11, Object obj) {
        C1462a c1462a = (C1462a) this.f18824a.a();
        if (c1462a != null) {
            c1462a.f18816a = i5;
            c1462a.f18817b = i10;
            c1462a.f18819d = i11;
            c1462a.f18818c = obj;
            return c1462a;
        }
        C1462a c1462a2 = new C1462a();
        c1462a2.f18816a = i5;
        c1462a2.f18817b = i10;
        c1462a2.f18819d = i11;
        c1462a2.f18818c = obj;
        return c1462a2;
    }

    public final void i(C1462a c1462a) {
        this.f18826c.add(c1462a);
        int i5 = c1462a.f18816a;
        G g9 = this.f18827d;
        if (i5 == 1) {
            int i10 = c1462a.f18817b;
            int i11 = c1462a.f18819d;
            RecyclerView recyclerView = g9.f18766a;
            recyclerView.offsetPositionRecordsForInsert(i10, i11);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i5 == 2) {
            int i12 = c1462a.f18817b;
            int i13 = c1462a.f18819d;
            RecyclerView recyclerView2 = g9.f18766a;
            recyclerView2.offsetPositionRecordsForRemove(i12, i13, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i5 == 4) {
            int i14 = c1462a.f18817b;
            int i15 = c1462a.f18819d;
            Object obj = c1462a.f18818c;
            RecyclerView recyclerView3 = g9.f18766a;
            recyclerView3.viewRangeUpdate(i14, i15, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i5 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c1462a);
        }
        int i16 = c1462a.f18817b;
        int i17 = c1462a.f18819d;
        RecyclerView recyclerView4 = g9.f18766a;
        recyclerView4.offsetPositionRecordsForMove(i16, i17);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1464b.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1462a c1462a = (C1462a) arrayList.get(i5);
            c1462a.f18818c = null;
            this.f18824a.c(c1462a);
        }
        arrayList.clear();
    }

    public final int l(int i5, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = this.f18826c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1462a c1462a = (C1462a) arrayList.get(size);
            int i13 = c1462a.f18816a;
            if (i13 == 8) {
                int i14 = c1462a.f18817b;
                int i15 = c1462a.f18819d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i5 < i12 || i5 > i11) {
                    if (i5 < i14) {
                        if (i10 == 1) {
                            c1462a.f18817b = i14 + 1;
                            c1462a.f18819d = i15 + 1;
                        } else if (i10 == 2) {
                            c1462a.f18817b = i14 - 1;
                            c1462a.f18819d = i15 - 1;
                        }
                    }
                } else if (i12 == i14) {
                    if (i10 == 1) {
                        c1462a.f18819d = i15 + 1;
                    } else if (i10 == 2) {
                        c1462a.f18819d = i15 - 1;
                    }
                    i5++;
                } else {
                    if (i10 == 1) {
                        c1462a.f18817b = i14 + 1;
                    } else if (i10 == 2) {
                        c1462a.f18817b = i14 - 1;
                    }
                    i5--;
                }
            } else {
                int i16 = c1462a.f18817b;
                if (i16 <= i5) {
                    if (i13 == 1) {
                        i5 -= c1462a.f18819d;
                    } else if (i13 == 2) {
                        i5 += c1462a.f18819d;
                    }
                } else if (i10 == 1) {
                    c1462a.f18817b = i16 + 1;
                } else if (i10 == 2) {
                    c1462a.f18817b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1462a c1462a2 = (C1462a) arrayList.get(size2);
            if (c1462a2.f18816a == 8) {
                int i17 = c1462a2.f18819d;
                if (i17 == c1462a2.f18817b || i17 < 0) {
                    arrayList.remove(size2);
                    c1462a2.f18818c = null;
                    this.f18824a.c(c1462a2);
                }
            } else if (c1462a2.f18819d <= 0) {
                arrayList.remove(size2);
                c1462a2.f18818c = null;
                this.f18824a.c(c1462a2);
            }
        }
        return i5;
    }
}

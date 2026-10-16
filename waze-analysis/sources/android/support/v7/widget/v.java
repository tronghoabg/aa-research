package android.support.v7.widget;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class v {

    /* renamed from: d, reason: collision with root package name */
    final ei f1623d;

    /* renamed from: e, reason: collision with root package name */
    private final Pools.Pool f1624e = new Pools.SimplePool(30);

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f1620a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f1621b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private int f1625f = 0;

    /* renamed from: c, reason: collision with root package name */
    final ds f1622c = new ds(this);

    v(ei eiVar) {
        this.f1623d = eiVar;
    }

    private final int q(int i2, int i3) {
        ArrayList arrayList = this.f1621b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            u uVar = (u) arrayList.get(size);
            int i4 = uVar.f1616a;
            if (i4 == 8) {
                int i5 = uVar.f1617b;
                int i6 = uVar.f1619d;
                int i7 = i5 < i6 ? i6 : i5;
                int i8 = i5 < i6 ? i5 : i6;
                if (i2 < i8 || i2 > i7) {
                    if (i2 < i5) {
                        if (i3 == 1) {
                            uVar.f1617b = i5 + 1;
                            uVar.f1619d = i6 + 1;
                        } else if (i3 == 2) {
                            uVar.f1617b = i5 - 1;
                            uVar.f1619d = i6 - 1;
                        }
                    }
                } else if (i8 == i5) {
                    if (i3 == 1) {
                        uVar.f1619d = i6 + 1;
                    } else if (i3 == 2) {
                        uVar.f1619d = i6 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        uVar.f1617b = i5 + 1;
                    } else if (i3 == 2) {
                        uVar.f1617b = i5 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = uVar.f1617b;
                if (i9 <= i2) {
                    if (i4 == 1) {
                        i2 -= uVar.f1619d;
                    } else if (i4 == 2) {
                        i2 += uVar.f1619d;
                    }
                } else if (i3 == 1) {
                    uVar.f1617b = i9 + 1;
                } else if (i3 == 2) {
                    uVar.f1617b = i9 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i2;
            }
            u uVar2 = (u) arrayList.get(size2);
            if (uVar2.f1616a == 8) {
                int i10 = uVar2.f1619d;
                if (i10 == uVar2.f1617b || i10 < 0) {
                    arrayList.remove(size2);
                    h(uVar2);
                }
            } else if (uVar2.f1619d <= 0) {
                arrayList.remove(size2);
                h(uVar2);
            }
        }
    }

    private final void r(u uVar) {
        int i2;
        int i3 = uVar.f1616a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iQ = q(uVar.f1617b, i3);
        int i4 = uVar.f1617b;
        int i5 = uVar.f1616a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                Objects.toString(uVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(uVar)));
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < uVar.f1619d; i7++) {
            int iQ2 = q(uVar.f1617b + (i2 * i7), uVar.f1616a);
            int i8 = uVar.f1616a;
            if (i8 == 2 ? iQ2 != iQ : !(i8 == 4 && iQ2 == iQ + 1)) {
                u uVarC = c(i8, iQ, i6, uVar.f1618c);
                f(uVarC, i4);
                h(uVarC);
                if (uVar.f1616a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                iQ = iQ2;
            } else {
                i6++;
            }
        }
        Object obj = uVar.f1618c;
        h(uVar);
        if (i6 > 0) {
            u uVarC2 = c(uVar.f1616a, iQ, i6, obj);
            f(uVarC2, i4);
            h(uVarC2);
        }
    }

    private final void s(u uVar) {
        this.f1621b.add(uVar);
        int i2 = uVar.f1616a;
        if (i2 == 1) {
            this.f1623d.d(uVar.f1617b, uVar.f1619d);
            return;
        }
        if (i2 == 2) {
            ei eiVar = this.f1623d;
            int i3 = uVar.f1617b;
            int i4 = uVar.f1619d;
            RecyclerView recyclerView = eiVar.f1403a;
            recyclerView.X(i3, i4, false);
            recyclerView.F = true;
            return;
        }
        if (i2 == 4) {
            this.f1623d.c(uVar.f1617b, uVar.f1619d, uVar.f1618c);
        } else if (i2 == 8) {
            this.f1623d.e(uVar.f1617b, uVar.f1619d);
        } else {
            Objects.toString(uVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(uVar)));
        }
    }

    private final boolean t(int i2) {
        ArrayList arrayList = this.f1621b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            u uVar = (u) arrayList.get(i3);
            int i5 = uVar.f1616a;
            if (i5 == 8) {
                if (b(uVar.f1619d, i4) == i2) {
                    return true;
                }
            } else if (i5 == 1) {
                int i6 = uVar.f1617b;
                int i7 = uVar.f1619d + i6;
                while (i6 < i7) {
                    if (b(i6, i4) == i2) {
                        return true;
                    }
                    i6++;
                }
            } else {
                continue;
            }
            i3 = i4;
        }
        return false;
    }

    final int a(int i2) {
        return b(i2, 0);
    }

    final int b(int i2, int i3) {
        ArrayList arrayList = this.f1621b;
        int size = arrayList.size();
        while (i3 < size) {
            u uVar = (u) arrayList.get(i3);
            int i4 = uVar.f1616a;
            if (i4 == 8) {
                int i5 = uVar.f1617b;
                if (i5 == i2) {
                    i2 = uVar.f1619d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (uVar.f1619d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = uVar.f1617b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = uVar.f1619d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += uVar.f1619d;
                }
            }
            i3++;
        }
        return i2;
    }

    public final u c(int i2, int i3, int i4, Object obj) {
        u uVar = (u) this.f1624e.acquire();
        if (uVar == null) {
            return new u(i2, i3, i4, obj);
        }
        uVar.f1616a = i2;
        uVar.f1617b = i3;
        uVar.f1619d = i4;
        uVar.f1618c = obj;
        return uVar;
    }

    final void d() {
        ArrayList arrayList = this.f1621b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1623d.b((u) arrayList.get(i2));
        }
        i(arrayList);
        this.f1625f = 0;
    }

    final void e() {
        d();
        ArrayList arrayList = this.f1620a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) arrayList.get(i2);
            int i3 = uVar.f1616a;
            if (i3 == 1) {
                ei eiVar = this.f1623d;
                eiVar.b(uVar);
                eiVar.d(uVar.f1617b, uVar.f1619d);
            } else if (i3 == 2) {
                ei eiVar2 = this.f1623d;
                eiVar2.b(uVar);
                eiVar2.f(uVar.f1617b, uVar.f1619d);
            } else if (i3 == 4) {
                ei eiVar3 = this.f1623d;
                eiVar3.b(uVar);
                eiVar3.c(uVar.f1617b, uVar.f1619d, uVar.f1618c);
            } else if (i3 == 8) {
                ei eiVar4 = this.f1623d;
                eiVar4.b(uVar);
                eiVar4.e(uVar.f1617b, uVar.f1619d);
            }
        }
        i(arrayList);
        this.f1625f = 0;
    }

    final void f(u uVar, int i2) {
        ei eiVar = this.f1623d;
        eiVar.b(uVar);
        int i3 = uVar.f1616a;
        if (i3 == 2) {
            eiVar.f(i2, uVar.f1619d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            eiVar.c(i2, uVar.f1619d, uVar.f1618c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.v.g():void");
    }

    public final void h(u uVar) {
        uVar.f1618c = null;
        this.f1624e.release(uVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            h((u) list.get(i2));
        }
        list.clear();
    }

    final void j() {
        i(this.f1620a);
        i(this.f1621b);
        this.f1625f = 0;
    }

    final boolean k(int i2) {
        return (this.f1625f & i2) != 0;
    }

    final boolean l() {
        return this.f1620a.size() > 0;
    }

    final boolean m(int i2, int i3, Object obj) {
        if (i3 <= 0) {
            return false;
        }
        ArrayList arrayList = this.f1620a;
        arrayList.add(c(4, i2, i3, obj));
        this.f1625f |= 4;
        return arrayList.size() == 1;
    }

    final boolean n(int i2, int i3) {
        if (i3 <= 0) {
            return false;
        }
        ArrayList arrayList = this.f1620a;
        arrayList.add(c(1, i2, i3, null));
        this.f1625f |= 1;
        return arrayList.size() == 1;
    }

    final boolean o(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        ArrayList arrayList = this.f1620a;
        arrayList.add(c(8, i2, i3, null));
        this.f1625f |= 8;
        return arrayList.size() == 1;
    }

    final boolean p(int i2, int i3) {
        if (i3 <= 0) {
            return false;
        }
        ArrayList arrayList = this.f1620a;
        arrayList.add(c(2, i2, i3, null));
        this.f1625f |= 2;
        return arrayList.size() == 1;
    }
}

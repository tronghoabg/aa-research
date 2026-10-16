package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iu {
    final izj d;
    private final dzk f = new dzl(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final kwp e = new kwp(this);

    public iu(izj izjVar) {
        this.d = izjVar;
    }

    private final int l(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            it itVar = (it) arrayList.get(size);
            int i3 = itVar.a;
            if (i3 == 8) {
                int i4 = itVar.b;
                int i5 = itVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            itVar.b = i4 + 1;
                            itVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            itVar.b = i4 - 1;
                            itVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        itVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        itVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        itVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        itVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = itVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= itVar.d;
                    } else if (i3 == 2) {
                        i += itVar.d;
                    }
                } else if (i2 == 1) {
                    itVar.b = i8 + 1;
                } else if (i2 == 2) {
                    itVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            it itVar2 = (it) arrayList.get(size2);
            if (itVar2.a == 8) {
                int i9 = itVar2.d;
                if (i9 == itVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(itVar2);
                }
            } else if (itVar2.d <= 0) {
                arrayList.remove(size2);
                g(itVar2);
            }
        }
    }

    private final void m(it itVar) {
        int i;
        int i2 = itVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(itVar.b, i2);
        int i3 = itVar.b;
        int i4 = itVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(itVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(itVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < itVar.d; i6++) {
            int iL2 = l(itVar.b + (i * i6), itVar.a);
            int i7 = itVar.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                it itVarB = b(i7, iL, i5, itVar.c);
                e(itVarB, i3);
                g(itVarB);
                if (itVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        Object obj = itVar.c;
        g(itVar);
        if (i5 > 0) {
            it itVarB2 = b(itVar.a, iL, i5, obj);
            e(itVarB2, i3);
            g(itVarB2);
        }
    }

    private final void n(it itVar) {
        this.b.add(itVar);
        int i = itVar.a;
        if (i == 1) {
            this.d.t(itVar.b, itVar.d);
            return;
        }
        if (i == 2) {
            izj izjVar = this.d;
            int i2 = itVar.b;
            int i3 = itVar.d;
            RecyclerView recyclerView = (RecyclerView) izjVar.a;
            recyclerView.P(i2, i3, false);
            recyclerView.O = true;
            return;
        }
        if (i == 4) {
            this.d.s(itVar.b, itVar.d, itVar.c);
        } else if (i == 8) {
            this.d.u(itVar.b, itVar.d);
        } else {
            Objects.toString(itVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(itVar)));
        }
    }

    private final boolean o(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            it itVar = (it) arrayList.get(i2);
            int i4 = itVar.a;
            if (i4 == 8) {
                if (a(itVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = itVar.b;
                int i6 = itVar.d + i5;
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
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            it itVar = (it) arrayList.get(i2);
            int i3 = itVar.a;
            if (i3 == 8) {
                int i4 = itVar.b;
                if (i4 == i) {
                    i = itVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (itVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = itVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = itVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += itVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final it b(int i, int i2, int i3, Object obj) {
        it itVar = (it) this.f.a();
        if (itVar == null) {
            return new it(i, i2, i3, obj);
        }
        itVar.a = i;
        itVar.b = i2;
        itVar.d = i3;
        itVar.c = obj;
        return itVar;
    }

    public final void c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.r((it) arrayList.get(i));
        }
        h(arrayList);
        this.c = 0;
    }

    public final void d() {
        c();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            it itVar = (it) arrayList.get(i);
            int i2 = itVar.a;
            if (i2 == 1) {
                izj izjVar = this.d;
                izjVar.r(itVar);
                izjVar.t(itVar.b, itVar.d);
            } else if (i2 == 2) {
                izj izjVar2 = this.d;
                izjVar2.r(itVar);
                izjVar2.v(itVar.b, itVar.d);
            } else if (i2 == 4) {
                izj izjVar3 = this.d;
                izjVar3.r(itVar);
                izjVar3.s(itVar.b, itVar.d, itVar.c);
            } else if (i2 == 8) {
                izj izjVar4 = this.d;
                izjVar4.r(itVar);
                izjVar4.u(itVar.b, itVar.d);
            }
        }
        h(arrayList);
        this.c = 0;
    }

    final void e(it itVar, int i) {
        izj izjVar = this.d;
        izjVar.r(itVar);
        int i2 = itVar.a;
        if (i2 == 2) {
            izjVar.v(i, itVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            izjVar.s(i, itVar.d, itVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu.f():void");
    }

    public final void g(it itVar) {
        itVar.c = null;
        this.f.b(itVar);
    }

    final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((it) list.get(i));
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

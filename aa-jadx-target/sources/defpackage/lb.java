package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lb implements java.lang.Runnable {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    static final java.util.Comparator b = new defpackage.cwq(1);
    long d;
    public long e;
    public final java.util.ArrayList c = new java.util.ArrayList();
    private final java.util.ArrayList f = new java.util.ArrayList();

    private static final defpackage.mr b(android.support.v7.widget.RecyclerView recyclerView, int i, long j) {
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(recyclerView.h.e(i2));
            if (mrVarK.c == i && !mrVarK.t()) {
                return null;
            }
        }
        defpackage.mh mhVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                defpackage.dwk.a();
            } finally {
                recyclerView.R(false);
            }
        }
        recyclerView.Q();
        defpackage.mr mrVarO = mhVar.o(i, j);
        if (mrVarO != null) {
            if (!mrVarO.s() || mrVarO.t()) {
                mhVar.b(mrVarO, false);
            } else {
                mhVar.i(mrVarO.a);
            }
        }
        return mrVarO;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q && this.d == 0) {
            this.d = java.lang.System.nanoTime();
            recyclerView.post(this);
        }
        defpackage.kz kzVar = recyclerView.M;
        kzVar.a = i;
        kzVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        la laVar;
        android.support.v7.widget.RecyclerView recyclerView;
        java.lang.ref.WeakReference weakReference;
        android.support.v7.widget.RecyclerView recyclerView2;
        la laVar2;
        long j = 0;
        try {
            java.util.ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    long jMax = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        android.support.v7.widget.RecyclerView recyclerView3 = (android.support.v7.widget.RecyclerView) arrayList.get(i2);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            jMax = java.lang.Math.max(recyclerView3.getDrawingTime(), jMax);
                        }
                    }
                    if (jMax != 0) {
                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jMax) + this.e;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            android.support.v7.widget.RecyclerView recyclerView4 = (android.support.v7.widget.RecyclerView) arrayList.get(i4);
                            if (recyclerView4.getWindowVisibility() == 0) {
                                recyclerView4.M.c(recyclerView4, false);
                                i3 += recyclerView4.M.d;
                            }
                        }
                        java.util.ArrayList arrayList2 = this.f;
                        arrayList2.ensureCapacity(i3);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < size2) {
                            android.support.v7.widget.RecyclerView recyclerView5 = (android.support.v7.widget.RecyclerView) arrayList.get(i5);
                            if (recyclerView5.getWindowVisibility() == 0) {
                                defpackage.kz kzVar = recyclerView5.M;
                                int iAbs = java.lang.Math.abs(kzVar.a) + java.lang.Math.abs(kzVar.b);
                                int i7 = i;
                                while (true) {
                                    int i8 = kzVar.d;
                                    if (i7 < i8 + i8) {
                                        if (i6 >= arrayList2.size()) {
                                            laVar2 = new la();
                                            arrayList2.add(laVar2);
                                        } else {
                                            laVar2 = (la) arrayList2.get(i6);
                                        }
                                        int[] iArr = kzVar.c;
                                        int i9 = iArr[i7 + 1];
                                        laVar2.a = i9 <= iAbs;
                                        laVar2.b = iAbs;
                                        laVar2.c = i9;
                                        laVar2.d = recyclerView5;
                                        laVar2.e = iArr[i7];
                                        i6++;
                                        i7 += 2;
                                    }
                                }
                            }
                            i5++;
                            i = 0;
                        }
                        java.util.Collections.sort(arrayList2, b);
                        for (int i10 = 0; i10 < arrayList2.size() && (recyclerView = (laVar = (la) arrayList2.get(i10)).d) != null; i10++) {
                            defpackage.mr mrVarB = b(recyclerView, laVar.e, true != laVar.a ? nanos : Long.MAX_VALUE);
                            if (mrVarB != null && (weakReference = mrVarB.b) != null && mrVarB.s() && !mrVarB.t() && (recyclerView2 = (android.support.v7.widget.RecyclerView) weakReference.get()) != null) {
                                if (recyclerView2.y && recyclerView2.h.b() != 0) {
                                    recyclerView2.U();
                                }
                                defpackage.kz kzVar2 = recyclerView2.M;
                                kzVar2.c(recyclerView2, true);
                                if (kzVar2.d != 0) {
                                    defpackage.mo moVar = recyclerView2.N;
                                    defpackage.lw lwVar = recyclerView2.m;
                                    moVar.d = 1;
                                    moVar.e = lwVar.a();
                                    moVar.g = false;
                                    moVar.h = false;
                                    moVar.i = false;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = kzVar2.d;
                                        if (i11 >= i12 + i12) {
                                            break;
                                        }
                                        b(recyclerView2, kzVar2.c[i11], nanos);
                                        i11 += 2;
                                        th = th;
                                        j = 0;
                                        this.d = j;
                                        throw th;
                                    }
                                }
                            }
                            laVar.a = false;
                            laVar.b = 0;
                            laVar.c = 0;
                            laVar.d = null;
                            laVar.e = 0;
                        }
                        j = 0;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    j = 0;
                }
            }
            this.d = j;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}

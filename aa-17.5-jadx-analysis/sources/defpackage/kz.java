package defpackage;

import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kz implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new cwg(1);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final mo b(RecyclerView recyclerView, int i, long j) {
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            mo moVarK = RecyclerView.k(recyclerView.h.e(i2));
            if (moVarK.c == i && !moVarK.t()) {
                return null;
            }
        }
        me meVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                dwd.a();
            } finally {
                recyclerView.R(false);
            }
        }
        recyclerView.Q();
        mo moVarO = meVar.o(i, j);
        if (moVarO != null) {
            if (!moVarO.s() || moVarO.t()) {
                meVar.b(moVarO, false);
            } else {
                meVar.i(moVarO.a);
            }
        }
        return moVarO;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        kx kxVar = recyclerView.M;
        kxVar.a = i;
        kxVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ky kyVar;
        RecyclerView recyclerView;
        WeakReference weakReference;
        RecyclerView recyclerView2;
        ky kyVar2;
        long j = 0;
        try {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    long jMax = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            jMax = Math.max(recyclerView3.getDrawingTime(), jMax);
                        }
                    }
                    if (jMax != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(jMax) + this.e;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
                            if (recyclerView4.getWindowVisibility() == 0) {
                                recyclerView4.M.c(recyclerView4, false);
                                i3 += recyclerView4.M.d;
                            }
                        }
                        ArrayList arrayList2 = this.f;
                        arrayList2.ensureCapacity(i3);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < size2) {
                            RecyclerView recyclerView5 = (RecyclerView) arrayList.get(i5);
                            if (recyclerView5.getWindowVisibility() == 0) {
                                kx kxVar = recyclerView5.M;
                                int iAbs = Math.abs(kxVar.a) + Math.abs(kxVar.b);
                                int i7 = i;
                                while (true) {
                                    int i8 = kxVar.d;
                                    if (i7 < i8 + i8) {
                                        if (i6 >= arrayList2.size()) {
                                            kyVar2 = new ky();
                                            arrayList2.add(kyVar2);
                                        } else {
                                            kyVar2 = (ky) arrayList2.get(i6);
                                        }
                                        int[] iArr = kxVar.c;
                                        int i9 = iArr[i7 + 1];
                                        kyVar2.a = i9 <= iAbs;
                                        kyVar2.b = iAbs;
                                        kyVar2.c = i9;
                                        kyVar2.d = recyclerView5;
                                        kyVar2.e = iArr[i7];
                                        i6++;
                                        i7 += 2;
                                    }
                                }
                            }
                            i5++;
                            i = 0;
                        }
                        Collections.sort(arrayList2, b);
                        for (int i10 = 0; i10 < arrayList2.size() && (recyclerView = (kyVar = (ky) arrayList2.get(i10)).d) != null; i10++) {
                            mo moVarB = b(recyclerView, kyVar.e, true != kyVar.a ? nanos : Long.MAX_VALUE);
                            if (moVarB != null && (weakReference = moVarB.b) != null && moVarB.s() && !moVarB.t() && (recyclerView2 = (RecyclerView) weakReference.get()) != null) {
                                if (recyclerView2.y && recyclerView2.h.b() != 0) {
                                    recyclerView2.U();
                                }
                                kx kxVar2 = recyclerView2.M;
                                kxVar2.c(recyclerView2, true);
                                if (kxVar2.d != 0) {
                                    ml mlVar = recyclerView2.N;
                                    lt ltVar = recyclerView2.m;
                                    mlVar.d = 1;
                                    mlVar.e = ltVar.a();
                                    mlVar.g = false;
                                    mlVar.h = false;
                                    mlVar.i = false;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = kxVar2.d;
                                        if (i11 >= i12 + i12) {
                                            break;
                                        }
                                        b(recyclerView2, kxVar2.c[i11], nanos);
                                        i11 += 2;
                                    }
                                }
                            }
                            kyVar.a = false;
                            kyVar.b = 0;
                            kyVar.c = 0;
                            kyVar.d = null;
                            kyVar.e = 0;
                        }
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    j = 0;
                    this.d = j;
                    throw th;
                }
            }
            this.d = j;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

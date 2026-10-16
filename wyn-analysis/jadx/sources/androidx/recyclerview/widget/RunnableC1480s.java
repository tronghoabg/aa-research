package androidx.recyclerview.widget;

import A7.R0;
import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1480s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f18977e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final R0 f18978f = new R0(9);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f18979a;

    /* renamed from: b, reason: collision with root package name */
    public long f18980b;

    /* renamed from: c, reason: collision with root package name */
    public long f18981c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18982d;

    public static m0 c(RecyclerView recyclerView, int i5, long j8) {
        int iH = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i5 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        c0 c0Var = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            m0 m0VarJ = c0Var.j(i5, j8);
            if (m0VarJ != null) {
                if (!m0VarJ.isBound() || m0VarJ.isInvalid()) {
                    c0Var.a(m0VarJ, false);
                } else {
                    c0Var.g(m0VarJ.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return m0VarJ;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i5, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f18980b == 0) {
            this.f18980b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1479q c1479q = recyclerView.mPrefetchRegistry;
        c1479q.f18961a = i5;
        c1479q.f18962b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RunnableC1480s.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i5 = g1.h.f35502a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f18979a;
            if (arrayList.isEmpty()) {
                this.f18980b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f18980b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f18981c);
                this.f18980b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f18980b = 0L;
            int i11 = g1.h.f35502a;
            Trace.endSection();
            throw th;
        }
    }
}

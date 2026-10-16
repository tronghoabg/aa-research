package com.google.android.gms.k.f;

import android.util.LongSparseArray;
import h.g.b.x;
import h.n.o;
import k.j;
import okhttp3.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f5577a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5578b;

    b() {
        this.f5577a = 0L;
        this.f5578b = new LongSparseArray(2000);
    }

    public final void a(long j2) {
        Object obj = this.f5578b;
        synchronized (obj) {
            long[] jArr = (long[]) ((LongSparseArray) obj).get(j2);
            if (jArr == null) {
                return;
            }
            long j3 = jArr[0] - 1;
            jArr[0] = j3;
            if (j3 <= 0) {
                ((LongSparseArray) obj).delete(j2);
            } else {
                long j4 = this.f5577a + 1;
                this.f5577a = j4;
                jArr[1] = j4;
            }
        }
    }

    public final boolean b(long j2, c cVar) {
        int maxInflight = cVar.getMaxInflight();
        if (maxInflight <= 0) {
            return false;
        }
        Object obj = this.f5578b;
        synchronized (obj) {
            long[] jArr = (long[]) ((LongSparseArray) obj).get(j2);
            if (jArr != null) {
                long j3 = jArr[0];
                long j4 = this.f5577a + 1;
                this.f5577a = j4;
                jArr[1] = j4;
                if (j3 >= maxInflight) {
                    return false;
                }
                jArr[0] = j3 + 1;
                return true;
            }
            if (((LongSparseArray) obj).size() >= 2000) {
                int size = ((LongSparseArray) obj).size();
                long j5 = Long.MAX_VALUE;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    long j6 = ((long[]) ((LongSparseArray) obj).valueAt(i3))[1];
                    if (j6 < j5) {
                        j5 = j6;
                    }
                    if (j6 < j5) {
                        i2 = i3;
                    }
                }
                ((LongSparseArray) obj).removeAt(i2);
            }
            long j7 = this.f5577a + 1;
            this.f5577a = j7;
            ((LongSparseArray) obj).put(j2, new long[]{1, j7});
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k.j] */
    public final String c() {
        String strY = this.f5578b.y(this.f5577a);
        this.f5577a -= strY.length();
        return strY;
    }

    public final z d() {
        com.waze.shared_infra.coordinators.c cVar = new com.waze.shared_infra.coordinators.c((byte[]) null);
        while (true) {
            String strC = c();
            String str = strC;
            if (str.length() == 0) {
                return cVar.h();
            }
            x.f(strC, "line");
            int iW = o.W(str, ':', 1, 4);
            if (iW != -1) {
                String strSubstring = strC.substring(0, iW);
                x.e(strSubstring, "substring(...)");
                String strSubstring2 = strC.substring(iW + 1);
                x.e(strSubstring2, "substring(...)");
                cVar.i(strSubstring, strSubstring2);
            } else if (strC.charAt(0) == ':') {
                String strSubstring3 = strC.substring(1);
                x.e(strSubstring3, "substring(...)");
                cVar.i("", strSubstring3);
            } else {
                cVar.i("", strC);
            }
        }
    }

    public b(j jVar) {
        x.f(jVar, "source");
        this.f5578b = jVar;
        this.f5577a = 262144L;
    }
}

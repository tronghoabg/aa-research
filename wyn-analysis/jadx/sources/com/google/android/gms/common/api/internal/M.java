package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1717f;
import com.google.android.gms.common.internal.C1721j;
import com.google.android.gms.common.internal.C1730t;
import com.google.android.gms.common.internal.C1733w;
import com.google.android.gms.common.internal.C1734x;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g2.C2688i;
import g2.C2691l;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class M implements OnCompleteListener, h2.i {

    /* renamed from: a, reason: collision with root package name */
    public long f26469a;

    /* renamed from: b, reason: collision with root package name */
    public long f26470b;

    /* renamed from: c, reason: collision with root package name */
    public int f26471c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26472d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26473e;

    public M(C1695i c1695i, int i5, C1688b c1688b, long j8, long j10) {
        this.f26472d = c1695i;
        this.f26471c = i5;
        this.f26473e = c1688b;
        this.f26469a = j8;
        this.f26470b = j10;
    }

    public static C1721j e(H h10, AbstractC1717f abstractC1717f, int i5) {
        C1721j telemetryConfiguration = abstractC1717f.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f26653b) {
            int i10 = 0;
            int[] iArr = telemetryConfiguration.f26655d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f26657f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i5) {
                            return null;
                        }
                        i10++;
                    }
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i5) {
                        i10++;
                    }
                }
            }
            if (h10.f26464l < telemetryConfiguration.f26656e) {
                return telemetryConfiguration;
            }
        }
        return null;
    }

    @Override // h2.i
    public void a(long j8, long j10) {
        this.f26469a = j8;
        this.f26470b = j10;
    }

    @Override // h2.i
    public void b(Q1.o oVar, long j8, int i5, boolean z2) {
        int iA;
        ((s2.C) this.f26473e).getClass();
        int i10 = this.f26471c;
        if (i10 != -1 && i5 != (iA = C2688i.a(i10))) {
            int i11 = Q1.x.f9724a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA, "; received: ", i5, "."));
        }
        long jN = S3.f.N(this.f26470b, j8, ((C2691l) this.f26472d).f35620b, this.f26469a);
        int iA2 = oVar.a();
        ((s2.C) this.f26473e).e(iA2, oVar);
        ((s2.C) this.f26473e).a(jN, 1, iA2, 0, null);
        this.f26471c = i5;
    }

    @Override // h2.i
    public void c(s2.o oVar, int i5) {
        s2.C cMo0m = oVar.mo0m(i5, 1);
        this.f26473e = cMo0m;
        cMo0m.c(((C2691l) this.f26472d).f35621c);
    }

    @Override // h2.i
    public void d(long j8) {
        this.f26469a = j8;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        H h10;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        long j8;
        long j10;
        C1695i c1695i = (C1695i) this.f26472d;
        if (c1695i.c()) {
            C1734x c1734x = (C1734x) C1733w.c().f26696a;
            if ((c1734x == null || c1734x.f26698b) && (h10 = (H) c1695i.f26540j.get((C1688b) this.f26473e)) != null) {
                Object obj = h10.f26455b;
                if (obj instanceof AbstractC1717f) {
                    AbstractC1717f abstractC1717f = (AbstractC1717f) obj;
                    long j11 = this.f26469a;
                    int i14 = 0;
                    boolean z2 = j11 > 0;
                    int gCoreServiceId = abstractC1717f.getGCoreServiceId();
                    if (c1734x != null) {
                        z2 &= c1734x.f26699c;
                        boolean zHasConnectionInfo = abstractC1717f.hasConnectionInfo();
                        i5 = c1734x.f26700d;
                        int i15 = c1734x.f26697a;
                        if (!zHasConnectionInfo || abstractC1717f.isConnecting()) {
                            i11 = c1734x.f26701e;
                            i10 = i15;
                        } else {
                            C1721j c1721jE = e(h10, abstractC1717f, this.f26471c);
                            if (c1721jE == null) {
                                return;
                            }
                            boolean z10 = c1721jE.f26654c && j11 > 0;
                            i11 = c1721jE.f26656e;
                            i10 = i15;
                            z2 = z10;
                        }
                    } else {
                        i5 = 5000;
                        i10 = 0;
                        i11 = 100;
                    }
                    int i16 = i5;
                    int iElapsedRealtime = -1;
                    if (task.isSuccessful()) {
                        i13 = 0;
                    } else if (task.isCanceled()) {
                        i14 = -1;
                        i13 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i12 = status.f26429a;
                            d7.b bVar = status.f26432d;
                            if (bVar != null) {
                                i13 = i12;
                                i14 = bVar.f34115b;
                            }
                        } else {
                            i12 = 101;
                        }
                        i13 = i12;
                        i14 = -1;
                    }
                    if (z2) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f26470b);
                        j8 = j11;
                        j10 = jCurrentTimeMillis;
                    } else {
                        j8 = 0;
                        j10 = 0;
                    }
                    N n10 = new N(new C1730t(this.f26471c, i13, i14, j8, j10, null, null, gCoreServiceId, iElapsedRealtime), i10, i16, i11);
                    zau zauVar = c1695i.f26543n;
                    zauVar.sendMessage(zauVar.obtainMessage(18, n10));
                }
            }
        }
    }

    public M(C2691l c2691l) {
        this.f26472d = c2691l;
        this.f26469a = -9223372036854775807L;
        this.f26470b = 0L;
        this.f26471c = -1;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* loaded from: classes3.dex */
public final class vug implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private final ArrayMap d;
    private final xyc e;
    private final aezk f;
    private ajzn g;

    public vug(Context context, ArrayMap arrayMap, aezk aezkVar) {
        this.e = wub.L(new vdv(context, 9));
        this.d = arrayMap;
        this.f = aezkVar;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        boolean z;
        long j;
        ?? r4 = 1;
        if (!this.b) {
            this.b = true;
            this.g = Build.VERSION.SDK_INT <= 30 ? new ajzn((byte[]) null) : null;
            aezk aezkVar = this.f;
            if (aezkVar.a() == null || !((Boolean) aezkVar.a()).booleanValue()) {
                this.c = ((Long) this.e.gu()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (frameMetrics.getMetric(9) == 1) {
            ajzn ajznVar = this.g;
            if (ajznVar != null) {
                ajznVar.b(frameMetrics, this.c);
                return;
            }
            return;
        }
        long metric = frameMetrics.getMetric(8);
        ajzn ajznVar2 = this.g;
        long jB = this.c;
        if (ajznVar2 != null) {
            jB = ajznVar2.b(frameMetrics, jB);
        }
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.d;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i2 = 0;
            while (i2 < size) {
                vuj vujVar = (vuj) arrayMap.valueAt(i2);
                long j2 = jB;
                int i3 = (int) (metric / 1000000);
                if (i3 < 0) {
                    vujVar.j += r4;
                    z = r4;
                    j = metric2;
                } else {
                    vujVar.i += r4;
                    if (vujVar.p && metric > metric2) {
                        if (metric2 < 0 || metric < 0) {
                            vujVar.q = r4;
                        } else {
                            vujVar.r += metric - metric2;
                        }
                    }
                    z = r4;
                    if (metric2 > 0) {
                        j = metric2;
                        int i4 = (int) ((metric - metric2) / 1000000);
                        if (vujVar.o < i4) {
                            vujVar.o = i4;
                        }
                        int[] iArr = vujVar.f;
                        int i5 = i4 < 20 ? i4 >= -20 ? ((i4 + 20) >> 1) + 12 : i4 >= -30 ? ((i4 + 30) / 5) + 10 : i4 >= -100 ? ((i4 + 100) / 10) + 3 : i4 >= -200 ? ((i4 + 200) / 50) + 1 : 0 : i4 < 30 ? ((i4 - 20) / 5) + 32 : i4 < 100 ? ((i4 - 30) / 10) + 34 : i4 < 200 ? ((i4 - 50) / 100) + 41 : i4 < 1000 ? ((i4 - 200) / 100) + 43 : 51;
                        iArr[i5] = iArr[i5] + 1;
                        if (metric > j) {
                            vujVar.g++;
                            vujVar.l += i3;
                        }
                        if (metric > j2) {
                            vujVar.h++;
                            vujVar.m += i3;
                        }
                    } else {
                        j = metric2;
                        if (metric > j2) {
                            vujVar.g++;
                            vujVar.l += i3;
                        }
                    }
                    int[] iArr2 = vujVar.e;
                    int i6 = i3 <= 20 ? i3 >= 8 ? (i3 >> 1) - 2 : i3 / 4 : i3 <= 30 ? (i3 / 5) + 4 : i3 <= 100 ? (i3 / 10) + 7 : i3 <= 200 ? (i3 / 50) + 15 : i3 <= 1000 ? (i3 / 100) + 17 : i3 < 5000 ? 27 : 28;
                    iArr2[i6] = iArr2[i6] + 1;
                    vujVar.j += i;
                    if (vujVar.k < i3) {
                        vujVar.k = i3;
                    }
                    vujVar.n += i3;
                }
                i2++;
                jB = j2;
                r4 = z;
                metric2 = j;
            }
        }
    }
}

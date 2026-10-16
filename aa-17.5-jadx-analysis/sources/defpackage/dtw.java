package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class dtw extends duc {
    public final List a = new ArrayList();
    public int b = 0;

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MetricStyle";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    @Override // defpackage.duc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtw.b(android.os.Bundle):void");
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        if (this.a.isEmpty()) {
            throw new IllegalArgumentException("A MetricStyle must have at least one Metric");
        }
        if (Build.VERSION.SDK_INT >= 37) {
            ((Notification.Builder) mkoVar.d).setStyle(dtv.g(this));
        }
    }

    @Override // defpackage.duc
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (Build.VERSION.SDK_INT >= 37) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (dtu dtuVar : this.a) {
            Bundle bundle2 = new Bundle();
            dts dtsVar = dtuVar.a;
            Bundle bundle3 = new Bundle();
            if (dtsVar instanceof dtt) {
                bundle3.putInt("_type", 1);
            } else if (dtsVar instanceof dtn) {
                bundle3.putInt("_type", 2);
            } else if (dtsVar instanceof dtr) {
                bundle3.putInt("_type", 3);
            } else if (dtsVar instanceof dtp) {
                bundle3.putInt("_type", 4);
            } else if (dtsVar instanceof dto) {
                bundle3.putInt("_type", 5);
            } else {
                if (!(dtsVar instanceof dtq)) {
                    Objects.toString(dtsVar);
                    throw new AssertionError("Impossible MetricValue subclass: ".concat(dtsVar.toString()));
                }
                bundle3.putInt("_type", 6);
            }
            dtsVar.a(bundle3);
            bundle2.putBundle("value", bundle3);
            bundle2.putString("label", dtuVar.b);
            bundle2.putInt("semanticStyle", dtuVar.c);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("android.metrics", arrayList);
        bundle.putInt("android.metrics.criticalIndex", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtw)) {
            return false;
        }
        dtw dtwVar = (dtw) obj;
        if (this == dtwVar) {
            return true;
        }
        return j$.util.Objects.equals(this.a, dtwVar.a) && this.b == dtwVar.b;
    }

    public final List f() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "MetricStyle{mMetrics=" + this.a + ", mCriticalMetric=" + this.b + "}";
    }
}

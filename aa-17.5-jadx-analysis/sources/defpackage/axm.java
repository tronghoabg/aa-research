package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class axm {
    public boolean a;
    public Object b;
    public final azo c;
    private final byd d;
    private final byd e;

    public axm(int i, int i2) {
        this.d = new ParcelableSnapshotMutableIntState(i);
        this.e = new ParcelableSnapshotMutableIntState(i2);
        this.c = new azo(i, 30, 100);
    }

    public final int a() {
        return this.d.e();
    }

    public final int b() {
        return this.e.e();
    }

    public final void c(int i) {
        this.d.h(i);
    }

    public final void d(int i) {
        this.e.h(i);
    }

    public final void e(int i, int i2) {
        if (i < BitmapDescriptorFactory.HUE_RED) {
            asl.c(a.bn(i, "Index should be non-negative (", ")"));
        }
        c(i);
        this.c.c(i);
        d(i2);
    }
}

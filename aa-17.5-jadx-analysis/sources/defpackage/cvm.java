package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cvm {
    public final cuq a;
    public final cuq b;
    public long c;
    public long d;
    public long e;
    public long f;
    private final bwq g;
    private final bwq h;
    private final byb i;
    private final byf j;
    private final byb k;

    public cvm(String str) {
        bxp bxpVar = bxp.c;
        this.g = new ParcelableSnapshotMutableState(true, bxpVar);
        this.h = new ParcelableSnapshotMutableState(false, bxpVar);
        this.i = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
        this.j = new ParcelableSnapshotMutableLongState(0L);
        this.k = new ParcelableSnapshotMutableFloatState(1.0f);
        this.a = new cur(str.concat(" source"), 0);
        this.b = new cur(str.concat(" target"), 0);
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
    }

    public final void a(float f) {
        this.k.h(f);
    }

    public final void b(boolean z) {
        this.h.b(Boolean.valueOf(z));
    }

    public final void c(long j) {
        this.j.h(j);
    }

    public final void d(float f) {
        this.i.h(f);
    }

    public final void e(boolean z) {
        this.g.b(Boolean.valueOf(z));
    }

    public final boolean f() {
        return ((Boolean) this.h.a()).booleanValue();
    }
}

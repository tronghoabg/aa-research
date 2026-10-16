package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes.dex */
public final class bbl {
    public final bbt a;
    public boolean b;
    public Object c;
    public final azo d;
    private final byd e;
    private final byb f;

    public bbl(int i, float f, bbt bbtVar) {
        this.a = bbtVar;
        this.e = new ParcelableSnapshotMutableIntState(i);
        this.f = new ParcelableSnapshotMutableFloatState(f);
        this.d = new azo(i, 30, 100);
    }

    public final float a() {
        return this.f.e();
    }

    public final int b() {
        return this.e.e();
    }

    public final void c(int i) {
        this.e.h(i);
    }

    public final void d(float f) {
        this.f.h(f);
    }

    public final void e(int i, float f) {
        c(i);
        this.d.c(i);
        d(f);
    }
}

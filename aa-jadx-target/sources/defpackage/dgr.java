package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgr extends android.text.SegmentFinder {
    final /* synthetic */ defpackage.dgv a;

    public dgr(defpackage.dgv dgvVar) {
        this.a = dgvVar;
    }

    @Override // android.text.SegmentFinder
    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    @Override // android.text.SegmentFinder
    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousStartBoundary(int i) {
        return this.a.f(i);
    }
}

package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    int f1457a = -1;

    /* renamed from: b, reason: collision with root package name */
    int f1458b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f1459c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f1460d = 1;

    /* renamed from: e, reason: collision with root package name */
    int f1461e = 0;

    /* renamed from: f, reason: collision with root package name */
    boolean f1462f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f1463g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f1464h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f1465i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f1466j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f1467k = false;

    /* renamed from: l, reason: collision with root package name */
    int f1468l;
    long m;
    int n;
    int o;
    int p;

    public final int a() {
        return this.f1463g ? this.f1458b - this.f1459c : this.f1461e;
    }

    final void b(int i2) {
        if ((this.f1460d & i2) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f1460d));
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1457a + ", mData=null, mItemCount=" + this.f1461e + ", mIsMeasuring=" + this.f1465i + ", mPreviousLayoutItemCount=" + this.f1458b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1459c + ", mStructureChanged=" + this.f1462f + ", mInPreLayout=" + this.f1463g + ", mRunSimpleAnimations=" + this.f1466j + ", mRunPredictiveAnimations=" + this.f1467k + '}';
    }
}

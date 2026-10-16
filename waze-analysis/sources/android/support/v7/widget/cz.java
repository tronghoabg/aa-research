package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cz {

    /* renamed from: b, reason: collision with root package name */
    int f1299b;

    /* renamed from: c, reason: collision with root package name */
    int f1300c;

    /* renamed from: d, reason: collision with root package name */
    int f1301d;

    /* renamed from: e, reason: collision with root package name */
    int f1302e;

    /* renamed from: h, reason: collision with root package name */
    boolean f1305h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1306i;

    /* renamed from: a, reason: collision with root package name */
    boolean f1298a = true;

    /* renamed from: f, reason: collision with root package name */
    int f1303f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f1304g = 0;

    cz() {
    }

    final boolean a(fb fbVar) {
        int i2 = this.f1300c;
        return i2 >= 0 && i2 < fbVar.a();
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.f1299b + ", mCurrentPosition=" + this.f1300c + ", mItemDirection=" + this.f1301d + ", mLayoutDirection=" + this.f1302e + ", mStartLine=" + this.f1303f + ", mEndLine=" + this.f1304g + '}';
    }
}

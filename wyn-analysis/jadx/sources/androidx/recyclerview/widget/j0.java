package androidx.recyclerview.widget;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18894a;

    /* renamed from: b, reason: collision with root package name */
    public int f18895b;

    /* renamed from: c, reason: collision with root package name */
    public int f18896c;

    /* renamed from: d, reason: collision with root package name */
    public int f18897d;

    /* renamed from: e, reason: collision with root package name */
    public int f18898e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18900g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18901h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18902i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18903j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f18904l;

    /* renamed from: m, reason: collision with root package name */
    public long f18905m;

    /* renamed from: n, reason: collision with root package name */
    public int f18906n;

    public final void a(int i5) {
        if ((this.f18897d & i5) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i5) + " but it is " + Integer.toBinaryString(this.f18897d));
    }

    public final int b() {
        return this.f18900g ? this.f18895b - this.f18896c : this.f18898e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f18894a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f18898e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f18902i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f18895b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f18896c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f18899f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f18900g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f18903j);
        sb2.append(", mRunPredictiveAnimations=");
        return AbstractC0279p0.p(sb2, this.k, '}');
    }
}

package u;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f46065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f46066g;

    public e(f fVar, int i5, int i10, int i11, int i12, int i13, Bundle bundle) {
        this.f46066g = fVar;
        this.f46060a = i5;
        this.f46061b = i10;
        this.f46062c = i11;
        this.f46063d = i12;
        this.f46064e = i13;
        this.f46065f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46066g.f46068b.onActivityLayout(this.f46060a, this.f46061b, this.f46062c, this.f46063d, this.f46064e, this.f46065f);
    }
}

package Hb;

import com.vungle.ads.internal.presenter.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f4990b;

    public /* synthetic */ a(r rVar, int i5) {
        this.f4989a = i5;
        this.f4990b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4989a) {
            case 0:
                r.d(this.f4990b);
                break;
            case 1:
                r.c(this.f4990b);
                break;
            default:
                r.e(this.f4990b);
                break;
        }
    }
}

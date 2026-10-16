package K8;

import A7.AbstractC0279p0;
import A7.RunnableC0278p;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;
import h7.C2793a;

/* renamed from: K8.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0700l {

    /* renamed from: f, reason: collision with root package name */
    public static final C2793a f6658f = new C2793a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f6659a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f6660b;

    /* renamed from: c, reason: collision with root package name */
    public long f6661c;

    /* renamed from: d, reason: collision with root package name */
    public zzg f6662d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0278p f6663e;

    public final void a() {
        f6658f.e(AbstractC0279p0.k(this.f6659a - this.f6661c, "Scheduling refresh for "), new Object[0]);
        this.f6662d.removeCallbacks(this.f6663e);
        this.f6660b = Math.max((this.f6659a - System.currentTimeMillis()) - this.f6661c, 0L) / 1000;
        this.f6662d.postDelayed(this.f6663e, this.f6660b * 1000);
    }
}

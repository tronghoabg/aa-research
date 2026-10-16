package K8;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: c, reason: collision with root package name */
    public static final F f6577c = new F();

    /* renamed from: a, reason: collision with root package name */
    public final x f6578a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.F f6579b;

    public F() {
        x xVar = x.f6684d;
        if (E4.F.f2851d == null) {
            E4.F f10 = new E4.F(3);
            f10.f2853b = false;
            E4.F.f2851d = f10;
        }
        E4.F f11 = E4.F.f2851d;
        this.f6578a = xVar;
        this.f6579b = f11;
    }

    public final void a(FragmentActivity fragmentActivity) {
        x xVar = this.f6578a;
        xVar.getClass();
        x.d(fragmentActivity.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        xVar.f6686b = 0L;
    }
}

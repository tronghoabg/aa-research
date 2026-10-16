package A7;

import android.os.Bundle;

/* renamed from: A7.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0296v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1087f;

    public /* synthetic */ RunnableC0296v0(Object obj, Object obj2, Object obj3, Object obj4, long j8, int i5) {
        this.f1082a = i5;
        this.f1083b = obj2;
        this.f1084c = obj3;
        this.f1086e = obj4;
        this.f1085d = j8;
        this.f1087f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1082a) {
            case 0:
                String str = (String) this.f1084c;
                BinderC0287s0 binderC0287s0 = (BinderC0287s0) this.f1087f;
                String str2 = (String) this.f1083b;
                if (str2 != null) {
                    C0262j1 c0262j1 = new C0262j1((String) this.f1086e, str2, this.f1085d);
                    L1 l12 = binderC0287s0.f1045a;
                    l12.zzl().c0();
                    String str3 = l12.f565F;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    l12.f565F = str;
                    l12.f564E = c0262j1;
                    break;
                } else {
                    L1 l13 = binderC0287s0.f1045a;
                    l13.zzl().c0();
                    String str4 = l13.f565F;
                    if (str4 == null || str4.equals(str)) {
                        l13.f565F = str;
                        l13.f564E = null;
                        break;
                    }
                }
                break;
            case 1:
                Object obj = this.f1086e;
                ((P0) this.f1087f).k0(this.f1085d, obj, (String) this.f1083b, (String) this.f1084c);
                break;
            default:
                Bundle bundle = (Bundle) this.f1083b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C0259i1 c0259i1 = (C0259i1) this.f1087f;
                c0259i1.m0((C0262j1) this.f1084c, (C0262j1) this.f1086e, this.f1085d, true, c0259i1.b0().o0("screen_view", bundle, null, false));
                break;
        }
    }
}

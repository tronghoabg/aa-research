package A5;

import Va.C1038ka;
import android.content.Context;
import u5.C4253d;
import v5.InterfaceC4301b;
import za.C4658a;

/* loaded from: classes3.dex */
public final class e implements InterfaceC4301b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f354b;

    public /* synthetic */ e(Object obj, int i5) {
        this.f353a = i5;
        this.f354b = obj;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f353a) {
            case 0:
                String packageName = ((Context) ((e) this.f354b).f354b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 1:
                return new p((Context) ((e) this.f354b).f354b, Integer.valueOf(p.f381d).intValue(), "com.google.android.datatransport.events");
            case 2:
                return new C4253d((Context) ((e) this.f354b).f354b, new C1038ka(15), new C4658a(14));
            default:
                return this.f354b;
        }
    }
}

package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.EnumC1449m;
import n3.InterfaceC3591c;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC3591c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18319b;

    public /* synthetic */ G(Object obj, int i5) {
        this.f18318a = i5;
        this.f18319b = obj;
    }

    @Override // n3.InterfaceC3591c
    public final Bundle a() {
        Object obj = this.f18319b;
        switch (this.f18318a) {
            case 0:
                String str = FragmentActivity.LIFECYCLE_TAG;
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.f(EnumC1449m.ON_STOP);
                return new Bundle();
            default:
                return ((e0) obj).V();
        }
    }
}

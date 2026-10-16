package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1431u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18549b;

    public /* synthetic */ RunnableC1431u(Object obj, int i5) {
        this.f18548a = i5;
        this.f18549b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18548a) {
            case 0:
                F f10 = (F) this.f18549b;
                w0 w0Var = f10.mViewLifecycleOwner;
                w0Var.f18562e.b(f10.mSavedViewRegistryState);
                f10.mSavedViewRegistryState = null;
                break;
            default:
                o0.a((ArrayList) this.f18549b, 4);
                break;
        }
    }
}

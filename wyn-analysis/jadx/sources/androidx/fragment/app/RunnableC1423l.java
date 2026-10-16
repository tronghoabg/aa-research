package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1423l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18475a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18477c;

    public /* synthetic */ RunnableC1423l(v0 v0Var, View view, Rect rect) {
        this.f18476b = view;
        this.f18477c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18475a) {
            case 0:
                A0 operation = (A0) this.f18476b;
                AbstractC3340k.e(operation, "$operation");
                C1424m this$0 = (C1424m) this.f18477c;
                AbstractC3340k.e(this$0, "this$0");
                if (e0.J(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                v0.g((View) this.f18476b, (Rect) this.f18477c);
                break;
        }
    }

    public /* synthetic */ RunnableC1423l(A0 a02, C1424m c1424m) {
        this.f18476b = a02;
        this.f18477c = c1424m;
    }
}

package androidx.fragment.app;

import Va.M6;
import android.view.View;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1426o f18568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A0 f18569c;

    public /* synthetic */ y0(C1426o c1426o, A0 a02, int i5) {
        this.f18567a = i5;
        this.f18568b = c1426o;
        this.f18569c = a02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18567a) {
            case 0:
                C1426o this$0 = this.f18568b;
                AbstractC3340k.e(this$0, "this$0");
                A0 a02 = this.f18569c;
                if (this$0.f18513b.contains(a02)) {
                    int i5 = a02.f18278a;
                    View view = a02.f18280c.mView;
                    AbstractC3340k.d(view, "operation.fragment.mView");
                    M6.g(i5, view, this$0.f18512a);
                    break;
                }
                break;
            case 1:
                C1426o this$02 = this.f18568b;
                AbstractC3340k.e(this$02, "this$0");
                A0 operation = this.f18569c;
                AbstractC3340k.e(operation, "$operation");
                this$02.a(operation);
                break;
            default:
                C1426o this$03 = this.f18568b;
                AbstractC3340k.e(this$03, "this$0");
                A0 a03 = this.f18569c;
                this$03.f18513b.remove(a03);
                this$03.f18514c.remove(a03);
                break;
        }
    }
}

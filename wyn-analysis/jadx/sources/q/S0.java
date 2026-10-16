package q;

import androidx.appcompat.widget.SearchView;
import q1.AbstractC3855a;

/* loaded from: classes.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f43704b;

    public /* synthetic */ S0(SearchView searchView, int i5) {
        this.f43703a = i5;
        this.f43704b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43703a) {
            case 0:
                this.f43704b.u();
                break;
            default:
                AbstractC3855a abstractC3855a = this.f43704b.f17888O;
                if (abstractC3855a instanceof b1) {
                    abstractC3855a.b(null);
                    break;
                }
                break;
        }
    }
}

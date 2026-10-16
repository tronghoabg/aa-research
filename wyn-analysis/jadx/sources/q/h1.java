package q;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f43789b;

    public /* synthetic */ h1(Toolbar toolbar, int i5) {
        this.f43788a = i5;
        this.f43789b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43788a) {
            case 0:
                j1 j1Var = this.f43789b.L;
                p.m mVar = j1Var == null ? null : j1Var.f43813b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f43789b.n();
                break;
        }
    }
}

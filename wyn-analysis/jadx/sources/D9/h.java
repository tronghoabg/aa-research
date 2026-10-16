package D9;

import android.view.View;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class h extends s {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WindowManager.LayoutParams f2574n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ WindowManager f2575o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E9.c f2576p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, S3.l lVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, E9.c cVar) {
        super(view, lVar);
        this.f2574n = layoutParams;
        this.f2575o = windowManager;
        this.f2576p = cVar;
    }

    @Override // D9.s
    public final float b() {
        return this.f2574n.x;
    }

    @Override // D9.s
    public final void c(float f10) {
        WindowManager.LayoutParams layoutParams = this.f2574n;
        layoutParams.x = (int) f10;
        this.f2575o.updateViewLayout(this.f2576p.j(), layoutParams);
    }
}

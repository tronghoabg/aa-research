package F6;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* loaded from: classes3.dex */
public final class q extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f4008a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4009b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(android.content.Context r7, F6.p r8, F6.l r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.q.<init>(android.content.Context, F6.p, F6.l):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f4009b;
        if (lVar != null) {
            lVar.f3992w = 2;
            lVar.f3971a.finish();
        }
    }
}

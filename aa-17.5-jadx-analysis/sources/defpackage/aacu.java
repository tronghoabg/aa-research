package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aacu extends ztb {
    private final tnq c;

    public aacu(View view, View view2, View view3, Executor executor, tnq tnqVar) {
        super(view, view2, view3, executor);
        this.c = tnqVar;
    }

    @Override // defpackage.ztb
    protected final void c(Bitmap bitmap, vip vipVar, boolean z) {
        uuh uuhVar = ((txu) this.c.c()).f.m;
        aact aactVar = new aact(this, bitmap, z, vipVar);
        vaq.d();
        synchronized (uuhVar) {
            if (uuhVar.c) {
                aactVar.a(null);
                return;
            }
            uuhVar.a.add(aactVar);
            vaq.d();
            uuhVar.b.run();
        }
    }
}

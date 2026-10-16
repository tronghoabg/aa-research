package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aaaq extends ztb {
    protected aaaq(View view, View view2, View view3, Executor executor) {
        super(view, view2, view3, executor);
    }

    @Override // defpackage.ztb
    protected final void c(Bitmap bitmap, vip vipVar, boolean z) {
        this.b.execute(new isq(this, bitmap, z, vipVar, 11));
    }
}

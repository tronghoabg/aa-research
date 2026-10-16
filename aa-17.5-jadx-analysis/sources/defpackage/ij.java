package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class ij extends hq {
    final /* synthetic */ io d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(io ioVar, Context context, ia iaVar, View view) {
        super(context, iaVar, view, false, R.attr.actionOverflowMenuStyle);
        this.d = ioVar;
        if (!iaVar.l.o()) {
            View view2 = ioVar.g;
            this.a = view2 == null ? (View) ioVar.f : view2;
        }
        e(ioVar.k);
    }

    @Override // defpackage.hq
    protected final void c() {
        this.d.j = null;
        super.c();
    }
}

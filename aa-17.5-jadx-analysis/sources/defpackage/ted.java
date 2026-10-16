package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
final class ted extends FrameLayout {
    final /* synthetic */ tef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ted(tef tefVar, Context context) {
        super(context);
        this.a = tefVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ype ypeVar = (ype) tef.c.l().ai(8989);
        tef tefVar = this.a;
        ypeVar.T("%s: onSizeChanged(w=%d, h=%d, oldw=%d, oldh=%d)", tefVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        tefVar.f(i, i2);
    }
}

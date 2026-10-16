package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class im extends hq {
    final /* synthetic */ io d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(io ioVar, Context context, hg hgVar, View view) {
        super(context, hgVar, view, true, R.attr.actionOverflowMenuStyle);
        this.d = ioVar;
        this.b = 8388613;
        e(ioVar.k);
    }

    @Override // defpackage.hq
    protected final void c() {
        io ioVar = this.d;
        hg hgVar = ioVar.c;
        if (hgVar != null) {
            hgVar.i(true);
        }
        ioVar.i = null;
        super.c();
    }
}

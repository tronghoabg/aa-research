package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xbr extends wzy {
    private static final yph A = yph.c("GH.ShortcutRow");
    public static final /* synthetic */ int t = 0;
    final View s;

    public xbr(xai xaiVar, View view) {
        super(xaiVar, view);
        View viewFindViewById = view.findViewById(R.id.delete_shortcut);
        viewFindViewById.getClass();
        this.s = viewFindViewById;
    }

    @Override // defpackage.wzy
    protected final void E() {
        this.s.setOnClickListener(new xao(this, 5, null));
    }

    @Override // defpackage.wzy
    public final void F() {
        yph yphVar = A;
        ((ype) yphVar.l().ai((char) 10046)).u("onItemSelected");
        if (this.w instanceof mrb) {
            ((ype) yphVar.l().ai((char) 10047)).u("launching edit Assistant action UI");
            mrb mrbVar = (mrb) this.w;
            Bundle bundle = new Bundle();
            bundle.putByteArray("EXISTING_RECORD", mrbVar.h.h());
            this.y.u(bundle);
        }
    }

    @Override // defpackage.wzy
    protected final void G() {
        this.s.setOnClickListener(null);
    }

    @Override // defpackage.wzy
    protected final boolean H() {
        return true;
    }
}

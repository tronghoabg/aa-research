package defpackage;

import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mfz implements View.OnClickListener {
    private static final yph a = yph.c("GH.Preflight");
    private final View.OnClickListener b;
    private final mhp c;

    public mfz(mhp mhpVar, View.OnClickListener onClickListener) {
        this.c = mhpVar;
        this.b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mfo mfoVar = ((mfp) luk.b().a()).c;
        mfoVar.getClass();
        boolean z = mfoVar.d.c;
        ((ype) a.l().ai((char) 4874)).y("ParkedOnlyOnClickListener onClick, restricted=%b", Boolean.valueOf(!z));
        mhp mhpVar = this.c;
        if (!z) {
            mhpVar.b(view.getContext().getString(R.string.parked_only_action_blocked_toast));
        } else {
            mhpVar.b(view.getContext().getString(R.string.parked_only_action_allowed_toast));
            this.b.onClick(view);
        }
    }
}

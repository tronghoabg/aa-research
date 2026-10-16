package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import com.google.android.projection.gearhead.R;
import defpackage.acxj;
import defpackage.mki;
import defpackage.mli;
import defpackage.mlt;
import defpackage.rxf;
import defpackage.yxo;

/* loaded from: classes2.dex */
public final class ProjectionEstablishedFragment extends mlt {
    @Override // defpackage.mlt
    public final void a() {
        this.a.setImageResource(R.drawable.success_icon);
        this.d.setImageResource(R.drawable.usb_cable_connected);
        this.c.setText(R.string.projection_started_message);
        this.c.setVisibility(0);
        this.e.setVisibility(8);
        this.b.setText(R.string.projection_started_title);
        this.g.setVisibility(4);
        this.f.setVisibility(0);
        this.f.setOnClickListener(new mli(this, 9));
        this.f.setText(R.string.done_button_text);
        if (acxj.f()) {
            rxf.h(requireContext(), mki.a.d, yxo.STARTUP_DIAGNOSTIC);
        }
    }
}

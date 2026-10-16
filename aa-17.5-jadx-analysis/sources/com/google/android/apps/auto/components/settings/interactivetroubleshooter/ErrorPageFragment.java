package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.projection.gearhead.R;
import defpackage.bc;
import defpackage.ecw;
import defpackage.erq;
import defpackage.ers;
import defpackage.mli;
import defpackage.mls;
import defpackage.mlt;
import defpackage.ohe;

/* loaded from: classes2.dex */
public final class ErrorPageFragment extends mlt {
    public mls h;
    public ohe i;

    @Override // defpackage.mlt
    public final void a() {
        this.a.setImageResource(R.drawable.error_logo);
        this.e.setVisibility(8);
        this.d.setImageResource(R.drawable.usb_cable_error);
        this.c.setVisibility(0);
        this.g.setVisibility(0);
        this.g.setOnClickListener(new mli(this, 6));
        this.f.setVisibility(0);
        if (this.h.a < 2) {
            this.f.setText(R.string.try_again_button_text);
            this.f.setOnClickListener(new mli(this, 7));
        } else {
            this.f.setText(R.string.send_feedback_button_text);
            this.f.setOnClickListener(new mli(this, 8));
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        erq defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
        bc bcVarRequireActivity = requireActivity();
        defaultViewModelProviderFactory.getClass();
        this.h = (mls) new ers(bcVarRequireActivity.getViewModelStore(), defaultViewModelProviderFactory, ecw.g(bcVarRequireActivity)).a(mls.class);
    }

    @Override // defpackage.mlt, android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b.setText(arguments.getInt("title_string_resource"));
            this.c.setText(arguments.getCharSequence("message_key", ""));
        }
    }
}

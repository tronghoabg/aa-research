package com.waze.sharedui.d.a;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ap;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.waze.R;
import com.waze.design_components.c.f;
import com.waze.inbox.e;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m;
import com.waze.shared_infra.i.h;
import com.waze.sharedui.views.OvalButton;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d extends ap implements DialogInterface, LifecycleOwner {
    public d(Context context, CharSequence charSequence, CharSequence charSequence2, String str, View.OnClickListener onClickListener, Integer num, String str2, View.OnClickListener onClickListener2, View view, boolean z, Runnable runnable) {
        super(context, R.style.popupDialog);
        setContentView(R.layout.popup_dialog);
        if (charSequence != null) {
            ((WazeTextView) findViewById(R.id.title)).setText(charSequence);
        } else {
            findViewById(R.id.title).setVisibility(8);
        }
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.message);
        wazeTextView.setText(charSequence2);
        wazeTextView.setMovementMethod(LinkMovementMethod.getInstance());
        if (str != null) {
            ((WazeTextView) findViewById(R.id.mainButtonLabel)).setText(str);
            findViewById(R.id.mainButton).setVisibility(0);
            findViewById(R.id.separator).setVisibility(0);
        }
        if (num != null) {
            ((OvalButton) findViewById(R.id.mainButton)).bz(num.intValue());
        }
        byte[] bArr = null;
        findViewById(R.id.mainButton).setOnClickListener(new m(this, onClickListener, 9, bArr));
        int i2 = 10;
        if (str2 != null) {
            findViewById(R.id.separator).setVisibility(0);
            ((WazeTextView) findViewById(R.id.secondButtonLabel)).setText(str2);
            findViewById(R.id.secondButton).setVisibility(0);
            findViewById(R.id.secondButton).setOnClickListener(new m(this, onClickListener2, i2, bArr));
        }
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.imageContainer);
            frameLayout.setVisibility(0);
            frameLayout.removeAllViews();
            frameLayout.addView(view, 0);
        }
        setCancelable(z);
        setCanceledOnTouchOutside(z);
        setOnCancelListener(new f(runnable, i2));
        if (z) {
            findViewById(R.id.dialog_content).setOnClickListener(new e(17));
            findViewById(R.id.dialog_and_spaces).setOnClickListener(new com.waze.profile.m(this, 11));
        }
    }

    @Override // android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalStateException e2) {
            h.e("Dialog dismissed while not attached to window", e2);
        }
    }

    @Override // android.support.v7.app.ap, android.app.Dialog
    public final View findViewById(int i2) {
        View viewFindViewById = super.findViewById(i2);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return null;
    }

    public d(Context context, int i2) {
        super(context, i2);
    }
}

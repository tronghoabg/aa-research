package com.waze.settings.tree.views;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeSettingsView f37651a;

    y(WazeSettingsView wazeSettingsView) {
        Objects.requireNonNull(wazeSettingsView);
        this.f37651a = wazeSettingsView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        AlphaAnimation alphaAnimation;
        WazeSettingsView wazeSettingsView = this.f37651a;
        View viewFindViewById = wazeSettingsView.findViewById(R.id.settingsViewEditTextFrameBgOn);
        viewFindViewById.setVisibility(0);
        CharSequence text = wazeSettingsView.f37608l.getText();
        CharSequence hint = wazeSettingsView.f37608l.getHint();
        if (z) {
            if ((text == null || text.length() == 0) && (hint == null || hint.length() == 0)) {
                wazeSettingsView.n(false);
            }
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            wazeSettingsView.f37608l.setGravity(16);
        } else {
            if ((text == null || text.length() == 0) && (hint == null || hint.length() == 0)) {
                wazeSettingsView.d(false);
            }
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            wazeSettingsView.f37608l.setGravity(19);
        }
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(true);
        viewFindViewById.startAnimation(alphaAnimation);
    }
}

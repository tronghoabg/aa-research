package com.google.android.apps.auto.components.ui.media;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.oxc;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class PlayPauseStopImageView extends ImageView {
    private static final yph b = yph.c("GH.PlayPauseImageView");
    final int a;

    public PlayPauseStopImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        setBackground(new oxc(context));
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = this.a;
        if (i2 != -1) {
            ((ype) ((ype) b.h()).ai((char) 6028)).w("Unknown playbackState=%d", i2);
        }
        if (getBackground() != null) {
            getBackground().setState(iArrOnCreateDrawableState);
        }
        return iArrOnCreateDrawableState;
    }
}

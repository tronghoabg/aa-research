package com.google.android.apps.auto.components.ui.media;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.projection.gearhead.R;
import defpackage.ype;
import defpackage.yph;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/google/android/apps/auto/components/ui/media/PlayPauseStopCoolwalkButton;", "Lcom/google/android/apps/auto/components/coolwalk/button/CoolwalkButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "playState", "", "getPlayState", "()I", "setPlayState", "(I)V", "mode", "Lcom/google/android/apps/auto/components/ui/media/PlayPauseStopCoolwalkButton$ActionMode;", "getMode", "()Lcom/google/android/apps/auto/components/ui/media/PlayPauseStopCoolwalkButton$ActionMode;", "setMode", "(Lcom/google/android/apps/auto/components/ui/media/PlayPauseStopCoolwalkButton$ActionMode;)V", "onCreateDrawableState", "", "extraSpace", "ActionMode", "Companion", "java.com.google.android.apps.auto.components.ui.media_media"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayPauseStopCoolwalkButton extends CoolwalkButton {
    private static final yph n = yph.c("GH.PlayPauseMatButton");
    private static final int[] o = {R.attr.state_play};
    private static final int[] p = {R.attr.state_stop};
    private static final int[] q = {R.attr.state_pause};
    public int c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPauseStopCoolwalkButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = -1;
        this.d = 1;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        int i2 = this.c;
        switch (i2) {
            case -1:
                break;
            case 0:
            case 7:
            default:
                ((ype) n.h()).w("Unknown playbackState=%d", i2);
                break;
            case 1:
            case 2:
                CoolwalkButton.mergeDrawableStates(iArrOnCreateDrawableState, o);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                if (this.d != 1) {
                    CoolwalkButton.mergeDrawableStates(iArrOnCreateDrawableState, p);
                    break;
                } else {
                    CoolwalkButton.mergeDrawableStates(iArrOnCreateDrawableState, q);
                    break;
                }
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }
}

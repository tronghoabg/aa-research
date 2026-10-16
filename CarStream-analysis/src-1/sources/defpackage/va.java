package defpackage;

import android.view.Choreographer;
import com.carstream.tech.core.speed.SpeedBubble;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class va implements Choreographer.FrameCallback {
    public final /* synthetic */ SpeedBubble a;

    public va(SpeedBubble speedBubble) {
        this.a = speedBubble;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        SpeedBubble speedBubble = this.a;
        speedBubble.H = false;
        if (speedBubble.isAttachedToWindow() && speedBubble.getVisibility() == 0) {
            speedBubble.invalidate();
            speedBubble.v();
        }
    }
}

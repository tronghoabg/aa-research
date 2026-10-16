package defpackage;

import android.graphics.Color;
import com.carstream.tech.core.speed.SpeedBubble;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class wa {
    public int a;
    public int b;
    public int c;
    public long d = -1;

    public wa(int i) {
        this.c = i;
        this.b = i;
        this.a = i;
    }

    public final void a(long j) {
        long j2 = this.d;
        if (j2 < 0) {
            return;
        }
        long j3 = j - j2;
        if (j3 >= 260) {
            this.c = this.b;
            this.d = -1L;
        } else {
            float interpolation = SpeedBubble.J.getInterpolation(j3 / 260.0f);
            this.c = Color.argb(SpeedBubble.a(Color.alpha(this.a), Color.alpha(this.b), interpolation), SpeedBubble.a(Color.red(this.a), Color.red(this.b), interpolation), SpeedBubble.a(Color.green(this.a), Color.green(this.b), interpolation), SpeedBubble.a(Color.blue(this.a), Color.blue(this.b), interpolation));
        }
    }
}

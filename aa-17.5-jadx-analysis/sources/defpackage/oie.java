package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.StatsEvent;
import android.util.StatsLog;

/* loaded from: classes.dex */
public final class oie {
    int a;

    static {
        yph.c("GH.WestworldLog");
    }

    public final void a(boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        int i = true != z ? 1 : 2;
        if (Build.VERSION.SDK_INT > 29) {
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(203000);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        } else {
            byte[] bArr = {3, 3, 1, (byte) SystemClock.elapsedRealtimeNanos(), (byte) (r7 >> 8), (byte) (r7 >> 16), (byte) (r7 >> 24), (byte) (r7 >> 32), (byte) (r7 >> 40), (byte) (r7 >> 48), (byte) (r7 >> 56), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            mjv.u(bArr, 12, 203000);
            mjv.u(bArr, 17, i);
            StatsLog.writeRaw(bArr, 21);
        }
        this.a++;
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oiy {
    int a;

    static {
        defpackage.yqm.c("GH.WestworldLog");
    }

    public final void a(boolean z) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        int i = true != z ? 1 : 2;
        if (android.os.Build.VERSION.SDK_INT > 29) {
            android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(203000);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.usePooledBuffer();
            android.util.StatsLog.write(builderNewBuilder.build());
        } else {
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            byte[] bArr = {3, 3, 1, (byte) jElapsedRealtimeNanos, (byte) (jElapsedRealtimeNanos >> 8), (byte) (jElapsedRealtimeNanos >> 16), (byte) (jElapsedRealtimeNanos >> 24), (byte) (jElapsedRealtimeNanos >> 32), (byte) (jElapsedRealtimeNanos >> 40), (byte) (jElapsedRealtimeNanos >> 48), (byte) (jElapsedRealtimeNanos >> 56), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            defpackage.mkc.I(bArr, 12, 203000);
            defpackage.mkc.I(bArr, 17, i);
            android.util.StatsLog.writeRaw(bArr, 21);
        }
        this.a++;
    }
}

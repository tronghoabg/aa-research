package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import java.io.BufferedWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class jft extends jfs {
    private static final yph b = yph.c("CAR.WIFILOG");
    private final Context c;

    static {
        yfq.q("MEMORY USAGE");
    }

    public jft(Context context) {
        this.c = context;
    }

    @Override // defpackage.jfs
    public final Bundle a(long j) {
        Bundle bundle = new Bundle();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.c.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = memoryInfo.totalMem;
        bundle.putInt("MEMORY USAGE", j2 == 0 ? 0 : (int) (((j2 - memoryInfo.availMem) / j2) * 100.0d));
        return bundle;
    }

    @Override // defpackage.jfs
    public final void b(BufferedWriter bufferedWriter, Bundle bundle) {
        try {
            bufferedWriter.append((CharSequence) ("MEMORY USAGE: " + bundle.getInt("MEMORY USAGE")));
        } catch (IOException unused) {
            ((ype) b.l().ai((char) 2003)).u("couldn't write to log file");
        }
    }
}

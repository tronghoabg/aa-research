package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes3.dex */
public final class xuf {
    public final int a;
    public final int b;
    public final int c;
    public final Object d;

    public xuf(hxy hxyVar) {
        this.d = hxyVar.a;
        int i = true != hxyVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.b = i;
        int iRound = Math.round(r2.getMemoryClass() * 1048576 * (true != hxyVar.b.isLowRamDevice() ? 0.4f : 0.33f));
        float f = ((DisplayMetrics) hxyVar.d.a).widthPixels * ((DisplayMetrics) hxyVar.d.a).heightPixels * 4;
        int iRound2 = Math.round(hxyVar.c * f);
        int iRound3 = Math.round(f + f);
        int i2 = iRound - i;
        int i3 = iRound3 + iRound2;
        if (i3 <= i2) {
            this.a = iRound3;
            this.c = iRound2;
        } else {
            float f2 = i2 / (hxyVar.c + 2.0f);
            iRound3 = Math.round(f2 + f2);
            this.a = iRound3;
            iRound2 = Math.round(f2 * hxyVar.c);
            this.c = iRound2;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String strA = a(iRound3);
            String strA2 = a(iRound2);
            String strA3 = a(i);
            boolean z = i3 > iRound;
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + strA + ", pool size: " + strA2 + ", byte array size: " + strA3 + ", memory class limited? " + z + ", max size: " + a(iRound) + ", memoryClass: " + hxyVar.b.getMemoryClass() + ", isLowMemoryDevice: " + hxyVar.b.isLowRamDevice());
        }
    }

    private final String a(int i) {
        return Formatter.formatFileSize((Context) this.d, i);
    }

    public xuf(String str, int i, int i2, int i3) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public xuf(xug xugVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = xugVar;
    }

    public xuf(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = -1;
    }
}

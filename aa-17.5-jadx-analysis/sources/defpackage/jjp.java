package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class jjp implements jjo {
    private static final yph b = yph.c("CAR.WM.FrameRateLimit");
    public final jjm a;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Map d = new LinkedHashMap();
    private int e = 0;
    private int f = 60;
    private int g;

    public jjp(jjm jjmVar) {
        this.a = jjmVar;
    }

    private final synchronized int g() {
        int i = this.e;
        if (i > 0) {
            return i;
        }
        int iMin = this.f;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > 0) {
                iMin = Math.min(iMin, iIntValue);
            }
        }
        return iMin;
    }

    private final synchronized void h() {
        int iG = g();
        yph yphVar = b;
        ((ype) yphVar.l().ai(2238)).w("frame rate calculated: %d", iG);
        if (iG == this.g) {
            return;
        }
        ((ype) ((ype) yphVar.f()).ai(2239)).B("Frame rate change. %d fps -> %d fps", this.g, iG);
        this.g = iG;
        this.c.post(new ira(this, iG, 3));
    }

    @Override // defpackage.jjo
    public final synchronized int a() {
        return this.g;
    }

    @Override // defpackage.jjo
    public final synchronized void b(jjn jjnVar, int i) {
        if (i <= 0) {
            f(jjnVar);
            this.d.put(jjnVar, Integer.valueOf(i));
            h();
        } else {
            this.d.put(jjnVar, Integer.valueOf(i));
            h();
        }
    }

    @Override // defpackage.jjo
    public final synchronized void c(int i) {
        ((ype) b.l().ai((char) 2237)).w("configureForDisplay(/* fps= */ %d)", i);
        this.f = i;
        h();
    }

    @Override // defpackage.jjo
    public final synchronized void d(PrintWriter printWriter) {
        printWriter.format("FrameRateLimitManagerImpl (limit: %d fps, max: %d fps)\n", Integer.valueOf(this.g), Integer.valueOf(this.f));
        int i = this.e;
        if (i > 0) {
            printWriter.format("  Fixed frame rate: %d fps\n", Integer.valueOf(i));
        }
        printWriter.append("  Current restrictions:\n");
        Map map = this.d;
        if (map.isEmpty()) {
            printWriter.append("    -- no restrictions applied --\n");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            printWriter.format("    %2d fps: %s\n", entry.getValue(), ((jjn) entry.getKey()).a());
        }
    }

    @Override // defpackage.jjo
    public final synchronized void e(int i) {
        ((ype) b.l().ai((char) 2240)).w("setFixedFrameRate(%d)", i);
        this.e = i;
        h();
    }

    public final synchronized void f(jjn jjnVar) {
        this.d.remove(jjnVar);
        h();
    }
}

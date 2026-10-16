package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class rxs extends rxr {
    private static final ypf e = ols.R("CAR.SERVICEUSBMON.IMPL");
    public final rys b;
    public final Set c = new HashSet();
    public boolean d = true;
    private final boolean f = adbu.a.gu().b();
    private final rza g;
    private final Context h;
    private final SharedPreferences i;
    private final xxh j;

    public rxs(rza rzaVar, rys rysVar, Context context, xxh xxhVar) {
        this.g = rzaVar;
        this.b = rysVar;
        this.h = context;
        this.i = context.getSharedPreferences("reset_prefs", 0);
        this.j = xxhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rxr
    public final synchronized void c(PrintWriter printWriter) {
        if (this.f) {
            rza rzaVar = this.g;
            if (rzaVar.g()) {
                printWriter.println("\nCarServiceUsbMonitor");
                printWriter.println("Current");
                for (Map.Entry entry : rzaVar.a().entrySet()) {
                    printWriter.println("Port status for " + ((String) entry.getKey()) + ": " + String.valueOf(entry.getValue()));
                }
                printWriter.println("UsbState ".concat(String.valueOf(String.valueOf(rzaVar.e()))));
                yfq yfqVarA = this.b.a();
                if (!yfqVarA.isEmpty()) {
                    printWriter.println("History");
                    int i = ((yls) yfqVarA).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        String str = (String) yfqVarA.get(i2);
                        if (str != null) {
                            printWriter.println(str);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.rxr
    public final synchronized void d(Object obj, int i) {
        if (this.f && this.d && this.g.g()) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bp(i, "intervalInMs has to be positive. Received: "));
            }
            this.c.add(obj);
            this.b.c(i);
        }
    }

    @Override // defpackage.rxr
    public final synchronized void e(Object obj) {
        if (this.f && this.g.g()) {
            Set set = this.c;
            if (set.remove(obj) && set.isEmpty()) {
                this.b.d();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, ryg] */
    @Override // defpackage.rxr
    public final boolean f() {
        rhx rhxVar = rhx.c;
        ryf ryfVarA = qrv.A("function");
        xxh xxhVar = this.j;
        if (xxhVar.f()) {
            if (ryfVarA != null) {
                xxhVar.b().d(this.h, 1, 4, ryfVarA);
                return true;
            }
            e.h().ai(8520).y("Reset method %s not supported on this version of Android", "function");
            return true;
        }
        ypf ypfVar = e;
        ypfVar.h().ai(8516).u("Reset handler not provided. This should never happen for Android R and above.");
        if (this.f) {
            adbr adbrVar = adbr.a;
            if (adbrVar.gu().s()) {
                SharedPreferences sharedPreferences = this.i;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = sharedPreferences.getLong("reset_timestamp", -1L);
                if (j != -1 && jCurrentTimeMillis - j < adbrVar.gu().h()) {
                    ols.L(this.h, "com.google.android.gms.car.USB_ISSUE_FOUND", rrz.i, null);
                    ypfVar.h().ai(8517).u("USB connection has been reset recently");
                    return false;
                }
                ypfVar.h().ai(8518).u("Attempting to reset the USB connection");
                ols.L(this.h, "com.google.android.gms.car.USB_RESET", rrx.a, null);
                sharedPreferences.edit().putLong("reset_timestamp", System.currentTimeMillis()).apply();
                try {
                    this.g.b();
                    return true;
                } catch (rye e2) {
                    e.h().p(e2).ai(8519).u("Failed to reset usb connection.");
                }
            }
        }
        return false;
    }
}

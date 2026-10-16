package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class lwx implements lhg, mnd {
    public static final yph a = yph.c("GH.SmsBrdcstRcv");
    public final Context b;
    public int d;
    private boolean e;
    private xyc g;
    public final Set c = new HashSet();
    private final BroadcastReceiver f = new lww(this);

    public lwx(Context context) {
        this.b = context;
    }

    public static lwx a() {
        return (lwx) mki.a.i(lwx.class);
    }

    public final void b(Consumer consumer) {
        this.c.add(consumer);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (f(kio.b().e())) {
            mnc.a().b(mnb.v, this);
            if (this.e) {
                return;
            }
            this.e = true;
            dup.e(this.b, this.f, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"), null, 2);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        this.g = null;
        if (this.e) {
            this.b.unregisterReceiver(this.f);
            this.e = false;
        }
        this.d = 0;
        mnc.a().d(mnb.v);
    }

    public final void e(Consumer consumer) {
        this.c.remove(consumer);
    }

    @ResultIgnorabilityUnspecified
    public final boolean f(qrn qrnVar) {
        xyc xycVarL = this.g;
        if (xycVarL == null) {
            xycVarL = wub.L(new plm(this, qrnVar, 1));
            this.g = xycVarL;
        }
        return ((Boolean) xycVarL.gu()).booleanValue();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        try {
            xyc xycVar = this.g;
            if (xycVar == null) {
                printWriter.println("SmsBroadcastReceiver is out of lifecycle so there is no status.");
            } else {
                printWriter.printf("SmsBroadcastReceiver | Enabled: %b; SMSs received this session: %d%n", xycVar.gu(), Integer.valueOf(this.d));
            }
        } catch (Throwable th) {
            ((ype) ((ype) ((ype) a.g()).p(th)).ai((char) 4421)).u("Failed to produce report status for SmsBroadcastReceiver");
            printWriter.println("Failed to produce status report for SmsBroadcastReceiver");
            printWriter.println(th);
        }
    }
}

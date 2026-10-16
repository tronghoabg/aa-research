package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class sjj {
    public LogEventParcelable a;
    public Consumer b;
    public Consumer c;
    private boolean d;
    private byte e = 1;

    public sjj(sjk sjkVar) {
        this.a = sjkVar.a;
        this.b = sjkVar.b;
        this.c = sjkVar.c;
        this.d = sjkVar.d;
    }

    public final sjk a() {
        LogEventParcelable logEventParcelable;
        Consumer consumer;
        Consumer consumer2;
        if (this.e == 1 && (logEventParcelable = this.a) != null && (consumer = this.b) != null && (consumer2 = this.c) != null) {
            return new sjk(logEventParcelable, consumer, consumer2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" logEventParcelable");
        }
        if (this.b == null) {
            sb.append(" successResultSetter");
        }
        if (this.c == null) {
            sb.append(" failedResultSetter");
        }
        if (this.e == 0) {
            sb.append(" isRetryEvent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}

package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class sjk {
    public final LogEventParcelable a;
    public final Consumer b;
    public final Consumer c;
    public final boolean d;

    public sjk(LogEventParcelable logEventParcelable, Consumer consumer, Consumer consumer2, boolean z) {
        this.a = logEventParcelable;
        this.b = consumer;
        this.c = consumer2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjk) {
            sjk sjkVar = (sjk) obj;
            if (this.a.equals(sjkVar.a) && this.b.equals(sjkVar.b) && this.c.equals(sjkVar.c) && this.d == sjkVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.d ? 1237 : 1231) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        Consumer consumer = this.c;
        Consumer consumer2 = this.b;
        return "BatchingLogEvent{logEventParcelable=" + String.valueOf(this.a) + ", successResultSetter=" + String.valueOf(consumer2) + ", failedResultSetter=" + String.valueOf(consumer) + ", isRetryEvent=" + this.d + "}";
    }

    public sjk() {
        throw null;
    }
}

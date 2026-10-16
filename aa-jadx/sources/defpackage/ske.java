package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ske {
    public com.google.android.gms.clearcut.LogEventParcelable a;
    public java.util.function.Consumer b;
    public java.util.function.Consumer c;
    private boolean d;
    private boolean e;
    private byte f = 3;

    public ske(defpackage.skf skfVar) {
        this.a = skfVar.a;
        this.b = skfVar.b;
        this.c = skfVar.c;
        this.d = skfVar.d;
        this.e = skfVar.e;
    }

    public final defpackage.skf a() {
        com.google.android.gms.clearcut.LogEventParcelable logEventParcelable;
        java.util.function.Consumer consumer;
        java.util.function.Consumer consumer2;
        if (this.f == 3 && (logEventParcelable = this.a) != null && (consumer = this.b) != null && (consumer2 = this.c) != null) {
            return new defpackage.skf(logEventParcelable, consumer, consumer2, this.d, this.e);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" logEventParcelable");
        }
        if (this.b == null) {
            sb.append(" successResultSetter");
        }
        if (this.c == null) {
            sb.append(" failedResultSetter");
        }
        if ((this.f & 1) == 0) {
            sb.append(" isRetryEvent");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isLastRetryEvent");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }
}

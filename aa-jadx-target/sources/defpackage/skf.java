package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class skf {
    public final com.google.android.gms.clearcut.LogEventParcelable a;
    public final java.util.function.Consumer b;
    public final java.util.function.Consumer c;
    public final boolean d;
    public final boolean e;

    public skf(com.google.android.gms.clearcut.LogEventParcelable logEventParcelable, java.util.function.Consumer consumer, java.util.function.Consumer consumer2, boolean z, boolean z2) {
        this.a = logEventParcelable;
        this.b = consumer;
        this.c = consumer2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.skf) {
            defpackage.skf skfVar = (defpackage.skf) obj;
            if (this.a.equals(skfVar.a) && ll$.ExternalSyntheticApiModelOutline0.m(this.b, skfVar.b) && ll$.ExternalSyntheticApiModelOutline0.m(this.c, skfVar.c) && this.d == skfVar.d && this.e == skfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ll$.ExternalSyntheticApiModelOutline0.m(this.b)) * 1000003) ^ ll$.ExternalSyntheticApiModelOutline0.m(this.c)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        java.util.function.Consumer consumer = this.c;
        java.util.function.Consumer consumer2 = this.b;
        return "BatchingLogEvent{logEventParcelable=" + java.lang.String.valueOf(this.a) + ", successResultSetter=" + java.lang.String.valueOf(consumer2) + ", failedResultSetter=" + java.lang.String.valueOf(consumer) + ", isRetryEvent=" + this.d + ", isLastRetryEvent=" + this.e + "}";
    }

    public skf() {
        throw null;
    }
}

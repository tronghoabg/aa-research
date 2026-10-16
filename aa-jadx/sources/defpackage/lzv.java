package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lzv {
    public final android.content.ComponentName a;
    public final java.lang.String b;
    public final j$.time.Instant c;

    public lzv(android.content.ComponentName componentName, java.lang.String str, j$.time.Instant instant) {
        this.a = componentName;
        this.b = str;
        if (instant == null) {
            throw new java.lang.NullPointerException("Null time");
        }
        this.c = instant;
    }

    public static defpackage.lzv a(android.content.ComponentName componentName, java.lang.String str) {
        return new defpackage.lzv(componentName, str, j$.time.Instant.now());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lzv) {
            defpackage.lzv lzvVar = (defpackage.lzv) obj;
            android.content.ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lzvVar.a) : lzvVar.a == null) {
                if (this.b.equals(lzvVar.b) && this.c.equals(lzvVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        return this.c.hashCode() ^ (((((componentName == null ? 0 : componentName.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        j$.time.Instant instant = this.c;
        return "ConnectionAttemptEntry{navApp=" + java.lang.String.valueOf(this.a) + ", resolution=" + this.b + ", time=" + instant.toString() + "}";
    }

    public lzv() {
        throw null;
    }
}

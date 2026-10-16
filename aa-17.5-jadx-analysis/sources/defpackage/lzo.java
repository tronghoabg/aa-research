package defpackage;

import android.content.ComponentName;
import j$.time.Instant;

/* loaded from: classes.dex */
public final class lzo {
    public final ComponentName a;
    public final String b;
    public final Instant c;

    public lzo(ComponentName componentName, String str, Instant instant) {
        this.a = componentName;
        this.b = str;
        if (instant == null) {
            throw new NullPointerException("Null time");
        }
        this.c = instant;
    }

    public static lzo a(ComponentName componentName, String str) {
        return new lzo(componentName, str, Instant.now());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzo) {
            lzo lzoVar = (lzo) obj;
            ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lzoVar.a) : lzoVar.a == null) {
                if (this.b.equals(lzoVar.b) && this.c.equals(lzoVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        return this.c.hashCode() ^ (((((componentName == null ? 0 : componentName.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        Instant instant = this.c;
        return "ConnectionAttemptEntry{navApp=" + String.valueOf(this.a) + ", resolution=" + this.b + ", time=" + instant.toString() + "}";
    }

    public lzo() {
        throw null;
    }
}

package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class ntx {
    public final ComponentName a;
    public final String b;
    private final mqa c;

    public ntx(ComponentName componentName, String str, mqa mqaVar) {
        this.a = componentName;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.b = str;
        this.c = mqaVar;
    }

    public static ntx a(ComponentName componentName, mqa mqaVar) {
        return new ntx(componentName, componentName.getPackageName(), mqaVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntx) {
            ntx ntxVar = (ntx) obj;
            ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(ntxVar.a) : ntxVar.a == null) {
                if (this.b.equals(ntxVar.b) && this.c.equals(ntxVar.c)) {
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
        mqa mqaVar = this.c;
        return "NotificationBadgeEntry{componentName=" + String.valueOf(this.a) + ", packageName=" + this.b + ", profileType=" + mqaVar.toString() + "}";
    }

    public ntx() {
        throw null;
    }
}

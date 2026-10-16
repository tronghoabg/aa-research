package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class ngc implements nga {
    public final ComponentName a;

    public ngc(ComponentName componentName) {
        componentName.getClass();
        this.a = componentName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngc) && affa.f(this.a, ((ngc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VoipCallEndedOpportunity(callingComponentName=" + this.a + ")";
    }
}

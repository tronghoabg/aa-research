package defpackage;

import android.content.ComponentName;
import androidx.car.app.suggestion.model.Suggestion;

/* loaded from: classes2.dex */
public final class moe {
    public final Suggestion a;
    public final ComponentName b;

    public moe(Suggestion suggestion, ComponentName componentName) {
        this.a = suggestion;
        this.b = componentName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof moe) {
            moe moeVar = (moe) obj;
            if (this.a.equals(moeVar.a) && this.b.equals(moeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ComponentName componentName = this.b;
        return "TemplateSuggestion{suggestion=" + String.valueOf(this.a) + ", componentName=" + String.valueOf(componentName) + "}";
    }

    public moe() {
        throw null;
    }
}

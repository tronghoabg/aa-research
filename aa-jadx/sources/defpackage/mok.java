package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mok {
    public final androidx.car.app.suggestion.model.Suggestion a;
    public final android.content.ComponentName b;

    public mok(androidx.car.app.suggestion.model.Suggestion suggestion, android.content.ComponentName componentName) {
        this.a = suggestion;
        this.b = componentName;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mok) {
            defpackage.mok mokVar = (defpackage.mok) obj;
            if (this.a.equals(mokVar.a) && this.b.equals(mokVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        android.content.ComponentName componentName = this.b;
        return "TemplateSuggestion{suggestion=" + java.lang.String.valueOf(this.a) + ", componentName=" + java.lang.String.valueOf(componentName) + "}";
    }

    public mok() {
        throw null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wim {
    public final java.lang.String a;
    public final defpackage.win b;
    private final java.lang.String c;

    public wim(java.lang.String str, java.lang.String str2, defpackage.win winVar) {
        this.a = str;
        this.c = str2;
        this.b = winVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wim) {
            defpackage.wim wimVar = (defpackage.wim) obj;
            if (this.a.equals(wimVar.a) && this.c.equals(wimVar.c) && this.b.equals(wimVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + java.lang.String.valueOf(this.b) + "}";
    }

    public wim() {
        throw null;
    }
}

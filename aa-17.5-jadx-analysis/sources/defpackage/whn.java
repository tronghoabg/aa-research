package defpackage;

/* loaded from: classes3.dex */
public final class whn {
    public final String a;
    public final who b;
    private final String c;

    public whn(String str, String str2, who whoVar) {
        this.a = str;
        this.c = str2;
        this.b = whoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof whn) {
            whn whnVar = (whn) obj;
            if (this.a.equals(whnVar.a) && this.c.equals(whnVar.c) && this.b.equals(whnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + String.valueOf(this.b) + "}";
    }

    public whn() {
        throw null;
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class agot {
    private Integer errorCode;
    public agov kind;
    public agou level;
    private String message;
    public agos version;

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final agov getKind() {
        agov agovVar = this.kind;
        if (agovVar != null) {
            return agovVar;
        }
        affa.d("kind");
        return null;
    }

    public final agou getLevel() {
        agou agouVar = this.level;
        if (agouVar != null) {
            return agouVar;
        }
        affa.d("level");
        return null;
    }

    public final String getMessage() {
        return this.message;
    }

    public final agos getVersion() {
        agos agosVar = this.version;
        if (agosVar != null) {
            return agosVar;
        }
        affa.d("version");
        return null;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public final void setKind(agov agovVar) {
        agovVar.getClass();
        this.kind = agovVar;
    }

    public final void setLevel(agou agouVar) {
        agouVar.getClass();
        this.level = agouVar;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setVersion(agos agosVar) {
        agosVar.getClass();
        this.version = agosVar;
    }

    public String toString() {
        return "KmVersionRequirement(kind=" + getKind() + ", level=" + getLevel() + ", version=" + getVersion() + ", errorCode=" + this.errorCode + ", message=" + this.message + ')';
    }
}

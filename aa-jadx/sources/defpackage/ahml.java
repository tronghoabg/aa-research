package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahml {
    public static final defpackage.ahmi Companion = new defpackage.ahmi(null);
    private final java.lang.Integer errorCode;
    private final defpackage.ahlh kind;
    private final defpackage.afam level;
    private final java.lang.String message;
    private final defpackage.ahmk version;

    public ahml(defpackage.ahmk ahmkVar, defpackage.ahlh ahlhVar, defpackage.afam afamVar, java.lang.Integer num, java.lang.String str) {
        ahmkVar.getClass();
        ahlhVar.getClass();
        afamVar.getClass();
        this.version = ahmkVar;
        this.kind = ahlhVar;
        this.level = afamVar;
        this.errorCode = num;
        this.message = str;
    }

    public final java.lang.Integer getErrorCode() {
        return this.errorCode;
    }

    public final defpackage.ahlh getKind() {
        return this.kind;
    }

    public final defpackage.afam getLevel() {
        return this.level;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final defpackage.ahmk getVersion() {
        return this.version;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("since ");
        sb.append(this.version);
        sb.append(' ');
        sb.append(this.level);
        if (this.errorCode != null) {
            str = " error " + this.errorCode.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        java.lang.String str2 = this.message;
        sb.append(str2 != null ? ": ".concat(str2) : "");
        return sb.toString();
    }
}

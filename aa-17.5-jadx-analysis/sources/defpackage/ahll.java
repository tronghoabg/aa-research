package defpackage;

/* loaded from: classes3.dex */
public final class ahll {
    public static final ahli Companion = new ahli(null);
    private final Integer errorCode;
    private final ahkh kind;
    private final aezm level;
    private final String message;
    private final ahlk version;

    public ahll(ahlk ahlkVar, ahkh ahkhVar, aezm aezmVar, Integer num, String str) {
        ahlkVar.getClass();
        ahkhVar.getClass();
        aezmVar.getClass();
        this.version = ahlkVar;
        this.kind = ahkhVar;
        this.level = aezmVar;
        this.errorCode = num;
        this.message = str;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final ahkh getKind() {
        return this.kind;
    }

    public final aezm getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ahlk getVersion() {
        return this.version;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.version);
        sb.append(' ');
        sb.append(this.level);
        if (this.errorCode != null) {
            str = " error " + this.errorCode.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.message;
        sb.append(str2 != null ? ": ".concat(str2) : "");
        return sb.toString();
    }
}

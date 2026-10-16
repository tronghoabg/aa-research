package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahoa {
    public static final defpackage.ahnz Companion = new defpackage.ahnz(null);
    private static final defpackage.ahoj LOCAL_NAME;
    private static final defpackage.ahof PACKAGE_FQ_NAME_FOR_LOCAL;
    private final defpackage.ahoj callableName;
    private final defpackage.ahod classId;
    private final defpackage.ahof className;
    private final defpackage.ahof packageName;
    private final defpackage.ahof pathToLocal;

    static {
        defpackage.ahoj ahojVar = defpackage.ahom.LOCAL;
        LOCAL_NAME = ahojVar;
        PACKAGE_FQ_NAME_FOR_LOCAL = defpackage.ahof.Companion.topLevel(ahojVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahoa(defpackage.ahof ahofVar, defpackage.ahoj ahojVar) {
        this(ahofVar, null, ahojVar, null, null);
        ahofVar.getClass();
        ahojVar.getClass();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahoa)) {
            return false;
        }
        defpackage.ahoa ahoaVar = (defpackage.ahoa) obj;
        return defpackage.afga.f(this.packageName, ahoaVar.packageName) && defpackage.afga.f(this.className, ahoaVar.className) && defpackage.afga.f(this.callableName, ahoaVar.callableName);
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() + 527;
        defpackage.ahof ahofVar = this.className;
        return (((iHashCode * 31) + (ahofVar != null ? ahofVar.hashCode() : 0)) * 31) + this.callableName.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.afzh.I(this.packageName.asString(), '.', '/'));
        sb.append("/");
        defpackage.ahof ahofVar = this.className;
        if (ahofVar != null) {
            sb.append(ahofVar);
            sb.append(".");
        }
        sb.append(this.callableName);
        return sb.toString();
    }

    private ahoa(defpackage.ahof ahofVar, defpackage.ahof ahofVar2, defpackage.ahoj ahojVar, defpackage.ahod ahodVar, defpackage.ahof ahofVar3) {
        this.packageName = ahofVar;
        this.className = ahofVar2;
        this.callableName = ahojVar;
        this.classId = ahodVar;
        this.pathToLocal = ahofVar3;
    }
}

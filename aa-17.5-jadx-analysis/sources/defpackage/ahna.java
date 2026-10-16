package defpackage;

/* loaded from: classes3.dex */
public final class ahna {
    public static final ahmz Companion = new ahmz(null);
    private static final ahnj LOCAL_NAME;
    private static final ahnf PACKAGE_FQ_NAME_FOR_LOCAL;
    private final ahnj callableName;
    private final ahnd classId;
    private final ahnf className;
    private final ahnf packageName;
    private final ahnf pathToLocal;

    static {
        ahnj ahnjVar = ahnm.LOCAL;
        LOCAL_NAME = ahnjVar;
        PACKAGE_FQ_NAME_FOR_LOCAL = ahnf.Companion.topLevel(ahnjVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahna(ahnf ahnfVar, ahnj ahnjVar) {
        this(ahnfVar, null, ahnjVar, null, null);
        ahnfVar.getClass();
        ahnjVar.getClass();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahna)) {
            return false;
        }
        ahna ahnaVar = (ahna) obj;
        return affa.f(this.packageName, ahnaVar.packageName) && affa.f(this.className, ahnaVar.className) && affa.f(this.callableName, ahnaVar.callableName);
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() + 527;
        ahnf ahnfVar = this.className;
        return (((iHashCode * 31) + (ahnfVar != null ? ahnfVar.hashCode() : 0)) * 31) + this.callableName.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(afyh.I(this.packageName.asString(), '.', '/'));
        sb.append("/");
        ahnf ahnfVar = this.className;
        if (ahnfVar != null) {
            sb.append(ahnfVar);
            sb.append(".");
        }
        sb.append(this.callableName);
        return sb.toString();
    }

    private ahna(ahnf ahnfVar, ahnf ahnfVar2, ahnj ahnjVar, ahnd ahndVar, ahnf ahnfVar3) {
        this.packageName = ahnfVar;
        this.className = ahnfVar2;
        this.callableName = ahnjVar;
        this.classId = ahndVar;
        this.pathToLocal = ahnfVar3;
    }
}

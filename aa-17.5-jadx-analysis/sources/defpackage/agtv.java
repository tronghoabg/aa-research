package defpackage;

/* loaded from: classes3.dex */
public final class agtv {
    private final String classInternalName;
    private final ahnj name;
    private final String parameters;
    private final String returnType;
    private final String signature;

    public agtv(String str, ahnj ahnjVar, String str2, String str3) {
        str.getClass();
        ahnjVar.getClass();
        str2.getClass();
        str3.getClass();
        this.classInternalName = str;
        this.name = ahnjVar;
        this.parameters = str2;
        this.returnType = str3;
        this.signature = ahft.INSTANCE.signature(str, ahnjVar + '(' + str2 + ')' + str3);
    }

    public static /* synthetic */ agtv copy$default(agtv agtvVar, String str, ahnj ahnjVar, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agtvVar.classInternalName;
        }
        if ((i & 2) != 0) {
            ahnjVar = agtvVar.name;
        }
        if ((i & 4) != 0) {
            str2 = agtvVar.parameters;
        }
        if ((i & 8) != 0) {
            str3 = agtvVar.returnType;
        }
        return agtvVar.copy(str, ahnjVar, str2, str3);
    }

    public final agtv copy(String str, ahnj ahnjVar, String str2, String str3) {
        str.getClass();
        ahnjVar.getClass();
        str2.getClass();
        str3.getClass();
        return new agtv(str, ahnjVar, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtv)) {
            return false;
        }
        agtv agtvVar = (agtv) obj;
        return affa.f(this.classInternalName, agtvVar.classInternalName) && affa.f(this.name, agtvVar.name) && affa.f(this.parameters, agtvVar.parameters) && affa.f(this.returnType, agtvVar.returnType);
    }

    public final ahnj getName() {
        return this.name;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((((this.classInternalName.hashCode() * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.returnType.hashCode();
    }

    public String toString() {
        return "NameAndSignature(classInternalName=" + this.classInternalName + ", name=" + this.name + ", parameters=" + this.parameters + ", returnType=" + this.returnType + ')';
    }
}

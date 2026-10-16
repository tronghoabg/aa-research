package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahzm {
    private final defpackage.ahic classProto;
    private final defpackage.ahlv metadataVersion;
    private final defpackage.ahmd nameResolver;
    private final defpackage.agex sourceElement;

    public ahzm(defpackage.ahmd ahmdVar, defpackage.ahic ahicVar, defpackage.ahlv ahlvVar, defpackage.agex agexVar) {
        ahmdVar.getClass();
        ahicVar.getClass();
        ahlvVar.getClass();
        agexVar.getClass();
        this.nameResolver = ahmdVar;
        this.classProto = ahicVar;
        this.metadataVersion = ahlvVar;
        this.sourceElement = agexVar;
    }

    public final defpackage.ahmd component1() {
        return this.nameResolver;
    }

    public final defpackage.ahic component2() {
        return this.classProto;
    }

    public final defpackage.ahlv component3() {
        return this.metadataVersion;
    }

    public final defpackage.agex component4() {
        return this.sourceElement;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahzm)) {
            return false;
        }
        defpackage.ahzm ahzmVar = (defpackage.ahzm) obj;
        return defpackage.afga.f(this.nameResolver, ahzmVar.nameResolver) && defpackage.afga.f(this.classProto, ahzmVar.classProto) && defpackage.afga.f(this.metadataVersion, ahzmVar.metadataVersion) && defpackage.afga.f(this.sourceElement, ahzmVar.sourceElement);
    }

    public int hashCode() {
        return (((((this.nameResolver.hashCode() * 31) + this.classProto.hashCode()) * 31) + this.metadataVersion.hashCode()) * 31) + this.sourceElement.hashCode();
    }

    public java.lang.String toString() {
        return "ClassData(nameResolver=" + this.nameResolver + ", classProto=" + this.classProto + ", metadataVersion=" + this.metadataVersion + ", sourceElement=" + this.sourceElement + ')';
    }
}

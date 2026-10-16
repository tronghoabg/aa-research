package defpackage;

/* loaded from: classes3.dex */
public final class ahym {
    private final ahhc classProto;
    private final ahkv metadataVersion;
    private final ahld nameResolver;
    private final agdx sourceElement;

    public ahym(ahld ahldVar, ahhc ahhcVar, ahkv ahkvVar, agdx agdxVar) {
        ahldVar.getClass();
        ahhcVar.getClass();
        ahkvVar.getClass();
        agdxVar.getClass();
        this.nameResolver = ahldVar;
        this.classProto = ahhcVar;
        this.metadataVersion = ahkvVar;
        this.sourceElement = agdxVar;
    }

    public final ahld component1() {
        return this.nameResolver;
    }

    public final ahhc component2() {
        return this.classProto;
    }

    public final ahkv component3() {
        return this.metadataVersion;
    }

    public final agdx component4() {
        return this.sourceElement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahym)) {
            return false;
        }
        ahym ahymVar = (ahym) obj;
        return affa.f(this.nameResolver, ahymVar.nameResolver) && affa.f(this.classProto, ahymVar.classProto) && affa.f(this.metadataVersion, ahymVar.metadataVersion) && affa.f(this.sourceElement, ahymVar.sourceElement);
    }

    public int hashCode() {
        return (((((this.nameResolver.hashCode() * 31) + this.classProto.hashCode()) * 31) + this.metadataVersion.hashCode()) * 31) + this.sourceElement.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.nameResolver + ", classProto=" + this.classProto + ", metadataVersion=" + this.metadataVersion + ", sourceElement=" + this.sourceElement + ')';
    }
}

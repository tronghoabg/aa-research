package defpackage;

/* loaded from: classes3.dex */
public final class ahxy implements ahya {
    private final agba classDescriptor;
    private final agba declarationDescriptor;
    private final ahxy original;

    public ahxy(agba agbaVar, ahxy ahxyVar) {
        agbaVar.getClass();
        this.classDescriptor = agbaVar;
        this.original = ahxyVar == null ? this : ahxyVar;
        this.declarationDescriptor = agbaVar;
    }

    public boolean equals(Object obj) {
        ahxy ahxyVar = obj instanceof ahxy ? (ahxy) obj : null;
        return affa.f(this.classDescriptor, ahxyVar != null ? ahxyVar.classDescriptor : null);
    }

    public final agba getClassDescriptor() {
        return this.classDescriptor;
    }

    @Override // defpackage.ahya
    public aigw getType() {
        aigw defaultType = this.classDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}

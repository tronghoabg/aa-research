package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class agay implements agee {
    private final agbi declarationDescriptor;
    private final int declaredTypeParametersCount;
    private final agee originalDescriptor;

    public agay(agee ageeVar, agbi agbiVar, int i) {
        ageeVar.getClass();
        agbiVar.getClass();
        this.originalDescriptor = ageeVar;
        this.declarationDescriptor = agbiVar;
        this.declaredTypeParametersCount = i;
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return (R) this.originalDescriptor.accept(agbkVar, d);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return this.originalDescriptor.getAnnotations();
    }

    @Override // defpackage.agbj, defpackage.agbi
    public agbi getContainingDeclaration() {
        return this.declarationDescriptor;
    }

    @Override // defpackage.agbd
    public aigw getDefaultType() {
        aigw defaultType = this.originalDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    @Override // defpackage.agee
    public int getIndex() {
        return this.declaredTypeParametersCount + this.originalDescriptor.getIndex();
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        ahnj name = this.originalDescriptor.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.agbi
    public agee getOriginal() {
        agee original = this.originalDescriptor.getOriginal();
        original.getClass();
        return original;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx source = this.originalDescriptor.getSource();
        source.getClass();
        return source;
    }

    @Override // defpackage.agee
    public aiei getStorageManager() {
        aiei storageManager = this.originalDescriptor.getStorageManager();
        storageManager.getClass();
        return storageManager;
    }

    @Override // defpackage.agee, defpackage.agbd
    public aiid getTypeConstructor() {
        aiid typeConstructor = this.originalDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    @Override // defpackage.agee
    public List<aigl> getUpperBounds() {
        List<aigl> upperBounds = this.originalDescriptor.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // defpackage.agee
    public aijg getVariance() {
        aijg variance = this.originalDescriptor.getVariance();
        variance.getClass();
        return variance;
    }

    @Override // defpackage.agee
    public boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override // defpackage.agee
    public boolean isReified() {
        return this.originalDescriptor.isReified();
    }

    public String toString() {
        agee ageeVar = this.originalDescriptor;
        Objects.toString(ageeVar);
        return String.valueOf(ageeVar).concat("[inner-copy]");
    }
}

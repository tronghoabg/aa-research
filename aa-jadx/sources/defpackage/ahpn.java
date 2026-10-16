package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahpn<MessageType extends defpackage.ahpn<MessageType>> extends defpackage.ahpq implements defpackage.ahqh {
    private final defpackage.ahpi<defpackage.ahpo> extensions;

    protected ahpn() {
        this.extensions = defpackage.ahpi.newFieldSet();
    }

    private void verifyExtensionContainingType(defpackage.ahpp<MessageType, ?> ahppVar) {
        if (ahppVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    protected boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    protected int extensionsSerializedSize() {
        return this.extensions.getSerializedSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(defpackage.ahpp<MessageType, Type> ahppVar) {
        verifyExtensionContainingType(ahppVar);
        java.lang.Object field = this.extensions.getField(ahppVar.descriptor);
        return field == null ? ahppVar.defaultValue : (Type) ahppVar.fromFieldSetType(field);
    }

    public final <Type> int getExtensionCount(defpackage.ahpp<MessageType, java.util.List<Type>> ahppVar) {
        verifyExtensionContainingType(ahppVar);
        return this.extensions.getRepeatedFieldCount(ahppVar.descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> boolean hasExtension(defpackage.ahpp<MessageType, Type> ahppVar) {
        verifyExtensionContainingType(ahppVar);
        return this.extensions.hasField(ahppVar.descriptor);
    }

    @Override // defpackage.ahpq
    protected void makeExtensionsImmutable() {
        this.extensions.makeImmutable();
    }

    protected defpackage.ahpm newExtensionWriter() {
        return new defpackage.ahpm(this, false, null);
    }

    @Override // defpackage.ahpq
    protected boolean parseUnknownField(defpackage.ahpc ahpcVar, defpackage.ahpe ahpeVar, defpackage.ahpg ahpgVar, int i) throws java.io.IOException {
        return defpackage.ahpq.parseUnknownField(this.extensions, getDefaultInstanceForType(), ahpcVar, ahpeVar, ahpgVar, i);
    }

    protected ahpn(defpackage.ahpl<MessageType, ?> ahplVar) {
        this.extensions = ahplVar.buildExtensions();
    }

    public final <Type> Type getExtension(defpackage.ahpp<MessageType, java.util.List<Type>> ahppVar, int i) {
        verifyExtensionContainingType(ahppVar);
        return (Type) ahppVar.singularFromFieldSetType(this.extensions.getRepeatedField(ahppVar.descriptor, i));
    }
}

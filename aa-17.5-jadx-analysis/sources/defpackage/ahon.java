package defpackage;

import defpackage.ahon;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ahon<MessageType extends ahon<MessageType>> extends ahoq implements ahph {
    private final ahoi<ahoo> extensions;

    protected ahon() {
        this.extensions = ahoi.newFieldSet();
    }

    private void verifyExtensionContainingType(ahop<MessageType, ?> ahopVar) {
        if (ahopVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    protected boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    protected int extensionsSerializedSize() {
        return this.extensions.getSerializedSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> Type getExtension(ahop<MessageType, Type> ahopVar) {
        verifyExtensionContainingType(ahopVar);
        Object field = this.extensions.getField(ahopVar.descriptor);
        return field == null ? ahopVar.defaultValue : (Type) ahopVar.fromFieldSetType(field);
    }

    public final <Type> int getExtensionCount(ahop<MessageType, List<Type>> ahopVar) {
        verifyExtensionContainingType(ahopVar);
        return this.extensions.getRepeatedFieldCount(ahopVar.descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> boolean hasExtension(ahop<MessageType, Type> ahopVar) {
        verifyExtensionContainingType(ahopVar);
        return this.extensions.hasField(ahopVar.descriptor);
    }

    @Override // defpackage.ahoq
    protected void makeExtensionsImmutable() {
        this.extensions.makeImmutable();
    }

    protected ahom newExtensionWriter() {
        return new ahom(this, false, null);
    }

    @Override // defpackage.ahoq
    protected boolean parseUnknownField(ahoc ahocVar, ahoe ahoeVar, ahog ahogVar, int i) throws IOException {
        return ahoq.parseUnknownField(this.extensions, getDefaultInstanceForType(), ahocVar, ahoeVar, ahogVar, i);
    }

    protected ahon(ahol<MessageType, ?> aholVar) {
        this.extensions = aholVar.buildExtensions();
    }

    public final <Type> Type getExtension(ahop<MessageType, List<Type>> ahopVar, int i) {
        verifyExtensionContainingType(ahopVar);
        return (Type) ahopVar.singularFromFieldSetType(this.extensions.getRepeatedField(ahopVar.descriptor, i));
    }
}

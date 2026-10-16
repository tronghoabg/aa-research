package defpackage;

import defpackage.ahol;
import defpackage.ahon;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ahol<MessageType extends ahon<MessageType>, BuilderType extends ahol<MessageType, BuilderType>> extends ahok<MessageType, BuilderType> implements ahph {
    private ahoi<ahoo> extensions = ahoi.emptySet();
    private boolean extensionsIsMutable;

    protected ahol() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ahoi<ahoo> buildExtensions() {
        this.extensions.makeImmutable();
        this.extensionsIsMutable = false;
        return this.extensions;
    }

    private void ensureExtensionsIsMutable() {
        if (this.extensionsIsMutable) {
            return;
        }
        this.extensions = this.extensions.m87clone();
        this.extensionsIsMutable = true;
    }

    private void verifyExtensionContainingType(ahop<MessageType, ?> ahopVar) {
        if (ahopVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final <Type> BuilderType addExtension(ahop<MessageType, List<Type>> ahopVar, Type type) {
        verifyExtensionContainingType(ahopVar);
        ensureExtensionsIsMutable();
        this.extensions.addRepeatedField(ahopVar.descriptor, ahopVar.singularToFieldSetType(type));
        return this;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public BuilderType mo86clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean extensionsAreInitialized() {
        return this.extensions.isInitialized();
    }

    protected final void mergeExtensionFields(MessageType messagetype) {
        ensureExtensionsIsMutable();
        this.extensions.mergeFrom(((ahon) messagetype).extensions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> BuilderType setExtension(ahop<MessageType, Type> ahopVar, Type type) {
        verifyExtensionContainingType(ahopVar);
        ensureExtensionsIsMutable();
        this.extensions.setField(ahopVar.descriptor, ahopVar.toFieldSetType(type));
        return this;
    }
}

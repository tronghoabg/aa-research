package com.google.v;

import com.google.v.dm;
import com.google.v.du;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class dm<MessageType extends du<MessageType, BuilderType>, BuilderType extends dm<MessageType, BuilderType>> extends b<MessageType, BuilderType> {
    private final MessageType defaultInstance;
    protected MessageType instance;

    protected dm(MessageType messagetype) {
        this.defaultInstance = messagetype;
        if (messagetype.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = (MessageType) newMutableInstance();
    }

    private static <MessageType extends du<?, ?>> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        fq.a().b(messagetype).g(messagetype, messagetype2);
    }

    private MessageType newMutableInstance() {
        return (MessageType) this.defaultInstance.newMutableInstance();
    }

    @Override // com.google.v.fh
    public final MessageType build() {
        MessageType messagetype = (MessageType) buildPartial();
        if (messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype);
    }

    @Override // com.google.v.fh
    public MessageType buildPartial() {
        boolean zIsMutable = this.instance.isMutable();
        MessageType messagetype = this.instance;
        if (!zIsMutable) {
            return messagetype;
        }
        messagetype.makeImmutable();
        return this.instance;
    }

    public final BuilderType clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = (MessageType) newMutableInstance();
        return this;
    }

    @Override // com.google.v.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType mo19743clone() {
        BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
        buildertype.instance = (MessageType) buildPartial();
        return buildertype;
    }

    protected final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    protected void copyOnWriteInternal() {
        MessageType messagetype = (MessageType) newMutableInstance();
        mergeFromInstance(messagetype, this.instance);
        this.instance = messagetype;
    }

    @Override // com.google.v.fj
    public final boolean isInitialized() {
        return du.isInitialized(this.instance, false);
    }

    @Override // com.google.v.b
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo19749mergeFrom(byte[] bArr, int i2, int i3, de deVar) throws eu {
        copyOnWrite();
        try {
            fq.a().b(this.instance).i(this.instance, bArr, i2, i2 + i3, new k(deVar));
            return this;
        } catch (eu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.v.fj
    public MessageType getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.v.b
    public BuilderType internalMergeFrom(MessageType messagetype) {
        return (BuilderType) mergeFrom((dm<MessageType, BuilderType>) messagetype);
    }

    /* renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ fh m20091clear() {
        clear();
        return this;
    }

    @Override // com.google.v.b, com.google.v.fh
    public BuilderType mergeFrom(z zVar, de deVar) throws IOException {
        copyOnWrite();
        try {
            fq.a().b(this.instance).h(this.instance, aa.q(zVar), deVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    public BuilderType mergeFrom(MessageType messagetype) {
        if (messagetype != null && !getDefaultInstanceForType().getClass().isInstance(messagetype)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (getDefaultInstanceForType().equals(messagetype)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, messagetype);
        return this;
    }

    @Override // com.google.v.b
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo19748mergeFrom(byte[] bArr, int i2, int i3) {
        return (BuilderType) mo19749mergeFrom(bArr, i2, i3, de.f12840a);
    }
}

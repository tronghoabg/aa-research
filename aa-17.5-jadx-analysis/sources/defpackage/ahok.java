package defpackage;

import defpackage.ahok;
import defpackage.ahoq;

/* loaded from: classes3.dex */
public abstract class ahok<MessageType extends ahoq, BuilderType extends ahok> extends ahns<BuilderType> {
    private ahoa unknownFields = ahoa.EMPTY;

    protected ahok() {
    }

    @Override // defpackage.ahns
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BuilderType mo86clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public abstract MessageType getDefaultInstanceForType();

    public final ahoa getUnknownFields() {
        return this.unknownFields;
    }

    public abstract BuilderType mergeFrom(MessageType messagetype);

    public final BuilderType setUnknownFields(ahoa ahoaVar) {
        this.unknownFields = ahoaVar;
        return this;
    }
}

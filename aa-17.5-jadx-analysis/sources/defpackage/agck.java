package defpackage;

import defpackage.ailx;

/* loaded from: classes3.dex */
public final class agck<Type extends ailx> extends agej<Type> {
    private final ahnj underlyingPropertyName;
    private final Type underlyingType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agck(ahnj ahnjVar, Type type) {
        super(null);
        ahnjVar.getClass();
        type.getClass();
        this.underlyingPropertyName = ahnjVar;
        this.underlyingType = type;
    }

    public final ahnj getUnderlyingPropertyName() {
        return this.underlyingPropertyName;
    }

    public final Type getUnderlyingType() {
        return this.underlyingType;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.underlyingPropertyName + ", underlyingType=" + this.underlyingType + ')';
    }
}

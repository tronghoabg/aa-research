package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agdk<Type extends defpackage.aimx> extends defpackage.agfj<Type> {
    private final defpackage.ahoj underlyingPropertyName;
    private final Type underlyingType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdk(defpackage.ahoj ahojVar, Type type) {
        super(null);
        ahojVar.getClass();
        type.getClass();
        this.underlyingPropertyName = ahojVar;
        this.underlyingType = type;
    }

    public final defpackage.ahoj getUnderlyingPropertyName() {
        return this.underlyingPropertyName;
    }

    public final Type getUnderlyingType() {
        return this.underlyingType;
    }

    public java.lang.String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.underlyingPropertyName + ", underlyingType=" + this.underlyingType + ')';
    }
}

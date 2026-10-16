package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class IterationType extends SimpleType {
    private static final long serialVersionUID = 1;
    protected final JavaType _iteratedType;

    protected IterationType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, Objects.hashCode(javaType2), obj, obj2, z);
        this._iteratedType = javaType2;
    }

    public static IterationType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new IterationType(cls, typeBindings, javaType, javaTypeArr, javaType2, null, null, false);
    }

    public static IterationType upgradeFrom(JavaType javaType, JavaType javaType2) {
        Objects.requireNonNull(javaType2);
        if (javaType instanceof TypeBase) {
            return new IterationType((TypeBase) javaType, javaType2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of ".concat(String.valueOf(String.valueOf(javaType.getClass()))));
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase
    protected String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._iteratedType != null && _hasNTypeParameters(1)) {
            sb.append('<');
            sb.append(this._iteratedType.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public /* bridge */ /* synthetic */ ResolvedType getContentType() {
        return getContentType();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getErasedSignature(StringBuilder sb) {
        _classSignature(this._class, sb, true);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        StringBuilder genericSignature = this._iteratedType.getGenericSignature(sb);
        genericSignature.append(">;");
        return genericSignature;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public boolean hasContentType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isIterationType() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new IterationType(cls, this._bindings, javaType, javaTypeArr, this._iteratedType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        return this._iteratedType == javaType ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public IterationType withContentTypeHandler(Object obj) {
        return obj == this._iteratedType.getTypeHandler() ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public IterationType withContentValueHandler(Object obj) {
        return obj == this._iteratedType.getValueHandler() ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public IterationType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        Class<?> cls = this._class;
        TypeBindings typeBindings = this._bindings;
        JavaType javaType = this._superClass;
        JavaType[] javaTypeArr = this._superInterfaces;
        JavaType javaType2 = this._iteratedType;
        return new IterationType(cls, typeBindings, javaType, javaTypeArr, javaType2.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public IterationType withTypeHandler(Object obj) {
        return obj == this._typeHandler ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType, this._valueHandler, obj, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public IterationType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType, obj, this._typeHandler, this._asStatic);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public JavaType getContentType() {
        return this._iteratedType;
    }

    protected IterationType(TypeBase typeBase, JavaType javaType) {
        super(typeBase);
        this._iteratedType = javaType;
    }
}

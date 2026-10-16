package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class IdentityEqualityType extends TypeBase {
    private static final long serialVersionUID = 1;

    protected IdentityEqualityType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, i2, obj, obj2, z);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* loaded from: classes4.dex */
public final class D0 implements FieldSet$FieldDescriptorLite {

    /* renamed from: a, reason: collision with root package name */
    public final Internal.EnumLiteMap f27540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27541b;

    /* renamed from: c, reason: collision with root package name */
    public final WireFormat.FieldType f27542c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27544e;

    public D0(Internal.EnumLiteMap enumLiteMap, int i5, WireFormat.FieldType fieldType, boolean z2, boolean z10) {
        this.f27540a = enumLiteMap;
        this.f27541b = i5;
        this.f27542c = fieldType;
        this.f27543d = z2;
        this.f27544e = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27541b - ((D0) obj).f27541b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final Internal.EnumLiteMap getEnumType() {
        return this.f27540a;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f27542c.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f27542c;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f27541b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite.Builder) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.f27544e;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.f27543d;
    }
}

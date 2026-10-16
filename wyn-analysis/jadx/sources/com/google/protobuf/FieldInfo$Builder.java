package com.google.protobuf;

import com.google.protobuf.Internal;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private AbstractC1837t1 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    public /* synthetic */ FieldInfo$Builder(AbstractC1833s0 abstractC1833s0) {
        this();
    }

    public C1836t0 build() {
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            java.lang.reflect.Field field = this.field;
            int i5 = this.fieldNumber;
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            Internal.checkNotNull(obj, "mapDefaultEntry");
            C1836t0.a(i5);
            Internal.checkNotNull(field, "field");
            return new C1836t0(field, i5, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
        }
        java.lang.reflect.Field field2 = this.presenceField;
        if (field2 != null) {
            if (this.required) {
                java.lang.reflect.Field field3 = this.field;
                int i10 = this.fieldNumber;
                FieldType fieldType = this.type;
                int i11 = this.presenceMask;
                boolean z2 = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                C1836t0.a(i10);
                Internal.checkNotNull(field3, "field");
                Internal.checkNotNull(fieldType, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i11 == 0 || ((i11 - 1) & i11) != 0) {
                    throw new IllegalArgumentException(AbstractC3256n.g(i11, "presenceMask must have exactly one bit set: "));
                }
                return new C1836t0(field3, i10, fieldType, field2, i11, true, z2, null, enumVerifier2, null);
            }
            java.lang.reflect.Field field4 = this.field;
            int i12 = this.fieldNumber;
            FieldType fieldType2 = this.type;
            int i13 = this.presenceMask;
            boolean z10 = this.enforceUtf8;
            Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
            C1836t0.a(i12);
            Internal.checkNotNull(field4, "field");
            Internal.checkNotNull(fieldType2, "fieldType");
            Internal.checkNotNull(field2, "presenceField");
            if (i13 == 0 || ((i13 - 1) & i13) != 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i13, "presenceMask must have exactly one bit set: "));
            }
            return new C1836t0(field4, i12, fieldType2, field2, i13, false, z10, null, enumVerifier3, null);
        }
        Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
        if (enumVerifier4 != null) {
            java.lang.reflect.Field field5 = this.cachedSizeField;
            if (field5 == null) {
                java.lang.reflect.Field field6 = this.field;
                int i14 = this.fieldNumber;
                FieldType fieldType3 = this.type;
                C1836t0.a(i14);
                Internal.checkNotNull(field6, "field");
                return new C1836t0(field6, i14, fieldType3, null, 0, false, false, null, enumVerifier4, null);
            }
            java.lang.reflect.Field field7 = this.field;
            int i15 = this.fieldNumber;
            FieldType fieldType4 = this.type;
            C1836t0.a(i15);
            Internal.checkNotNull(field7, "field");
            return new C1836t0(field7, i15, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
        }
        java.lang.reflect.Field field8 = this.cachedSizeField;
        if (field8 != null) {
            java.lang.reflect.Field field9 = this.field;
            int i16 = this.fieldNumber;
            FieldType fieldType5 = this.type;
            C1836t0.a(i16);
            Internal.checkNotNull(field9, "field");
            Internal.checkNotNull(fieldType5, "fieldType");
            if (fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new C1836t0(field9, i16, fieldType5, null, 0, false, false, null, null, field8);
        }
        java.lang.reflect.Field field10 = this.field;
        int i17 = this.fieldNumber;
        FieldType fieldType6 = this.type;
        boolean z11 = this.enforceUtf8;
        C1836t0.a(i17);
        Internal.checkNotNull(field10, "field");
        Internal.checkNotNull(fieldType6, "fieldType");
        if (fieldType6 == FieldType.MESSAGE_LIST || fieldType6 == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C1836t0(field10, i17, fieldType6, null, 0, false, z11, null, null, null);
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z2) {
        this.enforceUtf8 = z2;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i5) {
        this.fieldNumber = i5;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(AbstractC1837t1 abstractC1837t1, Class<?> cls) {
        if (this.field != null || this.presenceField != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.oneofStoredType = cls;
        return this;
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i5) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i5;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z2) {
        this.required = z2;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }

    private FieldInfo$Builder() {
    }
}

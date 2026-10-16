package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class A {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27511a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        f27511a = iArr;
        try {
            iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27511a[WireFormat.FieldType.BYTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27511a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f27511a[WireFormat.FieldType.ENUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f27511a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f27511a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f27511a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f27511a[WireFormat.FieldType.INT32.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f27511a[WireFormat.FieldType.INT64.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f27511a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f27511a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f27511a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f27511a[WireFormat.FieldType.SINT32.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f27511a[WireFormat.FieldType.SINT64.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f27511a[WireFormat.FieldType.STRING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f27511a[WireFormat.FieldType.UINT32.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f27511a[WireFormat.FieldType.UINT64.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}

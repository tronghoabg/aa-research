package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* renamed from: com.google.protobuf.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1787c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27654a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        f27654a = iArr;
        try {
            iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27654a[WireFormat.FieldType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27654a[WireFormat.FieldType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

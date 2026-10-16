package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27529a;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        f27529a = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27529a[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

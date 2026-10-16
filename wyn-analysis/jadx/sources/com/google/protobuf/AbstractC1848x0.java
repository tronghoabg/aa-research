package com.google.protobuf;

/* renamed from: com.google.protobuf.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1848x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27787a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f27788b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f27788b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27788b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27788b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC1851y0.values().length];
        f27787a = iArr2;
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f27787a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f27787a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

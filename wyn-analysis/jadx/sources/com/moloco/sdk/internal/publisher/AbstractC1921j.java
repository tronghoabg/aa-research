package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.Initialization;

/* renamed from: com.moloco.sdk.internal.publisher.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC1921j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29044a;

    static {
        int[] iArr = new int[Initialization.values().length];
        try {
            iArr[Initialization.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Initialization.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f29044a = iArr;
    }
}

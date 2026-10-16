package com.google.firebase.perf.e;

import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f10401a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f10401a = iArr;
        try {
            iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10401a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10401a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

package com.arthenica.ffmpegkit;

import gc.b;

/* loaded from: classes.dex */
public class AbiDetect {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24182a = false;

    static {
        b.B("ffmpegkit_abidetect");
    }

    public static native String getNativeAbi();

    public static native String getNativeBuildConf();

    public static native String getNativeCpuAbi();

    public static native boolean isNativeLTSBuild();
}

package com.waze.reports_v2.c;

import androidx.exifinterface.media.ExifInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static final cb f34317a;

    /* renamed from: b, reason: collision with root package name */
    public static final cb f34318b;

    /* renamed from: c, reason: collision with root package name */
    public static final cb f34319c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cb[] f34320d;

    static {
        cb cbVar = new cb(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 0);
        f34317a = cbVar;
        cb cbVar2 = new cb("B", 1);
        f34318b = cbVar2;
        cb cbVar3 = new cb("C", 2);
        f34319c = cbVar3;
        cb[] cbVarArr = {cbVar, cbVar2, cbVar3};
        f34320d = cbVarArr;
        h.d.b.a(cbVarArr);
    }

    public static cb[] values() {
        return (cb[]) f34320d.clone();
    }
}

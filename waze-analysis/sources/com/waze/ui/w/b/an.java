package com.waze.ui.w.b;

import androidx.exifinterface.media.ExifInterface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public static final an f43590a;

    /* renamed from: b, reason: collision with root package name */
    public static final an f43591b;

    /* renamed from: c, reason: collision with root package name */
    public static final an f43592c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ an[] f43593d;

    static {
        an anVar = new an(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 0);
        f43590a = anVar;
        an anVar2 = new an("B", 1);
        f43591b = anVar2;
        an anVar3 = new an("C", 2);
        f43592c = anVar3;
        an[] anVarArr = {anVar, anVar2, anVar3};
        f43593d = anVarArr;
        h.d.b.a(anVarArr);
    }

    public static an[] values() {
        return (an[]) f43593d.clone();
    }
}

package com.waze.sharedui.models;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39060a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f39061b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f39062c;

    static {
        a aVar = new a("NORMAL", 0);
        f39060a = aVar;
        a aVar2 = new a("FROM_FULL_ADDRESS", 1);
        f39061b = aVar2;
        f39062c = new a[]{aVar, aVar2};
    }

    public static a[] values() {
        return (a[]) f39062c.clone();
    }
}

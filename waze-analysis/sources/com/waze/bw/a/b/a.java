package com.waze.bw.a.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17566a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f17567b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f17568c;

    static {
        a aVar = new a("HOME", 0);
        f17566a = aVar;
        a aVar2 = new a("WORK", 1);
        f17567b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f17568c = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f17568c.clone();
    }
}

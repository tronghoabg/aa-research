package com.waze.design_components.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23377a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f23378b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f23379c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f23380d;

    static {
        b bVar = new b("FIRST_BUTTON", 0);
        f23377a = bVar;
        b bVar2 = new b("SECOND_BUTTON", 1);
        f23378b = bVar2;
        b bVar3 = new b("EXTERNAL_TOUCH", 2);
        f23379c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f23380d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f23380d.clone();
    }
}

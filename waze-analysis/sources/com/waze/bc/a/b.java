package com.waze.bc.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16196a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f16197b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f16198c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f16199d;

    static {
        b bVar = new b("Open", 0);
        f16196a = bVar;
        b bVar2 = new b("Closing", 1);
        f16197b = bVar2;
        b bVar3 = new b("Closed", 2);
        f16198c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f16199d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f16199d.clone();
    }
}

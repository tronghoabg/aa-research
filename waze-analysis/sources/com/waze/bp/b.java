package com.waze.bp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17193a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f17194b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f17195c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17196d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f17197e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f17198f;

    static {
        b bVar = new b("ADD_STOP", 0);
        f17193a = bVar;
        b bVar2 = new b("ADD_STOP_TIMEOUT", 1);
        f17194b = bVar2;
        b bVar3 = new b("CANCEL", 2);
        f17195c = bVar3;
        b bVar4 = new b("NEW_DRIVE", 3);
        f17196d = bVar4;
        b bVar5 = new b("NEW_DRIVE_TIMEOUT", 4);
        f17197e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f17198f = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f17198f.clone();
    }
}

package com.waze.parking;

import l.a.aoy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f32946a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f32947b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f32948c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f32949d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f32950e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f32951f;

    /* renamed from: g, reason: collision with root package name */
    private final aoy f32952g;

    static {
        b bVar = new b("UNSPECIFIED", 0, aoy.ACTION_UNSPECIFIED);
        f32946a = bVar;
        b bVar2 = new b("CLOSE", 1, aoy.CLOSE);
        f32947b = bVar2;
        b bVar3 = new b("EDIT", 2, aoy.EDIT);
        f32948c = bVar3;
        b bVar4 = new b("PREVIEW", 3, aoy.PREVIEW);
        f32949d = bVar4;
        b bVar5 = new b("REMOVE", 4, aoy.REMOVE);
        f32950e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f32951f = bVarArr;
        h.d.b.a(bVarArr);
    }

    private b(String str, int i2, aoy aoyVar) {
        this.f32952g = aoyVar;
    }

    public static b[] values() {
        return (b[]) f32951f.clone();
    }

    public final aoy a() {
        return this.f32952g;
    }
}

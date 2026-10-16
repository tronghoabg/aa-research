package com.waze.google_assistant;

import l.a.zx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f24155a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f24156b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f24157c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f24158d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f24159e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f24160f;

    /* renamed from: g, reason: collision with root package name */
    private final zx f24161g;

    static {
        d dVar = new d("HOME", 0, zx.HOME);
        f24155a = dVar;
        d dVar2 = new d("LOCATION", 1, zx.LOCATION);
        f24156b = dVar2;
        d dVar3 = new d("OFF", 2, zx.OFF);
        f24157c = dVar3;
        d dVar4 = new d("ON", 3, zx.ON);
        f24158d = dVar4;
        d dVar5 = new d("WORK", 4, zx.WORK);
        f24159e = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f24160f = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, zx zxVar) {
        this.f24161g = zxVar;
    }

    public static d[] values() {
        return (d[]) f24160f.clone();
    }

    public final zx a() {
        return this.f24161g;
    }
}

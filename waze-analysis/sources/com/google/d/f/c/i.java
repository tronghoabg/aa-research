package com.google.d.f.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7810a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f7811b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f7812c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f7813d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f7814e;

    static {
        i iVar = new i("BOOLEAN", 0);
        f7810a = iVar;
        i iVar2 = new i("STRING", 1);
        f7811b = iVar2;
        i iVar3 = new i("LONG", 2);
        f7812c = iVar3;
        i iVar4 = new i("DOUBLE", 3);
        f7813d = iVar4;
        f7814e = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    static /* bridge */ /* synthetic */ i a(Object obj) {
        if (obj instanceof String) {
            return f7811b;
        }
        if (obj instanceof Boolean) {
            return f7810a;
        }
        if (obj instanceof Long) {
            return f7812c;
        }
        if (obj instanceof Double) {
            return f7813d;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public static i[] values() {
        return (i[]) f7814e.clone();
    }
}

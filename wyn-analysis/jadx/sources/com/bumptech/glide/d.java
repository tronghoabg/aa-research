package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f24227a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f24228b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f24229c;

    /* JADX INFO: Fake field, exist only in values array */
    d EF4;

    static {
        d dVar = new d("IMMEDIATE", 0);
        d dVar2 = new d("HIGH", 1);
        d dVar3 = new d("NORMAL", 2);
        f24227a = dVar3;
        d dVar4 = new d("LOW", 3);
        f24228b = dVar4;
        f24229c = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f24229c.clone();
    }
}

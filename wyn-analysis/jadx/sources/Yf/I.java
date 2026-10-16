package Yf;

import mf.C3560b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final I f16834c;

    /* renamed from: d, reason: collision with root package name */
    public static final I f16835d;

    /* renamed from: e, reason: collision with root package name */
    public static final I f16836e;

    /* renamed from: f, reason: collision with root package name */
    public static final I f16837f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ I[] f16838g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C3560b f16839h;

    /* renamed from: a, reason: collision with root package name */
    public final char f16840a;

    /* renamed from: b, reason: collision with root package name */
    public final char f16841b;

    static {
        I i5 = new I("OBJ", 0, '{', '}');
        f16834c = i5;
        I i10 = new I("LIST", 1, '[', ']');
        f16835d = i10;
        I i11 = new I("MAP", 2, '{', '}');
        f16836e = i11;
        I i12 = new I("POLY_OBJ", 3, '[', ']');
        f16837f = i12;
        I[] iArr = {i5, i10, i11, i12};
        f16838g = iArr;
        f16839h = ic.d.t(iArr);
    }

    public I(String str, int i5, char c10, char c11) {
        this.f16840a = c10;
        this.f16841b = c11;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f16838g.clone();
    }
}

package com.waze.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23861a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f23862b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ f[] f23863c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23864d;

    static {
        f fVar = new f("UID", 0, "uid");
        f23861a = fVar;
        f fVar2 = new f("OTHER", 1, "general");
        f23862b = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f23863c = fVarArr;
        h.d.b.a(fVarArr);
    }

    private f(String str, int i2, String str2) {
        this.f23864d = str2;
    }

    public static f[] values() {
        return (f[]) f23863c.clone();
    }

    public final String a() {
        return this.f23864d;
    }
}

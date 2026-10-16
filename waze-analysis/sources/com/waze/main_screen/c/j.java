package com.waze.main_screen.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f26251a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f26252b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ j[] f26253c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f26254d;

    /* renamed from: e, reason: collision with root package name */
    private final long f26255e;

    static {
        j jVar = new j("CENTER_RIGHT", 0, 0L);
        f26251a = jVar;
        j jVar2 = new j("TOP_RIGHT", 1, 1L);
        f26252b = jVar2;
        j[] jVarArr = {jVar, jVar2};
        f26253c = jVarArr;
        f26254d = h.d.b.a(jVarArr);
    }

    private j(String str, int i2, long j2) {
        this.f26255e = j2;
    }

    public static h.d.a b() {
        return f26254d;
    }

    public static j[] values() {
        return (j[]) f26253c.clone();
    }
}

package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ce {

    /* renamed from: a, reason: collision with root package name */
    public static final ce f22153a;

    /* renamed from: b, reason: collision with root package name */
    public static final ce f22154b;

    /* renamed from: c, reason: collision with root package name */
    public static final ce f22155c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ce[] f22156d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f22157e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22158f;

    static {
        ce ceVar = new ce("Never", 0, "OFF");
        f22153a = ceVar;
        ce ceVar2 = new ce("Always", 1, "EVERY_COLD_START");
        f22154b = ceVar2;
        ce ceVar3 = new ce("OncePerDay", 2, "DAILY");
        f22155c = ceVar3;
        ce[] ceVarArr = {ceVar, ceVar2, ceVar3};
        f22156d = ceVarArr;
        f22157e = h.d.b.a(ceVarArr);
    }

    private ce(String str, int i2, String str2) {
        this.f22158f = str2;
    }

    public static h.d.a b() {
        return f22157e;
    }

    public static ce[] values() {
        return (ce[]) f22156d.clone();
    }

    public final String a() {
        return this.f22158f;
    }
}

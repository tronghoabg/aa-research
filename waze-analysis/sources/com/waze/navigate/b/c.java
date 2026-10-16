package com.waze.navigate.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31040a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f31041b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f31042c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f31043d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f31044e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f31045f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f31046g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31047h;

    static {
        c cVar = new c("OK", 0, "OK");
        f31040a = cVar;
        c cVar2 = new c("Back", 1, "BACK");
        f31041b = cVar2;
        c cVar3 = new c("Cancel", 2, "CANCEL");
        f31042c = cVar3;
        c cVar4 = new c("Primary", 3, "PRIMARY");
        f31043d = cVar4;
        c cVar5 = new c("Secondary", 4, "SECONDARY");
        f31044e = cVar5;
        c cVar6 = new c("DriveAnyway", 5, "DRIVE_ANYWAY");
        f31045f = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        f31046g = cVarArr;
        h.d.b.a(cVarArr);
    }

    private c(String str, int i2, String str2) {
        this.f31047h = str2;
    }

    public static c[] values() {
        return (c[]) f31046g.clone();
    }

    public final String a() {
        return this.f31047h;
    }
}

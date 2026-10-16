package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public static final de f30053a;

    /* renamed from: b, reason: collision with root package name */
    public static final de f30054b;

    /* renamed from: c, reason: collision with root package name */
    public static final de f30055c;

    /* renamed from: d, reason: collision with root package name */
    public static final de f30056d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ de[] f30057e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30058f;

    static {
        de deVar = new de("Unknown", 0, "UNKNOWN");
        f30053a = deVar;
        de deVar2 = new de("Private", 1, "PRIVATE");
        f30054b = deVar2;
        de deVar3 = new de("Taxi", 2, "TAXI");
        f30055c = deVar3;
        de deVar4 = new de("Motorcycle", 3, "MOTORCYCLE");
        f30056d = deVar4;
        de[] deVarArr = {deVar, deVar2, deVar3, deVar4};
        f30057e = deVarArr;
        h.d.b.a(deVarArr);
    }

    private de(String str, int i2, String str2) {
        this.f30058f = str2;
    }

    public static de[] values() {
        return (de[]) f30057e.clone();
    }

    public final String a() {
        return this.f30058f;
    }
}

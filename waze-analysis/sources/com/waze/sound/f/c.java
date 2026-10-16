package com.waze.sound.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f39981a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f39982b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f39983c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f39984d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f39985e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f39986f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ c[] f39987g;

    static {
        c cVar = new c("SUCCESS", 0);
        f39981a = cVar;
        c cVar2 = new c("NETWORK_ERROR", 1);
        f39982b = cVar2;
        c cVar3 = new c("NO_MATCH_ERROR", 2);
        f39983c = cVar3;
        c cVar4 = new c("NO_PERMISSIONS", 3);
        f39984d = cVar4;
        c cVar5 = new c("SPEECH_TIMEOUT_ERROR", 4);
        f39985e = cVar5;
        c cVar6 = new c("UNSPECIFIED_ERROR", 5);
        f39986f = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        f39987g = cVarArr;
        h.d.b.a(cVarArr);
    }

    public static c[] values() {
        return (c[]) f39987g.clone();
    }
}

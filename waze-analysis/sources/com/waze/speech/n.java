package com.waze.speech;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f40462a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f40463b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f40464c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f40465d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f40466e;

    static {
        n nVar = new n("UNKNOWN", 0);
        f40462a = nVar;
        n nVar2 = new n("NO_PERMISSION", 1);
        f40463b = nVar2;
        n nVar3 = new n("SPEECH_TIMEOUT", 2);
        f40464c = nVar3;
        n nVar4 = new n("NO_MATCH", 3);
        f40465d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f40466e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f40466e.clone();
    }
}

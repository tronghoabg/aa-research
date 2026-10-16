package com.google.firebase.sessions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements com.google.firebase.d.b.f {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10967a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f10968b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ l[] f10969c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10970d;

    static {
        l lVar = new l("EVENT_TYPE_UNKNOWN", 0, 0);
        f10967a = lVar;
        l lVar2 = new l("SESSION_START", 1, 1);
        f10968b = lVar2;
        l[] lVarArr = {lVar, lVar2};
        f10969c = lVarArr;
        h.d.b.a(lVarArr);
    }

    private l(String str, int i2, int i3) {
        this.f10970d = i3;
    }

    public static l[] values() {
        return (l[]) f10969c.clone();
    }

    @Override // com.google.firebase.d.b.f
    public final int a() {
        return this.f10970d;
    }
}

package org.a.d.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f56382a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f56383b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f56384c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f56385d;

    static {
        c cVar = new c("Singleton", 0);
        f56382a = cVar;
        c cVar2 = new c("Factory", 1);
        f56383b = cVar2;
        c cVar3 = new c("Scoped", 2);
        f56384c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f56385d = cVarArr;
        h.d.b.a(cVarArr);
    }

    public static c[] values() {
        return (c[]) f56385d.clone();
    }
}

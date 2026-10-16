package com.waze.reports_v2.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f34557a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f34558b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f34559c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f34560d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f34561e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f34562f;

    static {
        c cVar = new c("TYPE_UNSPECIFIED", 0);
        f34557a = cVar;
        c cVar2 = new c("NORMAL", 1);
        f34558b = cVar2;
        c cVar3 = new c("QUICK_HAZARD", 2);
        f34559c = cVar3;
        c cVar4 = new c("QUICK_JAM", 3);
        f34560d = cVar4;
        c cVar5 = new c("QUICK_POLICE", 4);
        f34561e = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f34562f = cVarArr;
        h.d.b.a(cVarArr);
    }

    public static c[] values() {
        return (c[]) f34562f.clone();
    }
}

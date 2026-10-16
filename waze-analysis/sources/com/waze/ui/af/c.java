package com.waze.ui.af;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f41880a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f41881b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f41882c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f41883d;

    static {
        c cVar = new c("IDLE", 0);
        f41880a = cVar;
        c cVar2 = new c("DOWNLOADING", 1);
        f41881b = cVar2;
        c cVar3 = new c("NOT_DOWNLOADED", 2);
        f41882c = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f41883d = cVarArr;
        h.d.b.a(cVarArr);
    }

    public static c[] values() {
        return (c[]) f41883d.clone();
    }
}

package com.waze.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f40492a;

    /* renamed from: b, reason: collision with root package name */
    public static final aa f40493b;

    /* renamed from: c, reason: collision with root package name */
    public static final aa f40494c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ aa[] f40495d;

    static {
        aa aaVar = new aa("AUTHENTICATED", 0);
        f40492a = aaVar;
        aa aaVar2 = new aa("UNAUTHENTICATED", 1);
        f40493b = aaVar2;
        aa aaVar3 = new aa("AD_EVENT_AUTHENTICATED", 2);
        f40494c = aaVar3;
        aa[] aaVarArr = {aaVar, aaVar2, aaVar3};
        f40495d = aaVarArr;
        h.d.b.a(aaVarArr);
    }

    public static aa[] values() {
        return (aa[]) f40495d.clone();
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f32379a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f32380b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f32381c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f32382d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f32383e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f32384f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l[] f32385g;

    static {
        l lVar = new l("VAST", 0);
        f32379a = lVar;
        l lVar2 = new l("MRAID", 1);
        f32380b = lVar2;
        l lVar3 = new l("STATIC", 2);
        f32381c = lVar3;
        l lVar4 = new l("TEMPLATE_VAST", 3);
        f32382d = lVar4;
        l lVar5 = new l("TEMPLATE_MRAID", 4);
        f32383e = lVar5;
        l lVar6 = new l("TEMPLATE_STATIC", 5);
        f32384f = lVar6;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, new l("UNKNOWN", 6)};
        f32385g = lVarArr;
        ic.d.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f32385g.clone();
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final l f30171a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f30172b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f30173c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f30174d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f30175e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f30176f;

    static {
        l lVar = new l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);
        f30171a = lVar;
        l lVar2 = new l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);
        f30172b = lVar2;
        l lVar3 = new l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);
        f30173c = lVar3;
        l lVar4 = new l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);
        f30174d = lVar4;
        l lVar5 = new l("VAST_AD_COMPOSE_VIEW_NOT_AVAILABLE", 4);
        f30175e = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        f30176f = lVarArr;
        ic.d.t(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f30176f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}

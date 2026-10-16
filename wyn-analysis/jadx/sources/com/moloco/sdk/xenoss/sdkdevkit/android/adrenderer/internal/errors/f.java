package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30116a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f30117b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f30118c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f30119d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f30120e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f30121f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f30122g;

    static {
        f fVar = new f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);
        f30116a = fVar;
        f fVar2 = new f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);
        f30117b = fVar2;
        f fVar3 = new f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);
        f30118c = fVar3;
        f fVar4 = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);
        f30119d = fVar4;
        f fVar5 = new f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);
        f30120e = fVar5;
        f fVar6 = new f("NATIVE_AD_COMPOSE_VIEW_NOT_AVAILABLE_ERROR", 5);
        f30121f = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        f30122g = fVarArr;
        ic.d.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f30122g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}

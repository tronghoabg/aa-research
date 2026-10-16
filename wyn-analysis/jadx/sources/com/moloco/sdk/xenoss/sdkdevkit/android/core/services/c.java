package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32405a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f32406b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f32407c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f32408d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f32409e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f32410f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f32411g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f32412h;

    static {
        c cVar = new c("NONE", 0);
        c cVar2 = new c("CLOSE", 1);
        f32405a = cVar2;
        c cVar3 = new c("SKIP", 2);
        f32406b = cVar3;
        c cVar4 = new c("SKIP_DEC", 3);
        f32407c = cVar4;
        c cVar5 = new c("MUTE", 4);
        f32408d = cVar5;
        c cVar6 = new c("UNMUTE", 5);
        f32409e = cVar6;
        c cVar7 = new c("CTA", 6);
        f32410f = cVar7;
        c cVar8 = new c("REPLAY", 7);
        c cVar9 = new c("AD_BADGE", 8);
        f32411g = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        f32412h = cVarArr;
        ic.d.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32412h.clone();
    }
}

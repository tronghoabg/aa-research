package com.moloco.sdk.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final o f28667a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f28668b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f28669c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f28670d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f28671e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f28672f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o[] f28673g;

    static {
        o oVar = new o("AD_LOAD_LIMIT_REACHED", 0);
        o oVar2 = new o("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);
        f28667a = oVar2;
        o oVar3 = new o("BID_LOAD_ERROR_PARSE_INVALID_JSON", 2);
        f28668b = oVar3;
        o oVar4 = new o("BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD", 3);
        f28669c = oVar4;
        o oVar5 = new o("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 4);
        f28670d = oVar5;
        o oVar6 = new o("AD_SHOW_ERROR_NOT_LOADED", 5);
        f28671e = oVar6;
        o oVar7 = new o("AD_SHOW_ERROR_ALREADY_DISPLAYING", 6);
        f28672f = oVar7;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        f28673g = oVarArr;
        ic.d.t(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f28673g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}

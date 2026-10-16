package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f30455a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f30456b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f30457c;

    static {
        u uVar = new u("SkipOrClose", 0);
        f30455a = uVar;
        u uVar2 = new u("ClickThrough", 1);
        f30456b = uVar2;
        u[] uVarArr = {uVar, uVar2};
        f30457c = uVarArr;
        ic.d.t(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f30457c.clone();
    }
}

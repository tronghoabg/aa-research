package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f31492a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f31493b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f31494c;

    static {
        n nVar = new n("Image", 0);
        f31492a = nVar;
        n nVar2 = new n("JS", 1);
        f31493b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f31494c = nVarArr;
        ic.d.t(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f31494c.clone();
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import a9.C1342b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1342b f30691b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f30692c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f30693d;

    /* renamed from: a, reason: collision with root package name */
    public final String f30694a;

    static {
        j jVar = new j("VIDEO", 0, "videoContainer");
        j jVar2 = new j("MRAID", 1, "mraidContainer");
        f30692c = jVar2;
        j[] jVarArr = {jVar, jVar2, new j("STATIC", 2, "staticContainer")};
        f30693d = jVarArr;
        ic.d.t(jVarArr);
        f30691b = new C1342b();
    }

    public j(String str, int i5, String str2) {
        this.f30694a = str2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f30693d.clone();
    }
}

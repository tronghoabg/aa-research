package com.waze.sound.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f39994a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f39995b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f39996c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f39997d;

    static {
        h hVar = new h("SUCCESS", 0);
        f39994a = hVar;
        h hVar2 = new h("VOICE_SERVER_ERROR", 1);
        f39995b = hVar2;
        h hVar3 = new h("DOWNLOAD_ERROR", 2);
        f39996c = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f39997d = hVarArr;
        h.d.b.a(hVarArr);
    }

    public static h[] values() {
        return (h[]) f39997d.clone();
    }
}

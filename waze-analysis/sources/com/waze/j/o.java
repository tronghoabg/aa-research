package com.waze.j;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f24920a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f24921b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f24922c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f24923d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24924e;

    static {
        o oVar = new o("CLIENT", 0, "c");
        f24920a = oVar;
        o oVar2 = new o("AERIAL", 1, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        f24921b = oVar2;
        o oVar3 = new o("HUBCAPS", 2, CmcdData.STREAMING_FORMAT_HLS);
        f24922c = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f24923d = oVarArr;
        h.d.b.a(oVarArr);
    }

    private o(String str, int i2, String str2) {
        this.f24924e = str2;
    }

    public static o[] values() {
        return (o[]) f24923d.clone();
    }

    public final String a() {
        return this.f24924e;
    }
}

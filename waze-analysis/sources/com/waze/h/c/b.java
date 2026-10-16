package com.waze.h.c;

import androidx.media3.common.MimeTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f24340a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f24341b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f24342c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f24343d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24344e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f24345f;

    static {
        b bVar = new b("RAW_PCM_16", 0, MimeTypes.AUDIO_RAW, 2);
        f24340a = bVar;
        b bVar2 = new b("WAV_PCM_16", 1, MimeTypes.AUDIO_WAV, 2);
        f24341b = bVar2;
        b bVar3 = new b("OGG_OPUS", 2, MimeTypes.AUDIO_OPUS, null);
        f24342c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f24343d = bVarArr;
        h.d.b.a(bVarArr);
    }

    private b(String str, int i2, String str2, Integer num) {
        this.f24344e = str2;
        this.f24345f = num;
    }

    public static b[] values() {
        return (b[]) f24343d.clone();
    }

    public final Integer a() {
        return this.f24345f;
    }

    public final String b() {
        return this.f24344e;
    }
}

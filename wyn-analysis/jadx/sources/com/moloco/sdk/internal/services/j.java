package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f29703a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f29704b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f29705c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f29706d;

    static {
        j jVar = new j("UNKNOWN", 0);
        f29703a = jVar;
        j jVar2 = new j("PORTRAIT", 1);
        f29704b = jVar2;
        j jVar3 = new j("LANDSCAPE", 2);
        f29705c = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        f29706d = jVarArr;
        ic.d.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f29706d.clone();
    }
}

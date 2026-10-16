package com.waze;

import androidx.webkit.Profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mu {

    /* renamed from: a, reason: collision with root package name */
    public static final mu f30520a;

    /* renamed from: b, reason: collision with root package name */
    public static final mu f30521b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ mu[] f30522c;

    static {
        mu muVar = new mu(Profile.DEFAULT_PROFILE_NAME, 0);
        f30520a = muVar;
        mu muVar2 = new mu("SuggestionsSheet", 1);
        f30521b = muVar2;
        mu[] muVarArr = {muVar, muVar2};
        f30522c = muVarArr;
        h.d.b.a(muVarArr);
    }

    public static mu[] values() {
        return (mu[]) f30522c.clone();
    }
}

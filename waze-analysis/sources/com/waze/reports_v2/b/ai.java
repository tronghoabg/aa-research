package com.waze.reports_v2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final ai f34052a;

    /* renamed from: b, reason: collision with root package name */
    public static final ai f34053b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ai[] f34054c;

    static {
        ai aiVar = new ai("DEFAULT", 0);
        f34052a = aiVar;
        ai aiVar2 = new ai("VOICE_CONVERSATION", 1);
        f34053b = aiVar2;
        ai[] aiVarArr = {aiVar, aiVar2};
        f34054c = aiVarArr;
        h.d.b.a(aiVarArr);
    }

    public static ai[] values() {
        return (ai[]) f34054c.clone();
    }
}

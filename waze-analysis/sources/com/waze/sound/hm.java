package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    public static final hm f40163a;

    /* renamed from: b, reason: collision with root package name */
    public static final hm f40164b;

    /* renamed from: c, reason: collision with root package name */
    public static final hm f40165c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ hm[] f40166d;

    static {
        hm hmVar = new hm("GOOGLE_ASSISTANT_MIC_OPENED", 0);
        f40163a = hmVar;
        hm hmVar2 = new hm("OPEN_USER_AGREEMENT", 1);
        f40164b = hmVar2;
        hm hmVar3 = new hm("OPEN_SPEECH_RECOGNITION_SCREEN", 2);
        f40165c = hmVar3;
        hm[] hmVarArr = {hmVar, hmVar2, hmVar3};
        f40166d = hmVarArr;
        h.d.b.a(hmVarArr);
    }

    public static hm[] values() {
        return (hm[]) f40166d.clone();
    }
}

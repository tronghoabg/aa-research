package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ij {

    /* renamed from: a, reason: collision with root package name */
    public static final ij f40237a;

    /* renamed from: b, reason: collision with root package name */
    public static final ij f40238b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ij[] f40239c;

    static {
        ij ijVar = new ij("INITIAL_ANNOUNCEMENT", 0);
        f40237a = ijVar;
        ij ijVar2 = new ij("REROUTE_SUGGESTION", 1);
        f40238b = ijVar2;
        ij[] ijVarArr = {ijVar, ijVar2};
        f40239c = ijVarArr;
        h.d.b.a(ijVarArr);
    }

    public static ij[] values() {
        return (ij[]) f40239c.clone();
    }
}

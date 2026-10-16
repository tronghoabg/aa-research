package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fo {

    /* renamed from: a, reason: collision with root package name */
    public static final fo f40028a;

    /* renamed from: b, reason: collision with root package name */
    public static final fo f40029b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ fo[] f40030c;

    static {
        fo foVar = new fo("CAN_PLAY", 0);
        f40028a = foVar;
        fo foVar2 = new fo("PLAYING", 1);
        f40029b = foVar2;
        fo[] foVarArr = {foVar, foVar2};
        f40030c = foVarArr;
        h.d.b.a(foVarArr);
    }

    public static fo[] values() {
        return (fo[]) f40030c.clone();
    }
}

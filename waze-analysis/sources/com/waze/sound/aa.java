package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f39398a;

    /* renamed from: b, reason: collision with root package name */
    public static final aa f39399b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ aa[] f39400c;

    static {
        aa aaVar = new aa("MOBILE", 0);
        f39398a = aaVar;
        aa aaVar2 = new aa("IN_CAR", 1);
        f39399b = aaVar2;
        aa[] aaVarArr = {aaVar, aaVar2};
        f39400c = aaVarArr;
        h.d.b.a(aaVarArr);
    }

    public static aa[] values() {
        return (aa[]) f39400c.clone();
    }
}

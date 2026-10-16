package com.waze.main_screen.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f27654a;

    /* renamed from: b, reason: collision with root package name */
    public static final aa f27655b;

    /* renamed from: c, reason: collision with root package name */
    public static final aa f27656c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ aa[] f27657d;

    static {
        aa aaVar = new aa("ROAMING_TIMEOUT", 0);
        f27654a = aaVar;
        aa aaVar2 = new aa("NAVIGATION_START", 1);
        f27655b = aaVar2;
        aa aaVar3 = new aa("USER_DISMISSED", 2);
        f27656c = aaVar3;
        aa[] aaVarArr = {aaVar, aaVar2, aaVar3};
        f27657d = aaVarArr;
        h.d.b.a(aaVarArr);
    }

    public static aa[] values() {
        return (aa[]) f27657d.clone();
    }
}

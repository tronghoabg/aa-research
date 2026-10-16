package com.waze.ab.a;

import com.waze.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements com.waze.menus.a.a.g {

    /* renamed from: a, reason: collision with root package name */
    public static final o f13732a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f13733b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o[] f13734c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.ac.n f13735d;

    static {
        o oVar = new o("TakePhoto", 0, new com.waze.ui.ac.j(R.string.TAKE_A_PICTURE));
        f13732a = oVar;
        o oVar2 = new o("ChooseExistingPicture", 1, new com.waze.ui.ac.j(R.string.CHOOSE_EXISTING_PICTURE));
        f13733b = oVar2;
        o[] oVarArr = {oVar, oVar2};
        f13734c = oVarArr;
        h.d.b.a(oVarArr);
    }

    /* synthetic */ o(String str, int i2, com.waze.ui.ac.n nVar) {
        this.f13735d = nVar;
    }

    public static o[] values() {
        return (o[]) f13734c.clone();
    }

    @Override // com.waze.menus.a.a.g
    public final com.waze.ui.ac.f a() {
        return null;
    }

    @Override // com.waze.menus.a.a.g
    public final com.waze.ui.ac.n b() {
        return this.f13735d;
    }

    @Override // com.waze.menus.a.a.g
    public final void c() {
    }
}

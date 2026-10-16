package com.waze.menus;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class i extends k {

    /* renamed from: a, reason: collision with root package name */
    private final j f29725a;

    public i() {
        this(com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_ALLOW_CONTACTS_LINE1, new Object[0]), com.waze.shared_infra.o.b.a().c(R.string.MAIN_MENU_ALLOW_CONTACTS_LINE2, new Object[0]), com.waze.design_components.b.d.ar.c(com.waze.design_components.b.e.f23312a), j.f29731f);
    }

    public final j b() {
        return this.f29725a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, int i2, j jVar) {
        super(str, str2, i2);
        h.g.b.x.f(jVar, "cellType");
        this.f29725a = jVar;
    }
}

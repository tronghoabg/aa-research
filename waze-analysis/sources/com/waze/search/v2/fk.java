package com.waze.search.v2;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fk extends fo {

    /* renamed from: a, reason: collision with root package name */
    private final String f36531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(com.waze.ui.ac.n nVar, String str, List list) {
        super(nVar, list);
        h.g.b.x.f(nVar, "headerLabel");
        h.g.b.x.f(str, "text");
        h.g.b.x.f(list, "chips");
        this.f36531a = str;
    }

    public final String a() {
        return this.f36531a;
    }
}

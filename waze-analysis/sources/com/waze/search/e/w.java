package com.waze.search.e;

import com.waze.gas.GasNativeManager;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f35659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.waze.ui.ac.n nVar) {
        super(null);
        h.g.b.x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f35659a = nVar;
    }

    @Override // com.waze.search.e.z
    public final String a() {
        com.waze.ui.ac.n nVar = this.f35659a;
        Objects.toString(nVar);
        return "section-".concat(nVar.toString());
    }

    public final com.waze.ui.ac.n b() {
        return this.f35659a;
    }
}

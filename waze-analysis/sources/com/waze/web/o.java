package com.waze.web;

import com.waze.R;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f45512a = new o();

    /* JADX WARN: Illegal instructions before constructor call */
    private o() {
        String strC = com.waze.shared_infra.o.b.a().c(R.string.ND4C_ALGO_TRANSPARENCY_LINK_BROWSER_TITLE, new Object[0]);
        String strB = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_INFO_URL.b();
        x.e(strB, "getValue(...)");
        super(strC, strB);
    }
}

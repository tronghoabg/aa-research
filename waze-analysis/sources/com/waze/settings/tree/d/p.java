package com.waze.settings.tree.d;

import android.view.View;
import com.waze.settings.bk;
import com.waze.settings.de;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.settings.tree.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, int i2, String str2, com.waze.settings.tree.c.h hVar, List list) {
        super(str, bk.f36874d, Integer.valueOf(i2), str2, hVar, list);
        x.f(hVar, "config");
        x.f(list, "options");
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }
}

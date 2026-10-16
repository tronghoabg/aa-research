package com.waze.settings.tree.d;

import android.view.View;
import com.waze.R;
import com.waze.settings.bk;
import com.waze.settings.de;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends com.waze.settings.tree.m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, com.waze.settings.tree.c.h hVar, List list, boolean z) {
        super(str, bk.o, Integer.valueOf(R.string.NOTIFICATIONS), str2, hVar, list);
        x.f(hVar, "config");
        x.f(list, "options");
        this.f37554a = z;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final boolean h() {
        return this.f37554a;
    }
}

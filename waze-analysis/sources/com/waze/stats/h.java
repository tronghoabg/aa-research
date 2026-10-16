package com.waze.stats;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z) {
        super(str);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f40596a = z;
    }

    public final boolean a() {
        return this.f40596a;
    }
}

package com.waze.stats;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f40597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, long j2) {
        super(str);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f40597a = j2;
    }

    public final long a() {
        return this.f40597a;
    }
}

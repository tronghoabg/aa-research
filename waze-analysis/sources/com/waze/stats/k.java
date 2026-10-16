package com.waze.stats;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f40598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2) {
        super(str);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "value");
        this.f40598a = str2;
    }

    public final String a() {
        return this.f40598a;
    }
}

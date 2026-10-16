package com.waze.uid.state_impl.g;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final String f44694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, String str2) {
        super((byte[]) null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        this.f44694a = str;
        this.f44695b = str2;
    }

    public final String a() {
        return this.f44695b;
    }

    public final String b() {
        return this.f44694a;
    }
}

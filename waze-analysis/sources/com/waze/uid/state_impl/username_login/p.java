package com.waze.uid.state_impl.username_login;

import androidx.autofill.HintConstants;
import com.waze.tide.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f44714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super((byte[]) null);
        x.f(str, HintConstants.AUTOFILL_HINT_PASSWORD);
        this.f44714a = str;
    }

    public final String a() {
        return this.f44714a;
    }
}

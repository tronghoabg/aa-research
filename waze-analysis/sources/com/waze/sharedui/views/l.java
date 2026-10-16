package com.waze.sharedui.views;

import android.util.Patterns;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements z {

    /* renamed from: a, reason: collision with root package name */
    private final h.n.l f39252a;

    public l() {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        h.g.b.x.e(pattern, "EMAIL_ADDRESS");
        this.f39252a = new h.n.l(pattern);
    }

    @Override // com.waze.sharedui.views.z
    public final y a(CharSequence charSequence) {
        h.g.b.x.f(charSequence, "text");
        return !this.f39252a.g(charSequence) ? y.f39289c : y.f39288b;
    }
}

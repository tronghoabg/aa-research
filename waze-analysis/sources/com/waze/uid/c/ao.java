package com.waze.uid.c;

import com.waze.sharedui.views.WazeValidatedEditText;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao implements com.waze.sharedui.views.z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f44214a;

    ao(aq aqVar) {
        this.f44214a = aqVar;
    }

    @Override // com.waze.sharedui.views.z
    public final com.waze.sharedui.views.y a(CharSequence charSequence) {
        h.g.b.x.f(charSequence, "text");
        if (!(charSequence.length() == 0 || h.n.o.F(charSequence, "@", false)) || aq.f44218b.g(charSequence)) {
            return com.waze.sharedui.views.y.f39288b;
        }
        WazeValidatedEditText wazeValidatedEditText = this.f44214a.f44219d;
        if (wazeValidatedEditText == null) {
            h.g.b.x.j("emailEditText");
            wazeValidatedEditText = null;
        }
        wazeValidatedEditText.A();
        return com.waze.sharedui.views.y.f39289c;
    }
}

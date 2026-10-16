package com.waze.car_lib.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.b.b.a.u;
import com.waze.search.stats.s;
import com.waze.search.v2.gb;
import com.waze.strings.DisplayStrings;
import com.waze.z;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final s f19258a;

    /* renamed from: b, reason: collision with root package name */
    private final z f19259b;

    public m(s sVar, z zVar) {
        x.f(sVar, "searchStatsSender");
        x.f(zVar, "appType");
        this.f19258a = sVar;
        this.f19259b = zVar;
    }

    public final void a(String str, int i2) {
        x.f(str, TtmlNode.ATTR_ID);
        com.waze.search.d.a.b.i(this.f19258a, com.waze.search.stats.k.f36060c, gb.m(str), true, Long.valueOf(i2), null, null, u.g(this.f19259b), 48);
    }

    public final void b(String str) {
        x.f(str, "searchTerm");
        com.waze.search.stats.c cVar = com.waze.search.stats.c.f36019h;
        long length = o.v(str).toString().length();
        z zVar = this.f19259b;
        this.f19258a.d(cVar, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 2) != 0 ? null : null, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 4) != 0 ? null : null, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 8) != 0 ? null : Long.valueOf(length), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 16) != 0 ? null : null, null, null, null, null, null, null, u.g(zVar));
    }
}

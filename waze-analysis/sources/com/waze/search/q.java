package com.waze.search;

import android.os.Bundle;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.waze.search.h.bz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f35996a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f35997b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(r rVar, bz bzVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35998c = i2;
        this.f35996a = rVar;
        this.f35997b = bzVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.waze.z.a.d.an, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.SoftwareKeyboardController, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f35998c != 0) {
            return new q((com.waze.z.a.d.an) this.f35997b, (SoftwareKeyboardController) this.f35996a, eVar, 1);
        }
        return new q((r) this.f35996a, (bz) this.f35997b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f35998c != 0 ? ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.platform.SoftwareKeyboardController, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        String string;
        ?? r2;
        if (this.f35998c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if ((this.f35997b instanceof com.waze.z.a.d.am) && (r2 = this.f35996a) != 0) {
                r2.hide();
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Bundle arguments = ((android.support.v4.app.ar) this.f35996a).getArguments();
        if (arguments != null && (string = arguments.getString("EXTRA_SEARCH_TERM", null)) != null) {
            Object obj2 = this.f35997b;
            if (string.length() > 0) {
                ((bz) obj2).c(string);
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(com.waze.z.a.d.an anVar, SoftwareKeyboardController softwareKeyboardController, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35998c = i2;
        this.f35997b = anVar;
        this.f35996a = softwareKeyboardController;
    }
}

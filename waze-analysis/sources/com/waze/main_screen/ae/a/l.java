package com.waze.main_screen.ae.a;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.waze.sdk.bk;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f25740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(bk bkVar, h.c.e eVar) {
        super(2, eVar);
        this.f25740a = bkVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f25740a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bk bkVar = this.f25740a;
        x.c(bkVar);
        Drawable drawableB = bkVar.b();
        return bk.e(bkVar, drawableB != null ? DrawableKt.toBitmap$default(drawableB, 0, 0, null, 7, null) : null);
    }
}

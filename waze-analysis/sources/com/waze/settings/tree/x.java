package com.waze.settings.tree;

import android.graphics.BitmapFactory;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f37660a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(String str, h.c.e eVar) {
        super(2, eVar);
        this.f37660a = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new x(this.f37660a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return BitmapFactory.decodeFile(this.f37660a);
    }
}

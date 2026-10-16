package com.waze.map.d;

import android.content.Context;
import com.waze.map.cs;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f28732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f28733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cs f28734c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, Context context, cs csVar, h.c.e eVar) {
        super(2, eVar);
        this.f28732a = fVar;
        this.f28733b = context;
        this.f28734c = csVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f28732a, this.f28733b, this.f28734c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return this.f28732a.c(this.f28733b, this.f28734c);
    }
}

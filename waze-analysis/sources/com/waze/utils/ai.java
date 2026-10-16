package com.waze.utils;

import android.database.Cursor;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44839a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Cursor f44840b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f44841c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ag f44842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(Cursor cursor, ag agVar, CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f44840b = cursor;
        this.f44842d = agVar;
        this.f44841c = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f44840b, this.f44842d, this.f44841c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44839a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f44840b.registerContentObserver(this.f44842d);
        this.f44839a = 1;
        Object objC = this.f44841c.c(this);
        return objC == aVar ? aVar : objC;
    }
}

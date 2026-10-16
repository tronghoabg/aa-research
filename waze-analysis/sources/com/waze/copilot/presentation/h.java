package com.waze.copilot.presentation;

import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarDuration;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23116a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScaffoldState f23117b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f23118c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f23119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ScaffoldState scaffoldState, String str, String str2, h.c.e eVar) {
        super(2, eVar);
        this.f23117b = scaffoldState;
        this.f23118c = str;
        this.f23119d = str2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f23117b, this.f23118c, this.f23119d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f23116a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        ScaffoldState scaffoldState = this.f23117b;
        String str = this.f23118c;
        String str2 = this.f23119d;
        this.f23116a = 1;
        Object objShowSnackbar = scaffoldState.getSnackbarHostState().showSnackbar(str, str2, SnackbarDuration.Indefinite, this);
        return objShowSnackbar == aVar ? aVar : objShowSnackbar;
    }
}

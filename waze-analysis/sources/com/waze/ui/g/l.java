package com.waze.ui.g;

import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarResult;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ScaffoldState f42342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f42343c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f42344d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ScaffoldState scaffoldState, String str, String str2, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f42342b = scaffoldState;
        this.f42343c = str;
        this.f42344d = str2;
        this.f42345e = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f42342b, this.f42343c, this.f42344d, this.f42345e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f42341a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ScaffoldState scaffoldState = this.f42342b;
            String str = this.f42343c;
            String str2 = this.f42344d;
            this.f42341a = 1;
            obj = scaffoldState.getSnackbarHostState().showSnackbar(str, str2, SnackbarDuration.Short, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        SnackbarResult snackbarResult = SnackbarResult.Dismissed;
        int iOrdinal = ((SnackbarResult) obj).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            throw new h.i();
        }
        this.f42345e.invoke(new e((byte[]) null));
        return ab.f48028a;
    }
}

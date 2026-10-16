package com.waze.main_screen;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f27850b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f27851c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f27852d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ManagedActivityResultLauncher f27853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ab abVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, h.c.e eVar) {
        super(2, eVar);
        this.f27850b = abVar;
        this.f27851c = context;
        this.f27852d = managedActivityResultLauncher;
        this.f27853e = managedActivityResultLauncher2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new w(this.f27850b, this.f27851c, this.f27852d, this.f27853e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27849a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f27849a = 1;
            if (this.f27850b.j(this.f27851c, this.f27852d, this.f27853e, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

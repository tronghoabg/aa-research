package com.google.android.play.core.b;

import com.google.android.gms.o.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f6966a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f6967b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f6968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, w wVar, w wVar2, a aVar) {
        super(wVar);
        this.f6966a = wVar2;
        this.f6967b = aVar;
        Objects.requireNonNull(iVar);
        this.f6968c = iVar;
    }

    @Override // com.google.android.play.core.b.a
    public final void b() {
        i iVar = this.f6968c;
        synchronized (iVar.f6979f) {
            i.j(iVar, this.f6966a);
            if (iVar.f6984k.getAndIncrement() > 0) {
                iVar.n.h("Already connected to the service.", new Object[0]);
            }
            i.l(iVar, this.f6967b);
        }
    }
}

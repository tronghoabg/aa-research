package e.a.i;

import e.a.bj;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f47827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, Object obj, bj bjVar) {
        super(iVar, obj, bjVar);
        Objects.requireNonNull(iVar);
        this.f47827b = iVar;
    }

    @Override // e.a.i.c
    protected final b f() {
        return new f(this);
    }
}

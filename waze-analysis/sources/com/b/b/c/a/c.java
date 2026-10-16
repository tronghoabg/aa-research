package com.b.b.c.a;

import android.util.Base64;
import com.google.l.h;
import com.google.l.i;
import com.google.l.n;
import com.google.l.o;
import com.google.l.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements h, p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f2625a;

    /* synthetic */ c(int i2) {
        this.f2625a = i2;
    }

    @Override // com.google.l.h
    public final /* synthetic */ Object a(i iVar) {
        return this.f2625a != 0 ? Base64.decode(iVar.f().c(), 2) : new com.b.b.d.i(iVar.c());
    }

    @Override // com.google.l.p
    public final /* synthetic */ i b(Object obj, o oVar) {
        return this.f2625a != 0 ? new n(Base64.encodeToString((byte[]) obj, 2)) : oVar.a(((com.b.b.d.i) obj).f2642a);
    }
}

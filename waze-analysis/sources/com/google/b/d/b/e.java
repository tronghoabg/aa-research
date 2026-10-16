package com.google.b.d.b;

import com.google.d.b.an;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private final r f7090a;

    e(String str, x xVar, r rVar, w wVar) {
        super(str, xVar, wVar);
        an.l(rVar.f());
        this.f7090a = rVar;
    }

    @Override // com.google.b.d.b.x
    public final r h() {
        return r.b(this.f7090a, j());
    }

    e(String str, UUID uuid, String str2, r rVar, w wVar) {
        super(str, uuid, str2, wVar);
        an.l(rVar.f());
        this.f7090a = rVar;
    }
}

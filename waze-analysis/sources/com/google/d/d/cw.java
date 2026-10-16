package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cw extends fp {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.d.b.t f7517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cw(Iterator it, com.google.d.b.t tVar) {
        super(it);
        this.f7517a = tVar;
    }

    @Override // com.google.d.d.fp
    final Object a(Object obj) {
        return this.f7517a.apply(obj);
    }
}

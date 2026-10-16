package com.google.android.libraries.e.b;

import com.google.d.b.an;
import com.google.d.m.a.bd;
import com.google.v.de;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final y f5889a = new p();

    @Override // com.google.android.libraries.e.b.y
    public final String b(c cVar) {
        an.B(cVar);
        return "singleproc";
    }

    @Override // com.google.android.libraries.e.b.y
    public final /* bridge */ /* synthetic */ r c(i iVar, String str, Executor executor, com.google.android.libraries.e.a.f fVar, c cVar) {
        an.B(cVar);
        return new r(str, bd.h(iVar.b()), com.google.android.libraries.e.b.b.b.d(iVar.e(), iVar.f() ? de.b() : de.a()), executor, fVar, iVar.c());
    }
}

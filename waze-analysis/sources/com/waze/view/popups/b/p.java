package com.waze.view.popups.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import h.ab;
import java.io.File;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f45267a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f45267a = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f45267a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        q qVar = this.f45267a;
        if (new File(qVar.f45268a).exists()) {
            try {
                objA = BitmapFactory.decodeFile(qVar.f45268a);
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            if (true == (objA instanceof h.l)) {
                objA = null;
            }
            Bitmap bitmap = (Bitmap) objA;
            bn bnVar = this.f45267a.f45273f;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, l.a((l) objD, bitmap, null, null, 6)));
        }
        return ab.f48028a;
    }
}

package com.bumptech.glide.load;

import com.bumptech.glide.load.c.a.an;
import java.io.FileInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.data.s f3505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.a.a.j f3506b;

    j(com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3505a = sVar;
        this.f3506b = jVar;
    }

    @Override // com.bumptech.glide.load.k
    public final boolean a(d dVar) throws Throwable {
        an anVar;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f3505a.a().getFileDescriptor());
            com.bumptech.glide.load.a.a.j jVar = this.f3506b;
            anVar = new an(fileInputStream, jVar);
            try {
                boolean zE = dVar.e(anVar, jVar);
                anVar.b();
                this.f3505a.a();
                return zE;
            } catch (Throwable th) {
                th = th;
                if (anVar != null) {
                    anVar.b();
                }
                this.f3505a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            anVar = null;
        }
    }
}

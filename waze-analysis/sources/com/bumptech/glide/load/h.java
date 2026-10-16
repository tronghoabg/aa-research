package com.bumptech.glide.load;

import com.bumptech.glide.load.c.a.an;
import java.io.FileInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.data.s f3500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.a.a.j f3501b;

    h(com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3500a = sVar;
        this.f3501b = jVar;
    }

    @Override // com.bumptech.glide.load.l
    public final int a(d dVar) throws Throwable {
        an anVar;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f3500a.a().getFileDescriptor());
            com.bumptech.glide.load.a.a.j jVar = this.f3501b;
            anVar = new an(fileInputStream, jVar);
            try {
                int iC = dVar.c(anVar, jVar);
                anVar.b();
                this.f3500a.a();
                return iC;
            } catch (Throwable th) {
                th = th;
                if (anVar != null) {
                    anVar.b();
                }
                this.f3500a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            anVar = null;
        }
    }
}

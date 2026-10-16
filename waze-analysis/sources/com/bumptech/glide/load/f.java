package com.bumptech.glide.load;

import com.bumptech.glide.load.c.a.an;
import java.io.FileInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.data.s f3495a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.load.a.a.j f3496b;

    f(com.bumptech.glide.load.data.s sVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3495a = sVar;
        this.f3496b = jVar;
    }

    @Override // com.bumptech.glide.load.m
    public final ImageHeaderParser$ImageType a(d dVar) throws Throwable {
        an anVar;
        try {
            anVar = new an(new FileInputStream(this.f3495a.a().getFileDescriptor()), this.f3496b);
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = dVar.a(anVar);
                anVar.b();
                this.f3495a.a();
                return imageHeaderParser$ImageTypeA;
            } catch (Throwable th) {
                th = th;
                if (anVar != null) {
                    anVar.b();
                }
                this.f3495a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            anVar = null;
        }
    }
}

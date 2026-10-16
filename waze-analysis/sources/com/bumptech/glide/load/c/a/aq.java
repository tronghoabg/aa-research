package com.bumptech.glide.load.c.a;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq implements com.bumptech.glide.load.u {

    /* renamed from: a, reason: collision with root package name */
    private final w f3322a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3323b;

    public aq(w wVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3322a = wVar;
        this.f3323b = jVar;
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        boolean z;
        an anVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof an) {
            anVar = (an) inputStream;
            z = false;
        } else {
            z = true;
            anVar = new an(inputStream, this.f3323b);
        }
        boolean z2 = z;
        com.bumptech.glide.g.f fVarA = com.bumptech.glide.g.f.a(anVar);
        try {
            com.bumptech.glide.load.a.aw awVarC = this.f3322a.c(new com.bumptech.glide.g.n(fVarA), i2, i3, sVar, new ap(anVar, fVarA));
            fVarA.c();
            if (z2) {
                anVar.b();
            }
            return awVarC;
        } finally {
        }
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, com.bumptech.glide.load.s sVar) {
        return true;
    }
}

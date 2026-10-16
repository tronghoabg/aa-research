package com.bumptech.glide.load.c.d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.g.p;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.c.a.ak;
import com.bumptech.glide.load.w;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements w {

    /* renamed from: b, reason: collision with root package name */
    private final w f3418b;

    public h(w wVar) {
        p.f(wVar);
        this.f3418b = wVar;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        this.f3418b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.w
    public final aw b(Context context, aw awVar, int i2, int i3) {
        e eVar = (e) awVar.c();
        ak akVar = new ak(eVar.b(), com.bumptech.glide.c.b(context).h(), 1);
        w wVar = this.f3418b;
        aw awVarB = wVar.b(context, akVar, i2, i3);
        if (!akVar.equals(awVarB)) {
            akVar.e();
        }
        eVar.f(wVar, (Bitmap) awVarB.c());
        return awVar;
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3418b.equals(((h) obj).f3418b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return this.f3418b.hashCode();
    }
}

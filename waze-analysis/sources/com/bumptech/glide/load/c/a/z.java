package com.bumptech.glide.load.c.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z implements com.bumptech.glide.load.w {

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.w f3376b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3377c;

    public z(com.bumptech.glide.load.w wVar, boolean z) {
        this.f3376b = wVar;
        this.f3377c = z;
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        this.f3376b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.w
    public final com.bumptech.glide.load.a.aw b(Context context, com.bumptech.glide.load.a.aw awVar, int i2, int i3) {
        com.bumptech.glide.load.a.a.c cVarH = com.bumptech.glide.c.b(context).h();
        Drawable drawable = (Drawable) awVar.c();
        com.bumptech.glide.load.a.aw awVarA = y.a(cVarH, drawable, i2, i3);
        if (awVarA != null) {
            com.bumptech.glide.load.a.aw awVarB = this.f3376b.b(context, awVarA, i2, i3);
            if (!awVarB.equals(awVarA)) {
                return ak.f(context.getResources(), awVarB);
            }
            awVarB.e();
            return awVar;
        }
        if (!this.f3377c) {
            return awVar;
        }
        throw new IllegalArgumentException("Unable to convert " + String.valueOf(drawable) + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f3376b.equals(((z) obj).f3376b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return this.f3376b.hashCode();
    }
}

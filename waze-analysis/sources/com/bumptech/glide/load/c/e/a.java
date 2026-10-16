package com.bumptech.glide.load.c.e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.g.p;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.c.a.ak;
import com.bumptech.glide.load.s;
import java.io.ByteArrayOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3443a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3444b;

    public a(Resources resources, int i2) {
        this.f3443a = i2;
        p.f(resources);
        this.f3444b = resources;
    }

    @Override // com.bumptech.glide.load.c.e.c
    public final aw a(aw awVar, s sVar) {
        if (this.f3443a == 0) {
            return ak.f((Resources) this.f3444b, awVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) awVar.c()).compress((Bitmap.CompressFormat) this.f3444b, 100, byteArrayOutputStream);
        awVar.e();
        return new com.bumptech.glide.load.c.b.c(byteArrayOutputStream.toByteArray());
    }

    public a(int i2) {
        this.f3443a = i2;
        this.f3444b = Bitmap.CompressFormat.JPEG;
    }
}

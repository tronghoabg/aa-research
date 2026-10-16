package com.bumptech.glide.load.c.c;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    private final c f3389a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3390b;

    b(c cVar, int i2) {
        this.f3390b = i2;
        this.f3389a = cVar;
    }

    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ aw a(Object obj, int i2, int i3, s sVar) {
        return this.f3390b != 0 ? c.e(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, sVar) : c.e(ImageDecoder.createSource(com.bumptech.glide.g.c.b((InputStream) obj, false)), i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ boolean b(Object obj, s sVar) {
        if (this.f3390b != 0) {
            return this.f3389a.b((ByteBuffer) obj);
        }
        return this.f3389a.a((InputStream) obj);
    }
}

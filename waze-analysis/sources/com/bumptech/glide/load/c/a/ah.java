package com.bumptech.glide.load.c.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah implements ai {

    /* renamed from: a, reason: collision with root package name */
    private final List f3300a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3301b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3302c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3303d;

    ah(InputStream inputStream, List list, com.bumptech.glide.load.a.a.j jVar, int i2) {
        this.f3301b = i2;
        com.bumptech.glide.g.p.f(jVar);
        this.f3303d = jVar;
        com.bumptech.glide.g.p.f(list);
        this.f3300a = list;
        this.f3302c = new com.bumptech.glide.load.data.p(inputStream, jVar);
    }

    @Override // com.bumptech.glide.load.c.a.ai
    public final int a() {
        int i2 = this.f3301b;
        if (i2 == 0) {
            return com.bumptech.glide.load.n.c(this.f3300a, ((com.bumptech.glide.load.data.p) this.f3302c).a(), (com.bumptech.glide.load.a.a.j) this.f3303d);
        }
        List list = this.f3300a;
        if (i2 == 1) {
            return com.bumptech.glide.load.n.d(list, com.bumptech.glide.g.c.c((ByteBuffer) this.f3303d), (com.bumptech.glide.load.a.a.j) this.f3302c);
        }
        return com.bumptech.glide.load.n.b(list, (com.bumptech.glide.load.data.s) this.f3302c, (com.bumptech.glide.load.a.a.j) this.f3303d);
    }

    @Override // com.bumptech.glide.load.c.a.ai
    public final Bitmap b(BitmapFactory.Options options) {
        int i2 = this.f3301b;
        return i2 != 0 ? i2 != 1 ? af.a(((com.bumptech.glide.load.data.s) this.f3302c).a().getFileDescriptor(), options, this) : af.b(com.bumptech.glide.g.c.a(com.bumptech.glide.g.c.c((ByteBuffer) this.f3303d)), options, this) : af.b(((com.bumptech.glide.load.data.p) this.f3302c).a(), options, this);
    }

    @Override // com.bumptech.glide.load.c.a.ai
    public final ImageHeaderParser$ImageType c() {
        int i2 = this.f3301b;
        if (i2 == 0) {
            return com.bumptech.glide.load.n.f(this.f3300a, ((com.bumptech.glide.load.data.p) this.f3302c).a(), (com.bumptech.glide.load.a.a.j) this.f3303d);
        }
        List list = this.f3300a;
        if (i2 == 1) {
            return com.bumptech.glide.load.n.a(list, com.bumptech.glide.g.c.c((ByteBuffer) this.f3303d));
        }
        return com.bumptech.glide.load.n.e(list, (com.bumptech.glide.load.data.s) this.f3302c, (com.bumptech.glide.load.a.a.j) this.f3303d);
    }

    @Override // com.bumptech.glide.load.c.a.ai
    public final void d() {
        if (this.f3301b != 0) {
            return;
        }
        ((com.bumptech.glide.load.data.p) this.f3302c).d();
    }

    @Override // com.bumptech.glide.load.c.a.ai
    public final boolean e() {
        int i2 = this.f3301b;
        if (i2 == 0) {
            return com.bumptech.glide.load.n.h(this.f3300a, ((com.bumptech.glide.load.data.p) this.f3302c).a(), (com.bumptech.glide.load.a.a.j) this.f3303d);
        }
        List list = this.f3300a;
        if (i2 == 1) {
            return com.bumptech.glide.load.n.i(list, com.bumptech.glide.g.c.c((ByteBuffer) this.f3303d), (com.bumptech.glide.load.a.a.j) this.f3302c);
        }
        return com.bumptech.glide.load.n.g(list, (com.bumptech.glide.load.data.s) this.f3302c, (com.bumptech.glide.load.a.a.j) this.f3303d);
    }

    ah(ByteBuffer byteBuffer, List list, com.bumptech.glide.load.a.a.j jVar, int i2) {
        this.f3301b = i2;
        this.f3303d = byteBuffer;
        this.f3300a = list;
        this.f3302c = jVar;
    }

    ah(ParcelFileDescriptor parcelFileDescriptor, List list, com.bumptech.glide.load.a.a.j jVar, int i2) {
        this.f3301b = i2;
        com.bumptech.glide.g.p.f(jVar);
        this.f3303d = jVar;
        com.bumptech.glide.g.p.f(list);
        this.f3300a = list;
        this.f3302c = new com.bumptech.glide.load.data.s(parcelFileDescriptor);
    }
}

package com.bumptech.glide.load.c.d;

import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.c.a.ak;
import com.bumptech.glide.load.c.a.w;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l implements u {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3436a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3437b;

    public l(Object obj, int i2) {
        this.f3436a = i2;
        this.f3437b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.a.a.c, java.lang.Object] */
    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ aw a(Object obj, int i2, int i3, s sVar) {
        if (this.f3436a == 0) {
            return ak.g(((com.bumptech.glide.b.a) obj).e(), this.f3437b);
        }
        return ((w) this.f3437b).b((ByteBuffer) obj, i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* synthetic */ boolean b(Object obj, s sVar) {
        if (this.f3436a != 0) {
            return true;
        }
        return true;
    }
}

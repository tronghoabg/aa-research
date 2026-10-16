package com.bumptech.glide.load.c.d;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3399a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Context f3400b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3401c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3402d;

    /* renamed from: e, reason: collision with root package name */
    private final c f3403e;

    public b(Context context, List list, com.bumptech.glide.load.a.a.c cVar, com.bumptech.glide.load.a.a.j jVar) {
        a aVar = f3399a;
        this.f3400b = context.getApplicationContext();
        this.f3401c = list;
        this.f3403e = new c(cVar, jVar);
        this.f3402d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f A[Catch: all -> 0x0153, TryCatch #2 {all -> 0x0153, blocks: (B:3:0x0018, B:31:0x00bd, B:33:0x00c3, B:34:0x00d3, B:38:0x00f7, B:40:0x00fd, B:53:0x0138, B:57:0x0152, B:56:0x013f, B:43:0x0113, B:45:0x011c), top: B:65:0x0018 }] */
    @Override // com.bumptech.glide.load.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.bumptech.glide.load.a.aw a(java.lang.Object r20, int r21, int r22, com.bumptech.glide.load.s r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.c.d.b.a(java.lang.Object, int, int, com.bumptech.glide.load.s):com.bumptech.glide.load.a.aw");
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s sVar) {
        return !((Boolean) sVar.b(m.f3439b)).booleanValue() && com.bumptech.glide.load.n.a(this.f3401c, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}

package com.bumptech.glide.b;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2780a = "e";

    /* renamed from: b, reason: collision with root package name */
    private int[] f2781b;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f2783d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f2784e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f2785f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f2786g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f2787h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f2788i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f2789j;

    /* renamed from: k, reason: collision with root package name */
    private int f2790k;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Boolean s;
    private final com.bumptech.glide.load.c.d.c u;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f2782c = new int[256];
    private Bitmap.Config t = Bitmap.Config.ARGB_8888;

    /* renamed from: l, reason: collision with root package name */
    private c f2791l = new c();

    public e(com.bumptech.glide.load.c.d.c cVar, c cVar2, ByteBuffer byteBuffer, int i2) {
        this.u = cVar;
        j(cVar2, byteBuffer, i2);
    }

    private final int k() {
        return this.f2783d.get() & 255;
    }

    private final Bitmap l() {
        Boolean bool = this.s;
        Bitmap bitmapA = this.u.a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    @Override // com.bumptech.glide.b.a
    public final int a() {
        return this.f2783d.limit() + this.f2788i.length + (this.f2789j.length * 4);
    }

    @Override // com.bumptech.glide.b.a
    public final int b() {
        return this.f2790k;
    }

    @Override // com.bumptech.glide.b.a
    public final int c() {
        return this.f2791l.f2766c;
    }

    @Override // com.bumptech.glide.b.a
    public final int d() {
        int i2;
        c cVar = this.f2791l;
        int i3 = cVar.f2766c;
        if (i3 <= 0 || (i2 = this.f2790k) < 0) {
            return 0;
        }
        if (i2 < i3) {
            return ((b) cVar.f2768e.get(i2)).f2761i;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17, types: [short] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.bumptech.glide.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap e() {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.e.e():android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.b.a
    public final ByteBuffer f() {
        return this.f2783d;
    }

    @Override // com.bumptech.glide.b.a
    public final void g() {
        this.f2790k = (this.f2790k + 1) % this.f2791l.f2766c;
    }

    @Override // com.bumptech.glide.b.a
    public final void h() {
        this.f2791l = null;
        byte[] bArr = this.f2788i;
        if (bArr != null) {
            this.u.c(bArr);
        }
        int[] iArr = this.f2789j;
        if (iArr != null) {
            this.u.d(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.u.b(bitmap);
        }
        this.m = null;
        this.f2783d = null;
        this.s = null;
        byte[] bArr2 = this.f2784e;
        if (bArr2 != null) {
            this.u.c(bArr2);
        }
    }

    @Override // com.bumptech.glide.b.a
    public final void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
    }

    public final synchronized void j(c cVar, ByteBuffer byteBuffer, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
        int iHighestOneBit = Integer.highestOneBit(i2);
        this.o = 0;
        this.f2791l = cVar;
        this.f2790k = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f2783d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f2783d.order(ByteOrder.LITTLE_ENDIAN);
        this.n = false;
        Iterator it = cVar.f2768e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((b) it.next()).f2759g == 3) {
                this.n = true;
                break;
            }
        }
        this.p = iHighestOneBit;
        int i3 = cVar.f2769f;
        this.r = i3 / iHighestOneBit;
        int i4 = cVar.f2770g;
        this.q = i4 / iHighestOneBit;
        com.bumptech.glide.load.c.d.c cVar2 = this.u;
        this.f2788i = cVar2.e(i3 * i4);
        this.f2789j = cVar2.f(this.r * this.q);
    }
}

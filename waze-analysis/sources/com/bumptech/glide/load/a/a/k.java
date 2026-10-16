package com.bumptech.glide.load.a.a;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.g.r;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config f2957a = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    private final l f2958b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f2959c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2960d;

    /* renamed from: e, reason: collision with root package name */
    private long f2961e;

    /* renamed from: f, reason: collision with root package name */
    private int f2962f;

    /* renamed from: g, reason: collision with root package name */
    private int f2963g;

    /* renamed from: h, reason: collision with root package name */
    private int f2964h;

    /* renamed from: i, reason: collision with root package name */
    private int f2965i;

    public k(long j2) {
        q qVar = new q();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.f2960d = j2;
        this.f2958b = qVar;
        this.f2959c = setUnmodifiableSet;
    }

    private static Bitmap f(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = f2957a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private final synchronized Bitmap g(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapA;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + String.valueOf(config) + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        l lVar = this.f2958b;
        bitmapA = lVar.a(i2, i3, config != null ? config : f2957a);
        if (bitmapA == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=".concat(lVar.d(i2, i3, config)));
            }
            this.f2963g++;
        } else {
            this.f2962f++;
            this.f2961e -= r.a(bitmapA);
            bitmapA.setHasAlpha(true);
            bitmapA.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=".concat(lVar.d(i2, i3, config)));
        }
        h();
        return bitmapA;
    }

    private final void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private final void i() {
        l lVar = this.f2958b;
        Log.v("LruBitmapPool", "Hits=" + this.f2962f + ", misses=" + this.f2963g + ", puts=" + this.f2964h + ", evictions=" + this.f2965i + ", currentSize=" + this.f2961e + ", maxSize=" + this.f2960d + "\nStrategy=" + lVar.toString());
    }

    private final synchronized void j(long j2) {
        while (this.f2961e > j2) {
            l lVar = this.f2958b;
            Bitmap bitmapB = lVar.b();
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f2961e = 0L;
                return;
            }
            this.f2961e -= r.a(bitmapB);
            this.f2965i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(lVar.c(bitmapB)));
            }
            h();
            bitmapB.recycle();
        }
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapG = g(i2, i3, config);
        if (bitmapG == null) {
            return f(i2, i3, config);
        }
        bitmapG.eraseColor(0);
        return bitmapG;
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapG = g(i2, i3, config);
        return bitmapG == null ? f(i2, i3, config) : bitmapG;
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        j(0L);
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                l lVar = this.f2958b;
                long jA = r.a(bitmap);
                long j2 = this.f2960d;
                if (jA <= j2 && this.f2959c.contains(bitmap.getConfig())) {
                    int iA = r.a(bitmap);
                    lVar.e(bitmap);
                    this.f2964h++;
                    this.f2961e += iA;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(lVar.c(bitmap)));
                    }
                    h();
                    j(j2);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f2958b.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f2959c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.a.a.c
    public final void e(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            c();
        } else if (i2 == 15) {
            j(this.f2960d >> 1);
        }
    }
}

package F4;

import Y4.m;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import x9.C4504d;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f3851j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f3852a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3853b;

    /* renamed from: c, reason: collision with root package name */
    public final C4504d f3854c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3855d;

    /* renamed from: e, reason: collision with root package name */
    public long f3856e;

    /* renamed from: f, reason: collision with root package name */
    public int f3857f;

    /* renamed from: g, reason: collision with root package name */
    public int f3858g;

    /* renamed from: h, reason: collision with root package name */
    public int f3859h;

    /* renamed from: i, reason: collision with root package name */
    public int f3860i;

    public g(long j8) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i5 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i5 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.f3855d = j8;
        this.f3852a = kVar;
        this.f3853b = setUnmodifiableSet;
        this.f3854c = new C4504d(17);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f3857f + ", misses=" + this.f3858g + ", puts=" + this.f3859h + ", evictions=" + this.f3860i + ", currentSize=" + this.f3856e + ", maxSize=" + this.f3855d + "\nStrategy=" + this.f3852a);
    }

    @Override // F4.a
    public final void b(int i5) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i5);
        }
        if (i5 >= 40 || i5 >= 20) {
            o();
        } else if (i5 >= 20 || i5 == 15) {
            d(this.f3855d / 2);
        }
    }

    public final synchronized Bitmap c(int i5, int i10, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f3852a.b(i5, i10, config != null ? config : f3851j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f3852a.getClass();
                    sb2.append(k.c(m.b(i5, i10, config), config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f3858g++;
            } else {
                this.f3857f++;
                long j8 = this.f3856e;
                this.f3852a.getClass();
                this.f3856e = j8 - m.c(bitmapB);
                this.f3854c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f3852a.getClass();
                sb3.append(k.c(m.b(i5, i10, config), config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void d(long j8) {
        while (this.f3856e > j8) {
            try {
                k kVar = this.f3852a;
                Bitmap bitmap = (Bitmap) kVar.f3871b.s();
                if (bitmap != null) {
                    kVar.a(Integer.valueOf(m.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f3856e = 0L;
                    return;
                }
                this.f3854c.getClass();
                long j10 = this.f3856e;
                this.f3852a.getClass();
                this.f3856e = j10 - m.c(bitmap);
                this.f3860i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f3852a.getClass();
                    sb2.append(k.c(m.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F4.a
    public final Bitmap e(int i5, int i10, Bitmap.Config config) {
        Bitmap bitmapC = c(i5, i10, config);
        if (bitmapC != null) {
            return bitmapC;
        }
        if (config == null) {
            config = f3851j;
        }
        return Bitmap.createBitmap(i5, i10, config);
    }

    @Override // F4.a
    public final synchronized void f(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f3852a.getClass();
                if (m.c(bitmap) <= this.f3855d && this.f3853b.contains(bitmap.getConfig())) {
                    this.f3852a.getClass();
                    int iC = m.c(bitmap);
                    this.f3852a.e(bitmap);
                    this.f3854c.getClass();
                    this.f3859h++;
                    this.f3856e += iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f3852a.getClass();
                        sb2.append(k.c(m.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    d(this.f3855d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f3852a.getClass();
                sb3.append(k.c(m.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f3853b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F4.a
    public final void o() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        d(0L);
    }

    @Override // F4.a
    public final Bitmap t(int i5, int i10, Bitmap.Config config) {
        Bitmap bitmapC = c(i5, i10, config);
        if (bitmapC != null) {
            bitmapC.eraseColor(0);
            return bitmapC;
        }
        if (config == null) {
            config = f3851j;
        }
        return Bitmap.createBitmap(i5, i10, config);
    }
}

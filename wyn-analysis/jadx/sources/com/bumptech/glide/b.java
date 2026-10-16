package com.bumptech.glide;

import A.C0230x;
import A.d0;
import A.e0;
import A7.Q1;
import E4.o;
import I4.w;
import I4.x;
import I4.z;
import L4.B;
import L4.C0709a;
import L4.C0710b;
import L4.m;
import L4.q;
import P4.j;
import S3.l;
import Va.C1038ka;
import Va.M6;
import ad.C1355I;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import b7.k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.S;
import wa.C4398a;
import x.C4412e;
import x9.C4504d;
import y3.C4552j;
import za.C4658a;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile b f24208i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f24209j;

    /* renamed from: a, reason: collision with root package name */
    public final F4.a f24210a;

    /* renamed from: b, reason: collision with root package name */
    public final G4.d f24211b;

    /* renamed from: c, reason: collision with root package name */
    public final c f24212c;

    /* renamed from: d, reason: collision with root package name */
    public final f f24213d;

    /* renamed from: e, reason: collision with root package name */
    public final F4.f f24214e;

    /* renamed from: f, reason: collision with root package name */
    public final R4.h f24215f;

    /* renamed from: g, reason: collision with root package name */
    public final ya.b f24216g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f24217h = new ArrayList();

    public b(Context context, o oVar, G4.d dVar, F4.a aVar, F4.f fVar, R4.h hVar, ya.b bVar, C1355I c1355i, C4412e c4412e, List list) {
        this.f24210a = aVar;
        this.f24214e = fVar;
        this.f24211b = dVar;
        this.f24215f = hVar;
        this.f24216g = bVar;
        Resources resources = context.getResources();
        f fVar2 = new f();
        this.f24213d = fVar2;
        L4.h hVar2 = new L4.h();
        d0 d0Var = (d0) fVar2.f24236g;
        synchronized (d0Var) {
            d0Var.f140a.add(hVar2);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 27) {
            fVar2.k(new q());
        }
        ArrayList arrayListI = fVar2.i();
        P4.a aVar2 = new P4.a(context, arrayListI, aVar, fVar);
        B b5 = new B(aVar, new C4504d(21));
        m mVar = new m(fVar2.i(), resources.getDisplayMetrics(), aVar, fVar);
        L4.d dVar2 = new L4.d(mVar, 0);
        C0709a c0709a = new C0709a(2, mVar, fVar);
        N4.b bVar2 = new N4.b(context);
        x xVar = new x(resources);
        Y9.c cVar = new Y9.c(resources, 12);
        w wVar = new w(resources, 0);
        xa.d dVar3 = new xa.d(resources, 11);
        C0710b c0710b = new C0710b(fVar);
        C0230x c0230x = new C0230x((byte) 0, 8);
        Q4.c cVar2 = new Q4.c(1);
        ContentResolver contentResolver = context.getContentResolver();
        fVar2.b(ByteBuffer.class, new z(5));
        fVar2.b(InputStream.class, new e0(fVar, 9));
        fVar2.e("Bitmap", ByteBuffer.class, Bitmap.class, dVar2);
        fVar2.e("Bitmap", InputStream.class, Bitmap.class, c0709a);
        fVar2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new L4.d(mVar, 1));
        fVar2.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b5);
        fVar2.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, new B(aVar, new S(21)));
        z zVar = z.f5379b;
        fVar2.d(Bitmap.class, Bitmap.class, zVar);
        fVar2.e("Bitmap", Bitmap.class, Bitmap.class, new L4.x(0));
        fVar2.c(Bitmap.class, c0710b);
        fVar2.e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0709a(resources, dVar2));
        fVar2.e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0709a(resources, c0709a));
        fVar2.e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0709a(resources, b5));
        fVar2.c(BitmapDrawable.class, new S3.c(aVar, false, c0710b, 12));
        fVar2.e("Gif", InputStream.class, P4.c.class, new j(arrayListI, aVar2, fVar));
        fVar2.e("Gif", ByteBuffer.class, P4.c.class, aVar2);
        fVar2.c(P4.c.class, new ya.b(24));
        fVar2.d(A4.d.class, A4.d.class, zVar);
        fVar2.e("Bitmap", A4.d.class, Bitmap.class, new N4.b(aVar));
        fVar2.e("legacy_append", Uri.class, Drawable.class, bVar2);
        fVar2.e("legacy_append", Uri.class, Bitmap.class, new C0709a(1, bVar2, aVar));
        fVar2.l(new C4.h(2));
        fVar2.d(File.class, ByteBuffer.class, new z(6));
        fVar2.d(File.class, InputStream.class, new I4.e(new z(9)));
        fVar2.e("legacy_append", File.class, File.class, new L4.x(2));
        fVar2.d(File.class, ParcelFileDescriptor.class, new I4.e(new z(8)));
        fVar2.d(File.class, File.class, zVar);
        fVar2.l(new C4.m(fVar));
        fVar2.l(new C4.h(1));
        Class cls = Integer.TYPE;
        fVar2.d(cls, InputStream.class, xVar);
        fVar2.d(cls, ParcelFileDescriptor.class, wVar);
        fVar2.d(Integer.class, InputStream.class, xVar);
        fVar2.d(Integer.class, ParcelFileDescriptor.class, wVar);
        fVar2.d(Integer.class, Uri.class, cVar);
        fVar2.d(cls, AssetFileDescriptor.class, dVar3);
        fVar2.d(Integer.class, AssetFileDescriptor.class, dVar3);
        fVar2.d(cls, Uri.class, cVar);
        fVar2.d(String.class, InputStream.class, new C4552j(10));
        fVar2.d(Uri.class, InputStream.class, new C4552j(10));
        fVar2.d(String.class, InputStream.class, new z(13));
        fVar2.d(String.class, ParcelFileDescriptor.class, new z(12));
        fVar2.d(String.class, AssetFileDescriptor.class, new z(11));
        fVar2.d(Uri.class, InputStream.class, new C4658a(19));
        fVar2.d(Uri.class, InputStream.class, new xa.d(context.getAssets(), 10));
        fVar2.d(Uri.class, ParcelFileDescriptor.class, new e0(context.getAssets(), 8));
        fVar2.d(Uri.class, InputStream.class, new E0.a(context, false));
        fVar2.d(Uri.class, InputStream.class, new J4.c(context, false));
        if (i5 >= 29) {
            fVar2.d(Uri.class, InputStream.class, new J4.e(context, InputStream.class));
            fVar2.d(Uri.class, ParcelFileDescriptor.class, new J4.e(context, ParcelFileDescriptor.class));
        }
        fVar2.d(Uri.class, InputStream.class, new l(contentResolver));
        fVar2.d(Uri.class, ParcelFileDescriptor.class, new C4552j(contentResolver, 11));
        fVar2.d(Uri.class, AssetFileDescriptor.class, new xa.d(contentResolver, 12));
        fVar2.d(Uri.class, InputStream.class, new z(14));
        fVar2.d(URL.class, InputStream.class, new C1038ka(20));
        fVar2.d(Uri.class, File.class, new Q1(context));
        fVar2.d(I4.f.class, InputStream.class, new Y9.c(14));
        fVar2.d(byte[].class, ByteBuffer.class, new z(2));
        fVar2.d(byte[].class, InputStream.class, new z(4));
        fVar2.d(Uri.class, Uri.class, zVar);
        fVar2.d(Drawable.class, Drawable.class, zVar);
        fVar2.e("legacy_append", Drawable.class, Drawable.class, new L4.x(1));
        fVar2.m(Bitmap.class, BitmapDrawable.class, new x(resources));
        fVar2.m(Bitmap.class, byte[].class, c0230x);
        fVar2.m(Drawable.class, byte[].class, new k(11, aVar, c0230x, cVar2, false));
        fVar2.m(P4.c.class, byte[].class, cVar2);
        B b10 = new B(aVar, new C4398a(21));
        fVar2.e("legacy_append", ByteBuffer.class, Bitmap.class, b10);
        fVar2.e("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0709a(resources, b10));
        this.f24212c = new c(context, fVar, fVar2, c1355i, c4412e, list, oVar);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        C1355I c1355i;
        C4412e c4412e;
        if (f24209j) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f24209j = true;
        C4412e c4412e2 = new C4412e(0);
        C1355I c1355i2 = new C1355I(2);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        S3.f.B(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.Z().isEmpty()) {
                generatedAppGlideModule.Z();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    throw M6.j(it2);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                throw M6.j(it3);
            }
            if (H4.c.f4890c == 0) {
                H4.c.f4890c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i5 = H4.c.f4890c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            H4.c cVar = new H4.c(new ThreadPoolExecutor(i5, i5, 0L, timeUnit, new PriorityBlockingQueue(), new H4.b("source", false)));
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            H4.c cVar2 = new H4.c(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new H4.b("disk-cache", true)));
            if (H4.c.f4890c == 0) {
                H4.c.f4890c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = H4.c.f4890c >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            H4.c cVar3 = new H4.c(new ThreadPoolExecutor(i10, i10, 0L, timeUnit, new PriorityBlockingQueue(), new H4.b("animation", true)));
            G4.e eVar = new G4.e(applicationContext);
            G4.f fVar = new G4.f();
            Context context2 = eVar.f4229a;
            fVar.f4236d = context2;
            ActivityManager activityManager = eVar.f4230b;
            int i11 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            fVar.f4235c = i11;
            int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) eVar.f4231c.f16739b;
            float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f11 = eVar.f4232d;
            int iRound2 = Math.round(f10 * f11);
            int iRound3 = Math.round(f10 * 2.0f);
            int i12 = iRound - i11;
            int i13 = iRound3 + iRound2;
            if (i13 <= i12) {
                fVar.f4234b = iRound3;
                fVar.f4233a = iRound2;
            } else {
                float f12 = i12 / (f11 + 2.0f);
                fVar.f4234b = Math.round(2.0f * f12);
                fVar.f4233a = Math.round(f12 * f11);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                c1355i = c1355i2;
                c4412e = c4412e2;
                sb2.append(Formatter.formatFileSize(context2, fVar.f4234b));
                sb2.append(", pool size: ");
                sb2.append(Formatter.formatFileSize(context2, fVar.f4233a));
                sb2.append(", byte array size: ");
                sb2.append(Formatter.formatFileSize(context2, i11));
                sb2.append(", memory class limited? ");
                sb2.append(i13 > iRound);
                sb2.append(", max size: ");
                sb2.append(Formatter.formatFileSize(context2, iRound));
                sb2.append(", memoryClass: ");
                sb2.append(activityManager.getMemoryClass());
                sb2.append(", isLowMemoryDevice: ");
                sb2.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb2.toString());
            } else {
                c1355i = c1355i2;
                c4412e = c4412e2;
            }
            ya.b bVar = new ya.b(25);
            int i14 = fVar.f4233a;
            F4.a gVar = i14 > 0 ? new F4.g(i14) : new x4.d(17);
            F4.f fVar2 = new F4.f(fVar.f4235c);
            G4.d dVar = new G4.d(fVar.f4234b);
            b bVar2 = new b(applicationContext, new o(dVar, new l(applicationContext), cVar2, cVar, new H4.c(new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, H4.c.f4889b, timeUnit, new SynchronousQueue(), new H4.b("source-unlimited", false))), cVar3), dVar, gVar, fVar2, new R4.h(), bVar, c1355i, c4412e, Collections.EMPTY_LIST);
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                throw M6.j(it4);
            }
            applicationContext.registerComponentCallbacks(bVar2);
            f24208i = bVar2;
            f24209j = false;
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e7);
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f24208i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                try {
                    if (f24208i == null) {
                        a(context, generatedAppGlideModule);
                    }
                } finally {
                }
            }
        }
        return f24208i;
    }

    public final void c(h hVar) {
        synchronized (this.f24217h) {
            try {
                if (this.f24217h.contains(hVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f24217h.add(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(h hVar) {
        synchronized (this.f24217h) {
            try {
                if (!this.f24217h.contains(hVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f24217h.remove(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        char[] cArr = Y4.m.f16700a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f24211b.g(0L);
        this.f24210a.o();
        this.f24214e.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        long j8;
        char[] cArr = Y4.m.f16700a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        Iterator it = this.f24217h.iterator();
        while (it.hasNext()) {
            ((h) it.next()).getClass();
        }
        G4.d dVar = this.f24211b;
        dVar.getClass();
        if (i5 >= 40) {
            dVar.g(0L);
        } else if (i5 >= 20 || i5 == 15) {
            synchronized (dVar) {
                j8 = dVar.f15031a;
            }
            dVar.g(j8 / 2);
        }
        this.f24210a.b(i5);
        this.f24214e.j(i5);
    }
}

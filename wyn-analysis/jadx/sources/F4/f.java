package F4;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.moloco.sdk.internal.ortb.model.C1899m;
import com.moloco.sdk.internal.ortb.model.C1901o;
import ea.T;
import io.flutter.plugin.platform.C2866b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f implements io.flutter.plugin.platform.g {

    /* renamed from: a, reason: collision with root package name */
    public int f3845a;

    /* renamed from: b, reason: collision with root package name */
    public int f3846b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3847c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3848d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3849e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3850f;

    public f(int i5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar, int i10, com.moloco.sdk.internal.g gVar, C1899m c1899m, C1901o c1901o) {
        this.f3845a = i5;
        this.f3847c = fVar;
        this.f3846b = i10;
        this.f3848d = gVar;
        this.f3849e = c1899m;
        this.f3850f = c1901o;
    }

    @Override // io.flutter.plugin.platform.g
    public void a(int i5, int i10) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = (ImageReader) this.f3848d;
        if (imageReader != null && this.f3845a == i5 && this.f3846b == i10) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f3847c).pushImage(null);
            ((ImageReader) this.f3848d).close();
            this.f3848d = null;
        }
        this.f3845a = i5;
        this.f3846b = i10;
        int i11 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f3849e;
        C2866b c2866b = (C2866b) this.f3850f;
        if (i11 >= 33) {
            T.p();
            ImageReader.Builder builderF = T.f(this.f3845a, this.f3846b);
            builderF.setMaxImages(4);
            builderF.setImageFormat(34);
            builderF.setUsage(256L);
            imageReaderNewInstance = builderF.build();
            imageReaderNewInstance.setOnImageAvailableListener(c2866b, handler);
        } else {
            if (i11 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i5, i10, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c2866b, handler);
        }
        this.f3848d = imageReaderNewInstance;
    }

    public synchronized void b() {
        d(0);
    }

    public void c(int i5, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer num = (Integer) navigableMapH.get(Integer.valueOf(i5));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(Integer.valueOf(i5));
                return;
            } else {
                navigableMapH.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i5 + ", this: " + this);
    }

    public void d(int i5) {
        while (this.f3846b > i5) {
            Object objS = ((S3.c) this.f3847c).s();
            gc.b.j(objS);
            b bVarF = f(objS.getClass());
            this.f3846b -= bVarF.b() * bVarF.a(objS);
            c(bVarF.a(objS), objS.getClass());
            if (Log.isLoggable(bVarF.c(), 2)) {
                Log.v(bVarF.c(), "evicted: " + bVarF.a(objS));
            }
        }
    }

    public synchronized Object e(int i5, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i5));
            if (num == null || ((i10 = this.f3846b) != 0 && this.f3845a / i10 < 2 && num.intValue() > i5 * 8)) {
                e eVar = (e) this.f3848d;
                h hVarE0 = (h) ((ArrayDeque) eVar.f421a).poll();
                if (hVarE0 == null) {
                    hVarE0 = eVar.e0();
                }
                dVar = (d) hVarE0;
                dVar.f3842b = i5;
                dVar.f3843c = cls;
            } else {
                e eVar2 = (e) this.f3848d;
                int iIntValue = num.intValue();
                h hVarE02 = (h) ((ArrayDeque) eVar2.f421a).poll();
                if (hVarE02 == null) {
                    hVarE02 = eVar2.e0();
                }
                dVar = (d) hVarE02;
                dVar.f3842b = iIntValue;
                dVar.f3843c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return g(dVar, cls);
    }

    public b f(Class cls) {
        b bVar;
        HashMap map = (HashMap) this.f3850f;
        b bVar2 = (b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public Object g(d dVar, Class cls) {
        b bVarF = f(cls);
        Object objJ = ((S3.c) this.f3847c).j(dVar);
        if (objJ != null) {
            this.f3846b -= bVarF.b() * bVarF.a(objJ);
            c(bVarF.a(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(bVarF.c(), 2)) {
            Log.v(bVarF.c(), "Allocated " + dVar.f3842b + " bytes");
        }
        int i5 = dVar.f3842b;
        switch (bVarF.f3836a) {
            case 0:
                return new byte[i5];
            default:
                return new int[i5];
        }
    }

    @Override // io.flutter.plugin.platform.g
    public int getHeight() {
        return this.f3846b;
    }

    @Override // io.flutter.plugin.platform.g
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f3847c).id();
    }

    @Override // io.flutter.plugin.platform.g
    public Surface getSurface() {
        return ((ImageReader) this.f3848d).getSurface();
    }

    @Override // io.flutter.plugin.platform.g
    public int getWidth() {
        return this.f3845a;
    }

    public NavigableMap h(Class cls) {
        HashMap map = (HashMap) this.f3849e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void i(Object obj) {
        Class<?> cls = obj.getClass();
        b bVarF = f(cls);
        int iA = bVarF.a(obj);
        int iB = bVarF.b() * iA;
        if (iB <= this.f3845a / 2) {
            e eVar = (e) this.f3848d;
            h hVarE0 = (h) ((ArrayDeque) eVar.f421a).poll();
            if (hVarE0 == null) {
                hVarE0 = eVar.e0();
            }
            d dVar = (d) hVarE0;
            dVar.f3842b = iA;
            dVar.f3843c = cls;
            ((S3.c) this.f3847c).r(dVar, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(dVar.f3842b));
            Integer numValueOf = Integer.valueOf(dVar.f3842b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f3846b += iB;
            d(this.f3845a);
        }
    }

    public synchronized void j(int i5) {
        try {
            if (i5 >= 40) {
                b();
            } else if (i5 >= 20 || i5 == 15) {
                d(this.f3845a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public void release() {
        if (((ImageReader) this.f3848d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f3847c).pushImage(null);
            ((ImageReader) this.f3848d).close();
            this.f3848d = null;
        }
        this.f3847c = null;
    }

    @Override // io.flutter.plugin.platform.g
    public /* synthetic */ void scheduleFrame() {
    }

    public f(int i5) {
        this.f3847c = new S3.c(5);
        this.f3848d = new e(0);
        this.f3849e = new HashMap();
        this.f3850f = new HashMap();
        this.f3845a = i5;
    }

    public f(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f3845a = 0;
        this.f3846b = 0;
        this.f3849e = new Handler();
        this.f3850f = new C2866b(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3847c = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
}

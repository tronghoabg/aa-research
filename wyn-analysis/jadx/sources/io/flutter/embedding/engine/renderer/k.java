package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.J;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f37008a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f37010c;

    /* renamed from: h, reason: collision with root package name */
    public final a f37015h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f37009b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f37011d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f37012e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f37013f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f37014g = new ArrayList();

    public k(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f37015h = aVar;
        this.f37008a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        J.f18589i.f18595f.a(new b(this));
    }

    public final void a(p pVar) {
        HashSet hashSet = this.f37013f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((p) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(pVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f37009b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f37008a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i5) {
        if (Build.VERSION.SDK_INT < 29) {
            i iVarD = d();
            return new n(iVarD.f36986a, this.f37012e, this.f37008a, iVarD);
        }
        long andIncrement = this.f37009b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z2 = i5 == 2;
        this.f37008a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z2);
        if (z2) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f37014g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f37009b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f37008a.registerTexture(iVar.f36986a, iVar.f36987b);
        a(iVar);
        return iVar;
    }

    public final void e(int i5) {
        Iterator it = this.f37013f.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i5);
            } else {
                it.remove();
            }
        }
    }

    public final void f(p pVar) {
        HashSet hashSet = this.f37013f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == pVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f37010c != null) {
            this.f37008a.onSurfaceDestroyed();
            if (this.f37011d) {
                this.f37015h.d();
            }
            this.f37011d = false;
            this.f37010c = null;
        }
    }
}

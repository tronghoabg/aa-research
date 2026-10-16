package com.waze.map.d;

import android.content.Context;
import android.content.res.Configuration;
import androidx.collection.LruCache;
import com.waze.jni.protos.NativeBitmap;
import com.waze.map.ap;
import com.waze.map.ax;
import com.waze.map.ay;
import com.waze.map.az;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final ap f28727a;

    /* renamed from: b, reason: collision with root package name */
    private final LruCache f28728b;

    public b(ap apVar) {
        x.f(apVar, "bitmapResolver");
        this.f28727a = apVar;
        this.f28728b = new LruCache(32);
    }

    @Override // com.waze.map.ap
    public final NativeBitmap a(Context context, com.waze.gas.a aVar) {
        x.f(context, "context");
        x.f(aVar, "renderable");
        if (!(aVar instanceof az)) {
            if ((aVar instanceof ax) || (aVar instanceof ay)) {
                return this.f28727a.a(context, aVar);
            }
            throw new i();
        }
        Configuration configuration = context.getResources().getConfiguration();
        x.e(configuration, "getConfiguration(...)");
        a aVar2 = new a(configuration, aVar);
        LruCache lruCache = this.f28728b;
        NativeBitmap nativeBitmap = (NativeBitmap) lruCache.get(aVar2);
        if (nativeBitmap != null) {
            return nativeBitmap;
        }
        NativeBitmap nativeBitmapA = this.f28727a.a(context, aVar);
        lruCache.put(aVar2, nativeBitmapA);
        return nativeBitmapA;
    }
}

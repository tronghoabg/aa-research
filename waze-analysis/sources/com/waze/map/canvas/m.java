package com.waze.map.canvas;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.waze.map.MapViewChooser;
import com.waze.map.cd;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class m {
    public static MainCanvasDelegatorImpl d(u uVar, Lifecycle lifecycle, MapViewChooser mapViewChooser, v vVar, kotlinx.coroutines.b.k kVar, cd cdVar) {
        h.g.b.x.f(uVar, "<this>");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(mapViewChooser, "mapViewChooser");
        h.g.b.x.f(vVar, "swapFactoryBuilder");
        h.g.b.x.f(kVar, "mainMapGeometry");
        h.g.b.x.f(cdVar, "viewportResolver");
        LifecycleCoroutineScope coroutineScope = LifecycleKt.getCoroutineScope(lifecycle);
        ch chVarC = mapViewChooser.c();
        int i2 = mapViewChooser.getContext().getResources().getConfiguration().densityDpi;
        return uVar.a(coroutineScope, kVar, chVarC, cdVar, vVar.a(new l(new WeakReference(mapViewChooser)), mapViewChooser.a()), mapViewChooser.a());
    }

    protected static float e(float f2) {
        return h.k.n.e(h.k.n.f(f2, 150.0f), -150.0f);
    }

    public Bitmap f() {
        throw null;
    }
}

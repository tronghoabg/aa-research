package com.waze.car_lib.i.b;

import android.graphics.Bitmap;
import com.waze.map.b.ed;
import com.waze.map.cj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final cj f19972a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f19973b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.opengl.p f19974c;

    public b(cj cjVar, com.waze.car_lib.i.a.ac acVar, com.waze.map.opengl.p pVar) {
        h.g.b.x.f(cjVar, "presenterBuilder");
        h.g.b.x.f(acVar, "loaderController");
        h.g.b.x.f(pVar, "externalDependencies");
        this.f19972a = cjVar;
        this.f19973b = acVar;
        this.f19974c = pVar;
    }

    static /* synthetic */ String b(Bitmap bitmap, String str) {
        return str + bitmap.getWidth() + "x" + bitmap.getHeight() + ")";
    }

    public final c a(String str, ed edVar) {
        h.g.b.x.f(str, "description");
        h.g.b.x.f(edVar, "controller");
        return new c(str, edVar, this.f19972a, this.f19973b, this.f19974c);
    }
}

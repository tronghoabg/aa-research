package com.waze.search.h;

import android.content.Context;
import android.view.View;
import com.waze.settings.gr;
import com.waze.sound.eb;
import com.waze.sound.js;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class az implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35805b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35806c;

    public /* synthetic */ az(Object obj, Object obj2, int i2) {
        this.f35806c = i2;
        this.f35805b = obj;
        this.f35804a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.waze.shared_infra.s.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.waze.shared_infra.s.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.waze.sound.ig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f35806c) {
            case 0:
                return bx.K((bx) this.f35804a, (com.waze.search.v2.o) this.f35805b);
            case 1:
                return bx.L((bx) this.f35804a, (com.waze.search.v2.o) this.f35805b);
            case 2:
                Context context = ((View) this.f35805b).getContext();
                if (context != null) {
                    ((gr) this.f35804a).W(context);
                }
                return h.ab.f48028a;
            case 3:
                Context context2 = ((View) this.f35805b).getContext();
                if (context2 != null) {
                    ((gr) this.f35804a).W(context2);
                }
                return h.ab.f48028a;
            case 4:
                Context context3 = ((View) this.f35805b).getContext();
                if (context3 != null) {
                    this.f35804a.invoke(context3);
                }
                return h.ab.f48028a;
            case 5:
                Context context4 = ((View) this.f35805b).getContext();
                if (context4 != null) {
                    ((com.waze.settings.tree.a.n) this.f35804a).f37485c.invoke(context4);
                }
                return h.ab.f48028a;
            case 6:
                this.f35805b.b(this.f35804a);
                return h.ab.f48028a;
            case 7:
                ((com.waze.sharedrive.e.at) this.f35805b).o();
                this.f35804a.invoke(null);
                return h.ab.f48028a;
            case 8:
                this.f35805b.invoke();
                this.f35804a.invoke();
                return h.ab.f48028a;
            case 9:
                return com.waze.sound.bg.f((com.waze.sound.bg) this.f35805b, this.f35804a);
            case 10:
                ((eb) this.f35805b).o((String) this.f35804a);
                return h.ab.f48028a;
            case 11:
                ((eb) this.f35805b).n((String) this.f35804a);
                return h.ab.f48028a;
            case 12:
                ((js) this.f35804a).f40345a.e(this.f35805b);
                return h.ab.f48028a;
            case 13:
                this.f35804a.invoke(this.f35805b);
                return h.ab.f48028a;
            case 14:
                return com.waze.bw.c.d.e.a((com.waze.bw.c.d.bu) this.f35804a, this.f35805b);
            case 15:
                return com.waze.bw.c.d.e.b((com.waze.bw.c.d.bu) this.f35804a, this.f35805b);
            case 16:
                return com.waze.bw.c.d.e.c((com.waze.bw.c.d.cd) this.f35804a, this.f35805b);
            case 17:
                return com.waze.bw.c.d.e.g((com.waze.bw.c.d.cd) this.f35804a, this.f35805b);
            case 18:
                return com.waze.bw.c.d.e.f((com.waze.bw.c.d.cd) this.f35804a, this.f35805b);
            case 19:
                return com.waze.bw.c.d.e.e((com.waze.bw.c.d.cd) this.f35804a, this.f35805b);
            default:
                return com.waze.bw.c.d.e.d((com.waze.bw.c.d.cd) this.f35804a, this.f35805b);
        }
    }

    public /* synthetic */ az(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f35806c = i2;
        this.f35804a = obj;
        this.f35805b = obj2;
    }
}

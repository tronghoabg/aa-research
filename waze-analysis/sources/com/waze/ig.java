package com.waze;

import android.view.View;
import com.waze.map.NativeCanvasRenderer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ig implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24603a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24604b;

    public /* synthetic */ ig(Object obj, int i2) {
        this.f24604b = i2;
        this.f24603a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [com.waze.bk.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.waze.b.u, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24604b) {
            case 0:
                iu.onUserCredentialsChangedJNI$lambda$0((iu) this.f24603a);
                break;
            case 1:
                iu.startAutoDriveJNI$lambda$0((iu) this.f24603a);
                break;
            case 2:
                iu.OpenParkingSearchJNI$lambda$0((iu) this.f24603a);
                break;
            case 3:
                iu.openFavoritesJNI$lambda$0((iu) this.f24603a);
                break;
            case 4:
                ix.z(this.f24603a);
                break;
            case 5:
                ix.y((com.waze.sharedui.a.e) this.f24603a);
                break;
            case 6:
                com.waze.main_screen.g.d.a((com.waze.main_screen.g.d) this.f24603a);
                break;
            case 7:
                com.waze.main_screen.g.d.c((com.waze.main_screen.g.d) this.f24603a);
                break;
            case 8:
                com.waze.main_screen.g.f fVar = (com.waze.main_screen.g.f) this.f24603a;
                fVar.animate().alpha(true == fVar.f26389d ? 1.0f : 0.0f).translationX(fVar.f26389d ? 0.0f : ((View) fVar.getParent()).getRight() - fVar.getLeft()).start();
                break;
            case 9:
                ((com.waze.main_screen.g.m) this.f24603a).a();
                break;
            case 10:
                com.waze.map.bq.e((com.waze.map.bq) this.f24603a);
                break;
            case 11:
                com.waze.map.bq.f((com.waze.map.bq) this.f24603a);
                break;
            case 12:
                ((com.waze.map.bq) this.f24603a).i();
                break;
            case 13:
                NativeCanvasRenderer nativeCanvasRenderer = (NativeCanvasRenderer) this.f24603a;
                nativeCanvasRenderer.FlushNTV(nativeCanvasRenderer.q, 0, 0);
                break;
            case 14:
                NativeCanvasRenderer.j((NativeCanvasRenderer) this.f24603a);
                break;
            case 15:
                NativeCanvasRenderer.k((NativeCanvasRenderer) this.f24603a);
                break;
            case 16:
                NativeCanvasRenderer.l((NativeCanvasRenderer) this.f24603a);
                break;
            case 17:
                com.waze.map.gf.d((com.waze.map.gf) this.f24603a);
                break;
            case 18:
                com.waze.map.gs.d((com.waze.map.gs) this.f24603a);
                break;
            case 19:
                int i2 = com.waze.map.gs.f29171a;
                this.f24603a.f();
                break;
            default:
                this.f24603a.invoke();
                break;
        }
    }
}

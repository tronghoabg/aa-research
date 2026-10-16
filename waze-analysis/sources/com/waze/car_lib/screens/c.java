package com.waze.car_lib.screens;

import com.waze.car_lib.f.il;
import com.waze.map.b.ed;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class c extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2) {
        super(0, obj, ed.class, "zoomIn", "zoomIn()V", 0);
        this.f21914a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        switch (this.f21914a) {
            case 0:
                ((ed) this.receiver).z();
                break;
            case 1:
                ((com.waze.car_lib.r.d) this.receiver).x();
                break;
            case 2:
                ((ed) this.receiver).A();
                break;
            case 3:
                ((com.waze.car_lib.r.k) this.receiver).e();
                break;
            case 4:
                ((com.waze.car_lib.r.k) this.receiver).f();
                break;
            case 5:
                ((com.waze.car_lib.r.ai) this.receiver).b();
                break;
            case 6:
                ((com.waze.car_lib.f.cw) this.receiver).l();
                break;
            case 7:
                ((com.waze.car_lib.f.cw) this.receiver).k();
                break;
            case 8:
                ((com.waze.car_lib.f.cw) this.receiver).i();
                break;
            case 9:
                ((il) this.receiver).h();
                break;
            case 10:
                com.waze.map.b.bf.c((com.waze.map.b.aj) this.receiver);
                break;
            case 11:
                com.waze.map.b.bf.d((com.waze.map.b.aj) this.receiver);
                break;
            case 12:
                com.waze.map.b.bf.c((com.waze.map.b.aj) this.receiver);
                break;
            case 13:
                com.waze.map.b.bf.d((com.waze.map.b.aj) this.receiver);
                break;
            case 14:
                com.waze.map.b.bf.c((com.waze.map.b.aj) this.receiver);
                break;
            case 15:
                com.waze.map.b.bf.d((com.waze.map.b.aj) this.receiver);
                break;
            case 16:
                ((com.waze.car_lib.f.ax) this.receiver).t();
                break;
            case 17:
                ((com.waze.car_lib.r.bc) this.receiver).j();
                break;
            case 18:
                ((com.waze.car_lib.f.ax) this.receiver).x();
                break;
            case 19:
                ((com.waze.car_lib.f.ax) this.receiver).z();
                break;
            default:
                ((com.waze.car_lib.r.bk) this.receiver).v();
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.car_lib.r.d.class, "onCloseClicked", "onCloseClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[] bArr, byte[] bArr2) {
        super(0, obj, com.waze.car_lib.f.ax.class, "settingsClicked", "settingsClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[] cArr) {
        super(0, obj, ed.class, "zoomOut", "zoomOut()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[] cArr, byte[] bArr) {
        super(0, obj, com.waze.car_lib.r.bk.class, "zoomInClicked", "zoomInClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, float[] fArr) {
        super(0, obj, com.waze.car_lib.f.cw.class, "openTermsOfService", "openTermsOfService()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, int[] iArr) {
        super(0, obj, com.waze.car_lib.r.k.class, "onMore", "onMore()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, short[] sArr) {
        super(0, obj, com.waze.car_lib.r.k.class, "onAccept", "onAccept()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, boolean[] zArr) {
        super(0, obj, com.waze.car_lib.r.ai.class, "onExitClicked", "onExitClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, byte[][] bArr) {
        super(0, obj, com.waze.car_lib.f.cw.class, "openPrivacyPolicy", "openPrivacyPolicy()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, char[][] cArr) {
        super(0, obj, com.waze.car_lib.f.cw.class, "openLocationSettingsClicked", "openLocationSettingsClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, float[][] fArr) {
        super(0, obj, com.waze.map.b.bf.class, "zoomIn", "zoomIn(Lcom/waze/map/controller/MainMapController;)V", 1);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, short[][] sArr) {
        super(0, obj, il.class, "loginSucceededOkClicked", "loginSucceededOkClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, boolean[][] zArr) {
        super(0, obj, com.waze.map.b.bf.class, "zoomOut", "zoomOut(Lcom/waze/map/controller/MainMapController;)V", 1);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, float[][][] fArr) {
        super(0, obj, com.waze.car_lib.f.ax.class, "searchClicked", "searchClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, int[][][] iArr) {
        super(0, obj, com.waze.car_lib.f.ax.class, "companinioClicked", "companinioClicked()V", 0);
        this.f21914a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(Object obj, int i2, boolean[][][] zArr) {
        super(0, obj, com.waze.car_lib.r.bc.class, "centerOnMeClicked", "centerOnMeClicked()V", 0);
        this.f21914a = i2;
    }
}

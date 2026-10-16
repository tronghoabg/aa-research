package com.waze.car_lib.screens;

import com.waze.car_lib.f.gg;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.r.dp;
import com.waze.map.b.ed;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class cc extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, byte[] bArr) {
        super(0, obj, gg.class, "subAlertScreenCloseClicked", "subAlertScreenCloseClicked()V", 0);
        this.f21919a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        switch (this.f21919a) {
            case 0:
                ((dp) this.receiver).b();
                break;
            case 1:
                ((gg) this.receiver).e();
                break;
            case 2:
                ((gw) this.receiver).f();
                break;
            case 3:
                ((ed) this.receiver).z();
                break;
            case 4:
                ((ed) this.receiver).A();
                break;
            case 5:
                ((gw) this.receiver).f();
                break;
            case 6:
                com.waze.map.b.bf.c((com.waze.map.b.aj) this.receiver);
                break;
            default:
                com.waze.map.b.bf.d((com.waze.map.b.aj) this.receiver);
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2) {
        super(0, obj, dp.class, "legalButtonClicked", "legalButtonClicked()V", 0);
        this.f21919a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, char[] cArr) {
        super(0, obj, gw.class, "onNd4cInfoButtonClicked", "onNd4cInfoButtonClicked()V", 0);
        this.f21919a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, float[] fArr) {
        super(0, obj, com.waze.map.b.bf.class, "zoomIn", "zoomIn(Lcom/waze/map/controller/MainMapController;)V", 1);
        this.f21919a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, int[] iArr) {
        super(0, obj, ed.class, "zoomOut", "zoomOut()V", 0);
        this.f21919a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, short[] sArr) {
        super(0, obj, ed.class, "zoomIn", "zoomIn()V", 0);
        this.f21919a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc(Object obj, int i2, byte[][] bArr) {
        super(0, obj, com.waze.map.b.bf.class, "zoomOut", "zoomOut(Lcom/waze/map/controller/MainMapController;)V", 1);
        this.f21919a = i2;
    }
}

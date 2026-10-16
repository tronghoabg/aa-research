package com.waze.bx;

import com.waze.ConfigManager;
import h.ab;
import h.g.b.u;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class d extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2) {
        super(0, obj, i.class, "enableMapStats", "enableMapStats()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: Failed to inline method: com.waze.bx.i.r(com.waze.bx.i):void */
    /* JADX WARN: Not passed register '(r0 I:com.waze.config.b)' in method call: com.waze.bx.i.r(com.waze.bx.i):void */
    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        switch (this.f18179a) {
            case 0:
                i.g((i) this.receiver);
                break;
            case 1:
                i.r((i) this.receiver);
                break;
            case 2:
                i iVar = (i) this.receiver;
                aj.z(iVar.f18196d, null, null, new e(iVar, null), 3);
                break;
            case 3:
                ((i) this.receiver).f18193a.a().c(new com.waze.app_nav.hub.g("LocationFailedActivity", new c()));
                break;
            case 4:
                i.p((i) this.receiver);
                break;
            case 5:
                i.s((i) this.receiver);
                break;
            case 6:
                ((ConfigManager) this.receiver).showDebugConfigList();
                break;
            case 7:
                i.m((i) this.receiver);
                break;
            case 8:
                i.h((i) this.receiver);
                break;
            case 9:
                i.j((i) this.receiver);
                break;
            case 10:
                i.k((i) this.receiver);
                break;
            case 11:
                i.l((i) this.receiver);
                break;
            case 12:
                i.i((i) this.receiver);
                break;
            default:
                i.n((i) this.receiver);
                break;
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[] bArr) {
        super(0, obj, i.class, "toggleNewAndroidRendererConfig", "toggleNewAndroidRendererConfig()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, char[] cArr) {
        super(0, obj, i.class, "cctts", "cctts()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, float[] fArr) {
        super(0, obj, ConfigManager.class, "showDebugConfigList", "showDebugConfigList()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, int[] iArr) {
        super(0, obj, i.class, "resetOvTooltip", "resetOvTooltip()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, short[] sArr) {
        super(0, obj, i.class, "openLocFail", "openLocFail()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, boolean[] zArr) {
        super(0, obj, i.class, "toggleTrustlessTokenLogging", "toggleTrustlessTokenLogging()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[][] bArr) {
        super(0, obj, i.class, "inspectwebview", "inspectwebview()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, char[][] cArr) {
        super(0, obj, i.class, "insight", "insight()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, float[][] fArr) {
        super(0, obj, i.class, "insightFTE", "insightFTE()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, int[][] iArr) {
        super(0, obj, i.class, "insightregp", "insightregp()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, short[][] sArr) {
        super(0, obj, i.class, "insightreg", "insightreg()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, boolean[][] zArr) {
        super(0, obj, i.class, "insightregs", "insightregs()V", 0);
        this.f18179a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Object obj, int i2, byte[][][] bArr) {
        super(0, obj, i.class, "nmToggleDelay", "nmToggleDelay()V", 0);
        this.f18179a = i2;
    }
}

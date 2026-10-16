package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class ac extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f27009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2) {
        super(0, obj, com.waze.ui.p.g.class, "showOverview", "showOverview()V", 0);
        this.f27009a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        switch (this.f27009a) {
            case 0:
                ((com.waze.ui.p.g) this.receiver).h();
                break;
            case 1:
                ((bf) this.receiver).H();
                break;
            case 2:
                ((com.waze.ui.p.g) this.receiver).g();
                break;
            case 3:
                ((bf) this.receiver).E();
                break;
            case 4:
                ((com.waze.ui.p.g) this.receiver).h();
                break;
            case 5:
                ((com.waze.ui.p.g) this.receiver).g();
                break;
            case 6:
                ((bs) this.receiver).D();
                break;
            case 7:
                ((bs) this.receiver).A();
                break;
            default:
                ((bs) this.receiver).C();
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, byte[] bArr) {
        super(0, obj, bf.class, "onOpenSoundSettings", "onOpenSoundSettings()V", 0);
        this.f27009a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, char[] cArr) {
        super(0, obj, com.waze.ui.p.g.class, "recenter", "recenter()V", 0);
        this.f27009a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, float[] fArr) {
        super(0, obj, bs.class, "showDirections", "showDirections()V", 0);
        this.f27009a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, short[] sArr) {
        super(0, obj, bf.class, "closeSettings", "closeSettings()V", 0);
        this.f27009a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, byte[][] bArr) {
        super(0, obj, bs.class, "onAlternativeRoutesEntrypointClicked", "onAlternativeRoutesEntrypointClicked()V", 0);
        this.f27009a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2, char[][] cArr) {
        super(0, obj, bs.class, "onResumeDriveHandled", "onResumeDriveHandled()V", 0);
        this.f27009a = i2;
    }
}

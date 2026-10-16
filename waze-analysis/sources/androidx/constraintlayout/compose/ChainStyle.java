package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChainStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final ChainStyle Packed;
    private static final ChainStyle Spread;
    private static final ChainStyle SpreadInside;
    private final Float bias;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        Companion = companion;
        int i2 = 2;
        Spread = new ChainStyle("spread", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        SpreadInside = new ChainStyle("spread_inside", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        Packed = companion.Packed(0.5f);
    }

    public /* synthetic */ ChainStyle(String str, Float f2, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? null : f2);
    }

    public final Float getBias$constraintlayout_compose() {
        return this.bias;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getPacked$annotations() {
        }

        public static /* synthetic */ void getSpread$annotations() {
        }

        public static /* synthetic */ void getSpreadInside$annotations() {
        }

        public final ChainStyle Packed(float f2) {
            return new ChainStyle("packed", Float.valueOf(f2));
        }

        public final ChainStyle getPacked() {
            return ChainStyle.Packed;
        }

        public final ChainStyle getSpread() {
            return ChainStyle.Spread;
        }

        public final ChainStyle getSpreadInside() {
            return ChainStyle.SpreadInside;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public ChainStyle(String str, Float f2) {
        this.name = str;
        this.bias = f2;
    }
}

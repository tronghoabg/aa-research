package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Dimension {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public interface Coercible extends Dimension {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Coercible getFillToConstraints() {
            return new DimensionDescription("spread");
        }

        public final Dimension getMatchParent() {
            return new DimensionDescription("parent");
        }

        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription("preferWrap");
        }

        public final Dimension getWrapContent() {
            return new DimensionDescription("wrap");
        }

        public final Dimension percent(float f2) {
            StringBuilder sb = new StringBuilder();
            sb.append(f2 * 100.0f);
            sb.append('%');
            return new DimensionDescription(sb.toString());
        }

        /* renamed from: preferredValue-0680j_4, reason: not valid java name */
        public final MinCoercible m11524preferredValue0680j_4(float f2) {
            DimensionDescription dimensionDescription = new DimensionDescription("spread");
            dimensionDescription.getMax$constraintlayout_compose().m11526update0680j_4(f2);
            return dimensionDescription;
        }

        public final Dimension ratio(String str) {
            return new DimensionDescription(str);
        }

        /* renamed from: value-0680j_4, reason: not valid java name */
        public final Dimension m11525value0680j_4(float f2) {
            return new DimensionDescription(f2, (o) null);
        }
    }

    /* compiled from: WazeSource */
    public interface MaxCoercible extends Dimension {
    }

    /* compiled from: WazeSource */
    public interface MinCoercible extends Dimension {
    }
}

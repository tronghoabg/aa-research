package androidx.compose.ui.graphics.shadow;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidShadowContext implements PlatformShadowContext, DropShadowRendererProvider, InnerShadowRendererProvider {
    private MutableScatterMap<ShadowKey, DropShadowRenderer> dropShadowCache;
    private MutableScatterMap<ShadowKey, InnerShadowRenderer> innerShadowCache;
    private ShadowKey shadowKey;

    private final MutableScatterMap<ShadowKey, DropShadowRenderer> obtainDropShadowCache() {
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.dropShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final MutableScatterMap<ShadowKey, InnerShadowRenderer> obtainInnerShadowCache() {
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap = this.innerShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.innerShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final ShadowKey obtainShadowKey() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public void clearCache() {
        synchronized (this) {
            MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
            if (mutableScatterMap != null) {
                mutableScatterMap.clear();
            }
            MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = this.innerShadowCache;
            if (mutableScatterMap2 != null) {
                mutableScatterMap2.clear();
            }
            this.shadowKey = null;
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
    /* renamed from: obtainDropShadowRenderer-eZhPAX0, reason: not valid java name */
    public DropShadowRenderer mo8966obtainDropShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        DropShadowRenderer dropShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(shape);
            shadowKeyObtainShadowKey.m8972setSizeuvyYCjk(j2);
            shadowKeyObtainShadowKey.setLayoutDirection(layoutDirection);
            shadowKeyObtainShadowKey.setDensity(density.getDensity());
            shadowKeyObtainShadowKey.setShadow(shadow.copyWithoutOffset$ui_graphics());
            dropShadowRenderer = obtainDropShadowCache().get(shadowKeyObtainShadowKey);
            if (dropShadowRenderer == null) {
                DropShadowRenderer dropShadowRenderer2 = new DropShadowRenderer(shadow, shape.mo2037createOutlinePq9zytI(j2, layoutDirection, density));
                obtainDropShadowCache().set(ShadowKey.m8968copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), dropShadowRenderer2);
                dropShadowRenderer = dropShadowRenderer2;
            }
        }
        return dropShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
    /* renamed from: obtainInnerShadowRenderer-eZhPAX0, reason: not valid java name */
    public InnerShadowRenderer mo8967obtainInnerShadowRenderereZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, Density density, Shadow shadow) {
        InnerShadowRenderer innerShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(shape);
            shadowKeyObtainShadowKey.m8972setSizeuvyYCjk(j2);
            shadowKeyObtainShadowKey.setLayoutDirection(layoutDirection);
            shadowKeyObtainShadowKey.setDensity(density.getDensity());
            shadowKeyObtainShadowKey.setShadow(shadow);
            innerShadowRenderer = obtainInnerShadowCache().get(shadowKeyObtainShadowKey);
            if (innerShadowRenderer == null) {
                InnerShadowRenderer innerShadowRenderer2 = new InnerShadowRenderer(shadow, shape.mo2037createOutlinePq9zytI(j2, layoutDirection, density));
                obtainInnerShadowCache().set(ShadowKey.m8968copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), innerShadowRenderer2);
                innerShadowRenderer = innerShadowRenderer2;
            }
        }
        return innerShadowRenderer;
    }

    /* compiled from: WazeSource */
    public final class ShadowKey {
        public static final int $stable = 8;
        private float density;
        private LayoutDirection layoutDirection;
        private Shadow shadow;
        private Shape shape;
        private long size;

        public /* synthetic */ ShadowKey(Shape shape, long j2, LayoutDirection layoutDirection, float f2, Shadow shadow, int i2, o oVar) {
            this((i2 & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i2 & 2) != 0 ? Size.Companion.m8058getZeroNHjbRc() : j2, (i2 & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? null : shadow, null);
        }

        /* renamed from: copy-eZhPAX0$default, reason: not valid java name */
        public static /* synthetic */ ShadowKey m8968copyeZhPAX0$default(ShadowKey shadowKey, Shape shape, long j2, LayoutDirection layoutDirection, float f2, Shadow shadow, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                shape = shadowKey.shape;
            }
            if ((i2 & 2) != 0) {
                j2 = shadowKey.size;
            }
            if ((i2 & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            if ((i2 & 8) != 0) {
                f2 = shadowKey.density;
            }
            if ((i2 & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            Shadow shadow2 = shadow;
            LayoutDirection layoutDirection2 = layoutDirection;
            return shadowKey.m8970copyeZhPAX0(shape, j2, layoutDirection2, f2, shadow2);
        }

        public final Shape component1() {
            return this.shape;
        }

        /* renamed from: component2-NH-jbRc, reason: not valid java name */
        public final long m8969component2NHjbRc() {
            return this.size;
        }

        public final LayoutDirection component3() {
            return this.layoutDirection;
        }

        public final float component4() {
            return this.density;
        }

        public final Shadow component5() {
            return this.shadow;
        }

        /* renamed from: copy-eZhPAX0, reason: not valid java name */
        public final ShadowKey m8970copyeZhPAX0(Shape shape, long j2, LayoutDirection layoutDirection, float f2, Shadow shadow) {
            return new ShadowKey(shape, j2, layoutDirection, f2, shadow, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) obj;
            return x.n(this.shape, shadowKey.shape) && Size.m8045equalsimpl0(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && x.n(this.shadow, shadowKey.shadow);
        }

        public final float getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final Shape getShape() {
            return this.shape;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m8971getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            int iHashCode = (((((this.shape.hashCode() * 31) + Size.m8050hashCodeimpl(this.size)) * 31) + this.layoutDirection.hashCode()) * 31) + Float.floatToIntBits(this.density);
            Shadow shadow = this.shadow;
            return (iHashCode * 31) + (shadow == null ? 0 : shadow.hashCode());
        }

        public final void setDensity(float f2) {
            this.density = f2;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setShadow(Shadow shadow) {
            this.shadow = shadow;
        }

        public final void setShape(Shape shape) {
            this.shape = shape;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m8972setSizeuvyYCjk(long j2) {
            this.size = j2;
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) Size.m8053toStringimpl(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
        }

        public /* synthetic */ ShadowKey(Shape shape, long j2, LayoutDirection layoutDirection, float f2, Shadow shadow, o oVar) {
            this(shape, j2, layoutDirection, f2, shadow);
        }

        private ShadowKey(Shape shape, long j2, LayoutDirection layoutDirection, float f2, Shadow shadow) {
            this.shape = shape;
            this.size = j2;
            this.layoutDirection = layoutDirection;
            this.density = f2;
            this.shadow = shadow;
        }
    }
}

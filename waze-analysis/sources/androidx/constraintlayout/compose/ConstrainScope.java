package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.ad;
import h.g.b.o;
import h.g.b.x;
import h.i.a;
import h.l.r;

/* compiled from: WazeSource */
@LayoutScopeMarker
/* loaded from: classes3.dex */
public final class ConstrainScope {
    static final /* synthetic */ r<Object>[] $$delegatedProperties = {new ad(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0), new ad(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new ad(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new ad(ConstrainScope.class, "scaleX", "getScaleX()F", 0), new ad(ConstrainScope.class, "scaleY", "getScaleY()F", 0), new ad(ConstrainScope.class, "rotationX", "getRotationX()F", 0), new ad(ConstrainScope.class, "rotationY", "getRotationY()F", 0), new ad(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0), new ad(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new ad(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new ad(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new ad(ConstrainScope.class, "pivotX", "getPivotX()F", 0), new ad(ConstrainScope.class, "pivotY", "getPivotY()F", 0), new ad(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new ad(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    public static final int $stable = 0;
    private final VerticalAnchorable absoluteLeft;
    private final VerticalAnchorable absoluteRight;
    private float alpha;
    private final BaselineAnchorable baseline;
    private final HorizontalAnchorable bottom;
    private final CLObject containerObject;
    private final VerticalAnchorable end;
    private float horizontalBias;
    private final FloatProperty horizontalChainWeight$delegate;
    private final Object id;
    private final FloatProperty pivotX$delegate;
    private final FloatProperty pivotY$delegate;
    private final FloatProperty rotationX$delegate;
    private final FloatProperty rotationY$delegate;
    private final FloatProperty rotationZ$delegate;
    private final FloatProperty scaleX$delegate;
    private final FloatProperty scaleY$delegate;
    private final VerticalAnchorable start;
    private final HorizontalAnchorable top;
    private final DpProperty translationX$delegate;
    private final DpProperty translationY$delegate;
    private final DpProperty translationZ$delegate;
    private float verticalBias;
    private final FloatProperty verticalChainWeight$delegate;
    private final ConstrainScope$visibility$2 visibility$delegate;
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference("parent");
    private final DimensionProperty width$delegate = new DimensionProperty(Dimension.Companion.getWrapContent());
    private final DimensionProperty height$delegate = new DimensionProperty(Dimension.Companion.getWrapContent());

    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.constraintlayout.compose.ConstrainScope$visibility$2] */
    public ConstrainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.containerObject = cLObject;
        this.start = new ConstraintVerticalAnchorable(-2, cLObject);
        this.absoluteLeft = new ConstraintVerticalAnchorable(0, cLObject);
        this.top = new ConstraintHorizontalAnchorable(0, cLObject);
        this.end = new ConstraintVerticalAnchorable(-1, cLObject);
        this.absoluteRight = new ConstraintVerticalAnchorable(1, cLObject);
        this.bottom = new ConstraintHorizontalAnchorable(1, cLObject);
        this.baseline = new ConstraintBaselineAnchorable(cLObject);
        final Visibility visible = Visibility.Companion.getVisible();
        this.visibility$delegate = new a<Visibility>(visible) { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$2
            /* renamed from: afterChange, reason: avoid collision after fix types in other method */
            protected void afterChange2(r<?> rVar, Visibility visibility, Visibility visibility2) {
                this.this$0.getContainerObject$constraintlayout_compose().putString(rVar.getName(), visibility2.getName$constraintlayout_compose());
            }

            @Override // h.i.a
            public /* bridge */ /* synthetic */ void afterChange(r rVar, Visibility visibility, Visibility visibility2) {
                afterChange2((r<?>) rVar, visibility, visibility2);
            }
        };
        this.alpha = 1.0f;
        this.scaleX$delegate = new FloatProperty(this, 1.0f, null, 2, null);
        int i2 = 2;
        o oVar = null;
        String str = null;
        this.scaleY$delegate = new FloatProperty(this, 1.0f, str, i2, oVar);
        float f2 = 0.0f;
        this.rotationX$delegate = new FloatProperty(this, f2, str, i2, oVar);
        this.rotationY$delegate = new FloatProperty(this, f2, str, i2, oVar);
        this.rotationZ$delegate = new FloatProperty(this, f2, str, i2, oVar);
        this.translationX$delegate = new DpProperty(this, f2, str, i2, oVar);
        this.translationY$delegate = new DpProperty(this, f2, str, i2, oVar);
        this.translationZ$delegate = new DpProperty(this, f2, str, i2, oVar);
        float f3 = 0.5f;
        this.pivotX$delegate = new FloatProperty(this, f3, str, i2, oVar);
        this.pivotY$delegate = new FloatProperty(this, f3, str, i2, oVar);
        this.horizontalChainWeight$delegate = new FloatProperty(Float.NaN, "hWeight");
        this.verticalChainWeight$delegate = new FloatProperty(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }

    public static /* synthetic */ void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constrainedLayoutReference, f2);
    }

    public static /* synthetic */ void centerVerticallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.5f;
        }
        constrainScope.centerVerticallyTo(constrainedLayoutReference, f2);
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m11442linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        float f7;
        ConstrainScope constrainScope2;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor3;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor4;
        float f8 = (i2 & 64) != 0 ? 0.5f : f6;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        float f10 = (i2 & 16) != 0 ? 0.0f : f4;
        float f11 = (i2 & 8) != 0 ? 0.0f : f3;
        if ((i2 & 4) != 0) {
            f7 = 0.0f;
            horizontalAnchor3 = horizontalAnchor;
            horizontalAnchor4 = horizontalAnchor2;
            constrainScope2 = constrainScope;
        } else {
            f7 = f2;
            constrainScope2 = constrainScope;
            horizontalAnchor3 = horizontalAnchor;
            horizontalAnchor4 = horizontalAnchor2;
        }
        constrainScope2.m11450linkTo8ZKsbrE(horizontalAnchor3, horizontalAnchor4, f7, f11, f10, f9, f8);
    }

    /* renamed from: linkTo-R7zmacU$default, reason: not valid java name */
    public static /* synthetic */ void m11444linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i2, Object obj) {
        float f12 = (i2 & 8192) != 0 ? 0.5f : f11;
        float f13 = (i2 & 4096) != 0 ? 0.5f : f10;
        float f14 = (i2 & 2048) != 0 ? 0.0f : f9;
        float f15 = (i2 & 1024) != 0 ? 0.0f : f8;
        float f16 = (i2 & 512) != 0 ? 0.0f : f7;
        float f17 = (i2 & 256) != 0 ? 0.0f : f6;
        float f18 = (i2 & 128) != 0 ? 0.0f : f5;
        float f19 = (i2 & 64) != 0 ? 0.0f : f4;
        constrainScope.m11452linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i2 & 16) != 0 ? 0.0f : f2, (i2 & 32) != 0 ? 0.0f : f3, f19, f18, f17, f16, f15, f14, f13, f12);
    }

    /* renamed from: asDimension-0680j_4, reason: not valid java name */
    public final Dimension m11445asDimension0680j_4(float f2) {
        return Dimension.Companion.m11525value0680j_4(f2);
    }

    public final void centerAround(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        m11442linkTo8ZKsbrE$default(this, horizontalAnchor, horizontalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    public final void centerHorizontallyTo(ConstrainedLayoutReference constrainedLayoutReference, float f2) {
        m11443linkTo8ZKsbrE$default(this, constrainedLayoutReference.getStart(), constrainedLayoutReference.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, f2, 60, (Object) null);
    }

    public final void centerTo(ConstrainedLayoutReference constrainedLayoutReference) {
        m11444linkToR7zmacU$default(this, constrainedLayoutReference.getStart(), constrainedLayoutReference.getTop(), constrainedLayoutReference.getEnd(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public final void centerVerticallyTo(ConstrainedLayoutReference constrainedLayoutReference, float f2) {
        m11442linkTo8ZKsbrE$default(this, constrainedLayoutReference.getTop(), constrainedLayoutReference.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, f2, 60, (Object) null);
    }

    /* renamed from: circular-wH6b6FI, reason: not valid java name */
    public final void m11446circularwH6b6FI(ConstrainedLayoutReference constrainedLayoutReference, float f2, float f3) {
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.add(CLString.from(constrainedLayoutReference.getId$constraintlayout_compose().toString()));
        cLArray.add(new CLNumber(f2));
        cLArray.add(new CLNumber(f3));
        this.containerObject.put("circular", cLArray);
    }

    public final void clearConstraints() {
        clearHorizontal();
        clearVertical();
        this.containerObject.remove("circular");
    }

    public final void clearHorizontal() {
        this.containerObject.remove(TtmlNode.LEFT);
        this.containerObject.remove(TtmlNode.RIGHT);
        this.containerObject.remove(TtmlNode.START);
        this.containerObject.remove(TtmlNode.END);
    }

    public final void clearVertical() {
        this.containerObject.remove("top");
        this.containerObject.remove("bottom");
        this.containerObject.remove("baseline");
    }

    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final BaselineAnchorable getBaseline() {
        return this.baseline;
    }

    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    public final CLObject getContainerObject$constraintlayout_compose() {
        return this.containerObject;
    }

    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    public final Dimension getHeight() {
        return this.height$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getHorizontalChainWeight() {
        return this.horizontalChainWeight$delegate.getValue(this, $$delegatedProperties[13]).floatValue();
    }

    public final Object getId$constraintlayout_compose() {
        return this.id;
    }

    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    public final float getPivotX() {
        return this.pivotX$delegate.getValue(this, $$delegatedProperties[11]).floatValue();
    }

    public final float getPivotY() {
        return this.pivotY$delegate.getValue(this, $$delegatedProperties[12]).floatValue();
    }

    public final float getRotationX() {
        return this.rotationX$delegate.getValue(this, $$delegatedProperties[5]).floatValue();
    }

    public final float getRotationY() {
        return this.rotationY$delegate.getValue(this, $$delegatedProperties[6]).floatValue();
    }

    public final float getRotationZ() {
        return this.rotationZ$delegate.getValue(this, $$delegatedProperties[7]).floatValue();
    }

    public final float getScaleX() {
        return this.scaleX$delegate.getValue(this, $$delegatedProperties[3]).floatValue();
    }

    public final float getScaleY() {
        return this.scaleY$delegate.getValue(this, $$delegatedProperties[4]).floatValue();
    }

    public final VerticalAnchorable getStart() {
        return this.start;
    }

    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: not valid java name */
    public final float m11447getTranslationXD9Ej5fM() {
        return this.translationX$delegate.getValue(this, $$delegatedProperties[8]).m11178unboximpl();
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: not valid java name */
    public final float m11448getTranslationYD9Ej5fM() {
        return this.translationY$delegate.getValue(this, $$delegatedProperties[9]).m11178unboximpl();
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: not valid java name */
    public final float m11449getTranslationZD9Ej5fM() {
        return this.translationZ$delegate.getValue(this, $$delegatedProperties[10]).m11178unboximpl();
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public final float getVerticalChainWeight() {
        return this.verticalChainWeight$delegate.getValue(this, $$delegatedProperties[14]).floatValue();
    }

    public final Visibility getVisibility() {
        return getValue(this, $$delegatedProperties[2]);
    }

    public final Dimension getWidth() {
        return this.width$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m11450linkTo8ZKsbrE(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f2, float f3, float f4, float f5, float f6) {
        this.top.mo11426linkToVpY3zN4(horizontalAnchor, f2, f4);
        this.bottom.mo11426linkToVpY3zN4(horizontalAnchor2, f3, f5);
        this.containerObject.putNumber("vBias", f6);
    }

    /* renamed from: linkTo-R7zmacU, reason: not valid java name */
    public final void m11452linkToR7zmacU(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        m11451linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, f2, f4, f6, f8, f10);
        m11450linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, f3, f5, f7, f9, f11);
    }

    public final void resetDimensions() {
        setWidth(Dimension.Companion.getWrapContent());
        setHeight(Dimension.Companion.getWrapContent());
    }

    public final void resetTransforms() {
        this.containerObject.remove("alpha");
        this.containerObject.remove("scaleX");
        this.containerObject.remove("scaleY");
        this.containerObject.remove("rotationX");
        this.containerObject.remove("rotationY");
        this.containerObject.remove("rotationZ");
        this.containerObject.remove("translationX");
        this.containerObject.remove("translationY");
        this.containerObject.remove("translationZ");
        this.containerObject.remove("pivotX");
        this.containerObject.remove("pivotY");
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
        if (Float.isNaN(f2)) {
            return;
        }
        this.containerObject.putNumber("alpha", f2);
    }

    public final void setHeight(Dimension dimension) {
        this.height$delegate.setValue(this, $$delegatedProperties[1], dimension);
    }

    public final void setHorizontalBias(float f2) {
        this.horizontalBias = f2;
        if (Float.isNaN(f2)) {
            return;
        }
        this.containerObject.putNumber("hBias", f2);
    }

    public final void setHorizontalChainWeight(float f2) {
        this.horizontalChainWeight$delegate.setValue(this, $$delegatedProperties[13], Float.valueOf(f2));
    }

    public final void setPivotX(float f2) {
        this.pivotX$delegate.setValue(this, $$delegatedProperties[11], Float.valueOf(f2));
    }

    public final void setPivotY(float f2) {
        this.pivotY$delegate.setValue(this, $$delegatedProperties[12], Float.valueOf(f2));
    }

    public final void setRotationX(float f2) {
        this.rotationX$delegate.setValue(this, $$delegatedProperties[5], Float.valueOf(f2));
    }

    public final void setRotationY(float f2) {
        this.rotationY$delegate.setValue(this, $$delegatedProperties[6], Float.valueOf(f2));
    }

    public final void setRotationZ(float f2) {
        this.rotationZ$delegate.setValue(this, $$delegatedProperties[7], Float.valueOf(f2));
    }

    public final void setScaleX(float f2) {
        this.scaleX$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f2));
    }

    public final void setScaleY(float f2) {
        this.scaleY$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f2));
    }

    /* renamed from: setTranslationX-0680j_4, reason: not valid java name */
    public final void m11453setTranslationX0680j_4(float f2) {
        this.translationX$delegate.setValue(this, $$delegatedProperties[8], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationY-0680j_4, reason: not valid java name */
    public final void m11454setTranslationY0680j_4(float f2) {
        this.translationY$delegate.setValue(this, $$delegatedProperties[9], Dp.m11162boximpl(f2));
    }

    /* renamed from: setTranslationZ-0680j_4, reason: not valid java name */
    public final void m11455setTranslationZ0680j_4(float f2) {
        this.translationZ$delegate.setValue(this, $$delegatedProperties[10], Dp.m11162boximpl(f2));
    }

    public final void setVerticalBias(float f2) {
        this.verticalBias = f2;
        if (Float.isNaN(f2)) {
            return;
        }
        this.containerObject.putNumber("vBias", f2);
    }

    public final void setVerticalChainWeight(float f2) {
        this.verticalChainWeight$delegate.setValue(this, $$delegatedProperties[14], Float.valueOf(f2));
    }

    public final void setVisibility(Visibility visibility) {
        setValue(this, $$delegatedProperties[2], visibility);
    }

    public final void setWidth(Dimension dimension) {
        this.width$delegate.setValue(this, $$delegatedProperties[0], dimension);
    }

    /* compiled from: WazeSource */
    final class DpProperty extends a<Dp> {
        private final String nameOverride;

        private DpProperty(float f2, String str) {
            super(Dp.m11162boximpl(f2));
            this.nameOverride = str;
        }

        @Override // h.i.a
        public /* bridge */ /* synthetic */ void afterChange(r rVar, Dp dp, Dp dp2) {
            m11456afterChangeVpY3zN4(rVar, dp.m11178unboximpl(), dp2.m11178unboximpl());
        }

        /* renamed from: afterChange-VpY3zN4, reason: not valid java name */
        protected void m11456afterChangeVpY3zN4(r<?> rVar, float f2, float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            ConstrainScope constrainScope = ConstrainScope.this;
            String name = this.nameOverride;
            CLObject containerObject$constraintlayout_compose = constrainScope.getContainerObject$constraintlayout_compose();
            if (name == null) {
                name = rVar.getName();
            }
            containerObject$constraintlayout_compose.putNumber(name, f3);
        }

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f2, String str, o oVar) {
            this(f2, str);
        }

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f2, String str, int i2, o oVar) {
            this(constrainScope, f2, (i2 & 2) != 0 ? null : str, null);
        }
    }

    /* compiled from: WazeSource */
    final class FloatProperty extends a<Float> {
        private final String nameOverride;

        public FloatProperty(float f2, String str) {
            super(Float.valueOf(f2));
            this.nameOverride = str;
        }

        protected void afterChange(r<?> rVar, float f2, float f3) {
            if (Float.isNaN(f3)) {
                return;
            }
            ConstrainScope constrainScope = ConstrainScope.this;
            String name = this.nameOverride;
            CLObject containerObject$constraintlayout_compose = constrainScope.getContainerObject$constraintlayout_compose();
            if (name == null) {
                name = rVar.getName();
            }
            containerObject$constraintlayout_compose.putNumber(name, f3);
        }

        public /* synthetic */ FloatProperty(ConstrainScope constrainScope, float f2, String str, int i2, o oVar) {
            this(f2, (i2 & 2) != 0 ? null : str);
        }

        @Override // h.i.a
        public /* bridge */ /* synthetic */ void afterChange(r rVar, Float f2, Float f3) {
            afterChange((r<?>) rVar, f2.floatValue(), f3.floatValue());
        }
    }

    public final void centerAround(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        m11443linkTo8ZKsbrE$default(this, verticalAnchor, verticalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: linkTo-8ZKsbrE, reason: not valid java name */
    public final void m11451linkTo8ZKsbrE(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f2, float f3, float f4, float f5, float f6) {
        this.start.mo11427linkToVpY3zN4(verticalAnchor, f2, f4);
        this.end.mo11427linkToVpY3zN4(verticalAnchor2, f3, f5);
        this.containerObject.putNumber("hRtlBias", f6);
    }

    /* compiled from: WazeSource */
    final class DimensionProperty extends a<Dimension> {
        public DimensionProperty(Dimension dimension) {
            super(dimension);
        }

        /* renamed from: afterChange, reason: avoid collision after fix types in other method */
        protected void afterChange2(r<?> rVar, Dimension dimension, Dimension dimension2) {
            CLObject containerObject$constraintlayout_compose = ConstrainScope.this.getContainerObject$constraintlayout_compose();
            String name = rVar.getName();
            x.d(dimension2, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            containerObject$constraintlayout_compose.put(name, ((DimensionDescription) dimension2).asCLElement$constraintlayout_compose());
        }

        @Override // h.i.a
        public /* bridge */ /* synthetic */ void afterChange(r rVar, Dimension dimension, Dimension dimension2) {
            afterChange2((r<?>) rVar, dimension, dimension2);
        }
    }

    /* renamed from: linkTo-8ZKsbrE$default, reason: not valid java name */
    public static /* synthetic */ void m11443linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        float f7;
        ConstrainScope constrainScope2;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor3;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor4;
        float f8 = (i2 & 64) != 0 ? 0.5f : f6;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        float f10 = (i2 & 16) != 0 ? 0.0f : f4;
        float f11 = (i2 & 8) != 0 ? 0.0f : f3;
        if ((i2 & 4) != 0) {
            f7 = 0.0f;
            verticalAnchor3 = verticalAnchor;
            verticalAnchor4 = verticalAnchor2;
            constrainScope2 = constrainScope;
        } else {
            f7 = f2;
            constrainScope2 = constrainScope;
            verticalAnchor3 = verticalAnchor;
            verticalAnchor4 = verticalAnchor2;
        }
        constrainScope2.m11451linkTo8ZKsbrE(verticalAnchor3, verticalAnchor4, f7, f11, f10, f9, f8);
    }
}

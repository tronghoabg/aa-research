package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final l<DrawScope, ab> drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private a<ab> invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui(new AnonymousClass1());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(Size.Companion.m8058getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = Size.Companion.m8057getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        int iM8472getAlpha8_sVssgQ = (this.root.isTintable() && this.root.m8991getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ() : ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
        if (this.isDirty || !Size.m8045equalsimpl0(this.previousDrawSize, drawScope.mo8751getSizeNHjbRc()) || !ImageBitmapConfig.m8468equalsimpl0(iM8472getAlpha8_sVssgQ, m9006getCacheBitmapConfig_sVssgQ$ui())) {
            this.tintFilter = ImageBitmapConfig.m8468equalsimpl0(iM8472getAlpha8_sVssgQ, ImageBitmapConfig.Companion.m8472getAlpha8_sVssgQ()) ? ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, VectorKt.m9014toOpaque8_81llA(this.root.m8991getTintColor0d7_KjU()), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m9007getViewportSizeNHjbRc$ui() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / Float.intBitsToFloat((int) (m9007getViewportSizeNHjbRc$ui() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            this.cacheDrawScope.m8989drawCachedImageFqjB98A(iM8472getAlpha8_sVssgQ, (MuxerUtil.UNSIGNED_INT_MAX_VALUE & ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))))) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)))) << 32), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo8751getSizeNHjbRc();
        }
        this.cacheDrawScope.drawInto(drawScope, f2, colorFilter != null ? colorFilter : getIntrinsicColorFilter$ui() != null ? getIntrinsicColorFilter$ui() : this.tintFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m9006getCacheBitmapConfig_sVssgQ$ui() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo8092getConfig_sVssgQ() : ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final a<ab> getInvalidateCallback$ui() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m9007getViewportSizeNHjbRc$ui() {
        return ((Size) this.viewportSize$delegate.getValue()).m8054unboximpl();
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui(a<ab> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m9008setViewportSizeuvyYCjk$ui(long j2) {
        this.viewportSize$delegate.setValue(Size.m8037boximpl(j2));
    }

    public String toString() {
        return "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m9007getViewportSizeNHjbRc$ui() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m9007getViewportSizeNHjbRc$ui() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + "\n";
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<VNode, ab> {
        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(VNode vNode) {
            invoke2(vNode);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VNode vNode) {
            VectorComponent.this.doInvalidate();
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}

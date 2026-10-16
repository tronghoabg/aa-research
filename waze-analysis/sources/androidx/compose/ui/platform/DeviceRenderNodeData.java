package androidx.compose.ui.platform;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private int blendMode;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    private DeviceRenderNodeData(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, RenderEffect renderEffect, int i10, ColorFilter colorFilter, int i11) {
        this.uniqueId = j2;
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
        this.width = i6;
        this.height = i7;
        this.scaleX = f2;
        this.scaleY = f3;
        this.translationX = f4;
        this.translationY = f5;
        this.elevation = f6;
        this.ambientShadowColor = i8;
        this.spotShadowColor = i9;
        this.rotationZ = f7;
        this.rotationX = f8;
        this.rotationY = f9;
        this.cameraDistance = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f13;
        this.renderEffect = renderEffect;
        this.blendMode = i10;
        this.colorFilter = colorFilter;
        this.compositingStrategy = i11;
    }

    /* renamed from: copy-qCc9W8c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m10234copyqCc9W8c$default(DeviceRenderNodeData deviceRenderNodeData, long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, RenderEffect renderEffect, int i10, ColorFilter colorFilter, int i11, int i12, Object obj) {
        int i13;
        ColorFilter colorFilter2;
        long j3 = (i12 & 1) != 0 ? deviceRenderNodeData.uniqueId : j2;
        int i14 = (i12 & 2) != 0 ? deviceRenderNodeData.left : i2;
        int i15 = (i12 & 4) != 0 ? deviceRenderNodeData.top : i3;
        int i16 = (i12 & 8) != 0 ? deviceRenderNodeData.right : i4;
        int i17 = (i12 & 16) != 0 ? deviceRenderNodeData.bottom : i5;
        int i18 = (i12 & 32) != 0 ? deviceRenderNodeData.width : i6;
        int i19 = (i12 & 64) != 0 ? deviceRenderNodeData.height : i7;
        float f14 = (i12 & 128) != 0 ? deviceRenderNodeData.scaleX : f2;
        float f15 = (i12 & 256) != 0 ? deviceRenderNodeData.scaleY : f3;
        float f16 = (i12 & 512) != 0 ? deviceRenderNodeData.translationX : f4;
        float f17 = (i12 & 1024) != 0 ? deviceRenderNodeData.translationY : f5;
        float f18 = (i12 & 2048) != 0 ? deviceRenderNodeData.elevation : f6;
        int i20 = (i12 & 4096) != 0 ? deviceRenderNodeData.ambientShadowColor : i8;
        long j4 = j3;
        int i21 = (i12 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i9;
        float f19 = (i12 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f7;
        float f20 = (i12 & 32768) != 0 ? deviceRenderNodeData.rotationX : f8;
        float f21 = (i12 & 65536) != 0 ? deviceRenderNodeData.rotationY : f9;
        float f22 = (i12 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f10;
        float f23 = (i12 & 262144) != 0 ? deviceRenderNodeData.pivotX : f11;
        float f24 = (i12 & 524288) != 0 ? deviceRenderNodeData.pivotY : f12;
        boolean z3 = (i12 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z;
        boolean z4 = (i12 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z2;
        float f25 = (i12 & 4194304) != 0 ? deviceRenderNodeData.alpha : f13;
        RenderEffect renderEffect2 = (i12 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        int i22 = (i12 & 16777216) != 0 ? deviceRenderNodeData.blendMode : i10;
        ColorFilter colorFilter3 = (i12 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? deviceRenderNodeData.colorFilter : colorFilter;
        if ((i12 & 67108864) != 0) {
            colorFilter2 = colorFilter3;
            i13 = deviceRenderNodeData.compositingStrategy;
        } else {
            i13 = i11;
            colorFilter2 = colorFilter3;
        }
        return deviceRenderNodeData.m10237copyqCc9W8c(j4, i14, i15, i16, i17, i18, i19, f14, f15, f16, f17, f18, i20, i21, f19, f20, f21, f22, f23, f24, z3, z4, f25, renderEffect2, i22, colorFilter2, i13);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25-0nO6VwU, reason: not valid java name */
    public final int m10235component250nO6VwU() {
        return this.blendMode;
    }

    public final ColorFilter component26() {
        return this.colorFilter;
    }

    /* renamed from: component27--NrFUSI, reason: not valid java name */
    public final int m10236component27NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* renamed from: copy-qCc9W8c, reason: not valid java name */
    public final DeviceRenderNodeData m10237copyqCc9W8c(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, RenderEffect renderEffect, int i10, ColorFilter colorFilter, int i11) {
        return new DeviceRenderNodeData(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, i8, i9, f7, f8, f9, f10, f11, f12, z, z2, f13, renderEffect, i10, colorFilter, i11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && x.n(this.renderEffect, deviceRenderNodeData.renderEffect) && BlendMode.m8137equalsimpl0(this.blendMode, deviceRenderNodeData.blendMode) && x.n(this.colorFilter, deviceRenderNodeData.colorFilter) && CompositingStrategy.m8313equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m10238getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m10239getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM = (((((((((((((((((((((((((((((((((((((DeviceRenderNodeData$$ExternalSyntheticBackport0.m(this.uniqueId) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + Float.floatToIntBits(this.elevation)) * 31) + this.ambientShadowColor) * 31) + this.spotShadowColor) * 31) + Float.floatToIntBits(this.rotationZ)) * 31) + Float.floatToIntBits(this.rotationX)) * 31) + Float.floatToIntBits(this.rotationY)) * 31) + Float.floatToIntBits(this.cameraDistance)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY);
        int iM2 = (((((iM * 31) + DeviceRenderNodeData$$ExternalSyntheticBackport1.m(this.clipToOutline)) * 31) + DeviceRenderNodeData$$ExternalSyntheticBackport1.m(this.clipToBounds)) * 31) + Float.floatToIntBits(this.alpha);
        RenderEffect renderEffect = this.renderEffect;
        int iHashCode = ((((iM2 * 31) + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + this.blendMode) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return ((iHashCode + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + this.compositingStrategy;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final void setAmbientShadowColor(int i2) {
        this.ambientShadowColor = i2;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m10240setBlendModes9anfk8(int i2) {
        this.blendMode = i2;
    }

    public final void setCameraDistance(float f2) {
        this.cameraDistance = f2;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m10241setCompositingStrategyaDBOjCE(int i2) {
        this.compositingStrategy = i2;
    }

    public final void setElevation(float f2) {
        this.elevation = f2;
    }

    public final void setPivotX(float f2) {
        this.pivotX = f2;
    }

    public final void setPivotY(float f2) {
        this.pivotY = f2;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f2) {
        this.rotationX = f2;
    }

    public final void setRotationY(float f2) {
        this.rotationY = f2;
    }

    public final void setRotationZ(float f2) {
        this.rotationZ = f2;
    }

    public final void setScaleX(float f2) {
        this.scaleX = f2;
    }

    public final void setScaleY(float f2) {
        this.scaleY = f2;
    }

    public final void setSpotShadowColor(int i2) {
        this.spotShadowColor = i2;
    }

    public final void setTranslationX(float f2) {
        this.translationX = f2;
    }

    public final void setTranslationY(float f2) {
        this.translationY = f2;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", blendMode=" + ((Object) BlendMode.m8139toStringimpl(this.blendMode)) + ", colorFilter=" + this.colorFilter + ", compositingStrategy=" + ((Object) CompositingStrategy.m8315toStringimpl(this.compositingStrategy)) + ')';
    }

    public /* synthetic */ DeviceRenderNodeData(long j2, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3, float f4, float f5, float f6, int i8, int i9, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, float f13, RenderEffect renderEffect, int i10, ColorFilter colorFilter, int i11, o oVar) {
        this(j2, i2, i3, i4, i5, i6, i7, f2, f3, f4, f5, f6, i8, i9, f7, f8, f9, f10, f11, f12, z, z2, f13, renderEffect, i10, colorFilter, i11);
    }
}

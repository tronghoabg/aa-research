package I7;

import android.R;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5399a = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, com.wynauto.wyn.R.attr.backgroundTint, com.wynauto.wyn.R.attr.behavior_draggable, com.wynauto.wyn.R.attr.behavior_expandedOffset, com.wynauto.wyn.R.attr.behavior_fitToContents, com.wynauto.wyn.R.attr.behavior_halfExpandedRatio, com.wynauto.wyn.R.attr.behavior_hideable, com.wynauto.wyn.R.attr.behavior_peekHeight, com.wynauto.wyn.R.attr.behavior_saveFlags, com.wynauto.wyn.R.attr.behavior_significantVelocityThreshold, com.wynauto.wyn.R.attr.behavior_skipCollapsed, com.wynauto.wyn.R.attr.gestureInsetBottomIgnored, com.wynauto.wyn.R.attr.marginLeftSystemWindowInsets, com.wynauto.wyn.R.attr.marginRightSystemWindowInsets, com.wynauto.wyn.R.attr.marginTopSystemWindowInsets, com.wynauto.wyn.R.attr.paddingBottomSystemWindowInsets, com.wynauto.wyn.R.attr.paddingLeftSystemWindowInsets, com.wynauto.wyn.R.attr.paddingRightSystemWindowInsets, com.wynauto.wyn.R.attr.paddingTopSystemWindowInsets, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay, com.wynauto.wyn.R.attr.shouldRemoveExpandedCorners};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5400b = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, com.wynauto.wyn.R.attr.checkedIcon, com.wynauto.wyn.R.attr.checkedIconEnabled, com.wynauto.wyn.R.attr.checkedIconTint, com.wynauto.wyn.R.attr.checkedIconVisible, com.wynauto.wyn.R.attr.chipBackgroundColor, com.wynauto.wyn.R.attr.chipCornerRadius, com.wynauto.wyn.R.attr.chipEndPadding, com.wynauto.wyn.R.attr.chipIcon, com.wynauto.wyn.R.attr.chipIconEnabled, com.wynauto.wyn.R.attr.chipIconSize, com.wynauto.wyn.R.attr.chipIconTint, com.wynauto.wyn.R.attr.chipIconVisible, com.wynauto.wyn.R.attr.chipMinHeight, com.wynauto.wyn.R.attr.chipMinTouchTargetSize, com.wynauto.wyn.R.attr.chipStartPadding, com.wynauto.wyn.R.attr.chipStrokeColor, com.wynauto.wyn.R.attr.chipStrokeWidth, com.wynauto.wyn.R.attr.chipSurfaceColor, com.wynauto.wyn.R.attr.closeIcon, com.wynauto.wyn.R.attr.closeIconEnabled, com.wynauto.wyn.R.attr.closeIconEndPadding, com.wynauto.wyn.R.attr.closeIconSize, com.wynauto.wyn.R.attr.closeIconStartPadding, com.wynauto.wyn.R.attr.closeIconTint, com.wynauto.wyn.R.attr.closeIconVisible, com.wynauto.wyn.R.attr.ensureMinTouchTargetSize, com.wynauto.wyn.R.attr.hideMotionSpec, com.wynauto.wyn.R.attr.iconEndPadding, com.wynauto.wyn.R.attr.iconStartPadding, com.wynauto.wyn.R.attr.rippleColor, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay, com.wynauto.wyn.R.attr.showMotionSpec, com.wynauto.wyn.R.attr.textEndPadding, com.wynauto.wyn.R.attr.textStartPadding};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5401c = {com.wynauto.wyn.R.attr.clockFaceBackgroundColor, com.wynauto.wyn.R.attr.clockNumberTextColor};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5402d = {com.wynauto.wyn.R.attr.clockHandColor, com.wynauto.wyn.R.attr.materialCircleRadius, com.wynauto.wyn.R.attr.selectorSize};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5403e = {com.wynauto.wyn.R.attr.behavior_autoHide, com.wynauto.wyn.R.attr.behavior_autoShrink};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f5404f = {com.wynauto.wyn.R.attr.behavior_autoHide};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f5405g = {R.attr.foreground, R.attr.foregroundGravity, com.wynauto.wyn.R.attr.foregroundInsidePadding};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f5406h = {R.attr.inputType, R.attr.popupElevation, com.wynauto.wyn.R.attr.simpleItemLayout, com.wynauto.wyn.R.attr.simpleItemSelectedColor, com.wynauto.wyn.R.attr.simpleItemSelectedRippleColor, com.wynauto.wyn.R.attr.simpleItems};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f5407i = {R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, com.wynauto.wyn.R.attr.backgroundTint, com.wynauto.wyn.R.attr.backgroundTintMode, com.wynauto.wyn.R.attr.cornerRadius, com.wynauto.wyn.R.attr.elevation, com.wynauto.wyn.R.attr.icon, com.wynauto.wyn.R.attr.iconGravity, com.wynauto.wyn.R.attr.iconPadding, com.wynauto.wyn.R.attr.iconSize, com.wynauto.wyn.R.attr.iconTint, com.wynauto.wyn.R.attr.iconTintMode, com.wynauto.wyn.R.attr.rippleColor, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay, com.wynauto.wyn.R.attr.strokeColor, com.wynauto.wyn.R.attr.strokeWidth, com.wynauto.wyn.R.attr.toggleCheckedStateOnClick};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5408j = {R.attr.enabled, com.wynauto.wyn.R.attr.checkedButton, com.wynauto.wyn.R.attr.selectionRequired, com.wynauto.wyn.R.attr.singleSelection};
    public static final int[] k = {R.attr.windowFullscreen, com.wynauto.wyn.R.attr.dayInvalidStyle, com.wynauto.wyn.R.attr.daySelectedStyle, com.wynauto.wyn.R.attr.dayStyle, com.wynauto.wyn.R.attr.dayTodayStyle, com.wynauto.wyn.R.attr.nestedScrollable, com.wynauto.wyn.R.attr.rangeFillColor, com.wynauto.wyn.R.attr.yearSelectedStyle, com.wynauto.wyn.R.attr.yearStyle, com.wynauto.wyn.R.attr.yearTodayStyle};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5409l = {R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, com.wynauto.wyn.R.attr.itemFillColor, com.wynauto.wyn.R.attr.itemShapeAppearance, com.wynauto.wyn.R.attr.itemShapeAppearanceOverlay, com.wynauto.wyn.R.attr.itemStrokeColor, com.wynauto.wyn.R.attr.itemStrokeWidth, com.wynauto.wyn.R.attr.itemTextColor};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5410m = {R.attr.button, com.wynauto.wyn.R.attr.buttonCompat, com.wynauto.wyn.R.attr.buttonIcon, com.wynauto.wyn.R.attr.buttonIconTint, com.wynauto.wyn.R.attr.buttonIconTintMode, com.wynauto.wyn.R.attr.buttonTint, com.wynauto.wyn.R.attr.centerIfNoTextEnabled, com.wynauto.wyn.R.attr.checkedState, com.wynauto.wyn.R.attr.errorAccessibilityLabel, com.wynauto.wyn.R.attr.errorShown, com.wynauto.wyn.R.attr.useMaterialThemeColors};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5411n = {com.wynauto.wyn.R.attr.buttonTint, com.wynauto.wyn.R.attr.useMaterialThemeColors};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f5412o = {com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f5413p = {R.attr.letterSpacing, R.attr.lineHeight, com.wynauto.wyn.R.attr.lineHeight};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f5414q = {R.attr.textAppearance, R.attr.lineHeight, com.wynauto.wyn.R.attr.lineHeight};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f5415r = {com.wynauto.wyn.R.attr.logoAdjustViewBounds, com.wynauto.wyn.R.attr.logoScaleType, com.wynauto.wyn.R.attr.navigationIconTint, com.wynauto.wyn.R.attr.subtitleCentered, com.wynauto.wyn.R.attr.titleCentered};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f5416s = {com.wynauto.wyn.R.attr.materialCircleRadius};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f5417t = {com.wynauto.wyn.R.attr.behavior_overlapTop};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f5418u = {com.wynauto.wyn.R.attr.cornerFamily, com.wynauto.wyn.R.attr.cornerFamilyBottomLeft, com.wynauto.wyn.R.attr.cornerFamilyBottomRight, com.wynauto.wyn.R.attr.cornerFamilyTopLeft, com.wynauto.wyn.R.attr.cornerFamilyTopRight, com.wynauto.wyn.R.attr.cornerSize, com.wynauto.wyn.R.attr.cornerSizeBottomLeft, com.wynauto.wyn.R.attr.cornerSizeBottomRight, com.wynauto.wyn.R.attr.cornerSizeTopLeft, com.wynauto.wyn.R.attr.cornerSizeTopRight};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5419v = {R.attr.maxWidth, R.attr.maxHeight, R.attr.elevation, com.wynauto.wyn.R.attr.backgroundTint, com.wynauto.wyn.R.attr.behavior_draggable, com.wynauto.wyn.R.attr.coplanarSiblingViewId, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f5420w = {R.attr.maxWidth, com.wynauto.wyn.R.attr.actionTextColorAlpha, com.wynauto.wyn.R.attr.animationMode, com.wynauto.wyn.R.attr.backgroundOverlayColorAlpha, com.wynauto.wyn.R.attr.backgroundTint, com.wynauto.wyn.R.attr.backgroundTintMode, com.wynauto.wyn.R.attr.elevation, com.wynauto.wyn.R.attr.maxActionInlineWidth, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f5421x = {R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, com.wynauto.wyn.R.attr.fontFamily, com.wynauto.wyn.R.attr.fontVariationSettings, com.wynauto.wyn.R.attr.textAllCaps, com.wynauto.wyn.R.attr.textLocale};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f5422y = {com.wynauto.wyn.R.attr.textInputLayoutFocusedRectEnabled};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f5423z = {R.attr.enabled, R.attr.textColorHint, R.attr.maxWidth, R.attr.minWidth, R.attr.hint, R.attr.maxEms, R.attr.minEms, com.wynauto.wyn.R.attr.boxBackgroundColor, com.wynauto.wyn.R.attr.boxBackgroundMode, com.wynauto.wyn.R.attr.boxCollapsedPaddingTop, com.wynauto.wyn.R.attr.boxCornerRadiusBottomEnd, com.wynauto.wyn.R.attr.boxCornerRadiusBottomStart, com.wynauto.wyn.R.attr.boxCornerRadiusTopEnd, com.wynauto.wyn.R.attr.boxCornerRadiusTopStart, com.wynauto.wyn.R.attr.boxStrokeColor, com.wynauto.wyn.R.attr.boxStrokeErrorColor, com.wynauto.wyn.R.attr.boxStrokeWidth, com.wynauto.wyn.R.attr.boxStrokeWidthFocused, com.wynauto.wyn.R.attr.counterEnabled, com.wynauto.wyn.R.attr.counterMaxLength, com.wynauto.wyn.R.attr.counterOverflowTextAppearance, com.wynauto.wyn.R.attr.counterOverflowTextColor, com.wynauto.wyn.R.attr.counterTextAppearance, com.wynauto.wyn.R.attr.counterTextColor, com.wynauto.wyn.R.attr.endIconCheckable, com.wynauto.wyn.R.attr.endIconContentDescription, com.wynauto.wyn.R.attr.endIconDrawable, com.wynauto.wyn.R.attr.endIconMinSize, com.wynauto.wyn.R.attr.endIconMode, com.wynauto.wyn.R.attr.endIconScaleType, com.wynauto.wyn.R.attr.endIconTint, com.wynauto.wyn.R.attr.endIconTintMode, com.wynauto.wyn.R.attr.errorAccessibilityLiveRegion, com.wynauto.wyn.R.attr.errorContentDescription, com.wynauto.wyn.R.attr.errorEnabled, com.wynauto.wyn.R.attr.errorIconDrawable, com.wynauto.wyn.R.attr.errorIconTint, com.wynauto.wyn.R.attr.errorIconTintMode, com.wynauto.wyn.R.attr.errorTextAppearance, com.wynauto.wyn.R.attr.errorTextColor, com.wynauto.wyn.R.attr.expandedHintEnabled, com.wynauto.wyn.R.attr.helperText, com.wynauto.wyn.R.attr.helperTextEnabled, com.wynauto.wyn.R.attr.helperTextTextAppearance, com.wynauto.wyn.R.attr.helperTextTextColor, com.wynauto.wyn.R.attr.hintAnimationEnabled, com.wynauto.wyn.R.attr.hintEnabled, com.wynauto.wyn.R.attr.hintTextAppearance, com.wynauto.wyn.R.attr.hintTextColor, com.wynauto.wyn.R.attr.passwordToggleContentDescription, com.wynauto.wyn.R.attr.passwordToggleDrawable, com.wynauto.wyn.R.attr.passwordToggleEnabled, com.wynauto.wyn.R.attr.passwordToggleTint, com.wynauto.wyn.R.attr.passwordToggleTintMode, com.wynauto.wyn.R.attr.placeholderText, com.wynauto.wyn.R.attr.placeholderTextAppearance, com.wynauto.wyn.R.attr.placeholderTextColor, com.wynauto.wyn.R.attr.prefixText, com.wynauto.wyn.R.attr.prefixTextAppearance, com.wynauto.wyn.R.attr.prefixTextColor, com.wynauto.wyn.R.attr.shapeAppearance, com.wynauto.wyn.R.attr.shapeAppearanceOverlay, com.wynauto.wyn.R.attr.startIconCheckable, com.wynauto.wyn.R.attr.startIconContentDescription, com.wynauto.wyn.R.attr.startIconDrawable, com.wynauto.wyn.R.attr.startIconMinSize, com.wynauto.wyn.R.attr.startIconScaleType, com.wynauto.wyn.R.attr.startIconTint, com.wynauto.wyn.R.attr.startIconTintMode, com.wynauto.wyn.R.attr.suffixText, com.wynauto.wyn.R.attr.suffixTextAppearance, com.wynauto.wyn.R.attr.suffixTextColor};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f5398A = {R.attr.textAppearance, com.wynauto.wyn.R.attr.enforceMaterialTheme, com.wynauto.wyn.R.attr.enforceTextAppearance};
}

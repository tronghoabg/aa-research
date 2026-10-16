package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {
    public static final ContextMenuColors computeContextMenuColors(int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i4, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object obj = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        boolean zChanged = composer.changed(obj) | composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            long jM2113resolveColorg2O1Hgs = m2113resolveColorg2O1Hgs(context, i2, R.attr.colorBackground, ContextMenuUiKt.getDefaultContextMenuColors().m2089getBackgroundColor0d7_KjU());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i3, R.attr.textColorPrimary);
            long jM2112enabledColor4WTKRHQ = m2112enabledColor4WTKRHQ(colorStateListResolveColorStateList, ContextMenuUiKt.getDefaultContextMenuColors().m2093getTextColor0d7_KjU());
            long jM2111disabledColor4WTKRHQ = m2111disabledColor4WTKRHQ(colorStateListResolveColorStateList, ContextMenuUiKt.getDefaultContextMenuColors().m2091getDisabledTextColor0d7_KjU());
            Object contextMenuColors = new ContextMenuColors(jM2113resolveColorg2O1Hgs, jM2112enabledColor4WTKRHQ, jM2112enabledColor4WTKRHQ, jM2111disabledColor4WTKRHQ, jM2111disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors);
            objRememberedValue = contextMenuColors;
        }
        ContextMenuColors contextMenuColors2 = (ContextMenuColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors2;
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m2111disabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM8282toArgb8_81llA = ColorKt.m8282toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM8282toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM8282toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m2112enabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM8282toArgb8_81llA = ColorKt.m8282toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM8282toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM8282toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m2113resolveColorg2O1Hgs(Context context, int i2, int i3, long j2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        int iM8282toArgb8_81llA = ColorKt.m8282toArgb8_81llA(j2);
        int color = typedArrayObtainStyledAttributes.getColor(0, iM8282toArgb8_81llA);
        typedArrayObtainStyledAttributes.recycle();
        return color == iM8282toArgb8_81llA ? j2 : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, int i2, int i3) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static final ContextMenuColors computeContextMenuColors(Composer composer, int i2) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428061410, i2, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        ContextMenuColors contextMenuColorsComputeContextMenuColors = computeContextMenuColors(R.style.Widget.PopupMenu, R.style.TextAppearance.Widget.PopupMenu.Large, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColorsComputeContextMenuColors;
    }
}

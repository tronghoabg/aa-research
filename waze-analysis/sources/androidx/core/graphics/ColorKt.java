package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ColorKt {
    public static final float component1(Color color) {
        x.f(color, "<this>");
        return color.getComponent(0);
    }

    public static final float component2(Color color) {
        x.f(color, "<this>");
        return color.getComponent(1);
    }

    public static final float component3(Color color) {
        x.f(color, "<this>");
        return color.getComponent(2);
    }

    public static final float component4(Color color) {
        x.f(color, "<this>");
        return color.getComponent(3);
    }

    public static final Color convertTo(Color color, ColorSpace.Named named) {
        x.f(color, "<this>");
        x.f(named, "colorSpace");
        Color colorConvert = color.convert(ColorSpace.get(named));
        x.e(colorConvert, "convert(...)");
        return colorConvert;
    }

    public static final int getAlpha(int i2) {
        return (i2 >> 24) & 255;
    }

    public static final float getBlue(long j2) {
        return Color.blue(j2);
    }

    public static final ColorSpace getColorSpace(long j2) {
        ColorSpace colorSpace = Color.colorSpace(j2);
        x.e(colorSpace, "colorSpace(...)");
        return colorSpace;
    }

    public static final int getGreen(int i2) {
        return (i2 >> 8) & 255;
    }

    public static final float getLuminance(int i2) {
        return Color.luminance(i2);
    }

    public static final int getRed(int i2) {
        return (i2 >> 16) & 255;
    }

    public static final boolean isSrgb(long j2) {
        return Color.isSrgb(j2);
    }

    public static final boolean isWideGamut(long j2) {
        return Color.isWideGamut(j2);
    }

    public static final Color plus(Color color, Color color2) {
        x.f(color, "<this>");
        x.f(color2, "c");
        Color colorCompositeColors = ColorUtils.compositeColors(color2, color);
        x.e(colorCompositeColors, "compositeColors(...)");
        return colorCompositeColors;
    }

    public static final Color toColor(int i2) {
        Color colorValueOf = Color.valueOf(i2);
        x.e(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    public static final int toColorInt(String str) {
        x.f(str, "<this>");
        return Color.parseColor(str);
    }

    public static final long toColorLong(int i2) {
        return Color.pack(i2);
    }

    public static final float getAlpha(long j2) {
        return Color.alpha(j2);
    }

    public static final int getBlue(int i2) {
        return i2 & 255;
    }

    public static final float getGreen(long j2) {
        return Color.green(j2);
    }

    public static final float getLuminance(long j2) {
        return Color.luminance(j2);
    }

    public static final float getRed(long j2) {
        return Color.red(j2);
    }

    public static final Color toColor(long j2) {
        Color colorValueOf = Color.valueOf(j2);
        x.e(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    public static final int toColorInt(long j2) {
        return Color.toArgb(j2);
    }

    public static final float component1(long j2) {
        return Color.red(j2);
    }

    public static final float component2(long j2) {
        return Color.green(j2);
    }

    public static final float component3(long j2) {
        return Color.blue(j2);
    }

    public static final float component4(long j2) {
        return Color.alpha(j2);
    }

    public static final int component1(int i2) {
        return (i2 >> 24) & 255;
    }

    public static final int component2(int i2) {
        return (i2 >> 16) & 255;
    }

    public static final int component3(int i2) {
        return (i2 >> 8) & 255;
    }

    public static final int component4(int i2) {
        return i2 & 255;
    }

    public static final long convertTo(int i2, ColorSpace colorSpace) {
        x.f(colorSpace, "colorSpace");
        return Color.convert(i2, colorSpace);
    }

    public static final long convertTo(long j2, ColorSpace.Named named) {
        x.f(named, "colorSpace");
        return Color.convert(j2, ColorSpace.get(named));
    }

    public static final long convertTo(long j2, ColorSpace colorSpace) {
        x.f(colorSpace, "colorSpace");
        return Color.convert(j2, colorSpace);
    }

    public static final long convertTo(int i2, ColorSpace.Named named) {
        x.f(named, "colorSpace");
        return Color.convert(i2, ColorSpace.get(named));
    }

    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        x.f(color, "<this>");
        x.f(colorSpace, "colorSpace");
        Color colorConvert = color.convert(colorSpace);
        x.e(colorConvert, "convert(...)");
        return colorConvert;
    }
}

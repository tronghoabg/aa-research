package androidx.compose.ui.graphics.vector;

import androidx.camera.video.AudioStats;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import h.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
        double d11 = -d4;
        double dCos = Math.cos(d8);
        double d12 = d11 * dCos;
        double dSin = Math.sin(d8);
        double dCos2 = Math.cos(d9);
        double dSin2 = Math.sin(d9);
        double d13 = d5 * dSin;
        double d14 = d11 * dSin;
        double d15 = d5 * dCos;
        int i2 = 0;
        double d16 = (dSin2 * d14) + (dCos2 * d15);
        double d17 = (d12 * dSin2) - (d13 * dCos2);
        double d18 = d6;
        double d19 = d7;
        double d20 = d9;
        while (i2 < iCeil) {
            double d21 = d20 + (d10 / iCeil);
            double dSin3 = Math.sin(d21);
            double dCos3 = Math.cos(d21);
            double d22 = d21 - d20;
            double dTan = Math.tan(d22 / 2.0d);
            double dSin4 = (Math.sin(d22) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d23 = d19 + (d16 * dSin4);
            int i3 = i2;
            double d24 = d3 + (d4 * dSin * dCos3) + (d15 * dSin3);
            int i4 = iCeil;
            double d25 = (d2 + ((d4 * dCos) * dCos3)) - (d13 * dSin3);
            d16 = (dSin3 * d14) + (dCos3 * d15);
            d17 = (d12 * dSin3) - (d13 * dCos3);
            path.cubicTo((float) (d18 + (d17 * dSin4)), (float) d23, (float) (d25 - (dSin4 * d17)), (float) (d24 - (dSin4 * d16)), (float) d25, (float) d24);
            int i5 = i3 + 1;
            d20 = d21;
            d18 = d25;
            iCeil = i4;
            dCos = dCos;
            d12 = d12;
            d14 = d14;
            d19 = d24;
            i2 = i5;
        }
    }

    private static final void drawArc(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((-d4) * dSin) + (d5 * dCos);
        double d13 = (((-d2) * dSin) + (d3 * dCos)) / d7;
        double d14 = d12 / d7;
        double d15 = d13 - d14;
        double d16 = ((d2 * dCos) + (d3 * dSin)) / d6;
        double d17 = ((d4 * dCos) + (d5 * dSin)) / d6;
        double d18 = d16 - d17;
        double d19 = (d18 * d18) + (d15 * d15);
        if (d19 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            double dSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            drawArc(path, d2, d3, d4, d5, d6 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d20);
        double d21 = (d13 + d14) / 2.0d;
        double d22 = d18 * dSqrt2;
        double d23 = (d16 + d17) / 2.0d;
        double d24 = dSqrt2 * d15;
        if (z == z2) {
            d9 = d23 - d24;
            d10 = d21 + d22;
        } else {
            d9 = d23 + d24;
            d10 = d21 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d10, d16 - d9);
        double dAtan22 = Math.atan2(d14 - d10, d17 - d9) - dAtan2;
        if (z2 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
            dAtan22 += dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d9 * d6;
        double d26 = d10 * d7;
        arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d6, d7, d2, d3, d11, dAtan2, dAtan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        int i2;
        float f2;
        int i3;
        PathNode pathNode;
        float f3;
        float f4;
        float y2;
        float x2;
        float y22;
        float f5;
        float f6;
        float dx1;
        float dy1;
        float dy2;
        float dy;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo8116getFillTypeRgk1Os = path2.mo8116getFillTypeRgk1Os();
        path2.rewind();
        path2.mo8118setFillTypeoQ8Xj4U(iMo8116getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f7 = 0.0f;
        int i4 = 0;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float x = 0.0f;
        float y = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (i4 < size) {
            PathNode pathNode3 = list2.get(i4);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i2 = size;
                f2 = f7;
                i3 = i4;
                pathNode = pathNode3;
                arcStartY = f8;
                y = arcStartY;
                arcStartX = f9;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x += relativeMoveTo.getDx();
                    y += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i2 = size;
                    f2 = f7;
                    i3 = i4;
                    f9 = x;
                    f8 = y;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x3 = moveTo.getX();
                        float y3 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        x = x3;
                        f9 = x;
                        y = y3;
                        f8 = y;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x += relativeLineTo.getDx();
                            dy = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                x2 = lineTo.getX();
                                y22 = lineTo.getY();
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f7);
                                x += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y);
                                x = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f7, relativeVerticalTo.getDy());
                                dy = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(x, verticalTo.getY());
                                y = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x;
                                    dy1 = relativeCurveTo.getDy2() + y;
                                    x += relativeCurveTo.getDx3();
                                    dy2 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x22 = curveTo.getX2();
                                        y2 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x = x32;
                                        y = y32;
                                        i2 = size;
                                        f2 = f7;
                                        i3 = i4;
                                        pathNode = pathNode3;
                                        arcStartX = x22;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.isCurve()) {
                                            f5 = x - arcStartX;
                                            f6 = y - arcStartY;
                                        } else {
                                            f5 = f7;
                                            f6 = f5;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f5, f6, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y;
                                        x += relativeReflectiveCurveTo.getDx2();
                                        dy2 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.isCurve()) {
                                                y = (y + y) - arcStartY;
                                                x = (x + x) - arcStartX;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x, y, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            float x1 = reflectiveCurveTo.getX1();
                                            arcStartY = reflectiveCurveTo.getY1();
                                            float x23 = reflectiveCurveTo.getX2();
                                            float y23 = reflectiveCurveTo.getY2();
                                            x = x23;
                                            y = y23;
                                            i2 = size;
                                            f2 = f7;
                                            i3 = i4;
                                            pathNode = pathNode3;
                                            arcStartX = x1;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            float dx12 = relativeQuadTo.getDx1() + x;
                                            float dy12 = relativeQuadTo.getDy1() + y;
                                            x += relativeQuadTo.getDx2();
                                            y += relativeQuadTo.getDy2();
                                            arcStartX = dx12;
                                            arcStartY = dy12;
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            float x12 = quadTo.getX1();
                                            float y1 = quadTo.getY1();
                                            x2 = quadTo.getX2();
                                            y22 = quadTo.getY2();
                                            arcStartX = x12;
                                            arcStartY = y1;
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                f3 = y - arcStartY;
                                                f4 = x - arcStartX;
                                            } else {
                                                f3 = f7;
                                                f4 = f3;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f4, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            float f10 = f4 + x;
                                            y2 = f3 + y;
                                            x += relativeReflectiveQuadTo.getDx();
                                            y += relativeReflectiveQuadTo.getDy();
                                            arcStartX = f10;
                                            i2 = size;
                                            f2 = f7;
                                            i3 = i4;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                y = (y + y) - arcStartY;
                                                x = (x + x) - arcStartX;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(x, y, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            i2 = size;
                                            f2 = f7;
                                            i3 = i4;
                                            arcStartX = x;
                                            pathNode = pathNode3;
                                            x = reflectiveQuadTo.getX();
                                            arcStartY = y;
                                            y = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            double d2 = x;
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y;
                                            i3 = i4;
                                            i2 = size;
                                            f2 = 0.0f;
                                            pathNode = pathNode3;
                                            drawArc(path, d2, y, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            arcStartY = arcStartDy;
                                            y = arcStartY;
                                            arcStartX = arcStartDx;
                                        } else {
                                            i2 = size;
                                            f2 = f7;
                                            i3 = i4;
                                            pathNode = pathNode3;
                                            if (!(pathNode instanceof PathNode.ArcTo)) {
                                                throw new i();
                                            }
                                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                            drawArc(path, x, y, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                            arcStartX = arcTo.getArcStartX();
                                            x = arcStartX;
                                            arcStartY = arcTo.getArcStartY();
                                            y = arcStartY;
                                        }
                                        i4 = i3 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i2;
                                        f7 = f2;
                                        list2 = list;
                                    }
                                    arcStartY = y2;
                                    i4 = i3 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i2;
                                    f7 = f2;
                                    list2 = list;
                                }
                                y += dy2;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y = y22;
                            x = x2;
                        }
                        y += dy;
                    }
                    i2 = size;
                    f2 = f7;
                    i3 = i4;
                }
                pathNode = pathNode3;
                i4 = i3 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i2;
                f7 = f2;
                list2 = list;
            }
            x = arcStartX;
            i4 = i3 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i2;
            f7 = f2;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        toPath(list, path);
        return path;
    }

    private static final double toRadians(double d2) {
        return (d2 / 180.0d) * 3.141592653589793d;
    }
}

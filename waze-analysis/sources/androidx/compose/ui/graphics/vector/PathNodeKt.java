package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import h.g.a.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c2, ArrayList<PathNode> arrayList, float[] fArr, int i2) {
        int i3 = 0;
        switch (c2) {
            case 'A':
                int i4 = i2 - 7;
                ArrayList<PathNode> arrayList2 = arrayList;
                for (int i5 = 0; i5 <= i4; i5 += 7) {
                    arrayList2.add(new PathNode.ArcTo(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], Float.compare(fArr[i5 + 3], 0.0f) != 0, Float.compare(fArr[i5 + 4], 0.0f) != 0, fArr[i5 + 5], fArr[i5 + 6]));
                }
                return;
            case 'C':
                int i6 = i2 - 6;
                ArrayList<PathNode> arrayList3 = arrayList;
                while (i3 <= i6) {
                    arrayList3.add(new PathNode.CurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case 'H':
                int i7 = i2 - 1;
                ArrayList<PathNode> arrayList4 = arrayList;
                while (i3 <= i7) {
                    arrayList4.add(new PathNode.HorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'L':
                int i8 = i2 - 2;
                ArrayList<PathNode> arrayList5 = arrayList;
                while (i3 <= i8) {
                    arrayList5.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i2);
                return;
            case 'Q':
                int i9 = i2 - 4;
                ArrayList<PathNode> arrayList6 = arrayList;
                while (i3 <= i9) {
                    arrayList6.add(new PathNode.QuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'S':
                int i10 = i2 - 4;
                ArrayList<PathNode> arrayList7 = arrayList;
                while (i3 <= i10) {
                    arrayList7.add(new PathNode.ReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 'T':
                int i11 = i2 - 2;
                ArrayList<PathNode> arrayList8 = arrayList;
                while (i3 <= i11) {
                    arrayList8.add(new PathNode.ReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'V':
                int i12 = i2 - 1;
                ArrayList<PathNode> arrayList9 = arrayList;
                while (i3 <= i12) {
                    arrayList9.add(new PathNode.VerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                int i13 = i2 - 7;
                ArrayList<PathNode> arrayList10 = arrayList;
                for (int i14 = 0; i14 <= i13; i14 += 7) {
                    arrayList10.add(new PathNode.RelativeArcTo(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], Float.compare(fArr[i14 + 3], 0.0f) != 0, Float.compare(fArr[i14 + 4], 0.0f) != 0, fArr[i14 + 5], fArr[i14 + 6]));
                }
                return;
            case 'c':
                int i15 = i2 - 6;
                ArrayList<PathNode> arrayList11 = arrayList;
                while (i3 <= i15) {
                    arrayList11.add(new PathNode.RelativeCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                    i3 += 6;
                }
                return;
            case 'h':
                int i16 = i2 - 1;
                ArrayList<PathNode> arrayList12 = arrayList;
                while (i3 <= i16) {
                    arrayList12.add(new PathNode.RelativeHorizontalTo(fArr[i3]));
                    i3++;
                }
                return;
            case 'l':
                int i17 = i2 - 2;
                ArrayList<PathNode> arrayList13 = arrayList;
                while (i3 <= i17) {
                    arrayList13.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'm':
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i2);
                return;
            case 'q':
                int i18 = i2 - 4;
                ArrayList<PathNode> arrayList14 = arrayList;
                while (i3 <= i18) {
                    arrayList14.add(new PathNode.RelativeQuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 's':
                int i19 = i2 - 4;
                ArrayList<PathNode> arrayList15 = arrayList;
                while (i3 <= i19) {
                    arrayList15.add(new PathNode.RelativeReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                    i3 += 4;
                }
                return;
            case 't':
                int i20 = i2 - 2;
                ArrayList<PathNode> arrayList16 = arrayList;
                while (i3 <= i20) {
                    arrayList16.add(new PathNode.RelativeReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                    i3 += 2;
                }
                return;
            case 'v':
                int i21 = i2 - 1;
                ArrayList<PathNode> arrayList17 = arrayList;
                while (i3 <= i21) {
                    arrayList17.add(new PathNode.RelativeVerticalTo(fArr[i3]));
                    i3++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c2);
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.LineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i2, int i3, p<? super float[], ? super Integer, ? extends PathNode> pVar) {
        int i4 = 0;
        while (i4 <= i2 - i3) {
            list.add(pVar.invoke(fArr, Integer.valueOf(i4)));
            i4 += i3;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }
}

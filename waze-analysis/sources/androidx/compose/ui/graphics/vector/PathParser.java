package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.a.c;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PathParser {
    public static final int $stable = 8;
    private float[] nodeData = new float[64];
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            arrayList = new ArrayList();
        }
        pathParser.pathStringToNodes(str, arrayList);
        return arrayList;
    }

    private final void resizeNodeData(int i2) {
        float[] fArr = this.nodeData;
        int length = fArr.length;
        if (i2 >= length) {
            float[] fArr2 = new float[i2 + i2];
            this.nodeData = fArr2;
            c.aq(fArr, fArr2, 0, 0, length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    public final PathParser addPathNodes(List<? extends PathNode> list) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final PathParser parsePathString(String str) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(str, arrayList);
        return this;
    }

    public final ArrayList<PathNode> pathStringToNodes(String str, ArrayList<PathNode> arrayList) {
        int i2;
        char cCharAt;
        int i3;
        int length = str.length();
        int i4 = 0;
        while (i4 < length && x.a(str.charAt(i4), 32) <= 0) {
            i4++;
        }
        while (length > i4) {
            int i5 = length - 1;
            if (x.a(str.charAt(i5), 32) > 0) {
                break;
            }
            length = i5;
        }
        int i6 = 0;
        while (i4 < length) {
            while (true) {
                i2 = i4 + 1;
                cCharAt = str.charAt(i4);
                int i7 = cCharAt | ' ';
                if ((i7 - 97) * (i7 - 122) <= 0 && i7 != 101) {
                    break;
                }
                if (i2 >= length) {
                    cCharAt = 0;
                    break;
                }
                i4 = i2;
            }
            if (cCharAt != 0) {
                int i8 = cCharAt | ' ';
                if (i8 != 122) {
                    while (i2 < length && x.a(str.charAt(i2), 32) <= 0) {
                        i2++;
                    }
                    i6 = 0;
                    while (true) {
                        long jNextFloat = (i8 != 97 || i6 < 3 || i6 >= 5) ? FastFloatParserKt.nextFloat(str, i2, length) : FastFloatParserKt.nextFloat(str, i2, Math.min(i2 + 1, length));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jNextFloat & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                        i3 = (int) (jNextFloat >>> 32);
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.nodeData;
                            int i9 = i6 + 1;
                            fArr[i6] = fIntBitsToFloat;
                            int length2 = fArr.length;
                            if (i9 >= length2) {
                                float[] fArr2 = new float[i9 + i9];
                                this.nodeData = fArr2;
                                c.aq(fArr, fArr2, 0, 0, length2);
                            }
                            i6 = i9;
                        }
                        while (i3 < length && (x.a(str.charAt(i3), 32) <= 0 || str.charAt(i3) == ',')) {
                            i3++;
                        }
                        if (i3 >= length || Float.isNaN(fIntBitsToFloat)) {
                            break;
                        }
                        i2 = i3;
                    }
                    i2 = i3;
                }
                PathNodeKt.addPathNodes(cCharAt, arrayList, this.nodeData, i6);
            }
            i4 = i2;
        }
        return arrayList;
    }

    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : ac.f47967a;
    }

    public final Path toPath(Path path) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            PathParserKt.toPath(arrayList, path);
            if (path != null) {
                return path;
            }
        }
        return AndroidPath_androidKt.Path();
    }
}

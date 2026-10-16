package androidx.graphics.shapes;

import androidx.graphics.shapes.Cubic;
import androidx.graphics.shapes.Feature;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FeatureDetectorKt {
    public static final boolean alignsIshWith(Cubic cubic, Cubic cubic2) {
        x.f(cubic, "<this>");
        x.f(cubic2, "next");
        return (straightIsh(cubic) && straightIsh(cubic2) && smoothesIntoIsh(cubic, cubic2)) || cubic.zeroLength$graphics_shapes() || cubic2.zeroLength$graphics_shapes();
    }

    public static final Feature asFeature(Cubic cubic, Cubic cubic2) {
        x.f(cubic, "<this>");
        x.f(cubic2, "next");
        return straightIsh(cubic) ? new Feature.Edge(i.d(cubic)) : new Feature.Corner(i.d(cubic), cubic.convexTo$graphics_shapes(cubic2));
    }

    public static final List<Feature> detectFeatures(List<? extends Cubic> list) {
        x.f(list, "cubics");
        if (list.isEmpty()) {
            return i.h();
        }
        List listB = i.b();
        Cubic cubicExtend = (Cubic) i.P(list);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Cubic cubic = list.get(i3 % list.size());
            if (i2 >= i.e(list) || !alignsIshWith(cubicExtend, cubic)) {
                listB.add(asFeature(cubicExtend, cubic));
                if (!smoothesIntoIsh(cubicExtend, cubic)) {
                    listB.add(asFeature(Cubic.Companion.empty$graphics_shapes(cubicExtend.getAnchor1X(), cubicExtend.getAnchor1Y()), cubic));
                }
                cubicExtend = cubic;
            } else {
                cubicExtend = extend(Cubic.Companion, cubicExtend, cubic);
            }
            i2 = i3;
        }
        return i.a(listB);
    }

    private static final Cubic extend(Cubic.Companion companion, Cubic cubic, Cubic cubic2) {
        return cubic.zeroLength$graphics_shapes() ? CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic2.getAnchor1X(), cubic2.getAnchor1Y()) : CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor1X(), cubic2.getAnchor1Y());
    }

    public static final boolean smoothesIntoIsh(Cubic cubic, Cubic cubic2) {
        x.f(cubic, "<this>");
        x.f(cubic2, "next");
        return Utils.collinearIsh(cubic.getControl1X(), cubic.getControl1Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic.getAnchor1X(), cubic.getAnchor1Y(), 0.005f);
    }

    public static final boolean straightIsh(Cubic cubic) {
        x.f(cubic, "<this>");
        return !cubic.zeroLength$graphics_shapes() && Utils.collinearIsh(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getAnchor1X(), cubic.getAnchor1Y(), cubic.getControl0X(), cubic.getControl0Y(), 0.005f) && Utils.collinearIsh(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getAnchor1X(), cubic.getAnchor1Y(), cubic.getControl1X(), cubic.getControl1Y(), 0.005f);
    }
}

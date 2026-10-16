package androidx.graphics.shapes;

import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PolygonValidator {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final RoundedPolygon fixCWOrientation(RoundedPolygon roundedPolygon) {
            List listB = i.b();
            listB.add(((Feature) i.P(roundedPolygon.getFeatures())).reversed());
            for (int iE = i.e(roundedPolygon.getFeatures()); iE > 0; iE--) {
                listB.add(roundedPolygon.getFeatures().get(iE).reversed());
            }
            return new RoundedPolygon(i.a(listB), roundedPolygon.m11958getCenter1ufDz9w$graphics_shapes(), null);
        }

        private final boolean isCWOriented(RoundedPolygon roundedPolygon) {
            int size = roundedPolygon.getCubics().size();
            float anchor1X = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                Cubic cubic = roundedPolygon.getCubics().get(i2);
                anchor1X += (cubic.getAnchor1X() - cubic.getAnchor0X()) * (cubic.getAnchor1Y() + cubic.getAnchor0Y());
            }
            return anchor1X < 0.0f;
        }

        public final RoundedPolygon fix(RoundedPolygon roundedPolygon) {
            x.f(roundedPolygon, "polygon");
            return isCWOriented(roundedPolygon) ? roundedPolygon : fixCWOrientation(roundedPolygon);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}

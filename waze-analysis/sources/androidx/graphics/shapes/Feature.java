package androidx.graphics.shapes;

import androidx.graphics.shapes.Feature;
import h.a.i;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Feature {
    public static final Factory Factory = new Factory(null);
    private final List<Cubic> cubics;

    /* compiled from: WazeSource */
    public final class Edge extends Feature {
        private final boolean isConcaveCorner;
        private final boolean isConvexCorner;
        private final boolean isEdge;
        private final boolean isIgnorableFeature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edge(List<? extends Cubic> list) {
            super(list);
            x.f(list, "cubics");
            this.isIgnorableFeature = true;
            this.isEdge = true;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isConcaveCorner() {
            return this.isConcaveCorner;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isConvexCorner() {
            return this.isConvexCorner;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isEdge() {
            return this.isEdge;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isIgnorableFeature() {
            return this.isIgnorableFeature;
        }

        @Override // androidx.graphics.shapes.Feature
        public Edge reversed() {
            ArrayList arrayList = new ArrayList();
            for (int iE = i.e(getCubics()); iE >= 0; iE--) {
                arrayList.add(getCubics().get(iE).reverse());
            }
            return new Edge(arrayList);
        }

        public String toString() {
            return "Edge";
        }

        @Override // androidx.graphics.shapes.Feature
        public Edge transformed(PointTransformer pointTransformer) {
            x.f(pointTransformer, "f");
            List listB = i.b();
            int size = getCubics().size();
            for (int i2 = 0; i2 < size; i2++) {
                listB.add(getCubics().get(i2).transformed(pointTransformer));
            }
            return new Edge(i.a(listB));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Feature(List<? extends Cubic> list) {
        x.f(list, "cubics");
        this.cubics = list;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public abstract boolean isConcaveCorner();

    public abstract boolean isConvexCorner();

    public abstract boolean isEdge();

    public abstract boolean isIgnorableFeature();

    public abstract Feature reversed();

    public abstract Feature transformed(PointTransformer pointTransformer);

    /* compiled from: WazeSource */
    public final class Factory {
        private Factory() {
        }

        private final boolean isContinuous(Feature feature) {
            Cubic cubic = (Cubic) i.P(feature.getCubics());
            int iE = i.e(feature.getCubics());
            if (iE > 0) {
                int i2 = 1;
                while (true) {
                    Cubic cubic2 = feature.getCubics().get(i2);
                    if (Math.abs(cubic2.getAnchor0X() - cubic.getAnchor1X()) <= 1.0E-4f && Math.abs(cubic2.getAnchor0Y() - cubic.getAnchor1Y()) <= 1.0E-4f) {
                        if (i2 == iE) {
                            break;
                        }
                        i2++;
                        cubic = cubic2;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }

        private final Feature validated(Feature feature) {
            if (feature.getCubics().isEmpty()) {
                throw new IllegalArgumentException("Features need at least one cubic.");
            }
            if (isContinuous(feature)) {
                return feature;
            }
            throw new IllegalArgumentException("Feature must be continuous, with the anchor points of all cubics matching the anchor points of the preceding and succeeding cubics");
        }

        public final Feature buildConcaveCorner(List<? extends Cubic> list) {
            x.f(list, "cubics");
            Corner corner = new Corner(list, false);
            validated(corner);
            return corner;
        }

        public final Feature buildConvexCorner(List<? extends Cubic> list) {
            x.f(list, "cubics");
            Corner corner = new Corner(list, true);
            validated(corner);
            return corner;
        }

        public final Feature buildEdge(Cubic cubic) {
            x.f(cubic, "cubic");
            return new Edge(i.d(cubic));
        }

        public final Feature buildIgnorableFeature(List<? extends Cubic> list) {
            x.f(list, "cubics");
            Edge edge = new Edge(list);
            validated(edge);
            return edge;
        }

        public /* synthetic */ Factory(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class Corner extends Feature {
        private final boolean convex;
        private final boolean isConcaveCorner;
        private final boolean isConvexCorner;
        private final boolean isEdge;
        private final boolean isIgnorableFeature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Corner(List<? extends Cubic> list, boolean z) {
            super(list);
            x.f(list, "cubics");
            this.convex = z;
            this.isConvexCorner = z;
            this.isConcaveCorner = !z;
        }

        static final CharSequence toString$lambda$0(Cubic cubic) {
            x.f(cubic, "it");
            return "[" + cubic + "]";
        }

        public final boolean getConvex() {
            return this.convex;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isConcaveCorner() {
            return this.isConcaveCorner;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isConvexCorner() {
            return this.isConvexCorner;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isEdge() {
            return this.isEdge;
        }

        @Override // androidx.graphics.shapes.Feature
        public boolean isIgnorableFeature() {
            return this.isIgnorableFeature;
        }

        @Override // androidx.graphics.shapes.Feature
        public Corner reversed() {
            ArrayList arrayList = new ArrayList();
            for (int iE = i.e(getCubics()); iE >= 0; iE--) {
                arrayList.add(getCubics().get(iE).reverse());
            }
            return new Corner(arrayList, !this.convex);
        }

        public String toString() throws IOException {
            return "Corner: cubics=" + i.aM(getCubics(), ", ", null, null, 0, new l() { // from class: androidx.graphics.shapes.Feature$Corner$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Feature.Corner.toString$lambda$0((Cubic) obj);
                }
            }, 30) + " convex=" + this.convex;
        }

        @Override // androidx.graphics.shapes.Feature
        public Feature transformed(PointTransformer pointTransformer) {
            x.f(pointTransformer, "f");
            List listB = i.b();
            int size = getCubics().size();
            for (int i2 = 0; i2 < size; i2++) {
                listB.add(getCubics().get(i2).transformed(pointTransformer));
            }
            return new Corner(i.a(listB), this.convex);
        }

        public /* synthetic */ Corner(List list, boolean z, int i2, o oVar) {
            this(list, z | (!((i2 & 2) == 0)));
        }
    }
}

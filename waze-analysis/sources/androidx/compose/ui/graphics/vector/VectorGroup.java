package androidx.compose.ui.graphics.vector;

import h.a.ac;
import h.g.b.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, a {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<VectorNode>, a {
        private final Iterator<VectorNode> it;

        AnonymousClass1(VectorGroup vectorGroup) {
            this.it = vectorGroup.children.iterator();
        }

        public final Iterator<VectorNode> getIt() {
            return this.it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public VectorNode next() {
            return this.it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2, int i2, o oVar) {
        List emptyPath = (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        ac acVar = (i2 & 512) != 0 ? ac.f47967a : list2;
        int i3 = i2 & 64;
        int i4 = i2 & 32;
        int i5 = i2 & 16;
        int i6 = i2 & 8;
        int i7 = i2 & 4;
        int i8 = i2 & 2;
        int i9 = i2 & 1;
        float f9 = (i2 & 128) != 0 ? 0.0f : f8;
        float f10 = i3 != 0 ? 0.0f : f7;
        float f11 = i4 != 0 ? 1.0f : f6;
        float f12 = i5 == 0 ? f5 : 1.0f;
        float f13 = i6 != 0 ? 0.0f : f4;
        float f14 = i7 != 0 ? 0.0f : f3;
        f2 = i8 != 0 ? 0.0f : f2;
        float f15 = f14;
        String str2 = 1 == i9 ? "" : str;
        this(str2, f2, f15, f13, f12, f11, f10, f9, emptyPath, acVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return x.n(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && x.n(this.clipPathData, vectorGroup.clipPathData) && x.n(this.children, vectorGroup.children);
        }
        return false;
    }

    public final VectorNode get(int i2) {
        return this.children.get(i2);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.floatToIntBits(this.rotation)) * 31) + Float.floatToIntBits(this.pivotX)) * 31) + Float.floatToIntBits(this.pivotY)) * 31) + Float.floatToIntBits(this.scaleX)) * 31) + Float.floatToIntBits(this.scaleY)) * 31) + Float.floatToIntBits(this.translationX)) * 31) + Float.floatToIntBits(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f2;
        this.pivotX = f3;
        this.pivotY = f4;
        this.scaleX = f5;
        this.scaleY = f6;
        this.translationX = f7;
        this.translationY = f8;
        this.clipPathData = list;
        this.children = list2;
    }

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }
}

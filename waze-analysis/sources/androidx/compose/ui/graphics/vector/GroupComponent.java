package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private l<? super VNode, ab> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final l<VNode, ab> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m8264getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new GroupComponent$wrappedListener$1(this);
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m8264getUnspecified0d7_KjU();
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m8990markTintForColor8_81llA(((SolidColor) brush).m8614getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m8990markTintForColor8_81llA(long j2) {
        if (this.isTintable && j2 != 16) {
            long j3 = this.tintColor;
            if (j3 == 16) {
                this.tintColor = j2;
            } else {
                if (VectorKt.m9013rgbEqualOWjLjI(j3, j2)) {
                    return;
                }
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m8990markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            }
            PathParserKt.toPath(this.clipPathData, Path);
        }
    }

    private final void updateMatrix() {
        float[] fArrM8492constructorimpl$default = this.groupMatrix;
        if (fArrM8492constructorimpl$default == null) {
            fArrM8492constructorimpl$default = Matrix.m8492constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM8492constructorimpl$default;
        } else {
            Matrix.m8501resetimpl(fArrM8492constructorimpl$default);
        }
        float[] fArr = fArrM8492constructorimpl$default;
        Matrix.m8514translateimpl$default(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m8506rotateZimpl(fArr, this.rotation);
        Matrix.m8507scaleimpl(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.m8514translateimpl$default(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo8766transform58bKbWc(Matrix.m8490boximpl(fArr).m8515unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.CC.m8895clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).draw(drawScope);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public l<VNode, ab> getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
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

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m8991getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i2, VNode vNode) {
        int numChildren = getNumChildren();
        List<VNode> list = this.children;
        if (i2 < numChildren) {
            list.set(i2, vNode);
        } else {
            list.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui(this.wrappedListener);
        invalidate();
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    public final void move(int i2, int i3, int i4) {
        int i5 = 0;
        if (i2 > i3) {
            while (i5 < i4) {
                VNode vNode = this.children.get(i2);
                this.children.remove(i2);
                this.children.add(i3, vNode);
                i3++;
                i5++;
            }
        } else {
            while (i5 < i4) {
                VNode vNode2 = this.children.get(i2);
                this.children.remove(i2);
                this.children.add(i3 - 1, vNode2);
                i5++;
            }
        }
        invalidate();
    }

    public final void remove(int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 < this.children.size()) {
                this.children.get(i2).setInvalidateListener$ui(null);
                this.children.remove(i2);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui(l<? super VNode, ab> lVar) {
        this.invalidateListener = lVar;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f2) {
        this.pivotX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f2) {
        this.pivotY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f2) {
        this.rotation = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f2) {
        this.scaleX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f2) {
        this.scaleY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f2) {
        this.translationX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f2) {
        this.translationY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            VNode vNode = list.get(i2);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

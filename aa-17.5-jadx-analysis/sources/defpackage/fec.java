package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fec extends fgc {
    private static final String[] a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator z = new tte(1);
    private static final Property A = new fdz(Matrix.class);

    private static final void f(fgo fgoVar, boolean z2) {
        View view = fgoVar.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map map = fgoVar.a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                Matrix matrix = z2 ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
                if (matrix == null) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                        matrix = new Matrix(imageView.getImageMatrix());
                    } else {
                        int i = fea.a[imageView.getScaleType().ordinal()];
                        if (i == 1) {
                            Drawable drawable2 = imageView.getDrawable();
                            Matrix matrix2 = new Matrix();
                            matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                            matrix = matrix2;
                        } else if (i != 2) {
                            matrix = new Matrix(imageView.getImageMatrix());
                        } else {
                            Drawable drawable3 = imageView.getDrawable();
                            int intrinsicWidth = drawable3.getIntrinsicWidth();
                            float width = imageView.getWidth();
                            float f = intrinsicWidth;
                            int intrinsicHeight = drawable3.getIntrinsicHeight();
                            float height = imageView.getHeight();
                            float f2 = intrinsicHeight;
                            float fMax = Math.max(width / f, height / f2);
                            float f3 = (height - (f2 * fMax)) / 2.0f;
                            int iRound = Math.round((width - (f * fMax)) / 2.0f);
                            int iRound2 = Math.round(f3);
                            Matrix matrix3 = new Matrix();
                            matrix3.postScale(fMax, fMax);
                            matrix3.postTranslate(iRound, iRound2);
                            matrix = matrix3;
                        }
                    }
                }
                map.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    @Override // defpackage.fgc
    public final Animator a(ViewGroup viewGroup, fgo fgoVar, fgo fgoVar2) {
        if (fgoVar != null && fgoVar2 != null) {
            Map map = fgoVar.a;
            Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
            Map map2 = fgoVar2.a;
            Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
                boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z2) {
                    return null;
                }
                ImageView imageView = (ImageView) fgoVar2.b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    Property property = A;
                    TypeEvaluator typeEvaluator = z;
                    Matrix matrix3 = ffd.a;
                    return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix3, matrix3);
                }
                if (matrix == null) {
                    matrix = ffd.a;
                }
                if (matrix2 == null) {
                    matrix2 = ffd.a;
                }
                Property property2 = A;
                property2.set(imageView, matrix);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property2, new fgn(), matrix, matrix2);
                feb febVar = new feb(imageView, matrix, matrix2);
                objectAnimatorOfObject.addListener(febVar);
                objectAnimatorOfObject.addPauseListener(febVar);
                H(febVar);
                return objectAnimatorOfObject;
            }
        }
        return null;
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        f(fgoVar, false);
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        f(fgoVar, true);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return a;
    }
}

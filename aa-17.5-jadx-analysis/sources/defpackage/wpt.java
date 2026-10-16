package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes3.dex */
public final class wpt extends ViewOutlineProvider {
    final /* synthetic */ ShapeableImageView a;
    private final Rect b = new Rect();

    public wpt(ShapeableImageView shapeableImageView) {
        this.a = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.a;
        if (shapeableImageView.c == null) {
            return;
        }
        if (shapeableImageView.b == null) {
            shapeableImageView.b = new wue(shapeableImageView.c);
        }
        RectF rectF = shapeableImageView.a;
        Rect rect = this.b;
        rectF.round(rect);
        shapeableImageView.b.setBounds(rect);
        shapeableImageView.b.getOutline(outline);
    }
}

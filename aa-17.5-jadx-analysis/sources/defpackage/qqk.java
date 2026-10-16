package defpackage;

import android.graphics.Rect;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import java.util.List;

/* loaded from: classes.dex */
public final class qqk {
    public final int a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public Rect f = new Rect();
    public List g;
    public ProjectionWindowDecorationParams h;
    public ProjectionWindowAnimationParams i;
    public ProjectionWindowAnimationParams j;
    public int k;
    public int l;

    public qqk(int i, int i2) {
        int i3 = yfq.d;
        this.g = yls.a;
        this.h = ProjectionWindowDecorationParams.a();
        this.i = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.j = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.k = 1;
        this.l = 0;
        this.a = i;
        this.b = i2;
    }
}

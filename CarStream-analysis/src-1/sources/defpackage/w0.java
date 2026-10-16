package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.k;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class w0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(Object obj, FrameLayout frameLayout, int i) {
        this.a = i;
        this.c = obj;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                ((ScrollView) this.b).post(new f(this, 4));
                break;
            case 1:
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    ((CarScreen) this.c).ghiCoMan((k) this.b);
                    break;
                }
                break;
            case 2:
                q4 q4Var = (q4) this.c;
                int i9 = i3 - i;
                int i10 = i4 - i2;
                if (i9 > 0 && q4Var.b(i9, i10) != q4Var.l) {
                    ((ScrollView) this.b).post(new x(this, i9, i10));
                    break;
                }
                break;
            default:
                ((HorizontalScrollView) this.b).post(new t7(this, 12));
                break;
        }
    }
}

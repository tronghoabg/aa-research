package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.player.SeekArea;
import com.carstream.tech.core.speed.SpeedBubble;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class y1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                z1 z1Var = (z1) this.b;
                z1Var.o(((SeekArea) z1Var.i).c());
                break;
            case 1:
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    a8 a8Var = ((CarScreen) this.b).nutTim;
                    FrameLayout frameLayout = a8Var.a.b.rootLayout;
                    ImageView imageView = a8Var.b;
                    if (imageView != null && frameLayout != null) {
                        imageView.post(new h(11, a8Var, frameLayout));
                        break;
                    }
                }
                break;
            case 2:
                if (i4 - i2 != i8 - i6) {
                    g3 g3Var = (g3) this.b;
                    g3Var.b(g3Var.i);
                    break;
                }
                break;
            default:
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    za zaVar = (za) this.b;
                    FrameLayout frameLayout2 = zaVar.a.b.rootLayout;
                    SpeedBubble speedBubble = zaVar.c;
                    if (speedBubble != null && frameLayout2 != null) {
                        speedBubble.post(new t(zaVar, frameLayout2, 8));
                        break;
                    }
                }
                break;
        }
    }
}

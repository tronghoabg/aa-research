package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.carstream.tech.car.a;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v0 implements View.OnScrollChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(Object obj, FrameLayout frameLayout, int i) {
        this.a = i;
        this.c = obj;
        this.b = frameLayout;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                a.a((a) this.c, (ScrollView) this.b);
                break;
            default:
                oc.a((oc) this.c, (HorizontalScrollView) this.b);
                break;
        }
    }
}

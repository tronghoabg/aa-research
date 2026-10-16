package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class a8 {
    public final e a;
    public ImageView b;

    public a8(e eVar) {
        this.a = eVar;
    }

    public static String a(a8 a8Var, String str) {
        FrameLayout frameLayout = a8Var.a.b.rootLayout;
        return str + "_" + frameLayout.getWidth() + "x" + frameLayout.getHeight();
    }
}

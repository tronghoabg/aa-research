package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j6 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ MainActivity a;

    public j6(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        i8 i8Var = this.a.nav;
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        LinearLayout linearLayout = i8Var.e;
        if (linearLayout == null) {
            return windowInsets;
        }
        linearLayout.setPadding(linearLayout.getPaddingLeft(), i8Var.e.getPaddingTop(), i8Var.e.getPaddingRight(), systemWindowInsetBottom);
        return windowInsets;
    }
}

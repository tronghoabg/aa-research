package k1;

import a9.C1341a;
import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: k1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3135w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3134v f38878a;

    public C3135w(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f38878a = new C3133u(nestedScrollView);
        } else {
            this.f38878a = new C1341a();
        }
    }
}

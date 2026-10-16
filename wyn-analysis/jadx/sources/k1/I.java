package k1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public v0 f38772a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f38773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f38774c;

    public I(View view, r rVar) {
        this.f38773b = view;
        this.f38774c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v0 v0VarG = v0.g(view, windowInsets);
        int i5 = Build.VERSION.SDK_INT;
        r rVar = this.f38774c;
        if (i5 < 30) {
            J.a(windowInsets, this.f38773b);
            if (v0VarG.equals(this.f38772a)) {
                return rVar.v(view, v0VarG).f();
            }
        }
        this.f38772a = v0VarG;
        v0 v0VarV = rVar.v(view, v0VarG);
        if (i5 >= 30) {
            return v0VarV.f();
        }
        WeakHashMap weakHashMap = S.f38779a;
        H.c(view);
        return v0VarV.f();
    }
}

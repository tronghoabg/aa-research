package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class twv implements View.OnKeyListener {
    private final Map a = new HashMap();

    public twv() {
        a(twu.a, 19);
        a(twu.b, 20);
        a(twu.d, 22);
        a(twu.c, 21);
        a(twu.e, 157, 70, 81);
        a(twu.f, 156, 69);
    }

    private final void a(twu twuVar, int... iArr) {
        for (int i : iArr) {
            this.a.put(Integer.valueOf(i), twuVar);
        }
    }

    @Override // android.view.View.OnKeyListener
    @ResultIgnorabilityUnspecified
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }
}

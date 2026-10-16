package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public interface ror {
    void A(raq raqVar);

    void B(Rect rect);

    void C(boolean z, int i, int i2);

    void D(Rect rect);

    boolean E();

    boolean F();

    void G();

    void H();

    Context a();

    Context b();

    Pair c(KeyEvent keyEvent);

    Pair d(MotionEvent motionEvent);

    Display e();

    LayoutInflater f();

    View g(int i);

    Window h();

    rax i();

    void j();

    void k();

    void l(PrintWriter printWriter);

    void m();

    void n();

    void o(InputFocusChangedEvent inputFocusChangedEvent);

    void p();

    void q(View view);

    void r(Rect rect);

    void s(boolean z);

    void t(boolean z);

    void u(Rect rect);

    void v(Configuration configuration);

    void w(int i);

    void x(DrawingSpec drawingSpec);

    void y();

    void z();
}

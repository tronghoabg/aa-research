package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.display.CarRegionId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.UUID;

/* loaded from: classes.dex */
public interface jkk extends ixl, ivg {
    void E();

    void F();

    void G(jhf jhfVar, MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData);

    void H(MotionEvent motionEvent);

    void I(MotionEvent motionEvent);

    void J(xop xopVar, UUID uuid);

    void K(jhf jhfVar, boolean z);

    void L(jhf jhfVar, boolean z, jid jidVar, jid jidVar2);

    void M(Runnable runnable);

    void P(jhf jhfVar);

    void T();

    void U();

    void V(ivv ivvVar);

    void W(CarRegionId carRegionId, jhf jhfVar, jid jidVar, jid jidVar2);

    void X(boolean z);

    void Y();

    void Z(jhf jhfVar);

    int a(int i);

    void aa(CarRegionId carRegionId, jhf jhfVar);

    void ab(CarRegionId carRegionId, jhf jhfVar, int i);

    boolean ae();

    @ResultIgnorabilityUnspecified
    boolean ai(jhf jhfVar, KeyEvent keyEvent);

    boolean aj(jgt jgtVar, int i);

    boolean am(Surface surface);

    boolean an(jiw jiwVar);

    void ap(KeyEvent keyEvent);

    void aq(KeyEvent keyEvent);

    int b();

    int d();

    int e();

    int f(jhf jhfVar, Rect rect, Rect rect2, int i, int i2, int i3, yfq yfqVar, UUID uuid, ProjectionWindowDecorationParams projectionWindowDecorationParams);

    Point h();

    Rect i(Rect rect);

    jhf j(jki jkiVar);

    CarUiInfo o();

    CarRegionId p();

    void q(jhf jhfVar);

    void r(jhf jhfVar, int i);

    void t(iuw iuwVar, UUID uuid);

    void w(PrintWriter printWriter);

    void z();
}

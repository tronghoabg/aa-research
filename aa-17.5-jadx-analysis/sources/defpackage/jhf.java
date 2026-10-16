package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.display.CarRegionId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public interface jhf {
    CarWindowManagerLayoutParams A();

    ProjectionWindowDecorationParams B();

    CarRegionId C();

    yfq D();

    String E();

    UUID F();

    void G();

    void H();

    void J();

    void K();

    void L();

    void M(KeyEvent keyEvent);

    void N(long j, List list);

    void O(MotionEvent motionEvent);

    void P(MotionEvent motionEvent);

    void Q(int i);

    void U(int i);

    void V();

    void W(InputFocusChangedEvent inputFocusChangedEvent);

    void X(KeyEvent keyEvent);

    void Z(MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData);

    boolean aA();

    boolean aB();

    boolean aC();

    boolean aD();

    boolean aE();

    boolean aF();

    @ResultIgnorabilityUnspecified
    void aG(long j, long j2, int i, List list);

    void aI();

    Surface aJ();

    jhg aK();

    DrawingSpec aL();

    String aM();

    void aN();

    void aO(jhs jhsVar, boolean z);

    void aQ(PrintWriter printWriter);

    void aR(jjh jjhVar) throws jiy;

    void aT();

    void aV(long j);

    boolean aX();

    boolean aY();

    void aa(KeyEvent keyEvent);

    void ab();

    void ac();

    void ad();

    void af();

    void ag();

    void ai(Rect rect);

    void aj(int i);

    void ak(int i, int i2, int i3, int i4, int i5, Rect rect, int i6, int i7, jid jidVar, jid jidVar2, int i8, int i9, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, UUID uuid, Rect rect2, int i10);

    void al(int i);

    void am(int i);

    void an(CarWindowManagerLayoutParams carWindowManagerLayoutParams);

    void ao();

    void ap();

    void ar(boolean z);

    void as(Rect rect);

    void au(Rect rect, boolean z);

    boolean av(int i);

    boolean aw(int i, int i2);

    boolean ax(int i);

    int b();

    int c();

    int d();

    int e();

    int f();

    int g();

    int h();

    int i();

    int j();

    int k();

    int l();

    @ResultIgnorabilityUnspecified
    int m(int i, int i2, int i3, int i4, int i5, Rect rect, int i6, int i7, jid jidVar, jid jidVar2, int i8, int i9, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, UUID uuid, Rect rect2);

    Rect n();

    Rect o();

    Rect p();

    Rect q();

    Rect r();

    Rect s();

    Rect t();

    Rect u();

    Rect v();

    jhq x();

    jid y();

    jid z();
}

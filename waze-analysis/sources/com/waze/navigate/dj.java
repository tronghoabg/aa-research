package com.waze.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.PolylineGeometry;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface dj {
    @Deprecated(since = "use onCurrentInstructionDistanceChanged")
    void A(String str, String str2, int i2);

    @Deprecated(since = "use onEtaDistanceStateChanged")
    void B(int i2);

    void C();

    void D(com.waze.modules.c.eb ebVar);

    void E(com.waze.realtime_report_feedback.c cVar);

    void F(com.waze.realtime_report_feedback.c cVar);

    void G(com.waze.realtime_report_feedback.c cVar);

    void a(a aVar);

    void b(int i2);

    void bB(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar);

    void c(ea eaVar);

    void d(de deVar);

    void e(com.waze.av.b.n nVar);

    void f(com.waze.br brVar);

    void g(de deVar);

    void h(String str, String str2, int i2);

    void j(int i2);

    void k(di diVar);

    void l(com.waze.shared_infra.l.a aVar, long j2);

    void m(boolean z, int i2);

    void n(int i2);

    void o(ea eaVar);

    void p(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign);

    void q(com.waze.shared_infra.l.a aVar);

    void r(boolean z);

    void s(PolylineGeometry polylineGeometry);

    void t(Long l2);

    void u(boolean z);

    void v(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign);

    void w(String str);

    void x(ga gaVar);

    void y(boolean z);

    void z(Position.IntPosition intPosition);
}

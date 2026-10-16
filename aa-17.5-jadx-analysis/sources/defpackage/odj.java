package defpackage;

import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface odj extends lhg, mnd {
    boolean A();

    boolean B();

    boolean C(String str);

    void D(ebf ebfVar);

    void E(ebf ebfVar);

    int a();

    Uri b(CarCall carCall);

    PhoneCall e();

    Integer f(CarCall carCall);

    String g(CarCall carCall);

    List i();

    List j(Set set);

    List k();

    List l();

    void m(int i);

    void n(CarCall carCall);

    @Deprecated
    void o();

    void p(String str);

    void q();

    void r(char c);

    void s(CarCall carCall, PhoneAccountHandle phoneAccountHandle);

    void t(int i);

    void u(int i, boolean z);

    void v();

    void w(CarCall carCall);

    void x();

    @ResultIgnorabilityUnspecified
    boolean y(int i);

    boolean z(int i);
}

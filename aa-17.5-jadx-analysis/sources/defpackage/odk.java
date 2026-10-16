package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.Uri;
import android.telecom.CallAudioState;
import android.telecom.PhoneAccountHandle;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;

/* loaded from: classes.dex */
public interface odk {
    int a();

    int b();

    Uri c(CarCall carCall);

    CallAudioState d();

    Integer e(CarCall carCall);

    String f(CarCall carCall);

    List g();

    void h(CarCall carCall);

    void i(CarCall carCall, CarCall carCall2);

    void j(CarCall carCall);

    void k(String str);

    void l(CarCall carCall, char c);

    void m(BluetoothDevice bluetoothDevice);

    void n(int i);

    void o(CarCall carCall, boolean z);

    void p(Context context);

    void q();

    void r(CarCall carCall);

    void s(CarCall carCall);

    @ResultIgnorabilityUnspecified
    boolean t(int i);

    boolean u(CarCall carCall);

    void v(CarCall carCall, PhoneAccountHandle phoneAccountHandle);

    void w(ebf ebfVar);

    void x(ebf ebfVar);
}

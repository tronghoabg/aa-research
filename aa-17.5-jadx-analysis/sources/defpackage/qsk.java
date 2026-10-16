package defpackage;

import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public interface qsk extends rwc, rwe {
    qvr A();

    qvx B();

    qyh J();

    rjb P();

    String Y(String str, String str2);

    qsk a();

    void aA(byte[] bArr, int i);

    void aC(CarFrxEvent carFrxEvent);

    void aM(qwg qwgVar);

    void aR(String str, boolean z);

    void aW(String str, String str2);

    List ad(String str, List list);

    void b();

    void bg(qwg qwgVar);

    boolean bp(String str, boolean z);

    boolean bq(String str, boolean z);

    boolean bs();

    void c();

    void d(PrintWriter printWriter);

    void e();

    void f(CriticalError criticalError);

    void g();

    int h();

    void i(CarInfoInternal carInfoInternal, ruw ruwVar, int i, int i2, boolean z, CarBluetoothData carBluetoothData);

    void j();

    CarInfo s();

    qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar);

    qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar);

    qvb z();
}

package defpackage;

import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class qtg extends quo implements qsk {
    public final AtomicReference k;

    public qtg(qsk qskVar) {
        this.k = new AtomicReference(qskVar);
    }

    @Override // defpackage.qup
    public final qvr A() {
        return ((qsk) this.k.get()).A();
    }

    @Override // defpackage.qup
    public final qvx B() {
        return ((qsk) this.k.get()).B();
    }

    @Override // defpackage.qup
    public final qyh J() {
        return ((qsk) this.k.get()).J();
    }

    @Override // defpackage.qup
    public final rjb P() {
        return ((qsk) this.k.get()).P();
    }

    @Override // defpackage.qup
    public final String Y(String str, String str2) {
        return ((qsk) this.k.get()).Y(str, str2);
    }

    @Override // defpackage.qsk
    public final qsk a() {
        return (qsk) this.k.get();
    }

    @Override // defpackage.qup
    public final void aA(byte[] bArr, int i) {
        ((qsk) this.k.get()).aA(bArr, i);
    }

    @Override // defpackage.qup
    public final void aC(CarFrxEvent carFrxEvent) {
        ((qsk) this.k.get()).aC(carFrxEvent);
    }

    @Override // defpackage.qup
    public final void aM(qwg qwgVar) {
        ((qsk) this.k.get()).aM(qwgVar);
    }

    @Override // defpackage.qup
    public final void aR(String str, boolean z) {
        ((qsk) this.k.get()).aR(str, z);
    }

    @Override // defpackage.qup
    public final void aW(String str, String str2) {
        ((qsk) this.k.get()).aW(str, str2);
    }

    @Override // defpackage.qup
    public final List ad(String str, List list) {
        return ((qsk) this.k.get()).ad(str, list);
    }

    @Override // defpackage.qsk
    public final void b() {
        ((qsk) this.k.get()).b();
    }

    @Override // defpackage.qup
    public final void bg(qwg qwgVar) {
        ((qsk) this.k.get()).bg(qwgVar);
    }

    @Override // defpackage.qup
    @ResultIgnorabilityUnspecified
    public final boolean bp(String str, boolean z) {
        return ((qsk) this.k.get()).bp(str, z);
    }

    @Override // defpackage.qup
    public final boolean bq(String str, boolean z) {
        return ((qsk) this.k.get()).bq(str, z);
    }

    @Override // defpackage.qup, defpackage.jew
    public final boolean bs() {
        return ((qsk) this.k.get()).bs();
    }

    @Override // defpackage.qsk
    public final void c() {
        ((qsk) this.k.get()).c();
    }

    public void d(PrintWriter printWriter) {
        ((qsk) this.k.get()).d(printWriter);
    }

    @Override // defpackage.qsk
    public final void e() {
        ((qsk) this.k.get()).e();
    }

    public void f(CriticalError criticalError) {
        ((qsk) this.k.get()).f(criticalError);
    }

    @Override // defpackage.qsk
    public final void g() {
        ((qsk) this.k.get()).g();
    }

    @Override // defpackage.qup, defpackage.jew
    public final int h() {
        return ((qsk) this.k.get()).h();
    }

    @Override // defpackage.qsk
    public final void i(CarInfoInternal carInfoInternal, ruw ruwVar, int i, int i2, boolean z, CarBluetoothData carBluetoothData) {
        ((qsk) this.k.get()).i(carInfoInternal, ruwVar, i, i2, z, carBluetoothData);
    }

    public void j() {
        ((qsk) this.k.get()).j();
    }

    @Override // defpackage.rwc
    public final CarInfo l() {
        throw null;
    }

    @Override // defpackage.rwe
    public final void n(yze yzeVar, yzf yzfVar, String str) {
        throw null;
    }

    @Override // defpackage.qup
    public final CarInfo s() {
        return ((qsk) this.k.get()).s();
    }

    @Override // defpackage.qup
    public final qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar) {
        return ((qsk) this.k.get()).w(createAudioPolicyRequest, qudVar, qujVar);
    }

    @Override // defpackage.qup
    public final qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) {
        return ((qsk) this.k.get()).x(createAudioRecordRequest, qudVar);
    }

    @Override // defpackage.qup
    public final qvb z() {
        return ((qsk) this.k.get()).z();
    }
}

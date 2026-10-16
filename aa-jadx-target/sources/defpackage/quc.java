package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class quc extends defpackage.qvk implements defpackage.qte {
    public final java.util.concurrent.atomic.AtomicReference k;

    public quc(defpackage.qte qteVar) {
        this.k = new java.util.concurrent.atomic.AtomicReference(qteVar);
    }

    @Override // defpackage.qvl
    public final defpackage.qwn A() {
        return ((defpackage.qte) this.k.get()).A();
    }

    @Override // defpackage.qvl
    public final qwt B() {
        return ((defpackage.qte) this.k.get()).B();
    }

    @Override // defpackage.qvl
    public final defpackage.qzd J() {
        return ((defpackage.qte) this.k.get()).J();
    }

    @Override // defpackage.qvl
    public final rjx P() {
        return ((defpackage.qte) this.k.get()).P();
    }

    @Override // defpackage.qvl
    public final java.lang.String Y(java.lang.String str, java.lang.String str2) {
        return ((defpackage.qte) this.k.get()).Y(str, str2);
    }

    @Override // defpackage.qte
    public final defpackage.qte a() {
        return (defpackage.qte) this.k.get();
    }

    @Override // defpackage.qvl
    public final void aA(byte[] bArr, int i) {
        ((defpackage.qte) this.k.get()).aA(bArr, i);
    }

    @Override // defpackage.qvl
    public final void aC(com.google.android.gms.car.CarFrxEvent carFrxEvent) {
        ((defpackage.qte) this.k.get()).aC(carFrxEvent);
    }

    @Override // defpackage.qvl
    public final void aM(defpackage.qxc qxcVar) {
        ((defpackage.qte) this.k.get()).aM(qxcVar);
    }

    @Override // defpackage.qvl
    public final void aR(java.lang.String str, boolean z) {
        ((defpackage.qte) this.k.get()).aR(str, z);
    }

    @Override // defpackage.qvl
    public final void aW(java.lang.String str, java.lang.String str2) {
        ((defpackage.qte) this.k.get()).aW(str, str2);
    }

    @Override // defpackage.qvl
    public final java.util.List ad(java.lang.String str, java.util.List list) {
        return ((defpackage.qte) this.k.get()).ad(str, list);
    }

    @Override // defpackage.qte
    public final void b() {
        ((defpackage.qte) this.k.get()).b();
    }

    @Override // defpackage.qvl
    public final void bg(defpackage.qxc qxcVar) {
        ((defpackage.qte) this.k.get()).bg(qxcVar);
    }

    @Override // defpackage.qvl
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean bp(java.lang.String str, boolean z) {
        return ((defpackage.qte) this.k.get()).bp(str, z);
    }

    @Override // defpackage.qvl
    public final boolean bq(java.lang.String str, boolean z) {
        return ((defpackage.qte) this.k.get()).bq(str, z);
    }

    @Override // defpackage.qvl, defpackage.jfe
    public final boolean bs() {
        return ((defpackage.qte) this.k.get()).bs();
    }

    @Override // defpackage.qte
    public final void c() {
        ((defpackage.qte) this.k.get()).c();
    }

    public void d(java.io.PrintWriter printWriter) {
        ((defpackage.qte) this.k.get()).d(printWriter);
    }

    @Override // defpackage.qte
    public final void e() {
        ((defpackage.qte) this.k.get()).e();
    }

    public void f(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        ((defpackage.qte) this.k.get()).f(criticalError);
    }

    @Override // defpackage.qte
    public final void g() {
        ((defpackage.qte) this.k.get()).g();
    }

    @Override // defpackage.qvl, defpackage.jfe
    public final int h() {
        return ((defpackage.qte) this.k.get()).h();
    }

    @Override // defpackage.qte
    public final void i(com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, defpackage.rvp rvpVar, int i, int i2, boolean z, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData) {
        ((defpackage.qte) this.k.get()).i(carInfoInternal, rvpVar, i, i2, z, carBluetoothData);
    }

    public void j() {
        ((defpackage.qte) this.k.get()).j();
    }

    @Override // defpackage.rwv
    public final com.google.android.gms.car.CarInfo l() {
        throw null;
    }

    @Override // defpackage.rwx
    public final void n(defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        throw null;
    }

    @Override // defpackage.qvl
    public final com.google.android.gms.car.CarInfo s() {
        return ((defpackage.qte) this.k.get()).s();
    }

    @Override // defpackage.qvl
    public final qvc w(com.google.android.gms.car.CreateAudioPolicyRequest createAudioPolicyRequest, quz quzVar, qvf qvfVar) {
        return ((defpackage.qte) this.k.get()).w(createAudioPolicyRequest, quzVar, qvfVar);
    }

    @Override // defpackage.qvl
    public final qvi x(com.google.android.gms.car.CreateAudioRecordRequest createAudioRecordRequest, quz quzVar) {
        return ((defpackage.qte) this.k.get()).x(createAudioRecordRequest, quzVar);
    }

    @Override // defpackage.qvl
    public final defpackage.qvx z() {
        return ((defpackage.qte) this.k.get()).z();
    }
}

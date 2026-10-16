package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.AnalyticsSessionInfo;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.CreateAudioPolicyRequest;
import com.google.android.gms.car.CreateAudioRecordRequest;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import java.util.List;

/* loaded from: classes.dex */
public interface qup extends IInterface {
    qvr A() throws RemoteException;

    qvx B() throws RemoteException;

    qwl C() throws RemoteException;

    qwu D() throws RemoteException;

    qxa E() throws RemoteException;

    qxj F() throws RemoteException;

    qxp G() throws RemoteException;

    qxp H() throws RemoteException;

    qyb I() throws RemoteException;

    qyh J() throws RemoteException;

    qyq K(String str) throws RemoteException;

    qzf L() throws RemoteException;

    qzi M() throws RemoteException;

    rho N() throws RemoteException;

    rim O() throws RemoteException;

    rjb P() throws RemoteException;

    rjm Q(CarDisplayId carDisplayId) throws RemoteException;

    rka R() throws RemoteException;

    rkj S() throws RemoteException;

    rkm T() throws RemoteException;

    String Y(String str, String str2) throws RemoteException;

    String Z(String str, String str2) throws RemoteException;

    void aA(byte[] bArr, int i) throws RemoteException;

    void aB(CarFacet carFacet) throws RemoteException;

    void aC(CarFrxEvent carFrxEvent) throws RemoteException;

    void aJ(qus qusVar) throws RemoteException;

    void aK(quv quvVar) throws RemoteException;

    void aL(quy quyVar) throws RemoteException;

    void aM(qwg qwgVar) throws RemoteException;

    void aN(rpg rpgVar) throws RemoteException;

    void aO(qyn qynVar) throws RemoteException;

    void aR(String str, boolean z) throws RemoteException;

    void aS(CarInfo carInfo, String str) throws RemoteException;

    void aT(boolean z) throws RemoteException;

    void aU(String str, int i) throws RemoteException;

    void aV(MediaOptions mediaOptions) throws RemoteException;

    void aW(String str, String str2) throws RemoteException;

    void aX(String str, List list) throws RemoteException;

    void aY(boolean z) throws RemoteException;

    void aZ(boolean z) throws RemoteException;

    List aa() throws RemoteException;

    List ab(int i) throws RemoteException;

    List ac() throws RemoteException;

    List ad(String str, List list) throws RemoteException;

    List ae(Intent intent, int i) throws RemoteException;

    List af(Intent intent, int i) throws RemoteException;

    List ag(Intent intent, int i) throws RemoteException;

    List ah(Intent intent, int i) throws RemoteException;

    List ai(Intent intent) throws RemoteException;

    void ap(CarDisplayId carDisplayId, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) throws RemoteException;

    void aq(qwd qwdVar) throws RemoteException;

    void ar(CarDisplayId carDisplayId, qwd qwdVar) throws RemoteException;

    void as(CarRegionId carRegionId, qwd qwdVar) throws RemoteException;

    void av() throws RemoteException;

    void aw(CarInfo carInfo) throws RemoteException;

    boolean bA(Intent intent, Bundle bundle) throws RemoteException;

    byte[] bB() throws RemoteException;

    qwq bC() throws RemoteException;

    void bb(CarRegionId carRegionId) throws RemoteException;

    void bd(qus qusVar) throws RemoteException;

    void be(quv quvVar) throws RemoteException;

    void bf() throws RemoteException;

    void bg(qwg qwgVar) throws RemoteException;

    void bh(rpg rpgVar) throws RemoteException;

    void bi(qyn qynVar) throws RemoteException;

    void bj(CarActivityLayoutConfig carActivityLayoutConfig) throws RemoteException;

    void bl(CarRegionId carRegionId, Rect rect) throws RemoteException;

    boolean bo() throws RemoteException;

    boolean bp(String str, boolean z) throws RemoteException;

    boolean bq(String str, boolean z) throws RemoteException;

    boolean bs() throws RemoteException;

    boolean bv(String str, int i) throws RemoteException;

    boolean bw(String str, int i) throws RemoteException;

    boolean bx() throws RemoteException;

    boolean by(Intent intent) throws RemoteException;

    double ge(String str, double d) throws RemoteException;

    int gf(String str, int i) throws RemoteException;

    int gg() throws RemoteException;

    int h() throws RemoteException;

    int k(String str, int i) throws RemoteException;

    AnalyticsSessionInfo r() throws RemoteException;

    CarInfo s() throws RemoteException;

    CarUiInfo u() throws RemoteException;

    qug w(CreateAudioPolicyRequest createAudioPolicyRequest, qud qudVar, quj qujVar) throws RemoteException;

    qum x(CreateAudioRecordRequest createAudioRecordRequest, qud qudVar) throws RemoteException;

    qvb z() throws RemoteException;
}

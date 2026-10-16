package com.waze.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.br;
import com.waze.da;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.modules.c.eb;
import com.waze.navigate.de;
import com.waze.navigate.di;
import com.waze.navigate.dj;
import com.waze.navigate.ea;
import com.waze.navigate.ga;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class an implements dj {

    /* renamed from: a, reason: collision with root package name */
    private final String f35234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35235b;

    /* renamed from: c, reason: collision with root package name */
    private final bp f35236c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35237d;

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f35238e;

    /* renamed from: f, reason: collision with root package name */
    private final ah f35239f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35240g;

    /* renamed from: h, reason: collision with root package name */
    private au f35241h;

    /* renamed from: i, reason: collision with root package name */
    private String f35242i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f35243j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f35244k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35245l;
    private final Handler m;

    private an(Resources resources, String str, String str2, au auVar, bp bpVar, Messenger messenger, ah ahVar) throws RemoteException {
        this.m = new Handler(Looper.getMainLooper());
        ap.f35250a.b(str);
        this.f35234a = str;
        this.f35235b = str2;
        this.f35236c = bpVar;
        Integer num = bpVar.f35362b;
        this.f35237d = num == null ? resources.getColor(R.color.primary_variant) : num.intValue();
        this.f35238e = messenger;
        if (messenger != null) {
            try {
                messenger.getBinder().linkToDeath(new ak(this), 0);
            } catch (RemoteException unused) {
                this.f35240g = true;
            }
        }
        this.f35239f = ahVar == null ? com.waze.sdk.a.j.f35199a.a(str) : ahVar;
        if (auVar != null) {
            Y(auVar);
        }
    }

    public static /* synthetic */ void V(an anVar, int i2) {
        anVar.Z(false);
        ah ahVar = anVar.f35239f;
        if (ahVar != null) {
            if (i2 == 1) {
                ahVar.g();
            }
            ahVar.i();
        }
    }

    static /* bridge */ /* synthetic */ boolean ac(an anVar) {
        Integer num = anVar.f35243j;
        return num != null && SdkConfiguration.wouldSendTransportationData(num.intValue()) && anVar.ae();
    }

    @Override // com.waze.navigate.dj
    public final void A(String str, String str2, int i2) throws RemoteException {
        String str3;
        try {
            Messenger messenger = this.f35238e;
            if (str == null || str2 == null) {
                str3 = null;
            } else {
                str3 = str + " " + str2;
            }
            Message messageObtain = Message.obtain((Handler) null, 705);
            Bundle bundle = new Bundle();
            bundle.putInt("distanceMeters", i2);
            bundle.putString("distanceString", str3);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onInstructionDistanceUpdated: " + str + " " + str2 + ", " + i2);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void B(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void C() {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void D(eb ebVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void E(com.waze.realtime_report_feedback.c cVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void F(com.waze.realtime_report_feedback.c cVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void G(com.waze.realtime_report_feedback.c cVar) {
    }

    String H() {
        return this.f35234a;
    }

    void I(int i2) {
        this.m.post(new da(this, i2, 3));
        Messenger messenger = this.f35238e;
        if (messenger != null) {
            try {
                Message messageObtain = Message.obtain((Handler) null, 502);
                Bundle bundle = new Bundle();
                bundle.putInt("reason", i2);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J() {
        PendingIntent pendingIntent = this.f35236c.f35361a;
        if (pendingIntent == null || !bq.b(pendingIntent)) {
            String str = this.f35234a;
            com.waze.shared_infra.i.h.c("WazeSdk: Failed to open partner app: " + str + ", try to use system intent to open it.");
            ap.f35250a.c(str);
        }
    }

    @Deprecated
    boolean K() {
        return false;
    }

    final int L() {
        return this.f35237d;
    }

    final int M() {
        return this.f35236c.f35363c;
    }

    final MediaMetadataCompat O() {
        ah ahVar = this.f35239f;
        if (ahVar == null) {
            return null;
        }
        return ahVar.a();
    }

    final android.support.v4.media.a.z P() {
        ah ahVar = this.f35239f;
        if (ahVar == null) {
            return null;
        }
        return ahVar.b();
    }

    final ah Q() {
        Integer num;
        ah ahVar = this.f35239f;
        if (ahVar == null || (num = this.f35243j) == null) {
            return null;
        }
        if (!SdkConfiguration.isAudioSupported(num.intValue(), this.f35234a)) {
            return null;
        }
        if (!ahVar.l()) {
            ahVar.e();
        }
        return ahVar;
    }

    final String S() {
        return this.f35242i;
    }

    final String T() {
        return this.f35234a;
    }

    final List U() {
        ah ahVar = this.f35239f;
        if (ahVar == null) {
            return null;
        }
        return ahVar.c();
    }

    public final void X(Context context, as asVar) {
        au auVar = this.f35241h;
        if (auVar != null) {
            auVar.d(context, asVar);
        }
    }

    final void Y(au auVar) {
        this.f35242i = auVar.f35259b;
        Integer numValueOf = Integer.valueOf(auVar.f35260c);
        this.f35243j = numValueOf;
        if (!SdkConfiguration.wouldSendTransportationData(numValueOf.intValue())) {
            this.f35244k = true;
        } else if (this.f35244k == null && SdkConfiguration.hasValidUserAgreement(this.f35234a)) {
            this.f35244k = true;
        }
        this.f35241h = auVar;
    }

    final void Z(boolean z) {
        this.m.post(new al(this, z));
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void a(com.waze.navigate.a aVar) {
    }

    final void aa(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f35244k = boolValueOf;
        boolean zBooleanValue = boolValueOf.booleanValue();
        au auVar = this.f35241h;
        if (zBooleanValue) {
            SdkConfiguration.enableAudioSdk(true);
            String str = auVar.f35258a;
            SdkConfiguration.setLastAppAuthorizedTimestamp(str, System.currentTimeMillis());
            bd.d().z(str, true);
        } else {
            auVar.e();
        }
        Z(this.f35245l);
    }

    final boolean ad() {
        return !this.f35240g;
    }

    final boolean ae() {
        Boolean bool = this.f35244k;
        return bool != null && bool.booleanValue();
    }

    final boolean af(String str) {
        return str != null && str.equals(this.f35235b);
    }

    final boolean ag() {
        return this.f35244k == null;
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void b(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void bB(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar) {
    }

    @Override // com.waze.navigate.dj
    public final void c(ea eaVar) throws RemoteException {
        try {
            Messenger messenger = this.f35238e;
            int number = com.waze.navigate.eb.a(eaVar).getNumber();
            Message messageObtain = Message.obtain((Handler) null, 702);
            Bundle bundle = new Bundle();
            bundle.putInt("instruction", number);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onInstructionUpdated: " + String.valueOf(eaVar));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void d(de deVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void e(com.waze.av.b.n nVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void f(br brVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void g(de deVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void h(String str, String str2, int i2) {
    }

    @Override // com.waze.navigate.dj
    public final void j(int i2) throws RemoteException {
        try {
            Messenger messenger = this.f35238e;
            Message messageObtain = Message.obtain((Handler) null, 704);
            Bundle bundle = new Bundle();
            bundle.putInt("exitNumber", i2);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onInstructionExitUpdated: " + i2);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void k(di diVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void l(com.waze.shared_infra.l.a aVar, long j2) {
    }

    @Override // com.waze.navigate.dj
    public final void m(boolean z, int i2) throws RemoteException {
        try {
            Messenger messenger = this.f35238e;
            Message messageObtain = Message.obtain((Handler) null, DisplayStrings.DS_LOGIN_FAILEDC_UNAUTHORISED);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNavigating", z);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onNavigationStatusUpdated: " + z);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void n(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void o(ea eaVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void p(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void q(com.waze.shared_infra.l.a aVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void s(PolylineGeometry polylineGeometry) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void t(Long l2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // com.waze.navigate.dj
    public final void v(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) throws RemoteException {
        try {
            Messenger messenger = this.f35238e;
            Message messageObtain = Message.obtain((Handler) null, DisplayStrings.DS_LIGHT);
            Bundle bundle = new Bundle();
            bundle.putString("streetName", str);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onStreetNameUpdated: " + str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void w(String str) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void x(ga gaVar) {
    }

    @Override // com.waze.navigate.dj
    public final void y(boolean z) throws RemoteException {
        try {
            Messenger messenger = this.f35238e;
            Message messageObtain = Message.obtain((Handler) null, 706);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isLeftHandTraffic", z);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
            com.waze.shared_infra.i.h.a("WazeSdk: Sent onTrafficSideUpdated: ".concat(z ? TtmlNode.LEFT : TtmlNode.RIGHT));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void z(Position.IntPosition intPosition) {
    }

    an(Resources resources, String str, String str2, au auVar, bp bpVar, Messenger messenger) {
        this(resources, str, str2, auVar, bpVar, messenger, null);
    }

    /* synthetic */ an(Resources resources, au auVar, bp bpVar, ah ahVar) {
        this(resources, "com.spotify.music", "", auVar, bpVar, null, ahVar);
    }
}

package S3;

import A7.C0273n0;
import A7.N;
import A7.RunnableC0299w0;
import D6.C0388o;
import D6.C0395s;
import Ef.w0;
import Ef.x0;
import Ef.z0;
import Ge.t;
import Ge.u;
import I4.B;
import I4.C;
import I4.v;
import Jd.AbstractC0668b;
import Jd.y;
import Jd.z;
import N1.AbstractC0756e;
import N1.C0762k;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzgsc;
import com.google.android.gms.internal.ads.zzgsd;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import j$.util.Objects;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import k1.S;
import k1.s0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import p2.AbstractC3759b;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* loaded from: classes.dex */
public final class l implements zzfyo, Z4.a, zzgsd, zzatp, QonversionRemoteConfigurationAttachCallback, H6.h, I4.q, B, y, L4.f, Mf.e, P8.a, He.h, k1.r, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10967a;

    public /* synthetic */ l(Object obj) {
        this.f10967a = obj;
    }

    @Override // He.h
    public void a(Je.b bVar) {
        Me.a.e((Se.b) this.f10967a, bVar);
    }

    @Override // Nd.k
    public Set b() {
        return ((Nd.l) A6.c.p((z) this.f10967a)).b();
    }

    @Override // Z4.a
    public Object c() {
        C0388o c0388o = (C0388o) this.f10967a;
        return new E4.s((H4.c) c0388o.f2462a, (H4.c) c0388o.f2463b, (H4.c) c0388o.f2464c, (H4.c) c0388o.f2465d, (E4.o) c0388o.f2466e, (E4.o) c0388o.f2467f, (Dd.c) c0388o.f2468g);
    }

    @Override // I4.q
    public I4.p d(v vVar) {
        return new C(this);
    }

    @Override // L4.f
    public int e() {
        return (g() << 8) | g();
    }

    @Override // Nd.k
    public void f(String name, Iterable values) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(values, "values");
        String strE = AbstractC0668b.e(name, false);
        ArrayList arrayList = new ArrayList(ff.p.a0(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3340k.e(str, "<this>");
            arrayList.add(AbstractC0668b.e(str, true));
        }
        ((z) this.f10967a).f(strE, arrayList);
    }

    @Override // L4.f
    public short g() throws L4.e {
        ByteBuffer byteBuffer = (ByteBuffer) this.f10967a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & ForkServer.ERROR);
        }
        throw new L4.e();
    }

    @Override // Nd.k
    public List i(String name) {
        AbstractC3340k.e(name, "name");
        List listI = ((z) this.f10967a).i(AbstractC0668b.e(name, false));
        if (listI == null) {
            return null;
        }
        List list = listI;
        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0668b.d(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    @Override // I4.B
    public C4.e j(Uri uri) {
        return new C4.n(1, uri, (ContentResolver) this.f10967a);
    }

    public void k(int i5, boolean z2) {
        C0762k c0762k = (C0762k) this.f10967a;
        if (z2) {
            c0762k.a(i5);
        } else {
            c0762k.getClass();
        }
    }

    public T1.a l() {
        return null;
    }

    public Z1.b m() {
        return (Z1.b) this.f10967a;
    }

    public UUID n() {
        return AbstractC0756e.f8144a;
    }

    @Override // Nd.k
    public Set names() {
        Set setKeySet = ((Map) ((z) this.f10967a).f421a).keySet();
        ArrayList arrayList = new ArrayList(ff.p.a0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0668b.d(0, 0, 15, (String) it.next()));
        }
        return ff.o.X0(arrayList);
    }

    @Override // H6.h
    public void o(JsonWriter jsonWriter) throws IOException {
        Object obj = H6.i.f4948b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f10967a;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = H6.f.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // He.h
    public void onComplete() {
        ((He.h) ((Se.b) this.f10967a).f11065b).onComplete();
    }

    @Override // He.h
    public void onError(Throwable th) {
        ((He.h) ((Se.b) this.f10967a).f11065b).onError(th);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) throws UnknownHostException {
        String hostAddress;
        String hostAddress2;
        Inet4Address dhcpServerAddress;
        AbstractC3340k.e(call, "call");
        String str = call.f46759a;
        if (str != null) {
            int iHashCode = str.hashCode();
            e eVar = (e) this.f10967a;
            String hostAddress3 = null;
            WifiManager wifiManager = (WifiManager) eVar.f10941b;
            switch (iHashCode) {
                case -1560837844:
                    if (str.equals("wifiBroadcast")) {
                        List<InterfaceAddress> interfaceAddresses = NetworkInterface.getByInetAddress(InetAddress.getByName(eVar.p())).getInterfaceAddresses();
                        AbstractC3340k.d(interfaceAddresses, "getInterfaceAddresses(...)");
                        Iterator<T> it = interfaceAddresses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                InterfaceAddress interfaceAddress = (InterfaceAddress) it.next();
                                if (!interfaceAddress.getAddress().isLoopbackAddress() && interfaceAddress.getBroadcast() != null) {
                                    hostAddress3 = interfaceAddress.getBroadcast().getHostAddress();
                                }
                            }
                        }
                        ((tc.g) interfaceC4280q).a(hostAddress3);
                        return;
                    }
                    break;
                case -1340798144:
                    if (str.equals("wifiName")) {
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        AbstractC3340k.d(connectionInfo, "getConnectionInfo(...)");
                        ((tc.g) interfaceC4280q).a(connectionInfo.getSSID());
                        return;
                    }
                    break;
                case -989025832:
                    if (str.equals("wifiIPv6Address")) {
                        Iterator<InterfaceAddress> it2 = NetworkInterface.getByInetAddress(InetAddress.getByName(eVar.p())).getInterfaceAddresses().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                InetAddress address = it2.next().getAddress();
                                if (!address.isLoopbackAddress() && (address instanceof Inet6Address) && (hostAddress = ((Inet6Address) address).getHostAddress()) != null) {
                                    hostAddress3 = ((String[]) Bf.k.I0(hostAddress, new String[]{"%"}).toArray(new String[0]))[0];
                                }
                            }
                        }
                        ((tc.g) interfaceC4280q).a(hostAddress3);
                        return;
                    }
                    break;
                case 183655511:
                    if (str.equals("wifiSubmask")) {
                        InetAddress byName = InetAddress.getByName(eVar.p());
                        AbstractC3340k.b(byName);
                        Iterator<InterfaceAddress> it3 = NetworkInterface.getByInetAddress(byName).getInterfaceAddresses().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                InterfaceAddress next = it3.next();
                                if (!next.getAddress().isLoopbackAddress() && (next.getAddress() instanceof Inet4Address)) {
                                    int i5 = Integer.MIN_VALUE;
                                    for (int networkPrefixLength = next.getNetworkPrefixLength() - 1; networkPrefixLength > 0; networkPrefixLength--) {
                                        i5 >>= 1;
                                    }
                                    InetAddress byName2 = InetAddress.getByName(((i5 >> 24) & 255) + "." + ((i5 >> 16) & 255) + "." + ((i5 >> 8) & 255) + "." + (i5 & 255));
                                    if (byName2 != null) {
                                        hostAddress2 = byName2.getHostAddress();
                                        AbstractC3340k.b(hostAddress2);
                                    }
                                }
                            } else {
                                hostAddress2 = "";
                            }
                        }
                        ((tc.g) interfaceC4280q).a(hostAddress2);
                        return;
                    }
                    break;
                case 1373405384:
                    if (str.equals("wifiBSSID")) {
                        WifiInfo connectionInfo2 = wifiManager.getConnectionInfo();
                        AbstractC3340k.d(connectionInfo2, "getConnectionInfo(...)");
                        ((tc.g) interfaceC4280q).a(connectionInfo2.getBSSID());
                        return;
                    }
                    break;
                case 1674251141:
                    if (str.equals("wifiGatewayAddress")) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) eVar.f10942c;
                            LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()) : null;
                            if (linkProperties != null && (dhcpServerAddress = linkProperties.getDhcpServerAddress()) != null) {
                                hostAddress3 = dhcpServerAddress.getHostAddress();
                            }
                        } else {
                            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                            Integer numValueOf = dhcpInfo != null ? Integer.valueOf(dhcpInfo.gateway) : null;
                            if (numValueOf != null) {
                                hostAddress3 = e.n(numValueOf.intValue());
                            }
                        }
                        ((tc.g) interfaceC4280q).a(hostAddress3);
                        return;
                    }
                    break;
                case 1756715352:
                    if (str.equals("wifiIPAddress")) {
                        ((tc.g) interfaceC4280q).a(eVar.p());
                        return;
                    }
                    break;
            }
        }
        ((tc.g) interfaceC4280q).c();
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback
    public void onSuccess() {
        ((u) this.f10967a).onSuccess(t.a(true));
    }

    public int p() {
        return 1;
    }

    @Override // P8.a
    public void q(Bundle bundle) {
        ((w8.d) this.f10967a).b("clx", "_ae", bundle);
    }

    public void r() {
        long j8;
        X1.f fVar = (X1.f) this.f10967a;
        synchronized (AbstractC3759b.f43199b) {
            try {
                j8 = AbstractC3759b.f43200c ? AbstractC3759b.f43201d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        fVar.L = j8;
        fVar.y(true);
    }

    @Override // L4.f
    public long skip(long j8) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f10967a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j8);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public boolean t(String str) {
        return false;
    }

    public N u() {
        N n10 = C0273n0.a((Service) this.f10967a, null, null).f981i;
        C0273n0.d(n10);
        return n10;
    }

    @Override // k1.r
    public v0 v(View view, v0 v0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f10967a;
        if (!Objects.equals(coordinatorLayout.f18055n, v0Var)) {
            coordinatorLayout.f18055n = v0Var;
            boolean z2 = v0Var.d() > 0;
            coordinatorLayout.f18056o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            s0 s0Var = v0Var.f38877a;
            if (!s0Var.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = coordinatorLayout.getChildAt(i5);
                    WeakHashMap weakHashMap = S.f38779a;
                    if (childAt.getFitsSystemWindows() && ((V0.d) childAt.getLayoutParams()).f12869a != null && s0Var.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return v0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public void zza(int i5, long j8) {
        ((C6.f) this.f10967a).f1824h.zzb(i5, System.currentTimeMillis() - j8);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public void zzb(int i5, long j8, String str) {
        ((C6.f) this.f10967a).f1824h.zzf(i5, System.currentTimeMillis() - j8, str);
    }

    public l(C6.f fVar) {
        Objects.requireNonNull(fVar);
        this.f10967a = fVar;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback, com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
    public void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        ((u) this.f10967a).onError(Ge.c.l(error));
    }

    public l(F6.r rVar) {
        Objects.requireNonNull(rVar);
        this.f10967a = rVar;
    }

    @Override // He.h
    public void onSuccess(Object obj) {
        ((He.h) ((Se.b) this.f10967a).f11065b).onSuccess(obj);
    }

    public l(z encodedParametersBuilder) {
        AbstractC3340k.e(encodedParametersBuilder, "encodedParametersBuilder");
        this.f10967a = encodedParametersBuilder;
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public void zza(zzatu zzatuVar) {
        ((zzcgd) this.f10967a).zzd(zzatuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsd
    public void zza(zzgsc zzgscVar) {
        F6.r rVar = (F6.r) this.f10967a;
        rVar.getClass();
        if (!TextUtils.isEmpty(zzgscVar.zzb())) {
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznh)).booleanValue()) {
                rVar.f4012c = zzgscVar.zzb();
            }
        }
        switch (zzgscVar.zza()) {
            case 8152:
                int i5 = 11;
                zzcfy.zzf.execute(new RunnableC0299w0(i5, rVar, "onLMDOverlayOpened", new HashMap(), false));
                break;
            case 8153:
                int i10 = 11;
                zzcfy.zzf.execute(new RunnableC0299w0(i10, rVar, "onLMDOverlayClicked", new HashMap(), false));
                break;
            case 8155:
                int i11 = 11;
                zzcfy.zzf.execute(new RunnableC0299w0(i11, rVar, "onLMDOverlayClose", new HashMap(), false));
                break;
            case 8157:
                rVar.f4012c = null;
                rVar.f4013d = null;
                rVar.f4011b = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzgscVar.zza()));
                zzcfy.zzf.execute(new RunnableC0299w0(11, rVar, "onLMDOverlayFailedToOpen", map, false));
                break;
        }
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f10967a = workDatabase_Impl;
        new b(workDatabase_Impl, 3);
    }

    public l(Context context) {
        this.f10967a = new G4.c(context, (byte) 0);
    }

    public l(TextView textView) {
        this.f10967a = new A1.g(textView);
    }

    public l(z0 z0Var) {
        w0 w0Var = w0.f3786a;
        x0 x0Var = x0.f3789a;
        this.f10967a = z0Var;
    }

    public l(UUID uuid, int i5, byte[] bArr) {
        this.f10967a = uuid;
    }

    public l(u uVar, t tVar) {
        this.f10967a = uVar;
    }

    public l(ByteBuffer byteBuffer) {
        this.f10967a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public l(int i5) {
        switch (i5) {
            case 21:
                this.f10967a = new SparseArray(10);
                break;
            default:
                this.f10967a = new C0762k(0);
                break;
        }
    }

    public void h(Z1.d dVar) {
    }

    public void s(Z1.d dVar) {
    }
}

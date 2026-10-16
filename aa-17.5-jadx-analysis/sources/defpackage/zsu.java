package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Process;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zsu extends hqt {
    private final zsv n;
    private final byte[] o;
    private final zsw p;
    private final hrn q;

    public zsu(zsv zsvVar, byte[] bArr, zsw zswVar, String str, hrn hrnVar) {
        super(1, str, hrnVar);
        this.n = zsvVar;
        this.o = bArr;
        this.p = zswVar;
        this.q = hrnVar;
        Context context = zsvVar.h;
        String str2 = zrf.a;
        if (context == null || context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            String str3 = zrf.a;
            if (zrn.e(str3, 4)) {
                Log.i(str3, "isActiveNetworkOnSatellite: ACCESS_NETWORK_STATE permission not granted.");
                return;
            }
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && zrf.a(connectivityManager) && addm.a.gu().f()) {
            String str4 = zsv.a;
            if (zrn.e(str4, 4)) {
                Log.i(str4, "Setting Volley timeout to " + zrf.b.toMillis() + "ms");
            }
            this.l = new hqk((int) zrf.b.toMillis(), 1, 1.0f);
        }
    }

    @Override // defpackage.hqt
    public final String b() {
        return "application/binary";
    }

    @Override // defpackage.hqt
    public final Map d() throws hqg {
        HashMap map = new HashMap();
        map.put("Content-Length", String.valueOf(this.o.length));
        zsv zsvVar = this.n;
        zss zssVar = zsvVar.b;
        String strF = zssVar.f();
        String strE = zssVar.e();
        zkt.g(strE != null, "app version not set");
        map.put("X-Google-Maps-Mobile-API", ysi.S(new String[]{strF, strE, zsvVar.g, "9.0.0", zsvVar.f}));
        return map;
    }

    @Override // defpackage.hqt
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        this.q.b((byte[]) obj);
    }

    @Override // defpackage.hqt
    public final byte[] l() throws hqg {
        return this.o;
    }

    @Override // defpackage.hqt
    protected final scz o(hqq hqqVar) throws IOException, zsx {
        Map map = hqqVar.c;
        zkt.m(map);
        String str = (String) map.get("Content-Type");
        try {
            zsv zsvVar = this.n;
            int i = hqqVar.a;
            if (i == 200) {
                if (Objects.equals(str, "application/binary")) {
                    this.p.b();
                    return new scz(hqqVar.b, (hqh) null);
                }
                String str2 = zsv.a;
                if (zrn.e(str2, 6)) {
                    Log.e(str2, "Bad HTTP content type: ".concat(String.valueOf(str)));
                }
                throw new IOException("Bad HTTP content type: " + str + " for " + zsv.a(zsvVar.c));
            }
            String str3 = zsv.a;
            if (zrn.e(str3, 5)) {
                Log.w(str3, a.bp(i, "Bad HTTP response code: "));
            }
            if (i == 500) {
                List list = zsvVar.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zsr) it.next()).c();
                }
                throw new zsx("Serverside failure (HTTP500) for " + zsv.a(list));
            }
            if (i == 403) {
                zsl zslVar = zsvVar.d;
                zslVar.c();
                zslVar.b(zsvVar.b);
                i = 403;
            } else if (i == 501) {
                zsvVar.b.A();
                throw new IOException("Server side HTTP not implemented");
            }
            throw new IOException("Bad HTTP response code: " + i + " for " + zsv.a(zsvVar.c));
        } catch (IOException | zsx e) {
            return new scz(new hrc(e));
        }
    }
}

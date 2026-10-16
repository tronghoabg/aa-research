package o1;

import A5.h;
import E4.F;
import J5.p;
import J9.C0652k;
import J9.C0656o;
import N9.m;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import Q1.x;
import Va.Za;
import ad.L;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.util.Log;
import android.view.Display;
import androidx.credentials.playservices.HiddenActivity;
import c2.g;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.google.android.gms.common.api.t;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import j9.C3094d;
import j9.C3095e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import ka.C3214A;
import m9.G;
import md.J;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;
import p9.C3777B;
import q2.o;
import r5.C3925b;
import r9.C3947d;
import r9.C3948e;
import r9.C3950g;
import r9.InterfaceC3940A;
import r9.InterfaceC3945b;
import r9.InterfaceC3949f;
import s2.e;
import s5.n;
import s5.v;
import s9.k;
import t5.C4114i;
import t9.l;
import u6.AbstractC4256a;
import uc.InterfaceC4266c;
import w5.C4361a;
import w5.EnumC4363c;
import w9.InterfaceC4396o;
import x4.C4469b;
import x7.q;
import x7.r;
import x7.s;
import yc.C4582e;
import yc.C4592o;
import yc.InterfaceC4590m;
import z5.f;
import z9.C4623B;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3641c implements OnSuccessListener, Continuation, EventListener.Factory, InterfaceC4396o, InterfaceC4266c, e, OnCompleteListener, OnFailureListener, InterfaceC4590m, B5.b, Le.b, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41267b;

    public /* synthetic */ C3641c(Object obj, int i5) {
        this.f41266a = i5;
        this.f41267b = obj;
    }

    @Override // s2.e
    public long a(long j8) {
        return x.j((j8 * r0.f5664f) / 1000000, 0L, ((p) this.f41267b).k - 1);
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        m mVar = (m) obj;
        C4623B c4623b = (C4623B) this.f41267b;
        h hVar = c4623b.f48419f;
        if (hVar != null) {
            N9.h hVar2 = mVar.f8632a;
            C0652k c0652k = c4623b.f48415b;
            hVar.displayMessage(hVar2, new C0656o(c0652k.f5943a, c0652k.f5944b, c0652k.f5945c, c0652k.f5946d, c0652k.f5947e, c0652k.f5948f, c0652k.f5949g, hVar2, mVar.f8633b));
        }
    }

    public g b(J j8) throws IOException {
        C3925b c3925b = (C3925b) this.f41267b;
        String strB = ic.d.B("CctTransportBackend");
        boolean zIsLoggable = Log.isLoggable(strB, 4);
        URL url = (URL) j8.f40580a;
        if (zIsLoggable) {
            Log.i(strB, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c3925b.f44372g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) j8.f40582c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    L l10 = c3925b.f44366a;
                    n nVar = (n) j8.f40581b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C3094d c3094d = (C3094d) l10.f17515b;
                    C3095e c3095e = new C3095e(bufferedWriter, c3094d.f38682a, c3094d.f38683b, c3094d.f38684c, c3094d.f38685d);
                    c3095e.a(nVar);
                    c3095e.c();
                    c3095e.f38687b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strB2 = ic.d.B("CctTransportBackend");
                    if (Log.isLoggable(strB2, 4)) {
                        Log.i(strB2, String.format("Status Code: %d", numValueOf));
                    }
                    ic.d.n("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ic.d.n("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new g(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new g(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            g gVar = new g(responseCode, null, v.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f45048a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return gVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (h9.b e7) {
            e = e7;
            ic.d.s(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new g(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            ic.d.s(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new g(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            ic.d.s(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new g(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            ic.d.s(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new g(400, null, 0L);
        }
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) throws JSONException {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e7) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        ((F) ((com.unity3d.services.core.webview.b) this.f41267b).f32729b).k(z2);
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f41267b, call);
    }

    public void d(Display display) {
        o oVar = (o) this.f41267b;
        oVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            oVar.f44092i = refreshRate;
            oVar.f44093j = (refreshRate * 80) / 100;
        } else {
            AbstractC4256a.E("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            oVar.f44092i = -9223372036854775807L;
            oVar.f44093j = -9223372036854775807L;
        }
    }

    @Override // B5.b
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseA;
        int i5 = 0;
        Object obj = this.f41267b;
        switch (this.f41266a) {
            case 22:
                A5.m mVar = (A5.m) ((A5.c) obj);
                mVar.getClass();
                int i10 = C4361a.f47281e;
                S3.n nVar = new S3.n();
                nVar.f10970a = null;
                nVar.f10971b = new ArrayList();
                nVar.f10972c = null;
                nVar.f10973d = "";
                HashMap map = new HashMap();
                sQLiteDatabaseA = mVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    C4361a c4361a = (C4361a) A5.m.y(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new A5.g(mVar, map, nVar, 2));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return c4361a;
                } finally {
                }
            case 23:
                A5.m mVar2 = (A5.m) ((A5.d) obj);
                long jC = mVar2.f372b.c() - mVar2.f374d.f348d;
                sQLiteDatabaseA = mVar2.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jC)};
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            mVar2.i(cursorRawQuery.getInt(0), EnumC4363c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 24:
                A5.m mVar3 = (A5.m) ((f) obj).f48391i;
                sQLiteDatabaseA = mVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + mVar3.f372b.c()).execute();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                z5.h hVar = (z5.h) obj;
                Iterator it = ((Iterable) ((A5.m) hVar.f48400b).d(new A5.f(i5))).iterator();
                while (it.hasNext()) {
                    hVar.f48401c.a((C4114i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // w9.InterfaceC4396o
    public Object get() {
        char c10;
        HashMap map;
        C3948e c3948e;
        char c11 = 0;
        int i5 = 1;
        C3948e c3948e2 = (C3948e) this.f41267b;
        C3947d c3947d = c3948e2.f44614c;
        InterfaceC3949f interfaceC3949f = c3947d.f44609b.f44632b;
        HashSet hashSet = new HashSet();
        int i10 = c3948e2.f44616e;
        int size = i10;
        while (size > 0) {
            String strH = interfaceC3949f.h();
            if (strH == null || hashSet.contains(strH)) {
                break;
            }
            Object[] objArr = new Object[i5];
            objArr[c11] = strH;
            Ba.c.p("IndexBackfiller", "Processing collection: %s", i5, objArr);
            InterfaceC3949f interfaceC3949f2 = c3947d.f44609b.f44632b;
            Za za2 = c3948e2.f44615d.f44609b.f44636f;
            s9.b bVarM = interfaceC3949f2.m(strH);
            Map mapX = ((InterfaceC3940A) za2.f13915a).x(strH, bVarM, size);
            if (size - mapX.size() > 0) {
                c10 = c11;
                map = ((InterfaceC3945b) za2.f13917c).a(bVarM.f45364c, size - mapX.size(), strH);
            } else {
                c10 = c11;
                map = new HashMap();
            }
            Iterator it = map.values().iterator();
            int iMax = -1;
            while (it.hasNext()) {
                Iterator it2 = it;
                t9.d dVar = (t9.d) it.next();
                if (mapX.containsKey(dVar.f45946b.f45951a)) {
                    c3948e = c3948e2;
                } else {
                    t9.h hVar = dVar.f45946b;
                    c3948e = c3948e2;
                    boolean z2 = hVar instanceof l;
                    s9.h hVar2 = hVar.f45951a;
                    mapX.put(hVar2, z2 ? ((InterfaceC3940A) za2.f13915a).B(hVar2) : k.g(hVar2));
                }
                iMax = Math.max(iMax, dVar.f45945a);
                c3948e2 = c3948e;
                it = it2;
            }
            C3948e c3948e3 = c3948e2;
            za2.j(map, mapX.keySet());
            C3950g c3950gA = C3950g.a(iMax, za2.d(mapX, map, Collections.EMPTY_SET));
            c9.c cVar = c3950gA.f44618b;
            interfaceC3949f2.n(cVar);
            Iterator it3 = cVar.iterator();
            s9.b bVar = bVarM;
            while (it3.hasNext()) {
                s9.b bVarB = s9.b.b((k) ((Map.Entry) it3.next()).getValue());
                if (bVarB.compareTo(bVar) > 0) {
                    bVar = bVarB;
                }
            }
            s9.b bVar2 = new s9.b(bVar.f45362a, bVar.f45363b, Math.max(c3950gA.f44617a, bVarM.f45364c));
            Object[] objArr2 = new Object[1];
            objArr2[c10] = bVar2;
            Ba.c.p("IndexBackfiller", "Updating offset: %s", 1, objArr2);
            interfaceC3949f2.o(strH, bVar2);
            size -= cVar.size();
            hashSet.add(strH);
            i5 = 1;
            c11 = c10;
            c3948e2 = c3948e3;
        }
        return Integer.valueOf(i10 - size);
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return ((FirebaseInAppMessagingRegistrar) this.f41267b).providesFirebaseInAppMessaging(lVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        com.google.android.gms.ads.nativead.l lVar = (com.google.android.gms.ads.nativead.l) this.f41267b;
        if (!zIsSuccessful) {
            ((tc.g) lVar.f26356b).b(pd.f.h(3), pd.f.g(3), null);
            return;
        }
        q qVar = (q) task.getResult();
        if (qVar == null) {
            ((tc.g) lVar.f26356b).b(pd.f.h(3), pd.f.g(3), null);
        } else {
            s sVar = ((r) ((t) qVar.f421a)).f47810b;
            ((tc.g) lVar.f26356b).a(Boolean.valueOf((sVar != null && sVar.f47811a) || (sVar != null && sVar.f47812b)));
        }
    }

    @Override // yc.InterfaceC4590m
    public void onError(String str) {
        switch (this.f41266a) {
            case 14:
                ((C0801q) this.f41267b).c(new C4592o("setExposurePointFailed", "Could not set exposure point.", null));
                break;
            case 15:
                ((C0801q) this.f41267b).c(new C4592o("setZoomLevelFailed", "Could not set zoom level.", null));
                break;
            case 16:
                ((C0800p) this.f41267b).c(new C4592o("setFocusPointFailed", "Could not set focus point.", null));
                break;
            case 17:
                ((C0799o) this.f41267b).c(new C4592o("setExposureOffsetFailed", "Could not set exposure offset.", null));
                break;
            case 18:
                ((C0800p) this.f41267b).c(new C4592o("setExposureModeFailed", "Could not set exposure mode.", null));
                break;
            case 19:
                ((C0799o) this.f41267b).c(new C4592o("setFlashModeFailed", "Could not set flash mode.", null));
                break;
            default:
                ((C4582e) this.f41267b).f48110c.f48119h.w(str);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        ((Ka.b) this.f41267b).onError(2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Object obj2 = this.f41267b;
        switch (this.f41266a) {
            case 0:
                int i5 = HiddenActivity.f18108c;
                ((C3642d) obj2).invoke(obj);
                break;
            case 11:
                C4469b c4469b = (C4469b) obj2;
                c4469b.g(c4469b.f47687f);
                break;
            default:
                ((Ka.b) obj2).a((Location) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        s9.o oVar;
        switch (this.f41266a) {
            case 1:
                C3777B c3777b = (C3777B) this.f41267b;
                c3777b.getClass();
                if (task.isSuccessful()) {
                    for (k kVar : (List) task.getResult()) {
                        if (kVar.d()) {
                            oVar = kVar.f45382c;
                        } else {
                            if (!kVar.e()) {
                                A6.c.s("Unexpected document type in transaction: " + kVar, new Object[0]);
                                throw null;
                            }
                            oVar = s9.o.f45389b;
                        }
                        HashMap map = c3777b.f43317b;
                        s9.h hVar = kVar.f45380a;
                        if (!map.containsKey(hVar)) {
                            map.put(hVar, oVar);
                        } else if (!((s9.o) map.get(hVar)).equals(kVar.f45382c)) {
                            throw new G("Document version changed between two reads.", m9.F.ABORTED);
                        }
                    }
                }
                return task;
            default:
                v9.g gVar = (v9.g) this.f41267b;
                gVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof G) && ((G) task.getException()).f40425a == m9.F.UNAUTHENTICATED) {
                        v9.m mVar = gVar.f47068c;
                        mVar.f47093b.Y();
                        mVar.f47094c.X();
                    }
                    throw task.getException();
                }
                C3214A c3214a = (C3214A) task.getResult();
                s9.o oVarF = v9.o.f(c3214a.b());
                int iE = c3214a.e();
                ArrayList arrayList = new ArrayList(iE);
                for (int i5 = 0; i5 < iE; i5++) {
                    arrayList.add(v9.o.d(c3214a.d(i5), oVarF));
                }
                return arrayList;
        }
    }
}

package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.car.app.CarContext;
import com.google.android.datatransport.cct.a.aa;
import com.google.android.datatransport.cct.a.ae;
import com.google.android.datatransport.cct.a.ag;
import com.google.android.datatransport.cct.a.ah;
import com.google.android.datatransport.cct.a.ai;
import com.google.android.datatransport.cct.a.ak;
import com.google.android.datatransport.cct.a.al;
import com.google.android.datatransport.cct.a.am;
import com.google.android.datatransport.cct.a.an;
import com.google.android.datatransport.cct.a.ap;
import com.google.android.datatransport.cct.a.m;
import com.google.android.datatransport.cct.a.x;
import com.google.android.datatransport.cct.a.y;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.n;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    final URL f4086a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.d.a f4087b;

    /* renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f4088c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4089d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4090e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4091f;

    d(Context context, com.google.android.datatransport.runtime.c.a aVar, com.google.android.datatransport.runtime.c.a aVar2) {
        com.google.firebase.d.b.d dVar = new com.google.firebase.d.b.d();
        dVar.g(m.f4035a);
        dVar.h();
        this.f4087b = dVar.b();
        this.f4089d = context;
        this.f4088c = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4086a = d(a.f3909a);
        this.f4090e = aVar2;
        this.f4091f = aVar;
    }

    private final c c(b bVar) throws IOException {
        String str;
        URL url = bVar.f4078a;
        e.e("Making request to: %s", url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "4.1.2_1p"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str2 = bVar.f4080c;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Cookie", String.format("NID=%s", str2));
        }
        String str3 = bVar.f4081d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str3);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f4087b.b(bVar.f4079b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    e.e("Status Code: %d", Integer.valueOf(responseCode));
                    e.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    e.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L, null);
                    }
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L, null);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            long jB = ak.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b();
                            String headerField = httpURLConnection.getHeaderField("Set-Cookie");
                            if (headerField != null) {
                                for (String str4 : headerField.split(";")) {
                                    String[] strArrSplit = str4.trim().split("=", 2);
                                    if (strArrSplit.length == 2) {
                                        String str5 = strArrSplit[0];
                                        str = strArrSplit[1];
                                        if (str5.equals("NID")) {
                                            break;
                                        }
                                    }
                                }
                                str = null;
                            } else {
                                str = null;
                            }
                            c cVar = new c(200, null, jB, str);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (com.google.firebase.d.c e2) {
            e = e2;
            e.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(DisplayStrings.DS_NIGHT, null, 0L, null);
        } catch (ConnectException e3) {
            e = e3;
            e.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L, null);
        } catch (UnknownHostException e4) {
            e = e4;
            e.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, null, 0L, null);
        } catch (IOException e5) {
            e = e5;
            e.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(DisplayStrings.DS_NIGHT, null, 0L, null);
        }
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.l
    public final n a(n nVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f4088c.getActiveNetworkInfo();
        com.google.android.datatransport.runtime.m mVarC = nVar.c();
        mVarC.c("sdk-version", Build.VERSION.SDK_INT);
        mVarC.e("model", Build.MODEL);
        mVarC.e(CarContext.HARDWARE_SERVICE, Build.HARDWARE);
        mVarC.e("device", Build.DEVICE);
        mVarC.e("product", Build.PRODUCT);
        mVarC.e("os-uild", Build.ID);
        mVarC.e("manufacturer", Build.MANUFACTURER);
        mVarC.e("fingerprint", Build.FINGERPRINT);
        mVarC.d(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        mVarC.c("net-type", activeNetworkInfo == null ? an.NONE.a() : activeNetworkInfo.getType());
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = am.UNKNOWN_MOBILE_SUBTYPE.a();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = am.COMBINED.a();
            } else if (am.b(subtype) == null) {
                subtype = 0;
            }
        }
        mVarC.c("mobile-subtype", subtype);
        mVarC.e("country", Locale.getDefault().getCountry());
        mVarC.e("locale", Locale.getDefault().getLanguage());
        Context context = this.f4089d;
        String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        mVarC.e("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e.d("CctTransportBackend", "Unable to find version code for package", e2);
        }
        mVarC.e("application_build", Integer.toString(i2));
        return mVarC.a();
    }

    @Override // com.google.android.datatransport.runtime.backends.l
    public final com.google.android.datatransport.runtime.backends.e b(com.google.android.datatransport.runtime.backends.d dVar) {
        String strA;
        String strK;
        c cVarC;
        ag agVarK;
        HashMap map = new HashMap();
        for (n nVar : dVar.a()) {
            String strM = nVar.m();
            if (map.containsKey(strM)) {
                ((List) map.get(strM)).add(nVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar);
                map.put(strM, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            n nVar2 = (n) ((List) entry.getValue()).get(0);
            ai aiVar = new ai();
            aiVar.d(ap.f3979a);
            aiVar.e(this.f4091f.a());
            aiVar.f(this.f4090e.a());
            al alVar = new al();
            alVar.l(y.f4076b);
            com.google.android.datatransport.cct.a.a aVar = new com.google.android.datatransport.cct.a.a();
            aVar.m(Integer.valueOf(nVar2.a("sdk-version")));
            aVar.j(nVar2.d("model"));
            aVar.f(nVar2.d(CarContext.HARDWARE_SERVICE));
            aVar.d(nVar2.d("device"));
            aVar.l(nVar2.d("product"));
            aVar.k(nVar2.d("os-uild"));
            aVar.h(nVar2.d("manufacturer"));
            aVar.e(nVar2.d("fingerprint"));
            aVar.c(nVar2.d("country"));
            aVar.g(nVar2.d("locale"));
            aVar.i(nVar2.d("mcc_mnc"));
            aVar.b(nVar2.d("application_build"));
            alVar.k(aVar.a());
            aiVar.b(alVar.j());
            try {
                aiVar.g(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aiVar.h((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (n nVar3 : (List) entry.getValue()) {
                com.google.android.datatransport.runtime.l lVarH = nVar3.h();
                com.google.android.datatransport.a aVarA = lVarH.a();
                if (aVarA.equals(com.google.android.datatransport.a.a("proto"))) {
                    agVarK = ah.k(lVarH.b());
                } else if (aVarA.equals(com.google.android.datatransport.a.a("json"))) {
                    agVarK = ah.j(new String(lVarH.b(), Charset.forName("UTF-8")));
                } else {
                    e.f("Received event of unsupported encoding %s. Skipping...", aVarA);
                }
                agVarK.d(nVar3.f());
                agVarK.e(nVar3.g());
                agVarK.j(nVar3.q());
                al alVar2 = new al();
                alVar2.c(an.b(nVar3.a("net-type")));
                alVar2.b(am.b(nVar3.a("mobile-subtype")));
                agVarK.g(alVar2.a());
                if (nVar3.i() != null) {
                    agVarK.c(nVar3.i());
                }
                if (nVar3.j() != null) {
                    al alVar3 = new al();
                    ae aeVar = new ae();
                    ae aeVar2 = new ae();
                    aeVar2.d(nVar3.j());
                    aeVar.b(aeVar2.c());
                    alVar3.h(aeVar.a());
                    alVar3.i(aa.f3930b);
                    agVarK.b(alVar3.g());
                }
                if (nVar3.o() != null || nVar3.p() != null || nVar3.n() != null) {
                    al alVar4 = new al();
                    if (nVar3.o() != null) {
                        alVar4.e(nVar3.o());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (nVar3.n() != null) {
                        List listN = nVar3.n();
                        ArrayList arrayList5 = new ArrayList(listN.size());
                        Iterator it = listN.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(Base64.encodeToString((byte[]) it.next(), 2));
                        }
                        arrayList4.addAll(arrayList5);
                    }
                    if (nVar3.p() != null) {
                        arrayList4.add(Base64.encodeToString(nVar3.p(), 2));
                    }
                    if (!arrayList4.isEmpty()) {
                        alVar4.f(arrayList4);
                    }
                    agVarK.f(alVar4.d());
                }
                arrayList3.add(agVarK.a());
            }
            aiVar.c(arrayList3);
            arrayList2.add(aiVar.a());
        }
        x xVarB = x.b(arrayList2);
        URL urlD = this.f4086a;
        if (dVar.b() != null) {
            try {
                byte[] bArrB = dVar.b();
                a aVar2 = a.f3911c;
                String str = new String(bArrB, Charset.forName("UTF-8"));
                if (!str.startsWith("1$")) {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
                String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                }
                String str2 = strArrSplit[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = strArrSplit[1];
                if (true == str3.isEmpty()) {
                    str3 = null;
                }
                a aVar3 = new a(str2, str3);
                strA = aVar3.a() != null ? aVar3.a() : null;
                if (aVar3.b() != null) {
                    urlD = d(aVar3.b());
                }
            } catch (IllegalArgumentException unused2) {
                return com.google.android.datatransport.runtime.backends.e.a();
            }
        } else {
            strA = null;
        }
        Iterator it2 = dVar.a().iterator();
        if (!it2.hasNext()) {
            strK = null;
            break;
        }
        strK = ((n) it2.next()).k();
        Iterator it3 = dVar.a().iterator();
        while (it3.hasNext()) {
            String strK2 = ((n) it3.next()).k();
            if (!Objects.equals(strK, strK2)) {
                e.f("Invalid pseudonymous id event found: %s", strK2);
                strK = null;
                break;
            }
        }
        try {
            b bVar = new b(urlD, xVarB, strA, strK);
            int i2 = 5;
            do {
                cVarC = c(bVar);
                c cVar = cVarC;
                URL url = cVarC.f4083b;
                if (url != null) {
                    e.b("CctTransportBackend", "Following redirect to: %s", url);
                    bVar = new b(url, bVar.f4079b, bVar.f4081d, bVar.f4080c);
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    break;
                }
                i2--;
            } while (i2 > 0);
            int i3 = cVarC.f4082a;
            if (i3 == 200) {
                return com.google.android.datatransport.runtime.backends.e.c(cVarC.f4084c, cVarC.f4085d);
            }
            if (i3 < 500 && i3 != 404) {
                return i3 == 400 ? com.google.android.datatransport.runtime.backends.e.b() : com.google.android.datatransport.runtime.backends.e.a();
            }
            return com.google.android.datatransport.runtime.backends.e.d();
        } catch (IOException e2) {
            e.d("CctTransportBackend", "Could not make request to the backend", e2);
            return com.google.android.datatransport.runtime.backends.e.d();
        }
    }
}

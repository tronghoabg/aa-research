package com.waze.menus;

import android.text.TextUtils;
import android.widget.Filter;
import androidx.credentials.provider.CredentialEntry;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.navigate.AddressItem;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final String f29745a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29746b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29747c;

    /* renamed from: d, reason: collision with root package name */
    private final AddressItem[] f29748d;

    /* renamed from: e, reason: collision with root package name */
    private final o f29749e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29750f;

    /* renamed from: g, reason: collision with root package name */
    private final List f29751g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f29752h;

    public p(String str, AddressItem[] addressItemArr, int i2, boolean z, boolean z2, o oVar) {
        this.f29745a = str;
        this.f29748d = addressItemArr;
        this.f29746b = z;
        this.f29747c = z2;
        this.f29749e = oVar;
        this.f29750f = i2;
    }

    public static Filter a(m mVar, o oVar) {
        return new n(mVar, oVar);
    }

    static /* bridge */ /* synthetic */ void d(p pVar, List list) {
        o oVar = pVar.f29749e;
        if (oVar != null) {
            oVar.a(pVar.f29745a, list, pVar.f29752h);
        }
    }

    private final void e() throws Throwable {
        HttpURLConnection httpURLConnection;
        int i2 = this.f29750f;
        if ((i2 & 64) == 0) {
            return;
        }
        try {
            try {
                NativeManager nativeManager = NativeManager.getInstance();
                String str = this.f29745a;
                String strGetWazeAutocompleteUrl = nativeManager.GetWazeAutocompleteUrl(str);
                if (TextUtils.isEmpty(strGetWazeAutocompleteUrl)) {
                    throw new MalformedURLException("Autocomplete URL is empty.");
                }
                if (ConfigValues.CONFIG_VALUE_SEARCH_AUTOCOMPLETE_ROUTE_DISTANCE_ENABLED.b().booleanValue()) {
                    strGetWazeAutocompleteUrl = String.valueOf(strGetWazeAutocompleteUrl).concat("&df=1");
                }
                long jNanoTime = System.nanoTime();
                try {
                    httpURLConnection = (HttpURLConnection) new URL(strGetWazeAutocompleteUrl).openConnection();
                    try {
                        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
                        if (ConfigValues.CONFIG_VALUE_SEARCH_AUTOCOMPLETE_USE_ALT_SERVICE.b().booleanValue()) {
                            httpURLConnection.setRequestProperty("x-use-alt-service", CredentialEntry.TRUE_STRING);
                        }
                        InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                        StringBuilder sb = new StringBuilder();
                        InputStreamReader inputStreamReader2 = inputStreamReader;
                        char[] cArr = new char[2048];
                        while (true) {
                            int i3 = inputStreamReader2.read(cArr);
                            if (i3 == -1) {
                                break;
                            } else {
                                sb.append(cArr, 0, i3);
                            }
                        }
                        String string = sb.toString();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        com.waze.search.d.a.b.f().b(Long.valueOf((System.nanoTime() - jNanoTime) / 1000000), Long.valueOf(str.length()), Boolean.valueOf(this.f29746b), Boolean.valueOf(this.f29747c));
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("Autocomplete response is empty.");
                        }
                        JSONArray jSONArray = new JSONArray(string).getJSONArray(1);
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            try {
                                com.waze.j.e eVarP = com.waze.j.e.p(jSONArray.getJSONArray(i4), i4, str);
                                if (eVarP.e() != 6 || (i2 & 16384) != 0) {
                                    List list = this.f29751g;
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (eVarP.equals((com.waze.j.d) it.next())) {
                                                break;
                                            }
                                        } else {
                                            list.add(eVarP);
                                            break;
                                        }
                                    }
                                }
                            } catch (JSONException e2) {
                                com.waze.shared_infra.i.h.e("AutoCompleteRequest: Error processing waze result: ", e2);
                            }
                        }
                        this.f29752h = 0;
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                        com.waze.search.d.a.b.f().b(Long.valueOf((System.nanoTime() - jNanoTime) / 1000000), Long.valueOf(this.f29745a.length()), Boolean.valueOf(this.f29746b), Boolean.valueOf(this.f29747c));
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                }
            } catch (JSONException e3) {
                com.waze.shared_infra.i.h.e("AutoCompleteRequest: Invalid response: ", e3);
                this.f29752h = -2;
            }
        } catch (IOException e4) {
            com.waze.shared_infra.i.h.e("AutoCompleteRequest: IO exception (probably due to request cancelled): ", e4);
            this.f29752h = -4;
        } catch (IllegalArgumentException e5) {
            com.waze.shared_infra.i.h.e("AutoCompleteRequest: Empty response: ", e5);
            this.f29752h = -1;
        } catch (MalformedURLException e6) {
            com.waze.shared_infra.i.h.e("AutoCompleteRequest: Malformed url exception: ", e6);
            this.f29752h = -3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b A[LOOP:3: B:59:0x0179->B:60:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c A[LOOP:4: B:62:0x018a->B:63:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c A[LOOP:5: B:65:0x019a->B:66:0x019c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.menus.p.c():java.util.List");
    }
}

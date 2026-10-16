package com.google.firebase.abt;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8821b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final String f8823d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8824e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8825f;

    /* renamed from: g, reason: collision with root package name */
    private final Date f8826g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8827h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8828i;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f8822c = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: a, reason: collision with root package name */
    static final DateFormat f8820a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public b(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f8823d = str;
        this.f8824e = str2;
        this.f8825f = str3;
        this.f8826g = date;
        this.f8827h = j2;
        this.f8828i = j3;
    }

    static b a(Map map) throws NumberFormatException, a, ParseException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = f8822c;
        for (int i2 = 0; i2 < 5; i2++) {
            String str = strArr[i2];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
        try {
            return new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f8820a.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e2) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
        } catch (ParseException e3) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e3);
        }
    }

    final String b() {
        return this.f8823d;
    }

    final String c() {
        return this.f8824e;
    }

    final com.google.firebase.a.a.b d() {
        com.google.firebase.a.a.b bVar = new com.google.firebase.a.a.b();
        bVar.f8819f = this.f8826g.getTime();
        bVar.f8814a = this.f8823d;
        bVar.f8815b = this.f8824e;
        String str = this.f8825f;
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        bVar.f8816c = str;
        bVar.f8817d = this.f8827h;
        bVar.f8818e = this.f8828i;
        return bVar;
    }
}

package t8;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: t8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4148b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f45933g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f45934h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f45935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45937c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f45938d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45939e;

    /* renamed from: f, reason: collision with root package name */
    public final long f45940f;

    public C4148b(String str, String str2, String str3, Date date, long j8, long j10) {
        this.f45935a = str;
        this.f45936b = str2;
        this.f45937c = str3;
        this.f45938d = date;
        this.f45939e = j8;
        this.f45940f = j10;
    }

    public static C4148b a(Map map) throws C4147a, NumberFormatException, ParseException {
        d(map);
        try {
            return new C4148b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f45934h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e7) {
            throw new C4147a("Could not process experiment: one of the durations could not be converted into a long.", e7);
        } catch (ParseException e10) {
            throw new C4147a("Could not process experiment: parsing experiment start time failed.", e10);
        }
    }

    public static void d(Map map) throws C4147a {
        ArrayList arrayList = new ArrayList();
        String[] strArr = f45933g;
        for (int i5 = 0; i5 < 5; i5++) {
            String str = strArr[i5];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C4147a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final w8.c b(String str) {
        w8.c cVar = new w8.c();
        cVar.f47392a = str;
        cVar.f47403m = this.f45938d.getTime();
        cVar.f47393b = this.f45935a;
        cVar.f47394c = this.f45936b;
        String str2 = this.f45937c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        cVar.f47395d = str2;
        cVar.f47396e = this.f45939e;
        cVar.f47401j = this.f45940f;
        return cVar;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f45935a);
        map.put("variantId", this.f45936b);
        map.put("triggerEvent", this.f45937c);
        map.put("experimentStartTime", f45934h.format(this.f45938d));
        map.put("triggerTimeoutMillis", Long.toString(this.f45939e));
        map.put("timeToLiveMillis", Long.toString(this.f45940f));
        return map;
    }
}

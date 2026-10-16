package W9;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f15368a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15369b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f15370c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15371d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15372e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f15373f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15374g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15375h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15376i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15377j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f15378l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15379m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f15380n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15381o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f15382p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f15383q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f15384r;

    public s(p pVar) throws JSONException {
        String[] strArr;
        String[] strArr2;
        this.f15368a = pVar.j("gcm.n.title");
        this.f15369b = pVar.f("gcm.n.title");
        Object[] objArrE = pVar.e("gcm.n.title");
        if (objArrE == null) {
            strArr = null;
        } else {
            strArr = new String[objArrE.length];
            for (int i5 = 0; i5 < objArrE.length; i5++) {
                strArr[i5] = String.valueOf(objArrE[i5]);
            }
        }
        this.f15370c = strArr;
        this.f15371d = pVar.j("gcm.n.body");
        this.f15372e = pVar.f("gcm.n.body");
        Object[] objArrE2 = pVar.e("gcm.n.body");
        if (objArrE2 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[objArrE2.length];
            for (int i10 = 0; i10 < objArrE2.length; i10++) {
                strArr2[i10] = String.valueOf(objArrE2[i10]);
            }
        }
        this.f15373f = strArr2;
        this.f15374g = pVar.j("gcm.n.icon");
        String strJ = pVar.j("gcm.n.sound2");
        this.f15376i = TextUtils.isEmpty(strJ) ? pVar.j("gcm.n.sound") : strJ;
        this.f15377j = pVar.j("gcm.n.tag");
        this.k = pVar.j("gcm.n.color");
        this.f15378l = pVar.j("gcm.n.click_action");
        this.f15379m = pVar.j("gcm.n.android_channel_id");
        String strJ2 = pVar.j("gcm.n.link_android");
        strJ2 = TextUtils.isEmpty(strJ2) ? pVar.j("gcm.n.link") : strJ2;
        this.f15380n = TextUtils.isEmpty(strJ2) ? null : Uri.parse(strJ2);
        this.f15375h = pVar.j("gcm.n.image");
        this.f15381o = pVar.j("gcm.n.ticker");
        this.f15382p = pVar.b("gcm.n.notification_priority");
        this.f15383q = pVar.b("gcm.n.visibility");
        this.f15384r = pVar.b("gcm.n.notification_count");
        pVar.a("gcm.n.sticky");
        pVar.a("gcm.n.local_only");
        pVar.a("gcm.n.default_sound");
        pVar.a("gcm.n.default_vibrate_timings");
        pVar.a("gcm.n.default_light_settings");
        pVar.g();
        pVar.d();
        pVar.k();
    }
}

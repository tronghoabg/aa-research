package s8;

import Y2.B;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Arrays;
import n7.AbstractC3601f;
import org.apache.tika.metadata.ClimateForcast;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f45343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45346d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45347e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45348f;

    /* renamed from: g, reason: collision with root package name */
    public final String f45349g;

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC1732v.k("ApplicationId must be set.", !AbstractC3601f.b(str));
        this.f45344b = str;
        this.f45343a = str2;
        this.f45345c = str3;
        this.f45346d = str4;
        this.f45347e = str5;
        this.f45348f = str6;
        this.f45349g = str7;
    }

    public static l a(Context context) {
        X2.j jVar = new X2.j(context);
        String strT = jVar.T("google_app_id");
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        return new l(strT, jVar.T("google_api_key"), jVar.T("firebase_database_url"), jVar.T("ga_trackingId"), jVar.T("gcm_defaultSenderId"), jVar.T("google_storage_bucket"), jVar.T(ClimateForcast.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC1732v.m(this.f45344b, lVar.f45344b) && AbstractC1732v.m(this.f45343a, lVar.f45343a) && AbstractC1732v.m(this.f45345c, lVar.f45345c) && AbstractC1732v.m(this.f45346d, lVar.f45346d) && AbstractC1732v.m(this.f45347e, lVar.f45347e) && AbstractC1732v.m(this.f45348f, lVar.f45348f) && AbstractC1732v.m(this.f45349g, lVar.f45349g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45344b, this.f45343a, this.f45345c, this.f45346d, this.f45347e, this.f45348f, this.f45349g});
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(this.f45344b, "applicationId");
        b5.g(this.f45343a, "apiKey");
        b5.g(this.f45345c, "databaseUrl");
        b5.g(this.f45347e, "gcmSenderId");
        b5.g(this.f45348f, "storageBucket");
        b5.g(this.f45349g, "projectId");
        return b5.toString();
    }
}

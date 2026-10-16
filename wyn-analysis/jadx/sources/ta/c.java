package Ta;

import Ma.j;
import Oa.g;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f11819c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f11820d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(S3.c cVar, HashSet hashSet, JSONObject jSONObject, long j8, int i5) {
        super(cVar);
        this.f11822f = i5;
        this.f11819c = new HashSet(hashSet);
        this.f11820d = jSONObject;
        this.f11821e = j8;
    }

    @Override // Ta.a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        Oa.c cVar;
        g gVar = g.f8938a;
        long j8 = this.f11821e;
        HashSet hashSet = this.f11819c;
        switch (this.f11822f) {
            case 0:
                Oa.c cVar2 = Oa.c.f8930c;
                if (cVar2 != null) {
                    for (j jVar : DesugarCollections.unmodifiableCollection(cVar2.f8931a)) {
                        if (hashSet.contains(jVar.f7613h)) {
                            Qa.a aVar = jVar.f7610e;
                            if (j8 >= aVar.f9933e && aVar.f9932d != 3) {
                                aVar.f9932d = 3;
                                gVar.a(aVar.e(), "setNativeViewHierarchy", str, aVar.f9929a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (cVar = Oa.c.f8930c) != null) {
                    for (j jVar2 : DesugarCollections.unmodifiableCollection(cVar.f8931a)) {
                        if (hashSet.contains(jVar2.f7613h)) {
                            Qa.a aVar2 = jVar2.f7610e;
                            if (j8 >= aVar2.f9933e) {
                                aVar2.f9932d = 2;
                                gVar.a(aVar2.e(), "setNativeViewHierarchy", str, aVar2.f9929a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f11822f) {
            case 0:
                return this.f11820d.toString();
            default:
                S3.c cVar = this.f11818b;
                JSONObject jSONObject = (JSONObject) cVar.f10936b;
                JSONObject jSONObject2 = this.f11820d;
                if (Ra.b.e(jSONObject2, jSONObject)) {
                    return null;
                }
                cVar.f10936b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // Ta.a, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f11822f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}

package N6;

import D6.C0392q;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzgti;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: N6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0780e implements zzhbn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8469b;

    public /* synthetic */ C0780e(Object obj, int i5) {
        this.f8468a = i5;
        this.f8469b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final p8.p zza(Object obj) {
        switch (this.f8468a) {
            case 0:
                final ArrayList arrayList = (ArrayList) obj;
                final j jVar = (j) this.f8469b;
                return zzhcf.zzk(jVar.X("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgti() { // from class: N6.f
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        j jVar2 = jVar;
                        jVar2.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri : arrayList) {
                            if (!j.V(uri, jVar2.f8512y, jVar2.f8513z) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri);
                            } else {
                                arrayList2.add(j.Y(uri, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, jVar.f8494f);
            case 1:
                final Uri uri = (Uri) obj;
                j jVar2 = (j) this.f8469b;
                return zzhcf.zzk(jVar2.X("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgti() { // from class: N6.g
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !zIsEmpty ? j.Y(uri2, "nas", str) : uri2;
                    }
                }, jVar2.f8494f);
            default:
                zzeha zzehaVar = (zzeha) obj;
                s sVar = new s(new JsonReader(new InputStreamReader(zzehaVar.zza())), zzehaVar.zzb());
                try {
                    sVar.f8541b = C0392q.f2477g.f2478a.m(((zzcbk) this.f8469b).zza).toString();
                } catch (JSONException unused) {
                    sVar.f8541b = JsonUtils.EMPTY_JSON;
                }
                return zzhcf.zza(sVar);
        }
    }
}

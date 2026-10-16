package N6;

import G6.L;
import com.google.android.gms.internal.ads.zzgti;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements zzgti {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f8473b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f8474c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8475a;

    public /* synthetic */ h(int i5) {
        this.f8475a = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f8475a) {
            case 0:
                ArrayList arrayList = j.f8479G;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = j.f8479G;
                int i5 = L.f4523b;
                H6.l.d("", (Exception) obj);
                return null;
        }
    }
}

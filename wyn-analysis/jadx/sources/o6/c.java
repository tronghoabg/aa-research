package O6;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbkr;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8886a = (String) zzbkr.zza.zze();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f8886a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}

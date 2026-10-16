package C6;

import Va.M6;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.ads.zzbkj;
import j$.util.Objects;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class k extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1843a;

    public /* synthetic */ k(m mVar) {
        Objects.requireNonNull(mVar);
        this.f1843a = mVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        m mVar = this.f1843a;
        mVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbkj.zzd.zze());
        l lVar = mVar.f1853d;
        String str = (String) lVar.f1846c;
        if (str != null) {
            builder.appendQueryParameter(AppLovinEventParameters.SEARCH_QUERY, str);
        }
        builder.appendQueryParameter("pubId", (String) lVar.f1845b);
        builder.appendQueryParameter("mappver", (String) lVar.f1848e);
        TreeMap treeMap = (TreeMap) lVar.f1849f;
        for (String str2 : treeMap.keySet()) {
            builder.appendQueryParameter(str2, (String) treeMap.get(str2));
        }
        Uri uriBuild = builder.build();
        String strS = mVar.S();
        String encodedQuery = uriBuild.getEncodedQuery();
        return M6.t(new StringBuilder(strS.length() + 1 + String.valueOf(encodedQuery).length()), strS, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f1843a.f1854e;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}

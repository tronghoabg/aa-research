package com.unity3d.ads.core.data.datasource;

import Fe.c;
import Fe.e;
import android.content.Context;
import com.applovin.shadow.okio.Segment;
import ef.C2529m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String key) {
        Object objZ;
        AbstractC3340k.e(key, "key");
        try {
            String strConcat = key.concat("=");
            G g9 = new G();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                AbstractC3340k.d(stream, "stream");
                c.r(new BufferedReader(new InputStreamReader(stream, Bf.a.f1670a), Segment.SIZE), new AndroidUnityBootConfigDataSource$getValue$1$1$1(strConcat, g9));
                stream.close();
                objZ = (String) g9.f39740a;
            } finally {
            }
        } catch (Throwable th) {
            objZ = e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        return (String) objZ;
    }
}

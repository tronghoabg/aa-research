package A0;

import android.os.Build;
import android.text.StaticLayout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements m {
    @Override // A0.m
    @NotNull
    public StaticLayout a(@NotNull n params) {
        AbstractC3340k.e(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.f214a, 0, params.f215b, params.f216c, params.f217d);
        builderObtain.setTextDirection(params.f218e);
        builderObtain.setAlignment(params.f219f);
        builderObtain.setMaxLines(params.f220g);
        builderObtain.setEllipsize(params.f221h);
        builderObtain.setEllipsizedWidth(params.f222i);
        builderObtain.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        builderObtain.setIncludePad(true);
        builderObtain.setBreakStrategy(0);
        builderObtain.setHyphenationFrequency(0);
        builderObtain.setIndents(null, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            i.f210a.a(builderObtain, params.f223j);
        }
        if (i5 >= 28) {
            k.f211a.a(builderObtain, true);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        AbstractC3340k.d(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}

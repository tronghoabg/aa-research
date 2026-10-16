package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes3.dex */
public class moa {
    private static volatile int moa = 0;

    /* renamed from: oa, reason: collision with root package name */
    private static volatile String f25747oa = "";
    private static volatile String uef = "";
    private static String yo;

    public static String moa() {
        if (TextUtils.isEmpty(yo)) {
            yo = sy.uef().getPackageManager().getInstallerPackageName(gb.ivm());
        }
        if (yo == null) {
            yo = "";
        }
        return yo;
    }

    public static String yo() {
        if (moa != 0) {
            return f25747oa;
        }
        uef();
        return f25747oa;
    }

    public static String oa() {
        if (moa != 0) {
            return uef;
        }
        uef();
        return uef;
    }

    public static void uef() {
        try {
            AppSet.getClient(sy.uef()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = moa.uef = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = moa.f25747oa = appSetIdInfo.getId();
                    int unused3 = moa.moa = 1;
                }
            });
        } catch (Throwable unused) {
            moa = 2;
        }
    }
}

package com.google.android.recaptcha.internal;

import Bf.r;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import ff.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzdt {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final List zzb = zzf(AbstractC3935e.D("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    public static final boolean zza(@NotNull Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzb(@NotNull String str) {
        Uri uri = Uri.parse(str);
        AbstractC3340k.b(uri);
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzc(@NotNull Uri uri) {
        return zze(uri);
    }

    private static final boolean zzd(String str) {
        List list = zzb;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (r.k0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !HttpRequest.DEFAULT_SCHEME.equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}

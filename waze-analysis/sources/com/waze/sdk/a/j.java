package com.waze.sdk.a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.media.MediaBrowserServiceCompat;
import com.waze.mg;
import com.waze.sdk.ah;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f35199a = new j();

    /* renamed from: b, reason: collision with root package name */
    private final Map f35200b = new HashMap();

    private j() {
    }

    public final synchronized ah a(String str) {
        Map map;
        map = this.f35200b;
        if (!map.containsKey(str)) {
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction(MediaBrowserServiceCompat.SERVICE_INTERFACE);
            List<ResolveInfo> listQueryIntentServices = mg.a().getPackageManager().queryIntentServices(intent, 0);
            ComponentName componentName = listQueryIntentServices.size() != 0 ? new ComponentName(str, listQueryIntentServices.get(0).serviceInfo.name) : null;
            if (componentName != null) {
                if ("com.spotify.music".equals(str)) {
                    map.put(str, new k(mg.a(), componentName));
                } else {
                    map.put(str, new i(mg.a(), str, componentName));
                }
            }
        }
        return (ah) map.get(str);
    }

    final synchronized void b(String str) {
        this.f35200b.remove(str);
    }
}

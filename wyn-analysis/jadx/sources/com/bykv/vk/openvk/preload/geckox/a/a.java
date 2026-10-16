package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f24305a;

    /* renamed from: b, reason: collision with root package name */
    private int f24306b = 1;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    public static class C0028a {

        /* renamed from: a, reason: collision with root package name */
        String f24309a;

        /* renamed from: b, reason: collision with root package name */
        String f24310b;

        /* renamed from: c, reason: collision with root package name */
        int f24311c;

        /* renamed from: d, reason: collision with root package name */
        long f24312d;

        /* renamed from: e, reason: collision with root package name */
        File f24313e;

        public C0028a(String str, String str2, int i5, long j8, File file) {
            this.f24309a = str;
            this.f24310b = str2;
            this.f24311c = i5;
            this.f24312d = j8;
            this.f24313e = file;
        }
    }

    public a(List<String> list) {
        this.f24305a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> listB;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f24442a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f24442a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f24439a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i5 = aVar2.f24440b;
                            List<Long> list3 = aVar2.f24441c;
                            File file3 = new File(file2, str);
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0028a(key, str, i5, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l10 : listB) {
                                        if (list3.get(0).longValue() > l10.longValue()) {
                                            File file6 = new File(file3, l10 + "--pending-delete");
                                            new File(file3, String.valueOf(l10)).renameTo(file6);
                                            arrayList.add(new C0028a(key, str, i5, l10.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l11 : listB2) {
                                    if (list3.contains(l11)) {
                                        File file7 = new File(file3, l11 + "--pending-delete");
                                        new File(file3, String.valueOf(l11)).renameTo(file7);
                                        arrayList.add(new C0028a(key, str, i5, l11.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0028a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0028a c0028a : list4) {
                            File file8 = c0028a.f24313e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0028a.f24309a, c0028a.f24310b, c0028a.f24311c, 200, c0028a.f24312d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0028a.f24309a, c0028a.f24310b, c0028a.f24311c, 201, c0028a.f24312d, Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e10) {
                    GeckoLogger.w("clean-channel", "", e10);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f24305a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i5 = 0; i5 < this.f24305a.size(); i5++) {
                    jSONArray.put(this.f24305a.get(i5));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put("os", 0);
            jSONObject.put("msg_type", this.f24306b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}

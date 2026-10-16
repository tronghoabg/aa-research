package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f24365e);
                jSONObject.put("http_status", aVar.f24367g);
                jSONObject.put("err_msg", aVar.f24364d);
                if (TextUtils.isEmpty(aVar.f24365e)) {
                    jSONObject.put("deployments_info", aVar.f24362b);
                    jSONObject.put("local_info", aVar.f24361a);
                    jSONObject.put("custom_info", aVar.f24363c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("ac", aVar.f24366f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f24483z && aVar.f24455A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f24459a;
            packageStatisticModel.groupName = aVar.f24460b;
            packageStatisticModel.channel = aVar.f24461c;
            packageStatisticModel.f24453ac = aVar.f24471n;
            packageStatisticModel.f24454id = aVar.f24473p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f24478u);
            packageStatisticModel.downloadUrl = aVar.f24477t;
            packageStatisticModel.downloadFailRecords = b(aVar.f24478u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f24480w - aVar.f24479v);
            if (aVar.f24456B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f24459a;
                packageStatisticModel2.groupName = aVar.f24460b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f24454id = aVar.f24473p;
                packageStatisticModel2.channel = aVar.f24461c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f24481x - aVar.f24480w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f24482y - aVar.f24481x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f24459a;
            packageStatisticModel3.groupName = aVar.f24460b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f24454id = aVar.f24473p;
            packageStatisticModel3.channel = aVar.f24461c;
            packageStatisticModel3.errMsg = aVar.f24458D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f24459a;
        packageStatisticModel4.groupName = aVar.f24460b;
        packageStatisticModel4.channel = aVar.f24461c;
        packageStatisticModel4.f24453ac = aVar.f24471n;
        packageStatisticModel4.f24454id = aVar.f24473p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f24478u);
        packageStatisticModel4.downloadUrl = aVar.f24477t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f24478u);
        if (!aVar.f24483z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f24478u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f24478u.get(0).reason;
            return;
        }
        if (aVar.f24455A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.f24457C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f24462d != null || aVar2.f24464f != 0) {
                if (aVar2.f24466h && aVar2.f24467i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f24460b;
                    packageStatisticModel.accessKey = aVar2.f24459a;
                    packageStatisticModel.channel = aVar2.f24461c;
                    packageStatisticModel.f24453ac = aVar2.f24471n;
                    packageStatisticModel.f24454id = aVar2.f24473p;
                    packageStatisticModel.patchId = aVar2.f24472o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f24463e);
                    packageStatisticModel.downloadUrl = aVar2.f24462d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f24463e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f24465g - aVar2.f24464f);
                    if (!aVar2.f24468j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f24461c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f24475r;
                        packageStatisticModel2.f24453ac = aVar2.f24471n;
                        packageStatisticModel2.patchId = aVar2.f24472o;
                        packageStatisticModel2.f24454id = aVar2.f24473p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f24463e);
                        packageStatisticModel2.downloadUrl = aVar2.f24462d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f24463e);
                    } else if (aVar2.k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f24459a;
                        packageStatisticModel3.groupName = aVar2.f24460b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f24472o;
                        packageStatisticModel3.f24454id = aVar2.f24473p;
                        packageStatisticModel3.channel = aVar2.f24461c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f24469l - aVar2.f24465g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f24470m - aVar2.f24469l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f24459a;
                        packageStatisticModel4.groupName = aVar2.f24460b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f24461c;
                        packageStatisticModel4.patchId = aVar2.f24472o;
                        packageStatisticModel4.f24454id = aVar2.f24473p;
                        packageStatisticModel4.errMsg = aVar2.f24476s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f24459a;
                    packageStatisticModel5.groupName = aVar2.f24460b;
                    packageStatisticModel5.channel = aVar2.f24461c;
                    packageStatisticModel5.f24453ac = aVar2.f24471n;
                    packageStatisticModel5.patchId = aVar2.f24472o;
                    packageStatisticModel5.f24454id = aVar2.f24473p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f24463e);
                    packageStatisticModel5.downloadUrl = aVar2.f24462d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f24463e);
                    if (!aVar2.f24466h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f24463e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f24463e.get(0).reason;
                        }
                    } else if (!aVar2.f24467i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f24474q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    Common common2 = statisticModel.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f24454id;
                    jSONObject.put("id", l11 == null ? 0L : l11.longValue());
                    jSONObject.put("ac", common2.f24438ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("download_url", str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj = list2;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() throws NetworkErrorException {
                        Response responseDoPost;
                        for (int i5 = 0; i5 < 3; i5++) {
                            try {
                                responseDoPost = bVar.i().doPost(str2, json);
                            } catch (Exception e7) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e7);
                            }
                            if (responseDoPost.code != 200) {
                                throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                            }
                            if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                return;
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}

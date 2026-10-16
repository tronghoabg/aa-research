package com.bytedance.sdk.openadsdk.gsd;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class uef {
    private static int uef(int i5) {
        int i10 = 2;
        if (i5 != 2) {
            i10 = 3;
            if (i5 != 3) {
                i10 = 4;
                if (i5 != 4) {
                    i10 = 5;
                    if (i5 != 5 && i5 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i10;
    }

    public static List<String> uef(List<String> list, boolean z2) {
        String strUef = cq.uef(sy.uef());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strUef)) {
                next = next.replace("{UID}", strUef).replace("__UID__", strUef);
            }
            if (z2) {
                next = uef(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String uef(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e7) {
                dhk.yo("TrackAdUrlUtils", e7.getMessage());
            }
        }
        return str;
    }

    public static List<String> uef(List<String> list, boolean z2, gzw gzwVar) {
        String strUef = cq.uef(sy.uef());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strUef)) {
                next = next.replace("{UID}", strUef).replace("__UID__", strUef);
            }
            if (next.contains("__CID__") && gzwVar != null && !TextUtils.isEmpty(gzwVar.iou())) {
                next = next.replace("__CID__", gzwVar.iou());
            }
            if (next.contains("__CTYPE__") && gzwVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(uef(gzwVar.hw())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(gb.moa()));
            }
            if (z2) {
                next = uef(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}

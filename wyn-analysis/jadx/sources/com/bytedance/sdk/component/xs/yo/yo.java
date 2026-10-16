package com.bytedance.sdk.component.xs.yo;

import Va.M6;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public class yo {
    private static final yo uef = new yo();

    /* renamed from: oa, reason: collision with root package name */
    private final Object f25119oa = new Object();
    private volatile List<String> yo = new ArrayList();
    private final ConcurrentHashMap<String, Integer> moa = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> lw = new ConcurrentHashMap<>();
    private volatile boolean ivm = false;
    private volatile int xs = 10;
    private volatile long bcc = 1800000;

    private yo() {
    }

    private List<String> oa(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static yo uef() {
        return uef;
    }

    public void uef(lw lwVar) {
        if (this.ivm == lwVar.uef && this.xs == lwVar.f25116oa && this.bcc == lwVar.yo) {
            return;
        }
        this.ivm = lwVar.uef;
        this.xs = lwVar.f25116oa;
        this.bcc = lwVar.yo;
        String.format("Config updated: enable=%b, K=%d, Cooldown=%dms", Boolean.valueOf(this.ivm), Integer.valueOf(this.xs), Long.valueOf(this.bcc));
    }

    private boolean oa(List<String> list, String str) {
        if (!list.contains(str)) {
            list.add(str);
            return true;
        }
        if (((String) M6.k(1, list)).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(str);
        return true;
    }

    private String uef(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            if (host != null && path != null) {
                if (path.isEmpty()) {
                    path = "/";
                }
                return host.concat(path);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private String uef(String str, String str2, List<String> list) {
        if (str.equals(uef(str2))) {
            return str2;
        }
        for (String str3 : list) {
            if (str.equals(uef(str3))) {
                return str3;
            }
        }
        return null;
    }

    public List<String> uef(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (!this.ivm) {
                return oa(str, list);
            }
            String strUef = uef(str);
            if (strUef == null) {
                return oa(str, list);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<String> list2 = this.yo;
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                String strUef2 = uef(it.next(), str, list);
                if (strUef2 != null && !arrayList.contains(strUef2)) {
                    arrayList.add(strUef2);
                }
            }
            for (String str2 : list) {
                if (!list2.contains(uef(str2)) && !arrayList.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(1, arrayList2);
            } else if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
            linkedHashSet.add(str);
            linkedHashSet.addAll(list);
            ArrayList arrayList3 = new ArrayList(linkedHashSet);
            Long l10 = this.lw.get(strUef);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((l10 == null || jCurrentTimeMillis >= l10.longValue()) && arrayList3.remove(str)) {
                arrayList3.add(0, str);
            }
            arrayList3.toString();
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(str);
        return arrayList4;
    }

    public void uef(String str, String str2, boolean z2) {
        if ((z2 || com.bytedance.sdk.component.xs.uef.xs()) && this.ivm && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String strUef = uef(str);
            String strUef2 = uef(str2);
            if (strUef == null || strUef2 == null) {
                return;
            }
            boolean zEquals = str.equals(str2);
            synchronized (this.f25119oa) {
                try {
                    ArrayList arrayList = new ArrayList(this.yo);
                    boolean zOa = false;
                    if (zEquals) {
                        if (z2) {
                            this.moa.remove(strUef2);
                            this.lw.remove(strUef2);
                            zOa = uef(arrayList, strUef2);
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            Long l10 = this.lw.get(strUef2);
                            if (l10 != null && jCurrentTimeMillis < l10.longValue()) {
                                zOa = oa(arrayList, strUef2);
                            } else {
                                Integer num = this.moa.get(strUef2);
                                int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                                this.moa.put(strUef2, Integer.valueOf(iIntValue));
                                if (iIntValue >= this.xs) {
                                    this.lw.put(strUef2, Long.valueOf(jCurrentTimeMillis + this.bcc));
                                    zOa = oa(arrayList, strUef2);
                                    this.moa.remove(strUef2);
                                }
                            }
                        }
                    } else if (z2) {
                        Long l11 = this.lw.get(strUef2);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (l11 != null && l11.longValue() > jCurrentTimeMillis2) {
                            zOa = uef(arrayList, strUef);
                        }
                    } else {
                        zOa = oa(arrayList, strUef);
                    }
                    if (zOa) {
                        while (arrayList.size() > 15) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        this.yo = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private boolean uef(List<String> list, String str) {
        if (!list.isEmpty() && list.get(0).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(0, str);
        return true;
    }
}

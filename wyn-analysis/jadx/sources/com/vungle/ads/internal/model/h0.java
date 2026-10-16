package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.E;
import Wf.O;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h0 {

    @NotNull
    public static final p Companion = new p();

    /* renamed from: a, reason: collision with root package name */
    public final List f33177a;

    /* renamed from: b, reason: collision with root package name */
    public final v2 f33178b;

    /* renamed from: c, reason: collision with root package name */
    public Long f33179c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f33180d;

    /* renamed from: e, reason: collision with root package name */
    public Map f33181e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33182f;

    /* renamed from: g, reason: collision with root package name */
    public AdConfig f33183g;

    /* renamed from: h, reason: collision with root package name */
    public com.vungle.ads.internal.util.s f33184h;

    /* renamed from: i, reason: collision with root package name */
    public String f33185i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f33186j;

    public /* synthetic */ h0(int i5, List list, v2 v2Var, Long l10, ConcurrentHashMap concurrentHashMap, Map map, boolean z2, String str) {
        if ((i5 & 1) == 0) {
            this.f33177a = null;
        } else {
            this.f33177a = list;
        }
        if ((i5 & 2) == 0) {
            this.f33178b = null;
        } else {
            this.f33178b = v2Var;
        }
        if ((i5 & 4) == 0) {
            this.f33179c = null;
        } else {
            this.f33179c = l10;
        }
        if ((i5 & 8) == 0) {
            this.f33180d = new ConcurrentHashMap();
        } else {
            this.f33180d = concurrentHashMap;
        }
        if ((i5 & 16) == 0) {
            this.f33181e = new HashMap();
        } else {
            this.f33181e = map;
        }
        if ((i5 & 32) == 0) {
            this.f33182f = false;
        } else {
            this.f33182f = z2;
        }
        this.f33183g = null;
        this.f33184h = null;
        if ((i5 & 64) == 0) {
            this.f33185i = null;
        } else {
            this.f33185i = str;
        }
        this.f33186j = new LinkedHashMap();
    }

    public static final void a(h0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33177a != null) {
            output.i(serialDesc, 0, new C1241c(q.f33294a, 0), self.f33177a);
        }
        if (output.A(serialDesc, 1) || self.f33178b != null) {
            output.i(serialDesc, 1, u1.f33327a, self.f33178b);
        }
        if (output.A(serialDesc, 2) || self.f33179c != null) {
            output.i(serialDesc, 2, O.f15556a, self.f33179c);
        }
        if (output.A(serialDesc, 3) || !AbstractC3340k.a(self.f33180d, new ConcurrentHashMap())) {
            KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(ConcurrentHashMap.class);
            Wf.q0 q0Var = Wf.q0.f15625a;
            output.f(serialDesc, 3, new Sf.a(orCreateKotlinClass, new KSerializer[]{q0Var, q0Var}), self.f33180d);
        }
        if (output.A(serialDesc, 4) || !AbstractC3340k.a(self.f33181e, new HashMap())) {
            Wf.q0 q0Var2 = Wf.q0.f15625a;
            output.f(serialDesc, 4, new E(q0Var2, q0Var2, 1), self.f33181e);
        }
        if (output.A(serialDesc, 5) || self.f33182f) {
            output.x(serialDesc, 5, self.f33182f);
        }
        if (!output.A(serialDesc, 6) && self.f33185i == null) {
            return;
        }
        output.i(serialDesc, 6, Wf.q0.f15625a, self.f33185i);
    }

    public final boolean A() {
        return AbstractC3340k.a(F(), "native");
    }

    public final boolean B() {
        Boolean bool;
        i iVarK = k();
        return ((iVarK == null || (bool = iVarK.f33196C) == null) ? false : bool.booleanValue()) && !A();
    }

    public final boolean C() {
        z zVar;
        c0 c0Var;
        Boolean bool;
        i iVarK = k();
        if (iVarK == null || (zVar = iVarK.f33215s) == null || (c0Var = zVar.f33366a) == null || (bool = c0Var.f33137a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String D() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.f33306a;
        }
        return null;
    }

    public final void E() {
        this.f33179c = Long.valueOf(System.currentTimeMillis());
    }

    public final String F() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33216t;
        }
        return null;
    }

    public final boolean G() {
        i iVarK = k();
        return (iVarK != null ? AbstractC3340k.a(iVarK.l(), Boolean.TRUE) : false) && !A();
    }

    public final boolean b() {
        Boolean bool;
        i iVarK = k();
        if (iVarK == null || (bool = iVarK.f33205h) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final i c() {
        return k();
    }

    public final int d() {
        f fVar;
        Integer num;
        i iVarK = k();
        if (iVarK == null || (fVar = iVarK.f33222z) == null || (num = fVar.f33160a) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String e() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33219w;
        }
        return null;
    }

    public final v2 f() {
        return this.f33178b;
    }

    public final kotlinx.serialization.json.c g() {
        LinkedHashMap linkedHashMapS = s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapS.entrySet()) {
            String key = (String) entry.getKey();
            String str = (String) entry.getValue();
            AbstractC3340k.e(key, "key");
            kotlinx.serialization.json.d element = Xf.j.b(str);
            AbstractC3340k.e(element, "element");
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }

    public final String h() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33198a;
        }
        return null;
    }

    public final s i() {
        List list = this.f33177a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (s) list.get(0);
    }

    public final AdConfig j() {
        return this.f33183g;
    }

    public final i k() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.f33307b;
        }
        return null;
    }

    public final String l() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33200c;
        }
        return null;
    }

    public final l m() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.f33308c;
        }
        return null;
    }

    public final String n() {
        String str;
        i iVarK = k();
        return (iVarK == null || (str = iVarK.f33218v) == null) ? "unknown" : str;
    }

    public final String o() {
        v vVar;
        Map map;
        i iVarK = k();
        if (iVarK == null || (vVar = iVarK.f33217u) == null || (map = vVar.f33331a) == null) {
            return null;
        }
        return (String) map.get("OBSERVED_EXPERIMENTS");
    }

    public final String p() {
        return this.f33185i;
    }

    public final com.vungle.ads.internal.util.s q() {
        return this.f33184h;
    }

    public final List r() {
        l lVar;
        s sVarI = i();
        if (sVarI == null || (lVar = sVarI.f33308c) == null) {
            return null;
        }
        return lVar.f33247c;
    }

    public final LinkedHashMap s() {
        v vVar;
        Map map;
        v vVar2;
        Map map2;
        i iVarK = k();
        if ((iVarK != null ? iVarK.f33217u : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i iVarK2 = k();
        if (iVarK2 != null && (vVar2 = iVarK2.f33217u) != null && (map2 = vVar2.f33331a) != null) {
            linkedHashMap.putAll(map2);
        }
        i iVarK3 = k();
        if (iVarK3 != null && (vVar = iVarK3.f33217u) != null && (map = vVar.f33332b) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = ((o) entry.getValue()).f33269a;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
        }
        if (!this.f33180d.isEmpty()) {
            linkedHashMap.putAll(this.f33180d);
        }
        if (!this.f33181e.isEmpty()) {
            linkedHashMap.putAll(this.f33181e);
        }
        return linkedHashMap;
    }

    public final String t() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33206i;
        }
        return null;
    }

    public final String u() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33211o;
        }
        return null;
    }

    public final f0 v() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.f33194A;
        }
        return null;
    }

    public final List w() {
        l lVar;
        s sVarI = i();
        if (sVarI == null || (lVar = sVarI.f33308c) == null) {
            return null;
        }
        return lVar.f33246b;
    }

    public final boolean x() {
        i iVarK = k();
        if (iVarK == null) {
            return false;
        }
        Long l10 = this.f33179c;
        if (iVarK.f33202e != null && l10 != null) {
            if ((System.currentTimeMillis() - l10.longValue()) / 1000 > (iVarK.f33202e != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        } else if (iVarK.f33201d != null) {
            if (System.currentTimeMillis() / 1000 > (iVarK.f33201d != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        v vVarJ;
        Map mapB;
        String str;
        i iVarK = k();
        return (iVarK == null || (vVarJ = iVarK.j()) == null || (mapB = vVarJ.b()) == null || (str = (String) mapB.get("AD_PODDING")) == null || !str.equalsIgnoreCase("true")) ? false : true;
    }

    public final boolean z() {
        Boolean bool;
        i iVarK = k();
        if (iVarK == null || (bool = iVarK.f33204g) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean b(String failingUrl) {
        v vVarJ;
        Map mapA;
        AbstractC3340k.e(failingUrl, "failingUrl");
        if (!A()) {
            i iVarK = k();
            if (AbstractC3340k.a(iVarK != null ? iVarK.m() : null, failingUrl)) {
                return true;
            }
        }
        i iVarK2 = k();
        if (iVarK2 == null || (vVarJ = iVarK2.j()) == null || (mapA = vVarJ.a()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (AbstractC3340k.a(((o) entry.getValue()).c(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final int a() {
        f fVar;
        Integer num;
        i iVarK = k();
        if (iVarK == null || (fVar = iVarK.f33222z) == null || (num = fVar.f33161b) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List b(String event, String str, String str2) {
        Map mapK;
        Map mapK2;
        AbstractC3340k.e(event, "event");
        i iVarK = k();
        if (iVarK != null && (mapK2 = iVarK.k()) != null && !mapK2.containsKey(event)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, com.iab.omid.library.vungle.d.a("Arbitrary tpat key: ", event)).setLogEntry$vungle_ads_release(this.f33184h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        i iVarK2 = k();
        List list = (iVarK2 == null || (mapK = iVarK2.k()) == null) ? null : (List) mapK.get(event);
        if (list != null && !list.isEmpty()) {
            switch (event.hashCode()) {
                case -2125915830:
                    if (event.equals("checkpoint.0")) {
                        ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(a(a((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.f33182f)), "{{{carrier}}}", str), "{{{vol}}}", str2));
                        }
                        return arrayList;
                    }
                    return list;
                case -747709511:
                    if (event.equals("video.length")) {
                        ArrayList arrayList2 = new ArrayList(ff.p.a0(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(a((String) it2.next(), "{{{vlen}}}", str));
                        }
                        return arrayList2;
                    }
                    return list;
                case -132489083:
                    if (event.equals("ad.loadDuration")) {
                        ArrayList arrayList3 = new ArrayList(ff.p.a0(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(a((String) it3.next(), "{{{time_dl}}}", str));
                        }
                        return arrayList3;
                    }
                    return list;
                case 1516630125:
                    if (event.equals("ad.close")) {
                        ArrayList arrayList4 = new ArrayList(ff.p.a0(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(a(a((String) it4.next(), "{{{dur}}}", str), "{{{vol}}}", str2));
                        }
                        return arrayList4;
                    }
                    return list;
                case 1940309120:
                    if (event.equals("deeplink.click")) {
                        ArrayList arrayList5 = new ArrayList(ff.p.a0(list, 10));
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(a((String) it5.next(), "{{{is_success}}}", str));
                        }
                        return arrayList5;
                    }
                    return list;
                default:
                    return list;
            }
        }
        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, com.iab.omid.library.vungle.d.a("Empty tpat key: ", event)).setLogEntry$vungle_ads_release(this.f33184h).logErrorNoReturnValue$vungle_ads_release();
        return null;
    }

    public final void a(AdConfig adConfig) {
        this.f33183g = adConfig;
    }

    public final void a(com.vungle.ads.internal.util.s sVar) {
        this.f33184h = sVar;
    }

    public final b a(String remoteUrl) {
        AbstractC3340k.e(remoteUrl, "remoteUrl");
        return (b) this.f33186j.get(remoteUrl);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.io.File r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.h0.a(java.io.File):java.util.ArrayList");
    }

    public static /* synthetic */ List a(h0 h0Var, String str, String str2, int i5) {
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        return h0Var.b(str, str2, null);
    }

    public final void a(String title, String body, String keepWatching, String close) {
        AbstractC3340k.e(title, "title");
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(keepWatching, "keepWatching");
        AbstractC3340k.e(close, "close");
        if (title.length() > 0) {
            this.f33181e.put("INCENTIVIZED_TITLE_TEXT", title);
        }
        if (body.length() > 0) {
            this.f33181e.put("INCENTIVIZED_BODY_TEXT", body);
        }
        if (keepWatching.length() > 0) {
            this.f33181e.put("INCENTIVIZED_CONTINUE_TEXT", keepWatching);
        }
        if (close.length() > 0) {
            this.f33181e.put("INCENTIVIZED_CLOSE_TEXT", close);
        }
    }

    public final int a(Boolean bool) {
        Integer numG;
        int iIntValue;
        Integer numH;
        if (AbstractC3340k.a(bool, Boolean.TRUE)) {
            i iVarK = k();
            if (iVarK == null || (numH = iVarK.h()) == null) {
                return 0;
            }
            iIntValue = numH.intValue();
        } else {
            i iVarK2 = k();
            if (iVarK2 == null || (numG = iVarK2.g()) == null) {
                return 0;
            }
            iIntValue = numG.intValue();
        }
        return iIntValue * 1000;
    }

    public static String a(String input, String str, String str2) {
        String strQuote = Pattern.quote(str);
        AbstractC3340k.d(strQuote, "quote(oldValue)");
        Pattern patternCompile = Pattern.compile(strQuote);
        AbstractC3340k.d(patternCompile, "compile(...)");
        if (str2 == null) {
            str2 = "";
        }
        AbstractC3340k.e(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll(str2);
        AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final synchronized void a(File localFile, String adIdentifier) {
        AbstractC3340k.e(adIdentifier, "adIdentifier");
        AbstractC3340k.e(localFile, "localFile");
        if (localFile.exists()) {
            ConcurrentHashMap concurrentHashMap = this.f33180d;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("file://");
            sbA.append(localFile.getAbsolutePath());
            concurrentHashMap.put(adIdentifier, sbA.toString());
        }
    }
}

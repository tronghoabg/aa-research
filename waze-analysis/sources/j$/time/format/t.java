package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t extends s {

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f49985i = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final TextStyle f49986e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49987f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f49988g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f49989h;

    public t(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.n.f50069e, j$.desugar.sun.nio.fs.h.a("ZoneText(", String.valueOf(textStyle), ")"));
        this.f49988g = new HashMap();
        this.f49989h = new HashMap();
        this.f49986e = (TextStyle) Objects.requireNonNull(textStyle, "textStyle");
        this.f49987f = z;
    }

    @Override // j$.time.format.s
    public final m a(u uVar) {
        m mVar;
        if (this.f49986e == TextStyle.NARROW) {
            return super.a(uVar);
        }
        Locale locale = uVar.f49990a.f49900b;
        boolean z = uVar.f49991b;
        Set set = j$.time.zone.g.f50116d;
        int size = set.size();
        HashMap map = z ? this.f49988g : this.f49989h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = uVar.f49991b ? new m("", null, null) : new l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap map2 = d0.f49943g;
                HashMap map3 = d0.f49940d;
                String str2 = (String) map3.get(str);
                if (str2 == null && map2.containsKey(str)) {
                    str = (String) map2.get(str);
                    str2 = (String) map3.get(str);
                }
                if (str2 != null) {
                    Map map4 = (Map) d0.f49942f.get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) d0.f49941e.get(str2) : (String) map4.get(locale.getCountry());
                }
                if (map2.containsKey(str)) {
                    str = (String) map2.get(str);
                }
                for (int i2 = this.f49986e == TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    @Override // j$.time.format.s, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.time.format.w r13, java.lang.StringBuilder r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.t.f(j$.time.format.w, java.lang.StringBuilder):boolean");
    }
}

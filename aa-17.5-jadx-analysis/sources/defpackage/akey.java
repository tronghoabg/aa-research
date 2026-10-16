package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
final class akey implements akfn, akfl {
    private static final Map a = new ConcurrentHashMap();
    private final akch b;
    private final boolean c;

    public akey(akch akchVar, boolean z) {
        this.b = akchVar;
        this.c = z;
    }

    @Override // defpackage.akfl
    public final int a() {
        return b();
    }

    @Override // defpackage.akfn
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        int iIntValue;
        Map concurrentHashMap;
        Map map = a;
        Locale locale = akfhVar.b;
        Map concurrentHashMap2 = (Map) map.get(locale);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            map.put(locale, concurrentHashMap2);
        }
        akch akchVar = this.b;
        Object[] objArr = (Object[]) concurrentHashMap2.get(akchVar);
        if (objArr == null) {
            concurrentHashMap = new ConcurrentHashMap(32);
            akct akctVar = new akct(akcl.a);
            akcf akcfVarA = akchVar.a(akctVar.b);
            if (!akcfVarA.u()) {
                throw new IllegalArgumentException("Field '" + akchVar.y + "' is not supported");
            }
            akcs akcsVar = new akcs(akctVar, akcfVarA);
            int iD = akcsVar.b.d();
            int iC = akcsVar.b.c();
            if (iC - iD <= 32) {
                iIntValue = akcsVar.b.b(locale);
                while (iD <= iC) {
                    akct akctVar2 = akcsVar.a;
                    long jH = akcsVar.b.h(akctVar2.a, iD);
                    akcd akcdVar = akctVar2.b;
                    akctVar2.a = jH;
                    concurrentHashMap.put(akcsVar.e(locale), Boolean.TRUE);
                    concurrentHashMap.put(akcsVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(akcsVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(akcsVar.f(locale), Boolean.TRUE);
                    concurrentHashMap.put(akcsVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(akcsVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                    iD++;
                }
                if ("en".equals(locale.getLanguage()) && akchVar == akch.b) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(akchVar, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            }
            return ~i;
        }
        Map map2 = (Map) objArr[0];
        iIntValue = ((Integer) objArr[1]).intValue();
        concurrentHashMap = map2;
        for (int iMin = Math.min(charSequence.length(), i + iIntValue); iMin > i; iMin--) {
            String string = charSequence.subSequence(i, iMin).toString();
            if (concurrentHashMap.containsKey(string)) {
                akff akffVarC = akfhVar.c();
                akffVarC.a = akchVar.a(akfhVar.a);
                akffVarC.b = 0;
                akffVarC.c = string;
                akffVarC.d = locale;
                return iMin;
            }
        }
        return ~i;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        try {
            akcf akcfVarA = this.b.a(akcdVar);
            appendable.append(this.c ? akcfVarA.l(j, locale) : akcfVarA.n(j, locale));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}

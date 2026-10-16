package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class s implements e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile AbstractMap.SimpleImmutableEntry f49981c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile AbstractMap.SimpleImmutableEntry f49982d;

    /* renamed from: a, reason: collision with root package name */
    public final j$.desugar.sun.nio.fs.n f49983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49984b;

    public s(j$.desugar.sun.nio.fs.n nVar, String str) {
        this.f49983a = nVar;
        this.f49984b = str;
    }

    public static int b(u uVar, CharSequence charSequence, int i2, int i3, j jVar) {
        String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
        if (i3 >= charSequence.length()) {
            uVar.e(ZoneId.of(upperCase));
            return i3;
        }
        if (charSequence.charAt(i3) == '0' || uVar.a(charSequence.charAt(i3), 'Z')) {
            uVar.e(ZoneId.of(upperCase));
            return i3;
        }
        u uVar2 = new u(uVar.f49990a);
        uVar2.f49991b = uVar.f49991b;
        uVar2.f49992c = uVar.f49992c;
        int iH = jVar.h(uVar2, charSequence, i3);
        try {
            if (iH >= 0) {
                uVar.e(ZoneId.M(upperCase, ZoneOffset.S((int) uVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iH;
            }
            if (jVar == j.f49954e) {
                return ~i2;
            }
            uVar.e(ZoneId.of(upperCase));
            return i3;
        } catch (j$.time.c unused) {
            return ~i2;
        }
    }

    public m a(u uVar) {
        Set<String> set = j$.time.zone.g.f50116d;
        int size = set.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = uVar.f49991b ? f49981c : f49982d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = uVar.f49991b ? f49981c : f49982d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        m mVar = uVar.f49991b ? new m("", null, null) : new l("", null, null);
                        for (String str : set) {
                            mVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, mVar);
                        if (uVar.f49991b) {
                            f49981c = simpleImmutableEntry;
                        } else {
                            f49982d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.e
    public boolean f(w wVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) wVar.b(this.f49983a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == length) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(uVar, charSequence, i2, i2, j.f49954e);
        }
        int i4 = i2 + 2;
        if (length >= i4) {
            char cCharAt2 = charSequence.charAt(i2 + 1);
            if (uVar.a(cCharAt, 'U') && uVar.a(cCharAt2, 'T')) {
                int i5 = i2 + 3;
                return (length < i5 || !uVar.a(charSequence.charAt(i4), 'C')) ? b(uVar, charSequence, i2, i4, j.f49955f) : b(uVar, charSequence, i2, i5, j.f49955f);
            }
            if (uVar.a(cCharAt, 'G') && length >= (i3 = i2 + 3) && uVar.a(cCharAt2, 'M') && uVar.a(charSequence.charAt(i4), 'T')) {
                int i6 = i2 + 4;
                if (length < i6 || !uVar.a(charSequence.charAt(i3), '0')) {
                    return b(uVar, charSequence, i2, i3, j.f49955f);
                }
                uVar.e(ZoneId.of("GMT0"));
                return i6;
            }
        }
        m mVarA = a(uVar);
        ParsePosition parsePosition = new ParsePosition(i2);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC != null) {
            uVar.e(ZoneId.of(strC));
            return parsePosition.getIndex();
        }
        if (!uVar.a(cCharAt, 'Z')) {
            return ~i2;
        }
        uVar.e(ZoneOffset.UTC);
        return i2 + 1;
    }

    public final String toString() {
        return this.f49984b;
    }
}

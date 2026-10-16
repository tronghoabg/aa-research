package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.m f49975a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f49976b;

    /* renamed from: c, reason: collision with root package name */
    public final z f49977c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f49978d;

    public q(j$.time.temporal.m mVar, TextStyle textStyle, z zVar) {
        this.f49975a = mVar;
        this.f49976b = textStyle;
        this.f49977c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        Long lA = wVar.a(this.f49975a);
        DateTimeFormatter dateTimeFormatter = wVar.f50000b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.f49999a.x(j$.time.temporal.n.f50066b);
        String strC = (chronology == null || chronology == j$.time.chrono.r.f49878d) ? this.f49977c.c(this.f49975a, lA.longValue(), this.f49976b, dateTimeFormatter.f49900b) : this.f49977c.b(chronology, this.f49975a, lA.longValue(), this.f49976b, dateTimeFormatter.f49900b);
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.f49978d == null) {
            this.f49978d = new i(this.f49975a, 1, 19, c0.NORMAL);
        }
        return this.f49978d.f(wVar, sb);
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        z zVar = this.f49977c;
        j$.time.temporal.m mVar = this.f49975a;
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = uVar.f49992c;
        DateTimeFormatter dateTimeFormatter = uVar.f49990a;
        TextStyle textStyle = z ? this.f49976b : null;
        Chronology chronology = uVar.c().f49925c;
        if (chronology == null && (chronology = uVar.f49990a.f49903e) == null) {
            chronology = j$.time.chrono.r.f49878d;
        }
        Chronology chronology2 = chronology;
        Iterator itE = (chronology2 == null || chronology2 == j$.time.chrono.r.f49878d) ? zVar.e(mVar, textStyle, dateTimeFormatter.f49900b) : zVar.d(chronology2, mVar, textStyle, dateTimeFormatter.f49900b);
        if (itE != null) {
            while (itE.hasNext()) {
                Map.Entry entry = (Map.Entry) itE.next();
                String str = (String) entry.getKey();
                if (uVar.g(str, 0, charSequence, i2, str.length())) {
                    return uVar.f(this.f49975a, ((Long) entry.getValue()).longValue(), i2, str.length() + i2);
                }
            }
            if (mVar == j$.time.temporal.a.ERA && !uVar.f49992c) {
                Iterator it = chronology2.eras().iterator();
                while (it.hasNext()) {
                    String string = ((j$.time.chrono.l) it.next()).toString();
                    if (uVar.g(string, 0, charSequence, i2, string.length())) {
                        return uVar.f(this.f49975a, r8.getValue(), i2, string.length() + i2);
                    }
                }
            }
            if (uVar.f49992c) {
                return ~i2;
            }
        }
        if (this.f49978d == null) {
            this.f49978d = new i(this.f49975a, 1, 19, c0.NORMAL);
        }
        return this.f49978d.h(uVar, charSequence, i2);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.f49976b;
        j$.time.temporal.m mVar = this.f49975a;
        if (textStyle2 == textStyle) {
            return j$.desugar.sun.nio.fs.h.a("Text(", String.valueOf(mVar), ")");
        }
        return "Text(" + String.valueOf(mVar) + "," + String.valueOf(textStyle2) + ")";
    }
}

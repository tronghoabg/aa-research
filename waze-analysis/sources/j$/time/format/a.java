package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f49922d;

    public a(y yVar) {
        this.f49922d = yVar;
    }

    @Override // j$.time.format.z
    public final String b(Chronology chronology, j$.time.temporal.m mVar, long j2, TextStyle textStyle, Locale locale) {
        return this.f49922d.a(j2, textStyle);
    }

    @Override // j$.time.format.z
    public final String c(j$.time.temporal.m mVar, long j2, TextStyle textStyle, Locale locale) {
        return this.f49922d.a(j2, textStyle);
    }

    @Override // j$.time.format.z
    public final Iterator d(Chronology chronology, j$.time.temporal.m mVar, TextStyle textStyle, Locale locale) {
        List list = (List) this.f49922d.f50003b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.z
    public final Iterator e(j$.time.temporal.m mVar, TextStyle textStyle, Locale locale) {
        List list = (List) this.f49922d.f50003b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}

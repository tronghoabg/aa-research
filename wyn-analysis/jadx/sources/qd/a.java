package Qd;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC3340k;
import m9.S;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f9968a = DesugarTimeZone.getTimeZone("GMT");

    public static final d a(Long l10) {
        Calendar calendar = Calendar.getInstance(f9968a, Locale.ROOT);
        AbstractC3340k.b(calendar);
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i5 = calendar.get(16) + calendar.get(15);
        int i10 = calendar.get(13);
        int i11 = calendar.get(12);
        int i12 = calendar.get(11);
        int i13 = (calendar.get(7) + 5) % 7;
        f.f9983a.getClass();
        f fVar = (f) f.f9985c.get(i13);
        int i14 = calendar.get(5);
        int i15 = calendar.get(6);
        S s10 = e.f9980a;
        int i16 = calendar.get(2);
        s10.getClass();
        return new d(i10, i11, i12, fVar, i14, i15, (e) e.f9982c.get(i16), calendar.get(1), calendar.getTimeInMillis() + i5);
    }
}

package A7;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: A7.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0281q extends D0 {

    /* renamed from: c, reason: collision with root package name */
    public long f1025c;

    /* renamed from: d, reason: collision with root package name */
    public String f1026d;

    @Override // A7.D0
    public final boolean g0() {
        Calendar calendar = Calendar.getInstance();
        this.f1025c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f1026d = N0.a.g(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long h0() {
        e0();
        return this.f1025c;
    }

    public final String i0() {
        e0();
        return this.f1026d;
    }
}

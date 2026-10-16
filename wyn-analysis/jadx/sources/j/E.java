package j;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k8.AbstractC3206o;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38375b;

    /* renamed from: c, reason: collision with root package name */
    public long f38376c;

    public long a() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return timeUnit.convert(this.f38375b ? System.nanoTime() - this.f38376c : 0L, timeUnit);
    }

    public void b() {
        Fe.e.w("This stopwatch is already running.", !this.f38375b);
        this.f38375b = true;
        this.f38376c = System.nanoTime();
    }

    public String toString() {
        String str;
        switch (this.f38374a) {
            case 1:
                long jNanoTime = this.f38375b ? System.nanoTime() - this.f38376c : 0L;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
                sb2.append(StringUtils.SPACE);
                switch (AbstractC3206o.f39312a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                sb2.append(str);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public E(boolean z2, long j8) {
        this.f38374a = 2;
        this.f38375b = z2;
        this.f38376c = j8;
    }
}

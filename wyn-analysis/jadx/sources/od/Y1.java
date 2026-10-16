package od;

import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Y1 implements InterfaceC3733w, U1, md.X, md.a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Y1 f41850b = new Y1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41851a;

    public /* synthetic */ Y1(int i5) {
        this.f41851a = i5;
    }

    public static Q e() {
        Q q4 = new Q();
        q4.f41780a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        q4.f41781b = TimeUnit.MINUTES.toNanos(2L);
        q4.f41782c = 1.6d;
        q4.f41783d = 0.2d;
        q4.f41784e = nanos;
        return q4;
    }

    @Override // md.a0
    /* renamed from: a */
    public byte[] mo429a(Object obj) {
        switch (this.f41851a) {
            case 10:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // od.InterfaceC3733w
    public int b(AbstractC3674c abstractC3674c, int i5, Object obj, int i10) {
        switch (this.f41851a) {
            case 2:
                break;
            case 3:
                abstractC3674c.D(i5);
                break;
            case 4:
                abstractC3674c.i(i10, i5, (byte[]) obj);
                break;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i5);
                abstractC3674c.w(byteBuffer);
                byteBuffer.limit(iLimit);
                break;
            default:
                abstractC3674c.o((OutputStream) obj, i5);
                break;
        }
        return 0;
    }

    @Override // od.U1
    public Object c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f41851a) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC3669a0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC3669a0.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    public long d() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // md.X
    public Object f(String str) throws NumberFormatException {
        Fe.e.p("empty timeout", str.length() > 0);
        Fe.e.p("bad timeout format", str.length() <= 9);
        long j8 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j8));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j8));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j8));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j8));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j8));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j8);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // md.a0
    public Object g(byte[] bArr) {
        switch (this.f41851a) {
            case 10:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, md.G.f40576a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // od.U1
    public void h(Object obj) {
        switch (this.f41851a) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    public String toString() {
        switch (this.f41851a) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // md.X
    public String a(Object obj) {
        Long l10 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l10.longValue() < 100000000) {
            return l10 + "n";
        }
        if (l10.longValue() < 100000000000L) {
            return timeUnit.toMicros(l10.longValue()) + "u";
        }
        if (l10.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l10.longValue()) + "m";
        }
        if (l10.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l10.longValue()) + "S";
        }
        if (l10.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l10.longValue()) + "M";
        }
        return timeUnit.toHours(l10.longValue()) + "H";
    }
}

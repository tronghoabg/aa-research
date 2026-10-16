package A7;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import md.AbstractC3541i;
import od.C3716q;

/* loaded from: classes4.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409a;

    /* renamed from: b, reason: collision with root package name */
    public final long f410b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f411c;

    public /* synthetic */ A(Object obj, long j8, int i5) {
        this.f409a = i5;
        this.f410b = j8;
        this.f411c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8 = this.f410b;
        Object obj = this.f411c;
        switch (this.f409a) {
            case 0:
                ((r) obj).l0(j8);
                break;
            case 1:
                C0259i1 c0259i1 = (C0259i1) obj;
                ((C0273n0) c0259i1.f421a).h().h0(j8);
                c0259i1.f903e = null;
                break;
            case 2:
                FlutterJNI flutterJNI = (FlutterJNI) obj;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(j8);
                    break;
                }
                break;
            default:
                N.J0 j02 = new N.J0((byte) 0, 2);
                C3716q c3716q = (C3716q) obj;
                c3716q.f42069j.i(j02);
                long jAbs = Math.abs(j8);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long nanos = jAbs / timeUnit.toNanos(1L);
                long jAbs2 = Math.abs(j8) % timeUnit.toNanos(1L);
                StringBuilder sb2 = new StringBuilder("deadline exceeded after ");
                if (j8 < 0) {
                    sb2.append('-');
                }
                sb2.append(nanos);
                Locale locale = Locale.US;
                sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
                sb2.append("s. ");
                sb2.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) c3716q.f42068i.a(AbstractC3541i.f40650a)) == null ? 0.0d : r3.longValue() / C3716q.f42059r)));
                sb2.append(j02);
                c3716q.f42069j.g(md.k0.f40677h.b(sb2.toString()));
                break;
        }
    }

    public A(long j8, FlutterJNI flutterJNI) {
        this.f409a = 2;
        this.f410b = j8;
        this.f411c = flutterJNI;
    }
}

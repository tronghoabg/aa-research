package Hd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3340k;
import wa.C4398a;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4398a f5001a = new C4398a(19);

    /* renamed from: b, reason: collision with root package name */
    public static final C4398a f5002b = new C4398a(19);

    /* renamed from: c, reason: collision with root package name */
    public static final C4398a f5003c = new C4398a(19);

    /* renamed from: d, reason: collision with root package name */
    public static final C4398a f5004d = new C4398a(19);

    /* renamed from: e, reason: collision with root package name */
    public static final C4398a f5005e = new C4398a(19);

    public static final Throwable a(Throwable th) {
        AbstractC3340k.e(th, "<this>");
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (AbstractC3340k.a(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }
}

package A3;

import A.AbstractC0213f;
import E5.Q;
import android.util.Log;
import ff.m;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;

/* loaded from: classes.dex */
public final class f extends A6.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f289b;

    /* renamed from: c, reason: collision with root package name */
    public final int f290c;

    /* renamed from: d, reason: collision with root package name */
    public final Ya.a f291d;

    public f(Object value, String str, a aVar, int i5) {
        AbstractC3340k.e(value, "value");
        AbstractC3256n.m(i5, "verificationMode");
        this.f288a = value;
        this.f289b = str;
        this.f290c = i5;
        String message = A6.h.r(value, str);
        AbstractC3340k.e(message, "message");
        Ya.a aVar2 = new Ya.a(message);
        StackTraceElement[] stackTrace = aVar2.getStackTrace();
        AbstractC3340k.d(stackTrace, "stackTrace");
        aVar2.setStackTrace((StackTraceElement[]) m.n0(2, stackTrace).toArray(new StackTraceElement[0]));
        this.f291d = aVar2;
    }

    @Override // A6.h
    public final Object m() throws Ya.a {
        int iF = AbstractC0213f.f(this.f290c);
        if (iF == 0) {
            throw this.f291d;
        }
        if (iF != 1) {
            if (iF == 2) {
                return null;
            }
            throw new Q((byte) 0, 9);
        }
        String message = A6.h.r(this.f288a, this.f289b);
        AbstractC3340k.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // A6.h
    public final A6.h I(String str, l lVar) {
        return this;
    }
}

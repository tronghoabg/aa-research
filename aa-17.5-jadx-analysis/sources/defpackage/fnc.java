package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class fnc {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final ajdr e;

    protected fnc(Context context, ajdr ajdrVar) {
        this.e = ajdrVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !affa.f(obj2, obj)) {
                this.d = obj;
                this.e.d.execute(new esx(woy.cf(this.c), this, 10, (char[]) null));
            }
        }
    }
}

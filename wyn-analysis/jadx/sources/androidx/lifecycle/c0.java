package androidx.lifecycle;

import Va.M6;
import ad.C1355I;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c0 extends ae.b {

    /* renamed from: c, reason: collision with root package name */
    public static c0 f18660c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1355I f18661d = new C1355I(1);

    /* renamed from: b, reason: collision with root package name */
    public final Application f18662b;

    public c0(Application application) {
        this.f18662b = application;
    }

    public final b0 g(Class cls, Application application) {
        if (!AbstractC1437a.class.isAssignableFrom(cls)) {
            return super.p(cls);
        }
        try {
            b0 b0Var = (b0) cls.getConstructor(Application.class).newInstance(application);
            AbstractC3340k.d(b0Var, "{\n                try {\n…          }\n            }");
            return b0Var;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(M6.n(cls, "Cannot create an instance of "), e12);
        }
    }

    @Override // ae.b, androidx.lifecycle.d0
    public final b0 j(Class cls, H1.c cVar) {
        if (this.f18662b != null) {
            return p(cls);
        }
        Application application = (Application) cVar.f4871a.get(f18661d);
        if (application != null) {
            return g(cls, application);
        }
        if (AbstractC1437a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.p(cls);
    }

    @Override // ae.b, androidx.lifecycle.d0
    public final b0 p(Class cls) {
        Application application = this.f18662b;
        if (application != null) {
            return g(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}

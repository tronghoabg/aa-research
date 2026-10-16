package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class erp extends err {
    public static erp a;
    public static final esb b = new erf(3);
    private final Application d;

    public erp(Application application) {
        this.d = application;
    }

    private static final erm d(Class cls, Application application) {
        if (!eoy.class.isAssignableFrom(cls)) {
            return eqy.d(cls);
        }
        try {
            erm ermVar = (erm) cls.getConstructor(Application.class).newInstance(application);
            ermVar.getClass();
            return ermVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.err, defpackage.erq
    public final erm a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.err, defpackage.erq
    public final erm b(Class cls, esc escVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) escVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (eoy.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return eqy.d(cls);
    }
}

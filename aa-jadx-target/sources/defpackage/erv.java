package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erv extends defpackage.erx {
    public static defpackage.erv a;
    public static final defpackage.esh b = new defpackage.erl(3);
    private final android.app.Application d;

    public erv(android.app.Application application) {
        this.d = application;
    }

    private static final defpackage.ers d(java.lang.Class cls, android.app.Application application) {
        if (!epe.class.isAssignableFrom(cls)) {
            return defpackage.ebl.k(cls);
        }
        try {
            defpackage.ers ersVar = (defpackage.ers) cls.getConstructor(android.app.Application.class).newInstance(application);
            ersVar.getClass();
            return ersVar;
        } catch (java.lang.IllegalAccessException e) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (java.lang.InstantiationException e2) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.erx, defpackage.erw
    public final defpackage.ers a(java.lang.Class cls) {
        android.app.Application application = this.d;
        if (application != null) {
            return d(cls, application);
        }
        throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.erx, defpackage.erw
    public final defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        if (this.d != null) {
            return a(cls);
        }
        android.app.Application application = (android.app.Application) esiVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (epe.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return defpackage.ebl.k(cls);
    }
}

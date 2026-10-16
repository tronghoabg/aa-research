package v3;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x.C4412e;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4298a {

    /* renamed from: a, reason: collision with root package name */
    public final C4412e f46799a;

    /* renamed from: b, reason: collision with root package name */
    public final C4412e f46800b;

    /* renamed from: c, reason: collision with root package name */
    public final C4412e f46801c;

    public AbstractC4298a(C4412e c4412e, C4412e c4412e2, C4412e c4412e3) {
        this.f46799a = c4412e;
        this.f46800b = c4412e2;
        this.f46801c = c4412e3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C4412e c4412e = this.f46801c;
        Class cls2 = (Class) c4412e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c4412e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        C4412e c4412e = this.f46799a;
        Method method = (Method) c4412e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC4298a.class.getClassLoader()).getDeclaredMethod("read", AbstractC4298a.class);
        c4412e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C4412e c4412e = this.f46800b;
        Method method = (Method) c4412e.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, AbstractC4298a.class);
        c4412e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i5);

    public final int f(int i5, int i10) {
        return !e(i10) ? i5 : ((b) this).f46803e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i5) {
        if (!e(i5)) {
            return parcelable;
        }
        return ((b) this).f46803e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).f46803e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i5);

    public final void j(int i5, int i10) {
        i(i10);
        ((b) this).f46803e.writeInt(i5);
    }

    public final void k(Parcelable parcelable, int i5) {
        i(i5);
        ((b) this).f46803e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cVar == null) {
            ((b) this).f46803e.writeString(null);
            return;
        }
        try {
            ((b) this).f46803e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                int i5 = bVarA.f46807i;
                if (i5 >= 0) {
                    int i10 = bVarA.f46802d.get(i5);
                    Parcel parcel = bVarA.f46803e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(iDataPosition - i10);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}

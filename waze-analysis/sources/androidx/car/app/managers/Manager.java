package androidx.car.app.managers;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Manager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.managers.Manager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <U extends Manager> U create(Class<U> cls, String str, Object... objArr) throws ClassNotFoundException {
            try {
                Class<?> cls2 = Class.forName(str);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    clsArr[i2] = objArr[i2].getClass();
                }
                return cls.cast(cls2.getConstructor(clsArr).newInstance(objArr));
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (ReflectiveOperationException e2) {
                throw new IllegalStateException("Mismatch with artifact", e2);
            }
        }
    }
}

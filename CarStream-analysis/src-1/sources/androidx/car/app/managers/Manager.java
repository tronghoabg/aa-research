package androidx.car.app.managers;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface Manager {
    static <U extends Manager> U create(Class<U> cls, String str, Object... objArr) throws ClassNotFoundException {
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            return cls.cast(cls2.getConstructor(clsArr).newInstance(objArr));
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Mismatch with artifact", e);
        }
    }
}

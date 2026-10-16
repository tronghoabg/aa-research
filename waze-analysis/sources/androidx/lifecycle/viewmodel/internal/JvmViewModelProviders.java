package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import h.g.b.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class JvmViewModelProviders {
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    public final <T extends ViewModel> T createViewModel(Class<T> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x.f(cls, "modelClass");
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)));
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                x.c(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            }
        } catch (NoSuchMethodException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
        }
    }
}

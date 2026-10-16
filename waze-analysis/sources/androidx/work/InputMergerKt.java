package androidx.work;

import h.g.b.x;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class InputMergerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("InputMerger");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    public static final InputMerger fromClassName(String str) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        x.f(str, "className");
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            x.d(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) objNewInstance;
        } catch (Exception e2) {
            Logger.get().error(TAG, "Trouble instantiating ".concat(String.valueOf(str)), e2);
            return null;
        }
    }
}

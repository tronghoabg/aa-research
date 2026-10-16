package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.MutableIntObjectMap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ResourceIdCache {
    public static final int $stable = 8;
    private final MutableIntObjectMap<TypedValue> resIdPathMap = new MutableIntObjectMap<>(0, 1, null);

    public final void clear() {
        synchronized (this) {
            this.resIdPathMap.clear();
        }
    }

    public final TypedValue resolveResourcePath(Resources resources, int i2) {
        TypedValue typedValue;
        synchronized (this) {
            typedValue = this.resIdPathMap.get(i2);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                this.resIdPathMap.put(i2, typedValue);
            }
        }
        return typedValue;
    }
}

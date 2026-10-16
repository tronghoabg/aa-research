package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hsk extends hsi {
    public hsk(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls.toString() + " and data: " + cls2.toString());
    }

    public hsk(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public hsk(Object obj, List list) {
        super(a.bL(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}

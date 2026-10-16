package androidx.camera.core.impl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class Identifier {
    public static Identifier create(Object obj) {
        return new AutoValue_Identifier(obj);
    }

    public abstract Object getValue();
}

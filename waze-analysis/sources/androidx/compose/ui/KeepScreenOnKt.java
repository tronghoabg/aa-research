package androidx.compose.ui;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class KeepScreenOnKt {
    public static final Modifier keepScreenOn(Modifier modifier) {
        return modifier.then(KeepScreenOnElement.INSTANCE);
    }
}

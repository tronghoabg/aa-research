package androidx.compose.ui;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZIndexModifierKt {
    public static final Modifier zIndex(Modifier modifier, float f2) {
        return modifier.then(new ZIndexElement(f2));
    }
}

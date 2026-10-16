package androidx.compose.ui;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z) {
        return modifier.then(new SensitiveNodeElement(z));
    }
}

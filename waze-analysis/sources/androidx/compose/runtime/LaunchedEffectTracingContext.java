package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LaunchedEffectTracingContext extends TracingContext {
    public static final LaunchedEffectTracingContext INSTANCE = new LaunchedEffectTracingContext();

    private LaunchedEffectTracingContext() {
        super("Compose:LaunchedEffect");
    }
}

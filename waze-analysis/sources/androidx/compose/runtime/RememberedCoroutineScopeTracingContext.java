package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RememberedCoroutineScopeTracingContext extends TracingContext {
    public static final RememberedCoroutineScopeTracingContext INSTANCE = new RememberedCoroutineScopeTracingContext();

    private RememberedCoroutineScopeTracingContext() {
        super("Compose:coroutineScope");
    }
}

package androidx.compose.runtime.retain;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RetainedValuesStore {
    Object consumeExitedValueOrDefault(Object obj, Object obj2);

    void onContentEnteredComposition();

    void onContentExitComposition();

    void saveExitingValue(Object obj, Object obj2);
}

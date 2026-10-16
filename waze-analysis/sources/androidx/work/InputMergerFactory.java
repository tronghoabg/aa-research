package androidx.work;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class InputMergerFactory {
    public abstract InputMerger createInputMerger(String str);

    public final InputMerger createInputMergerWithDefaultFallback(String str) {
        x.f(str, "className");
        InputMerger inputMergerCreateInputMerger = createInputMerger(str);
        return inputMergerCreateInputMerger == null ? InputMergerKt.fromClassName(str) : inputMergerCreateInputMerger;
    }
}

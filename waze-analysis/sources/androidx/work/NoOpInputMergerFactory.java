package androidx.work;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NoOpInputMergerFactory extends InputMergerFactory {
    public static final NoOpInputMergerFactory INSTANCE = new NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    @Override // androidx.work.InputMergerFactory
    public /* bridge */ /* synthetic */ InputMerger createInputMerger(String str) {
        m13463createInputMerger(str);
        return null;
    }

    /* renamed from: createInputMerger, reason: collision with other method in class */
    public Void m13463createInputMerger(String str) {
        x.f(str, "className");
        return null;
    }
}

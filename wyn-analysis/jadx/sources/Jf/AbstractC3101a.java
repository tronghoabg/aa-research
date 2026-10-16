package jf;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* renamed from: jf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3101a implements InterfaceC3106f {

    @NotNull
    private final InterfaceC3107g key;

    public AbstractC3101a(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        this.key = key;
    }

    @Override // jf.InterfaceC3108h
    public /* bridge */ <R> R fold(R r10, @NotNull p pVar) {
        return (R) Fe.e.B(this, r10, pVar);
    }

    @Override // jf.InterfaceC3108h
    @Nullable
    public /* bridge */ <E extends InterfaceC3106f> E get(@NotNull InterfaceC3107g interfaceC3107g) {
        return (E) Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    @NotNull
    public InterfaceC3107g getKey() {
        return this.key;
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public /* bridge */ InterfaceC3108h minusKey(@NotNull InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public /* bridge */ InterfaceC3108h plus(@NotNull InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }
}

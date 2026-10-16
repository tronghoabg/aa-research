package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3343n implements InterfaceC3336g, Serializable {
    private final int arity;

    public AbstractC3343n(int i5) {
        this.arity = i5;
    }

    @Override // kotlin.jvm.internal.InterfaceC3336g
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strRenderLambdaToString = H.f39741a.renderLambdaToString(this);
        AbstractC3340k.d(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}

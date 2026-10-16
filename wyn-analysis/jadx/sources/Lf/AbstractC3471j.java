package lf;

import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.InterfaceC3336g;
import org.jetbrains.annotations.NotNull;

/* renamed from: lf.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3471j extends AbstractC3464c implements InterfaceC3336g {
    private final int arity;

    public AbstractC3471j(int i5, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.arity = i5;
    }

    @Override // kotlin.jvm.internal.InterfaceC3336g
    public int getArity() {
        return this.arity;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = H.f39741a.renderLambdaToString(this);
        AbstractC3340k.d(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}

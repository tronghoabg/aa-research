package M0;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.AbstractC4162a;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: t, reason: collision with root package name */
    public View f7282t;

    /* renamed from: u, reason: collision with root package name */
    public tf.l f7283u;

    /* renamed from: v, reason: collision with root package name */
    public tf.l f7284v;

    @Nullable
    public final tf.l getFactory() {
        return this.f7283u;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractC4162a getSubCompositionView() {
        return null;
    }

    @Nullable
    public final View getTypedView$ui_release() {
        return this.f7282t;
    }

    @NotNull
    public final tf.l getUpdateBlock() {
        return this.f7284v;
    }

    public final void setFactory(@Nullable tf.l lVar) {
        this.f7283u = lVar;
        if (lVar != null) {
            Context context = getContext();
            AbstractC3340k.d(context, "context");
            View view = (View) lVar.invoke(context);
            this.f7282t = view;
            setView$ui_release(view);
        }
    }

    public final void setTypedView$ui_release(@Nullable View view) {
        this.f7282t = view;
    }

    public final void setUpdateBlock(@NotNull tf.l value) {
        AbstractC3340k.e(value, "value");
        this.f7284v = value;
        setUpdate(new f(this, 1));
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }
}

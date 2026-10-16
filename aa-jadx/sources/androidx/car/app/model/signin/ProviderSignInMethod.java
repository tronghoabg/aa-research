package androidx.car.app.model.signin;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ProviderSignInMethod implements defpackage.ww {
    private final androidx.car.app.model.Action mAction;

    public ProviderSignInMethod(androidx.car.app.model.Action action) {
        action.getClass();
        if (action.getType() != 1) {
            throw new java.lang.IllegalArgumentException("The action must not be a standard action");
        }
        defpackage.uv onClickDelegate = action.getOnClickDelegate();
        onClickDelegate.getClass();
        if (!onClickDelegate.isParkedOnly()) {
            throw new java.lang.IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.signin.ProviderSignInMethod) {
            return j$.util.Objects.equals(this.mAction, ((androidx.car.app.model.signin.ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public androidx.car.app.model.Action getAction() {
        androidx.car.app.model.Action action = this.mAction;
        action.getClass();
        return action;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mAction);
    }

    public java.lang.String toString() {
        return "[action:" + this.mAction + "]";
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}

package androidx.car.app.model.signin;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.OnClickDelegate;
import androidx.car.app.model.signin.SignInTemplate;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public final class ProviderSignInMethod implements SignInTemplate.SignInMethod {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        if (((Action) Objects.requireNonNull(action)).getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        if (!((OnClickDelegate) Objects.requireNonNull(action.getOnClickDelegate())).isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        return (Action) Objects.requireNonNull(this.mAction);
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}

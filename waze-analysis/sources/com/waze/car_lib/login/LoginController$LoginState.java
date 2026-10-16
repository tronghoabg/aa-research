package com.waze.car_lib.login;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class LoginController$LoginState {
    private final i state;

    public LoginController$LoginState(i iVar) {
        x.f(iVar, "state");
        this.state = iVar;
    }

    public static /* synthetic */ LoginController$LoginState copy$default(LoginController$LoginState loginController$LoginState, i iVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = loginController$LoginState.state;
        }
        return loginController$LoginState.copy(iVar);
    }

    public final i component1() {
        return this.state;
    }

    public final LoginController$LoginState copy(i iVar) {
        x.f(iVar, "state");
        return new LoginController$LoginState(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoginController$LoginState) && x.n(this.state, ((LoginController$LoginState) obj).state);
    }

    public final boolean getAreCredentialsMissing() {
        return this.state instanceof d;
    }

    public final boolean getForceVersionUpgrade() {
        return this.state instanceof h;
    }

    public final i getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public final boolean isLoggedIn() {
        return this.state instanceof e;
    }

    public String toString() {
        return "LoginState(state=" + this.state + ")";
    }
}

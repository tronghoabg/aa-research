package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ActionStrip {
    private final java.util.List<androidx.car.app.model.Action> mActions;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public ActionStrip(defpackage.tc tcVar) {
        this.mActions = defpackage.tq.b(tcVar.a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ActionStrip) {
            return j$.util.Objects.equals(this.mActions, ((androidx.car.app.model.ActionStrip) obj).mActions);
        }
        return false;
    }

    public java.util.List<androidx.car.app.model.Action> getActions() {
        return defpackage.tq.a(this.mActions);
    }

    public androidx.car.app.model.Action getFirstActionOfType(int i) {
        for (androidx.car.app.model.Action action : this.mActions) {
            if (action instanceof androidx.car.app.model.Action) {
                androidx.car.app.model.Action action2 = action;
                if (action2.getType() == i) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mActions);
    }

    public java.lang.String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    private ActionStrip() {
        this.mActions = java.util.Collections.EMPTY_LIST;
    }
}

package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final java.util.List<androidx.car.app.model.Action> mActions;
    private final defpackage.tf mCallbackDelegate;
    private final long mDuration;
    private final androidx.car.app.model.CarIcon mIcon;
    private final int mId;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    Alert(defpackage.td tdVar) {
        int i = tdVar.a;
        this.mId = 0;
        java.lang.Object obj = tdVar.c;
        this.mTitle = null;
        java.lang.Object obj2 = tdVar.d;
        this.mSubtitle = null;
        java.lang.Object obj3 = tdVar.e;
        this.mIcon = null;
        java.lang.Object obj4 = tdVar.f;
        this.mActions = defpackage.tq.b(null);
        long j = tdVar.b;
        this.mDuration = 0L;
        java.lang.Object obj5 = tdVar.g;
        this.mCallbackDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.car.app.model.Alert) && this.mId == ((androidx.car.app.model.Alert) obj).mId;
    }

    public java.util.List<androidx.car.app.model.Action> getActions() {
        return this.mActions;
    }

    public defpackage.tf getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mId));
    }

    public java.lang.String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + "]";
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new java.util.ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}

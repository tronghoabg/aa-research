package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final defpackage.ut mOnCheckedChangeDelegate;

    public Toggle(defpackage.wj wjVar) {
        this.mIsChecked = wjVar.b;
        this.mIsEnabled = wjVar.c;
        this.mOnCheckedChangeDelegate = wjVar.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Toggle)) {
            return false;
        }
        androidx.car.app.model.Toggle toggle = (androidx.car.app.model.Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public defpackage.ut getOnCheckedChangeDelegate() {
        defpackage.ut utVar = this.mOnCheckedChangeDelegate;
        utVar.getClass();
        return utVar;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.mIsChecked), java.lang.Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public java.lang.String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + "]";
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}

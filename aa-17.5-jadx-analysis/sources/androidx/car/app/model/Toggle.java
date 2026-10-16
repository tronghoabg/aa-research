package androidx.car.app.model;

import defpackage.rb;
import defpackage.uo;
import defpackage.wc;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final uo mOnCheckedChangeDelegate;

    public Toggle(wc wcVar) {
        this.mIsChecked = wcVar.b;
        this.mIsEnabled = wcVar.c;
        this.mOnCheckedChangeDelegate = wcVar.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public uo getOnCheckedChangeDelegate() {
        uo uoVar = this.mOnCheckedChangeDelegate;
        uoVar.getClass();
        return uoVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        return "[ isChecked: " + this.mIsChecked + ", isEnabled: " + this.mIsEnabled + "]";
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}

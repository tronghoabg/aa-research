package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final OnCheckedChangeDelegate mOnCheckedChangeDelegate;

    /* compiled from: WazeSource */
    public final class Builder {
        boolean mIsChecked;
        boolean mIsEnabled = true;
        OnCheckedChangeDelegate mOnCheckedChangeDelegate;

        public Builder(OnCheckedChangeListener onCheckedChangeListener) {
            this.mOnCheckedChangeDelegate = OnCheckedChangeDelegateImpl.create(onCheckedChangeListener);
        }

        public Toggle build() {
            return new Toggle(this);
        }

        public Builder setChecked(boolean z) {
            this.mIsChecked = z;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setEnabled(boolean z) {
            this.mIsEnabled = z;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public interface OnCheckedChangeListener {
        void onCheckedChange(boolean z);
    }

    Toggle(Builder builder) {
        this.mIsChecked = builder.mIsChecked;
        this.mIsEnabled = builder.mIsEnabled;
        this.mOnCheckedChangeDelegate = builder.mOnCheckedChangeDelegate;
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

    public OnCheckedChangeDelegate getOnCheckedChangeDelegate() {
        return (OnCheckedChangeDelegate) Objects.requireNonNull(this.mOnCheckedChangeDelegate);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    @RequiresCarApi(5)
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

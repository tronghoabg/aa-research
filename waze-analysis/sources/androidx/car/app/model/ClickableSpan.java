package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public final class ClickableSpan extends CarSpan {
    private final OnClickDelegate mOnClickDelegate;

    private ClickableSpan(OnClickListener onClickListener) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
    }

    public static ClickableSpan create(OnClickListener onClickListener) {
        return new ClickableSpan((OnClickListener) Objects.requireNonNull(onClickListener));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public OnClickDelegate getOnClickDelegate() {
        return (OnClickDelegate) Objects.requireNonNull(this.mOnClickDelegate);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}

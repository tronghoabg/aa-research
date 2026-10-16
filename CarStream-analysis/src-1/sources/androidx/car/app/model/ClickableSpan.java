package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(2)
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final OnClickDelegate mOnClickDelegate;

    private ClickableSpan(OnClickListener onClickListener) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
    }

    public static ClickableSpan create(OnClickListener onClickListener) {
        Objects.requireNonNull(onClickListener);
        return new ClickableSpan(onClickListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public OnClickDelegate getOnClickDelegate() {
        OnClickDelegate onClickDelegate = this.mOnClickDelegate;
        Objects.requireNonNull(onClickDelegate);
        return onClickDelegate;
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

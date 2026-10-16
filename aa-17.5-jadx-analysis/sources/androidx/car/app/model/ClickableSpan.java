package androidx.car.app.model;

import defpackage.rb;
import defpackage.uq;
import defpackage.us;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class ClickableSpan extends CarSpan {
    private final uq mOnClickDelegate;

    private ClickableSpan(us usVar) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(usVar);
    }

    public static ClickableSpan create(us usVar) {
        usVar.getClass();
        return new ClickableSpan(usVar);
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

    public uq getOnClickDelegate() {
        uq uqVar = this.mOnClickDelegate;
        uqVar.getClass();
        return uqVar;
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

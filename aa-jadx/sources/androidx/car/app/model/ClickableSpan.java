package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ClickableSpan extends androidx.car.app.model.CarSpan {
    private final defpackage.uv mOnClickDelegate;

    private ClickableSpan(defpackage.ux uxVar) {
        this.mOnClickDelegate = androidx.car.app.model.OnClickDelegateImpl.create(uxVar);
    }

    public static androidx.car.app.model.ClickableSpan create(defpackage.ux uxVar) {
        uxVar.getClass();
        return new androidx.car.app.model.ClickableSpan(uxVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.ClickableSpan)) {
            return false;
        }
        return j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(((androidx.car.app.model.ClickableSpan) obj).mOnClickDelegate == null));
    }

    public defpackage.uv getOnClickDelegate() {
        defpackage.uv uvVar = this.mOnClickDelegate;
        uvVar.getClass();
        return uvVar;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public java.lang.String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}

package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.ul;
import defpackage.wb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class LongMessageTemplate implements wb {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final CarText mMessage;
    private final CarText mTitle;

    LongMessageTemplate(ul ulVar) {
        Object obj = ulVar.a;
        this.mTitle = null;
        Object obj2 = ulVar.b;
        this.mMessage = null;
        Object obj3 = ulVar.c;
        this.mActionStrip = null;
        Object obj4 = ulVar.d;
        this.mHeaderAction = null;
        Object obj5 = ulVar.e;
        this.mActionList = tl.b(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongMessageTemplate)) {
            return false;
        }
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
        return Objects.equals(this.mTitle, longMessageTemplate.mTitle) && Objects.equals(this.mMessage, longMessageTemplate.mMessage) && Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && Objects.equals(this.mActionList, longMessageTemplate.mActionList) && Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return tl.a(this.mActionList);
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        carText.getClass();
        return carText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mMessage, this.mHeaderAction, this.mActionList, this.mActionStrip);
    }

    public String toString() {
        return "LongMessageTemplate";
    }

    private LongMessageTemplate() {
        this.mTitle = null;
        this.mMessage = null;
        this.mActionStrip = null;
        this.mHeaderAction = null;
        this.mActionList = Collections.EMPTY_LIST;
    }
}

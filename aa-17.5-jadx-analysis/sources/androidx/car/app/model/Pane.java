package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.va;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class Pane {
    private final List<Action> mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List<Row> mRows;

    Pane(va vaVar) {
        List list = vaVar.a;
        this.mRows = tl.b(null);
        List list2 = vaVar.b;
        this.mActionList = tl.b(null);
        CarIcon carIcon = vaVar.d;
        this.mImage = null;
        boolean z = vaVar.c;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public List<Action> getActions() {
        return tl.a(this.mActionList);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public List<Row> getRows() {
        return tl.a(this.mRows);
    }

    public int hashCode() {
        return Objects.hash(this.mRows, this.mActionList, Boolean.valueOf(this.mIsLoading), this.mImage);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ rows: ");
        List<Row> list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append("]");
        return sb.toString();
    }

    private Pane() {
        this.mRows = Collections.EMPTY_LIST;
        this.mActionList = Collections.EMPTY_LIST;
        this.mIsLoading = false;
        this.mImage = null;
    }
}

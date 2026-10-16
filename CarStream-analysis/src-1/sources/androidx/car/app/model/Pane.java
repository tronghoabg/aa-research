package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Pane {
    private final List<Action> mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List<Row> mRows;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarIcon mImage;
        boolean mIsLoading;
        final List<Row> mRows = new ArrayList();
        List<Action> mActionList = new ArrayList();

        private int size() {
            return this.mRows.size();
        }

        public Builder addAction(Action action) {
            Objects.requireNonNull(action);
            this.mActionList.add(action);
            return this;
        }

        public Builder addRow(Row row) {
            List<Row> list = this.mRows;
            Objects.requireNonNull(row);
            list.add(row);
            return this;
        }

        public Pane build() {
            if ((size() > 0) != this.mIsLoading) {
                return new Pane(this);
            }
            throw new IllegalStateException("The pane is set to loading but is not empty, or vice versa");
        }

        @RequiresCarApi(4)
        public Builder setImage(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            this.mImage = carIcon;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }
    }

    public Pane(Builder builder) {
        this.mRows = CollectionUtils.unmodifiableCopy(builder.mRows);
        this.mActionList = CollectionUtils.unmodifiableCopy(builder.mActionList);
        this.mImage = builder.mImage;
        this.mIsLoading = builder.mIsLoading;
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
        return CollectionUtils.emptyIfNull(this.mActionList);
    }

    @RequiresCarApi(4)
    public CarIcon getImage() {
        return this.mImage;
    }

    public List<Row> getRows() {
        return CollectionUtils.emptyIfNull(this.mRows);
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
        List list = Collections.EMPTY_LIST;
        this.mRows = list;
        this.mActionList = list;
        this.mIsLoading = false;
        this.mImage = null;
    }
}

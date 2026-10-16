package androidx.camera.core;

import androidx.core.util.Preconditions;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FocusMeteringAction {
    public static final long DEFAULT_AUTO_CANCEL_DURATION_MILLIS = 5000;
    static final int DEFAULT_LOCKING_MODE = 1;
    static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final int mLockingMode;
    private final List<MeteringPoint> mMeteringPointsAe;
    private final List<MeteringPoint> mMeteringPointsAf;
    private final List<MeteringPoint> mMeteringPointsAwb;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MeteringMode {
    }

    FocusMeteringAction(Builder builder) {
        this.mMeteringPointsAf = DesugarCollections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = DesugarCollections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = DesugarCollections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
        this.mLockingMode = builder.mLockingMode;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    public int getLockingMode() {
        return this.mLockingMode;
    }

    public List<MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    public List<MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }

    /* compiled from: WazeSource */
    public class Builder {
        long mAutoCancelDurationInMillis;
        int mLockingMode;
        final List<MeteringPoint> mMeteringPointsAe;
        final List<MeteringPoint> mMeteringPointsAf;
        final List<MeteringPoint> mMeteringPointsAwb;

        public Builder(FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.mMeteringPointsAf = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.mMeteringPointsAe = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.mMeteringPointsAwb = arrayList3;
            this.mAutoCancelDurationInMillis = 5000L;
            this.mLockingMode = 1;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.mAutoCancelDurationInMillis = focusMeteringAction.getAutoCancelDurationInMillis();
            this.mLockingMode = focusMeteringAction.getLockingMode();
        }

        public Builder addPoint(MeteringPoint meteringPoint, int i2) {
            Preconditions.checkArgument(meteringPoint != null, "Point cannot be null.");
            Preconditions.checkArgument(i2 > 0 && i2 <= 7, "Invalid metering mode " + i2);
            if ((i2 & 1) != 0) {
                this.mMeteringPointsAf.add(meteringPoint);
            }
            if ((i2 & 2) != 0) {
                this.mMeteringPointsAe.add(meteringPoint);
            }
            if ((i2 & 4) != 0) {
                this.mMeteringPointsAwb.add(meteringPoint);
            }
            return this;
        }

        public FocusMeteringAction build() {
            return new FocusMeteringAction(this);
        }

        public Builder disableAutoCancel() {
            this.mAutoCancelDurationInMillis = 0L;
            return this;
        }

        public Builder removePoints(int i2) {
            if ((i2 & 1) != 0) {
                this.mMeteringPointsAf.clear();
            }
            if ((i2 & 2) != 0) {
                this.mMeteringPointsAe.clear();
            }
            if ((i2 & 4) != 0) {
                this.mMeteringPointsAwb.clear();
            }
            return this;
        }

        public Builder setAutoCancelDuration(long j2, TimeUnit timeUnit) {
            Preconditions.checkArgument(j2 >= 1, "autoCancelDuration must be at least 1");
            this.mAutoCancelDurationInMillis = timeUnit.toMillis(j2);
            return this;
        }

        public Builder setLockingMode(int i2) {
            boolean z = false;
            if (i2 >= 0 && i2 <= 7) {
                z = true;
            }
            Preconditions.checkArgument(z, "Invalid locking mode " + i2);
            this.mLockingMode = i2;
            return this;
        }

        public Builder addPoint(MeteringPoint meteringPoint) {
            return addPoint(meteringPoint, 7);
        }

        public Builder(MeteringPoint meteringPoint) {
            this(meteringPoint, 7);
        }

        public Builder(MeteringPoint meteringPoint, int i2) {
            this.mMeteringPointsAf = new ArrayList();
            this.mMeteringPointsAe = new ArrayList();
            this.mMeteringPointsAwb = new ArrayList();
            this.mAutoCancelDurationInMillis = 5000L;
            this.mLockingMode = 1;
            addPoint(meteringPoint, i2);
        }
    }
}

package androidx.compose.ui.autofill;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FillableData {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.autofill.FillableData$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Boolean $default$getBooleanValue(FillableData fillableData) {
            return null;
        }

        public static long $default$getDateMillisOrDefault(FillableData fillableData, long j2) {
            Long dateMillisValue = fillableData.getDateMillisValue();
            return dateMillisValue != null ? dateMillisValue.longValue() : j2;
        }

        public static Long $default$getDateMillisValue(FillableData fillableData) {
            return null;
        }

        public static int $default$getListIndexOrDefault(FillableData fillableData, int i2) {
            Integer listIndexValue = fillableData.getListIndexValue();
            return listIndexValue != null ? listIndexValue.intValue() : i2;
        }

        public static Integer $default$getListIndexValue(FillableData fillableData) {
            return null;
        }

        public static CharSequence $default$getTextValue(FillableData fillableData) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Boolean getBooleanValue();

    long getDateMillisOrDefault(long j2);

    Long getDateMillisValue();

    int getListIndexOrDefault(int i2);

    Integer getListIndexValue();

    CharSequence getTextValue();
}

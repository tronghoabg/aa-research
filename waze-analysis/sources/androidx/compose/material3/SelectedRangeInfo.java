package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    private SelectedRangeInfo(long j2, long j3, boolean z, boolean z2) {
        this.gridStartCoordinates = j2;
        this.gridEndCoordinates = j3;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m5536getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m5537getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            if (calendarDate.getUtcTimeMillis() > calendarMonth.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < calendarMonth.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
            boolean z2 = calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis();
            int daysFromStartOfWeekToFirstOfMonth = z ? (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate.getDayOfMonth()) - 1 : calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
            int daysFromStartOfWeekToFirstOfMonth2 = z2 ? (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarDate2.getDayOfMonth()) - 1 : (calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) - 1;
            return new SelectedRangeInfo(((daysFromStartOfWeekToFirstOfMonth % 7) << 32) | ((daysFromStartOfWeekToFirstOfMonth / 7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), ((daysFromStartOfWeekToFirstOfMonth2 % 7) << 32) | ((daysFromStartOfWeekToFirstOfMonth2 / 7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), z, z2, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j2, long j3, boolean z, boolean z2, o oVar) {
        this(j2, j3, z, z2);
    }
}

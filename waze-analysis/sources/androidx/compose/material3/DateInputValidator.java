package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final j yearRange;

    public DateInputValidator(j jVar, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.yearRange = jVar;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
    }

    public final Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    public final Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentEndDateMillis(Long l2) {
        this.currentEndDateMillis = l2;
    }

    public final void setCurrentStartDateMillis(Long l2) {
        this.currentStartDateMillis = l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m4643validateXivgLIo(androidx.compose.material3.internal.CalendarDate r10, int r11, java.util.Locale r12) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            if (r10 != 0) goto L20
            java.lang.String r10 = r9.errorDatePattern
            androidx.compose.material3.internal.DateInputFormat r9 = r9.dateInputFormat
            java.lang.String r9 = r9.getPatternWithDelimiters()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r11)
            java.lang.String r11 = "toUpperCase(...)"
            h.g.b.x.e(r9, r11)
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r0] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r10, r11)
            return r9
        L20:
            h.k.j r2 = r9.yearRange
            int r3 = r10.getYear()
            boolean r2 = r2.g(r3)
            if (r2 != 0) goto L54
            java.lang.String r10 = r9.errorDateOutOfYearRange
            h.k.j r11 = r9.yearRange
            int r2 = r11.a()
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r12
            java.lang.String r11 = androidx.compose.material3.CalendarLocale_jvmAndAndroidKt.toLocalString$default(r2, r3, r4, r5, r6, r7, r8)
            h.k.j r9 = r9.yearRange
            int r2 = r9.b()
            java.lang.String r9 = androidx.compose.material3.CalendarLocale_jvmAndAndroidKt.toLocalString$default(r2, r3, r4, r5, r6, r7, r8)
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r0] = r11
            r12[r1] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r10, r12)
            return r9
        L54:
            r6 = r12
            androidx.compose.material3.SelectableDates r12 = r9.selectableDates
            int r2 = r10.getYear()
            boolean r2 = r12.isSelectableYear(r2)
            if (r2 == 0) goto Lb3
            long r2 = r10.getUtcTimeMillis()
            boolean r12 = r12.isSelectableDate(r2)
            if (r12 != 0) goto L6c
            goto Lb3
        L6c:
            androidx.compose.material3.InputIdentifier$Companion r12 = androidx.compose.material3.InputIdentifier.Companion
            int r12 = r12.m5075getStartDateInputJ2x2o4M()
            boolean r12 = androidx.compose.material3.InputIdentifier.m5069equalsimpl0(r11, r12)
            if (r12 == 0) goto L8e
            long r0 = r10.getUtcTimeMillis()
            java.lang.Long r12 = r9.currentEndDateMillis
            if (r12 == 0) goto L85
            long r2 = r12.longValue()
            goto L8a
        L85:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L8a:
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 > 0) goto Lad
        L8e:
            androidx.compose.material3.InputIdentifier$Companion r12 = androidx.compose.material3.InputIdentifier.Companion
            int r12 = r12.m5073getEndDateInputJ2x2o4M()
            boolean r11 = androidx.compose.material3.InputIdentifier.m5069equalsimpl0(r11, r12)
            if (r11 == 0) goto Lb0
            long r10 = r10.getUtcTimeMillis()
            java.lang.Long r12 = r9.currentStartDateMillis
            if (r12 == 0) goto La7
            long r0 = r12.longValue()
            goto La9
        La7:
            r0 = -9223372036854775808
        La9:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto Lb0
        Lad:
            java.lang.String r9 = r9.errorInvalidRangeInput
            return r9
        Lb0:
            java.lang.String r9 = ""
            return r9
        Lb3:
            java.lang.String r11 = r9.errorInvalidNotAllowed
            androidx.compose.material3.DatePickerFormatter r2 = r9.dateFormatter
            long r9 = r10.getUtcTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r4 = r6
            r6 = 4
            r7 = 0
            r5 = 0
            java.lang.String r9 = androidx.compose.material3.DatePickerFormatter.CC.formatDate$default(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r0] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m4643validateXivgLIo(androidx.compose.material3.internal.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}

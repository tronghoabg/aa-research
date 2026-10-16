package com.google.android.gms.location.b;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final StringBuilder f5679a;

    static {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
        new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
        f5679a = new StringBuilder(33);
    }

    public static String a(long j2) {
        String string;
        StringBuilder sb = f5679a;
        synchronized (sb) {
            sb.setLength(0);
            b(j2, sb);
            string = sb.toString();
        }
        return string;
    }

    public static void b(long j2, StringBuilder sb) {
        if (j2 == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j2 < 0) {
            sb.append("-");
            if (j2 != Long.MIN_VALUE) {
                j2 = -j2;
            } else {
                z = true;
                j2 = Long.MAX_VALUE;
            }
        }
        if (j2 >= CalendarModelKt.MillisecondsIn24Hours) {
            sb.append(j2 / CalendarModelKt.MillisecondsIn24Hours);
            sb.append("d");
            j2 %= CalendarModelKt.MillisecondsIn24Hours;
        }
        if (z) {
            j2++;
        }
        if (j2 >= 3600000) {
            sb.append(j2 / 3600000);
            sb.append(CmcdData.STREAMING_FORMAT_HLS);
            j2 %= 3600000;
        }
        if (j2 >= 60000) {
            sb.append(j2 / 60000);
            sb.append(CmcdData.OBJECT_TYPE_MANIFEST);
            j2 %= 60000;
        }
        if (j2 >= 1000) {
            sb.append(j2 / 1000);
            sb.append(CmcdData.STREAMING_FORMAT_SS);
            j2 %= 1000;
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append(AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL);
        }
    }
}

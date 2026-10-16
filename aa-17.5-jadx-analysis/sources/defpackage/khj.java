package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.CalendarContract;
import java.util.Locale;

/* loaded from: classes.dex */
public final class khj {
    public static final /* synthetic */ int a = 0;
    private static final yfq b;

    static {
        yph.c("GH.CalEvtsQueryFactory");
        b = yfq.B("calendar_id", "title", "begin", "end", "allDay", "eventLocation", "displayColor");
    }

    public static eqj a(ContentResolver contentResolver, eqj eqjVar) {
        return eqy.c(eqjVar, new kaa(contentResolver, 9));
    }

    public static kfk b(long j, long j2, boolean z) {
        Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        ContentUris.appendId(builderBuildUpon, j);
        ContentUris.appendId(builderBuildUpon, j2);
        wu wuVarA = kfk.a();
        wuVarA.d(builderBuildUpon.build());
        wuVarA.b(b);
        wuVarA.b = String.format(Locale.US, "(%s = ?) AND (%s = 1) AND (%s != ?)", "allDay", "visible", "selfAttendeeStatus");
        wuVarA.c(yfq.r(String.valueOf(z ? 1 : 0), "2"));
        return wuVarA.a();
    }

    public static void c() {
    }
}

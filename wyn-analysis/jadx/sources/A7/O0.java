package A7;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class O0 {
    public static /* synthetic */ JobInfo.TriggerContentUri d(Uri uri, int i5) {
        return new JobInfo.TriggerContentUri(uri, i5);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ LocaleList g(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan h(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ PriorityQueue k(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void l() {
    }
}

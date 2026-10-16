package okhttp3.internal.d;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(okhttp3.internal.b.f55958d);
        return simpleDateFormat;
    }
}

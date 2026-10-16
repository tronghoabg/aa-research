package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ajjz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(ajis.a);
        return simpleDateFormat;
    }
}

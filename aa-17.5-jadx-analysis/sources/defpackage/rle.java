package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
final class rle extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}

package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
final class tet extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    }
}

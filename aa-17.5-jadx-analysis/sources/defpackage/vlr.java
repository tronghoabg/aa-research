package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
final class vlr extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("H:mm", Locale.US);
    }
}

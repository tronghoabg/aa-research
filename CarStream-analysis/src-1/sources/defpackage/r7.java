package defpackage;

import android.content.AttributionSource;
import android.content.ContextWrapper;
import android.os.Process;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r7 extends ContextWrapper {
    @Override // android.content.ContextWrapper, android.content.Context
    public final AttributionSource getAttributionSource() {
        try {
            return new AttributionSource.Builder(Process.myUid()).setPackageName("com.android.shell").build();
        } catch (Throwable unused) {
            return super.getAttributionSource();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getOpPackageName() {
        return "com.android.shell";
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return "com.android.shell";
    }
}

package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class dd extends Activity implements LifecycleOwner, KeyEventDispatcher.Component {
    private final SimpleArrayMap<Class<? extends dc>, dc> extraDataMap = new SimpleArrayMap<>(0, 1, null);
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[PHI: r1
  0x0042: PHI (r1v2 int) = (r1v1 int), (r1v0 int), (r1v0 int) binds: [B:24:0x0040, B:20:0x0035, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r4) {
        /*
            r3 = this;
            r3 = 0
            if (r4 == 0) goto L47
            int r0 = r4.length
            if (r0 == 0) goto L47
            r4 = r4[r3]
            int r0 = r4.hashCode()
            r1 = 33
            r2 = 1
            switch(r0) {
                case -645125871: goto L38;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1d;
                case 1455016274: goto L13;
                default: goto L12;
            }
        L12:
            goto L47
        L13:
            java.lang.String r0 = "--autofill"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1c
            goto L47
        L1c:
            return r2
        L1d:
            java.lang.String r0 = "--contentcapture"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L47
            return r2
        L26:
            java.lang.String r0 = "--list-dumpables"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L47
            goto L42
        L2f:
            java.lang.String r0 = "--dump-dumpable"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L47
            goto L42
        L38:
            java.lang.String r0 = "--translation"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L47
            r1 = 31
        L42:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L47
            return r2
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.dd.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        h.g.b.x.f(keyEvent, NotificationCompat.CATEGORY_EVENT);
        View decorView = getWindow().getDecorView();
        h.g.b.x.e(decorView, "getDecorView(...)");
        KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent);
        return KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        h.g.b.x.f(keyEvent, NotificationCompat.CATEGORY_EVENT);
        View decorView = getWindow().getDecorView();
        h.g.b.x.e(decorView, "getDecorView(...)");
        KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent);
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends dc> T getExtraData(Class<T> cls) {
        h.g.b.x.f(cls, "extraDataClass");
        return (T) this.extraDataMap.get(cls);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        h.g.b.x.f(bundle, "outState");
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(dc dcVar) {
        h.g.b.x.f(dcVar, "extraData");
        this.extraDataMap.put(dcVar.getClass(), dcVar);
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        h.g.b.x.f(keyEvent, NotificationCompat.CATEGORY_EVENT);
        return super.dispatchKeyEvent(keyEvent);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}

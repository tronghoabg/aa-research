package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
final class lmo implements ljr {
    final /* synthetic */ lmu a;
    private final /* synthetic */ int b;

    public lmo(lmu lmuVar, int i) {
        this.b = i;
        this.a = lmuVar;
    }

    @Override // defpackage.ljr
    public final void a(ComponentName componentName) {
        if (this.b != 0) {
            this.a.k(componentName);
        }
    }

    @Override // defpackage.ljr
    public final void b(Intent intent, boolean z, ComponentName componentName) {
        if (this.b == 0 && !aczc.p()) {
            lmu lmuVar = this.a;
            if (!z || !componentName.equals(lmuVar.a().a)) {
                intent = null;
            }
            lmuVar.d = intent;
        }
    }

    @Override // defpackage.ljr
    public final void c(Intent intent, ComponentName componentName) {
        if (this.b == 0 && !aczc.p()) {
            lmu lmuVar = this.a;
            if (intent.equals(lmuVar.d) && componentName.equals(lmuVar.a().a)) {
                lmuVar.d = null;
            }
        }
    }
}

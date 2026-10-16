package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class nwv extends nwt {
    private final Runnable a;

    public nwv(GhIcon ghIcon, int i, Runnable runnable) {
        super(ghIcon, null, i);
        this.a = runnable;
    }

    @Override // defpackage.nwt
    public final void a() {
        this.a.run();
    }

    @Override // defpackage.nwt
    public final String b() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nwv)) {
            nwv nwvVar = (nwv) obj;
            if (nwt.c(this.b, nwvVar.b) && this.a == nwvVar.a && this.d == nwvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, Integer.valueOf(this.d));
    }

    public final String toString() {
        return String.format("NotificationUiRunnableAction[icon=%s, runnable=%s, semanticType=%s]", this.b, this.a, nsh.h(this.d));
    }
}

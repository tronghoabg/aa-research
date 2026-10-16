package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final class lui {
    public GhIcon a;
    private ComponentName b;
    private String c;
    private int d;
    private byte e;

    public final luj a() {
        ComponentName componentName;
        String str;
        GhIcon ghIcon;
        if (this.e == 1 && (componentName = this.b) != null && (str = this.c) != null && (ghIcon = this.a) != null) {
            return new luj(componentName, str, ghIcon, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" componentName");
        }
        if (this.c == null) {
            sb.append(" appDisplayName");
        }
        if (this.a == null) {
            sb.append(" icon");
        }
        if (this.e == 0) {
            sb.append(" accentColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.e = (byte) 1;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null appDisplayName");
        }
        this.c = str;
    }

    public final void d(ComponentName componentName) {
        if (componentName == null) {
            throw new NullPointerException("Null componentName");
        }
        this.b = componentName;
    }
}

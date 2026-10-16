package defpackage;

import android.content.ComponentName;
import android.os.UserHandle;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sob {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;
    public final UserHandle f;

    public sob(String str, int i, boolean z) {
        spu.at(str);
        this.a = str;
        spu.at("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = i;
        this.e = z;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sob)) {
            return false;
        }
        sob sobVar = (sob) obj;
        if (Objects.equals(this.a, sobVar.a) && Objects.equals(this.b, sobVar.b) && Objects.equals(this.c, sobVar.c) && this.d == sobVar.d && this.e == sobVar.e) {
            UserHandle userHandle = sobVar.f;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e), null});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        spu.aw(componentName);
        return componentName.flattenToString();
    }

    public sob(ComponentName componentName) {
        this.a = null;
        this.b = null;
        spu.aw(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
        this.f = null;
    }
}

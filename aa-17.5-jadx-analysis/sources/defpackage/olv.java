package defpackage;

import android.content.ComponentName;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class olv {
    public final Integer a;
    public final ComponentName b;

    public olv(Integer num, ComponentName componentName) {
        this.a = num;
        this.b = componentName;
    }

    public static olv a() {
        return new olv(Integer.valueOf(R.drawable.ic_keyboard_arrow_down), null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof olv) {
            olv olvVar = (olv) obj;
            Integer num = this.a;
            if (num != null ? num.equals(olvVar.a) : olvVar.a == null) {
                ComponentName componentName = this.b;
                if (componentName != null ? componentName.equals(olvVar.b) : olvVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        ComponentName componentName = this.b;
        return ((1000003 ^ iHashCode) * 583896283) ^ (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "IconModel{drawableId=" + this.a + ", drawable=null, uri=null, appComponentName=" + String.valueOf(this.b) + "}";
    }

    public olv() {
        throw null;
    }
}

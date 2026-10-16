package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.gms.car.display.CarRegionId;
import java.util.UUID;

/* loaded from: classes.dex */
public final class inz {
    public final ComponentName a;
    public final ComponentName b;
    public final Intent c;
    public final Bundle d;
    public final inf e;
    public final ioc f;
    public final int g;
    public final int h;
    public final CarRegionId i;
    public final Rect j;
    public final Rect k;
    public final int l;
    public final int m;
    public final UUID n;
    public final int o;

    public inz(ComponentName componentName, ComponentName componentName2, Intent intent, Bundle bundle, inf infVar, ioc iocVar, int i, int i2, CarRegionId carRegionId, Rect rect, Rect rect2, int i3, int i4, UUID uuid, int i5) {
        this.a = componentName;
        this.b = componentName2;
        this.c = intent;
        this.d = bundle;
        this.e = infVar;
        this.f = iocVar;
        this.g = i;
        this.h = i2;
        this.i = carRegionId;
        this.j = rect;
        this.k = rect2;
        this.l = i3;
        this.m = i4;
        this.n = uuid;
        this.o = i5;
    }

    public final boolean equals(Object obj) {
        ComponentName componentName;
        Bundle bundle;
        ioc iocVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof inz) {
            inz inzVar = (inz) obj;
            if (this.a.equals(inzVar.a) && ((componentName = this.b) != null ? componentName.equals(inzVar.b) : inzVar.b == null) && this.c.equals(inzVar.c) && ((bundle = this.d) != null ? bundle.equals(inzVar.d) : inzVar.d == null) && this.e.equals(inzVar.e) && ((iocVar = this.f) != null ? iocVar.equals(inzVar.f) : inzVar.f == null) && this.g == inzVar.g && this.h == inzVar.h && this.i.equals(inzVar.i) && this.j.equals(inzVar.j) && this.k.equals(inzVar.k) && this.l == inzVar.l && this.m == inzVar.m && this.n.equals(inzVar.n) && this.o == inzVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ComponentName componentName = this.b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (componentName == null ? 0 : componentName.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        Bundle bundle = this.d;
        int iHashCode3 = (((iHashCode2 ^ (bundle == null ? 0 : bundle.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003;
        ioc iocVar = this.f;
        return this.o ^ ((((((((((((((((((iHashCode3 ^ (iocVar != null ? iocVar.hashCode() : 0)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003);
    }

    public final String toString() {
        UUID uuid = this.n;
        Rect rect = this.k;
        Rect rect2 = this.j;
        CarRegionId carRegionId = this.i;
        ioc iocVar = this.f;
        inf infVar = this.e;
        Bundle bundle = this.d;
        Intent intent = this.c;
        ComponentName componentName = this.b;
        return "StartInfo{componentName=" + String.valueOf(this.a) + ", ghostActivity=" + String.valueOf(componentName) + ", intent=" + String.valueOf(intent) + ", activityOptions=" + String.valueOf(bundle) + ", factory=" + String.valueOf(infVar) + ", targetTask=" + String.valueOf(iocVar) + ", windowLayer=" + this.g + ", z=" + this.h + ", carRegionId=" + String.valueOf(carRegionId) + ", bounds=" + String.valueOf(rect2) + ", insets=" + String.valueOf(rect) + ", insetSideHint=" + this.l + ", insetBehavior=" + this.m + ", carDisplayConfigurationId=" + String.valueOf(uuid) + ", bindPriorityFlags=" + this.o + "}";
    }

    public inz() {
        throw null;
    }
}

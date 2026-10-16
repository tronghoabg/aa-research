package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iof {
    public final android.content.ComponentName a;
    public final android.content.ComponentName b;
    public final android.content.Intent c;
    public final android.os.Bundle d;
    public final defpackage.inm e;
    public final defpackage.ioi f;
    public final int g;
    public final int h;
    public final com.google.android.gms.car.display.CarRegionId i;
    public final android.graphics.Rect j;
    public final android.graphics.Rect k;
    public final android.graphics.Rect l;
    public final int m;
    public final int n;
    public final java.util.UUID o;
    public final int p;

    public iof(android.content.ComponentName componentName, android.content.ComponentName componentName2, android.content.Intent intent, android.os.Bundle bundle, defpackage.inm inmVar, defpackage.ioi ioiVar, int i, int i2, com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, int i3, int i4, java.util.UUID uuid, int i5) {
        this.a = componentName;
        this.b = componentName2;
        this.c = intent;
        this.d = bundle;
        this.e = inmVar;
        this.f = ioiVar;
        this.g = i;
        this.h = i2;
        this.i = carRegionId;
        this.j = rect;
        this.k = rect2;
        this.l = rect3;
        this.m = i3;
        this.n = i4;
        this.o = uuid;
        this.p = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        android.content.ComponentName componentName;
        android.os.Bundle bundle;
        defpackage.ioi ioiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.iof) {
            defpackage.iof iofVar = (defpackage.iof) obj;
            if (this.a.equals(iofVar.a) && ((componentName = this.b) != null ? componentName.equals(iofVar.b) : iofVar.b == null) && this.c.equals(iofVar.c) && ((bundle = this.d) != null ? bundle.equals(iofVar.d) : iofVar.d == null) && this.e.equals(iofVar.e) && ((ioiVar = this.f) != null ? ioiVar.equals(iofVar.f) : iofVar.f == null) && this.g == iofVar.g && this.h == iofVar.h && this.i.equals(iofVar.i) && this.j.equals(iofVar.j) && this.k.equals(iofVar.k) && this.l.equals(iofVar.l) && this.m == iofVar.m && this.n == iofVar.n && this.o.equals(iofVar.o) && this.p == iofVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        android.content.ComponentName componentName = this.b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (componentName == null ? 0 : componentName.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        android.os.Bundle bundle = this.d;
        int iHashCode3 = (((iHashCode2 ^ (bundle == null ? 0 : bundle.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003;
        defpackage.ioi ioiVar = this.f;
        return this.p ^ ((((((((((((((((((((iHashCode3 ^ (ioiVar != null ? ioiVar.hashCode() : 0)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        java.util.UUID uuid = this.o;
        android.graphics.Rect rect = this.l;
        android.graphics.Rect rect2 = this.k;
        android.graphics.Rect rect3 = this.j;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.i;
        defpackage.ioi ioiVar = this.f;
        defpackage.inm inmVar = this.e;
        android.os.Bundle bundle = this.d;
        android.content.Intent intent = this.c;
        android.content.ComponentName componentName = this.b;
        return "StartInfo{componentName=" + java.lang.String.valueOf(this.a) + ", ghostActivity=" + java.lang.String.valueOf(componentName) + ", intent=" + java.lang.String.valueOf(intent) + ", activityOptions=" + java.lang.String.valueOf(bundle) + ", factory=" + java.lang.String.valueOf(inmVar) + ", targetTask=" + java.lang.String.valueOf(ioiVar) + ", windowLayer=" + this.g + ", z=" + this.h + ", carRegionId=" + java.lang.String.valueOf(carRegionId) + ", bounds=" + java.lang.String.valueOf(rect3) + ", insets=" + java.lang.String.valueOf(rect2) + ", extraInsets=" + java.lang.String.valueOf(rect) + ", insetSideHint=" + this.m + ", insetBehavior=" + this.n + ", carDisplayConfigurationId=" + java.lang.String.valueOf(uuid) + ", bindPriorityFlags=" + this.p + "}";
    }

    public iof() {
        throw null;
    }
}

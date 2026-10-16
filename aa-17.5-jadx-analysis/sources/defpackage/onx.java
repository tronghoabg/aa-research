package defpackage;

/* loaded from: classes2.dex */
public final class onx {
    public final onv a;
    public final yzy b;

    public onx(onv onvVar, yzy yzyVar) {
        this.a = onvVar;
        this.b = yzyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof onx) {
            onx onxVar = (onx) obj;
            onv onvVar = this.a;
            if (onvVar != null ? onvVar.equals(onxVar.a) : onxVar.a == null) {
                if (this.b.equals(onxVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        onv onvVar = this.a;
        return this.b.hashCode() ^ (((onvVar == null ? 0 : onvVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        yzy yzyVar = this.b;
        return "WeatherDataDisplayAndUiAction{weatherDisplayData=" + String.valueOf(this.a) + ", uiAction=" + yzyVar.toString() + "}";
    }

    protected onx() {
        throw null;
    }
}

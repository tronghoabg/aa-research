package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class uim {
    public final too a;
    public float b;
    public int c;

    public uim(too tooVar, int i, float f) {
        this.a = tooVar;
        this.c = i;
        this.b = f;
    }

    public static uim a(abag abagVar, tof tofVar) throws IOException {
        float f;
        int i;
        abah abahVar = abagVar.c;
        if (abahVar == null) {
            abahVar = abah.a;
        }
        abms abmsVar = abahVar.c;
        too tooVar = new too();
        tofVar.i(abmsVar, tooVar);
        if ((abagVar.b & 4) != 0) {
            f = abagVar.e / 10.0f;
            i = 1;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
            i = 2;
        }
        return new uim(tooVar, i, f);
    }

    public final boolean b() {
        if (Float.isNaN(this.b)) {
            return false;
        }
        return (this.b == BitmapDescriptorFactory.HUE_RED && this.c == 2) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uim uimVar = (uim) obj;
        return this.c == uimVar.c && this.a.equals(uimVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(uimVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        a.aJ(i);
        return ((((i + 31) * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePosition{position=");
        sb.append(this.a);
        if (b()) {
            sb.append(", rotationMode=");
            int i = this.c;
            sb.append((Object) (i != 1 ? i != 2 ? "null" : "SCREEN_RELATIVE" : "WORLD_RELATIVE"));
            sb.append(", rotation=");
            sb.append(this.b);
        }
        sb.append('}');
        return sb.toString();
    }
}

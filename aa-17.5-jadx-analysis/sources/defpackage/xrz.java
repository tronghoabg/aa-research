package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
public final class xrz {
    public List a;
    public float b;
    public float c;
    public afa d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public aen j;
    public float k;
    public float l;

    public xrz(xqv xqvVar) {
        this.a = xqvVar.a;
        this.b = xqvVar.b;
        this.c = xqvVar.c;
        this.d = xqvVar.d;
        this.e = xqvVar.e;
        this.f = xqvVar.f;
        this.g = xqvVar.g;
        this.h = xqvVar.h;
        this.i = xqvVar.i;
        this.j = xqvVar.j;
        this.k = xqvVar.k;
        this.l = xqvVar.l;
    }

    public final void a() {
        this.a = woy.bg(new xra("\n                    float sdRoundedBox(in vec2 p, in vec2 b, in vec4 r) {\n                        r.xy = (p.x > 0.0) ? r.xy : r.zw;\n                        r.x = (p.y > 0.0) ? r.x : r.y;\n                        vec2 q = abs(p) - b + r.x;\n                        return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;\n                    }\n                "));
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
    }

    public xrz() {
        this(new xqv(null));
    }
}

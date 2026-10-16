package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
public final class xqv {
    public final List a;
    public final float b;
    public final float c;
    public final afa d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final aen j;
    public final float k;
    public final float l;
    private final Float m;
    private final Float n;
    private final boolean o;

    public /* synthetic */ xqv(byte[] bArr) {
        this(woy.bi(new xra("\n                    float sdRoundedBox(in vec2 p, in vec2 b, in vec4 r) {\n                        r.xy = (p.x > 0.0) ? r.xy : r.zw;\n                        r.x = (p.y > 0.0) ? r.x : r.y;\n                        vec2 q = abs(p) - b + r.x;\n                        return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;\n                    }\n                "), new xra("\n                    float sdPill(vec2 p, vec2 size, vec4 r) {\n                        float2 d = abs(p) - float2(0, size.y * 0.2);\n                        return length(max(d, 0)) + min(max(d.x, d.y), 0) - size.y;\n                    }\n                "), new xra("\n                    float sdCookie4(vec2 pos, vec2 size, vec4 rad) {\n                        const float k = 0.15;\n                        pos = pos / (size.y * 0.6);\n                        pos = abs(pos);\n                        pos = float2(abs(pos.x-pos.y),1.0-pos.x-pos.y)/sqrt(2.0);\n\n                        float p = (k-pos.y-0.25/k)/(6.0*k);\n                        float q = pos.x/(k*k*16.0);\n                        float h = q*q - p*p*p;\n\n                        float x;\n                        if( h>0.0 ) { float r = sqrt(h); x = pow(q+r,1.0/3.0)-pow(abs(q-r),1.0/3.0)*sign(r-q); }\n                        else        { float r = sqrt(p); x = 2.0*r*cos(acos(q/(p*r))/3.0); }\n                        x = min(x,sqrt(2.0)/2.0);\n\n                        float2 z = float2(x,k*(1.0-2.0*x*x)) - pos;\n                        return (length(z) * sign(z.y) - 0.9) * size.y;\n                    }\n                "), new xra("\n                    float sdCookie9(float2 p, float2 size, float4 rad) {\n                        // fast atan approximation, and atan approximates a smooth, curved edge shape\n                        bool a = abs(p.y) < abs(p.x);\n                        float i = a ? (p.y * (1/(p.x))) : (p.x * (1/(p.y)));\n                        i = i * (1.0584 + abs(i) * -0.273);\n                        float piadd = p.y > 0.0 ? 3.141592 : -3.141592;\n                        float angle = a ? (p.x < 0.0 ? piadd : 0.0) + i : 0.5 * piadd - i;\n\n                        p = p / (size.y * 0.6);\n                        float r = length(p);\n                        float cosWave = cos(angle * 9);\n                        float normalised = cosWave * 0.4 + 0.5;\n                        return (r - 2.0 + normalised * 0.25) * size.y;\n                    }\n                ")), 90.0f, 0.3f, new afa(0.5f, 200.0f, 0.01f), 1.15f, 360.0f, 20.0f, 22.0f, 2.5f, new aen(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f), 27.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqv)) {
            return false;
        }
        xqv xqvVar = (xqv) obj;
        if (!affa.f(this.a, xqvVar.a) || Float.compare(this.b, xqvVar.b) != 0 || Float.compare(this.c, xqvVar.c) != 0 || !affa.f(this.d, xqvVar.d) || Float.compare(this.e, xqvVar.e) != 0 || Float.compare(this.f, xqvVar.f) != 0 || Float.compare(this.g, xqvVar.g) != 0 || Float.compare(this.h, xqvVar.h) != 0 || Float.compare(this.i, xqvVar.i) != 0 || !affa.f(this.j, xqvVar.j) || Float.compare(this.k, xqvVar.k) != 0 || Float.compare(this.l, xqvVar.l) != 0) {
            return false;
        }
        Float f = xqvVar.m;
        if (!affa.f(null, null)) {
            return false;
        }
        Float f2 = xqvVar.n;
        if (!affa.f(null, null)) {
            return false;
        }
        boolean z = xqvVar.o;
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + this.j.hashCode()) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 29791) + 1237;
    }

    public final String toString() {
        return "LoaderConfig(shapes=" + this.a + ", morphAngle=" + this.b + ", morphDuration=" + this.c + ", rotationMorphSpring=" + this.d + ", stepInterval=" + this.e + ", rotationAngle=" + this.f + ", rotationDuration=" + this.g + ", yFloatAmount=" + this.h + ", yFloatDuration=" + this.i + ", yFloatCubicBezier=" + this.j + ", backgroundBlurAmount=" + this.k + ", backgroundBlurAlpha=" + this.l + ", finalHeight=null, finalWidth=null, shouldScale=false)";
    }

    public xqv(List list, float f, float f2, afa afaVar, float f3, float f4, float f5, float f6, float f7, aen aenVar, float f8, float f9) {
        list.getClass();
        afaVar.getClass();
        aenVar.getClass();
        this.a = list;
        this.b = f;
        this.c = f2;
        this.d = afaVar;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = aenVar;
        this.k = f8;
        this.l = f9;
        this.m = null;
        this.n = null;
        this.o = false;
    }

    public xqv() {
        this(null);
    }
}

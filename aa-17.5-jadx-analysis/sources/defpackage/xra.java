package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class xra {
    public final String a;

    public static final String a(String str) {
        return affa.f(str, "\n                    float sdRoundedBox(in vec2 p, in vec2 b, in vec4 r) {\n                        r.xy = (p.x > 0.0) ? r.xy : r.zw;\n                        r.x = (p.y > 0.0) ? r.x : r.y;\n                        vec2 q = abs(p) - b + r.x;\n                        return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;\n                    }\n                ") ? "sdRoundedBox" : affa.f(str, "\n                    float sdPill(vec2 p, vec2 size, vec4 r) {\n                        float2 d = abs(p) - float2(0, size.y * 0.2);\n                        return length(max(d, 0)) + min(max(d.x, d.y), 0) - size.y;\n                    }\n                ") ? "sdPill" : affa.f(str, "\n                    float sdCookie4(vec2 pos, vec2 size, vec4 rad) {\n                        const float k = 0.15;\n                        pos = pos / (size.y * 0.6);\n                        pos = abs(pos);\n                        pos = float2(abs(pos.x-pos.y),1.0-pos.x-pos.y)/sqrt(2.0);\n\n                        float p = (k-pos.y-0.25/k)/(6.0*k);\n                        float q = pos.x/(k*k*16.0);\n                        float h = q*q - p*p*p;\n\n                        float x;\n                        if( h>0.0 ) { float r = sqrt(h); x = pow(q+r,1.0/3.0)-pow(abs(q-r),1.0/3.0)*sign(r-q); }\n                        else        { float r = sqrt(p); x = 2.0*r*cos(acos(q/(p*r))/3.0); }\n                        x = min(x,sqrt(2.0)/2.0);\n\n                        float2 z = float2(x,k*(1.0-2.0*x*x)) - pos;\n                        return (length(z) * sign(z.y) - 0.9) * size.y;\n                    }\n                ") ? "sdCookie4" : affa.f(str, "\n                    float sdCookie9(float2 p, float2 size, float4 rad) {\n                        // fast atan approximation, and atan approximates a smooth, curved edge shape\n                        bool a = abs(p.y) < abs(p.x);\n                        float i = a ? (p.y * (1/(p.x))) : (p.x * (1/(p.y)));\n                        i = i * (1.0584 + abs(i) * -0.273);\n                        float piadd = p.y > 0.0 ? 3.141592 : -3.141592;\n                        float angle = a ? (p.x < 0.0 ? piadd : 0.0) + i : 0.5 * piadd - i;\n\n                        p = p / (size.y * 0.6);\n                        float r = length(p);\n                        float cosWave = cos(angle * 9);\n                        float normalised = cosWave * 0.4 + 0.5;\n                        return (r - 2.0 + normalised * 0.25) * size.y;\n                    }\n                ") ? "sdCookie9" : "NON_EXISTENT_SHAPE";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xra) && affa.f(this.a, ((xra) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShaderShape(sdf=" + this.a + ")";
    }
}

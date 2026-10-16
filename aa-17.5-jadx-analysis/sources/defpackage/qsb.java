package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.os.RemoteException;
import j$.lang.Iterable$EL;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class qsb {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public qsb(ygr ygrVar, ygr ygrVar2) {
        this.b = ygrVar;
        this.c = ygrVar2;
        xyp xypVar = new xyp();
        xypVar.e(5000L);
        xypVar.g();
        xypVar.b(new ude(this));
        xyp xypVar2 = new xyp();
        xypVar2.e(5000L);
        xypVar2.g();
        xypVar2.b(new udf(this));
        xyp xypVar3 = new xyp();
        xypVar3.e(250L);
        xypVar3.g();
        this.a = xypVar3.a();
        xyp xypVar4 = new xyp();
        xypVar4.e(250L);
        xypVar4.g();
        this.d = xypVar4.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uzy] */
    public final xxh a() {
        plz plzVar = (plz) this.c.c();
        return plzVar == null ? xvy.a : xxh.g(plzVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uzy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xwx] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final zgp b() {
        xxh xxhVarA = a();
        if (xxhVarA.f()) {
            return wub.Y(xxhVarA.b());
        }
        zgp zgpVarB = this.c.b();
        return new xuy(zfb.f((zgpVarB instanceof xuy ? (xuy) zgpVarB : new xuy(zgpVarB)).a, this.a, this.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final Object c(xyc xycVar) {
        this.a.a();
        int i = 1;
        try {
            return xycVar.gu();
        } finally {
            this.a.a();
            ((plo) this.c).a(new qio(this, i), this.b);
        }
    }

    public final void d(Runnable runnable) {
        c(new ojk(runnable, 15));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ackk, java.lang.Object] */
    public final /* synthetic */ void e(ackk ackkVar) {
        if (((trk) ackkVar.a()).m().i()) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final void f(yzz yzzVar, yzy yzyVar, int i) {
        int iIntValue = 0;
        woy.N(i >= 0);
        if (i == 0) {
            return;
        }
        rff rffVar = new rff(yzzVar, yzyVar);
        synchronized (this.a) {
            ?? r2 = this.d;
            Integer num = (Integer) r2.get(rffVar);
            if (num != null) {
                iIntValue = num.intValue();
            }
            r2.put(rffVar, Integer.valueOf(iIntValue + i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [tny] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.List, long[]] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.usy r32, defpackage.ufn r33) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsb.g(usy, ufn):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final tqx h(abcs abcsVar) {
        return abcsVar != abcs.a ? (tqx) this.d.get(abcsVar) : tqx.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ylc] */
    public final synchronized void i(twi twiVar) {
        this.c.add(twiVar);
        uca ucaVar = (uca) this.d.remove(twiVar);
        ?? r1 = this.b;
        ((ybq) r1).b += -((ybq) r1).a.g(twiVar, wub.x(twiVar));
        if (ucaVar != null) {
            twi twiVar2 = ucaVar.c;
            twiVar2.getClass();
            r1.remove(twiVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ylc] */
    public final synchronized boolean j(twi twiVar, uca ucaVar) {
        uca ucaVar2 = (uca) this.d.get(twiVar);
        if (ucaVar2 == null || !this.b.contains(ucaVar2.c)) {
            return false;
        }
        ucaVar.a = ucaVar2.a;
        ucaVar.b = ucaVar2.b;
        ucaVar.c = ucaVar2.c;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ylc] */
    public final synchronized boolean k(twi twiVar) {
        return this.b.contains(twiVar);
    }

    public final String l(String str, abgl abglVar) {
        return (String) o(str).get(abglVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    public final String m(String str, abgx abgxVar) {
        ?? r1 = this.d;
        if (!r1.containsKey(str)) {
            return null;
        }
        String str2 = (String) ((rjs) r1.get(str)).a.get(abgxVar);
        if (woy.am(str2)) {
            return null;
        }
        int i = ysy.a;
        ysv ysvVar = ysq.a;
        return ((yso) ysvVar).a(str2.toString().getBytes(StandardCharsets.UTF_8)).toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Map n() {
        return new HashMap((Map) this.d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final Map o(String str) {
        String strC;
        Set set;
        EnumMap enumMap = new EnumMap(abgl.class);
        rjs rjsVar = (rjs) this.d.get(str);
        if (rjsVar != null && (strC = rjsVar.c(abgx.ROADMAP)) != null && (set = (Set) this.c.get(strC)) != null) {
            Iterable$EL.forEach(new HashSet(set), new kqa(enumMap, strC, 6, null));
        }
        return enumMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public final boolean p(String str) {
        ?? r2 = this.d;
        if (r2.containsKey(str)) {
            return ((rjs) r2.get(str)).d() || !((rjs) r2.get(str)).b.isEmpty();
        }
        return false;
    }

    public final boolean q(abgx abgxVar) {
        return ((ygr) this.a).contains(abgxVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final rjs r(String str) {
        return (rjs) Map.EL.computeIfAbsent(this.d, str, new ric(18));
    }

    public final too s(too tooVar, uww uwwVar) {
        Object obj = this.b;
        if (obj != uwwVar) {
            uww uwwVar2 = (uww) obj;
            uwwVar2.d(uwwVar);
            if (uwwVar2.b) {
                ((too) this.c).A(tooVar);
            } else {
                Object obj2 = this.a;
                float f = tooVar.a;
                float f2 = tooVar.b;
                float[] fArr = ((uwx) obj2).a;
                fArr[0] = f;
                fArr[1] = f2;
                fArr[2] = 1.0f;
                Object obj3 = this.d;
                fArr[3] = 1.0f;
                float[] fArr2 = uwwVar2.a;
                float[] fArr3 = ((uwx) obj3).a;
                uxf.d(fArr3, 0, fArr2, fArr);
                ((too) this.c).r((int) fArr3[0], (int) fArr3[1]);
            }
        }
        return (too) this.c;
    }

    public qsb(tmb tmbVar, Executor executor, plo ploVar, qbv qbvVar) {
        this.a = tmbVar;
        this.b = executor;
        this.c = ploVar;
        this.d = qbvVar;
    }

    public qsb(ujf ujfVar, ues uesVar, Resources resources, abaf abafVar) {
        this.a = uesVar;
        this.d = resources;
        this.b = abafVar;
        this.c = ujfVar;
    }

    public qsb(usy usyVar, udb udbVar, ucj ucjVar, Runnable runnable) {
        this.b = usyVar;
        this.c = udbVar;
        this.a = ucjVar;
        this.d = runnable;
    }

    public qsb(uxc uxcVar, rjr rjrVar, yfq yfqVar, ackk ackkVar) {
        this.c = uxcVar;
        this.a = yfqVar;
        this.b = rjrVar;
        this.d = ackkVar;
    }

    public qsb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new tpf();
        this.a = new tpf();
        this.c = new tpf();
        this.d = new tpf();
    }

    public qsb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = "b";
        this.a = "c";
        this.b = "d";
        this.d = "e";
    }

    public qsb(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.d = "precision highp float;varying vec4 a;uniform mat4 b;uniform ivec4 c[64];uniform float d;attribute vec4 e;attribute vec4 f;vec4 k(ivec2 g){vec4 h;h.a=floor(float(g.x)*(1./256.))*(1./255.);if(h.a!=0.){h.r=fract(float(g.x)*(1./256.))*(256./255.);h.b=fract(float(g.y)*(1./256.))*(256./255.);h.g=floor(float(g.y)*(1./256.))*(1./255.);}return h;}void main(){ivec4 g=c[int(clamp(f.r,0.,float(64-1)))];ivec2 h=int(f.g)==1?g.zw:g.xy;float i,j;i=f.b/4.;j=f.a/4.;a=k(h);if(a.a==0.||d<i||d>j){gl_Position=vec4(0);return;}gl_Position=b*e;}";
        this.a = "precision mediump float;varying vec4 a;void main(){gl_FragColor=a;}";
        this.c = new ohb((byte[]) null);
        this.b = new rjs((char[]) null);
    }

    public qsb(byte[] bArr, byte[] bArr2, short[] sArr) {
        this.d = "precision highp float;varying vec4 a;varying vec2 b;uniform mat4 c,d;uniform vec3 e;attribute vec3 f;attribute vec2 g;attribute vec3 h;void main(){gl_Position=d*c*vec4(f,1);float i=clamp(abs(dot(e,h)),0.,1.)*.3+.7;a=vec4(i,i,i,1);b=vec2(g.x,1.-g.y);}";
        this.a = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D i;void main(){vec4 j=texture2D(i,b);gl_FragColor=j*a;}";
        this.c = new qsb((char[]) null, (char[]) null);
        this.b = new kex((byte[]) null);
    }

    public qsb(byte[] bArr, char[] cArr) {
        this.d = "precision highp float;uniform mat4 a,b;uniform vec3 c,d[2];uniform float e;attribute vec4 f;attribute vec4 g;attribute vec4 h;attribute vec4 i;varying vec4 j;varying vec2 k;void main(){vec3 l,n,o,q,r,s,u;l=f.xyz;vec2 m,p,t;m=vec2(f.w,g.x);n=g.yzw;o=h.xyz;p=vec2(h.w,i.x);q=i.yzw;r=mix(l,o,e);s=normalize(mix(n,q,e));t=mix(m,p,e);gl_Position=b*a*vec4(r,1);u=vec3(1,clamp(dot(d[0],s),0.,1.),clamp(dot(d[1],s),0.,1.));float v=dot(u,c);j=vec4(vec3(v),1);k=vec2(t.x,1.-t.y);}";
        this.c = "precision mediump float;uniform sampler2D l;varying vec4 j;varying vec2 k;void main(){vec4 m=texture2D(l,k);gl_FragColor=m*j;}";
        this.a = new zig();
        this.b = new qsb((char[]) null, (byte[]) null);
    }

    public qsb(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.d = "precision highp float;uniform mat4 a;attribute vec4 b;attribute vec4 c;attribute vec4 d;attribute vec4 e;varying vec2 f;varying float g,h;uniform vec4 i;const float l=1.4;varying vec4 j,k;void main(){float m,n,o;m=i.x;g=c.x*.5;h=c.y*.5;vec2 p,q;if(c.z>=128.){n=(c.z-128.)/4.;o=c.w/4.;p=vec2(-1.7321,-1);}else if(c.w>=128.){n=c.z/4.;o=(c.w-128.)/4.;p=vec2(1.7321,-1);}else{n=c.z/4.;o=c.w/4.;p=vec2(0,2);}if(m<n||m>o){gl_Position=vec4(0);return;}q=vec2(g+h+l)*p;f=q;q*=i.zw;gl_Position=a*b+vec4(q.x,q.y,0,0);j=d;k=e/255.;}";
        this.a = "precision highp float;varying vec2 f;varying float g,h;uniform vec4 i;const float l=1.4;varying vec4 j,k;void main(){float m,n,o,p,q,r,s;m=length(f);n=l*.5*i.y;o=g+h;p=smoothstep(o+n,o-n,m);q=smoothstep(g+n,g-n,m);r=p-q;if(p<1e-4)discard;s=r/p;gl_FragColor=mix(j,k,s);gl_FragColor.a*=p;}";
        this.c = new roa((byte[]) null);
        this.b = new qsb((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public qsb(byte[] bArr, char[] cArr, char[] cArr2) {
        this.d = "precision highp float;varying vec2 a[6],b[6];varying float c[6],d;attribute vec2 e;attribute float f;attribute vec4 g;attribute vec4 h;attribute vec4 i;attribute vec4 j;attribute vec4 k;attribute vec4 l;attribute float m;attribute float n;attribute float o;attribute float p;attribute float q;attribute float r;uniform vec2 s,t;void main(){gl_Position.x=e.x/s.x*2.-1.;gl_Position.y=e.y/s.y*-2.+1.;gl_Position.z=0.;gl_Position.w=1.;a[0]=g.zw*t;a[1]=h.zw*t;a[2]=i.zw*t;a[3]=j.zw*t;a[4]=k.zw*t;a[5]=l.zw*t;b[0]=g.xy;b[1]=h.xy;b[2]=i.xy;b[3]=j.xy;b[4]=k.xy;b[5]=l.xy;c[0]=m;c[1]=n;c[2]=o;c[3]=p;c[4]=q;c[5]=r;d=f;}";
        this.a = "precision mediump float;varying vec2 a[6],b[6];varying float c[6],d;uniform sampler2D u;vec4 A(vec4 v,vec4 w,float x){v*=x;return v+(1.-v.a)*w;}bool B(vec2 v){return v.x>=0.&&v.x<=1.&&v.y>=0.&&v.y<=1.;}void main(){gl_FragColor=vec4(0);for(int v=0;v<6;v++)if(B(b[v]))gl_FragColor=A(texture2D(u,a[v]),gl_FragColor,c[v]);gl_FragColor*=d;}";
        this.c = new kex((char[]) null);
        this.b = new aabc();
    }

    public qsb(byte[] bArr, int[] iArr) {
        this.c = "c";
        this.d = "d";
        this.b = "h";
        this.a = "i";
    }

    public qsb(byte[] bArr, short[] sArr) {
        this.d = "precision highp float;\n#ifdef VERTEX_TEXTURES\nvarying vec4 a;\n#else\nvarying vec2 b,c;varying float d;\n#endif\nuniform mat4 e;uniform float f;uniform vec2 g;attribute vec4 h;attribute vec4 i;\n#ifdef VERTEX_TEXTURES\nuniform sampler2D j;\n#endif\nvoid main(){float k,l,m,o;k=i.b/4.;l=i.a/4.;if(f<k||f>l){gl_Position=vec4(0);return;}m=i.r+i.g*256.;vec2 n,p;n=vec2(floor(f*.25)+23.5,m+.5)*g;o=mod(f,4.);p=vec2(f+.5,m+.5)*g;\n#ifdef VERTEX_TEXTURES\nfloat q=texture2D(j,n)[int(clamp(o,0.,3.))];if(q<=.5){gl_Position=vec4(0);return;}a=texture2D(j,p);\n#else\nb=p;c=n;d=o;\n#endif\ngl_Position=e*h;}";
        this.a = "precision mediump float;\n#ifdef VERTEX_TEXTURES\nvarying vec4 a;\n#else\nvarying vec2 b,c;varying float d;\n#endif\n#ifndef VERTEX_TEXTURES\nuniform sampler2D j;\n#endif\nvoid main(){\n#ifdef VERTEX_TEXTURES\ngl_FragColor=a;\n#else\nfloat k=texture2D(j,c)[int(clamp(d,0.,3.))];if(k<=.5)gl_FragColor=vec4(0);else gl_FragColor=texture2D(j,b);\n#endif\n}";
        this.c = new qsb((char[]) null, (byte[]) null, (byte[]) null);
        this.b = new roa((byte[]) null, (byte[]) null);
    }

    public qsb(char[] cArr) {
        this.d = "precision highp float;varying vec4 a;uniform mat4 b;uniform vec4 c,e[16];uniform float d,f,g,h,i,j;attribute vec4 k;attribute vec4 l;void main(){vec4 m,r;m=e[int(clamp(l.r,0.,float(16-1)))];float n,o,s;n=l.b/4.;o=l.a/4.;bool p=m.a==0.||f<n||f>o;if(p){gl_Position=vec4(0);return;}vec3 q=k.xyz;q=q*c.w+c.xyz;r=b*vec4(q.xy,q.z*d,1);gl_Position=r+vec4(0,0,h,0);a=m*vec2(l.g/255.,g).xxxy;a.r=min(a.r,1.);a.g=min(a.g,1.);a.b=min(a.b,1.);s=1.-smoothstep(i,j,r.z/r.w);a.a=a.a*s;}";
        this.c = "precision highp float;varying vec4 a;void main(){gl_FragColor=a;}";
        this.a = new usw();
        this.b = new rjg((byte[]) null, (byte[]) null);
    }

    public qsb(char[] cArr, byte[] bArr) {
        this.b = "f";
        this.a = "g";
        this.c = "h";
        this.d = "i";
    }

    public qsb(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.c = "e";
        this.b = "f";
        this.d = "g";
        this.a = "j";
    }

    public qsb(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = "precision highp float;varying vec2 a;varying highp float b;attribute vec4 c;attribute vec2 d;uniform mat4 e,f,g;uniform float h,i;uniform bool j;float m(float l){if(l<-h)l=l+i;if(l>h)l=l-i;return l;}void main(){a=d;b=c.z;if(j){gl_Position=f*vec4(c.xy,0,1);gl_Position.x=m(gl_Position.x);gl_Position=g*gl_Position;}else gl_Position=e*vec4(c.xy,0,1);}";
        this.a = "precision highp float;const vec3 m=vec3(.54,0,.45);varying vec2 a;varying highp float b;uniform sampler2D k;uniform float l;void main(){if(b==0.)discard;vec4 n,p;n=texture2D(k,a);float o=dot(n.rgb,m);p=vec4(vec3(o),n.a);gl_FragColor=mix(p,n,step(l,b));}";
        this.c = new ugm();
        this.b = new rjs((char[]) null, (byte[]) null);
    }

    public qsb(char[] cArr, byte[] bArr, char[] cArr2) {
        this.d = "precision highp float;varying vec4 a;varying vec2 b;attribute vec3 c;attribute vec2 d;uniform vec2 e,f;void main(){gl_Position.x=c.x/e.x*2.-1.;gl_Position.y=c.y/e.y*-2.+1.;gl_Position.z=0.;gl_Position.w=1.;b=d*f;a=vec4(c.z);}";
        this.a = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D g;void main(){gl_FragColor=a*texture2D(g,b);}";
        this.c = new kex((byte[]) null, (byte[]) null);
        this.b = new aacq((char[]) null, (byte[]) null);
    }

    public qsb(char[] cArr, char[] cArr2) {
        this.a = "c";
        this.c = "d";
        this.b = "e";
        this.d = "i";
    }

    public qsb(int[] iArr) {
        this.d = "precision highp float;varying vec2 a;varying vec4 b;uniform mat4 c;uniform mat3 d;uniform ivec2 e[4];uniform float f;attribute vec4 g;attribute vec2 h;attribute float i;vec4 m(ivec2 j){vec4 k;float l=float(j.x);k.r=mod(l,256.);l-=k.r;k.a=l/256.;if(k.a!=0.){l=float(j.y);k.b=mod(l,256.);l-=k.b;k.g=l/256.;}return k/255.;}void main(){ivec2 j=e[int(clamp(i,0.,float(4-1)))];b=m(j);if(b.a==0.){gl_Position=vec4(0);return;}gl_Position=c*g;a=(d*vec3(h,1)).xy;b*=f;}";
        this.a = "precision mediump float;varying vec2 a;varying vec4 b;uniform sampler2D j;void main(){gl_FragColor=b*texture2D(j,a);}";
        this.c = new ajdr((short[]) null);
        this.b = new ohb();
    }

    public qsb(short[] sArr, byte[] bArr) {
        this.d = "#define _a 1\n#define _b 2\n#define _c 2\n#define _d 1\n#define _e 3\n#define _f 2\n#define _g 0\nprecision highp float;uniform bool a;uniform float b,n,o,r;varying vec4 c,d,e,f,g,h,i;vec4 K(){return vec4(h.xy,e.zw);}uniform mat4 j;uniform ivec4 k[64],l[64*2];uniform vec2 m;attribute vec4 p;attribute vec4 q;uniform vec4 s;vec4 L(ivec2 t){vec4 u;u.a=floor(float(t.x)*(1./256.))*(1./255.);if(u.a!=0.){u.r=fract(float(t.x)*(1./256.))*(256./255.);u.b=fract(float(t.y)*(1./256.))*(256./255.);u.g=floor(float(t.y)*(1./256.))*(1./255.);}return u;}vec3 M(int t){vec3 u;u.z=fract(float(t)*(1./16.))*16.;float v=floor(float(t)*(1./16.));u.x=floor(v*(1./16.));u.y=fract(v*(1./16.))*16.;return u;}vec2 N(int t){vec2 u;u.x=floor(float(t)*(1./256.))+1.;u.y=fract(float(t)*(1./256.))*256.+1.;return u;}vec2 O(vec2 t,vec2 u){vec2 v,w,x,A,B;v=vec2(256.*o);w=mod(v,u);x=mod(m,u);A=mod(x*w,u);B=t*n*o;B.y=v.y-B.y;B+=A;return B;}void P(out vec4 t,out vec4 u){int v=int(clamp(q.r,0.,float(64-1)));t.xy=vec2(l[v*2].zw);u.xy=N(l[v*2].y);t.zw=vec2(l[v*2+1].zw);u.zw=N(l[v*2+1].y);}void main(){int t=int(clamp(q.r,0.,float(64-1)));ivec4 u=k[t];ivec2 v=int(q.g)==1?u.zw:u.xy;float w,x;w=q.b/4.;x=q.a/4.;c=L(v);if(c.a==0.||b<w||b>x){gl_Position=vec4(0);return;}gl_Position=j*p;if(a&&q.g==0.){vec3 A,B;A=M(l[t*2].x);B=M(l[t*2+1].x);f=vec4(A.xy,B.xy);ivec3 C,D;C=ivec3(A+.5);D=ivec3(B+.5);bool E,F;E=C.x!=_g;F=D.x!=_g;if(E||F){P(d,e);float G=C.x==_f?s.y:1.;h.xy=e.xy*G;h.zw=(h.xy-e.xy)/2.;i.xy=e.x*e.y>0.?O(p.xy,e.xy):vec2(0);i.zw=e.z*e.w>0.?O(p.xy,e.zw):vec2(0);i*=vec4(vec2(G*4.),vec2(2.*4.));vec4 H,I;H=K()/2.;I=vec4(bvec4(C.z==_c,C.z==_d,D.z==_c,D.z==_d));g=H*I;i-=(1.-I)*H;bool J=C.x==_e||C.x==_f&&D.x!=_f;f.x=!E?0.:J?s.w:s.z;f.z=!F?0.:D.x==_e?r:s.x;}}}";
        this.a = "#define _a 1\n#define _b 2\n#define _c 2\n#define _d 1\n#define _e 3\n#define _f 2\n#define _g 0\nprecision highp float;uniform bool a;varying vec4 c,d,e,f,g,h,i;vec4 C(){return vec4(h.xy,e.zw);}vec4 D(){return vec4(h.zw,vec2(0));}uniform sampler2D t;uniform vec2 u;vec4 E(){vec4 v,w,x;v=C();w=D();x=mod(floor(i/v),2.).yxwz*g;return mod(i-x,v)-w;}vec4 F(vec2 v,vec2 w,vec2 x){bvec4 A=bvec4(lessThan(x,vec2(0)),greaterThanEqual(x,w));if(any(A))return vec4(0);x=clamp(x,vec2(.5),w-.5);return texture2D(t,(v+x)*u);}vec4 G(vec4 v,vec3 w,int x){if(x==_a)v.rgb*=w;else if(x==_b)v.rgb=v.rgb+w.rgb*v.a-v.rgb*w.rgb;return v;}vec4 H(vec4 v,vec4 w){return v+(1.-v.a)*w;}vec4 I(vec3 v){vec4 w,x,A;w=E();x=vec4(0);if(f.x>0.){x=F(d.xy,e.xy,w.xy);int A=int(f.y+.5);x=G(x,v,A)*f.x;}A=vec4(0);if(f.z>0.){A=F(d.zw,e.zw,w.zw);int B=int(f.w+.5);A=G(A,v,B)*f.z;}return H(x,A);}void main(){vec3 v=c.rgb;if(a)if(f.x>0.||f.z>0.){vec4 w=I(v);v=H(w,vec4(v,1)).rgb;}gl_FragColor=vec4(v,c.a);}";
        this.c = new uia();
        this.b = new rjs((byte[]) null, (byte[]) null);
    }

    public qsb(boolean[] zArr) {
        this.d = "precision highp float;varying vec4 a;varying vec2 b;uniform mat4 c;uniform mat3 d;attribute vec4 e;attribute vec4 f;attribute vec2 g;void main(){gl_Position=c*e;b=(d*vec3(g,1)).xy;a=f;}";
        this.a = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D h;uniform float i;void main(){gl_FragColor=a*texture2D(h,b,i);}";
        this.c = new qsb((byte[]) null, (int[]) null);
        this.b = new kex();
    }

    public qsb(sm smVar, Executor executor, xwx xwxVar) {
        this.d = new ConcurrentHashMap();
        this.c = ((vaa) smVar.a).a;
        this.a = xwxVar;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public qsb(ufp ufpVar, ujl[] ujlVarArr) {
        int length;
        this.b = ufpVar;
        this.d = ujlVarArr;
        int i = 0;
        int length2 = 0;
        while (true) {
            length = ujlVarArr.length;
            if (i >= length) {
                break;
            }
            length2 += ujlVarArr[i].e.length;
            i++;
        }
        this.c = new ufh[length2];
        this.a = new ArrayList(length);
        int i2 = 0;
        for (ujl ujlVar : ujlVarArr) {
            this.a.add(new ArrayList());
            for (toq toqVar : ujlVar.e) {
                ((ufh[]) this.c)[i2] = new ufh(toqVar);
                i2++;
            }
        }
    }

    public qsb(ackk ackkVar, Optional optional, Optional optional2, Optional optional3) {
        this.c = ackkVar;
        this.b = optional;
        this.a = optional2;
        this.d = optional3;
    }

    public qsb(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        String strBn = a.bn(utm.d, "#define _a ", "\n");
        this.d = strBn.concat("precision highp float;varying vec2 a;attribute vec2 b;attribute vec2 c;void main(){gl_Position=vec4(b,0,1);a=c;}");
        this.a = strBn.concat("precision highp float;varying vec2 a;uniform float d,e,i[2],j;uniform sampler2D f;uniform vec4 g[_a],h[2];void main(){for(int k=0;k<2;k++)if(abs(i[k]-a.y)<j){gl_FragColor=h[k];return;}int l;float m,n;m=e*.5;n=0.;for(l=0;l<_a;l++){vec2 o=vec2(m,a.x+d);vec4 p=texture2D(f,o);n+=p.r;if(n>a.y)break;m+=e;}if(l>=_a)discard;else gl_FragColor=vec4(g[l].rgb,.5);}");
        this.c = new rfe((byte[]) null);
        this.b = new rjg((byte[]) null);
    }

    public qsb(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        String str = "#define _a 131068.0\n#define _b 4.0\n#define _c 0.421875\n#define _d 0.46875\n#define _e 1.5259021896696422E-5\n#define _f " + ugg.b + "\n#define _g 4.0\n";
        this.d = str.concat("varying float a;varying vec2 b,c;\n#ifdef VERTEX_TEXTURES\nvarying vec4 d;\n#else\nvarying float e;varying vec2 f;varying vec3 g;\n#endif\nuniform float h,i,j,k,l,m;uniform mat4 n;uniform sampler2D o;uniform vec4 q;attribute vec4 r;attribute vec4 s;attribute vec4 t;attribute vec4 u;attribute vec4 v;\n#ifdef VERTEX_TEXTURES\nfloat ba(vec4 w){float x=w[3];x/=255.;x+=w[2];x/=255.;x+=w[1];x/=255.;x+=w[0];return x;}\n#endif\nfloat ca(float w){float x=w/255.;return 2.*_f*(x-.5);}void da(in float w,in float x,out vec2 A){A.x=ca(t.z);A.y=ca(t.w);}vec4 ea(vec4 w,vec4 x){return (256.*w+x)/257.;}float fa(vec2 w){float x=(w.y*256.+w.x)*_b;return x-_a;}void main(){vec2 w,G,X,Y;da(t.z,t.w,w);float x,A,B,C,D,E,F,H,I,J,K,Q,S,T,W;x=m;A=s.x;B=s.y/_g;C=s.z;D=s.w;if(C<.5&&l<1.)a=0.;else a=l;E=(C+.5)*k;F=(C+.5)*k;G=r.xy;H=A*5.;I=(H+.5)/x;J=4.;K=(J+.5)*k;vec4 L,M,R;\n#ifdef VERTEX_TEXTURES\nvec2 N,O;N=vec2(q.y+K,I);O=N+vec2(k,0);L=ea(texture2D(o,N),texture2D(o,O));N.x=q.z+K;O.x=N.x+k;M=ea(texture2D(o,N),texture2D(o,O));\n#else\nvec4 P=ea(u,v)/255.;if(q.w<.1){L=vec4(P.r);M=vec4(P.g);}else if(q.w<1.1){L=vec4(P.g);M=vec4(P.b);}else{L=vec4(P.b);M=vec4(P.a);}\n#endif\nQ=min(1.,max(0.,q.x));R=(1.-Q)*L+Q*M;if(C<.5)S=R[0];else if(C<1.5)S=R[1];else if(C<2.5)S=R[2];else if(C<3.5)S=R[3];else S=0.;T=S*j;if(h>=B)gl_Position=n*vec4(G+T*w,0,1);else gl_Position=vec4(0);\n#ifdef VERTEX_TEXTURES\nvec4 U=texture2D(o,vec2(F,I));float V=ba(U);\n#else\ne=F;float V=1.;\n#endif\nV*=i;W=fa(t.xy);if(W<=-1.5)W=255.*S-(W+2.);else if(W<0.)W=-255.*S;b.x=W*V;b.y=(A*5.+C+1.5)/x;if(D<1.){c.x=0.;c.y=1.;}else if(D<2.){c.x=1.;c.y=1.;}else if(D<3.){c.x=0.;c.y=0.;}else if(D<4.){c.x=1.;c.y=0.;}else if(D<5.){c.x=0.;c.y=0.;}else if(D<6.){c.x=1.;c.y=0.;}else if(D<7.){c.x=.5;c.y=0.;}X=vec2(_d,_c);Y=vec2(.5,0);c=Y+(c-Y)*X;\n#ifdef VERTEX_TEXTURES\nvec4 Z,aa;Z=texture2D(o,vec2(q.y+E,I));aa=texture2D(o,vec2(q.z+E,I));d=(1.-Q)*Z+Q*aa;\n#else\ng=vec3(q.y+E,q.z+E,I);f=vec2(1.-Q,Q);\n#endif\n}");
        this.a = str.concat("#ifdef VERTEX_TEXTURES\nprecision lowp float;\n#else\nprecision highp float;\n#endif\nvarying float a;varying vec2 b,c;\n#ifdef VERTEX_TEXTURES\nvarying vec4 d;\n#else\nvarying float e;varying vec2 f;varying vec3 g;\n#endif\n#ifndef VERTEX_TEXTURES\nfloat C(vec4 A){float B=A[3];B/=255.;B+=A[2];B/=255.;B+=A[1];B/=255.;B+=A[0];return B;}\n#endif\nuniform sampler2D w,x;void main(){float A=texture2D(x,c,-.25).a;\n#ifdef VERTEX_TEXTURES\nA*=texture2D(w,b).a;\n#else\nvec2 B=b;B.x*=C(texture2D(w,vec2(e,g.z)));vec4 d=f.r*texture2D(w,g.xz)+f.g*texture2D(w,g.yz);A*=texture2D(w,B).a;\n#endif\nA*=a;gl_FragColor=vec4(d.rgb,A);}");
        this.c = new ugn();
        this.b = new ajdr((byte[]) null, (byte[]) null);
    }

    public qsb(short[] sArr) {
        this.b = new uww();
        this.a = new uwx();
        this.d = new uwx();
        this.c = new too();
    }

    public qsb(qyb qybVar, Looper looper) throws RemoteException {
        this.b = new CopyOnWriteArrayList();
        if (omc.c("CAR.RADIO", 3)) {
            rrd.a("CAR.RADIO", null, "CarRadioManager");
        }
        this.c = new sss(looper, new gly(this, 10));
        this.a = qybVar;
        qyd qydVar = new qyd(this);
        this.d = qydVar;
        qybVar.s(qydVar);
    }

    public qsb(qrv qrvVar, ykd ykdVar) {
        this.a = new Object();
        this.d = new HashMap();
        this.c = qrvVar;
        this.b = ykdVar;
    }

    public qsb() {
        String str = "#define _a 1.5259021896696422E-5\n#define _b 8\n#define _c " + ugg.b + "\n#define _d 8\n#define _e 14\n";
        this.d = str.concat("precision highp float;varying float a,c;varying vec4 b,d;attribute vec4 e;attribute vec4 f;attribute vec4 g;uniform mat4 h,i,j;uniform vec2 k[_d];uniform float l,m,n,o;uniform bool p;uniform ivec2 q[_e];uniform vec4 r,s;float C(float t,float u){float v=(t*256.+u)*_a;return 2.*_c*o*(v-.5);}void D(in vec4 t,out vec2 u){u.x=C(t.x,t.y);u.y=C(t.z,t.w);}float E(float t){if(t<-m)t=t+n;if(t>m)t=t-n;return t;}void main(){vec2 t,w;D(g,t);int u,v;u=int(f.x+.5);v=int(f.w+.5);a=float(u);w=e.xy;c=k[u].x;float x,A,B;x=(c/2.+1.)*l;A=(c+2.)/c;if(p){gl_Position=h*vec4(w,0,1);gl_Position.x=E(gl_Position.x);vec4 B=h*vec4(x*t,0,0);gl_Position=gl_Position+B;gl_Position=i*gl_Position;}else gl_Position=j*vec4(w+x*t,0,1);b.zw=vec2(1,0);if(v>_b-1){b.zw=vec2(0,1);v=v-_b;}b.xy=vec2(q[v])*.5;b=(b-.5)*A+.5;B=f.z/255.;d=mix(r,s,B);}");
        this.c = str.concat("precision highp float;varying float a,c;varying vec4 b,d;uniform sampler2D t,u;uniform float v;void main(){if(b.y>1.)discard;vec4 w,x;w=texture2D(t,b.xy,-.5);x=texture2D(u,b.xy,-.5);float A,B;A=b.z*w.a+b.w*x.a;B=clamp((1.+c)/2.-c*abs(b.x-.5),0.,1.);gl_FragColor=vec4(d.rgb,1)*d.a*v*A*B;}");
        this.a = new ugd();
        this.b = new ohb(null, null);
    }

    public qsb(trd trdVar) {
        this.d = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.a = trdVar.a;
        this.b = trdVar.b;
    }

    public qsb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        String str = "#define _a 1.5259021896696422E-5\n#define _b 8\n#define _c " + ugg.b + "\n#define _d 8\n#define _e 14\n#define _f 96\n#define _g " + ugg.c + "\n#define _h 32\n#define _i 64\n#define _j 4\n#define _k 3\n";
        this.d = str.concat("precision highp float;varying float a,d,f;varying highp vec2 b;varying vec4 c;varying highp float e;attribute vec4 g;attribute vec4 h;attribute vec4 i;uniform mat4 j,k,l;uniform vec2 m[_d];uniform float n,o,p,q;uniform bool r;uniform ivec2 s[_e];float D(float u,float v){float w=(u*256.+v)*_a;return 2.*_c*q*(w-.5);}void E(in vec4 u,out vec2 v){v.x=D(u.x,u.y);v.y=D(u.z,u.w);}float F(float u){if(u<-o)u=u+p;if(u>o)u=u-p;return u;}void main(){vec2 u,x;E(i,u);int v,w;v=int(h.x+.5);w=int(h.w+.5);a=float(v);x=g.xy;d=m[v].x;float A,B;A=0.;B=0.;if(d>0.){A=(d/2.+1.)*n;B=(d+2.)/d;}if(r){gl_Position=j*vec4(x,0,1);gl_Position.x=F(gl_Position.x);vec4 C=j*vec4(A*u,0,0);gl_Position=gl_Position+C;gl_Position=k*gl_Position;}else gl_Position=l*vec4(x+A*u,0,1);e=g.z;if(e<=-1.5){e=-(e+2.);e+=n*d/2.;}else if(e<0.)e+=-n*d/2.;e+=d/2.;b.y=e/n;c.zw=vec2(1,0);if(w>_b-1){c.zw=vec2(0,1);w=w-_b;}c.xy=vec2(s[w])*.5;c=(c-.5)*B+.5;b.x=c.x;f=h.z/255.;}");
        this.a = str.concat("precision highp float;const vec3 I=vec3(.54,0,.45);varying float a,d,f;varying highp vec2 b;varying vec4 c;varying highp float e;uniform sampler2D t,u,v,w,x;uniform float A,B,E,F,G;uniform highp float C;uniform int D;uniform bool H;void main(){if(c.y>1.)discard;vec2 J,Q,S,Y;J=b;J.y*=C/d;vec4 K,L,M,R,T,U,V,W;K=texture2D(v,J);L=texture2D(t,c.xy,-.5);M=texture2D(u,c.xy,-.5);float N,O,P,X,Z,aa;N=c.z*L.a+c.w*M.a;O=A+.5;P=a*float(_j)*float(_k)+float(D)*float(_k)+.5;Q=vec2(O/float(_g),P/float(_f));R=texture2D(w,Q);S=vec2(O/float(_g),(P+1.)/float(_f));T=texture2D(w,S);U=R*(1.-f)+T*f;if(H){vec2 W=vec2(O/float(_g),(P+2.)/float(_f));V=texture2D(w,W);}else{float W=dot(U.rgb,I);V=vec4(vec3(W),U.a);}W=mix(V,U,step(G,e));X=mod(b.y*8.,E)/F;Y=vec2(X/float(_i),(a*float(_j)+float(D)+.5)/float(_h));Z=texture2D(x,Y).r;Z=clamp((Z-.5)*F+.5,0.,1.);aa=clamp((1.+d)/2.-d*abs(J.x-.5),0.,1.);gl_FragColor=vec4(W.rgb,1)*vec4(K.rgb/K.a,1)*W.a*K.a*B*N*Z*aa;}");
        this.c = new ugf();
        this.b = new ohb((char[]) null);
    }

    public qsb(byte[] bArr, byte[] bArr2) {
        this.a = new yez(null);
        this.c = new HashSet();
        this.d = new HashMap();
        this.b = new yfa();
    }

    public qsb(byte[] bArr) {
        this.d = DesugarCollections.synchronizedMap(new HashMap());
        this.a = DesugarCollections.synchronizedMap(new HashMap());
        this.c = new HashMap();
        this.b = new HashMap();
    }
}

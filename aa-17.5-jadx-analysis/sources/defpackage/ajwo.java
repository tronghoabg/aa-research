package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes2.dex */
public final class ajwo implements ajrf {
    protected final ajso a;
    protected final ajth b;
    protected final ajow c;
    protected final ajss d;
    protected final akbc e;
    protected final ajqz f;
    protected final ajre g;
    protected final ajqr h;
    protected final ajqr i;
    protected final ajrh j;
    protected final akas k;
    protected ajsy l;
    protected final ajqe m;
    protected final ajqe n;
    private final Log o;
    private final ajwt p;
    private int q;
    private int r;
    private final int s;
    private ajpe t;

    public ajwo(Log log, akbd akbdVar, ajso ajsoVar, ajow ajowVar, ajss ajssVar, ajth ajthVar, akbc akbcVar, ajqz ajqzVar, ajre ajreVar, ajqr ajqrVar, ajqr ajqrVar2, ajrh ajrhVar, akas akasVar) {
        ahgm.e(log, "Log");
        ahgm.e(akbdVar, "Request executor");
        ahgm.e(ajsoVar, "Client connection manager");
        ahgm.e(ajowVar, "Connection reuse strategy");
        ahgm.e(ajssVar, "Connection keep alive strategy");
        ahgm.e(ajthVar, "Route planner");
        ahgm.e(akbcVar, "HTTP protocol processor");
        ahgm.e(ajqzVar, "HTTP request retry handler");
        ahgm.e(ajreVar, "Redirect strategy");
        ahgm.e(ajqrVar, "Target authentication strategy");
        ahgm.e(ajqrVar2, "Proxy authentication strategy");
        ahgm.e(ajrhVar, "User token handler");
        ahgm.e(akasVar, "HTTP parameters");
        this.o = log;
        this.p = new ajwt(log);
        this.a = ajsoVar;
        this.c = ajowVar;
        this.d = ajssVar;
        this.b = ajthVar;
        this.e = akbcVar;
        this.f = ajqzVar;
        this.g = ajreVar;
        this.h = ajqrVar;
        this.i = ajqrVar2;
        this.j = ajrhVar;
        this.k = akasVar;
        if (ajreVar instanceof ajwn) {
            ajrd ajrdVar = ((ajwn) ajreVar).a;
        }
        if (ajqrVar instanceof ajvz) {
            ajqq ajqqVar = ((ajvz) ajqrVar).a;
        }
        if (ajqrVar2 instanceof ajvz) {
            ajqq ajqqVar2 = ((ajvz) ajqrVar2).a;
        }
        this.l = null;
        this.q = 0;
        this.r = 0;
        this.m = new ajqe();
        this.n = new ajqe();
        this.s = akasVar.c("http.protocol.max-redirects", 100);
    }

    protected static final void c(ajww ajwwVar, ajtg ajtgVar) throws ajps {
        try {
            URI uri = ajwwVar.b;
            ajwwVar.b = (ajtgVar.c() == null || ajtgVar.g()) ? uri.isAbsolute() ? ajsi.d(uri, null, ajsi.b) : ajsi.c(uri) : !uri.isAbsolute() ? ajsi.d(uri, ajtgVar.a, ajsi.b) : ajsi.c(uri);
        } catch (URISyntaxException e) {
            throw new ajps("Invalid URI: ".concat(ajwwVar.p().c), e);
        }
    }

    private final void e() {
        ajsy ajsyVar = this.l;
        if (ajsyVar != null) {
            this.l = null;
            try {
                ajsyVar.hY();
            } catch (IOException e) {
                Log log = this.o;
                if (log.isDebugEnabled()) {
                    log.debug(e.getMessage(), e);
                }
            }
            try {
                ajsyVar.hZ();
            } catch (IOException e2) {
                this.o.debug("Error releasing connection", e2);
            }
        }
    }

    private static final ajww f(ajph ajphVar) throws ajps {
        return ajphVar instanceof ajpc ? new ajws((ajpc) ajphVar) : new ajww(ajphVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x042d, code lost:
    
        r0 = r11.b.getUserInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0433, code lost:
    
        if (r0 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0435, code lost:
    
        r34.m.b(new defpackage.ajvi(), new defpackage.ajqo(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0444, code lost:
    
        r0 = r34.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0446, code lost:
    
        if (r0 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0448, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x044b, code lost:
    
        r0 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0451, code lost:
    
        if (r0.isAbsolute() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0453, code lost:
    
        r17 = defpackage.ajsi.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0457, code lost:
    
        if (r17 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0459, code lost:
    
        r3 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x045d, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x045f, code lost:
    
        r11.d.b();
        r11.i(r11.a.l());
        c(r11, r9);
        r8.x("http.target_host", r3);
        r8.x(r12, r9);
        r8.x(r10, r34.l);
        defpackage.akbd.c(r11, r34.e, r8);
        r4 = r2.a;
        r5 = r2.b;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0485, code lost:
    
        r34.q++;
        r4.c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0494, code lost:
    
        if (r4.q() != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0496, code lost:
    
        r34.o.debug("Cannot retry non-repeatable request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x049d, code lost:
    
        if (r0 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a4, code lost:
    
        throw new defpackage.ajrb(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04aa, code lost:
    
        throw new defpackage.ajrb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04b1, code lost:
    
        if (r34.l.i() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04b3, code lost:
    
        r0 = r5.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04b7, code lost:
    
        r6 = r34.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b9, code lost:
    
        if (r0 != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04bb, code lost:
    
        r6.debug("Reopening the direct connection.");
        r34.l.p(r5, r8, r34.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04c8, code lost:
    
        r6.debug("Proxied connection. Need to start over.");
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04cf, code lost:
    
        r0 = r34.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d5, code lost:
    
        if (r0.isDebugEnabled() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04d7, code lost:
    
        r0.debug("Attempt " + r34.q + " to execute request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04f8, code lost:
    
        r5 = defpackage.akbd.d(r4, r34.l, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04f9, code lost:
    
        if (r5 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04fb, code lost:
    
        r5.j(r34.k);
        defpackage.akbd.b(r5, r34.e, r8);
        r0 = r34.c.a(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x050b, code lost:
    
        if (r0 == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x050d, code lost:
    
        r6 = r34.d.getKeepAliveDuration(r5, r8);
        r4 = r34.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0519, code lost:
    
        if (r4.isDebugEnabled() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x051f, code lost:
    
        if (r6 <= 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0521, code lost:
    
        r9 = "for " + r6 + " " + java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0541, code lost:
    
        r9 = "indefinitely";
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0543, code lost:
    
        r4.debug(defpackage.a.bz(r9, "Connection can be kept alive "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x054c, code lost:
    
        r34.l.q(r6, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0553, code lost:
    
        r9 = r2.b;
        r10 = r2.a;
        r11 = r10.hX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0563, code lost:
    
        if (defpackage.akat.f(r11) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0565, code lost:
    
        r4 = (defpackage.ajpe) r8.v("http.target_host");
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x056b, code lost:
    
        if (r4 != null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x056d, code lost:
    
        r4 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0571, code lost:
    
        if (r4.c >= 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0573, code lost:
    
        r7 = r34.a.b();
        defpackage.ahgm.e(r4, "Host");
        r15 = r4.d;
        r23 = r2;
        r4 = new defpackage.ajpe(r4.a, r7.a(r15).c, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0591, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0593, code lost:
    
        r17 = r3;
        r3 = r34.p;
        r2 = "Resetting proxy auth state";
        r6 = r34.h;
        r7 = r34.m;
        r15 = r3.b(r4, r5, r6, r7, r8);
        r24 = r4;
        r4 = r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05aa, code lost:
    
        if (r4 != null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05ac, code lost:
    
        r4 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05ae, code lost:
    
        r6 = r34.i;
        r7 = r34.n;
        r28 = r3.b(r4, r5, r6, r7, r37);
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05be, code lost:
    
        if (r15 == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05cc, code lost:
    
        if (r3.a(r24, r5, r6, r7, r37) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05ce, code lost:
    
        r8 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05d1, code lost:
    
        if (r28 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05d3, code lost:
    
        r8 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05df, code lost:
    
        if (r3.a(r31, r5, r6, r7, r8) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05e1, code lost:
    
        r3 = r23;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x05e6, code lost:
    
        r8 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05e9, code lost:
    
        r23 = r2;
        r17 = r3;
        r2 = "Resetting proxy auth state";
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05ee, code lost:
    
        defpackage.ahgm.e(r11, "HTTP parameters");
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05f8, code lost:
    
        if (r11.d("http.protocol.handle-redirects", true) == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05fa, code lost:
    
        r3 = r34.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0600, code lost:
    
        if (r3.b(r10, r5, r8) == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0602, code lost:
    
        r4 = r34.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0606, code lost:
    
        if (r4 >= r34.s) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0608, code lost:
    
        r34.r = r4 + 1;
        r34.t = null;
        r3 = r3.a(r10, r5, r8);
        r3.i(r10.a.l());
        r4 = r3.t();
        r10 = defpackage.ajsi.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0624, code lost:
    
        if (r10 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x062c, code lost:
    
        if (r9.a.equals(r10) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x062e, code lost:
    
        r14 = r34.o;
        r14.debug("Resetting target auth state");
        r34.m.a();
        r15 = r34.n;
        r6 = r15.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x063c, code lost:
    
        if (r6 == null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0642, code lost:
    
        if (r6.f() == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0644, code lost:
    
        r14.debug(r2);
        r15.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x064a, code lost:
    
        r3 = f(r3);
        r3.j(r11);
        r6 = d(r10, r3);
        r10 = new defpackage.ajwx(r3, r6);
        r3 = r34.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0660, code lost:
    
        if (r3.isDebugEnabled() == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0662, code lost:
    
        r3.debug("Redirecting to '" + java.lang.String.valueOf(r4) + "' via " + r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0686, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x069b, code lost:
    
        throw new defpackage.ajps("Redirect URI does not specify a valid host name: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r4))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06b9, code lost:
    
        throw new defpackage.ajrc("Maximum redirects (" + r34.s + ") exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06ba, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x06bb, code lost:
    
        if (r3 != null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06bd, code lost:
    
        r18 = r7;
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06c2, code lost:
    
        if (r0 == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06c4, code lost:
    
        defpackage.ahkt.a(((defpackage.akac) r5).a);
        r34.l.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x06d2, code lost:
    
        r34.l.close();
        r4 = r34.n;
        r6 = r4.a;
        r7 = defpackage.ajpx.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06e1, code lost:
    
        if (r6.compareTo(r7) <= 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06e3, code lost:
    
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x06e5, code lost:
    
        if (r6 == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x06eb, code lost:
    
        if (r6.f() == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06ed, code lost:
    
        r34.o.debug(r2);
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x06f5, code lost:
    
        r2 = r34.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x06fd, code lost:
    
        if (r2.a.compareTo(r7) <= 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x06ff, code lost:
    
        r4 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0701, code lost:
    
        if (r4 == null) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0707, code lost:
    
        if (r4.f() == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0709, code lost:
    
        r34.o.debug("Resetting target auth state");
        r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0717, code lost:
    
        if (r3.b.equals(r9) != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0719, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x071c, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0720, code lost:
    
        if (r34.l == null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0722, code lost:
    
        if (r16 != null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0724, code lost:
    
        r15 = r34.j.a(r8);
        r2 = r25;
        r8.x(r2, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0730, code lost:
    
        r2 = r25;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0734, code lost:
    
        if (r15 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0736, code lost:
    
        r34.l.r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x073c, code lost:
    
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x073e, code lost:
    
        r4 = r0;
        r12 = r2;
        r0 = r5;
        r9 = r19;
        r11 = r20;
        r10 = r22;
        r7 = r27;
        r2 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x074d, code lost:
    
        r23 = r2;
        r17 = r3;
        r2 = r36;
        r0 = r5;
        r9 = r19;
        r11 = r20;
        r4 = r21;
        r10 = r22;
        r3 = r23;
        r12 = r25;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0764, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0765, code lost:
    
        r23 = r2;
        r17 = r3;
        r2 = r25;
        r34.o.debug("Closing the connection.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0773, code lost:
    
        r34.l.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0780, code lost:
    
        if (r34.f.a(r0, r4.c, r8) != false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0782, code lost:
    
        r3 = r34.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0788, code lost:
    
        if (r3.isInfoEnabled() != false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x078a, code lost:
    
        r6 = r0.getClass().getName();
        r9 = r5.toString();
        r10 = r0.getMessage();
        r11 = new java.lang.StringBuilder();
        r12 = r22;
        r11.append(r12);
        r11.append(r6);
        r11.append(") caught when processing request to ");
        r11.append(r9);
        r6 = r19;
        r11.append(r6);
        r11.append(r10);
        r3.info(r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x07bf, code lost:
    
        r6 = r19;
        r12 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x07c7, code lost:
    
        if (r3.isDebugEnabled() != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x07c9, code lost:
    
        r3.debug(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x07d4, code lost:
    
        if (r3.isInfoEnabled() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x07d6, code lost:
    
        r3.info("Retrying request to ".concat(r5.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x07e3, code lost:
    
        r25 = r2;
        r19 = r6;
        r22 = r12;
        r3 = r17;
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07f1, code lost:
    
        if ((r0 instanceof defpackage.ajpq) != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x07f3, code lost:
    
        r2 = new defpackage.ajpq(r5.a.a().concat(" failed to respond"));
        r2.setStackTrace(r0.getStackTrace());
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x080b, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x080c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ed A[Catch: IOException -> 0x0860, ajwz -> 0x08ff, RuntimeException -> 0x0912, ajpd -> 0x0916, ajxf -> 0x0957, TRY_LEAVE, TryCatch #20 {IOException -> 0x0860, blocks: (B:67:0x015e, B:70:0x016a, B:76:0x017a, B:78:0x0180, B:80:0x0186, B:82:0x018c, B:85:0x0193, B:87:0x0199, B:90:0x01a1, B:92:0x01a7, B:95:0x01af, B:98:0x01b6, B:101:0x01c3, B:105:0x01d0, B:108:0x01d7, B:110:0x01db, B:117:0x01ed), top: B:444:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0899 A[Catch: ajwz -> 0x08ff, RuntimeException -> 0x0912, IOException -> 0x0914, ajpd -> 0x0916, ajxf -> 0x0957, TryCatch #4 {IOException -> 0x0914, blocks: (B:14:0x0063, B:17:0x0073, B:19:0x007d, B:20:0x0083, B:22:0x0090, B:25:0x00a6, B:26:0x00ae, B:28:0x00ba, B:30:0x00c2, B:32:0x00d1, B:36:0x00ed, B:38:0x00f1, B:40:0x00fa, B:367:0x088f, B:369:0x0899, B:371:0x08a1, B:373:0x08d7, B:374:0x08de, B:376:0x08fe, B:208:0x042d, B:210:0x0435, B:211:0x0444, B:218:0x0459, B:220:0x045f, B:221:0x0485, B:223:0x0496, B:225:0x049f, B:226:0x04a4, B:227:0x04a5, B:228:0x04aa, B:242:0x04fb, B:244:0x050d, B:248:0x0521, B:250:0x0543, B:251:0x054c, B:252:0x0553, B:255:0x0565, B:257:0x056d, B:258:0x056f, B:260:0x0573, B:262:0x0593, B:264:0x05ac, B:265:0x05ae, B:267:0x05c0, B:322:0x071e, B:325:0x0724, B:328:0x0736, B:303:0x06c4, B:318:0x0711, B:320:0x0719, B:304:0x06d2, B:306:0x06e3, B:308:0x06e7, B:310:0x06ed, B:311:0x06f5, B:313:0x06ff, B:315:0x0703, B:317:0x0709, B:271:0x05d3, B:276:0x05ee, B:278:0x05fa, B:280:0x0602, B:282:0x0608, B:284:0x0626, B:286:0x062e, B:288:0x063e, B:290:0x0644, B:291:0x064a, B:293:0x0662, B:295:0x0688, B:296:0x069b, B:297:0x069c, B:298:0x06b9, B:333:0x0765, B:335:0x0778, B:337:0x0782, B:339:0x078a, B:341:0x07c3, B:343:0x07c9, B:344:0x07d0, B:346:0x07d6, B:348:0x07ef, B:350:0x07f3, B:351:0x080b, B:352:0x080c, B:214:0x044b, B:216:0x0453, B:378:0x0900, B:380:0x0908, B:381:0x090f, B:390:0x091c, B:392:0x0922, B:395:0x092d, B:398:0x0942, B:399:0x0947, B:33:0x00dc, B:34:0x00e8, B:23:0x009d), top: B:418:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x08fe A[SYNTHETIC] */
    @Override // defpackage.ajrf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajpj a(defpackage.ajpe r35, defpackage.ajph r36, defpackage.akba r37) throws defpackage.ajpd, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwo.a(ajpe, ajph, akba):ajpj");
    }

    protected final void b() {
        try {
            this.l.hZ();
        } catch (IOException e) {
            this.o.debug("IOException releasing connection", e);
        }
        this.l = null;
    }

    protected final ajtg d(ajpe ajpeVar, ajph ajphVar) throws ajpd {
        if (ajpeVar == null) {
            ajpeVar = (ajpe) ajphVar.hX().a("http.default-host");
        }
        return this.b.a(ajpeVar, ajphVar);
    }
}

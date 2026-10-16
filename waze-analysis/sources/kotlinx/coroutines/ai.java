package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51347a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f51348b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f51349c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f51350d;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r0 = true;
     */
    static {
        /*
            java.lang.String r0 = kotlinx.coroutines.e.al.f()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5a
            int r3 = r0.hashCode()
            if (r3 == 0) goto L37
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L2e
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L25
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L41
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L41
            goto L5a
        L25:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L41
            goto L5a
        L2e:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L41
            goto L3f
        L37:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L41
        L3f:
            r0 = r1
            goto L5b
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L5a:
            r0 = r2
        L5b:
            kotlinx.coroutines.ai.f51348b = r0
            int r3 = kotlinx.coroutines.c.d.f51787a
            boolean r3 = kotlinx.coroutines.c.d.a()
            if (r3 != 0) goto L71
            if (r0 == 0) goto L70
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.e.al.b(r0, r1)
            if (r0 == 0) goto L70
            goto L71
        L70:
            r1 = r2
        L71:
            kotlinx.coroutines.ai.f51349c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.ai.f51350d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ai.<clinit>():void");
    }

    public static final AtomicLong a() {
        return f51350d;
    }

    public static final boolean b() {
        return f51348b;
    }

    public static final boolean c() {
        return f51349c;
    }
}

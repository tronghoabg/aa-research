package fa;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f35274a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f35275b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static C2619a a(d dVar) {
        Map dependencies = f35275b;
        AbstractC3340k.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (C2619a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:22:0x00a2, B:25:0x00b7, B:26:0x00cf), top: B:31:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a0 -> B:21:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.AbstractC3464c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof fa.b
            if (r0 == 0) goto L13
            r0 = r11
            fa.b r0 = (fa.b) r0
            int r1 = r0.f35273i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35273i = r1
            goto L18
        L13:
            fa.b r0 = new fa.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f35271g
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f35273i
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r2 = r0.f35270f
            java.util.Map r4 = r0.f35269e
            java.util.Map r4 = (java.util.Map) r4
            Nf.a r5 = r0.f35268d
            Nf.a r5 = (Nf.a) r5
            fa.d r6 = r0.f35267c
            java.util.Iterator r7 = r0.f35266b
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.util.Map r8 = r0.f35265a
            java.util.Map r8 = (java.util.Map) r8
            Fe.e.U(r11)
            goto La1
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L43:
            Fe.e.U(r11)
            java.util.Map r11 = fa.c.f35275b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC3340k.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = ff.AbstractC2641B.D(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L66:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld5
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            fa.d r6 = (fa.d) r6
            java.lang.Object r11 = r11.getValue()
            fa.a r11 = (fa.C2619a) r11
            Nf.d r5 = r11.f35263a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.f35265a = r11
            r8 = r7
            java.util.Iterator r8 = (java.util.Iterator) r8
            r0.f35266b = r8
            r0.f35267c = r6
            r0.f35268d = r5
            r0.f35269e = r11
            r0.f35270f = r2
            r0.f35273i = r3
            java.lang.Object r11 = r5.b(r0)
            if (r11 != r1) goto La0
            return r1
        La0:
            r8 = r4
        La1:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r9)     // Catch: java.lang.Throwable -> Ld0
            fa.a r9 = a(r6)     // Catch: java.lang.Throwable -> Ld0
            R8.j r9 = r9.f35264b     // Catch: java.lang.Throwable -> Ld0
            if (r9 == 0) goto Lb7
            r5.a(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L66
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld0
            r1.append(r6)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld0
            throw r0     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r0 = move-exception
            r5.a(r11)
            throw r0
        Ld5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.c.b(lf.c):java.lang.Object");
    }
}

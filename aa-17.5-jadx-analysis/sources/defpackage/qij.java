package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qij {
    public final Object a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public qij(Context context) {
        this.d = context;
        this.b = woy.dG(new nxb(this, 16));
        this.a = woy.dG(new nxb(this, 17));
        this.c = woy.dG(new nxb(this, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized Optional a() {
        ype ypeVar = (ype) qik.a.l().ai(7346);
        ?? r2 = this.b;
        ypeVar.M("User triggered surveys: %s triggerType: %s", r2, this.c);
        if (r2.isEmpty()) {
            return Optional.empty();
        }
        boolean zAnyMatch = Collection.EL.stream(r2).anyMatch(new oly(14));
        List list = r2;
        if (zAnyMatch) {
            Stream streamFilter = Collection.EL.stream(r2).filter(new oly(15));
            int i = yfq.d;
            list = (List) streamFilter.collect(ycm.a);
        }
        Stream streamDistinct = Collection.EL.stream(list).map(new mix(this, 16)).distinct();
        int i2 = yfq.d;
        yfq yfqVar = (yfq) streamDistinct.collect(ycm.a);
        Object obj = this.d;
        return Optional.of((String) yfqVar.get(((qik) obj).c.nextInt(yfqVar.size())));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(com.google.android.apps.auto.components.telemetry.TelemetryEvent r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8.a     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5a
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5a
            qii r1 = (defpackage.qii) r1     // Catch: java.lang.Throwable -> L5a
            yzy r2 = r1.a     // Catch: java.lang.Throwable -> L5a
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            yxb r5 = r9.b     // Catch: java.lang.Throwable -> L5a
            int r5 = r5.b     // Catch: java.lang.Throwable -> L5a
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L33
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L5a
            yxb r5 = r9.b     // Catch: java.lang.Throwable -> L5a
            zab r5 = r5.o     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L2d
            zab r5 = defpackage.zab.a     // Catch: java.lang.Throwable -> L5a
        L2d:
            int r5 = r5.e     // Catch: java.lang.Throwable -> L5a
            if (r2 != r5) goto L33
            r2 = r3
            goto L34
        L33:
            r2 = r4
        L34:
            yyv r5 = r1.b     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L4d
            yxb r6 = r9.b     // Catch: java.lang.Throwable -> L5a
            int r7 = r6.b     // Catch: java.lang.Throwable -> L5a
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L4d
            yyz r6 = r6.p     // Catch: java.lang.Throwable -> L5a
            if (r6 != 0) goto L46
            yyz r6 = defpackage.yyz.a     // Catch: java.lang.Throwable -> L5a
        L46:
            int r5 = r5.fI     // Catch: java.lang.Throwable -> L5a
            int r6 = r6.d     // Catch: java.lang.Throwable -> L5a
            if (r5 != r6) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            if (r2 != 0) goto L52
            if (r3 == 0) goto L7
        L52:
            java.lang.Object r2 = r8.b     // Catch: java.lang.Throwable -> L5a
            r2.add(r1)     // Catch: java.lang.Throwable -> L5a
            goto L7
        L58:
            monitor-exit(r8)
            return
        L5a:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5a
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qij.b(com.google.android.apps.auto.components.telemetry.TelemetryEvent):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(abrq abrqVar) {
        for (abrp abrpVar : abrqVar.b) {
            abrr abrrVarB = abrr.b(abrpVar.f);
            if (abrrVarB == null) {
                abrrVarB = abrr.TRIGGER_TYPE_SESSION_END;
            }
            if (abrrVarB == this.c) {
                this.a.add(new qii(abrpVar));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d() {
        this.a.clear();
        this.b.clear();
    }

    public final float e(int i) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        ((Context) this.d).getResources().getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public qij(qik qikVar, abrr abrrVar) {
        this.d = qikVar;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = abrrVar;
    }
}

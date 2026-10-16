package com.waze.speech;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements okhttp3.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f40434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f40435b;

    f(CompletableDeferred completableDeferred, g gVar) {
        this.f40434a = completableDeferred;
        this.f40435b = gVar;
    }

    @Override // okhttp3.g
    public final void a(okhttp3.f fVar, IOException iOException) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "e");
        this.f40434a.a(b.f40431a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:9:0x0032, B:11:0x003b, B:14:0x0044, B:17:0x004c, B:16:0x004a), top: B:42:0x0032 }] */
    @Override // okhttp3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(okhttp3.f r5, okhttp3.aq r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "call"
            h.g.b.x.f(r5, r0)
            java.lang.String r5 = "response"
            h.g.b.x.f(r6, r5)
            boolean r5 = r6.o()
            if (r5 != 0) goto L25
            com.waze.speech.g r5 = r4.f40435b
            com.waze.shared_infra.i.e r5 = com.waze.speech.g.a(r5)
            java.lang.String r6 = "response unsuccessful"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.b(r6)
            kotlinx.coroutines.CompletableDeferred r4 = r4.f40434a
            com.waze.speech.b r5 = com.waze.speech.b.f40431a
            r4.a(r5)
            return
        L25:
            okhttp3.at r5 = r6.m()
            r6 = 0
            if (r5 == 0) goto L5f
            k.j r0 = r5.c()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            k.j r1 = (k.j) r1     // Catch: java.lang.Throwable -> L58
            okhttp3.ae r5 = r5.b()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L4a
            java.nio.charset.Charset r2 = h.n.a.f48221b     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r5.d()     // Catch: java.lang.Throwable -> L58
            if (r5 != 0) goto L44
            goto L48
        L44:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.Throwable -> L58
        L48:
            if (r2 != 0) goto L4c
        L4a:
            java.nio.charset.Charset r2 = h.n.a.f48221b     // Catch: java.lang.Throwable -> L58
        L4c:
            java.nio.charset.Charset r5 = okhttp3.internal.b.n(r1, r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r1.t(r5)     // Catch: java.lang.Throwable -> L58
            h.a.i.aW(r0, r6)
            goto L60
        L58:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L5a
        L5a:
            r5 = move-exception
            h.a.i.aW(r0, r4)
            throw r5
        L5f:
            r5 = r6
        L60:
            com.waze.speech.g r0 = r4.f40435b
            java.lang.String r1 = "successful response: "
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r2)
            com.waze.shared_infra.i.e r2 = com.waze.speech.g.a(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.a(r1)
            if (r5 == 0) goto Laf
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r1 = "\n"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r5 = h.n.o.af(r5, r1, r2, r3)
            if (r5 == 0) goto Laf
            int r1 = r5.size()
            java.util.ListIterator r5 = r5.listIterator(r1)
        L8f:
            boolean r1 = r5.hasPrevious()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r5.previous()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = h.n.o.G(r2)
            if (r2 != 0) goto L8f
            r6 = r1
        La5:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Laf
            kotlinx.coroutines.CompletableDeferred r4 = r4.f40434a
            com.waze.speech.g.c(r0, r6, r4)
            return
        Laf:
            kotlinx.coroutines.CompletableDeferred r5 = r4.f40434a
            com.waze.speech.f r4 = (com.waze.speech.f) r4
            com.waze.speech.c r4 = com.waze.speech.c.f40432a
            r5.a(r4)
            com.waze.shared_infra.i.e r4 = com.waze.speech.g.a(r0)
            java.lang.String r5 = "no result in response body"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.speech.f.b(okhttp3.f, okhttp3.aq):void");
    }
}

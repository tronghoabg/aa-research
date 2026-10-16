package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajon extends ajnf {
    public static final ajnr c;
    public final ClassLoader d;
    public final ajnf e;
    private final aezr f;

    static {
        String str = ajnr.a;
        c = ahfo.a("/");
    }

    public ajon(ClassLoader classLoader, ajnf ajnfVar) {
        ajnfVar.getClass();
        this.d = classLoader;
        this.e = ajnfVar;
        this.f = woy.dG(new afdr() { // from class: ajom
            /* JADX WARN: Code restructure failed: missing block: B:211:0x0543, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x0544, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:222:0x0577, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:223:0x057a, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
            
                r0 = (char) r5.x();
                r6 = (char) r5.x();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
            
                r19 = r8;
                r7 = (char) r5.x();
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0110, code lost:
            
                if (r7 != ((char) r5.x())) goto L296;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
            
                if (r0 != 0) goto L297;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
            
                if (r6 != 0) goto L298;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x011a, code lost:
            
                r5.A(4);
                r6 = r5.g();
                r8 = r1;
                r5.o((char) r5.x());
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
            
                r6 = r6 & 4294967295L;
                r13 = r13 - 20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
            
                if (r13 <= r16) goto L96;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
            
                r13 = defpackage.ahfm.b(r10.b(r13));
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
            
                if (r13.g() != 117853008) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0154, code lost:
            
                r0 = r13.g();
                r11 = r13.k();
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0160, code lost:
            
                r29 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
            
                if (r13.g() != 1) goto L299;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
            
                if (r0 != 0) goto L300;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
            
                r4 = defpackage.ahfm.b(r10.b(r11));
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
            
                r0 = r4.g();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0176, code lost:
            
                if (r0 != 101075792) goto L301;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0178, code lost:
            
                r4.A(12);
                r0 = r4.g();
                r11 = r4.g();
                r30 = r4.k();
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
            
                if (r30 != r4.k()) goto L302;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
            
                if (r0 != 0) goto L303;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0193, code lost:
            
                if (r11 != 0) goto L304;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0195, code lost:
            
                r4.A(8);
                r6 = r4.k();
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x019e, code lost:
            
                r4.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x01a1, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01a3, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01cf, code lost:
            
                throw new java.io.IOException("bad zip: expected " + defpackage.ahfy.a(101075792) + " but was " + defpackage.ahfy.a(r0));
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x01d0, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
            
                r4.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x01d6, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
            
                defpackage.adqs.y(r0, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
            
                r0 = r0;
                r30 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01ea, code lost:
            
                throw new java.io.IOException("unsupported zip: spanned");
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x01eb, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01ed, code lost:
            
                r29 = r4;
                r30 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x01f8, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
            
                r29 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
            
                r30 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x020b, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x020c, code lost:
            
                r1 = r0;
                r54 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0211, code lost:
            
                r29 = r4;
                r30 = r7;
             */
            /* JADX WARN: Removed duplicated region for block: B:284:0x045a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:306:0x020a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:312:0x053a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:313:0x0530 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:315:0x0522 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
            @Override // defpackage.afdr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1454
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ajom.invoke():java.lang.Object");
            }
        });
    }

    @Override // defpackage.ajnf
    public final ajoa a(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final List b(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final ajnd c(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final ajne e(ajnr ajnrVar) throws IOException {
        if (!ahfy.c(ajnrVar)) {
            return null;
        }
        ajnr ajnrVar2 = c;
        String string = ajoi.e(ajnrVar2, ajnrVar, true).g(ajnrVar2).toString();
        for (aezu aezuVar : (List) this.f.a()) {
            ajne ajneVarE = ((ajnf) aezuVar.a).e(((ajnr) aezuVar.b).h(string));
            if (ajneVarE != null) {
                return ajneVarE;
            }
        }
        return null;
    }

    @Override // defpackage.ajnf
    public final ajoc f(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void g(ajnr ajnrVar, ajnr ajnrVar2) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final ajoa j(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void k(ajnr ajnrVar) {
        throw null;
    }

    @Override // defpackage.ajnf
    public final void l(ajnr ajnrVar) throws IOException {
        toString();
        throw new IOException(toString().concat(" is read-only"));
    }
}

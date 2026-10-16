package com.google.d.c;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag implements Serializable, b {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    final bd f7271a;

    ag(h hVar) {
        this.f7271a = new bd(hVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0238, code lost:
    
        if (r8.d() != r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023a, code lost:
    
        r5.f();
        r2.set(r6, r4.e(r7, r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x0275, ExecutionException -> 0x0277, TRY_LEAVE, TryCatch #1 {ExecutionException -> 0x0277, blocks: (B:3:0x0015, B:5:0x0019, B:7:0x001f, B:9:0x002d, B:10:0x0037, B:12:0x0041, B:13:0x0047, B:44:0x00f1, B:89:0x01cd, B:127:0x0265, B:125:0x025f, B:126:0x0264, B:33:0x00c4, B:131:0x026e, B:132:0x0274), top: B:149:0x0015, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134 A[Catch: all -> 0x01dc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x01dc, blocks: (B:62:0x0134, B:86:0x01c8, B:81:0x0197, B:92:0x01d5, B:93:0x01db, B:96:0x01df, B:97:0x01fd, B:63:0x013f, B:65:0x0152, B:66:0x0159, B:68:0x016b, B:71:0x0177, B:73:0x017f, B:76:0x018b, B:79:0x0190, B:83:0x019b, B:84:0x01ad, B:85:0x01b3), top: B:155:0x0132, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01df A[Catch: all -> 0x01dc, TryCatch #6 {all -> 0x01dc, blocks: (B:62:0x0134, B:86:0x01c8, B:81:0x0197, B:92:0x01d5, B:93:0x01db, B:96:0x01df, B:97:0x01fd, B:63:0x013f, B:65:0x0152, B:66:0x0159, B:68:0x016b, B:71:0x0177, B:73:0x017f, B:76:0x018b, B:79:0x0190, B:83:0x019b, B:84:0x01ad, B:85:0x01b3), top: B:155:0x0132, inners: #2 }] */
    @Override // com.google.d.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r18, java.util.concurrent.Callable r19) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.ag.a(java.lang.Object, java.util.concurrent.Callable):java.lang.Object");
    }

    Object writeReplace() {
        return new ah(this.f7271a);
    }
}

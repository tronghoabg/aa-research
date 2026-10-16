package e.a.d;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ei {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46878a = Logger.getLogger(ei.class.getName());

    private ei() {
    }

    public static Object a(String str) {
        com.google.l.d.b bVar = new com.google.l.d.b(new StringReader(str));
        try {
            Object objB = b(bVar);
            try {
                bVar.close();
                return objB;
            } catch (IOException e2) {
                f46878a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e2);
                return objB;
            }
        } finally {
        }
    }

    private static Object b(com.google.l.d.b bVar) throws IOException {
        com.google.d.b.an.v(bVar.p(), "unexpected end of JSON");
        int iR = bVar.r() - 1;
        if (iR == 0) {
            bVar.i();
            ArrayList arrayList = new ArrayList();
            while (bVar.p()) {
                arrayList.add(b(bVar));
            }
            com.google.d.b.an.v(bVar.r() == 2, "Bad token: ".concat(bVar.e()));
            bVar.k();
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iR == 2) {
            bVar.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (bVar.p()) {
                String strG = bVar.g();
                com.google.d.b.an.q(!linkedHashMap.containsKey(strG), "Duplicate key found: %s", strG);
                linkedHashMap.put(strG, b(bVar));
            }
            com.google.d.b.an.v(bVar.r() == 4, "Bad token: ".concat(bVar.e()));
            bVar.l();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iR == 5) {
            return bVar.h();
        }
        if (iR == 6) {
            return Double.valueOf(bVar.a());
        }
        if (iR == 7) {
            return Boolean.valueOf(bVar.q());
        }
        if (iR != 8) {
            throw new IllegalStateException("Bad token: ".concat(bVar.e()));
        }
        bVar.m();
        return null;
    }
}

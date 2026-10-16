package com.google.firebase.crashlytics.a;

import com.google.firebase.crashlytics.a.d.q;
import com.google.firebase.crashlytics.a.d.t;
import h.g.b.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9694a;

    public f(com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9694a = cVar.a("com.crashlytics.settings.json");
    }

    public final void a(com.google.firebase.remoteconfig.a.a.f fVar) {
        x.f(fVar, "rolloutsState");
        Set setB = fVar.b();
        x.e(setB, "getRolloutAssignments(...)");
        Set<com.google.firebase.remoteconfig.a.a.e> set = setB;
        ArrayList arrayList = new ArrayList(h.a.i.q(set, 10));
        for (com.google.firebase.remoteconfig.a.a.e eVar : set) {
            arrayList.add(q.f(eVar.d(), eVar.b(), eVar.c(), eVar.e(), eVar.a()));
        }
        ((t) this.f9694a).o(arrayList);
        i.f9765a.b("Updated Crashlytics Rollout State");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileInputStream, java.io.InputStream] */
    public final JSONObject b() throws Throwable {
        ?? fileInputStream;
        JSONObject jSONObject;
        Object obj;
        String str = "Checking for cached settings...";
        i.a().b("Checking for cached settings...");
        ?? r1 = null;
        try {
            try {
                obj = this.f9694a;
            } catch (Throwable th) {
                th = th;
                r1 = str;
                com.google.firebase.crashlytics.a.c.g.j(r1, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.a.c.g.j(r1, "Error while closing settings cache file.");
            throw th;
        }
        if (!((File) obj).exists()) {
            i.a().g("Settings file does not exist.");
            jSONObject = null;
            com.google.firebase.crashlytics.a.c.g.j(r1, "Error while closing settings cache file.");
            return jSONObject;
        }
        fileInputStream = new FileInputStream((File) obj);
        try {
            jSONObject = new JSONObject(com.google.firebase.crashlytics.a.c.g.i(fileInputStream));
            str = fileInputStream;
        } catch (Exception e3) {
            e = e3;
            i.a().e("Failed to fetch cached settings", e);
            jSONObject = null;
            str = fileInputStream;
            r1 = str;
            com.google.firebase.crashlytics.a.c.g.j(r1, "Error while closing settings cache file.");
            return jSONObject;
        }
        r1 = str;
        com.google.firebase.crashlytics.a.c.g.j(r1, "Error while closing settings cache file.");
        return jSONObject;
    }

    public final void c(long j2, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        i.a().g("Writing settings to cache file...");
        FileWriter fileWriter2 = null;
        try {
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter((File) this.f9694a);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(jSONObject.toString());
            fileWriter.flush();
            com.google.firebase.crashlytics.a.c.g.j(fileWriter, "Failed to close settings writer.");
        } catch (Exception e3) {
            e = e3;
            fileWriter2 = fileWriter;
            i.a().e("Failed to cache settings", e);
            com.google.firebase.crashlytics.a.c.g.j(fileWriter2, "Failed to close settings writer.");
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            com.google.firebase.crashlytics.a.c.g.j(fileWriter2, "Failed to close settings writer.");
            throw th;
        }
    }

    public f(t tVar) {
        x.f(tVar, "userMetadata");
        this.f9694a = tVar;
    }
}

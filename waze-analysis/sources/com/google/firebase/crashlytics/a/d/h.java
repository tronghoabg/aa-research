package com.google.firebase.crashlytics.a.d;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f9243a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9244b;

    public h(com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9244b = cVar;
    }

    private static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void l(File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.a.i.a().f("Deleted corrupt file: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    public final File a(String str) {
        return this.f9244b.f(str, "internal-keys");
    }

    public final File b(String str) {
        return this.f9244b.f(str, "keys");
    }

    public final File c(String str) {
        return this.f9244b.f(str, "rollouts-state");
    }

    public final File d(String str) {
        return this.f9244b.f(str, "user-data");
    }

    public final String e(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            com.google.firebase.crashlytics.a.i.a().b("No userId set for session ".concat(String.valueOf(str)));
            l(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strK = k(new JSONObject(com.google.firebase.crashlytics.a.c.g.i(fileInputStream)), "userId");
                    com.google.firebase.crashlytics.a.i.a().b("Loaded userId " + strK + " for session " + str);
                    com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close user metadata file.");
                    return strK;
                } catch (Exception e2) {
                    e = e2;
                    com.google.firebase.crashlytics.a.i.a().i("Error deserializing user metadata.", e);
                    l(fileD);
                    com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.a.c.g.j(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.a.c.g.j(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final List f(String str) throws Throwable {
        Exception exc;
        Throwable th;
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            l(fileC);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    try {
                        JSONArray jSONArray = new JSONObject(com.google.firebase.crashlytics.a.c.g.i(fileInputStream2)).getJSONArray("rolloutsState");
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String string = jSONArray.getString(i2);
                            try {
                                com.google.firebase.d.a aVar = q.f9267a;
                                JSONObject jSONObject = new JSONObject(string);
                                arrayList.add(q.f(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
                            } catch (Exception e2) {
                                com.google.firebase.crashlytics.a.i.a().i("Failed de-serializing rollouts state. ".concat(String.valueOf(string)), e2);
                            }
                        }
                        com.google.firebase.crashlytics.a.i.a().b("Loaded rollouts state:\n" + arrayList.toString() + "\nfor session " + str);
                        com.google.firebase.crashlytics.a.c.g.j(fileInputStream2, "Failed to close rollouts state file.");
                        return arrayList;
                    } catch (Exception e3) {
                        exc = e3;
                        fileInputStream = fileInputStream2;
                        com.google.firebase.crashlytics.a.i.a().i("Error deserializing rollouts state.", exc);
                        l(fileC);
                        com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close rollouts state file.");
                        return Collections.EMPTY_LIST;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            exc = e4;
        }
    }

    final Map g(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e2;
        File fileA = z ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            l(fileA);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileA);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(com.google.firebase.crashlytics.a.c.g.i(fileInputStream));
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, k(jSONObject, next));
                    }
                    com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close user metadata file.");
                    return map;
                } catch (Exception e3) {
                    e2 = e3;
                    com.google.firebase.crashlytics.a.i.a().i("Error deserializing user metadata.", e2);
                    l(fileA);
                    com.google.firebase.crashlytics.a.c.g.j(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.a.c.g.j(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            fileInputStream = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.a.c.g.j(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, Map map, boolean z) throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e2;
        File fileA = z != 0 ? a(str) : b(str);
        Closeable closeable = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f9243a));
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e3) {
                    e2 = e3;
                    com.google.firebase.crashlytics.a.i.a().i("Error serializing key/value metadata.", e2);
                    l(fileA);
                    com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th) {
                th = th;
                closeable = z;
                com.google.firebase.crashlytics.a.c.g.j(closeable, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.a.c.g.j(closeable, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e2;
        File fileC = c(str);
        if (list.isEmpty()) {
            l(fileC);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                try {
                    jSONArray.put(new JSONObject(q.f9267a.a(list.get(i2))));
                } catch (JSONException e3) {
                    com.google.firebase.crashlytics.a.i.a().i("Exception parsing rollout assignment!", e3);
                }
            }
            map.put("rolloutsState", jSONArray);
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f9243a));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e4) {
                    e2 = e4;
                    com.google.firebase.crashlytics.a.i.a().i("Error serializing rollouts state.", e2);
                    l(fileC);
                    com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e5) {
            bufferedWriter = null;
            e2 = e5;
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void j(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileD = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new g(str2).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f9243a));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.a.i.a().i("Error serializing user metadata.", e);
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.a.c.g.j(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}

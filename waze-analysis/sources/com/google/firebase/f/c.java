package com.google.firebase.f;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.firebase.components.ae;
import com.google.firebase.components.q;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements g, h {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g.c f9892a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9893b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.g.c f9894c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f9895d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9896e;

    private c(final Context context, final String str, Set set, com.google.firebase.g.c cVar, Executor executor) {
        this.f9892a = new com.google.firebase.g.c() { // from class: com.google.firebase.f.a
            @Override // com.google.firebase.g.c
            public final Object a() {
                return new i(context, str);
            }
        };
        this.f9895d = set;
        this.f9896e = executor;
        this.f9894c = cVar;
        this.f9893b = context;
    }

    static /* synthetic */ c b(ae aeVar, com.google.firebase.components.d dVar) {
        return new c((Context) dVar.f(Context.class), ((com.google.firebase.e) dVar.f(com.google.firebase.e.class)).h(), q.e(dVar, d.class), dVar.c(com.google.firebase.h.h.class), (Executor) dVar.e(aeVar));
    }

    public static /* synthetic */ String c(c cVar) {
        String string;
        synchronized (cVar) {
            i iVar = (i) cVar.f9892a.a();
            List listA = iVar.a();
            iVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < listA.size(); i2++) {
                j jVar = (j) listA.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", jVar.a());
                jSONObject.put("dates", new JSONArray((Collection) jVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    public static /* synthetic */ void d(c cVar) {
        synchronized (cVar) {
            ((i) cVar.f9892a.a()).d(System.currentTimeMillis(), ((com.google.firebase.h.h) cVar.f9894c.a()).b());
        }
    }

    @Override // com.google.firebase.f.g
    public final t a() {
        return !UserManagerCompat.isUserUnlocked(this.f9893b) ? ag.c("") : ag.a(this.f9896e, new com.google.firebase.appcheck.playintegrity.a.c(this, 3));
    }

    @Override // com.google.firebase.f.h
    public final synchronized int e() {
        com.google.firebase.g.c cVar = this.f9892a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        i iVar = (i) cVar.a();
        if (!iVar.g(jCurrentTimeMillis)) {
            return 1;
        }
        iVar.c();
        return 3;
    }

    public final void f() {
        if (this.f9895d.size() <= 0) {
            ag.c(null);
        } else if (UserManagerCompat.isUserUnlocked(this.f9893b)) {
            ag.a(this.f9896e, new com.google.firebase.appcheck.playintegrity.a.c(this, 4));
        } else {
            ag.c(null);
        }
    }
}
